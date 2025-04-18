// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyInstanceListPageResponseTest {

    @Test
    fun create() {
        val licenseKeyInstanceListPageResponse =
            LicenseKeyInstanceListPageResponse.builder()
                .addItem(
                    LicenseKeyInstance.builder()
                        .id("lki_123")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .licenseKeyId("lic_123")
                        .name("Production Server 1")
                        .build()
                )
                .build()

        assertThat(licenseKeyInstanceListPageResponse.items())
            .containsExactly(
                LicenseKeyInstance.builder()
                    .id("lki_123")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .licenseKeyId("lic_123")
                    .name("Production Server 1")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseKeyInstanceListPageResponse =
            LicenseKeyInstanceListPageResponse.builder()
                .addItem(
                    LicenseKeyInstance.builder()
                        .id("lki_123")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .licenseKeyId("lic_123")
                        .name("Production Server 1")
                        .build()
                )
                .build()

        val roundtrippedLicenseKeyInstanceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseKeyInstanceListPageResponse),
                jacksonTypeRef<LicenseKeyInstanceListPageResponse>(),
            )

        assertThat(roundtrippedLicenseKeyInstanceListPageResponse)
            .isEqualTo(licenseKeyInstanceListPageResponse)
    }
}
