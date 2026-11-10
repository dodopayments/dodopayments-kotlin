// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceEventTest {

    @Test
    fun create() {
        val invoiceEvent =
            InvoiceEvent.builder()
                .actor("actor")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventId("event_id")
                .eventType("event_type")
                .payload(JsonValue.from(mapOf<String, Any>()))
                .rowVersion(0L)
                .actorEmail("actor_email")
                .build()

        assertThat(invoiceEvent.actor()).isEqualTo("actor")
        assertThat(invoiceEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceEvent.eventId()).isEqualTo("event_id")
        assertThat(invoiceEvent.eventType()).isEqualTo("event_type")
        assertThat(invoiceEvent._payload()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(invoiceEvent.rowVersion()).isEqualTo(0L)
        assertThat(invoiceEvent.actorEmail()).isEqualTo("actor_email")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceEvent =
            InvoiceEvent.builder()
                .actor("actor")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventId("event_id")
                .eventType("event_type")
                .payload(JsonValue.from(mapOf<String, Any>()))
                .rowVersion(0L)
                .actorEmail("actor_email")
                .build()

        val roundtrippedInvoiceEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceEvent),
                jacksonTypeRef<InvoiceEvent>(),
            )

        assertThat(roundtrippedInvoiceEvent).isEqualTo(invoiceEvent)
    }
}
