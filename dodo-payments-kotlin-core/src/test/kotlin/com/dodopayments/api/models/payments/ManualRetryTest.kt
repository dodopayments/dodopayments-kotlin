// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManualRetryTest {

    @Test
    fun create() {
        val manualRetry =
            ManualRetry.builder()
                .invoiceId("invoice_id")
                .isManualRetry(true)
                .paymentId("payment_id")
                .retryAttempt(0)
                .sendsAllowed(0L)
                .sendsUsed(0L)
                .retryAvailableAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(IntentStatus.SUCCEEDED)
                .build()

        assertThat(manualRetry.invoiceId()).isEqualTo("invoice_id")
        assertThat(manualRetry.isManualRetry()).isEqualTo(true)
        assertThat(manualRetry.paymentId()).isEqualTo("payment_id")
        assertThat(manualRetry.retryAttempt()).isEqualTo(0)
        assertThat(manualRetry.sendsAllowed()).isEqualTo(0L)
        assertThat(manualRetry.sendsUsed()).isEqualTo(0L)
        assertThat(manualRetry.retryAvailableAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(manualRetry.status()).isEqualTo(IntentStatus.SUCCEEDED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val manualRetry =
            ManualRetry.builder()
                .invoiceId("invoice_id")
                .isManualRetry(true)
                .paymentId("payment_id")
                .retryAttempt(0)
                .sendsAllowed(0L)
                .sendsUsed(0L)
                .retryAvailableAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(IntentStatus.SUCCEEDED)
                .build()

        val roundtrippedManualRetry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(manualRetry),
                jacksonTypeRef<ManualRetry>(),
            )

        assertThat(roundtrippedManualRetry).isEqualTo(manualRetry)
    }
}
