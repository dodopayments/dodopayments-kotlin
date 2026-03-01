// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditBalanceTest {

    @Test
    fun create() {
        val customerCreditBalance =
            CustomerCreditBalance.builder()
                .id("id")
                .balance("balance")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .overage("overage")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastTransactionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(customerCreditBalance.id()).isEqualTo("id")
        assertThat(customerCreditBalance.balance()).isEqualTo("balance")
        assertThat(customerCreditBalance.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditBalance.creditEntitlementId()).isEqualTo("credit_entitlement_id")
        assertThat(customerCreditBalance.customerId()).isEqualTo("customer_id")
        assertThat(customerCreditBalance.overage()).isEqualTo("overage")
        assertThat(customerCreditBalance.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreditBalance.lastTransactionAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditBalance =
            CustomerCreditBalance.builder()
                .id("id")
                .balance("balance")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditEntitlementId("credit_entitlement_id")
                .customerId("customer_id")
                .overage("overage")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastTransactionAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCustomerCreditBalance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditBalance),
                jacksonTypeRef<CustomerCreditBalance>(),
            )

        assertThat(roundtrippedCustomerCreditBalance).isEqualTo(customerCreditBalance)
    }
}
