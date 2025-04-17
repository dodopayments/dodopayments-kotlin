// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseKeyInstanceTest {

    @Test
    fun createLicenseKeyInstance() {
        val licenseKeyInstance =
            LicenseKeyInstance.builder()
                .id("lki_123")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .licenseKeyId("lic_123")
                .name("Production Server 1")
                .build()
        assertThat(licenseKeyInstance).isNotNull
        assertThat(licenseKeyInstance.id()).isEqualTo("lki_123")
        assertThat(licenseKeyInstance.businessId()).isEqualTo("business_id")
        assertThat(licenseKeyInstance.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(licenseKeyInstance.licenseKeyId()).isEqualTo("lic_123")
        assertThat(licenseKeyInstance.name()).isEqualTo("Production Server 1")
    }
}
