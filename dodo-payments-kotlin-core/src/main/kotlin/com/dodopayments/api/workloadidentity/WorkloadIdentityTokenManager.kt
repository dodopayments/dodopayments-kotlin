// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.Sleeper
import com.dodopayments.api.core.handlers.errorBodyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.http.HttpClient
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.RetryingHttpClient
import com.dodopayments.api.core.http.json
import com.dodopayments.api.errors.DodoPaymentsException
import com.fasterxml.jackson.databind.json.JsonMapper
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.OffsetDateTime
import java.time.format.DateTimeParseException
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.future.await
import kotlinx.coroutines.withContext

/**
 * The workload identity token cache of a client.
 *
 * The client exchanges a subject token for an access token and keeps the access token. It gets a
 * new access token when 5 minutes or less remain. Concurrent requests share one exchange.
 */
class WorkloadIdentityTokenManager
internal constructor(
    private val workloadIdentity: WorkloadIdentity,
    private val baseUrl: String,
    private val httpClient: HttpClient,
    private val jsonMapper: JsonMapper,
    private val clock: Clock,
    sleeper: Sleeper,
    maxRetries: Int,
) {

    // The exchange does not use the logging client, so that the logs never contain a token.
    private val exchangeClient: HttpClient =
        RetryingHttpClient.builder()
            .httpClient(FinalOnClientErrorHttpClient(httpClient))
            .sleeper(sleeper)
            .clock(clock)
            .maxRetries(maxRetries)
            .build()
    private val context = SubjectTokenContext(baseUrl, httpClient)
    private val lock = Any()
    @Volatile private var cached: AccessToken? = null
    private var inFlight: CompletableFuture<AccessToken>? = null

    /**
     * Revokes the cached access token and clears the cache.
     *
     * It does nothing when no access token is in the cache.
     */
    fun revoke() {
        val token = takeCached() ?: return
        exchangeClient.execute(revokeRequest(token), RequestOptions.none()).use { checkStatus(it) }
    }

    /**
     * Revokes the cached access token and clears the cache.
     *
     * It does nothing when no access token is in the cache.
     */
    suspend fun revokeAsync() {
        val token = takeCached() ?: return
        exchangeClient.executeAsync(revokeRequest(token), RequestOptions.none()).use {
            checkStatus(it)
        }
    }

    internal fun canReuse(
        workloadIdentity: WorkloadIdentity,
        baseUrl: String,
        httpClient: HttpClient,
    ): Boolean =
        this.workloadIdentity === workloadIdentity &&
            this.baseUrl == baseUrl &&
            this.httpClient === httpClient

    internal fun accessToken(): String {
        val (future, owner) = claim()
        if (owner) {
            try {
                complete(
                    future,
                    parse(exchangeClient.execute(exchangeRequest(), RequestOptions.none())),
                )
            } catch (e: Throwable) {
                fail(future, e)
            }
        }
        return try {
            future.join().value
        } catch (e: CompletionException) {
            throw e.cause ?: e
        }
    }

    internal suspend fun accessTokenAsync(): String {
        val (future, owner) = claim()
        if (owner) {
            try {
                val request = withContext(Dispatchers.IO) { exchangeRequest() }
                complete(future, parse(exchangeClient.executeAsync(request, RequestOptions.none())))
            } catch (e: Throwable) {
                fail(future, e)
            }
        }
        return try {
            future.await().value
        } catch (e: CompletionException) {
            throw e.cause ?: e
        }
    }

    /** Clears the cache if it still holds [accessToken]. */
    internal fun invalidate(accessToken: String) {
        synchronized(lock) {
            if (cached?.value == accessToken) {
                cached = null
            }
        }
    }

    private fun fresh(): AccessToken? =
        cached?.takeIf { Duration.between(clock.instant(), it.expiresAt) > REFRESH_WINDOW }

    /** Returns the future of the access token, and true if the caller must do the exchange. */
    private fun claim(): Pair<CompletableFuture<AccessToken>, Boolean> {
        synchronized(lock) {
            fresh()?.let {
                return CompletableFuture.completedFuture(it) to false
            }
            inFlight?.let {
                return it to false
            }
            val future = CompletableFuture<AccessToken>()
            inFlight = future
            return future to true
        }
    }

    private fun complete(future: CompletableFuture<AccessToken>, token: AccessToken) {
        synchronized(lock) {
            cached = token
            inFlight = null
        }
        future.complete(token)
    }

    private fun fail(future: CompletableFuture<AccessToken>, e: Throwable) {
        synchronized(lock) { inFlight = null }
        future.completeExceptionally(e)
    }

    private fun takeCached(): AccessToken? =
        synchronized(lock) {
            val token = cached
            cached = null
            token
        }

    private fun exchangeRequest(): HttpRequest {
        val subjectToken =
            try {
                workloadIdentity.provider.subjectToken(context)
            } catch (e: DodoPaymentsException) {
                throw e
            } catch (e: Exception) {
                throw WorkloadIdentityException("The subject token provider failed.", e)
            }
        val body = LinkedHashMap<String, String>()
        body["grant_type"] = GRANT_TYPE
        body["subject_token_type"] = SUBJECT_TOKEN_TYPE
        body["subject_token"] = subjectToken
        body["identity_provider_id"] = workloadIdentity.identityProviderId
        return HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(baseUrl)
            .addPathSegments(*TOKEN_PATH_SEGMENTS)
            .putHeader("Accept", "application/json")
            .body(json(jsonMapper, body))
            .build()
    }

    private fun revokeRequest(token: AccessToken): HttpRequest =
        HttpRequest.builder()
            .method(HttpMethod.POST)
            .baseUrl(baseUrl)
            .addPathSegments(*REVOKE_PATH_SEGMENTS)
            .putHeader("Authorization", "Bearer " + token.value)
            .build()

    private fun checkStatus(response: HttpResponse) {
        errorHandler(errorBodyHandler(jsonMapper)).handle(response)
    }

    private fun parse(response: HttpResponse): AccessToken =
        response.use {
            checkStatus(it)
            val body = jsonMapper.readTree(it.body())
            val value = body.get("access_token")?.asText()
            if (value.isNullOrEmpty()) {
                throw WorkloadIdentityException("The token response has no access_token.")
            }
            val expiresAt =
                body.get("expires_at")?.asText()?.let { expiresAt ->
                    try {
                        OffsetDateTime.parse(expiresAt).toInstant()
                    } catch (e: DateTimeParseException) {
                        null
                    }
                } ?: clock.instant().plusSeconds(body.get("expires_in")?.asLong() ?: 0L)
            AccessToken(value, expiresAt)
        }

    private class AccessToken(val value: String, val expiresAt: Instant) {

        override fun toString() = "AccessToken{expiresAt=$expiresAt}"
    }

    private companion object {

        val REFRESH_WINDOW: Duration = Duration.ofSeconds(300)

        const val GRANT_TYPE = "urn:ietf:params:oauth:grant-type:token-exchange"

        const val SUBJECT_TOKEN_TYPE = "urn:ietf:params:oauth:token-type:jwt"

        val TOKEN_PATH_SEGMENTS = arrayOf("workload-identity", "token")

        val REVOKE_PATH_SEGMENTS = arrayOf("workload-identity", "token", "revoke")
    }
}

/**
 * Sends each request with the cached access token. After a 401 response, it clears the cache, gets
 * a new access token, and sends the request again one time.
 */
internal class WorkloadIdentityHttpClient(
    private val httpClient: HttpClient,
    private val tokens: WorkloadIdentityTokenManager,
) : HttpClient {

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse {
        val accessToken = tokens.accessToken()
        val response = httpClient.execute(authorize(request, accessToken), requestOptions)
        if (!shouldRetry(request, response)) {
            return response
        }
        response.close()
        tokens.invalidate(accessToken)
        return httpClient.execute(authorize(request, tokens.accessToken()), requestOptions)
    }

    override suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): HttpResponse {
        val accessToken = tokens.accessTokenAsync()
        val response = httpClient.executeAsync(authorize(request, accessToken), requestOptions)
        if (!shouldRetry(request, response)) {
            return response
        }
        response.close()
        tokens.invalidate(accessToken)
        return httpClient.executeAsync(
            authorize(request, tokens.accessTokenAsync()),
            requestOptions,
        )
    }

    override fun close() = httpClient.close()

    private fun shouldRetry(request: HttpRequest, response: HttpResponse): Boolean =
        response.statusCode() == 401 && (request.body?.repeatable() ?: true)

    private fun authorize(request: HttpRequest, accessToken: String): HttpRequest =
        request.toBuilder().replaceHeaders("Authorization", "Bearer $accessToken").build()
}

/** Returns [httpClient], with workload identity authentication if [tokens] is not null. */
internal fun withWorkloadIdentity(
    httpClient: HttpClient,
    tokens: WorkloadIdentityTokenManager?,
): HttpClient = if (tokens == null) httpClient else WorkloadIdentityHttpClient(httpClient, tokens)

/**
 * Marks each 4xx response as final, so that the retrying client does not send the request again.
 */
private class FinalOnClientErrorHttpClient(private val httpClient: HttpClient) : HttpClient {

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse =
        markFinal(httpClient.execute(request, requestOptions))

    override suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): HttpResponse = markFinal(httpClient.executeAsync(request, requestOptions))

    // The client options own the HTTP client and close it.
    override fun close() {}

    private fun markFinal(response: HttpResponse): HttpResponse {
        if (response.statusCode() !in 400..499) {
            return response
        }
        val headers = response.headers().toBuilder().replace("X-Should-Retry", "false").build()
        return object : HttpResponse by response {
            override fun headers() = headers
        }
    }
}
