// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.translations

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Locale
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementTranslationTest {

    @Test
    fun create() {
        val entitlementTranslation =
            EntitlementTranslation.builder()
                .locale(Locale.AR)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .activationMessage("activation_message")
                .description("description")
                .instructions("instructions")
                .name("name")
                .build()

        assertThat(entitlementTranslation.locale()).isEqualTo(Locale.AR)
        assertThat(entitlementTranslation.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementTranslation.activationMessage()).isEqualTo("activation_message")
        assertThat(entitlementTranslation.description()).isEqualTo("description")
        assertThat(entitlementTranslation.instructions()).isEqualTo("instructions")
        assertThat(entitlementTranslation.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementTranslation =
            EntitlementTranslation.builder()
                .locale(Locale.AR)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .activationMessage("activation_message")
                .description("description")
                .instructions("instructions")
                .name("name")
                .build()

        val roundtrippedEntitlementTranslation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementTranslation),
                jacksonTypeRef<EntitlementTranslation>(),
            )

        assertThat(roundtrippedEntitlementTranslation).isEqualTo(entitlementTranslation)
    }
}
