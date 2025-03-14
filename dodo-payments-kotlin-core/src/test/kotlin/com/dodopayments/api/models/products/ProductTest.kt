// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.models.subscriptions.TimeInterval
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductTest {

    @Test
    fun createProduct() {
        val product =
            Product.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isRecurring(true)
                .licenseKeyEnabled(true)
                .price(
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
                .productId("product_id")
                .taxCategory(Product.TaxCategory.DIGITAL_PRODUCTS)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addAddon("string")
                .description("description")
                .image("image")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0L)
                .licenseKeyDuration(
                    LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build()
                )
                .name("name")
                .build()
        assertThat(product).isNotNull
        assertThat(product.businessId()).isEqualTo("business_id")
        assertThat(product.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(product.isRecurring()).isEqualTo(true)
        assertThat(product.licenseKeyEnabled()).isEqualTo(true)
        assertThat(product.price())
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
        assertThat(product.productId()).isEqualTo("product_id")
        assertThat(product.taxCategory()).isEqualTo(Product.TaxCategory.DIGITAL_PRODUCTS)
        assertThat(product.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(product.addons()).containsExactly("string")
        assertThat(product.description()).isEqualTo("description")
        assertThat(product.image()).isEqualTo("image")
        assertThat(product.licenseKeyActivationMessage())
            .isEqualTo("license_key_activation_message")
        assertThat(product.licenseKeyActivationsLimit()).isEqualTo(0L)
        assertThat(product.licenseKeyDuration())
            .isEqualTo(LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build())
        assertThat(product.name()).isEqualTo("name")
    }
}
