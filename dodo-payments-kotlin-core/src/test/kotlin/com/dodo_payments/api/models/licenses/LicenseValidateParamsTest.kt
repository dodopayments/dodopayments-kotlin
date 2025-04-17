// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licenses

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseValidateParamsTest {

    @Test
    fun create() {
        LicenseValidateParams.builder()
            .licenseKey("2b1f8e2d-c41e-4e8f-b2d3-d9fd61c38f43")
            .licenseKeyInstanceId("lki_123")
            .build()
    }

    @Test
    fun body() {
        val params =
            LicenseValidateParams.builder()
                .licenseKey("2b1f8e2d-c41e-4e8f-b2d3-d9fd61c38f43")
                .licenseKeyInstanceId("lki_123")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.licenseKey()).isEqualTo("2b1f8e2d-c41e-4e8f-b2d3-d9fd61c38f43")
        assertThat(body.licenseKeyInstanceId()).isEqualTo("lki_123")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LicenseValidateParams.builder()
                .licenseKey("2b1f8e2d-c41e-4e8f-b2d3-d9fd61c38f43")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.licenseKey()).isEqualTo("2b1f8e2d-c41e-4e8f-b2d3-d9fd61c38f43")
    }
}
