// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.products.Price
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionCreateResponseTest {

    @Test
    fun create() {
        val productCollectionCreateResponse =
            ProductCollectionCreateResponse.builder()
                .id("id")
                .brandId("brand_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addGroup(
                    ProductCollectionCreateResponse.Group.builder()
                        .groupId("group_id")
                        .addProduct(
                            ProductCollectionCreateResponse.Group.Product.builder()
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
                        )
                        .status(true)
                        .groupName("group_name")
                        .build()
                )
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .image("image")
                .build()

        assertThat(productCollectionCreateResponse.id()).isEqualTo("id")
        assertThat(productCollectionCreateResponse.brandId()).isEqualTo("brand_id")
        assertThat(productCollectionCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productCollectionCreateResponse.groups())
            .containsExactly(
                ProductCollectionCreateResponse.Group.builder()
                    .groupId("group_id")
                    .addProduct(
                        ProductCollectionCreateResponse.Group.Product.builder()
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
                    )
                    .status(true)
                    .groupName("group_name")
                    .build()
            )
        assertThat(productCollectionCreateResponse.name()).isEqualTo("name")
        assertThat(productCollectionCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productCollectionCreateResponse.description()).isEqualTo("description")
        assertThat(productCollectionCreateResponse.image()).isEqualTo("image")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionCreateResponse =
            ProductCollectionCreateResponse.builder()
                .id("id")
                .brandId("brand_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addGroup(
                    ProductCollectionCreateResponse.Group.builder()
                        .groupId("group_id")
                        .addProduct(
                            ProductCollectionCreateResponse.Group.Product.builder()
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
                        )
                        .status(true)
                        .groupName("group_name")
                        .build()
                )
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .image("image")
                .build()

        val roundtrippedProductCollectionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionCreateResponse),
                jacksonTypeRef<ProductCollectionCreateResponse>(),
            )

        assertThat(roundtrippedProductCollectionCreateResponse)
            .isEqualTo(productCollectionCreateResponse)
    }
}
