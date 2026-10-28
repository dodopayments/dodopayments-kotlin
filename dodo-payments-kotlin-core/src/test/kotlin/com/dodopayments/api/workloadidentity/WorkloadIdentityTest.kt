// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.errors.PermissionDeniedException
import com.dodopayments.api.errors.UnauthorizedException
import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.containing
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.equalToJson
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class WorkloadIdentityTest {

    private lateinit var baseUrl: String

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        baseUrl = wmRuntimeInfo.httpBaseUrl
        stubFor(get(urlPathEqualTo(API_PATH)).willReturn(okJson("[\"US\"]")))
    }

    @Test
    fun exchangeThenApiCallSendsTheAccessToken() {
        stubExchange()

        client().misc().listSupportedCountries()

        verify(
            1,
            postRequestedFor(urlPathEqualTo(TOKEN_PATH))
                .withoutHeader("Authorization")
                .withHeader("Content-Type", containing("application/json"))
                .withRequestBody(
                    equalToJson(
                        """
                        {
                          "grant_type": "urn:ietf:params:oauth:grant-type:token-exchange",
                          "subject_token_type": "urn:ietf:params:oauth:token-type:jwt",
                          "subject_token": "$SUBJECT_TOKEN",
                          "identity_provider_id": "$IDENTITY_PROVIDER_ID"
                        }
                        """
                    )
                ),
        )
        verify(
            1,
            getRequestedFor(urlPathEqualTo(API_PATH))
                .withHeader("Authorization", equalTo("Bearer $ACCESS_TOKEN")),
        )
    }

    @Test
    fun concurrentCallsExchangeOnce() {
        stubExchange(delayMs = 500)
        val client = client()
        val executor = Executors.newFixedThreadPool(2)

        try {
            (1..2)
                .map { executor.submit(Callable { client.misc().listSupportedCountries() }) }
                .forEach { it.get(30, TimeUnit.SECONDS) }
        } finally {
            executor.shutdown()
        }

        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(2, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun concurrentAsyncCallsExchangeOnce() = runBlocking {
        stubExchange(delayMs = 500)
        val client = asyncClient()

        (1..2).map { async { client.misc().listSupportedCountries() } }.awaitAll()

        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(2, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun tokenWithFiveMinutesOrLessExchangesAgain() {
        stubExchange(expiresIn = 200)
        val client = client()

        client.misc().listSupportedCountries()
        client.misc().listSupportedCountries()

        verify(2, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
    }

    @Test
    fun tokenWithMoreThanFiveMinutesIsCached() {
        stubExchange(expiresIn = 3600)
        val client = client()

        client.misc().listSupportedCountries()
        client.misc().listSupportedCountries()

        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(2, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun apiUnauthorizedExchangesAgainAndRetriesOnce() {
        stubExchange()
        stubFor(
            get(urlPathEqualTo(API_PATH))
                .willReturn(
                    aResponse()
                        .withStatus(401)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"message\":\"Unauthorized\"}")
                )
        )

        assertThatThrownBy { client().misc().listSupportedCountries() }
            .isInstanceOf(UnauthorizedException::class.java)

        verify(2, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(2, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun bearerTokenAndWorkloadIdentityIsAnError() {
        assertThatThrownBy {
                DodoPaymentsOkHttpClient.builder()
                    .baseUrl(baseUrl)
                    .bearerToken("My Bearer Token")
                    .workloadIdentity(workloadIdentity())
                    .build()
            }
            .isInstanceOf(IllegalStateException::class.java)
            .hasMessageContaining("not both")
    }

    @Test
    fun exchangeInvalidGrantIsPermissionDenied() {
        stubFor(
            post(urlPathEqualTo(TOKEN_PATH))
                .willReturn(
                    aResponse()
                        .withStatus(403)
                        .withHeader("Content-Type", "application/json")
                        .withBody(
                            "{\"error\":\"invalid_grant\",\"error_description\":\"No mapping matches the subject token.\"}"
                        )
                )
        )

        assertThatThrownBy { client(maxRetries = 2).misc().listSupportedCountries() }
            .isInstanceOf(PermissionDeniedException::class.java)
            .hasMessageContaining("invalid_grant")
            .hasMessageContaining("No mapping matches the subject token.")

        verify(1, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
        verify(0, getRequestedFor(urlPathEqualTo(API_PATH)))
    }

    @Test
    fun revokeSendsTheTokenAndClearsTheCache() {
        stubExchange()
        stubFor(post(urlPathEqualTo(REVOKE_PATH)).willReturn(aResponse().withStatus(204)))
        val client = client()
        val tokens = client.workloadIdentity()
        assertThat(tokens).isNotNull()

        tokens?.revoke()
        verify(0, postRequestedFor(urlPathEqualTo(REVOKE_PATH)))

        client.misc().listSupportedCountries()
        tokens?.revoke()

        verify(
            1,
            postRequestedFor(urlPathEqualTo(REVOKE_PATH))
                .withHeader("Authorization", equalTo("Bearer $ACCESS_TOKEN")),
        )

        client.misc().listSupportedCountries()

        verify(2, postRequestedFor(urlPathEqualTo(TOKEN_PATH)))
    }

    private fun stubExchange(expiresIn: Long = 3600, delayMs: Int = 0) {
        stubFor(
            post(urlPathEqualTo(TOKEN_PATH))
                .willReturn(
                    okJson(
                            "{\"access_token\":\"$ACCESS_TOKEN\",\"issued_token_type\":\"urn:ietf:params:oauth:token-type:access_token\",\"token_type\":\"Bearer\",\"expires_in\":$expiresIn,\"scope\":\"payments:read\"}"
                        )
                        .withFixedDelay(delayMs)
                )
        )
    }

    private fun workloadIdentity(): WorkloadIdentity =
        WorkloadIdentity.builder()
            .identityProviderId(IDENTITY_PROVIDER_ID)
            .provider(SubjectTokenProviders.static(SUBJECT_TOKEN))
            .build()

    private fun client(maxRetries: Int = 0) =
        DodoPaymentsOkHttpClient.builder()
            .baseUrl(baseUrl)
            .maxRetries(maxRetries)
            .workloadIdentity(workloadIdentity())
            .build()

    private fun asyncClient() =
        DodoPaymentsOkHttpClientAsync.builder()
            .baseUrl(baseUrl)
            .maxRetries(0)
            .workloadIdentity(workloadIdentity())
            .build()

    private companion object {

        const val API_PATH = "/checkout/supported_countries"

        const val TOKEN_PATH = "/workload-identity/token"

        const val REVOKE_PATH = "/workload-identity/token/revoke"

        const val IDENTITY_PROVIDER_ID = "wip_test"

        const val SUBJECT_TOKEN = "subject-token-for-tests"

        const val ACCESS_TOKEN = "access-token-for-tests"
    }
}
