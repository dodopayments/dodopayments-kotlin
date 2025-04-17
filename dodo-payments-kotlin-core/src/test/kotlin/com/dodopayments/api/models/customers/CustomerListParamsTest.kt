// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListParamsTest {

    @Test
    fun create() {
        CustomerListParams.builder().pageNumber(0L).pageSize(0L).build()
    }

    @Test
    fun queryParams() {
        val params = CustomerListParams.builder().pageNumber(0L).pageSize(0L).build()
        val expected = QueryParams.builder()
        expected.put("page_number", "0")
        expected.put("page_size", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
