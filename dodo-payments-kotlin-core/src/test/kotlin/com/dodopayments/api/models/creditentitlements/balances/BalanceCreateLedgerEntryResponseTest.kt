// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceCreateLedgerEntryResponseTest {

    @Test
    fun create() {
        val balanceCreateLedgerEntryResponse =
            BalanceCreateLedgerEntryResponse.builder()
                .id("id")
                .amount("amount")
                .balanceAfter("balance_after")
                .balanceBefore("balance_before")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .entryType(LedgerEntryType.CREDIT)
                .isCredit(true)
                .overageAfter("overage_after")
                .overageBefore("overage_before")
                .grantId("grant_id")
                .reason("reason")
                .build()

        assertThat(balanceCreateLedgerEntryResponse.id()).isEqualTo("id")
        assertThat(balanceCreateLedgerEntryResponse.amount()).isEqualTo("amount")
        assertThat(balanceCreateLedgerEntryResponse.balanceAfter()).isEqualTo("balance_after")
        assertThat(balanceCreateLedgerEntryResponse.balanceBefore()).isEqualTo("balance_before")
        assertThat(balanceCreateLedgerEntryResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceCreateLedgerEntryResponse.creditEntitlementId())
            .isEqualTo("credit_entitlement_id")
        assertThat(balanceCreateLedgerEntryResponse.customerId()).isEqualTo("customer_id")
        assertThat(balanceCreateLedgerEntryResponse.entryType()).isEqualTo(LedgerEntryType.CREDIT)
        assertThat(balanceCreateLedgerEntryResponse.isCredit()).isEqualTo(true)
        assertThat(balanceCreateLedgerEntryResponse.overageAfter()).isEqualTo("overage_after")
        assertThat(balanceCreateLedgerEntryResponse.overageBefore()).isEqualTo("overage_before")
        assertThat(balanceCreateLedgerEntryResponse.grantId()).isEqualTo("grant_id")
        assertThat(balanceCreateLedgerEntryResponse.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceCreateLedgerEntryResponse =
            BalanceCreateLedgerEntryResponse.builder()
                .id("id")
                .amount("amount")
                .balanceAfter("balance_after")
                .balanceBefore("balance_before")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .entryType(LedgerEntryType.CREDIT)
                .isCredit(true)
                .overageAfter("overage_after")
                .overageBefore("overage_before")
                .grantId("grant_id")
                .reason("reason")
                .build()

        val roundtrippedBalanceCreateLedgerEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceCreateLedgerEntryResponse),
                jacksonTypeRef<BalanceCreateLedgerEntryResponse>(),
            )

        assertThat(roundtrippedBalanceCreateLedgerEntryResponse)
            .isEqualTo(balanceCreateLedgerEntryResponse)
    }
}
