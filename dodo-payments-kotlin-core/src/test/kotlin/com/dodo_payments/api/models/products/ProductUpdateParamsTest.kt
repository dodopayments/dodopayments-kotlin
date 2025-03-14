// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductUpdateParamsTest {

    @Test
    fun create() {
        ProductUpdateParams.builder()
            .id("id")
            .description("description")
            .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .licenseKeyActivationMessage("license_key_activation_message")
            .licenseKeyActivationsLimit(0L)
            .licenseKeyDuration(
                ProductUpdateParams.LicenseKeyDuration.builder()
                    .count(0L)
                    .interval(ProductUpdateParams.LicenseKeyDuration.Interval.DAY)
                    .build()
            )
            .licenseKeyEnabled(true)
            .name("name")
            .price(
                ProductUpdateParams.Price.OneTimePrice.builder()
                    .currency(ProductUpdateParams.Price.OneTimePrice.Currency.AED)
                    .discount(0.0)
                    .price(0L)
                    .purchasingPowerParity(true)
                    .type(ProductUpdateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                    .payWhatYouWant(true)
                    .suggestedPrice(0L)
                    .taxInclusive(true)
                    .build()
            )
            .taxCategory(ProductUpdateParams.TaxCategory.DIGITAL_PRODUCTS)
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductUpdateParams.builder()
                .id("id")
                .description("description")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0L)
                .licenseKeyDuration(
                    ProductUpdateParams.LicenseKeyDuration.builder()
                        .count(0L)
                        .interval(ProductUpdateParams.LicenseKeyDuration.Interval.DAY)
                        .build()
                )
                .licenseKeyEnabled(true)
                .name("name")
                .price(
                    ProductUpdateParams.Price.OneTimePrice.builder()
                        .currency(ProductUpdateParams.Price.OneTimePrice.Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(ProductUpdateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0L)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(ProductUpdateParams.TaxCategory.DIGITAL_PRODUCTS)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.imageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.licenseKeyActivationMessage()).isEqualTo("license_key_activation_message")
        assertThat(body.licenseKeyActivationsLimit()).isEqualTo(0L)
        assertThat(body.licenseKeyDuration())
            .isEqualTo(
                ProductUpdateParams.LicenseKeyDuration.builder()
                    .count(0L)
                    .interval(ProductUpdateParams.LicenseKeyDuration.Interval.DAY)
                    .build()
            )
        assertThat(body.licenseKeyEnabled()).isEqualTo(true)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.price())
            .isEqualTo(
                ProductUpdateParams.Price.ofOneTime(
                    ProductUpdateParams.Price.OneTimePrice.builder()
                        .currency(ProductUpdateParams.Price.OneTimePrice.Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(ProductUpdateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0L)
                        .taxInclusive(true)
                        .build()
                )
            )
        assertThat(body.taxCategory()).isEqualTo(ProductUpdateParams.TaxCategory.DIGITAL_PRODUCTS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductUpdateParams.builder().id("id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = ProductUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
