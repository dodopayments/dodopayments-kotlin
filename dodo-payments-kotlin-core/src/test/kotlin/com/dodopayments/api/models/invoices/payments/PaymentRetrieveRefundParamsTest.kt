// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetrieveRefundParamsTest {

    @Test
    fun create() {
        PaymentRetrieveRefundParams.builder().refundId("refund_id").build()
    }

    @Test
    fun pathParams() {
        val params = PaymentRetrieveRefundParams.builder().refundId("refund_id").build()

        assertThat(params._pathParam(0)).isEqualTo("refund_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
