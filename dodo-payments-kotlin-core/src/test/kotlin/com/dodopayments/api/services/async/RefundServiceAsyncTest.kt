// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.refunds.RefundCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RefundServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val refundServiceAsync = client.refunds()

        val refund =
            refundServiceAsync.create(
                RefundCreateParams.builder().paymentId("payment_id").reason("reason").build()
            )

        refund.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val refundServiceAsync = client.refunds()

        val refund = refundServiceAsync.retrieve("refund_id")

        refund.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val refundServiceAsync = client.refunds()

        val page = refundServiceAsync.list()

        page.response().validate()
    }
}
