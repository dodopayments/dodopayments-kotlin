// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageEventListPageResponseTest {

    @Test
    fun create() {
        val usageEventListPageResponse =
            UsageEventListPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(usageEventListPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageEventListPageResponse =
            UsageEventListPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedUsageEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageEventListPageResponse),
                jacksonTypeRef<UsageEventListPageResponse>(),
            )

        assertThat(roundtrippedUsageEventListPageResponse).isEqualTo(usageEventListPageResponse)
    }
}
