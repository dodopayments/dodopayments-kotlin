// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.licensekeys.LicenseKeyListParams
import com.dodopayments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.dodopayments.api.models.licensekeys.LicenseKeyUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LicenseKeyServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyServiceAsync = client.licenseKeys()

        val licenseKey =
            licenseKeyServiceAsync.retrieve(
                LicenseKeyRetrieveParams.builder().id("lic_123").build()
            )

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
                    .id("lic_123")
                    .activationsLimit(0L)
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

        val licenseKeys =
            licenseKeyServiceAsync.list(
                LicenseKeyListParams.builder()
                    .customerId("customer_id")
                    .pageNumber(0L)
                    .pageSize(0L)
                    .productId("product_id")
                    .status(LicenseKeyStatus.ACTIVE)
                    .build()
            )

        licenseKeys.forEach { it.validate() }
    }
}
