// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.entitlements.EntitlementCreateParams
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.EntitlementUpdateParams
import com.dodopayments.api.models.entitlements.GitHubPermission
import com.dodopayments.api.models.entitlements.IntegrationConfig
import com.dodopayments.api.models.misc.Metadata
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntitlementServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementService = client.entitlements()

        val entitlement =
            entitlementService.create(
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
                        Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        entitlement.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementService = client.entitlements()

        val entitlement = entitlementService.retrieve("ent_jt7jcvI79Xh8eehqgWdcm")

        entitlement.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementService = client.entitlements()

        val entitlement =
            entitlementService.update(
                EntitlementUpdateParams.builder()
                    .id("ent_jt7jcvI79Xh8eehqgWdcm")
                    .description("description")
                    .integrationConfig(
                        IntegrationConfig.GitHubConfig.builder()
                            .permission(GitHubPermission.PULL)
                            .targetId("target_id")
                            .build()
                    )
                    .metadata(
                        Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        entitlement.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementService = client.entitlements()

        val page = entitlementService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entitlementService = client.entitlements()

        entitlementService.delete("ent_jt7jcvI79Xh8eehqgWdcm")
    }
}
