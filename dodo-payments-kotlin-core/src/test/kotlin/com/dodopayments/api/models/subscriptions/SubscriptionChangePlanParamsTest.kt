// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangePlanParamsTest {

    @Test
    fun create() {
        SubscriptionChangePlanParams.builder()
            .subscriptionId("subscription_id")
            .productId("product_id")
            .prorationBillingMode(
                SubscriptionChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
            )
            .quantity(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionChangePlanParams.builder()
                .subscriptionId("subscription_id")
                .productId("product_id")
                .prorationBillingMode(
                    SubscriptionChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
                )
                .quantity(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionChangePlanParams.builder()
                .subscriptionId("subscription_id")
                .productId("product_id")
                .prorationBillingMode(
                    SubscriptionChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
                )
                .quantity(0L)
                .build()

        val body = params._body()

        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.prorationBillingMode())
            .isEqualTo(SubscriptionChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY)
        assertThat(body.quantity()).isEqualTo(0L)
    }
}
