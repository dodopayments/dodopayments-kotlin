// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.translations

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Locale
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementTranslationsListResponseTest {

    @Test
    fun create() {
        val creditEntitlementTranslationsListResponse =
            CreditEntitlementTranslationsListResponse.builder()
                .addItem(
                    CreditEntitlementTranslation.builder()
                        .locale(Locale.AR)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .unit("unit")
                        .build()
                )
                .build()

        assertThat(creditEntitlementTranslationsListResponse.items())
            .containsExactly(
                CreditEntitlementTranslation.builder()
                    .locale(Locale.AR)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .unit("unit")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditEntitlementTranslationsListResponse =
            CreditEntitlementTranslationsListResponse.builder()
                .addItem(
                    CreditEntitlementTranslation.builder()
                        .locale(Locale.AR)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .unit("unit")
                        .build()
                )
                .build()

        val roundtrippedCreditEntitlementTranslationsListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditEntitlementTranslationsListResponse),
                jacksonTypeRef<CreditEntitlementTranslationsListResponse>(),
            )

        assertThat(roundtrippedCreditEntitlementTranslationsListResponse)
            .isEqualTo(creditEntitlementTranslationsListResponse)
    }
}
