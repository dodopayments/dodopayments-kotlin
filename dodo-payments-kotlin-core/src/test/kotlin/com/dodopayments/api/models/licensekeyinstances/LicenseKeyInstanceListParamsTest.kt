// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseKeyInstanceListParamsTest {

    @Test
    fun create() {
        LicenseKeyInstanceListParams.builder()
            .licenseKeyId("license_key_id")
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LicenseKeyInstanceListParams.builder()
                .licenseKeyId("license_key_id")
                .pageNumber(0L)
                .pageSize(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("license_key_id", "license_key_id")
        expected.put("page_number", "0")
        expected.put("page_size", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LicenseKeyInstanceListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
