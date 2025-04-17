// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licensekeyinstances

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseKeyInstanceUpdateParamsTest {

    @Test
    fun create() {
        LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()
    }

    @Test
    fun body() {
        val params = LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun getPathParam() {
        val params = LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("lki_123")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
