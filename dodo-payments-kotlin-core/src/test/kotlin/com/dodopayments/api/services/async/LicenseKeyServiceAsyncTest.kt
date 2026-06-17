// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.licensekeys.LicenseKeyCreateParams
import com.dodopayments.api.models.licensekeys.LicenseKeyUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseKeyServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyServiceAsync = client.licenseKeys()

        val licenseKey =
            licenseKeyServiceAsync.create(
                LicenseKeyCreateParams.builder()
                    .customerId("customer_id")
                    .key("key")
                    .productId("product_id")
                    .activationsLimit(0)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        licenseKey.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyServiceAsync = client.licenseKeys()

        val licenseKey = licenseKeyServiceAsync.retrieve("lic_7namTC0VcgrnzrF3GTSwB")

        licenseKey.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyServiceAsync = client.licenseKeys()

        val licenseKey =
            licenseKeyServiceAsync.update(
                LicenseKeyUpdateParams.builder()
                    .id("lic_7namTC0VcgrnzrF3GTSwB")
                    .activationsLimit(0)
                    .disabled(true)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        licenseKey.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyServiceAsync = client.licenseKeys()

        val page = licenseKeyServiceAsync.list()

        page.response().validate()
    }
}
