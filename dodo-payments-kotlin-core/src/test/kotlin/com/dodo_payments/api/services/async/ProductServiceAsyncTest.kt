// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.products.ProductCreateParams
import com.dodo_payments.api.models.products.ProductDeleteParams
import com.dodo_payments.api.models.products.ProductRetrieveParams
import com.dodo_payments.api.models.products.ProductUnarchiveParams
import com.dodo_payments.api.models.products.ProductUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProductServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val product =
            productServiceAsync.create(
                ProductCreateParams.builder()
                    .price(
                        ProductCreateParams.Price.OneTimePrice.builder()
                            .currency(ProductCreateParams.Price.OneTimePrice.Currency.AED)
                            .discount(0.0)
                            .price(0L)
                            .purchasingPowerParity(true)
                            .type(ProductCreateParams.Price.OneTimePrice.Type.ONE_TIME_PRICE)
                            .payWhatYouWant(true)
                            .suggestedPrice(0L)
                            .taxInclusive(true)
                            .build()
                    )
                    .taxCategory(ProductCreateParams.TaxCategory.DIGITAL_PRODUCTS)
                    .description("description")
                    .licenseKeyActivationMessage("license_key_activation_message")
                    .licenseKeyActivationsLimit(0L)
                    .licenseKeyDuration(
                        ProductCreateParams.LicenseKeyDuration.builder()
                            .count(0L)
                            .interval(ProductCreateParams.LicenseKeyDuration.Interval.DAY)
                            .build()
                    )
                    .licenseKeyEnabled(true)
                    .name("name")
                    .build()
            )

        product.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val product = productServiceAsync.retrieve(ProductRetrieveParams.builder().id("id").build())

        product.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        productServiceAsync.update(
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
        )
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        val page = productServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        productServiceAsync.delete(ProductDeleteParams.builder().id("id").build())
    }

    @Test
    suspend fun unarchive() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productServiceAsync = client.products()

        productServiceAsync.unarchive(ProductUnarchiveParams.builder().id("id").build())
    }
}
