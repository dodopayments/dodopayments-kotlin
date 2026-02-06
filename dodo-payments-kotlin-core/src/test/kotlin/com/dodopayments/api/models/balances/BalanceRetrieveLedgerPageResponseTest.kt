// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.balances

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceRetrieveLedgerPageResponseTest {

    @Test
    fun create() {
        val balanceRetrieveLedgerPageResponse =
            BalanceRetrieveLedgerPageResponse.builder()
                .addItem(
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
                        .referenceObjectId("reference_object_id")
                        .build()
                )
                .build()

        assertThat(balanceRetrieveLedgerPageResponse.items())
            .containsExactly(
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
                    .referenceObjectId("reference_object_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceRetrieveLedgerPageResponse =
            BalanceRetrieveLedgerPageResponse.builder()
                .addItem(
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
                        .referenceObjectId("reference_object_id")
                        .build()
                )
                .build()

        val roundtrippedBalanceRetrieveLedgerPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceRetrieveLedgerPageResponse),
                jacksonTypeRef<BalanceRetrieveLedgerPageResponse>(),
            )

        assertThat(roundtrippedBalanceRetrieveLedgerPageResponse)
            .isEqualTo(balanceRetrieveLedgerPageResponse)
    }
}
