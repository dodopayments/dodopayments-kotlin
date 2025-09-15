// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletListResponseTest {

    @Test
    fun create() {
        val walletListResponse =
            WalletListResponse.builder()
                .addItem(
                    CustomerWallet.builder()
                        .balance(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customerId("customer_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .totalBalanceUsd(0L)
                .build()

        assertThat(walletListResponse.items())
            .containsExactly(
                CustomerWallet.builder()
                    .balance(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .customerId("customer_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(walletListResponse.totalBalanceUsd()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val walletListResponse =
            WalletListResponse.builder()
                .addItem(
                    CustomerWallet.builder()
                        .balance(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customerId("customer_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .totalBalanceUsd(0L)
                .build()

        val roundtrippedWalletListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(walletListResponse),
                jacksonTypeRef<WalletListResponse>(),
            )

        assertThat(roundtrippedWalletListResponse).isEqualTo(walletListResponse)
    }
}
