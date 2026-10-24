// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.translations

import com.dodopayments.api.models.misc.Locale
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranslationUpdateParamsTest {

    @Test
    fun create() {
        TranslationUpdateParams.builder()
            .id("id")
            .locale(Locale.AR)
            .description("description")
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TranslationUpdateParams.builder().id("id").locale(Locale.AR).build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("ar")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TranslationUpdateParams.builder()
                .id("id")
                .locale(Locale.AR)
                .description("description")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TranslationUpdateParams.builder().id("id").locale(Locale.AR).build()

        val body = params._body()
    }
}
