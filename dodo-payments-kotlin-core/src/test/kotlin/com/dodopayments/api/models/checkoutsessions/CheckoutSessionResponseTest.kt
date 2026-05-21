// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckoutSessionResponseTest {

    @Test
    fun create() {
        val checkoutSessionResponse =
            CheckoutSessionResponse.builder()
                .sessionId("session_id")
                .checkoutUrl("checkout_url")
                .clientSecret("client_secret")
                .paymentId("payment_id")
                .publishableKey("publishable_key")
                .build()

        assertThat(checkoutSessionResponse.sessionId()).isEqualTo("session_id")
        assertThat(checkoutSessionResponse.checkoutUrl()).isEqualTo("checkout_url")
        assertThat(checkoutSessionResponse.clientSecret()).isEqualTo("client_secret")
        assertThat(checkoutSessionResponse.paymentId()).isEqualTo("payment_id")
        assertThat(checkoutSessionResponse.publishableKey()).isEqualTo("publishable_key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionResponse =
            CheckoutSessionResponse.builder()
                .sessionId("session_id")
                .checkoutUrl("checkout_url")
                .clientSecret("client_secret")
                .paymentId("payment_id")
                .publishableKey("publishable_key")
                .build()

        val roundtrippedCheckoutSessionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionResponse),
                jacksonTypeRef<CheckoutSessionResponse>(),
            )

        assertThat(roundtrippedCheckoutSessionResponse).isEqualTo(checkoutSessionResponse)
    }
}
