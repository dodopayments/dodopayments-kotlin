// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.addons

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonResponseTest {

    @Test
    fun create() {
        val addonResponse =
            AddonResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .name("name")
                .price(0L)
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .image("image")
                .build()

        assertThat(addonResponse.id()).isEqualTo("id")
        assertThat(addonResponse.businessId()).isEqualTo("business_id")
        assertThat(addonResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addonResponse.currency()).isEqualTo(Currency.AED)
        assertThat(addonResponse.name()).isEqualTo("name")
        assertThat(addonResponse.price()).isEqualTo(0L)
        assertThat(addonResponse.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(addonResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addonResponse.description()).isEqualTo("description")
        assertThat(addonResponse.image()).isEqualTo("image")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonResponse =
            AddonResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .name("name")
                .price(0L)
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .image("image")
                .build()

        val roundtrippedAddonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonResponse),
                jacksonTypeRef<AddonResponse>(),
            )

        assertThat(roundtrippedAddonResponse).isEqualTo(addonResponse)
    }
}
