// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEventListPageResponseTest {

    @Test
    fun create() {
        val webhookEventListPageResponse =
            WebhookEventListPageResponse.builder()
                .addItem(
                    WebhookEvent.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventId("event_id")
                        .eventType("event_type")
                        .objectId("object_id")
                        .latestAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .request("request")
                        .response("response")
                        .build()
                )
                .build()

        assertThat(webhookEventListPageResponse.items())
            .containsExactly(
                WebhookEvent.builder()
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventId("event_id")
                    .eventType("event_type")
                    .objectId("object_id")
                    .latestAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .request("request")
                    .response("response")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookEventListPageResponse =
            WebhookEventListPageResponse.builder()
                .addItem(
                    WebhookEvent.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventId("event_id")
                        .eventType("event_type")
                        .objectId("object_id")
                        .latestAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .request("request")
                        .response("response")
                        .build()
                )
                .build()

        val roundtrippedWebhookEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookEventListPageResponse),
                jacksonTypeRef<WebhookEventListPageResponse>(),
            )

        assertThat(roundtrippedWebhookEventListPageResponse).isEqualTo(webhookEventListPageResponse)
    }
}
