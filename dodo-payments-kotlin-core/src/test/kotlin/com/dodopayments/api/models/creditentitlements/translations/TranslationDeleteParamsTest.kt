// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.translations

import com.dodopayments.api.models.misc.Locale
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranslationDeleteParamsTest {

    @Test
    fun create() {
        TranslationDeleteParams.builder().id("id").locale(Locale.AR).build()
    }

    @Test
    fun pathParams() {
        val params = TranslationDeleteParams.builder().id("id").locale(Locale.AR).build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("ar")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
