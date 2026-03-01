// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceCreateLedgerEntryParamsTest {

    @Test
    fun create() {
        BalanceCreateLedgerEntryParams.builder()
            .creditEntitlementId("credit_entitlement_id")
            .customerId("customer_id")
            .amount("amount")
            .entryType(LedgerEntryType.CREDIT)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .idempotencyKey("idempotency_key")
            .metadata(
                BalanceCreateLedgerEntryParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .reason("reason")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceCreateLedgerEntryParams.builder()
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .amount("amount")
                .entryType(LedgerEntryType.CREDIT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("credit_entitlement_id")
        assertThat(params._pathParam(1)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BalanceCreateLedgerEntryParams.builder()
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .amount("amount")
                .entryType(LedgerEntryType.CREDIT)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .idempotencyKey("idempotency_key")
                .metadata(
                    BalanceCreateLedgerEntryParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.entryType()).isEqualTo(LedgerEntryType.CREDIT)
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.idempotencyKey()).isEqualTo("idempotency_key")
        assertThat(body.metadata())
            .isEqualTo(
                BalanceCreateLedgerEntryParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.reason()).isEqualTo("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BalanceCreateLedgerEntryParams.builder()
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .amount("amount")
                .entryType(LedgerEntryType.CREDIT)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.entryType()).isEqualTo(LedgerEntryType.CREDIT)
    }
}
