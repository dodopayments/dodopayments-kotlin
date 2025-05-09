// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyUpdateParamsTest {

    @Test
    fun create() {
        LicenseKeyUpdateParams.builder()
            .id("lic_123")
            .activationsLimit(0)
            .disabled(true)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = LicenseKeyUpdateParams.builder().id("lic_123").build()

        assertThat(params._pathParam(0)).isEqualTo("lic_123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LicenseKeyUpdateParams.builder()
                .id("lic_123")
                .activationsLimit(0)
                .disabled(true)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.activationsLimit()).isEqualTo(0)
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LicenseKeyUpdateParams.builder().id("lic_123").build()

        val body = params._body()
    }
}
