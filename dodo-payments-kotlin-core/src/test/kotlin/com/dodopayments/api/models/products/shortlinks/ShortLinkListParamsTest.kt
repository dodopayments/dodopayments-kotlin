// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.shortlinks

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortLinkListParamsTest {

    @Test
    fun create() {
        ShortLinkListParams.builder().pageNumber(0).pageSize(0).productId("product_id").build()
    }

    @Test
    fun queryParams() {
        val params =
            ShortLinkListParams.builder().pageNumber(0).pageSize(0).productId("product_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("product_id", "product_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ShortLinkListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
