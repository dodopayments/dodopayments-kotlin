// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.FeatureType
import com.dodopayments.api.models.entitlements.IntegrationConfigResponse
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.products.localizedprices.PricingMode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListResponseTest {

    @Test
    fun create() {
        val productListResponse =
            ProductListResponse.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEntitlement(
                    ProductEntitlementSummary.builder()
                        .id("id")
                        .integrationConfig(
                            IntegrationConfigResponse.FeatureFlagConfig.builder()
                                .featureId("feature_id")
                                .featureType(FeatureType.BOOLEAN)
                                .build()
                        )
                        .integrationType(EntitlementIntegrationType.DISCORD)
                        .name("name")
                        .description("description")
                        .build()
                )
                .isRecurring(true)
                .metadata(
                    Metadata.builder()
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
                        .payWhatYouWant(true)
                        .purchasingPowerParity(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .pricingMode(PricingMode.BY_CURRENCY)
                .taxInclusive(true)
                .build()

        assertThat(productListResponse.businessId()).isEqualTo("business_id")
        assertThat(productListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListResponse.entitlements())
            .containsExactly(
                ProductEntitlementSummary.builder()
                    .id("id")
                    .integrationConfig(
                        IntegrationConfigResponse.FeatureFlagConfig.builder()
                            .featureId("feature_id")
                            .featureType(FeatureType.BOOLEAN)
                            .build()
                    )
                    .integrationType(EntitlementIntegrationType.DISCORD)
                    .name("name")
                    .description("description")
                    .build()
            )
        assertThat(productListResponse.isRecurring()).isEqualTo(true)
        assertThat(productListResponse.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(productListResponse.productId()).isEqualTo("product_id")
        assertThat(productListResponse.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(productListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productListResponse.currency()).isEqualTo(Currency.AED)
        assertThat(productListResponse.description()).isEqualTo("description")
        assertThat(productListResponse.image()).isEqualTo("image")
        assertThat(productListResponse.name()).isEqualTo("name")
        assertThat(productListResponse.price()).isEqualTo(0)
        assertThat(productListResponse.priceDetail())
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
        assertThat(productListResponse.pricingMode()).isEqualTo(PricingMode.BY_CURRENCY)
        assertThat(productListResponse.taxInclusive()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productListResponse =
            ProductListResponse.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEntitlement(
                    ProductEntitlementSummary.builder()
                        .id("id")
                        .integrationConfig(
                            IntegrationConfigResponse.FeatureFlagConfig.builder()
                                .featureId("feature_id")
                                .featureType(FeatureType.BOOLEAN)
                                .build()
                        )
                        .integrationType(EntitlementIntegrationType.DISCORD)
                        .name("name")
                        .description("description")
                        .build()
                )
                .isRecurring(true)
                .metadata(
                    Metadata.builder()
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
                        .payWhatYouWant(true)
                        .purchasingPowerParity(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .pricingMode(PricingMode.BY_CURRENCY)
                .taxInclusive(true)
                .build()

        val roundtrippedProductListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListResponse),
                jacksonTypeRef<ProductListResponse>(),
            )

        assertThat(roundtrippedProductListResponse).isEqualTo(productListResponse)
    }
}
