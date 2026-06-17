// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountRetrieveParamsTest {

    @Test
    fun create() {
        DiscountRetrieveParams.builder().discountId("dsc_qxxEmg5PuM1uNTE0LgkP9").build()
    }

    @Test
    fun pathParams() {
        val params =
            DiscountRetrieveParams.builder().discountId("dsc_qxxEmg5PuM1uNTE0LgkP9").build()

        assertThat(params._pathParam(0)).isEqualTo("dsc_qxxEmg5PuM1uNTE0LgkP9")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
