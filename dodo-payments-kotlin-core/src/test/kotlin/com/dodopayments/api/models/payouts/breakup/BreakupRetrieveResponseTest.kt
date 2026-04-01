// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BreakupRetrieveResponseTest {

    @Test
    fun create() {
        val breakupRetrieveResponse =
            BreakupRetrieveResponse.builder().eventType("event_type").total(0L).build()

        assertThat(breakupRetrieveResponse.eventType()).isEqualTo("event_type")
        assertThat(breakupRetrieveResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val breakupRetrieveResponse =
            BreakupRetrieveResponse.builder().eventType("event_type").total(0L).build()

        val roundtrippedBreakupRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(breakupRetrieveResponse),
                jacksonTypeRef<BreakupRetrieveResponse>(),
            )

        assertThat(roundtrippedBreakupRetrieveResponse).isEqualTo(breakupRetrieveResponse)
    }
}
