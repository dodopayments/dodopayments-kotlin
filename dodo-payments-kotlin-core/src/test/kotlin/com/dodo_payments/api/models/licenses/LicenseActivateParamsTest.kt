// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licenses

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseActivateParamsTest {

    @Test
    fun create() {
        LicenseActivateParams.builder().licenseKey("license_key").name("name").build()
    }

    @Test
    fun body() {
        val params = LicenseActivateParams.builder().licenseKey("license_key").name("name").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.licenseKey()).isEqualTo("license_key")
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LicenseActivateParams.builder().licenseKey("license_key").name("name").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.licenseKey()).isEqualTo("license_key")
        assertThat(body.name()).isEqualTo("name")
    }
}
