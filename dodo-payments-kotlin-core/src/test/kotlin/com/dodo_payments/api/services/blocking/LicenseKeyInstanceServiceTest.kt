// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
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
