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
            .productId("product_id")
            .prorationBillingMode(
                SubscriptionPreviewChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
            )
            .quantity(0)
            .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
            .metadata(
                SubscriptionPreviewChangePlanParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionPreviewChangePlanParams.builder()
                .subscriptionId("subscription_id")
                .productId("product_id")
                .prorationBillingMode(
                    SubscriptionPreviewChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
                )
                .quantity(0)
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
                .productId("product_id")
                .prorationBillingMode(
                    SubscriptionPreviewChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
                )
                .quantity(0)
                .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                .metadata(
                    SubscriptionPreviewChangePlanParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.prorationBillingMode())
            .isEqualTo(
                SubscriptionPreviewChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
            )
        assertThat(body.quantity()).isEqualTo(0)
        assertThat(body.addons())
            .containsExactly(AttachAddon.builder().addonId("addon_id").quantity(0).build())
        assertThat(body.metadata())
            .isEqualTo(
                SubscriptionPreviewChangePlanParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionPreviewChangePlanParams.builder()
                .subscriptionId("subscription_id")
                .productId("product_id")
                .prorationBillingMode(
                    SubscriptionPreviewChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
                )
                .quantity(0)
                .build()

        val body = params._body()

        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.prorationBillingMode())
            .isEqualTo(
                SubscriptionPreviewChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
            )
        assertThat(body.quantity()).isEqualTo(0)
    }
}
