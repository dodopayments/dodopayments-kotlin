// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class IntegrationConfigTest {

    @Test
    fun ofGitHub() {
        val github =
            IntegrationConfig.GitHubConfig.builder()
                .permission("permission")
                .targetId("target_id")
                .build()

        val integrationConfig = IntegrationConfig.ofGitHub(github)

        assertThat(integrationConfig.github()).isEqualTo(github)
        assertThat(integrationConfig.discord()).isNull()
        assertThat(integrationConfig.telegram()).isNull()
        assertThat(integrationConfig.figma()).isNull()
        assertThat(integrationConfig.framer()).isNull()
        assertThat(integrationConfig.notion()).isNull()
        assertThat(integrationConfig.digitalFiles()).isNull()
        assertThat(integrationConfig.licenseKey()).isNull()
    }

    @Test
    fun ofGitHubRoundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfig =
            IntegrationConfig.ofGitHub(
                IntegrationConfig.GitHubConfig.builder()
                    .permission("permission")
                    .targetId("target_id")
                    .build()
            )

        val roundtrippedIntegrationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfig),
                jacksonTypeRef<IntegrationConfig>(),
            )

        assertThat(roundtrippedIntegrationConfig).isEqualTo(integrationConfig)
    }

    @Test
    fun ofDiscord() {
        val discord =
            IntegrationConfig.DiscordConfig.builder().guildId("guild_id").roleId("role_id").build()

        val integrationConfig = IntegrationConfig.ofDiscord(discord)

        assertThat(integrationConfig.github()).isNull()
        assertThat(integrationConfig.discord()).isEqualTo(discord)
        assertThat(integrationConfig.telegram()).isNull()
        assertThat(integrationConfig.figma()).isNull()
        assertThat(integrationConfig.framer()).isNull()
        assertThat(integrationConfig.notion()).isNull()
        assertThat(integrationConfig.digitalFiles()).isNull()
        assertThat(integrationConfig.licenseKey()).isNull()
    }

    @Test
    fun ofDiscordRoundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfig =
            IntegrationConfig.ofDiscord(
                IntegrationConfig.DiscordConfig.builder()
                    .guildId("guild_id")
                    .roleId("role_id")
                    .build()
            )

        val roundtrippedIntegrationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfig),
                jacksonTypeRef<IntegrationConfig>(),
            )

        assertThat(roundtrippedIntegrationConfig).isEqualTo(integrationConfig)
    }

    @Test
    fun ofTelegram() {
        val telegram = IntegrationConfig.TelegramConfig.builder().chatId("chat_id").build()

        val integrationConfig = IntegrationConfig.ofTelegram(telegram)

        assertThat(integrationConfig.github()).isNull()
        assertThat(integrationConfig.discord()).isNull()
        assertThat(integrationConfig.telegram()).isEqualTo(telegram)
        assertThat(integrationConfig.figma()).isNull()
        assertThat(integrationConfig.framer()).isNull()
        assertThat(integrationConfig.notion()).isNull()
        assertThat(integrationConfig.digitalFiles()).isNull()
        assertThat(integrationConfig.licenseKey()).isNull()
    }

    @Test
    fun ofTelegramRoundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfig =
            IntegrationConfig.ofTelegram(
                IntegrationConfig.TelegramConfig.builder().chatId("chat_id").build()
            )

        val roundtrippedIntegrationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfig),
                jacksonTypeRef<IntegrationConfig>(),
            )

        assertThat(roundtrippedIntegrationConfig).isEqualTo(integrationConfig)
    }

    @Test
    fun ofFigma() {
        val figma = IntegrationConfig.FigmaConfig.builder().figmaFileId("figma_file_id").build()

        val integrationConfig = IntegrationConfig.ofFigma(figma)

        assertThat(integrationConfig.github()).isNull()
        assertThat(integrationConfig.discord()).isNull()
        assertThat(integrationConfig.telegram()).isNull()
        assertThat(integrationConfig.figma()).isEqualTo(figma)
        assertThat(integrationConfig.framer()).isNull()
        assertThat(integrationConfig.notion()).isNull()
        assertThat(integrationConfig.digitalFiles()).isNull()
        assertThat(integrationConfig.licenseKey()).isNull()
    }

    @Test
    fun ofFigmaRoundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfig =
            IntegrationConfig.ofFigma(
                IntegrationConfig.FigmaConfig.builder().figmaFileId("figma_file_id").build()
            )

        val roundtrippedIntegrationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfig),
                jacksonTypeRef<IntegrationConfig>(),
            )

        assertThat(roundtrippedIntegrationConfig).isEqualTo(integrationConfig)
    }

    @Test
    fun ofFramer() {
        val framer =
            IntegrationConfig.FramerConfig.builder().framerTemplateId("framer_template_id").build()

        val integrationConfig = IntegrationConfig.ofFramer(framer)

        assertThat(integrationConfig.github()).isNull()
        assertThat(integrationConfig.discord()).isNull()
        assertThat(integrationConfig.telegram()).isNull()
        assertThat(integrationConfig.figma()).isNull()
        assertThat(integrationConfig.framer()).isEqualTo(framer)
        assertThat(integrationConfig.notion()).isNull()
        assertThat(integrationConfig.digitalFiles()).isNull()
        assertThat(integrationConfig.licenseKey()).isNull()
    }

    @Test
    fun ofFramerRoundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfig =
            IntegrationConfig.ofFramer(
                IntegrationConfig.FramerConfig.builder()
                    .framerTemplateId("framer_template_id")
                    .build()
            )

        val roundtrippedIntegrationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfig),
                jacksonTypeRef<IntegrationConfig>(),
            )

        assertThat(roundtrippedIntegrationConfig).isEqualTo(integrationConfig)
    }

    @Test
    fun ofNotion() {
        val notion =
            IntegrationConfig.NotionConfig.builder().notionTemplateId("notion_template_id").build()

        val integrationConfig = IntegrationConfig.ofNotion(notion)

        assertThat(integrationConfig.github()).isNull()
        assertThat(integrationConfig.discord()).isNull()
        assertThat(integrationConfig.telegram()).isNull()
        assertThat(integrationConfig.figma()).isNull()
        assertThat(integrationConfig.framer()).isNull()
        assertThat(integrationConfig.notion()).isEqualTo(notion)
        assertThat(integrationConfig.digitalFiles()).isNull()
        assertThat(integrationConfig.licenseKey()).isNull()
    }

    @Test
    fun ofNotionRoundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfig =
            IntegrationConfig.ofNotion(
                IntegrationConfig.NotionConfig.builder()
                    .notionTemplateId("notion_template_id")
                    .build()
            )

        val roundtrippedIntegrationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfig),
                jacksonTypeRef<IntegrationConfig>(),
            )

        assertThat(roundtrippedIntegrationConfig).isEqualTo(integrationConfig)
    }

    @Test
    fun ofDigitalFiles() {
        val digitalFiles =
            IntegrationConfig.DigitalFilesConfig.builder()
                .addDigitalFileId("string")
                .externalUrl("external_url")
                .instructions("instructions")
                .addLegacyFileId("string")
                .build()

        val integrationConfig = IntegrationConfig.ofDigitalFiles(digitalFiles)

        assertThat(integrationConfig.github()).isNull()
        assertThat(integrationConfig.discord()).isNull()
        assertThat(integrationConfig.telegram()).isNull()
        assertThat(integrationConfig.figma()).isNull()
        assertThat(integrationConfig.framer()).isNull()
        assertThat(integrationConfig.notion()).isNull()
        assertThat(integrationConfig.digitalFiles()).isEqualTo(digitalFiles)
        assertThat(integrationConfig.licenseKey()).isNull()
    }

    @Test
    fun ofDigitalFilesRoundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfig =
            IntegrationConfig.ofDigitalFiles(
                IntegrationConfig.DigitalFilesConfig.builder()
                    .addDigitalFileId("string")
                    .externalUrl("external_url")
                    .instructions("instructions")
                    .addLegacyFileId("string")
                    .build()
            )

        val roundtrippedIntegrationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfig),
                jacksonTypeRef<IntegrationConfig>(),
            )

        assertThat(roundtrippedIntegrationConfig).isEqualTo(integrationConfig)
    }

    @Test
    fun ofLicenseKey() {
        val licenseKey =
            IntegrationConfig.LicenseKeyConfig.builder()
                .activationMessage("activation_message")
                .activationsLimit(0)
                .durationCount(0)
                .durationInterval(TimeInterval.DAY)
                .build()

        val integrationConfig = IntegrationConfig.ofLicenseKey(licenseKey)

        assertThat(integrationConfig.github()).isNull()
        assertThat(integrationConfig.discord()).isNull()
        assertThat(integrationConfig.telegram()).isNull()
        assertThat(integrationConfig.figma()).isNull()
        assertThat(integrationConfig.framer()).isNull()
        assertThat(integrationConfig.notion()).isNull()
        assertThat(integrationConfig.digitalFiles()).isNull()
        assertThat(integrationConfig.licenseKey()).isEqualTo(licenseKey)
    }

    @Test
    fun ofLicenseKeyRoundtrip() {
        val jsonMapper = jsonMapper()
        val integrationConfig =
            IntegrationConfig.ofLicenseKey(
                IntegrationConfig.LicenseKeyConfig.builder()
                    .activationMessage("activation_message")
                    .activationsLimit(0)
                    .durationCount(0)
                    .durationInterval(TimeInterval.DAY)
                    .build()
            )

        val roundtrippedIntegrationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationConfig),
                jacksonTypeRef<IntegrationConfig>(),
            )

        assertThat(roundtrippedIntegrationConfig).isEqualTo(integrationConfig)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val integrationConfig =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<IntegrationConfig>())

        val e = assertThrows<DodoPaymentsInvalidDataException> { integrationConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
