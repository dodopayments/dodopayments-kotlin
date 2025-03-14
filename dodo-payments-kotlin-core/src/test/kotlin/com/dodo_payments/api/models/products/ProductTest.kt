// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products

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
                    Product.Price.OneTimePrice.builder()
                        .currency(Product.Price.OneTimePrice.Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(Product.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0L)
                        .taxInclusive(true)
                        .build()
                )
                .productId("product_id")
                .taxCategory(Product.TaxCategory.DIGITAL_PRODUCTS)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .image("image")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0L)
                .licenseKeyDuration(
                    Product.LicenseKeyDuration.builder()
                        .count(0L)
                        .interval(Product.LicenseKeyDuration.Interval.DAY)
                        .build()
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
                Product.Price.ofOneTime(
                    Product.Price.OneTimePrice.builder()
                        .currency(Product.Price.OneTimePrice.Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(Product.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0L)
                        .taxInclusive(true)
                        .build()
                )
            )
        assertThat(product.productId()).isEqualTo("product_id")
        assertThat(product.taxCategory()).isEqualTo(Product.TaxCategory.DIGITAL_PRODUCTS)
        assertThat(product.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(product.description()).isEqualTo("description")
        assertThat(product.image()).isEqualTo("image")
        assertThat(product.licenseKeyActivationMessage())
            .isEqualTo("license_key_activation_message")
        assertThat(product.licenseKeyActivationsLimit()).isEqualTo(0L)
        assertThat(product.licenseKeyDuration())
            .isEqualTo(
                Product.LicenseKeyDuration.builder()
                    .count(0L)
                    .interval(Product.LicenseKeyDuration.Interval.DAY)
                    .build()
            )
        assertThat(product.name()).isEqualTo("name")
    }
}
