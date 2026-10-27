// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.jsonMapper
import java.io.File
import java.io.IOException
import java.net.URI
import java.net.URLDecoder
import java.net.URLEncoder

/** The subject token providers that the SDK supplies. */
object SubjectTokenProviders {

    /** The default path of the projected service account token in Kubernetes. */
    const val DEFAULT_KUBERNETES_TOKEN_PATH = "/var/run/secrets/tokens/dodo-token"

    /** The environment variable that gives the default path for [file]. */
    const val TOKEN_FILE_ENV = "DODO_PAYMENTS_IDENTITY_TOKEN_FILE"

    /** The default environment variable for [gitlab]. */
    const val GITLAB_TOKEN_ENV = "DODO_PAYMENTS_ID_TOKEN"

    private const val GCP_IDENTITY_URL =
        "http://metadata.google.internal/computeMetadata/v1/instance/service-accounts/default/identity"

    /**
     * Requests an OIDC token from GitHub Actions. The job must have the `id-token: write`
     * permission.
     *
     * The audience defaults to the origin of the client base URL. The provider gets a new token for
     * each exchange.
     */
    fun githubActions(audience: String? = null): SubjectTokenProvider =
        SubjectTokenProvider { context ->
            val url = requireEnv("ACTIONS_ID_TOKEN_REQUEST_URL")
            val requestToken = requireEnv("ACTIONS_ID_TOKEN_REQUEST_TOKEN")
            val separator = if (url.contains('?')) "&" else "?"
            val body =
                get(
                    context,
                    url + separator + "audience=" + encode(audience ?: context.audience()),
                    "Authorization",
                    "bearer $requestToken",
                )
            val value =
                try {
                    jsonMapper().readTree(body).get("value")?.asText()
                } catch (e: IOException) {
                    null
                }
            if (value.isNullOrEmpty()) {
                throw WorkloadIdentityException("The GitHub Actions token response has no value.")
            }
            value
        }

    /** Reads the GitLab CI/CD ID token from the [envVar] environment variable. */
    fun gitlab(envVar: String = GITLAB_TOKEN_ENV): SubjectTokenProvider = SubjectTokenProvider {
        requireEnv(envVar)
    }

    /**
     * Reads the HCP Terraform workload identity token from `TFC_WORKLOAD_IDENTITY_TOKEN_DODO` or
     * `TFC_WORKLOAD_IDENTITY_TOKEN`.
     */
    fun terraformCloud(): SubjectTokenProvider = SubjectTokenProvider {
        env("TFC_WORKLOAD_IDENTITY_TOKEN_DODO")
            ?: env("TFC_WORKLOAD_IDENTITY_TOKEN")
            ?: throw WorkloadIdentityException(
                "Set TFC_WORKLOAD_IDENTITY_TOKEN_DODO or TFC_WORKLOAD_IDENTITY_TOKEN."
            )
    }

    /**
     * Requests an identity token from the Google Cloud metadata server.
     *
     * The audience defaults to the origin of the client base URL.
     */
    fun gcp(audience: String? = null): SubjectTokenProvider = SubjectTokenProvider { context ->
        get(
                context,
                GCP_IDENTITY_URL +
                    "?audience=" +
                    encode(audience ?: context.audience()) +
                    "&format=full",
                "Metadata-Flavor",
                "Google",
            )
            .trim()
    }

    /** Reads the Vercel OIDC token from the `VERCEL_OIDC_TOKEN` environment variable. */
    fun vercel(): SubjectTokenProvider = SubjectTokenProvider { requireEnv("VERCEL_OIDC_TOKEN") }

    /** Reads a projected Kubernetes service account token from [path] for each exchange. */
    fun kubernetes(path: String = DEFAULT_KUBERNETES_TOKEN_PATH): SubjectTokenProvider =
        SubjectTokenProvider {
            readToken(path)
        }

    /**
     * Reads the token from a file for each exchange.
     *
     * The path defaults to the value of the [TOKEN_FILE_ENV] environment variable.
     */
    fun file(path: String? = null): SubjectTokenProvider = SubjectTokenProvider {
        readToken(path ?: requireEnv(TOKEN_FILE_ENV))
    }

    /**
     * Uses a function that returns the JWT, for example a function that calls AWS STS
     * `GetWebIdentityToken`.
     */
    fun aws(fn: () -> String): SubjectTokenProvider = SubjectTokenProvider { fn() }

    /** Always returns [token]. Use it for tests. */
    fun static(token: String): SubjectTokenProvider = SubjectTokenProvider { token }

    /**
     * Finds a provider from the environment, in this order: GitHub Actions, HCP Terraform, the
     * [TOKEN_FILE_ENV] file, and the default Kubernetes token path.
     *
     * Returns null if it finds no provider.
     */
    fun auto(): SubjectTokenProvider? =
        when {
            env("ACTIONS_ID_TOKEN_REQUEST_URL") != null &&
                env("ACTIONS_ID_TOKEN_REQUEST_TOKEN") != null -> githubActions()
            env("TFC_WORKLOAD_IDENTITY_TOKEN_DODO") != null ||
                env("TFC_WORKLOAD_IDENTITY_TOKEN") != null -> terraformCloud()
            env(TOKEN_FILE_ENV) != null -> file()
            File(DEFAULT_KUBERNETES_TOKEN_PATH).isFile -> kubernetes()
            else -> null
        }

    private fun env(name: String): String? = System.getenv(name)?.takeIf { it.isNotEmpty() }

    private fun requireEnv(name: String): String =
        env(name) ?: throw WorkloadIdentityException("The $name environment variable is not set.")

    private fun encode(value: String): String = URLEncoder.encode(value, "UTF-8")

    private fun decode(value: String): String = URLDecoder.decode(value, "UTF-8")

    private fun readToken(path: String): String {
        val token =
            try {
                File(path).readText().trim()
            } catch (e: IOException) {
                throw WorkloadIdentityException("Cannot read the token file $path.", e)
            }
        if (token.isEmpty()) {
            throw WorkloadIdentityException("The token file $path is empty.")
        }
        return token
    }

    private fun get(
        context: SubjectTokenContext,
        url: String,
        headerName: String,
        headerValue: String,
    ): String {
        val uri = URI(url)
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .baseUrl(uri.scheme + "://" + uri.rawAuthority + (uri.rawPath ?: ""))
                .putHeader(headerName, headerValue)
                .apply {
                    uri.rawQuery
                        ?.split('&')
                        ?.filter { it.isNotEmpty() }
                        ?.forEach { pair ->
                            val index = pair.indexOf('=')
                            if (index < 0) {
                                putQueryParam(decode(pair), "")
                            } else {
                                putQueryParam(
                                    decode(pair.substring(0, index)),
                                    decode(pair.substring(index + 1)),
                                )
                            }
                        }
                }
                .build()
        context.httpClient.execute(request, RequestOptions.none()).use { response ->
            if (response.statusCode() !in 200..299) {
                throw WorkloadIdentityException(
                    "The subject token request failed with status " + response.statusCode() + "."
                )
            }
            return response.body().readBytes().toString(Charsets.UTF_8)
        }
    }
}
