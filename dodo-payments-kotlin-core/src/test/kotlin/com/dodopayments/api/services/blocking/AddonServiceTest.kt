// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.addons.AddonCreateParams
import com.dodopayments.api.models.addons.AddonRetrieveParams
import com.dodopayments.api.models.addons.AddonUpdateImagesParams
import com.dodopayments.api.models.addons.AddonUpdateParams
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AddonServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.addons()

        val addonResponse =
            addonService.create(
                AddonCreateParams.builder()
                    .currency(Currency.AED)
                    .name("name")
                    .price(0L)
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .description("description")
                    .build()
            )

        addonResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.addons()

        val addonResponse = addonService.retrieve(AddonRetrieveParams.builder().id("id").build())

        addonResponse.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.addons()

        val addonResponse =
            addonService.update(
                AddonUpdateParams.builder()
                    .id("id")
                    .currency(Currency.AED)
                    .description("description")
                    .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .price(0L)
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .build()
            )

        addonResponse.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.addons()

        val page = addonService.list()

        page.response().validate()
    }

    @Test
    fun updateImages() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val addonService = client.addons()

        val response = addonService.updateImages(AddonUpdateImagesParams.builder().id("id").build())

        response.validate()
    }
}
