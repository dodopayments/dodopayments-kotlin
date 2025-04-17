// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.licenses.LicenseActivateParams
import com.dodopayments.api.models.licenses.LicenseDeactivateParams
import com.dodopayments.api.models.licenses.LicenseValidateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LicenseServiceTest {

    @Test
    fun activate() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseService = client.licenses()

        val licenseKeyInstance =
            licenseService.activate(
                LicenseActivateParams.builder().licenseKey("license_key").name("name").build()
            )

        licenseKeyInstance.validate()
    }

    @Test
    fun deactivate() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseService = client.licenses()

        licenseService.deactivate(
            LicenseDeactivateParams.builder()
                .licenseKey("license_key")
                .licenseKeyInstanceId("license_key_instance_id")
                .build()
        )
    }

    @Test
    fun validate() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseService = client.licenses()

        val response =
            licenseService.validate(
                LicenseValidateParams.builder()
                    .licenseKey("2b1f8e2d-c41e-4e8f-b2d3-d9fd61c38f43")
                    .licenseKeyInstanceId("lki_123")
                    .build()
            )

        response.validate()
    }
}
