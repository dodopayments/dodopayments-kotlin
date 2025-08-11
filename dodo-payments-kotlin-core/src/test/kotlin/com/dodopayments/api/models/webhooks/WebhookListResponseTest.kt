// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookListResponseTest {

    @Test
    fun create() {
        val webhookListResponse =
            WebhookListResponse.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        assertThat(webhookListResponse.id()).isEqualTo("id")
        assertThat(webhookListResponse.createdAt()).isEqualTo("created_at")
        assertThat(webhookListResponse.description()).isEqualTo("description")
        assertThat(webhookListResponse.metadata())
            .isEqualTo(
                WebhookListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(webhookListResponse.updatedAt()).isEqualTo("updated_at")
        assertThat(webhookListResponse.url()).isEqualTo("url")
        assertThat(webhookListResponse.disabled()).isEqualTo(true)
        assertThat(webhookListResponse.filterTypes()).containsExactly("string")
        assertThat(webhookListResponse.rateLimit()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookListResponse =
            WebhookListResponse.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        val roundtrippedWebhookListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookListResponse),
                jacksonTypeRef<WebhookListResponse>(),
            )

        assertThat(roundtrippedWebhookListResponse).isEqualTo(webhookListResponse)
    }
}
