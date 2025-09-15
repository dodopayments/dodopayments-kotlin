// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventInputTest {

    @Test
    fun create() {
        val eventInput =
            EventInput.builder()
                .customerId("customer_id")
                .eventId("event_id")
                .eventName("event_name")
                .metadata(
                    EventInput.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(eventInput.customerId()).isEqualTo("customer_id")
        assertThat(eventInput.eventId()).isEqualTo("event_id")
        assertThat(eventInput.eventName()).isEqualTo("event_name")
        assertThat(eventInput.metadata())
            .isEqualTo(
                EventInput.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(eventInput.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventInput =
            EventInput.builder()
                .customerId("customer_id")
                .eventId("event_id")
                .eventName("event_name")
                .metadata(
                    EventInput.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEventInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventInput),
                jacksonTypeRef<EventInput>(),
            )

        assertThat(roundtrippedEventInput).isEqualTo(eventInput)
    }
}
