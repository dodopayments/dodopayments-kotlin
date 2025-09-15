// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerWalletTest {

    @Test
    fun create() {
        val customerWallet =
            CustomerWallet.builder()
                .balance(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .customerId("customer_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(customerWallet.balance()).isEqualTo(0L)
        assertThat(customerWallet.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerWallet.currency()).isEqualTo(Currency.AED)
        assertThat(customerWallet.customerId()).isEqualTo("customer_id")
        assertThat(customerWallet.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerWallet =
            CustomerWallet.builder()
                .balance(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .customerId("customer_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCustomerWallet =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerWallet),
                jacksonTypeRef<CustomerWallet>(),
            )

        assertThat(roundtrippedCustomerWallet).isEqualTo(customerWallet)
    }
}
