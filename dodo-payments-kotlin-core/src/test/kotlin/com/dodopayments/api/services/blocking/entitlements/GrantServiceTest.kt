// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.entitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.entitlements.grants.GrantFulfillLicenseKeyParams
import com.dodopayments.api.models.entitlements.grants.GrantRevokeParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GrantServiceTest {

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val grantService = client.entitlements().grants()

        val page = grantService.list("ent_jt7jcvI79Xh8eehqgWdcm")

        page.response().validate()
    }

    @Test
    fun fulfillLicenseKey() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val grantService = client.entitlements().grants()

        val entitlementGrant =
            grantService.fulfillLicenseKey(
                GrantFulfillLicenseKeyParams.builder()
                    .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
                    .key("key")
                    .activationsLimit(0)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        entitlementGrant.validate()
    }

    @Test
    fun revoke() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val grantService = client.entitlements().grants()

        val entitlementGrant =
            grantService.revoke(
                GrantRevokeParams.builder()
                    .id("ent_jt7jcvI79Xh8eehqgWdcm")
                    .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
                    .build()
            )

        entitlementGrant.validate()
    }
}
