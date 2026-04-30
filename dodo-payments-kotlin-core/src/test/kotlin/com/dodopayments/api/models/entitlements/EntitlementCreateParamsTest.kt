// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCreateParamsTest {

    @Test
    fun create() {
        EntitlementCreateParams.builder()
            .integrationConfig(
                EntitlementCreateParams.IntegrationConfig.GitHubConfig.builder()
                    .permission("permission")
                    .targetId("target_id")
                    .build()
            )
            .integrationType(EntitlementCreateParams.IntegrationType.DISCORD)
            .name("name")
            .description("description")
            .metadata(
                EntitlementCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EntitlementCreateParams.builder()
                .integrationConfig(
                    EntitlementCreateParams.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementCreateParams.IntegrationType.DISCORD)
                .name("name")
                .description("description")
                .metadata(
                    EntitlementCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.integrationConfig())
            .isEqualTo(
                EntitlementCreateParams.IntegrationConfig.ofGitHub(
                    EntitlementCreateParams.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(body.integrationType())
            .isEqualTo(EntitlementCreateParams.IntegrationType.DISCORD)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata())
            .isEqualTo(
                EntitlementCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntitlementCreateParams.builder()
                .integrationConfig(
                    EntitlementCreateParams.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
                .integrationType(EntitlementCreateParams.IntegrationType.DISCORD)
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.integrationConfig())
            .isEqualTo(
                EntitlementCreateParams.IntegrationConfig.ofGitHub(
                    EntitlementCreateParams.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(body.integrationType())
            .isEqualTo(EntitlementCreateParams.IntegrationType.DISCORD)
        assertThat(body.name()).isEqualTo("name")
    }
}
