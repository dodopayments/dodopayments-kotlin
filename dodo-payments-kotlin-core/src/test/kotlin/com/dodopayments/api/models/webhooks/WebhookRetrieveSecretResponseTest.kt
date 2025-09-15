// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookRetrieveSecretResponseTest {

    @Test
    fun create() {
        val webhookRetrieveSecretResponse =
            WebhookRetrieveSecretResponse.builder().secret("secret").build()

        assertThat(webhookRetrieveSecretResponse.secret()).isEqualTo("secret")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookRetrieveSecretResponse =
            WebhookRetrieveSecretResponse.builder().secret("secret").build()

        val roundtrippedWebhookRetrieveSecretResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookRetrieveSecretResponse),
                jacksonTypeRef<WebhookRetrieveSecretResponse>(),
            )

        assertThat(roundtrippedWebhookRetrieveSecretResponse)
            .isEqualTo(webhookRetrieveSecretResponse)
    }
}
