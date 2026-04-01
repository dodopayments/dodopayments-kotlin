// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.payouts.breakup

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DetailServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val detailServiceAsync = client.payouts().breakup().details()

        val page = detailServiceAsync.list("payout_id")

        page.response().validate()
    }

    @Test
    suspend fun downloadCsv() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val detailServiceAsync = client.payouts().breakup().details()

        detailServiceAsync.downloadCsv("payout_id")
    }
}
