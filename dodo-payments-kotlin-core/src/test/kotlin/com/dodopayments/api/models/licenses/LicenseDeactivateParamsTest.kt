// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licenses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseDeactivateParamsTest {

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

        assertThat(body.licenseKey()).isEqualTo("license_key")
        assertThat(body.licenseKeyInstanceId()).isEqualTo("license_key_instance_id")
    }
}
