// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licenses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseValidateResponseTest {

    @Test
    fun createLicenseValidateResponse() {
        val licenseValidateResponse = LicenseValidateResponse.builder().valid(true).build()
        assertThat(licenseValidateResponse).isNotNull
        assertThat(licenseValidateResponse.valid()).isEqualTo(true)
    }
}
