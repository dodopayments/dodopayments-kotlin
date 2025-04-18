// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListPageResponseTest {

    @Test
    fun create() {
        val productListPageResponse =
            ProductListPageResponse.builder()
                .addItem(
                    ProductListResponse.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isRecurring(true)
                        .productId("product_id")
                        .taxCategory(ProductListResponse.TaxCategory.DIGITAL_PRODUCTS)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(ProductListResponse.Currency.AED)
                        .description("description")
                        .image("image")
                        .name("name")
                        .price(0L)
                        .priceDetail(
                            Price.OneTimePrice.builder()
                                .currency(Price.OneTimePrice.Currency.AED)
                                .discount(0.0)
                                .price(0L)
                                .purchasingPowerParity(true)
                                .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                                .payWhatYouWant(true)
                                .suggestedPrice(0L)
                                .taxInclusive(true)
                                .build()
                        )
                        .taxInclusive(true)
                        .build()
                )
                .build()

        assertThat(productListPageResponse.items())
            .containsExactly(
                ProductListResponse.builder()
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isRecurring(true)
                    .productId("product_id")
                    .taxCategory(ProductListResponse.TaxCategory.DIGITAL_PRODUCTS)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(ProductListResponse.Currency.AED)
                    .description("description")
                    .image("image")
                    .name("name")
                    .price(0L)
                    .priceDetail(
                        Price.OneTimePrice.builder()
                            .currency(Price.OneTimePrice.Currency.AED)
                            .discount(0.0)
                            .price(0L)
                            .purchasingPowerParity(true)
                            .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                            .payWhatYouWant(true)
                            .suggestedPrice(0L)
                            .taxInclusive(true)
                            .build()
                    )
                    .taxInclusive(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productListPageResponse =
            ProductListPageResponse.builder()
                .addItem(
                    ProductListResponse.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isRecurring(true)
                        .productId("product_id")
                        .taxCategory(ProductListResponse.TaxCategory.DIGITAL_PRODUCTS)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(ProductListResponse.Currency.AED)
                        .description("description")
                        .image("image")
                        .name("name")
                        .price(0L)
                        .priceDetail(
                            Price.OneTimePrice.builder()
                                .currency(Price.OneTimePrice.Currency.AED)
                                .discount(0.0)
                                .price(0L)
                                .purchasingPowerParity(true)
                                .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                                .payWhatYouWant(true)
                                .suggestedPrice(0L)
                                .taxInclusive(true)
                                .build()
                        )
                        .taxInclusive(true)
                        .build()
                )
                .build()

        val roundtrippedProductListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListPageResponse),
                jacksonTypeRef<ProductListPageResponse>(),
            )

        assertThat(roundtrippedProductListPageResponse).isEqualTo(productListPageResponse)
    }
}
