// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditManualAdjustmentWebhookEventTest {

    @Test
    fun create() {
        val creditManualAdjustmentWebhookEvent =
            CreditManualAdjustmentWebhookEvent.builder()
                .businessId("business_id")
                .data(
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
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(CreditManualAdjustmentWebhookEvent.Type.CREDIT_MANUAL_ADJUSTMENT)
                .build()

        assertThat(creditManualAdjustmentWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(creditManualAdjustmentWebhookEvent.data())
            .isEqualTo(
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
            )
        assertThat(creditManualAdjustmentWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditManualAdjustmentWebhookEvent.type())
            .isEqualTo(CreditManualAdjustmentWebhookEvent.Type.CREDIT_MANUAL_ADJUSTMENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditManualAdjustmentWebhookEvent =
            CreditManualAdjustmentWebhookEvent.builder()
                .businessId("business_id")
                .data(
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
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(CreditManualAdjustmentWebhookEvent.Type.CREDIT_MANUAL_ADJUSTMENT)
                .build()

        val roundtrippedCreditManualAdjustmentWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditManualAdjustmentWebhookEvent),
                jacksonTypeRef<CreditManualAdjustmentWebhookEvent>(),
            )

        assertThat(roundtrippedCreditManualAdjustmentWebhookEvent)
            .isEqualTo(creditManualAdjustmentWebhookEvent)
    }
}
