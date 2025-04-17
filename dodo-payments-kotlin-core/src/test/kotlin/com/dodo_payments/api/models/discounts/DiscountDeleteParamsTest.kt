// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.discounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DiscountDeleteParamsTest {

    @Test
    fun create() {
        DiscountDeleteParams.builder().discountId("discount_id").build()
    }

    @Test
    fun getPathParam() {
        val params = DiscountDeleteParams.builder().discountId("discount_id").build()
        assertThat(params).isNotNull
        // path param "discountId"
        assertThat(params.getPathParam(0)).isEqualTo("discount_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
