// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveParamsTest {

    @Test
    fun create() {
        BrandRetrieveParams.builder().id("brnd_8dFiAW42v28JzhlVSocjq").build()
    }

    @Test
    fun pathParams() {
        val params = BrandRetrieveParams.builder().id("brnd_8dFiAW42v28JzhlVSocjq").build()

        assertThat(params._pathParam(0)).isEqualTo("brnd_8dFiAW42v28JzhlVSocjq")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
