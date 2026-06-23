// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantFulfillLicenseKeyParamsTest {

    @Test
    fun create() {
        GrantFulfillLicenseKeyParams.builder()
            .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
            .key("key")
            .activationsLimit(0)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GrantFulfillLicenseKeyParams.builder()
                .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
                .key("key")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entg_w0ZCJZgNXuNDdMVzvja6p")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GrantFulfillLicenseKeyParams.builder()
                .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
                .key("key")
                .activationsLimit(0)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("key")
        assertThat(body.activationsLimit()).isEqualTo(0)
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GrantFulfillLicenseKeyParams.builder()
                .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
                .key("key")
                .build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("key")
    }
}
