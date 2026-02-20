// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddMeterToPriceTest {

    @Test
    fun create() {
        val addMeterToPrice =
            AddMeterToPrice.builder()
                .meterId("meter_id")
                .pricePerUnit("10.50")
                .creditEntitlementId("credit_entitlement_id")
                .description("description")
                .freeThreshold(0L)
                .measurementUnit("measurement_unit")
                .meterUnitsPerCredit("meter_units_per_credit")
                .name("name")
                .build()

        assertThat(addMeterToPrice.meterId()).isEqualTo("meter_id")
        assertThat(addMeterToPrice.pricePerUnit()).isEqualTo("10.50")
        assertThat(addMeterToPrice.creditEntitlementId()).isEqualTo("credit_entitlement_id")
        assertThat(addMeterToPrice.description()).isEqualTo("description")
        assertThat(addMeterToPrice.freeThreshold()).isEqualTo(0L)
        assertThat(addMeterToPrice.measurementUnit()).isEqualTo("measurement_unit")
        assertThat(addMeterToPrice.meterUnitsPerCredit()).isEqualTo("meter_units_per_credit")
        assertThat(addMeterToPrice.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addMeterToPrice =
            AddMeterToPrice.builder()
                .meterId("meter_id")
                .pricePerUnit("10.50")
                .creditEntitlementId("credit_entitlement_id")
                .description("description")
                .freeThreshold(0L)
                .measurementUnit("measurement_unit")
                .meterUnitsPerCredit("meter_units_per_credit")
                .name("name")
                .build()

        val roundtrippedAddMeterToPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addMeterToPrice),
                jacksonTypeRef<AddMeterToPrice>(),
            )

        assertThat(roundtrippedAddMeterToPrice).isEqualTo(addMeterToPrice)
    }
}
