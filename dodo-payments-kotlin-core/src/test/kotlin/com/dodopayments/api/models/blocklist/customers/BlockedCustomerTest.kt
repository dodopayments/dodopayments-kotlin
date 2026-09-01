// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.blocklist.customers.notes.BlockedCustomerNote
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockedCustomerTest {

    @Test
    fun create() {
        val blockedCustomer =
            BlockedCustomer.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerEmail("customer_email")
                .customerId("customer_id")
                .customerName("customer_name")
                .identifier("identifier")
                .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                .blockedByEmail("blocked_by_email")
                .addCancelledSubscriptionId("string")
                .addNote(
                    BlockedCustomerNote.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .note("note")
                        .authorEmail("author_email")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .reason("reason")
                .addRemainingSubscriptionId("string")
                .subscriptionsSwept(true)
                .unblockedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(blockedCustomer.id()).isEqualTo("id")
        assertThat(blockedCustomer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blockedCustomer.customerEmail()).isEqualTo("customer_email")
        assertThat(blockedCustomer.customerId()).isEqualTo("customer_id")
        assertThat(blockedCustomer.customerName()).isEqualTo("customer_name")
        assertThat(blockedCustomer.identifier()).isEqualTo("identifier")
        assertThat(blockedCustomer.source()).isEqualTo(BlockedCustomerSource.BLOCKLIST_PAGE)
        assertThat(blockedCustomer.blockedByEmail()).isEqualTo("blocked_by_email")
        assertThat(blockedCustomer.cancelledSubscriptionIds()).containsExactly("string")
        assertThat(blockedCustomer.notes())
            .containsExactly(
                BlockedCustomerNote.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .note("note")
                    .authorEmail("author_email")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(blockedCustomer.reason()).isEqualTo("reason")
        assertThat(blockedCustomer.remainingSubscriptionIds()).containsExactly("string")
        assertThat(blockedCustomer.subscriptionsSwept()).isEqualTo(true)
        assertThat(blockedCustomer.unblockedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blockedCustomer =
            BlockedCustomer.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerEmail("customer_email")
                .customerId("customer_id")
                .customerName("customer_name")
                .identifier("identifier")
                .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                .blockedByEmail("blocked_by_email")
                .addCancelledSubscriptionId("string")
                .addNote(
                    BlockedCustomerNote.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .note("note")
                        .authorEmail("author_email")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .reason("reason")
                .addRemainingSubscriptionId("string")
                .subscriptionsSwept(true)
                .unblockedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBlockedCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockedCustomer),
                jacksonTypeRef<BlockedCustomer>(),
            )

        assertThat(roundtrippedBlockedCustomer).isEqualTo(blockedCustomer)
    }
}
