// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdatePaymentMethodResponseTest {

    @Test
    fun create() {
        val subscriptionUpdatePaymentMethodResponse =
            SubscriptionUpdatePaymentMethodResponse.builder()
                .clientSecret("client_secret")
                .expiresOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentId("payment_id")
                .paymentLink("payment_link")
                .build()

        assertThat(subscriptionUpdatePaymentMethodResponse.clientSecret())
            .isEqualTo("client_secret")
        assertThat(subscriptionUpdatePaymentMethodResponse.expiresOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionUpdatePaymentMethodResponse.paymentId()).isEqualTo("payment_id")
        assertThat(subscriptionUpdatePaymentMethodResponse.paymentLink()).isEqualTo("payment_link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpdatePaymentMethodResponse =
            SubscriptionUpdatePaymentMethodResponse.builder()
                .clientSecret("client_secret")
                .expiresOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentId("payment_id")
                .paymentLink("payment_link")
                .build()

        val roundtrippedSubscriptionUpdatePaymentMethodResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUpdatePaymentMethodResponse),
                jacksonTypeRef<SubscriptionUpdatePaymentMethodResponse>(),
            )

        assertThat(roundtrippedSubscriptionUpdatePaymentMethodResponse)
            .isEqualTo(subscriptionUpdatePaymentMethodResponse)
    }
}
