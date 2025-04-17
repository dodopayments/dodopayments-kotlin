// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionChargeParamsTest {

    @Test
    fun create() {
        SubscriptionChargeParams.builder()
            .subscriptionId("subscription_id")
            .productPrice(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("subscription_id")
                .productPrice(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.productPrice()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("subscription_id")
                .productPrice(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.productPrice()).isEqualTo(0L)
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("subscription_id")
                .productPrice(0L)
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
