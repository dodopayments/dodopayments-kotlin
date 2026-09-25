// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.moderation

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModerationCategoryScoresTest {

    @Test
    fun create() {
        val moderationCategoryScores =
            ModerationCategoryScores.builder()
                .childSexualExploitation(0.0)
                .defamation(0.0)
                .hate(0.0)
                .indiscriminateWeapons(0.0)
                .intellectualProperty(0.0)
                .livingArtistStyle(0.0)
                .minorCodedLanguage(0.0)
                .nonConsensualIntimateImagery(0.0)
                .nonViolentCrimes(0.0)
                .privacy(0.0)
                .promptInjection(0.0)
                .realPersonLikeness(0.0)
                .sexRelatedCrimes(0.0)
                .sexualContent(0.0)
                .specializedAdvice(0.0)
                .suicideAndSelfHarm(0.0)
                .violentCrimes(0.0)
                .build()

        assertThat(moderationCategoryScores.childSexualExploitation()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.defamation()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.hate()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.indiscriminateWeapons()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.intellectualProperty()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.livingArtistStyle()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.minorCodedLanguage()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.nonConsensualIntimateImagery()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.nonViolentCrimes()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.privacy()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.promptInjection()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.realPersonLikeness()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.sexRelatedCrimes()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.sexualContent()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.specializedAdvice()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.suicideAndSelfHarm()).isEqualTo(0.0)
        assertThat(moderationCategoryScores.violentCrimes()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val moderationCategoryScores =
            ModerationCategoryScores.builder()
                .childSexualExploitation(0.0)
                .defamation(0.0)
                .hate(0.0)
                .indiscriminateWeapons(0.0)
                .intellectualProperty(0.0)
                .livingArtistStyle(0.0)
                .minorCodedLanguage(0.0)
                .nonConsensualIntimateImagery(0.0)
                .nonViolentCrimes(0.0)
                .privacy(0.0)
                .promptInjection(0.0)
                .realPersonLikeness(0.0)
                .sexRelatedCrimes(0.0)
                .sexualContent(0.0)
                .specializedAdvice(0.0)
                .suicideAndSelfHarm(0.0)
                .violentCrimes(0.0)
                .build()

        val roundtrippedModerationCategoryScores =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(moderationCategoryScores),
                jacksonTypeRef<ModerationCategoryScores>(),
            )

        assertThat(roundtrippedModerationCategoryScores).isEqualTo(moderationCategoryScores)
    }
}
