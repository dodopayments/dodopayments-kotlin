// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListPageResponseTest {

    @Test
    fun create() {
        val balanceListPageResponse =
            BalanceListPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(balanceListPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceListPageResponse =
            BalanceListPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedBalanceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceListPageResponse),
                jacksonTypeRef<BalanceListPageResponse>(),
            )

        assertThat(roundtrippedBalanceListPageResponse).isEqualTo(balanceListPageResponse)
    }
}
