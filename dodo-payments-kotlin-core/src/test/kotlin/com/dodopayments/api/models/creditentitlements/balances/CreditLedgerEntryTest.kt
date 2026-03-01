// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditLedgerEntryTest {

    @Test
    fun create() {
        val creditLedgerEntry =
            CreditLedgerEntry.builder()
                .id("id")
                .amount("amount")
                .balanceAfter("balance_after")
                .balanceBefore("balance_before")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .isCredit(true)
                .overageAfter("overage_after")
                .overageBefore("overage_before")
                .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
                .description("description")
                .grantId("grant_id")
                .referenceId("reference_id")
                .referenceType("reference_type")
                .build()

        assertThat(creditLedgerEntry.id()).isEqualTo("id")
        assertThat(creditLedgerEntry.amount()).isEqualTo("amount")
        assertThat(creditLedgerEntry.balanceAfter()).isEqualTo("balance_after")
        assertThat(creditLedgerEntry.balanceBefore()).isEqualTo("balance_before")
        assertThat(creditLedgerEntry.businessId()).isEqualTo("business_id")
        assertThat(creditLedgerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditLedgerEntry.creditEntitlementId()).isEqualTo("credit_entitlement_id")
        assertThat(creditLedgerEntry.customerId()).isEqualTo("customer_id")
        assertThat(creditLedgerEntry.isCredit()).isEqualTo(true)
        assertThat(creditLedgerEntry.overageAfter()).isEqualTo("overage_after")
        assertThat(creditLedgerEntry.overageBefore()).isEqualTo("overage_before")
        assertThat(creditLedgerEntry.transactionType())
            .isEqualTo(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
        assertThat(creditLedgerEntry.description()).isEqualTo("description")
        assertThat(creditLedgerEntry.grantId()).isEqualTo("grant_id")
        assertThat(creditLedgerEntry.referenceId()).isEqualTo("reference_id")
        assertThat(creditLedgerEntry.referenceType()).isEqualTo("reference_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditLedgerEntry =
            CreditLedgerEntry.builder()
                .id("id")
                .amount("amount")
                .balanceAfter("balance_after")
                .balanceBefore("balance_before")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .isCredit(true)
                .overageAfter("overage_after")
                .overageBefore("overage_before")
                .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
                .description("description")
                .grantId("grant_id")
                .referenceId("reference_id")
                .referenceType("reference_type")
                .build()

        val roundtrippedCreditLedgerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditLedgerEntry),
                jacksonTypeRef<CreditLedgerEntry>(),
            )

        assertThat(roundtrippedCreditLedgerEntry).isEqualTo(creditLedgerEntry)
    }
}
