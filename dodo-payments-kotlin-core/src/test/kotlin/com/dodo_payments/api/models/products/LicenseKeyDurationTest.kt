// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products

import com.dodo_payments.api.models.subscriptions.TimeInterval
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseKeyDurationTest {

    @Test
    fun createLicenseKeyDuration() {
        val licenseKeyDuration =
            LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build()
        assertThat(licenseKeyDuration).isNotNull
        assertThat(licenseKeyDuration.count()).isEqualTo(0L)
        assertThat(licenseKeyDuration.interval()).isEqualTo(TimeInterval.DAY)
    }
}
