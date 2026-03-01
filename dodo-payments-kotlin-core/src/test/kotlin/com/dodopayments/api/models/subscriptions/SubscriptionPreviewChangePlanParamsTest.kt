// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionPreviewChangePlanParamsTest {

    @Test
    fun create() {
        SubscriptionPreviewChangePlanParams.builder()
            .subscriptionId("subscription_id")
            .updateSubscriptionPlanReq(
                UpdateSubscriptionPlanReq.builder()
                    .productId("product_id")
                    .prorationBillingMode(
                        UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY
                    )
                    .quantity(0)
                    .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                    .metadata(
                        UpdateSubscriptionPlanReq.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .onPaymentFailure(UpdateSubscriptionPlanReq.OnPaymentFailure.PREVENT_CHANGE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionPreviewChangePlanParams.builder()
                .subscriptionId("subscription_id")
                .updateSubscriptionPlanReq(
                    UpdateSubscriptionPlanReq.builder()
                        .productId("product_id")
                        .prorationBillingMode(
                            UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY
                        )
                        .quantity(0)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionPreviewChangePlanParams.builder()
                .subscriptionId("subscription_id")
                .updateSubscriptionPlanReq(
                    UpdateSubscriptionPlanReq.builder()
                        .productId("product_id")
                        .prorationBillingMode(
                            UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY
                        )
                        .quantity(0)
                        .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                        .metadata(
                            UpdateSubscriptionPlanReq.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .onPaymentFailure(UpdateSubscriptionPlanReq.OnPaymentFailure.PREVENT_CHANGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateSubscriptionPlanReq.builder()
                    .productId("product_id")
                    .prorationBillingMode(
                        UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY
                    )
                    .quantity(0)
                    .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                    .metadata(
                        UpdateSubscriptionPlanReq.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .onPaymentFailure(UpdateSubscriptionPlanReq.OnPaymentFailure.PREVENT_CHANGE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionPreviewChangePlanParams.builder()
                .subscriptionId("subscription_id")
                .updateSubscriptionPlanReq(
                    UpdateSubscriptionPlanReq.builder()
                        .productId("product_id")
                        .prorationBillingMode(
                            UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY
                        )
                        .quantity(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateSubscriptionPlanReq.builder()
                    .productId("product_id")
                    .prorationBillingMode(
                        UpdateSubscriptionPlanReq.ProrationBillingMode.PRORATED_IMMEDIATELY
                    )
                    .quantity(0)
                    .build()
            )
    }
}
