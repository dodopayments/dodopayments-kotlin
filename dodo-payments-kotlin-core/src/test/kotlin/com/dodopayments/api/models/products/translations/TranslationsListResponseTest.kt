// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.translations

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Locale
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranslationsListResponseTest {

    @Test
    fun create() {
        val translationsListResponse =
            TranslationsListResponse.builder()
                .addItem(
                    Translation.builder()
                        .locale(Locale.AR)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(translationsListResponse.items())
            .containsExactly(
                Translation.builder()
                    .locale(Locale.AR)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val translationsListResponse =
            TranslationsListResponse.builder()
                .addItem(
                    Translation.builder()
                        .locale(Locale.AR)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedTranslationsListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(translationsListResponse),
                jacksonTypeRef<TranslationsListResponse>(),
            )

        assertThat(roundtrippedTranslationsListResponse).isEqualTo(translationsListResponse)
    }
}
