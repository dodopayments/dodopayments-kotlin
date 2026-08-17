// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListParamsTest {

    @Test
    fun create() {
        BrandListParams.builder().includeArchived(true).build()
    }

    @Test
    fun queryParams() {
        val params = BrandListParams.builder().includeArchived(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
