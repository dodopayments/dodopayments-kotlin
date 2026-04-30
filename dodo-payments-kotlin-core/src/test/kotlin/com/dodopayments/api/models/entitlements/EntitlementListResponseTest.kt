// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementListResponseTest {

    @Test
    fun create() {
        val entitlementListResponse =
            EntitlementListResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    EntitlementListResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementListResponse.IntegrationType.DISCORD)
                .isActive(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(entitlementListResponse.id()).isEqualTo("id")
        assertThat(entitlementListResponse.businessId()).isEqualTo("business_id")
        assertThat(entitlementListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementListResponse.integrationConfig())
            .isEqualTo(
                EntitlementListResponse.IntegrationConfig.ofGitHub(
                    EntitlementListResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(entitlementListResponse.integrationType())
            .isEqualTo(EntitlementListResponse.IntegrationType.DISCORD)
        assertThat(entitlementListResponse.isActive()).isEqualTo(true)
        assertThat(entitlementListResponse.name()).isEqualTo("name")
        assertThat(entitlementListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementListResponse.description()).isEqualTo("description")
        assertThat(entitlementListResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementListResponse =
            EntitlementListResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    EntitlementListResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementListResponse.IntegrationType.DISCORD)
                .isActive(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedEntitlementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementListResponse),
                jacksonTypeRef<EntitlementListResponse>(),
            )

        assertThat(roundtrippedEntitlementListResponse).isEqualTo(entitlementListResponse)
    }
}
