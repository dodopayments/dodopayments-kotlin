// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.productcollections.groups.items.ProductCollectionProduct
import com.dodopayments.api.models.products.Price
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCollectionGroupResponseTest {

    @Test
    fun create() {
        val productCollectionGroupResponse =
            ProductCollectionGroupResponse.builder()
                .groupId("group_id")
                .addProduct(
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
                )
                .status(true)
                .groupName("group_name")
                .build()

        assertThat(productCollectionGroupResponse.groupId()).isEqualTo("group_id")
        assertThat(productCollectionGroupResponse.products())
            .containsExactly(
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
            )
        assertThat(productCollectionGroupResponse.status()).isEqualTo(true)
        assertThat(productCollectionGroupResponse.groupName()).isEqualTo("group_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productCollectionGroupResponse =
            ProductCollectionGroupResponse.builder()
                .groupId("group_id")
                .addProduct(
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
                )
                .status(true)
                .groupName("group_name")
                .build()

        val roundtrippedProductCollectionGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productCollectionGroupResponse),
                jacksonTypeRef<ProductCollectionGroupResponse>(),
            )

        assertThat(roundtrippedProductCollectionGroupResponse)
            .isEqualTo(productCollectionGroupResponse)
    }
}
