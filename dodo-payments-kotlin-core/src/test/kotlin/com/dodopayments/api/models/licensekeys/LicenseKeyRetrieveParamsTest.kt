// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyRetrieveParamsTest {

    @Test
    fun create() {
        LicenseKeyRetrieveParams.builder().id("lic_123").build()
    }

    @Test
    fun pathParams() {
        val params = LicenseKeyRetrieveParams.builder().id("lic_123").build()

        assertThat(params._pathParam(0)).isEqualTo("lic_123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
