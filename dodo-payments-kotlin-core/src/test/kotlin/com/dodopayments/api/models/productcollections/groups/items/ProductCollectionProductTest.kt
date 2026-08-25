// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups.items

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.products.Price
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionProductTest {

    @Test
    fun create() {
        val productCollectionProduct =
            ProductCollectionProduct.builder()
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
                        .payWhatYouWant(true)
                        .purchasingPowerParity(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .taxInclusive(true)
                .build()

        assertThat(productCollectionProduct.id()).isEqualTo("id")
        assertThat(productCollectionProduct.addonsCount()).isEqualTo(0L)
        assertThat(productCollectionProduct.filesCount()).isEqualTo(0L)
        assertThat(productCollectionProduct.hasCreditEntitlements()).isEqualTo(true)
        assertThat(productCollectionProduct.isRecurring()).isEqualTo(true)
        assertThat(productCollectionProduct.licenseKeyEnabled()).isEqualTo(true)
        assertThat(productCollectionProduct.metersCount()).isEqualTo(0L)
        assertThat(productCollectionProduct.productId()).isEqualTo("product_id")
        assertThat(productCollectionProduct.status()).isEqualTo(true)
        assertThat(productCollectionProduct.currency()).isEqualTo(Currency.AED)
        assertThat(productCollectionProduct.description()).isEqualTo("description")
        assertThat(productCollectionProduct.name()).isEqualTo("name")
        assertThat(productCollectionProduct.price()).isEqualTo(0)
        assertThat(productCollectionProduct.priceDetail())
            .isEqualTo(
                Price.ofOneTime(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0L)
                        .price(0)
                        .payWhatYouWant(true)
                        .purchasingPowerParity(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
            )
        assertThat(productCollectionProduct.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(productCollectionProduct.taxInclusive()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionProduct =
            ProductCollectionProduct.builder()
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
                        .payWhatYouWant(true)
                        .purchasingPowerParity(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .taxInclusive(true)
                .build()

        val roundtrippedProductCollectionProduct =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionProduct),
                jacksonTypeRef<ProductCollectionProduct>(),
            )

        assertThat(roundtrippedProductCollectionProduct).isEqualTo(productCollectionProduct)
    }
}
