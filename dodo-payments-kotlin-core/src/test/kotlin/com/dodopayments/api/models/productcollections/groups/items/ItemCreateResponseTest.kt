// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups.items

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.products.Price
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemCreateResponseTest {

    @Test
    fun create() {
        val itemCreateResponse =
            ItemCreateResponse.builder()
                .id("id")
                .addonsCount(0L)
                .filesCount(0L)
                .hasCreditEntitlements(true)
                .isRecurring(true)
                .licenseKeyEnabled(true)
                .metersCount(0L)
                .productId("product_id")
                .status(true)
                .currency(Currency.AED)
                .description("description")
                .name("name")
                .price(0)
                .priceDetail(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0L)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .taxInclusive(true)
                .build()

        assertThat(itemCreateResponse.id()).isEqualTo("id")
        assertThat(itemCreateResponse.addonsCount()).isEqualTo(0L)
        assertThat(itemCreateResponse.filesCount()).isEqualTo(0L)
        assertThat(itemCreateResponse.hasCreditEntitlements()).isEqualTo(true)
        assertThat(itemCreateResponse.isRecurring()).isEqualTo(true)
        assertThat(itemCreateResponse.licenseKeyEnabled()).isEqualTo(true)
        assertThat(itemCreateResponse.metersCount()).isEqualTo(0L)
        assertThat(itemCreateResponse.productId()).isEqualTo("product_id")
        assertThat(itemCreateResponse.status()).isEqualTo(true)
        assertThat(itemCreateResponse.currency()).isEqualTo(Currency.AED)
        assertThat(itemCreateResponse.description()).isEqualTo("description")
        assertThat(itemCreateResponse.name()).isEqualTo("name")
        assertThat(itemCreateResponse.price()).isEqualTo(0)
        assertThat(itemCreateResponse.priceDetail())
            .isEqualTo(
                Price.ofOneTime(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0L)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
            )
        assertThat(itemCreateResponse.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(itemCreateResponse.taxInclusive()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemCreateResponse =
            ItemCreateResponse.builder()
                .id("id")
                .addonsCount(0L)
                .filesCount(0L)
                .hasCreditEntitlements(true)
                .isRecurring(true)
                .licenseKeyEnabled(true)
                .metersCount(0L)
                .productId("product_id")
                .status(true)
                .currency(Currency.AED)
                .description("description")
                .name("name")
                .price(0)
                .priceDetail(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0L)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .taxInclusive(true)
                .build()

        val roundtrippedItemCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemCreateResponse),
                jacksonTypeRef<ItemCreateResponse>(),
            )

        assertThat(roundtrippedItemCreateResponse).isEqualTo(itemCreateResponse)
    }
}
