// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.brands.BrandCreateParams
import com.dodopayments.api.models.brands.BrandUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandService = client.brands()

        val brand =
            brandService.create(
                BrandCreateParams.builder()
                    .description("description")
                    .name("name")
                    .statementDescriptor("statement_descriptor")
                    .supportEmail("support_email")
                    .url("url")
                    .build()
            )

        brand.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandService = client.brands()

        val brand = brandService.retrieve("id")

        brand.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandService = client.brands()

        val brand =
            brandService.update(
                BrandUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .statementDescriptor("statement_descriptor")
                    .supportEmail("support_email")
                    .url("url")
                    .build()
            )

        brand.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandService = client.brands()

        val brands = brandService.list()

        brands.validate()
    }

    @Test
    fun updateImages() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandService = client.brands()

        val response = brandService.updateImages("id")

        response.validate()
    }
}
