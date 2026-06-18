// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.entitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.entitlements.grants.GrantRevokeParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GrantServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val grantServiceAsync = client.entitlements().grants()

        val page = grantServiceAsync.list("ent_jt7jcvI79Xh8eehqgWdcm")

        page.response().validate()
    }

    @Test
    suspend fun revoke() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val grantServiceAsync = client.entitlements().grants()

        val entitlementGrant =
            grantServiceAsync.revoke(
                GrantRevokeParams.builder()
                    .id("ent_jt7jcvI79Xh8eehqgWdcm")
                    .grantId("entg_w0ZCJZgNXuNDdMVzvja6p")
                    .build()
            )

        entitlementGrant.validate()
    }
}
