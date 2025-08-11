// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookRetrieveResponseTest {

    @Test
    fun create() {
        val webhookRetrieveResponse =
            WebhookRetrieveResponse.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        assertThat(webhookRetrieveResponse.id()).isEqualTo("id")
        assertThat(webhookRetrieveResponse.createdAt()).isEqualTo("created_at")
        assertThat(webhookRetrieveResponse.description()).isEqualTo("description")
        assertThat(webhookRetrieveResponse.metadata())
            .isEqualTo(
                WebhookRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(webhookRetrieveResponse.updatedAt()).isEqualTo("updated_at")
        assertThat(webhookRetrieveResponse.url()).isEqualTo("url")
        assertThat(webhookRetrieveResponse.disabled()).isEqualTo(true)
        assertThat(webhookRetrieveResponse.filterTypes()).containsExactly("string")
        assertThat(webhookRetrieveResponse.rateLimit()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookRetrieveResponse =
            WebhookRetrieveResponse.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        val roundtrippedWebhookRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookRetrieveResponse),
                jacksonTypeRef<WebhookRetrieveResponse>(),
            )

        assertThat(roundtrippedWebhookRetrieveResponse).isEqualTo(webhookRetrieveResponse)
    }
}
