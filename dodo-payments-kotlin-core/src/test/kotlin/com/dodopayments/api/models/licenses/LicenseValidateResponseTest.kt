// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licenses

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseValidateResponseTest {

    @Test
    fun create() {
        val licenseValidateResponse = LicenseValidateResponse.builder().valid(true).build()

        assertThat(licenseValidateResponse.valid()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseValidateResponse = LicenseValidateResponse.builder().valid(true).build()

        val roundtrippedLicenseValidateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseValidateResponse),
                jacksonTypeRef<LicenseValidateResponse>(),
            )

        assertThat(roundtrippedLicenseValidateResponse).isEqualTo(licenseValidateResponse)
    }
}
