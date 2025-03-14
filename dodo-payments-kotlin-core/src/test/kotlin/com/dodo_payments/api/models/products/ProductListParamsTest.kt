// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products

import com.dodo_payments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductListParamsTest {

    @Test
    fun create() {
        ProductListParams.builder()
            .archived(true)
            .pageNumber(0L)
            .pageSize(0L)
            .recurring(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ProductListParams.builder()
                .archived(true)
                .pageNumber(0L)
                .pageSize(0L)
                .recurring(true)
                .build()
        val expected = QueryParams.builder()
        expected.put("archived", "true")
        expected.put("page_number", "0")
        expected.put("page_size", "0")
        expected.put("recurring", "true")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProductListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
