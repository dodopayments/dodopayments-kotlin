// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateResponseTest {

    @Test
    fun create() {
        val webhookUpdateResponse =
            WebhookUpdateResponse.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        assertThat(webhookUpdateResponse.id()).isEqualTo("id")
        assertThat(webhookUpdateResponse.createdAt()).isEqualTo("created_at")
        assertThat(webhookUpdateResponse.description()).isEqualTo("description")
        assertThat(webhookUpdateResponse.metadata())
            .isEqualTo(
                WebhookUpdateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(webhookUpdateResponse.updatedAt()).isEqualTo("updated_at")
        assertThat(webhookUpdateResponse.url()).isEqualTo("url")
        assertThat(webhookUpdateResponse.disabled()).isEqualTo(true)
        assertThat(webhookUpdateResponse.filterTypes()).containsExactly("string")
        assertThat(webhookUpdateResponse.rateLimit()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookUpdateResponse =
            WebhookUpdateResponse.builder()
                .id("id")
                .createdAt("created_at")
                .description("description")
                .metadata(
                    WebhookUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .updatedAt("updated_at")
                .url("url")
                .disabled(true)
                .addFilterType("string")
                .rateLimit(0)
                .build()

        val roundtrippedWebhookUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookUpdateResponse),
                jacksonTypeRef<WebhookUpdateResponse>(),
            )

        assertThat(roundtrippedWebhookUpdateResponse).isEqualTo(webhookUpdateResponse)
    }
}
