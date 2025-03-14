// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LicenseKeyInstanceServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceServiceAsync = client.licenseKeyInstances()

        val licenseKeyInstance =
            licenseKeyInstanceServiceAsync.retrieve(
                LicenseKeyInstanceRetrieveParams.builder().id("lki_123").build()
            )

        licenseKeyInstance.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceServiceAsync = client.licenseKeyInstances()

        val licenseKeyInstance =
            licenseKeyInstanceServiceAsync.update(
                LicenseKeyInstanceUpdateParams.builder().id("lki_123").name("name").build()
            )

        licenseKeyInstance.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val licenseKeyInstanceServiceAsync = client.licenseKeyInstances()

        val licenseKeyInstances =
            licenseKeyInstanceServiceAsync.list(
                LicenseKeyInstanceListParams.builder()
                    .licenseKeyId("license_key_id")
                    .pageNumber(0L)
                    .pageSize(0L)
                    .build()
            )

        licenseKeyInstances.forEach { it.validate() }
    }
}
