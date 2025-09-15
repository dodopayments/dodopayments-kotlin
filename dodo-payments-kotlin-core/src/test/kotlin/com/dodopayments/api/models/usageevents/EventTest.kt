// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventTest {

    @Test
    fun create() {
        val event =
            Event.builder()
                .businessId("business_id")
                .customerId("customer_id")
                .eventId("event_id")
                .eventName("event_name")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    Event.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(event.businessId()).isEqualTo("business_id")
        assertThat(event.customerId()).isEqualTo("customer_id")
        assertThat(event.eventId()).isEqualTo("event_id")
        assertThat(event.eventName()).isEqualTo("event_name")
        assertThat(event.timestamp()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(event.metadata())
            .isEqualTo(
                Event.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val event =
            Event.builder()
                .businessId("business_id")
                .customerId("customer_id")
                .eventId("event_id")
                .eventName("event_name")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    Event.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedEvent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(event), jacksonTypeRef<Event>())

        assertThat(roundtrippedEvent).isEqualTo(event)
    }
}
