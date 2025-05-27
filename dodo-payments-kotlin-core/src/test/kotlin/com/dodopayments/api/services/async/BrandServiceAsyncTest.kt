// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.brands.BrandCreateParams
import com.dodopayments.api.models.brands.BrandUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val brand =
            brandServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val brand = brandServiceAsync.retrieve("id")

        brand.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val brand =
            brandServiceAsync.update(
                BrandUpdateParams.builder()
                    .id("id")
                    .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .statementDescriptor("statement_descriptor")
                    .supportEmail("support_email")
                    .build()
            )

        brand.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val brands = brandServiceAsync.list()

        brands.validate()
    }

    @Test
    suspend fun updateImages() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val brandServiceAsync = client.brands()

        val response = brandServiceAsync.updateImages("id")

        response.validate()
    }
}
