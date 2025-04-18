// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyInstanceUpdateParamsTest {

    @Test
    fun create() {
        LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()
    }

    @Test
    fun pathParams() {
        val params = LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("lki_123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
