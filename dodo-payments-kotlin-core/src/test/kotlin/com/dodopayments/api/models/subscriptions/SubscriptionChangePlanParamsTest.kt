// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangePlanParamsTest {

    @Test
    fun create() {
        SubscriptionChangePlanParams.builder().subscriptionId("subscription_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionChangePlanParams.builder().subscriptionId("subscription_id").build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
