// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.misc

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocaleInfoTest {

    @Test
    fun create() {
        val localeInfo =
            LocaleInfo.builder().code(Locale.AR).name("name").nativeName("native_name").build()

        assertThat(localeInfo.code()).isEqualTo(Locale.AR)
        assertThat(localeInfo.name()).isEqualTo("name")
        assertThat(localeInfo.nativeName()).isEqualTo("native_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val localeInfo =
            LocaleInfo.builder().code(Locale.AR).name("name").nativeName("native_name").build()

        val roundtrippedLocaleInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(localeInfo),
                jacksonTypeRef<LocaleInfo>(),
            )

        assertThat(roundtrippedLocaleInfo).isEqualTo(localeInfo)
    }
}
