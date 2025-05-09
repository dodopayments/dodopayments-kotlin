// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonListPageResponseTest {

    @Test
    fun create() {
        val addonListPageResponse =
            AddonListPageResponse.builder()
                .addItem(
                    AddonResponse.builder()
                        .id("id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .name("name")
                        .price(0)
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .image("image")
                        .build()
                )
                .build()

        assertThat(addonListPageResponse.items())
            .containsExactly(
                AddonResponse.builder()
                    .id("id")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .name("name")
                    .price(0)
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .image("image")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonListPageResponse =
            AddonListPageResponse.builder()
                .addItem(
                    AddonResponse.builder()
                        .id("id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .name("name")
                        .price(0)
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .image("image")
                        .build()
                )
                .build()

        val roundtrippedAddonListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonListPageResponse),
                jacksonTypeRef<AddonListPageResponse>(),
            )

        assertThat(roundtrippedAddonListPageResponse).isEqualTo(addonListPageResponse)
    }
}
