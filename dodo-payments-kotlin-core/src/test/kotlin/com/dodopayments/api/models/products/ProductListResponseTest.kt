// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductListResponseTest {

    @Test
    fun createProductListResponse() {
        val productListResponse =
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
        assertThat(productListResponse).isNotNull
        assertThat(productListResponse.businessId()).isEqualTo("business_id")
        assertThat(productListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListResponse.isRecurring()).isEqualTo(true)
        assertThat(productListResponse.productId()).isEqualTo("product_id")
        assertThat(productListResponse.taxCategory())
            .isEqualTo(ProductListResponse.TaxCategory.DIGITAL_PRODUCTS)
        assertThat(productListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListResponse.currency()).isEqualTo(ProductListResponse.Currency.AED)
        assertThat(productListResponse.description()).isEqualTo("description")
        assertThat(productListResponse.image()).isEqualTo("image")
        assertThat(productListResponse.name()).isEqualTo("name")
        assertThat(productListResponse.price()).isEqualTo(0L)
        assertThat(productListResponse.priceDetail())
            .isEqualTo(
                Price.ofOneTime(
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
            )
        assertThat(productListResponse.taxInclusive()).isEqualTo(true)
    }
}
