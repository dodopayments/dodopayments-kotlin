// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.licenses.LicenseActivateParams
import com.dodopayments.api.models.licenses.LicenseDeactivateParams
import com.dodopayments.api.models.licenses.LicenseValidateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseServiceAsyncTest {

    @Test
    suspend fun activate() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val licenseKeyInstance =
            licenseServiceAsync.activate(
                LicenseActivateParams.builder().licenseKey("license_key").name("name").build()
            )

        licenseKeyInstance.validate()
    }

    @Test
    suspend fun deactivate() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        licenseServiceAsync.deactivate(
            LicenseDeactivateParams.builder()
                .licenseKey("license_key")
                .licenseKeyInstanceId("license_key_instance_id")
                .build()
        )
    }

    @Test
    suspend fun validate() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val response =
            licenseServiceAsync.validate(
                LicenseValidateParams.builder()
                    .licenseKey("2b1f8e2d-c41e-4e8f-b2d3-d9fd61c38f43")
                    .licenseKeyInstanceId("lki_123")
                    .build()
            )

        response.validate()
    }
}
