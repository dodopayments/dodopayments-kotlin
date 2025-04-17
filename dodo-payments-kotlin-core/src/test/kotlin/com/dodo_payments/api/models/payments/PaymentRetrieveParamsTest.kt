// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentRetrieveParamsTest {

    @Test
    fun create() {
        PaymentRetrieveParams.builder().paymentId("payment_id").build()
    }

    @Test
    fun getPathParam() {
        val params = PaymentRetrieveParams.builder().paymentId("payment_id").build()
        assertThat(params).isNotNull
        // path param "paymentId"
        assertThat(params.getPathParam(0)).isEqualTo("payment_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
