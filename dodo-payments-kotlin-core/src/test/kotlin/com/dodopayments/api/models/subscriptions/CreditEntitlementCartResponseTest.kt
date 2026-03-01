// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementCartResponseTest {

    @Test
    fun create() {
        val creditEntitlementCartResponse =
            CreditEntitlementCartResponse.builder()
                .creditEntitlementId("credit_entitlement_id")
                .creditEntitlementName("credit_entitlement_name")
                .creditsAmount("credits_amount")
                .overageBalance("overage_balance")
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .productId("product_id")
                .remainingBalance("remaining_balance")
                .rolloverEnabled(true)
                .unit("unit")
                .expiresAfterDays(0)
                .lowBalanceThresholdPercent(0)
                .maxRolloverCount(0)
                .overageLimit("overage_limit")
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .build()

        assertThat(creditEntitlementCartResponse.creditEntitlementId())
            .isEqualTo("credit_entitlement_id")
        assertThat(creditEntitlementCartResponse.creditEntitlementName())
            .isEqualTo("credit_entitlement_name")
        assertThat(creditEntitlementCartResponse.creditsAmount()).isEqualTo("credits_amount")
        assertThat(creditEntitlementCartResponse.overageBalance()).isEqualTo("overage_balance")
        assertThat(creditEntitlementCartResponse.overageBehavior())
            .isEqualTo(CbbOverageBehavior.FORGIVE_AT_RESET)
        assertThat(creditEntitlementCartResponse.overageEnabled()).isEqualTo(true)
        assertThat(creditEntitlementCartResponse.productId()).isEqualTo("product_id")
        assertThat(creditEntitlementCartResponse.remainingBalance()).isEqualTo("remaining_balance")
        assertThat(creditEntitlementCartResponse.rolloverEnabled()).isEqualTo(true)
        assertThat(creditEntitlementCartResponse.unit()).isEqualTo("unit")
        assertThat(creditEntitlementCartResponse.expiresAfterDays()).isEqualTo(0)
        assertThat(creditEntitlementCartResponse.lowBalanceThresholdPercent()).isEqualTo(0)
        assertThat(creditEntitlementCartResponse.maxRolloverCount()).isEqualTo(0)
        assertThat(creditEntitlementCartResponse.overageLimit()).isEqualTo("overage_limit")
        assertThat(creditEntitlementCartResponse.rolloverPercentage()).isEqualTo(0)
        assertThat(creditEntitlementCartResponse.rolloverTimeframeCount()).isEqualTo(0)
        assertThat(creditEntitlementCartResponse.rolloverTimeframeInterval())
            .isEqualTo(TimeInterval.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditEntitlementCartResponse =
            CreditEntitlementCartResponse.builder()
                .creditEntitlementId("credit_entitlement_id")
                .creditEntitlementName("credit_entitlement_name")
                .creditsAmount("credits_amount")
                .overageBalance("overage_balance")
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .productId("product_id")
                .remainingBalance("remaining_balance")
                .rolloverEnabled(true)
                .unit("unit")
                .expiresAfterDays(0)
                .lowBalanceThresholdPercent(0)
                .maxRolloverCount(0)
                .overageLimit("overage_limit")
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .build()

        val roundtrippedCreditEntitlementCartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditEntitlementCartResponse),
                jacksonTypeRef<CreditEntitlementCartResponse>(),
            )

        assertThat(roundtrippedCreditEntitlementCartResponse)
            .isEqualTo(creditEntitlementCartResponse)
    }
}
