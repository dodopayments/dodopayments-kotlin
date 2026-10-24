// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.translations

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Locale
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementTranslationsListResponseTest {

    @Test
    fun create() {
        val entitlementTranslationsListResponse =
            EntitlementTranslationsListResponse.builder()
                .addItem(
                    EntitlementTranslation.builder()
                        .locale(Locale.AR)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationMessage("activation_message")
                        .description("description")
                        .instructions("instructions")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(entitlementTranslationsListResponse.items())
            .containsExactly(
                EntitlementTranslation.builder()
                    .locale(Locale.AR)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .activationMessage("activation_message")
                    .description("description")
                    .instructions("instructions")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementTranslationsListResponse =
            EntitlementTranslationsListResponse.builder()
                .addItem(
                    EntitlementTranslation.builder()
                        .locale(Locale.AR)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .activationMessage("activation_message")
                        .description("description")
                        .instructions("instructions")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedEntitlementTranslationsListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementTranslationsListResponse),
                jacksonTypeRef<EntitlementTranslationsListResponse>(),
            )

        assertThat(roundtrippedEntitlementTranslationsListResponse)
            .isEqualTo(entitlementTranslationsListResponse)
    }
}
