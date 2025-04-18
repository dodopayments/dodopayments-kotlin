// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundRetrieveParamsTest {

    @Test
    fun create() {
        RefundRetrieveParams.builder().refundId("refund_id").build()
    }

    @Test
    fun pathParams() {
        val params = RefundRetrieveParams.builder().refundId("refund_id").build()

        assertThat(params._pathParam(0)).isEqualTo("refund_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
