// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateFilesParamsTest {

    @Test
    fun create() {
        ProductUpdateFilesParams.builder().id("id").fileName("file_name").build()
    }

    @Test
    fun pathParams() {
        val params = ProductUpdateFilesParams.builder().id("id").fileName("file_name").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = ProductUpdateFilesParams.builder().id("id").fileName("file_name").build()

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("file_name")
    }
}
