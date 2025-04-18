// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChargeParamsTest {

    @Test
    fun create() {
        SubscriptionChargeParams.builder()
            .subscriptionId("subscription_id")
            .productPrice(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("subscription_id")
                .productPrice(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("subscription_id")
                .productPrice(0L)
                .build()

        val body = params._body()

        assertThat(body.productPrice()).isEqualTo(0L)
    }
}
