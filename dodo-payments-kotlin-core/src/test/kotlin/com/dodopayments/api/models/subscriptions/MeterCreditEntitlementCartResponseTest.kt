// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterCreditEntitlementCartResponseTest {

    @Test
    fun create() {
        val meterCreditEntitlementCartResponse =
            MeterCreditEntitlementCartResponse.builder()
                .creditEntitlementId("credit_entitlement_id")
                .meterId("meter_id")
                .meterName("meter_name")
                .meterUnitsPerCredit("meter_units_per_credit")
                .productId("product_id")
                .build()

        assertThat(meterCreditEntitlementCartResponse.creditEntitlementId())
            .isEqualTo("credit_entitlement_id")
        assertThat(meterCreditEntitlementCartResponse.meterId()).isEqualTo("meter_id")
        assertThat(meterCreditEntitlementCartResponse.meterName()).isEqualTo("meter_name")
        assertThat(meterCreditEntitlementCartResponse.meterUnitsPerCredit())
            .isEqualTo("meter_units_per_credit")
        assertThat(meterCreditEntitlementCartResponse.productId()).isEqualTo("product_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meterCreditEntitlementCartResponse =
            MeterCreditEntitlementCartResponse.builder()
                .creditEntitlementId("credit_entitlement_id")
                .meterId("meter_id")
                .meterName("meter_name")
                .meterUnitsPerCredit("meter_units_per_credit")
                .productId("product_id")
                .build()

        val roundtrippedMeterCreditEntitlementCartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meterCreditEntitlementCartResponse),
                jacksonTypeRef<MeterCreditEntitlementCartResponse>(),
            )

        assertThat(roundtrippedMeterCreditEntitlementCartResponse)
            .isEqualTo(meterCreditEntitlementCartResponse)
    }
}
