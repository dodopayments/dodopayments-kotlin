// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachCreditEntitlementTest {

    @Test
    fun create() {
        val attachCreditEntitlement =
            AttachCreditEntitlement.builder()
                .creditEntitlementId("credit_entitlement_id")
                .creditsAmount("credits_amount")
                .currency(Currency.AED)
                .expiresAfterDays(0)
                .lowBalanceThresholdPercent(0)
                .maxRolloverCount(0)
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .overageLimit("overage_limit")
                .pricePerUnit("price_per_unit")
                .prorationBehavior(CbbProrationBehavior.PRORATE)
                .rolloverEnabled(true)
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .trialCredits("trial_credits")
                .trialCreditsExpireAfterTrial(true)
                .build()

        assertThat(attachCreditEntitlement.creditEntitlementId()).isEqualTo("credit_entitlement_id")
        assertThat(attachCreditEntitlement.creditsAmount()).isEqualTo("credits_amount")
        assertThat(attachCreditEntitlement.currency()).isEqualTo(Currency.AED)
        assertThat(attachCreditEntitlement.expiresAfterDays()).isEqualTo(0)
        assertThat(attachCreditEntitlement.lowBalanceThresholdPercent()).isEqualTo(0)
        assertThat(attachCreditEntitlement.maxRolloverCount()).isEqualTo(0)
        assertThat(attachCreditEntitlement.overageBehavior())
            .isEqualTo(CbbOverageBehavior.FORGIVE_AT_RESET)
        assertThat(attachCreditEntitlement.overageEnabled()).isEqualTo(true)
        assertThat(attachCreditEntitlement.overageLimit()).isEqualTo("overage_limit")
        assertThat(attachCreditEntitlement.pricePerUnit()).isEqualTo("price_per_unit")
        assertThat(attachCreditEntitlement.prorationBehavior())
            .isEqualTo(CbbProrationBehavior.PRORATE)
        assertThat(attachCreditEntitlement.rolloverEnabled()).isEqualTo(true)
        assertThat(attachCreditEntitlement.rolloverPercentage()).isEqualTo(0)
        assertThat(attachCreditEntitlement.rolloverTimeframeCount()).isEqualTo(0)
        assertThat(attachCreditEntitlement.rolloverTimeframeInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(attachCreditEntitlement.trialCredits()).isEqualTo("trial_credits")
        assertThat(attachCreditEntitlement.trialCreditsExpireAfterTrial()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachCreditEntitlement =
            AttachCreditEntitlement.builder()
                .creditEntitlementId("credit_entitlement_id")
                .creditsAmount("credits_amount")
                .currency(Currency.AED)
                .expiresAfterDays(0)
                .lowBalanceThresholdPercent(0)
                .maxRolloverCount(0)
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .overageLimit("overage_limit")
                .pricePerUnit("price_per_unit")
                .prorationBehavior(CbbProrationBehavior.PRORATE)
                .rolloverEnabled(true)
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .trialCredits("trial_credits")
                .trialCreditsExpireAfterTrial(true)
                .build()

        val roundtrippedAttachCreditEntitlement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachCreditEntitlement),
                jacksonTypeRef<AttachCreditEntitlement>(),
            )

        assertThat(roundtrippedAttachCreditEntitlement).isEqualTo(attachCreditEntitlement)
    }
}
