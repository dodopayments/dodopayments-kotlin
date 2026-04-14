// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyCreateParamsTest {

    @Test
    fun create() {
        LicenseKeyCreateParams.builder()
            .customerId("customer_id")
            .key("key")
            .productId("product_id")
            .activationsLimit(0)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            LicenseKeyCreateParams.builder()
                .customerId("customer_id")
                .key("key")
                .productId("product_id")
                .activationsLimit(0)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.key()).isEqualTo("key")
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.activationsLimit()).isEqualTo(0)
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LicenseKeyCreateParams.builder()
                .customerId("customer_id")
                .key("key")
                .productId("product_id")
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.key()).isEqualTo("key")
        assertThat(body.productId()).isEqualTo("product_id")
    }
}
