// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.entitlements.EntitlementCreateParams
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.EntitlementUpdateParams
import com.dodopayments.api.models.entitlements.GitHubPermission
import com.dodopayments.api.models.entitlements.IntegrationConfig
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntitlementServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementServiceAsync = client.entitlements()

        val entitlement =
            entitlementServiceAsync.create(
                EntitlementCreateParams.builder()
                    .integrationConfig(
                        IntegrationConfig.GitHubConfig.builder()
                            .permission(GitHubPermission.PULL)
                            .targetId("target_id")
                            .build()
                    )
                    .integrationType(EntitlementIntegrationType.DISCORD)
                    .name("name")
                    .description("description")
                    .metadata(
                        EntitlementCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        entitlement.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementServiceAsync = client.entitlements()

        val entitlement = entitlementServiceAsync.retrieve("id")

        entitlement.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementServiceAsync = client.entitlements()

        val entitlement =
            entitlementServiceAsync.update(
                EntitlementUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .integrationConfig(
                        IntegrationConfig.GitHubConfig.builder()
                            .permission(GitHubPermission.PULL)
                            .targetId("target_id")
                            .build()
                    )
                    .metadata(
                        EntitlementUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        entitlement.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementServiceAsync = client.entitlements()

        val page = entitlementServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementServiceAsync = client.entitlements()

        entitlementServiceAsync.delete("id")
    }
}
