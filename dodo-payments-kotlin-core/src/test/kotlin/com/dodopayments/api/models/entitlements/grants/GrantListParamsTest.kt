// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantListParamsTest {

    @Test
    fun create() {
        GrantListParams.builder()
            .id("ent_jt7jcvI79Xh8eehqgWdcm")
            .customerId("customer_id")
            .pageNumber(0)
            .pageSize(0)
            .status(GrantListParams.Status.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = GrantListParams.builder().id("ent_jt7jcvI79Xh8eehqgWdcm").build()

        assertThat(params._pathParam(0)).isEqualTo("ent_jt7jcvI79Xh8eehqgWdcm")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            GrantListParams.builder()
                .id("ent_jt7jcvI79Xh8eehqgWdcm")
                .customerId("customer_id")
                .pageNumber(0)
                .pageSize(0)
                .status(GrantListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customer_id", "customer_id")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("status", "Pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GrantListParams.builder().id("ent_jt7jcvI79Xh8eehqgWdcm").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
