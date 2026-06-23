// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.GitHubPermission
import com.dodopayments.api.models.entitlements.IntegrationConfigResponse
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.products.localizedprices.PricingMode
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
                        .addEntitlement(
                            ProductEntitlementSummary.builder()
                                .id("id")
                                .integrationConfig(
                                    IntegrationConfigResponse.GitHubConfig.builder()
                                        .permission(GitHubPermission.PULL)
                                        .targetId("target_id")
                                        .build()
                                )
                                .integrationType(EntitlementIntegrationType.DISCORD)
                                .name("name")
                                .description("description")
                                .build()
                        )
                        .isRecurring(true)
                        .metadata(
                            ProductListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("product_id")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .description("description")
                        .image("image")
                        .name("name")
                        .price(0)
                        .priceDetail(
                            Price.OneTimePrice.builder()
                                .currency(Currency.AED)
                                .discount(0L)
                                .price(0)
                                .purchasingPowerParity(true)
                                .payWhatYouWant(true)
                                .suggestedPrice(0)
                                .taxInclusive(true)
                                .build()
                        )
                        .pricingMode(PricingMode.BY_CURRENCY)
                        .taxInclusive(true)
                        .build()
                )
                .build()

        assertThat(productListPageResponse.items())
            .containsExactly(
                ProductListResponse.builder()
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addEntitlement(
                        ProductEntitlementSummary.builder()
                            .id("id")
                            .integrationConfig(
                                IntegrationConfigResponse.GitHubConfig.builder()
                                    .permission(GitHubPermission.PULL)
                                    .targetId("target_id")
                                    .build()
                            )
                            .integrationType(EntitlementIntegrationType.DISCORD)
                            .name("name")
                            .description("description")
                            .build()
                    )
                    .isRecurring(true)
                    .metadata(
                        ProductListResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("product_id")
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .description("description")
                    .image("image")
                    .name("name")
                    .price(0)
                    .priceDetail(
                        Price.OneTimePrice.builder()
                            .currency(Currency.AED)
                            .discount(0L)
                            .price(0)
                            .purchasingPowerParity(true)
                            .payWhatYouWant(true)
                            .suggestedPrice(0)
                            .taxInclusive(true)
                            .build()
                    )
                    .pricingMode(PricingMode.BY_CURRENCY)
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
                        .addEntitlement(
                            ProductEntitlementSummary.builder()
                                .id("id")
                                .integrationConfig(
                                    IntegrationConfigResponse.GitHubConfig.builder()
                                        .permission(GitHubPermission.PULL)
                                        .targetId("target_id")
                                        .build()
                                )
                                .integrationType(EntitlementIntegrationType.DISCORD)
                                .name("name")
                                .description("description")
                                .build()
                        )
                        .isRecurring(true)
                        .metadata(
                            ProductListResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("product_id")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .description("description")
                        .image("image")
                        .name("name")
                        .price(0)
                        .priceDetail(
                            Price.OneTimePrice.builder()
                                .currency(Currency.AED)
                                .discount(0L)
                                .price(0)
                                .purchasingPowerParity(true)
                                .payWhatYouWant(true)
                                .suggestedPrice(0)
                                .taxInclusive(true)
                                .build()
                        )
                        .pricingMode(PricingMode.BY_CURRENCY)
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
