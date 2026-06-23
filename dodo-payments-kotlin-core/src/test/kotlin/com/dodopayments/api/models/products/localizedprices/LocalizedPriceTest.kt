// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.localizedprices

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocalizedPriceTest {

    @Test
    fun create() {
        val localizedPrice =
            LocalizedPrice.builder()
                .id("id")
                .amount(0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .mode(PricingMode.BY_CURRENCY)
                .productId("product_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .countryCode(CountryCode.AF)
                .build()

        assertThat(localizedPrice.id()).isEqualTo("id")
        assertThat(localizedPrice.amount()).isEqualTo(0)
        assertThat(localizedPrice.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(localizedPrice.currency()).isEqualTo(Currency.AED)
        assertThat(localizedPrice.mode()).isEqualTo(PricingMode.BY_CURRENCY)
        assertThat(localizedPrice.productId()).isEqualTo("product_id")
        assertThat(localizedPrice.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(localizedPrice.countryCode()).isEqualTo(CountryCode.AF)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val localizedPrice =
            LocalizedPrice.builder()
                .id("id")
                .amount(0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .mode(PricingMode.BY_CURRENCY)
                .productId("product_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .countryCode(CountryCode.AF)
                .build()

        val roundtrippedLocalizedPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(localizedPrice),
                jacksonTypeRef<LocalizedPrice>(),
            )

        assertThat(roundtrippedLocalizedPrice).isEqualTo(localizedPrice)
    }
}
