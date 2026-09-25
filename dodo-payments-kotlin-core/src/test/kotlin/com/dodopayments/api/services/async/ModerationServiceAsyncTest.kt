// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.moderation.ModerationScreenParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModerationServiceAsyncTest {

    @Test
    suspend fun retrieveUsage() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val moderationServiceAsync = client.moderation()

        val response = moderationServiceAsync.retrieveUsage()

        response.validate()
    }

    @Test
    suspend fun screen() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val moderationServiceAsync = client.moderation()

        val response =
            moderationServiceAsync.screen(
                ModerationScreenParams.builder()
                    .image("image")
                    .requestId("request_id")
                    .text("text")
                    .build()
            )

        response.validate()
    }
}
