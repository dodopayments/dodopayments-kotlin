// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.core.http.HttpClient
import java.net.URI

/**
 * Gives a subject token (a JWT) from your workload identity provider.
 *
 * The client calls the provider before each token exchange. [SubjectTokenProviders] has the
 * providers that the SDK supplies.
 */
fun interface SubjectTokenProvider {

    fun subjectToken(context: SubjectTokenContext): String
}

/** The data that a [SubjectTokenProvider] can use to get a subject token. */
class SubjectTokenContext
internal constructor(
    /** The base URL of the client. */
    val baseUrl: String,
    /** The HTTP client of the client. */
    val httpClient: HttpClient,
) {

    /**
     * The origin of [baseUrl], for example `https://live.dodopayments.com`. The providers use it as
     * the default audience.
     */
    fun audience(): String {
        val uri = URI(baseUrl)
        return uri.scheme + "://" + uri.rawAuthority
    }
}

/**
 * The workload identity configuration of a client.
 *
 * With this configuration, the client exchanges a subject token for a short-lived access token and
 * does not use an API key.
 */
class WorkloadIdentity
private constructor(
    /** The ID of the identity provider, for example `wip_...`. */
    val identityProviderId: String,
    /** The source of the subject token. */
    val provider: SubjectTokenProvider,
) {

    companion object {

        /** The environment variable that gives the default [identityProviderId]. */
        const val IDENTITY_PROVIDER_ID_ENV = "DODO_PAYMENTS_IDENTITY_PROVIDER_ID"

        internal const val API_KEY_ENV = "DODO_PAYMENTS_API_KEY"

        /**
         * Returns a mutable builder for constructing an instance of [WorkloadIdentity].
         *
         * The following fields are required:
         * ```kotlin
         * .provider()
         * ```
         */
        fun builder() = Builder()

        /**
         * Returns a configuration that uses [provider] and the identity provider ID from the
         * [IDENTITY_PROVIDER_ID_ENV] environment variable.
         */
        fun of(provider: SubjectTokenProvider): WorkloadIdentity =
            builder().provider(provider).build()

        /**
         * Returns a configuration from the environment when the API key environment variable is not
         * set, the [IDENTITY_PROVIDER_ID_ENV] environment variable is set, and
         * [SubjectTokenProviders.auto] finds a provider. Otherwise returns null.
         */
        internal fun detect(): WorkloadIdentity? {
            if (!System.getenv(API_KEY_ENV).isNullOrEmpty()) {
                return null
            }
            val identityProviderId =
                System.getenv(IDENTITY_PROVIDER_ID_ENV)?.takeIf { it.isNotEmpty() } ?: return null
            val provider = SubjectTokenProviders.auto() ?: return null
            return WorkloadIdentity(identityProviderId, provider)
        }
    }

    /** A builder for [WorkloadIdentity]. */
    class Builder internal constructor() {

        private var identityProviderId: String? = null
        private var provider: SubjectTokenProvider? = null

        /** Defaults to the value of the [IDENTITY_PROVIDER_ID_ENV] environment variable. */
        fun identityProviderId(identityProviderId: String?) = apply {
            this.identityProviderId = identityProviderId
        }

        fun provider(provider: SubjectTokenProvider) = apply { this.provider = provider }

        /**
         * Returns an immutable instance of [WorkloadIdentity].
         *
         * @throws IllegalStateException if the provider or the identity provider ID is not set.
         */
        fun build(): WorkloadIdentity {
            val provider = checkNotNull(provider) { "`provider` is required, but was not set" }
            val identityProviderId =
                checkNotNull(
                    identityProviderId?.takeIf { it.isNotEmpty() }
                        ?: System.getenv(IDENTITY_PROVIDER_ID_ENV)?.takeIf { it.isNotEmpty() }
                ) {
                    "`identityProviderId` is required. Set it or set the $IDENTITY_PROVIDER_ID_ENV environment variable."
                }
            return WorkloadIdentity(identityProviderId, provider)
        }
    }

    override fun toString() = "WorkloadIdentity{identityProviderId=$identityProviderId}"
}
