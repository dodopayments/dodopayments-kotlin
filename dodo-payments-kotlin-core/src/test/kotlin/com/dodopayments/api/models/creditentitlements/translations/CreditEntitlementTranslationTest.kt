// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.translations

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Locale
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementTranslationTest {

    @Test
    fun create() {
        val creditEntitlementTranslation =
            CreditEntitlementTranslation.builder()
                .locale(Locale.AR)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .unit("unit")
                .build()

        assertThat(creditEntitlementTranslation.locale()).isEqualTo(Locale.AR)
        assertThat(creditEntitlementTranslation.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditEntitlementTranslation.name()).isEqualTo("name")
        assertThat(creditEntitlementTranslation.unit()).isEqualTo("unit")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditEntitlementTranslation =
            CreditEntitlementTranslation.builder()
                .locale(Locale.AR)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .unit("unit")
                .build()

        val roundtrippedCreditEntitlementTranslation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditEntitlementTranslation),
                jacksonTypeRef<CreditEntitlementTranslation>(),
            )

        assertThat(roundtrippedCreditEntitlementTranslation).isEqualTo(creditEntitlementTranslation)
    }
}
