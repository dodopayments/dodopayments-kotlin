// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThemeModeConfigTest {

    @Test
    fun create() {
        val themeModeConfig =
            ThemeModeConfig.builder()
                .bgPrimary("bg_primary")
                .bgSecondary("bg_secondary")
                .borderPrimary("border_primary")
                .borderSecondary("border_secondary")
                .buttonPrimary("button_primary")
                .buttonPrimaryHover("button_primary_hover")
                .buttonSecondary("button_secondary")
                .buttonSecondaryHover("button_secondary_hover")
                .buttonTextPrimary("button_text_primary")
                .buttonTextSecondary("button_text_secondary")
                .inputFocusBorder("input_focus_border")
                .textError("text_error")
                .textPlaceholder("text_placeholder")
                .textPrimary("text_primary")
                .textSecondary("text_secondary")
                .textSuccess("text_success")
                .build()

        assertThat(themeModeConfig.bgPrimary()).isEqualTo("bg_primary")
        assertThat(themeModeConfig.bgSecondary()).isEqualTo("bg_secondary")
        assertThat(themeModeConfig.borderPrimary()).isEqualTo("border_primary")
        assertThat(themeModeConfig.borderSecondary()).isEqualTo("border_secondary")
        assertThat(themeModeConfig.buttonPrimary()).isEqualTo("button_primary")
        assertThat(themeModeConfig.buttonPrimaryHover()).isEqualTo("button_primary_hover")
        assertThat(themeModeConfig.buttonSecondary()).isEqualTo("button_secondary")
        assertThat(themeModeConfig.buttonSecondaryHover()).isEqualTo("button_secondary_hover")
        assertThat(themeModeConfig.buttonTextPrimary()).isEqualTo("button_text_primary")
        assertThat(themeModeConfig.buttonTextSecondary()).isEqualTo("button_text_secondary")
        assertThat(themeModeConfig.inputFocusBorder()).isEqualTo("input_focus_border")
        assertThat(themeModeConfig.textError()).isEqualTo("text_error")
        assertThat(themeModeConfig.textPlaceholder()).isEqualTo("text_placeholder")
        assertThat(themeModeConfig.textPrimary()).isEqualTo("text_primary")
        assertThat(themeModeConfig.textSecondary()).isEqualTo("text_secondary")
        assertThat(themeModeConfig.textSuccess()).isEqualTo("text_success")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val themeModeConfig =
            ThemeModeConfig.builder()
                .bgPrimary("bg_primary")
                .bgSecondary("bg_secondary")
                .borderPrimary("border_primary")
                .borderSecondary("border_secondary")
                .buttonPrimary("button_primary")
                .buttonPrimaryHover("button_primary_hover")
                .buttonSecondary("button_secondary")
                .buttonSecondaryHover("button_secondary_hover")
                .buttonTextPrimary("button_text_primary")
                .buttonTextSecondary("button_text_secondary")
                .inputFocusBorder("input_focus_border")
                .textError("text_error")
                .textPlaceholder("text_placeholder")
                .textPrimary("text_primary")
                .textSecondary("text_secondary")
                .textSuccess("text_success")
                .build()

        val roundtrippedThemeModeConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(themeModeConfig),
                jacksonTypeRef<ThemeModeConfig>(),
            )

        assertThat(roundtrippedThemeModeConfig).isEqualTo(themeModeConfig)
    }
}
