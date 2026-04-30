// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCreateResponseTest {

    @Test
    fun create() {
        val entitlementCreateResponse =
            EntitlementCreateResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    EntitlementCreateResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementCreateResponse.IntegrationType.DISCORD)
                .isActive(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(entitlementCreateResponse.id()).isEqualTo("id")
        assertThat(entitlementCreateResponse.businessId()).isEqualTo("business_id")
        assertThat(entitlementCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementCreateResponse.integrationConfig())
            .isEqualTo(
                EntitlementCreateResponse.IntegrationConfig.ofGitHub(
                    EntitlementCreateResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(entitlementCreateResponse.integrationType())
            .isEqualTo(EntitlementCreateResponse.IntegrationType.DISCORD)
        assertThat(entitlementCreateResponse.isActive()).isEqualTo(true)
        assertThat(entitlementCreateResponse.name()).isEqualTo("name")
        assertThat(entitlementCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementCreateResponse.description()).isEqualTo("description")
        assertThat(entitlementCreateResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementCreateResponse =
            EntitlementCreateResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    EntitlementCreateResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementCreateResponse.IntegrationType.DISCORD)
                .isActive(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedEntitlementCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementCreateResponse),
                jacksonTypeRef<EntitlementCreateResponse>(),
            )

        assertThat(roundtrippedEntitlementCreateResponse).isEqualTo(entitlementCreateResponse)
    }
}
