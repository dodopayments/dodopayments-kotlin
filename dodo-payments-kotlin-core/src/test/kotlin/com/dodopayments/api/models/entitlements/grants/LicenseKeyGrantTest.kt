// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyGrantTest {

    @Test
    fun create() {
        val licenseKeyGrant =
            LicenseKeyGrant.builder()
                .id("id")
                .activationsUsed(0)
                .key("key")
                .status(LicenseKeyStatus.ACTIVE)
                .activationsLimit(0)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(licenseKeyGrant.id()).isEqualTo("id")
        assertThat(licenseKeyGrant.activationsUsed()).isEqualTo(0)
        assertThat(licenseKeyGrant.key()).isEqualTo("key")
        assertThat(licenseKeyGrant.status()).isEqualTo(LicenseKeyStatus.ACTIVE)
        assertThat(licenseKeyGrant.activationsLimit()).isEqualTo(0)
        assertThat(licenseKeyGrant.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseKeyGrant =
            LicenseKeyGrant.builder()
                .id("id")
                .activationsUsed(0)
                .key("key")
                .status(LicenseKeyStatus.ACTIVE)
                .activationsLimit(0)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLicenseKeyGrant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseKeyGrant),
                jacksonTypeRef<LicenseKeyGrant>(),
            )

        assertThat(roundtrippedLicenseKeyGrant).isEqualTo(licenseKeyGrant)
    }
}
