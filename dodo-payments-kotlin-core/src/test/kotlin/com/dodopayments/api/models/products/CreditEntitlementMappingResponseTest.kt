// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementMappingResponseTest {

    @Test
    fun create() {
        val creditEntitlementMappingResponse =
            CreditEntitlementMappingResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditEntitlementId("credit_entitlement_id")
                .creditEntitlementName("credit_entitlement_name")
                .creditEntitlementUnit("credit_entitlement_unit")
                .creditsAmount("credits_amount")
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .prorationBehavior(CbbProrationBehavior.PRORATE)
                .rolloverEnabled(true)
                .trialCreditsExpireAfterTrial(true)
                .currency(Currency.AED)
                .expiresAfterDays(0)
                .lowBalanceThresholdPercent(0)
                .maxRolloverCount(0)
                .overageLimit("overage_limit")
                .pricePerUnit("price_per_unit")
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .trialCredits("trial_credits")
                .build()

        assertThat(creditEntitlementMappingResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(creditEntitlementMappingResponse.creditEntitlementId())
            .isEqualTo("credit_entitlement_id")
        assertThat(creditEntitlementMappingResponse.creditEntitlementName())
            .isEqualTo("credit_entitlement_name")
        assertThat(creditEntitlementMappingResponse.creditEntitlementUnit())
            .isEqualTo("credit_entitlement_unit")
        assertThat(creditEntitlementMappingResponse.creditsAmount()).isEqualTo("credits_amount")
        assertThat(creditEntitlementMappingResponse.overageBehavior())
            .isEqualTo(CbbOverageBehavior.FORGIVE_AT_RESET)
        assertThat(creditEntitlementMappingResponse.overageEnabled()).isEqualTo(true)
        assertThat(creditEntitlementMappingResponse.prorationBehavior())
            .isEqualTo(CbbProrationBehavior.PRORATE)
        assertThat(creditEntitlementMappingResponse.rolloverEnabled()).isEqualTo(true)
        assertThat(creditEntitlementMappingResponse.trialCreditsExpireAfterTrial()).isEqualTo(true)
        assertThat(creditEntitlementMappingResponse.currency()).isEqualTo(Currency.AED)
        assertThat(creditEntitlementMappingResponse.expiresAfterDays()).isEqualTo(0)
        assertThat(creditEntitlementMappingResponse.lowBalanceThresholdPercent()).isEqualTo(0)
        assertThat(creditEntitlementMappingResponse.maxRolloverCount()).isEqualTo(0)
        assertThat(creditEntitlementMappingResponse.overageLimit()).isEqualTo("overage_limit")
        assertThat(creditEntitlementMappingResponse.pricePerUnit()).isEqualTo("price_per_unit")
        assertThat(creditEntitlementMappingResponse.rolloverPercentage()).isEqualTo(0)
        assertThat(creditEntitlementMappingResponse.rolloverTimeframeCount()).isEqualTo(0)
        assertThat(creditEntitlementMappingResponse.rolloverTimeframeInterval())
            .isEqualTo(TimeInterval.DAY)
        assertThat(creditEntitlementMappingResponse.trialCredits()).isEqualTo("trial_credits")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditEntitlementMappingResponse =
            CreditEntitlementMappingResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditEntitlementId("credit_entitlement_id")
                .creditEntitlementName("credit_entitlement_name")
                .creditEntitlementUnit("credit_entitlement_unit")
                .creditsAmount("credits_amount")
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .prorationBehavior(CbbProrationBehavior.PRORATE)
                .rolloverEnabled(true)
                .trialCreditsExpireAfterTrial(true)
                .currency(Currency.AED)
                .expiresAfterDays(0)
                .lowBalanceThresholdPercent(0)
                .maxRolloverCount(0)
                .overageLimit("overage_limit")
                .pricePerUnit("price_per_unit")
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .trialCredits("trial_credits")
                .build()

        val roundtrippedCreditEntitlementMappingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditEntitlementMappingResponse),
                jacksonTypeRef<CreditEntitlementMappingResponse>(),
            )

        assertThat(roundtrippedCreditEntitlementMappingResponse)
            .isEqualTo(creditEntitlementMappingResponse)
    }
}
