// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementUpdateParamsTest {

    @Test
    fun create() {
        EntitlementUpdateParams.builder()
            .id("id")
            .description("description")
            .integrationConfig(
                EntitlementUpdateParams.IntegrationConfig.GitHubConfig.builder()
                    .permission("permission")
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
    }

    @Test
    fun pathParams() {
        val params = EntitlementUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EntitlementUpdateParams.builder()
                .id("id")
                .description("description")
                .integrationConfig(
                    EntitlementUpdateParams.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
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

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.integrationConfig())
            .isEqualTo(
                EntitlementUpdateParams.IntegrationConfig.ofGitHub(
                    EntitlementUpdateParams.IntegrationConfig.GitHubConfig.builder()
                        .permission("permission")
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(body.metadata())
            .isEqualTo(
                EntitlementUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EntitlementUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
