// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.localizedprices

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListLocalizedPricesResponseTest {

    @Test
    fun create() {
        val listLocalizedPricesResponse =
            ListLocalizedPricesResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(listLocalizedPricesResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listLocalizedPricesResponse =
            ListLocalizedPricesResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedListLocalizedPricesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listLocalizedPricesResponse),
                jacksonTypeRef<ListLocalizedPricesResponse>(),
            )

        assertThat(roundtrippedListLocalizedPricesResponse).isEqualTo(listLocalizedPricesResponse)
    }
}
