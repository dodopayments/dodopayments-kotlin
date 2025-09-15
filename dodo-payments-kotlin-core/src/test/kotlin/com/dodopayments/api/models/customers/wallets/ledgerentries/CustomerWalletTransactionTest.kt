// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets.ledgerentries

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerWalletTransactionTest {

    @Test
    fun create() {
        val customerWalletTransaction =
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

        assertThat(customerWalletTransaction.id()).isEqualTo("id")
        assertThat(customerWalletTransaction.afterBalance()).isEqualTo(0L)
        assertThat(customerWalletTransaction.amount()).isEqualTo(0L)
        assertThat(customerWalletTransaction.beforeBalance()).isEqualTo(0L)
        assertThat(customerWalletTransaction.businessId()).isEqualTo("business_id")
        assertThat(customerWalletTransaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerWalletTransaction.currency()).isEqualTo(Currency.AED)
        assertThat(customerWalletTransaction.customerId()).isEqualTo("customer_id")
        assertThat(customerWalletTransaction.eventType())
            .isEqualTo(CustomerWalletTransaction.EventType.PAYMENT)
        assertThat(customerWalletTransaction.isCredit()).isEqualTo(true)
        assertThat(customerWalletTransaction.reason()).isEqualTo("reason")
        assertThat(customerWalletTransaction.referenceObjectId()).isEqualTo("reference_object_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerWalletTransaction =
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

        val roundtrippedCustomerWalletTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerWalletTransaction),
                jacksonTypeRef<CustomerWalletTransaction>(),
            )

        assertThat(roundtrippedCustomerWalletTransaction).isEqualTo(customerWalletTransaction)
    }
}
