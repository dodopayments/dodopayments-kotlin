// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementRetrieveResponseTest {

    @Test
    fun create() {
        val entitlementRetrieveResponse =
            EntitlementRetrieveResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    EntitlementRetrieveResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementRetrieveResponse.IntegrationType.DISCORD)
                .isActive(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(entitlementRetrieveResponse.id()).isEqualTo("id")
        assertThat(entitlementRetrieveResponse.businessId()).isEqualTo("business_id")
        assertThat(entitlementRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementRetrieveResponse.integrationConfig())
            .isEqualTo(
                EntitlementRetrieveResponse.IntegrationConfig.ofGitHub(
                    EntitlementRetrieveResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(entitlementRetrieveResponse.integrationType())
            .isEqualTo(EntitlementRetrieveResponse.IntegrationType.DISCORD)
        assertThat(entitlementRetrieveResponse.isActive()).isEqualTo(true)
        assertThat(entitlementRetrieveResponse.name()).isEqualTo("name")
        assertThat(entitlementRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementRetrieveResponse.description()).isEqualTo("description")
        assertThat(entitlementRetrieveResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementRetrieveResponse =
            EntitlementRetrieveResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    EntitlementRetrieveResponse.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementRetrieveResponse.IntegrationType.DISCORD)
                .isActive(true)
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedEntitlementRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementRetrieveResponse),
                jacksonTypeRef<EntitlementRetrieveResponse>(),
            )

        assertThat(roundtrippedEntitlementRetrieveResponse).isEqualTo(entitlementRetrieveResponse)
    }
}
