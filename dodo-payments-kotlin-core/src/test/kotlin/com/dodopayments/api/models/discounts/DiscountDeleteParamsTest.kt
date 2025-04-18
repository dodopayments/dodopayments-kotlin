// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountDeleteParamsTest {

    @Test
    fun create() {
        DiscountDeleteParams.builder().discountId("discount_id").build()
    }

    @Test
    fun pathParams() {
        val params = DiscountDeleteParams.builder().discountId("discount_id").build()

        assertThat(params._pathParam(0)).isEqualTo("discount_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
