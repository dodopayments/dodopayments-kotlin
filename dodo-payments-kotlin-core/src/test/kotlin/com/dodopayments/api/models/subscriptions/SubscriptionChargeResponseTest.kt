// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChargeResponseTest {

    @Test
    fun create() {
        val subscriptionChargeResponse =
            SubscriptionChargeResponse.builder().paymentId("payment_id").build()

        assertThat(subscriptionChargeResponse.paymentId()).isEqualTo("payment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionChargeResponse =
            SubscriptionChargeResponse.builder().paymentId("payment_id").build()

        val roundtrippedSubscriptionChargeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionChargeResponse),
                jacksonTypeRef<SubscriptionChargeResponse>(),
            )

        assertThat(roundtrippedSubscriptionChargeResponse).isEqualTo(subscriptionChargeResponse)
    }
}
