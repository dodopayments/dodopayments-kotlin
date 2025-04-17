// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionChargeResponseTest {

    @Test
    fun createSubscriptionChargeResponse() {
        val subscriptionChargeResponse =
            SubscriptionChargeResponse.builder().paymentId("payment_id").build()
        assertThat(subscriptionChargeResponse).isNotNull
        assertThat(subscriptionChargeResponse.paymentId()).isEqualTo("payment_id")
    }
}
