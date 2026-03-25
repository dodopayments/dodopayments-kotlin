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

internal class ProductCollectionRetrieveResponseTest {

    @Test
    fun create() {
        val productCollectionRetrieveResponse =
            ProductCollectionRetrieveResponse.builder()
                .id("id")
                .brandId("brand_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addGroup(
                    ProductCollectionRetrieveResponse.Group.builder()
                        .groupId("group_id")
                        .addProduct(
                            ProductCollectionRetrieveResponse.Group.Product.builder()
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

        assertThat(productCollectionRetrieveResponse.id()).isEqualTo("id")
        assertThat(productCollectionRetrieveResponse.brandId()).isEqualTo("brand_id")
        assertThat(productCollectionRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productCollectionRetrieveResponse.groups())
            .containsExactly(
                ProductCollectionRetrieveResponse.Group.builder()
                    .groupId("group_id")
                    .addProduct(
                        ProductCollectionRetrieveResponse.Group.Product.builder()
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
        assertThat(productCollectionRetrieveResponse.name()).isEqualTo("name")
        assertThat(productCollectionRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productCollectionRetrieveResponse.description()).isEqualTo("description")
        assertThat(productCollectionRetrieveResponse.image()).isEqualTo("image")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionRetrieveResponse =
            ProductCollectionRetrieveResponse.builder()
                .id("id")
                .brandId("brand_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addGroup(
                    ProductCollectionRetrieveResponse.Group.builder()
                        .groupId("group_id")
                        .addProduct(
                            ProductCollectionRetrieveResponse.Group.Product.builder()
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

        val roundtrippedProductCollectionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionRetrieveResponse),
                jacksonTypeRef<ProductCollectionRetrieveResponse>(),
            )

        assertThat(roundtrippedProductCollectionRetrieveResponse)
            .isEqualTo(productCollectionRetrieveResponse)
    }
}
