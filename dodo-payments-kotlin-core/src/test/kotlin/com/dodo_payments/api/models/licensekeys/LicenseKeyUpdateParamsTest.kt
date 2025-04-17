// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licensekeys

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LicenseKeyUpdateParamsTest {

    @Test
    fun create() {
        LicenseKeyUpdateParams.builder()
            .id("lic_123")
            .activationsLimit(0L)
            .disabled(true)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            LicenseKeyUpdateParams.builder()
                .id("lic_123")
                .activationsLimit(0L)
                .disabled(true)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.activationsLimit()).isEqualTo(0L)
        assertThat(body.disabled()).isEqualTo(true)
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LicenseKeyUpdateParams.builder().id("lic_123").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = LicenseKeyUpdateParams.builder().id("lic_123").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("lic_123")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
