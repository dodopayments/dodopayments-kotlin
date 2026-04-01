// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.payouts

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BreakupServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val breakupServiceAsync = client.payouts().breakup()

        val breakups = breakupServiceAsync.retrieve("payout_id")

        breakups.forEach { it.validate() }
    }
}
