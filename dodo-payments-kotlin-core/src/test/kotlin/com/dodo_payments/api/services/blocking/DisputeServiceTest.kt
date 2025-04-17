// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.disputes.DisputeRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DisputeServiceTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val disputeService = client.disputes()

        val dispute =
            disputeService.retrieve(DisputeRetrieveParams.builder().disputeId("dispute_id").build())

        dispute.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val disputeService = client.disputes()

        val page = disputeService.list()

        page.response().validate()
    }
}
