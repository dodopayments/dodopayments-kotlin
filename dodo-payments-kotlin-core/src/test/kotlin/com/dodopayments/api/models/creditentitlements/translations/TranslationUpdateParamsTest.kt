// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.translations

import com.dodopayments.api.models.misc.Locale
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranslationUpdateParamsTest {

    @Test
    fun create() {
        TranslationUpdateParams.builder()
            .id("id")
            .locale(Locale.AR)
            .name("name")
            .unit("unit")
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
                .name("name")
                .unit("unit")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.unit()).isEqualTo("unit")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TranslationUpdateParams.builder().id("id").locale(Locale.AR).build()

        val body = params._body()
    }
}
