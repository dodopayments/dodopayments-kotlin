// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseKeyInstanceServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
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
                .apiKey("My API Key")
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
                .apiKey("My API Key")
                .build()
        val licenseKeyInstanceServiceAsync = client.licenseKeyInstances()

        val page = licenseKeyInstanceServiceAsync.list()

        page.response().validate()
    }
}
