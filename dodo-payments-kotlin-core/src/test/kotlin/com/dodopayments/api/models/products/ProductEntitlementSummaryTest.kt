// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.GitHubPermission
import com.dodopayments.api.models.entitlements.IntegrationConfigResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductEntitlementSummaryTest {

    @Test
    fun create() {
        val productEntitlementSummary =
            ProductEntitlementSummary.builder()
                .id("id")
                .integrationConfig(
                    IntegrationConfigResponse.GitHubConfig.builder()
                        .permission(GitHubPermission.PULL)
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementIntegrationType.DISCORD)
                .name("name")
                .description("description")
                .build()

        assertThat(productEntitlementSummary.id()).isEqualTo("id")
        assertThat(productEntitlementSummary.integrationConfig())
            .isEqualTo(
                IntegrationConfigResponse.ofGitHubConfig(
                    IntegrationConfigResponse.GitHubConfig.builder()
                        .permission(GitHubPermission.PULL)
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(productEntitlementSummary.integrationType())
            .isEqualTo(EntitlementIntegrationType.DISCORD)
        assertThat(productEntitlementSummary.name()).isEqualTo("name")
        assertThat(productEntitlementSummary.description()).isEqualTo("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productEntitlementSummary =
            ProductEntitlementSummary.builder()
                .id("id")
                .integrationConfig(
                    IntegrationConfigResponse.GitHubConfig.builder()
                        .permission(GitHubPermission.PULL)
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementIntegrationType.DISCORD)
                .name("name")
                .description("description")
                .build()

        val roundtrippedProductEntitlementSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productEntitlementSummary),
                jacksonTypeRef<ProductEntitlementSummary>(),
            )

        assertThat(roundtrippedProductEntitlementSummary).isEqualTo(productEntitlementSummary)
    }
}
