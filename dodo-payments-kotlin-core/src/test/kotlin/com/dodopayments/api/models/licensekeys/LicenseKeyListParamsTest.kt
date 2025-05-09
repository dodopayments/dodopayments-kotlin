// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyListParamsTest {

    @Test
    fun create() {
        LicenseKeyListParams.builder()
            .customerId("customer_id")
            .pageNumber(0)
            .pageSize(0)
            .productId("product_id")
            .status(LicenseKeyStatus.ACTIVE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LicenseKeyListParams.builder()
                .customerId("customer_id")
                .pageNumber(0)
                .pageSize(0)
                .productId("product_id")
                .status(LicenseKeyStatus.ACTIVE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customer_id", "customer_id")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("product_id", "product_id")
                    .put("status", "active")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LicenseKeyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
