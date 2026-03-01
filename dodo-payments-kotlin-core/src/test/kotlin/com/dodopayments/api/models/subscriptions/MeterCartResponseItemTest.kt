// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterCartResponseItemTest {

    @Test
    fun create() {
        val meterCartResponseItem =
            MeterCartResponseItem.builder()
                .currency(Currency.AED)
                .freeThreshold(0L)
                .measurementUnit("measurement_unit")
                .meterId("meter_id")
                .name("name")
                .description("description")
                .pricePerUnit("10.50")
                .build()

        assertThat(meterCartResponseItem.currency()).isEqualTo(Currency.AED)
        assertThat(meterCartResponseItem.freeThreshold()).isEqualTo(0L)
        assertThat(meterCartResponseItem.measurementUnit()).isEqualTo("measurement_unit")
        assertThat(meterCartResponseItem.meterId()).isEqualTo("meter_id")
        assertThat(meterCartResponseItem.name()).isEqualTo("name")
        assertThat(meterCartResponseItem.description()).isEqualTo("description")
        assertThat(meterCartResponseItem.pricePerUnit()).isEqualTo("10.50")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meterCartResponseItem =
            MeterCartResponseItem.builder()
                .currency(Currency.AED)
                .freeThreshold(0L)
                .measurementUnit("measurement_unit")
                .meterId("meter_id")
                .name("name")
                .description("description")
                .pricePerUnit("10.50")
                .build()

        val roundtrippedMeterCartResponseItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meterCartResponseItem),
                jacksonTypeRef<MeterCartResponseItem>(),
            )

        assertThat(roundtrippedMeterCartResponseItem).isEqualTo(meterCartResponseItem)
    }
}
