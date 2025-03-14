// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionRetrieveParamsTest {

    @Test
    fun create() {
        SubscriptionRetrieveParams.builder().subscriptionId("subscription_id").build()
    }

    @Test
    fun getPathParam() {
        val params = SubscriptionRetrieveParams.builder().subscriptionId("subscription_id").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
