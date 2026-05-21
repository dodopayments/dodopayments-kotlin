// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementListPageResponseTest {

    @Test
    fun create() {
        val entitlementListPageResponse =
            EntitlementListPageResponse.builder()
                .addItem(
                    Entitlement.builder()
                        .id("id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .integrationConfig(
                            IntegrationConfigResponse.GitHubConfig.builder()
                                .permission(GitHubPermission.PULL)
                                .targetId("target_id")
                                .build()
                        )
                        .integrationType(EntitlementIntegrationType.DISCORD)
                        .isActive(true)
                        .metadata(
                            Entitlement.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .build()
                )
                .build()

        assertThat(entitlementListPageResponse.items())
            .containsExactly(
                Entitlement.builder()
                    .id("id")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .integrationConfig(
                        IntegrationConfigResponse.GitHubConfig.builder()
                            .permission(GitHubPermission.PULL)
                            .targetId("target_id")
                            .build()
                    )
                    .integrationType(EntitlementIntegrationType.DISCORD)
                    .isActive(true)
                    .metadata(
                        Entitlement.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementListPageResponse =
            EntitlementListPageResponse.builder()
                .addItem(
                    Entitlement.builder()
                        .id("id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .integrationConfig(
                            IntegrationConfigResponse.GitHubConfig.builder()
                                .permission(GitHubPermission.PULL)
                                .targetId("target_id")
                                .build()
                        )
                        .integrationType(EntitlementIntegrationType.DISCORD)
                        .isActive(true)
                        .metadata(
                            Entitlement.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedEntitlementListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementListPageResponse),
                jacksonTypeRef<EntitlementListPageResponse>(),
            )

        assertThat(roundtrippedEntitlementListPageResponse).isEqualTo(entitlementListPageResponse)
    }
}
