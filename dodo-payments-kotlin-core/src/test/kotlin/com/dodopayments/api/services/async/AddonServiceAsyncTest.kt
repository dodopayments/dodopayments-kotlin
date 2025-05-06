// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.addons.AddonCreateParams
import com.dodopayments.api.models.addons.AddonRetrieveParams
import com.dodopayments.api.models.addons.AddonUpdateImagesParams
import com.dodopayments.api.models.addons.AddonUpdateParams
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AddonServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val addonResponse =
            addonServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val addonResponse =
            addonServiceAsync.retrieve(AddonRetrieveParams.builder().id("id").build())

        addonResponse.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val addonResponse =
            addonServiceAsync.update(
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
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val page = addonServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun updateImages() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val addonServiceAsync = client.addons()

        val response =
            addonServiceAsync.updateImages(AddonUpdateImagesParams.builder().id("id").build())

        response.validate()
    }
}
