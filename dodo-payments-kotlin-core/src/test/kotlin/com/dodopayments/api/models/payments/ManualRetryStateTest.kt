// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManualRetryStateTest {

    @Test
    fun create() {
        val manualRetryState =
            ManualRetryState.builder()
                .canRetry(true)
                .sendsAllowed(0L)
                .sendsUsed(0L)
                .reason("reason")
                .retryAvailableAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(manualRetryState.canRetry()).isEqualTo(true)
        assertThat(manualRetryState.sendsAllowed()).isEqualTo(0L)
        assertThat(manualRetryState.sendsUsed()).isEqualTo(0L)
        assertThat(manualRetryState.reason()).isEqualTo("reason")
        assertThat(manualRetryState.retryAvailableAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val manualRetryState =
            ManualRetryState.builder()
                .canRetry(true)
                .sendsAllowed(0L)
                .sendsUsed(0L)
                .reason("reason")
                .retryAvailableAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedManualRetryState =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(manualRetryState),
                jacksonTypeRef<ManualRetryState>(),
            )

        assertThat(roundtrippedManualRetryState).isEqualTo(manualRetryState)
    }
}
