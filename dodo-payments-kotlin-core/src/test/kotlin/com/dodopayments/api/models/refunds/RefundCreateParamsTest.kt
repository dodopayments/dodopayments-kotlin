// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RefundCreateParamsTest {

    @Test
    fun create() {
        RefundCreateParams.builder().paymentId("payment_id").reason("reason").build()
    }

    @Test
    fun body() {
        val params = RefundCreateParams.builder().paymentId("payment_id").reason("reason").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.paymentId()).isEqualTo("payment_id")
        assertThat(body.reason()).isEqualTo("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RefundCreateParams.builder().paymentId("payment_id").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.paymentId()).isEqualTo("payment_id")
    }
}
