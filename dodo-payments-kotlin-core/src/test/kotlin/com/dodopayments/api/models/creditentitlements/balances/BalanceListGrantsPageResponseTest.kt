// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListGrantsPageResponseTest {

    @Test
    fun create() {
        val balanceListGrantsPageResponse =
            BalanceListGrantsPageResponse.builder()
                .addItem(
                    BalanceListGrantsResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditEntitlementId("credit_entitlement_id")
                        .customerId("customer_id")
                        .initialAmount("initial_amount")
                        .isExpired(true)
                        .isRolledOver(true)
                        .remainingAmount("remaining_amount")
                        .rolloverCount(0)
                        .sourceType(BalanceListGrantsResponse.SourceType.SUBSCRIPTION)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            BalanceListGrantsResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parentGrantId("parent_grant_id")
                        .sourceId("source_id")
                        .build()
                )
                .build()

        assertThat(balanceListGrantsPageResponse.items())
            .containsExactly(
                BalanceListGrantsResponse.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditEntitlementId("credit_entitlement_id")
                    .customerId("customer_id")
                    .initialAmount("initial_amount")
                    .isExpired(true)
                    .isRolledOver(true)
                    .remainingAmount("remaining_amount")
                    .rolloverCount(0)
                    .sourceType(BalanceListGrantsResponse.SourceType.SUBSCRIPTION)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        BalanceListGrantsResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .parentGrantId("parent_grant_id")
                    .sourceId("source_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceListGrantsPageResponse =
            BalanceListGrantsPageResponse.builder()
                .addItem(
                    BalanceListGrantsResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditEntitlementId("credit_entitlement_id")
                        .customerId("customer_id")
                        .initialAmount("initial_amount")
                        .isExpired(true)
                        .isRolledOver(true)
                        .remainingAmount("remaining_amount")
                        .rolloverCount(0)
                        .sourceType(BalanceListGrantsResponse.SourceType.SUBSCRIPTION)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            BalanceListGrantsResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .parentGrantId("parent_grant_id")
                        .sourceId("source_id")
                        .build()
                )
                .build()

        val roundtrippedBalanceListGrantsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceListGrantsPageResponse),
                jacksonTypeRef<BalanceListGrantsPageResponse>(),
            )

        assertThat(roundtrippedBalanceListGrantsPageResponse)
            .isEqualTo(balanceListGrantsPageResponse)
    }
}
