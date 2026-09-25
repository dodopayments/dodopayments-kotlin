// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.moderation

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModerationRetrieveUsageResponseTest {

    @Test
    fun create() {
        val moderationRetrieveUsageResponse =
            ModerationRetrieveUsageResponse.builder()
                .addDaily(
                    ModerationRetrieveUsageResponse.Daily.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .screens(0L)
                        .build()
                )
                .screensToNextBlock(0L)
                .unbilledScreens(0L)
                .build()

        assertThat(moderationRetrieveUsageResponse.daily())
            .containsExactly(
                ModerationRetrieveUsageResponse.Daily.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .screens(0L)
                    .build()
            )
        assertThat(moderationRetrieveUsageResponse.screensToNextBlock()).isEqualTo(0L)
        assertThat(moderationRetrieveUsageResponse.unbilledScreens()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val moderationRetrieveUsageResponse =
            ModerationRetrieveUsageResponse.builder()
                .addDaily(
                    ModerationRetrieveUsageResponse.Daily.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .screens(0L)
                        .build()
                )
                .screensToNextBlock(0L)
                .unbilledScreens(0L)
                .build()

        val roundtrippedModerationRetrieveUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(moderationRetrieveUsageResponse),
                jacksonTypeRef<ModerationRetrieveUsageResponse>(),
            )

        assertThat(roundtrippedModerationRetrieveUsageResponse)
            .isEqualTo(moderationRetrieveUsageResponse)
    }
}
