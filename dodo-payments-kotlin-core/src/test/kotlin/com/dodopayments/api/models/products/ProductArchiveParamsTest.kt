// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductArchiveParamsTest {

    @Test
    fun create() {
        ProductArchiveParams.builder().id("pdt_R8AWMPiV8RyJElcCKvAID").build()
    }

    @Test
    fun pathParams() {
        val params = ProductArchiveParams.builder().id("pdt_R8AWMPiV8RyJElcCKvAID").build()

        assertThat(params._pathParam(0)).isEqualTo("pdt_R8AWMPiV8RyJElcCKvAID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
