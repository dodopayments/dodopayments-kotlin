// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementTest {

    @Test
    fun create() {
        val entitlement =
            Entitlement.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    IntegrationConfigResponse.FeatureFlagConfig.builder()
                        .featureId("feature_id")
                        .featureType(FeatureType.BOOLEAN)
                        .build()
                )
                .integrationType(EntitlementIntegrationType.DISCORD)
                .isActive(true)
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .build()

        assertThat(entitlement.id()).isEqualTo("id")
        assertThat(entitlement.businessId()).isEqualTo("business_id")
        assertThat(entitlement.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlement.integrationConfig())
            .isEqualTo(
                IntegrationConfigResponse.ofFeatureFlagConfig(
                    IntegrationConfigResponse.FeatureFlagConfig.builder()
                        .featureId("feature_id")
                        .featureType(FeatureType.BOOLEAN)
                        .build()
                )
            )
        assertThat(entitlement.integrationType()).isEqualTo(EntitlementIntegrationType.DISCORD)
        assertThat(entitlement.isActive()).isEqualTo(true)
        assertThat(entitlement.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(entitlement.name()).isEqualTo("name")
        assertThat(entitlement.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlement.description()).isEqualTo("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlement =
            Entitlement.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfig(
                    IntegrationConfigResponse.FeatureFlagConfig.builder()
                        .featureId("feature_id")
                        .featureType(FeatureType.BOOLEAN)
                        .build()
                )
                .integrationType(EntitlementIntegrationType.DISCORD)
                .isActive(true)
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .build()

        val roundtrippedEntitlement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlement),
                jacksonTypeRef<Entitlement>(),
            )

        assertThat(roundtrippedEntitlement).isEqualTo(entitlement)
    }
}
