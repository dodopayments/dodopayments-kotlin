// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.moderation.ModerationScreenParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModerationServiceTest {

    @Test
    fun retrieveUsage() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val moderationService = client.moderation()

        val response = moderationService.retrieveUsage()

        response.validate()
    }

    @Test
    fun screen() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val moderationService = client.moderation()

        val response =
            moderationService.screen(
                ModerationScreenParams.builder()
                    .image("image")
                    .requestId("request_id")
                    .text("text")
                    .build()
            )

        response.validate()
    }
}
