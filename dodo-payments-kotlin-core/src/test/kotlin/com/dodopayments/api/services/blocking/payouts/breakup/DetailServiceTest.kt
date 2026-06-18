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

        val page = detailService.list("pyt_zFTrrn4sk3x3y2vjDBW3T")

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

        detailService.downloadCsv("pyt_zFTrrn4sk3x3y2vjDBW3T")
    }
}
