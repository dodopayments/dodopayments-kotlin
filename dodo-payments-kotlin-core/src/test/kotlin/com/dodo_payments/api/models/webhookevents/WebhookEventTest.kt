// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.webhookevents

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WebhookEventTest {

    @Test
    fun createWebhookEvent() {
        val webhookEvent =
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
        assertThat(webhookEvent).isNotNull
        assertThat(webhookEvent.businessId()).isEqualTo("business_id")
        assertThat(webhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookEvent.eventId()).isEqualTo("event_id")
        assertThat(webhookEvent.eventType()).isEqualTo("event_type")
        assertThat(webhookEvent.objectId()).isEqualTo("object_id")
        assertThat(webhookEvent.latestAttemptedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookEvent.request()).isEqualTo("request")
        assertThat(webhookEvent.response()).isEqualTo("response")
    }
}
