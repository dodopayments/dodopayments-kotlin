// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.appinstallation

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppInstallationRetrieveSettingsResponseTest {

    @Test
    fun create() {
        val appInstallationRetrieveSettingsResponse =
            AppInstallationRetrieveSettingsResponse.builder()
                .actionNeeded(true)
                .appId("app_id")
                .installationId("installation_id")
                .addInvalidKey("string")
                .secrets(JsonValue.from(mapOf<String, Any>()))
                .values(JsonValue.from(mapOf<String, Any>()))
                .liveManifestVersion(0)
                .manifestVersion(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(appInstallationRetrieveSettingsResponse.actionNeeded()).isEqualTo(true)
        assertThat(appInstallationRetrieveSettingsResponse.appId()).isEqualTo("app_id")
        assertThat(appInstallationRetrieveSettingsResponse.installationId())
            .isEqualTo("installation_id")
        assertThat(appInstallationRetrieveSettingsResponse.invalidKeys()).containsExactly("string")
        assertThat(appInstallationRetrieveSettingsResponse._secrets())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(appInstallationRetrieveSettingsResponse._values())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(appInstallationRetrieveSettingsResponse.liveManifestVersion()).isEqualTo(0)
        assertThat(appInstallationRetrieveSettingsResponse.manifestVersion()).isEqualTo(0)
        assertThat(appInstallationRetrieveSettingsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appInstallationRetrieveSettingsResponse =
            AppInstallationRetrieveSettingsResponse.builder()
                .actionNeeded(true)
                .appId("app_id")
                .installationId("installation_id")
                .addInvalidKey("string")
                .secrets(JsonValue.from(mapOf<String, Any>()))
                .values(JsonValue.from(mapOf<String, Any>()))
                .liveManifestVersion(0)
                .manifestVersion(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAppInstallationRetrieveSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appInstallationRetrieveSettingsResponse),
                jacksonTypeRef<AppInstallationRetrieveSettingsResponse>(),
            )

        assertThat(roundtrippedAppInstallationRetrieveSettingsResponse)
            .isEqualTo(appInstallationRetrieveSettingsResponse)
    }
}
