// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.balances

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceLedgerEntryTest {

    @Test
    fun create() {
        val balanceLedgerEntry =
            BalanceLedgerEntry.builder()
                .id("id")
                .amount(0L)
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .eventType(BalanceLedgerEntry.EventType.PAYMENT)
                .isCredit(true)
                .usdEquivalentAmount(0L)
                .afterBalance(0L)
                .beforeBalance(0L)
                .description("description")
                .payoutId("payout_id")
                .referenceObjectId("reference_object_id")
                .build()

        assertThat(balanceLedgerEntry.id()).isEqualTo("id")
        assertThat(balanceLedgerEntry.amount()).isEqualTo(0L)
        assertThat(balanceLedgerEntry.businessId()).isEqualTo("business_id")
        assertThat(balanceLedgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceLedgerEntry.currency()).isEqualTo(Currency.AED)
        assertThat(balanceLedgerEntry.eventType()).isEqualTo(BalanceLedgerEntry.EventType.PAYMENT)
        assertThat(balanceLedgerEntry.isCredit()).isEqualTo(true)
        assertThat(balanceLedgerEntry.usdEquivalentAmount()).isEqualTo(0L)
        assertThat(balanceLedgerEntry.afterBalance()).isEqualTo(0L)
        assertThat(balanceLedgerEntry.beforeBalance()).isEqualTo(0L)
        assertThat(balanceLedgerEntry.description()).isEqualTo("description")
        assertThat(balanceLedgerEntry.payoutId()).isEqualTo("payout_id")
        assertThat(balanceLedgerEntry.referenceObjectId()).isEqualTo("reference_object_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceLedgerEntry =
            BalanceLedgerEntry.builder()
                .id("id")
                .amount(0L)
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .eventType(BalanceLedgerEntry.EventType.PAYMENT)
                .isCredit(true)
                .usdEquivalentAmount(0L)
                .afterBalance(0L)
                .beforeBalance(0L)
                .description("description")
                .payoutId("payout_id")
                .referenceObjectId("reference_object_id")
                .build()

        val roundtrippedBalanceLedgerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceLedgerEntry),
                jacksonTypeRef<BalanceLedgerEntry>(),
            )

        assertThat(roundtrippedBalanceLedgerEntry).isEqualTo(balanceLedgerEntry)
    }
}
