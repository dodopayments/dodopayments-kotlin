// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets.ledgerentries

import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerEntryCreateParamsTest {

    @Test
    fun create() {
        LedgerEntryCreateParams.builder()
            .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
            .amount(0L)
            .currency(Currency.AED)
            .entryType(LedgerEntryCreateParams.EntryType.CREDIT)
            .idempotencyKey("idempotency_key")
            .reason("reason")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LedgerEntryCreateParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .amount(0L)
                .currency(Currency.AED)
                .entryType(LedgerEntryCreateParams.EntryType.CREDIT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("cus_TV52uJWWXt2yIoBBxpjaa")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerEntryCreateParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .amount(0L)
                .currency(Currency.AED)
                .entryType(LedgerEntryCreateParams.EntryType.CREDIT)
                .idempotencyKey("idempotency_key")
                .reason("reason")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.entryType()).isEqualTo(LedgerEntryCreateParams.EntryType.CREDIT)
        assertThat(body.idempotencyKey()).isEqualTo("idempotency_key")
        assertThat(body.reason()).isEqualTo("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LedgerEntryCreateParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .amount(0L)
                .currency(Currency.AED)
                .entryType(LedgerEntryCreateParams.EntryType.CREDIT)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.entryType()).isEqualTo(LedgerEntryCreateParams.EntryType.CREDIT)
    }
}
