// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateResponseTest {

    @Test
    fun create() {
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        assertThat(webhookCreateResponse.id()).isEqualTo("id")
        assertThat(webhookCreateResponse.createdAt()).isEqualTo("created_at")
        assertThat(webhookCreateResponse.description()).isEqualTo("description")
        assertThat(webhookCreateResponse.metadata())
            .isEqualTo(
                WebhookCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(webhookCreateResponse.updatedAt()).isEqualTo("updated_at")
        assertThat(webhookCreateResponse.url()).isEqualTo("url")
        assertThat(webhookCreateResponse.disabled()).isEqualTo(true)
        assertThat(webhookCreateResponse.filterTypes()).containsExactly("string")
        assertThat(webhookCreateResponse.rateLimit()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        val roundtrippedWebhookCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookCreateResponse),
                jacksonTypeRef<WebhookCreateResponse>(),
            )

        assertThat(roundtrippedWebhookCreateResponse).isEqualTo(webhookCreateResponse)
    }
}
