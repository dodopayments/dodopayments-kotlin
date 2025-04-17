// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.refunds

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RefundRetrieveParamsTest {

    @Test
    fun create() {
        RefundRetrieveParams.builder().refundId("refund_id").build()
    }

    @Test
    fun getPathParam() {
        val params = RefundRetrieveParams.builder().refundId("refund_id").build()
        assertThat(params).isNotNull
        // path param "refundId"
        assertThat(params.getPathParam(0)).isEqualTo("refund_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
