// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductUpdateParamsTest {

    @Test
    fun create() {
        ProductUpdateParams.builder()
            .id("id")
            .addAddon("string")
            .description("description")
            .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .licenseKeyActivationMessage("license_key_activation_message")
            .licenseKeyActivationsLimit(0L)
            .licenseKeyDuration(
                LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build()
            )
            .licenseKeyEnabled(true)
            .name("name")
            .price(
                Price.OneTimePrice.builder()
                    .currency(Currency.AED)
                    .discount(0.0)
                    .price(0L)
                    .purchasingPowerParity(true)
                    .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                    .payWhatYouWant(true)
                    .suggestedPrice(0L)
                    .taxInclusive(true)
                    .build()
            )
            .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProductUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProductUpdateParams.builder()
                .id("id")
                .addAddon("string")
                .description("description")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0L)
                .licenseKeyDuration(
                    LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build()
                )
                .licenseKeyEnabled(true)
                .name("name")
                .price(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0.0)
                        .price(0L)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0L)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .build()

        val body = params._body()

        assertThat(body.addons()).containsExactly("string")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.imageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.licenseKeyActivationMessage()).isEqualTo("license_key_activation_message")
        assertThat(body.licenseKeyActivationsLimit()).isEqualTo(0L)
        assertThat(body.licenseKeyDuration())
            .isEqualTo(LicenseKeyDuration.builder().count(0L).interval(TimeInterval.DAY).build())
        assertThat(body.licenseKeyEnabled()).isEqualTo(true)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.price())
            .isEqualTo(
                Price.ofOneTime(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
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
        assertThat(body.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProductUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
