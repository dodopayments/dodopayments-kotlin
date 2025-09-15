// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterAggregationTest {

    @Test
    fun create() {
        val meterAggregation =
            MeterAggregation.builder().type(MeterAggregation.Type.COUNT).key("key").build()

        assertThat(meterAggregation.type()).isEqualTo(MeterAggregation.Type.COUNT)
        assertThat(meterAggregation.key()).isEqualTo("key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meterAggregation =
            MeterAggregation.builder().type(MeterAggregation.Type.COUNT).key("key").build()

        val roundtrippedMeterAggregation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meterAggregation),
                jacksonTypeRef<MeterAggregation>(),
            )

        assertThat(roundtrippedMeterAggregation).isEqualTo(meterAggregation)
    }
}
