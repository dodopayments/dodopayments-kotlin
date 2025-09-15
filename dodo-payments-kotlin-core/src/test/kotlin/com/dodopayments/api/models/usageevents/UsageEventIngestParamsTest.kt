// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import com.dodopayments.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageEventIngestParamsTest {

    @Test
    fun create() {
        UsageEventIngestParams.builder()
            .addEvent(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            UsageEventIngestParams.builder()
                .addEvent(
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
                )
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageEventIngestParams.builder()
                .addEvent(
                    EventInput.builder()
                        .customerId("customer_id")
                        .eventId("event_id")
                        .eventName("event_name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                EventInput.builder()
                    .customerId("customer_id")
                    .eventId("event_id")
                    .eventName("event_name")
                    .build()
            )
    }
}
