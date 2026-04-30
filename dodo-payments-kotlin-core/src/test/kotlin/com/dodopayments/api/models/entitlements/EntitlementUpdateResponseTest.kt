// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementUpdateResponseTest {

    @Test
    fun create() {
        val entitlementUpdateResponse =
            EntitlementUpdateResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    EntitlementUpdateResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementUpdateResponse.IntegrationType.DISCORD)
                .isActive(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(entitlementUpdateResponse.id()).isEqualTo("id")
        assertThat(entitlementUpdateResponse.businessId()).isEqualTo("business_id")
        assertThat(entitlementUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementUpdateResponse.integrationConfig())
            .isEqualTo(
                EntitlementUpdateResponse.IntegrationConfig.ofGitHub(
                    EntitlementUpdateResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(entitlementUpdateResponse.integrationType())
            .isEqualTo(EntitlementUpdateResponse.IntegrationType.DISCORD)
        assertThat(entitlementUpdateResponse.isActive()).isEqualTo(true)
        assertThat(entitlementUpdateResponse.name()).isEqualTo("name")
        assertThat(entitlementUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementUpdateResponse.description()).isEqualTo("description")
        assertThat(entitlementUpdateResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementUpdateResponse =
            EntitlementUpdateResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    EntitlementUpdateResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementUpdateResponse.IntegrationType.DISCORD)
                .isActive(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedEntitlementUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementUpdateResponse),
                jacksonTypeRef<EntitlementUpdateResponse>(),
            )

        assertThat(roundtrippedEntitlementUpdateResponse).isEqualTo(entitlementUpdateResponse)
    }
}
