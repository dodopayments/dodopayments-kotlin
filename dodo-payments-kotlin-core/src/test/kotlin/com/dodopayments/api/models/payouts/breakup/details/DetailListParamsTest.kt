// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailListParamsTest {

    @Test
    fun create() {
        DetailListParams.builder().payoutId("payout_id").pageNumber(0).pageSize(0).build()
    }

    @Test
    fun pathParams() {
        val params = DetailListParams.builder().payoutId("payout_id").build()

        assertThat(params._pathParam(0)).isEqualTo("payout_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DetailListParams.builder().payoutId("payout_id").pageNumber(0).pageSize(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page_number", "0").put("page_size", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DetailListParams.builder().payoutId("payout_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
