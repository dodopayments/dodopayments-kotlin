// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.disputes.DisputeRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DisputeServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val disputeServiceAsync = client.disputes()

        val dispute =
            disputeServiceAsync.retrieve(
                DisputeRetrieveParams.builder().disputeId("dispute_id").build()
            )

        dispute.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val disputeServiceAsync = client.disputes()

        val page = disputeServiceAsync.list()

        page.response().validate()
    }
}
