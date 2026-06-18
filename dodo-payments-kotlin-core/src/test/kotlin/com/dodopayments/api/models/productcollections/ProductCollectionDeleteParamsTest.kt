// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionDeleteParamsTest {

    @Test
    fun create() {
        ProductCollectionDeleteParams.builder().id("pdc_8BWv0hojwUH7iCDabr0NI").build()
    }

    @Test
    fun pathParams() {
        val params = ProductCollectionDeleteParams.builder().id("pdc_8BWv0hojwUH7iCDabr0NI").build()

        assertThat(params._pathParam(0)).isEqualTo("pdc_8BWv0hojwUH7iCDabr0NI")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
