// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductUnarchiveParamsTest {

    @Test
    fun create() {
        ProductUnarchiveParams.builder().id("id").build()
    }

    @Test
    fun getPathParam() {
        val params = ProductUnarchiveParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
