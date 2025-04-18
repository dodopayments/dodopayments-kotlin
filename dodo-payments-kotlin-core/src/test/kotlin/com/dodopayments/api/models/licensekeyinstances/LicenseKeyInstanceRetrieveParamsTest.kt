// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyInstanceRetrieveParamsTest {

    @Test
    fun create() {
        LicenseKeyInstanceRetrieveParams.builder().id("lki_123").build()
    }

    @Test
    fun pathParams() {
        val params = LicenseKeyInstanceRetrieveParams.builder().id("lki_123").build()

        assertThat(params._pathParam(0)).isEqualTo("lki_123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
