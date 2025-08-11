// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookListPageResponseTest {

    @Test
    fun create() {
        val webhookListPageResponse =
            WebhookListPageResponse.builder()
                .addData(
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
                )
                .done(true)
                .iterator("iterator")
                .prevIterator("prev_iterator")
                .build()

        assertThat(webhookListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(webhookListPageResponse.done()).isEqualTo(true)
        assertThat(webhookListPageResponse.iterator()).isEqualTo("iterator")
        assertThat(webhookListPageResponse.prevIterator()).isEqualTo("prev_iterator")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookListPageResponse =
            WebhookListPageResponse.builder()
                .addData(
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
                )
                .done(true)
                .iterator("iterator")
                .prevIterator("prev_iterator")
                .build()

        val roundtrippedWebhookListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookListPageResponse),
                jacksonTypeRef<WebhookListPageResponse>(),
            )

        assertThat(roundtrippedWebhookListPageResponse).isEqualTo(webhookListPageResponse)
    }
}
