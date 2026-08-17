// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandArchiveParamsTest {

    @Test
    fun create() {
        BrandArchiveParams.builder()
            .id("brnd_8dFiAW42v28JzhlVSocjq")
            .moveProductsTo("move_products_to")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BrandArchiveParams.builder().id("brnd_8dFiAW42v28JzhlVSocjq").build()

        assertThat(params._pathParam(0)).isEqualTo("brnd_8dFiAW42v28JzhlVSocjq")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BrandArchiveParams.builder()
                .id("brnd_8dFiAW42v28JzhlVSocjq")
                .moveProductsTo("move_products_to")
                .build()

        val body = params._body()

        assertThat(body.moveProductsTo()).isEqualTo("move_products_to")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandArchiveParams.builder().id("brnd_8dFiAW42v28JzhlVSocjq").build()

        val body = params._body()
    }
}
