// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDetailsTest {

    @Test
    fun create() {
        val webhookDetails =
            WebhookDetails.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookDetails.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        assertThat(webhookDetails.id()).isEqualTo("id")
        assertThat(webhookDetails.createdAt()).isEqualTo("created_at")
        assertThat(webhookDetails.description()).isEqualTo("description")
        assertThat(webhookDetails.metadata())
            .isEqualTo(
                WebhookDetails.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(webhookDetails.updatedAt()).isEqualTo("updated_at")
        assertThat(webhookDetails.url()).isEqualTo("url")
        assertThat(webhookDetails.disabled()).isEqualTo(true)
        assertThat(webhookDetails.filterTypes()).containsExactly("string")
        assertThat(webhookDetails.rateLimit()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDetails =
            WebhookDetails.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookDetails.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        val roundtrippedWebhookDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDetails),
                jacksonTypeRef<WebhookDetails>(),
            )

        assertThat(roundtrippedWebhookDetails).isEqualTo(webhookDetails)
    }
}
