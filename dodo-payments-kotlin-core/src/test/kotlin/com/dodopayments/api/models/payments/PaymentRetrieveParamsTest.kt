// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetrieveParamsTest {

    @Test
    fun create() {
        PaymentRetrieveParams.builder().paymentId("payment_id").build()
    }

    @Test
    fun pathParams() {
        val params = PaymentRetrieveParams.builder().paymentId("payment_id").build()

        assertThat(params._pathParam(0)).isEqualTo("payment_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
