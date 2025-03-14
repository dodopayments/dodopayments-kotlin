// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.discounts

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DiscountCreateParamsTest {

    @Test
    fun create() {
        DiscountCreateParams.builder()
            .amount(0L)
            .type(DiscountCreateParams.Type.PERCENTAGE)
            .code("code")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .name("name")
            .addRestrictedTo("string")
            .usageLimit(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            DiscountCreateParams.builder()
                .amount(0L)
                .type(DiscountCreateParams.Type.PERCENTAGE)
                .code("code")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .addRestrictedTo("string")
                .usageLimit(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.type()).isEqualTo(DiscountCreateParams.Type.PERCENTAGE)
        assertThat(body.code()).isEqualTo("code")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.restrictedTo()).isEqualTo(listOf("string"))
        assertThat(body.usageLimit()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DiscountCreateParams.builder()
                .amount(0L)
                .type(DiscountCreateParams.Type.PERCENTAGE)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.type()).isEqualTo(DiscountCreateParams.Type.PERCENTAGE)
    }
}
