// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LicenseKeyInstanceServiceTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceService = client.licenseKeyInstances()

        val licenseKeyInstance =
            licenseKeyInstanceService.retrieve(
                LicenseKeyInstanceRetrieveParams.builder().id("lki_123").build()
            )

        licenseKeyInstance.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceService = client.licenseKeyInstances()

        val licenseKeyInstance =
            licenseKeyInstanceService.update(
                LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()
            )

        licenseKeyInstance.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceService = client.licenseKeyInstances()

        val licenseKeyInstances =
            licenseKeyInstanceService.list(
                LicenseKeyInstanceListParams.builder()
                    .licenseKeyId("license_key_id")
                    .pageNumber(0L)
                    .pageSize(0L)
                    .build()
            )

        licenseKeyInstances.forEach { it.validate() }
    }
}
