// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.payouts

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BreakupServiceTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val breakupService = client.payouts().breakup()

        val breakups = breakupService.retrieve("pyt_zFTrrn4sk3x3y2vjDBW3T")

        breakups.forEach { it.validate() }
    }
}
