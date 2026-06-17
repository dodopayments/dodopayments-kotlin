// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailListParamsTest {

    @Test
    fun create() {
        DetailListParams.builder()
            .payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T")
            .pageNumber(0)
            .pageSize(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = DetailListParams.builder().payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T").build()

        assertThat(params._pathParam(0)).isEqualTo("pyt_zFTrrn4sk3x3y2vjDBW3T")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DetailListParams.builder()
                .payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T")
                .pageNumber(0)
                .pageSize(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page_number", "0").put("page_size", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DetailListParams.builder().payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
