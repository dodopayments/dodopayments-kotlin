// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceListEventsResponseTest {

    @Test
    fun create() {
        val invoiceListEventsResponse =
            InvoiceListEventsResponse.builder()
                .addItem(
                    InvoiceEvent.builder()
                        .actor("actor")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventId("event_id")
                        .eventType("event_type")
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .rowVersion(0L)
                        .actorEmail("actor_email")
                        .build()
                )
                .build()

        assertThat(invoiceListEventsResponse.items())
            .containsExactly(
                InvoiceEvent.builder()
                    .actor("actor")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventId("event_id")
                    .eventType("event_type")
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .rowVersion(0L)
                    .actorEmail("actor_email")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceListEventsResponse =
            InvoiceListEventsResponse.builder()
                .addItem(
                    InvoiceEvent.builder()
                        .actor("actor")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventId("event_id")
                        .eventType("event_type")
                        .payload(JsonValue.from(mapOf<String, Any>()))
                        .rowVersion(0L)
                        .actorEmail("actor_email")
                        .build()
                )
                .build()

        val roundtrippedInvoiceListEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceListEventsResponse),
                jacksonTypeRef<InvoiceListEventsResponse>(),
            )

        assertThat(roundtrippedInvoiceListEventsResponse).isEqualTo(invoiceListEventsResponse)
    }
}
