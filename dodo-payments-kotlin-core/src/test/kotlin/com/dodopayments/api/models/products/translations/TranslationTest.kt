// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.translations

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Locale
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranslationTest {

    @Test
    fun create() {
        val translation =
            Translation.builder()
                .locale(Locale.AR)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .build()

        assertThat(translation.locale()).isEqualTo(Locale.AR)
        assertThat(translation.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(translation.description()).isEqualTo("description")
        assertThat(translation.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val translation =
            Translation.builder()
                .locale(Locale.AR)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .build()

        val roundtrippedTranslation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(translation),
                jacksonTypeRef<Translation>(),
            )

        assertThat(roundtrippedTranslation).isEqualTo(translation)
    }
}
