// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licenses

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseDeactivateParamsTest {

    @Test
    fun create() {
        LicenseDeactivateParams.builder()
            .licenseKey("license_key")
            .licenseKeyInstanceId("license_key_instance_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            LicenseDeactivateParams.builder()
                .licenseKey("license_key")
                .licenseKeyInstanceId("license_key_instance_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.licenseKey()).isEqualTo("license_key")
        assertThat(body.licenseKeyInstanceId()).isEqualTo("license_key_instance_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LicenseDeactivateParams.builder()
                .licenseKey("license_key")
                .licenseKeyInstanceId("license_key_instance_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.licenseKey()).isEqualTo("license_key")
        assertThat(body.licenseKeyInstanceId()).isEqualTo("license_key_instance_id")
    }
}
