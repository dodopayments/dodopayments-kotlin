// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseKeyListParamsTest {

    @Test
    fun create() {
        LicenseKeyListParams.builder()
            .customerId("customer_id")
            .pageNumber(0L)
            .pageSize(0L)
            .productId("product_id")
            .status(LicenseKeyStatus.ACTIVE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LicenseKeyListParams.builder()
                .customerId("customer_id")
                .pageNumber(0L)
                .pageSize(0L)
                .productId("product_id")
                .status(LicenseKeyStatus.ACTIVE)
                .build()
        val expected = QueryParams.builder()
        expected.put("customer_id", "customer_id")
        expected.put("page_number", "0")
        expected.put("page_size", "0")
        expected.put("product_id", "product_id")
        expected.put("status", LicenseKeyStatus.ACTIVE.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LicenseKeyListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
