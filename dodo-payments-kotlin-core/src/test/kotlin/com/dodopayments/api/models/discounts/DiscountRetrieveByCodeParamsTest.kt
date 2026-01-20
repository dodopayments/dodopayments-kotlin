// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountRetrieveByCodeParamsTest {

    @Test
    fun create() {
        DiscountRetrieveByCodeParams.builder().code("code").build()
    }

    @Test
    fun pathParams() {
        val params = DiscountRetrieveByCodeParams.builder().code("code").build()

        assertThat(params._pathParam(0)).isEqualTo("code")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
