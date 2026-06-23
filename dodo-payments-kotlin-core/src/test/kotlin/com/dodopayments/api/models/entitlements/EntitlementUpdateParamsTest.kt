// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.Metadata
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementUpdateParamsTest {

    @Test
    fun create() {
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
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = EntitlementUpdateParams.builder().id("ent_jt7jcvI79Xh8eehqgWdcm").build()

        assertThat(params._pathParam(0)).isEqualTo("ent_jt7jcvI79Xh8eehqgWdcm")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.integrationConfig())
            .isEqualTo(
                IntegrationConfig.ofGitHub(
                    IntegrationConfig.GitHubConfig.builder()
                        .permission(GitHubPermission.PULL)
                        .targetId("target_id")
                        .build()
                )
            )
        assertThat(body.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EntitlementUpdateParams.builder().id("ent_jt7jcvI79Xh8eehqgWdcm").build()

        val body = params._body()
    }
}
