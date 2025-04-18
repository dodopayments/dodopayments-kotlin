// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyDurationTest {

    @Test
    fun create() {
        val licenseKeyDuration =
            LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build()

        assertThat(licenseKeyDuration.count()).isEqualTo(0L)
        assertThat(licenseKeyDuration.interval()).isEqualTo(TimeInterval.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseKeyDuration =
            LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build()

        val roundtrippedLicenseKeyDuration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseKeyDuration),
                jacksonTypeRef<LicenseKeyDuration>(),
            )

        assertThat(roundtrippedLicenseKeyDuration).isEqualTo(licenseKeyDuration)
    }
}
