// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandCreateParamsTest {

    @Test
    fun create() {
        BrandCreateParams.builder()
            .description("description")
            .name("name")
            .statementDescriptor("statement_descriptor")
            .supportEmail("support_email")
            .url("url")
            .build()
    }

    @Test
    fun body() {
        val params =
            BrandCreateParams.builder()
                .description("description")
                .name("name")
                .statementDescriptor("statement_descriptor")
                .supportEmail("support_email")
                .url("url")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(body.supportEmail()).isEqualTo("support_email")
        assertThat(body.url()).isEqualTo("url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandCreateParams.builder().build()

        val body = params._body()
    }
}
