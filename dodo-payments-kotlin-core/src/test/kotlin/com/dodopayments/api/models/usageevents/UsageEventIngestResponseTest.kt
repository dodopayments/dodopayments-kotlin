// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageEventIngestResponseTest {

    @Test
    fun create() {
        val usageEventIngestResponse = UsageEventIngestResponse.builder().ingestedCount(0L).build()

        assertThat(usageEventIngestResponse.ingestedCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageEventIngestResponse = UsageEventIngestResponse.builder().ingestedCount(0L).build()

        val roundtrippedUsageEventIngestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageEventIngestResponse),
                jacksonTypeRef<UsageEventIngestResponse>(),
            )

        assertThat(roundtrippedUsageEventIngestResponse).isEqualTo(usageEventIngestResponse)
    }
}
