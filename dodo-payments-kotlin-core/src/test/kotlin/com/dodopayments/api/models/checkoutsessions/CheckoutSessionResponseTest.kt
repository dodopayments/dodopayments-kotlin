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
                .checkoutUrl("checkout_url")
                .sessionId("session_id")
                .build()

        assertThat(checkoutSessionResponse.checkoutUrl()).isEqualTo("checkout_url")
        assertThat(checkoutSessionResponse.sessionId()).isEqualTo("session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionResponse =
            CheckoutSessionResponse.builder()
                .checkoutUrl("checkout_url")
                .sessionId("session_id")
                .build()

        val roundtrippedCheckoutSessionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionResponse),
                jacksonTypeRef<CheckoutSessionResponse>(),
            )

        assertThat(roundtrippedCheckoutSessionResponse).isEqualTo(checkoutSessionResponse)
    }
}
