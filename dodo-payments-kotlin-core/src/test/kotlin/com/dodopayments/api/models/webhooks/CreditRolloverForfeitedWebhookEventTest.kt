// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditRolloverForfeitedWebhookEventTest {

    @Test
    fun create() {
        val creditRolloverForfeitedWebhookEvent =
            CreditRolloverForfeitedWebhookEvent.builder()
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
                .type(CreditRolloverForfeitedWebhookEvent.Type.CREDIT_ROLLOVER_FORFEITED)
                .build()

        assertThat(creditRolloverForfeitedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(creditRolloverForfeitedWebhookEvent.data())
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
        assertThat(creditRolloverForfeitedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditRolloverForfeitedWebhookEvent.type())
            .isEqualTo(CreditRolloverForfeitedWebhookEvent.Type.CREDIT_ROLLOVER_FORFEITED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditRolloverForfeitedWebhookEvent =
            CreditRolloverForfeitedWebhookEvent.builder()
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
                .type(CreditRolloverForfeitedWebhookEvent.Type.CREDIT_ROLLOVER_FORFEITED)
                .build()

        val roundtrippedCreditRolloverForfeitedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditRolloverForfeitedWebhookEvent),
                jacksonTypeRef<CreditRolloverForfeitedWebhookEvent>(),
            )

        assertThat(roundtrippedCreditRolloverForfeitedWebhookEvent)
            .isEqualTo(creditRolloverForfeitedWebhookEvent)
    }
}
