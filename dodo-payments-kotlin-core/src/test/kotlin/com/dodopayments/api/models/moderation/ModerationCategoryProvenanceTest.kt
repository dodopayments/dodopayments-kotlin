// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.moderation

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModerationCategoryProvenanceTest {

    @Test
    fun create() {
        val moderationCategoryProvenance =
            ModerationCategoryProvenance.builder()
                .childSexualExploitation(ModerationProvenance.TARGETED)
                .defamation(ModerationProvenance.TARGETED)
                .hate(ModerationProvenance.TARGETED)
                .indiscriminateWeapons(ModerationProvenance.TARGETED)
                .intellectualProperty(ModerationProvenance.TARGETED)
                .livingArtistStyle(ModerationProvenance.TARGETED)
                .minorCodedLanguage(ModerationProvenance.TARGETED)
                .nonConsensualIntimateImagery(ModerationProvenance.TARGETED)
                .nonViolentCrimes(ModerationProvenance.TARGETED)
                .privacy(ModerationProvenance.TARGETED)
                .promptInjection(ModerationProvenance.TARGETED)
                .realPersonLikeness(ModerationProvenance.TARGETED)
                .sexRelatedCrimes(ModerationProvenance.TARGETED)
                .sexualContent(ModerationProvenance.TARGETED)
                .specializedAdvice(ModerationProvenance.TARGETED)
                .suicideAndSelfHarm(ModerationProvenance.TARGETED)
                .violentCrimes(ModerationProvenance.TARGETED)
                .build()

        assertThat(moderationCategoryProvenance.childSexualExploitation())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.defamation())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.hate()).isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.indiscriminateWeapons())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.intellectualProperty())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.livingArtistStyle())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.minorCodedLanguage())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.nonConsensualIntimateImagery())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.nonViolentCrimes())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.privacy()).isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.promptInjection())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.realPersonLikeness())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.sexRelatedCrimes())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.sexualContent())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.specializedAdvice())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.suicideAndSelfHarm())
            .isEqualTo(ModerationProvenance.TARGETED)
        assertThat(moderationCategoryProvenance.violentCrimes())
            .isEqualTo(ModerationProvenance.TARGETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val moderationCategoryProvenance =
            ModerationCategoryProvenance.builder()
                .childSexualExploitation(ModerationProvenance.TARGETED)
                .defamation(ModerationProvenance.TARGETED)
                .hate(ModerationProvenance.TARGETED)
                .indiscriminateWeapons(ModerationProvenance.TARGETED)
                .intellectualProperty(ModerationProvenance.TARGETED)
                .livingArtistStyle(ModerationProvenance.TARGETED)
                .minorCodedLanguage(ModerationProvenance.TARGETED)
                .nonConsensualIntimateImagery(ModerationProvenance.TARGETED)
                .nonViolentCrimes(ModerationProvenance.TARGETED)
                .privacy(ModerationProvenance.TARGETED)
                .promptInjection(ModerationProvenance.TARGETED)
                .realPersonLikeness(ModerationProvenance.TARGETED)
                .sexRelatedCrimes(ModerationProvenance.TARGETED)
                .sexualContent(ModerationProvenance.TARGETED)
                .specializedAdvice(ModerationProvenance.TARGETED)
                .suicideAndSelfHarm(ModerationProvenance.TARGETED)
                .violentCrimes(ModerationProvenance.TARGETED)
                .build()

        val roundtrippedModerationCategoryProvenance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(moderationCategoryProvenance),
                jacksonTypeRef<ModerationCategoryProvenance>(),
            )

        assertThat(roundtrippedModerationCategoryProvenance).isEqualTo(moderationCategoryProvenance)
    }
}
