// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.invoices

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.invoices.payments.PaymentRetrieveParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class PaymentServiceTest {

    @Test
    fun retrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
        val paymentService = client.invoices().payments()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val payment =
            paymentService.retrieve(PaymentRetrieveParams.builder().paymentId("payment_id").build())

        assertThat(payment.body()).hasContent("abc")
    }
}
