// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licensekeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseKeyRetrieveParamsTest {

    @Test
    fun create() {
        LicenseKeyRetrieveParams.builder().id("lic_123").build()
    }

    @Test
    fun getPathParam() {
        val params = LicenseKeyRetrieveParams.builder().id("lic_123").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("lic_123")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
