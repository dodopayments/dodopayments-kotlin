// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.payouts.breakup

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DetailServiceTest {

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val detailService = client.payouts().breakup().details()

        val page = detailService.list("payout_id")

        page.response().validate()
    }

    @Test
    fun downloadCsv() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val detailService = client.payouts().breakup().details()

        detailService.downloadCsv("payout_id")
    }
}
