// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers.wallets

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryCreateParams
import com.dodopayments.api.models.misc.Currency
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerEntryServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val ledgerEntryService = client.customers().wallets().ledgerEntries()

        val customerWallet =
            ledgerEntryService.create(
                LedgerEntryCreateParams.builder()
                    .customerId("customer_id")
                    .amount(0L)
                    .currency(Currency.AED)
                    .entryType(LedgerEntryCreateParams.EntryType.CREDIT)
                    .idempotencyKey("idempotency_key")
                    .reason("reason")
                    .build()
            )

        customerWallet.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val ledgerEntryService = client.customers().wallets().ledgerEntries()

        val page = ledgerEntryService.list("customer_id")

        page.response().validate()
    }
}
