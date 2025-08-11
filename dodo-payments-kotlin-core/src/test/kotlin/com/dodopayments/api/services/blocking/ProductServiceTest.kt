// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.products.LicenseKeyDuration
import com.dodopayments.api.models.products.Price
import com.dodopayments.api.models.products.ProductCreateParams
import com.dodopayments.api.models.products.ProductUpdateFilesParams
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProductServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.products()

        val product =
            productService.create(
                ProductCreateParams.builder()
                    .price(
                        Price.OneTimePrice.builder()
                            .currency(Currency.AED)
                            .discount(0.0f)
                            .price(0)
                            .purchasingPowerParity(true)
                            .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                            .payWhatYouWant(true)
                            .suggestedPrice(0)
                            .taxInclusive(true)
                            .build()
                    )
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .addAddon("string")
                    .brandId("brand_id")
                    .description("description")
                    .digitalProductDelivery(
                        ProductCreateParams.DigitalProductDelivery.builder()
                            .externalUrl("external_url")
                            .instructions("instructions")
                            .build()
                    )
                    .licenseKeyActivationMessage("license_key_activation_message")
                    .licenseKeyActivationsLimit(0)
                    .licenseKeyDuration(
                        LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
                    )
                    .licenseKeyEnabled(true)
                    .metadata(
                        ProductCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        product.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.products()

        val product = productService.retrieve("id")

        product.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.products()

        productService.update(
            ProductUpdateParams.builder()
                .id("id")
                .addAddon("string")
                .brandId("brand_id")
                .description("description")
                .digitalProductDelivery(
                    ProductUpdateParams.DigitalProductDelivery.builder()
                        .externalUrl("external_url")
                        .addFile("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .instructions("instructions")
                        .build()
                )
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0)
                .licenseKeyDuration(
                    LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
                )
                .licenseKeyEnabled(true)
                .metadata(
                    ProductUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .price(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0.0f)
                        .price(0)
                        .purchasingPowerParity(true)
                        .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                        .payWhatYouWant(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.products()

        val page = productService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.products()

        productService.delete("id")
    }

    @Test
    fun unarchive() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.products()

        productService.unarchive("id")
    }

    @Test
    fun updateFiles() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productService = client.products()

        val response =
            productService.updateFiles(
                ProductUpdateFilesParams.builder().id("id").fileName("file_name").build()
            )

        response.validate()
    }
}
