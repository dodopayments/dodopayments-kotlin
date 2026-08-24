// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateSubscriptionPlanReqTest {

    @Test
    fun create() {
        val updateSubscriptionPlanReq =
            UpdateSubscriptionPlanReq.builder()
                .productId("product_id")
                .prorationBillingMode(
                    UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY
                )
                .quantity(0)
                .adaptiveCurrencyFeesInclusive(true)
                .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                .cancelScheduledChangePlan(true)
                .collectViaPaymentLink(true)
                .discountCode("discount_code")
                .addDiscountCode("string")
                .effectiveAt(UpdateSubscriptionPlanReq.EffectiveAt.IMMEDIATELY)
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .onPaymentFailure(UpdateSubscriptionPlanReq.OnPaymentFailure.PREVENT_CHANGE)
                .build()

        assertThat(updateSubscriptionPlanReq.productId()).isEqualTo("product_id")
        assertThat(updateSubscriptionPlanReq.prorationBillingMode())
            .isEqualTo(UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY)
        assertThat(updateSubscriptionPlanReq.quantity()).isEqualTo(0)
        assertThat(updateSubscriptionPlanReq.adaptiveCurrencyFeesInclusive()).isEqualTo(true)
        assertThat(updateSubscriptionPlanReq.addons())
            .containsExactly(AttachAddon.builder().addonId("addon_id").quantity(0).build())
        assertThat(updateSubscriptionPlanReq.cancelScheduledChangePlan()).isEqualTo(true)
        assertThat(updateSubscriptionPlanReq.collectViaPaymentLink()).isEqualTo(true)
        assertThat(updateSubscriptionPlanReq.discountCode()).isEqualTo("discount_code")
        assertThat(updateSubscriptionPlanReq.discountCodes()).containsExactly("string")
        assertThat(updateSubscriptionPlanReq.effectiveAt())
            .isEqualTo(UpdateSubscriptionPlanReq.EffectiveAt.IMMEDIATELY)
        assertThat(updateSubscriptionPlanReq.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(updateSubscriptionPlanReq.onPaymentFailure())
            .isEqualTo(UpdateSubscriptionPlanReq.OnPaymentFailure.PREVENT_CHANGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateSubscriptionPlanReq =
            UpdateSubscriptionPlanReq.builder()
                .productId("product_id")
                .prorationBillingMode(
                    UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY
                )
                .quantity(0)
                .adaptiveCurrencyFeesInclusive(true)
                .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                .cancelScheduledChangePlan(true)
                .collectViaPaymentLink(true)
                .discountCode("discount_code")
                .addDiscountCode("string")
                .effectiveAt(UpdateSubscriptionPlanReq.EffectiveAt.IMMEDIATELY)
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .onPaymentFailure(UpdateSubscriptionPlanReq.OnPaymentFailure.PREVENT_CHANGE)
                .build()

        val roundtrippedUpdateSubscriptionPlanReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateSubscriptionPlanReq),
                jacksonTypeRef<UpdateSubscriptionPlanReq>(),
            )

        assertThat(roundtrippedUpdateSubscriptionPlanReq).isEqualTo(updateSubscriptionPlanReq)
    }
}
