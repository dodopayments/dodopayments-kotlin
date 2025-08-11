// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.webhooks

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.webhooks.headers.HeaderUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HeaderServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val headerServiceAsync = client.webhooks().headers()

        val header = headerServiceAsync.retrieve("webhook_id")

        header.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val headerServiceAsync = client.webhooks().headers()

        headerServiceAsync.update(
            HeaderUpdateParams.builder()
                .webhookId("webhook_id")
                .headers(
                    HeaderUpdateParams.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        )
    }
}
