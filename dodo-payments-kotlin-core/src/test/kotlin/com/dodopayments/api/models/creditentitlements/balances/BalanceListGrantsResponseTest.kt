// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListGrantsResponseTest {

    @Test
    fun create() {
        val balanceListGrantsResponse =
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
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .parentGrantId("parent_grant_id")
                .sourceId("source_id")
                .build()

        assertThat(balanceListGrantsResponse.id()).isEqualTo("id")
        assertThat(balanceListGrantsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceListGrantsResponse.creditEntitlementId())
            .isEqualTo("credit_entitlement_id")
        assertThat(balanceListGrantsResponse.customerId()).isEqualTo("customer_id")
        assertThat(balanceListGrantsResponse.initialAmount()).isEqualTo("initial_amount")
        assertThat(balanceListGrantsResponse.isExpired()).isEqualTo(true)
        assertThat(balanceListGrantsResponse.isRolledOver()).isEqualTo(true)
        assertThat(balanceListGrantsResponse.remainingAmount()).isEqualTo("remaining_amount")
        assertThat(balanceListGrantsResponse.rolloverCount()).isEqualTo(0)
        assertThat(balanceListGrantsResponse.sourceType())
            .isEqualTo(BalanceListGrantsResponse.SourceType.SUBSCRIPTION)
        assertThat(balanceListGrantsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceListGrantsResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceListGrantsResponse.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(balanceListGrantsResponse.parentGrantId()).isEqualTo("parent_grant_id")
        assertThat(balanceListGrantsResponse.sourceId()).isEqualTo("source_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceListGrantsResponse =
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
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .parentGrantId("parent_grant_id")
                .sourceId("source_id")
                .build()

        val roundtrippedBalanceListGrantsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceListGrantsResponse),
                jacksonTypeRef<BalanceListGrantsResponse>(),
            )

        assertThat(roundtrippedBalanceListGrantsResponse).isEqualTo(balanceListGrantsResponse)
    }
}
