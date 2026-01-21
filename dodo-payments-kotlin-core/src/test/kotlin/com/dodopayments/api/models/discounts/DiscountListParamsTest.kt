// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountListParamsTest {

    @Test
    fun create() {
        DiscountListParams.builder()
            .active(true)
            .code("code")
            .discountType(DiscountType.PERCENTAGE)
            .pageNumber(0)
            .pageSize(0)
            .productId("product_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DiscountListParams.builder()
                .active(true)
                .code("code")
                .discountType(DiscountType.PERCENTAGE)
                .pageNumber(0)
                .pageSize(0)
                .productId("product_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("active", "true")
                    .put("code", "code")
                    .put("discount_type", "percentage")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("product_id", "product_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DiscountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
