// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseKeyInstanceRetrieveParamsTest {

    @Test
    fun create() {
        LicenseKeyInstanceRetrieveParams.builder().id("lki_123").build()
    }

    @Test
    fun getPathParam() {
        val params = LicenseKeyInstanceRetrieveParams.builder().id("lki_123").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("lki_123")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
