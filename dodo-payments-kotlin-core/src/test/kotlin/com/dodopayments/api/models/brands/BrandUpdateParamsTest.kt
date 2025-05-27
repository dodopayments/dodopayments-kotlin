// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandUpdateParamsTest {

    @Test
    fun create() {
        BrandUpdateParams.builder()
            .id("id")
            .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .statementDescriptor("statement_descriptor")
            .supportEmail("support_email")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BrandUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BrandUpdateParams.builder()
                .id("id")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .statementDescriptor("statement_descriptor")
                .supportEmail("support_email")
                .build()

        val body = params._body()

        assertThat(body.imageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(body.supportEmail()).isEqualTo("support_email")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BrandUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
