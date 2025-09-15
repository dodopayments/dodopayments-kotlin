// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets.ledgerentries

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerEntryListPageResponseTest {

    @Test
    fun create() {
        val ledgerEntryListPageResponse =
            LedgerEntryListPageResponse.builder()
                .addItem(
                    CustomerWalletTransaction.builder()
                        .id("id")
                        .afterBalance(0L)
                        .amount(0L)
                        .beforeBalance(0L)
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customerId("customer_id")
                        .eventType(CustomerWalletTransaction.EventType.PAYMENT)
                        .isCredit(true)
                        .reason("reason")
                        .referenceObjectId("reference_object_id")
                        .build()
                )
                .build()

        assertThat(ledgerEntryListPageResponse.items())
            .containsExactly(
                CustomerWalletTransaction.builder()
                    .id("id")
                    .afterBalance(0L)
                    .amount(0L)
                    .beforeBalance(0L)
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .customerId("customer_id")
                    .eventType(CustomerWalletTransaction.EventType.PAYMENT)
                    .isCredit(true)
                    .reason("reason")
                    .referenceObjectId("reference_object_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerEntryListPageResponse =
            LedgerEntryListPageResponse.builder()
                .addItem(
                    CustomerWalletTransaction.builder()
                        .id("id")
                        .afterBalance(0L)
                        .amount(0L)
                        .beforeBalance(0L)
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customerId("customer_id")
                        .eventType(CustomerWalletTransaction.EventType.PAYMENT)
                        .isCredit(true)
                        .reason("reason")
                        .referenceObjectId("reference_object_id")
                        .build()
                )
                .build()

        val roundtrippedLedgerEntryListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerEntryListPageResponse),
                jacksonTypeRef<LedgerEntryListPageResponse>(),
            )

        assertThat(roundtrippedLedgerEntryListPageResponse).isEqualTo(ledgerEntryListPageResponse)
    }
}
