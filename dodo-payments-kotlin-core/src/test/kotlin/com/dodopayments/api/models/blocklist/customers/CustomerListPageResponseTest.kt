// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.blocklist.customers.notes.BlockedCustomerNote
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListPageResponseTest {

    @Test
    fun create() {
        val customerListPageResponse =
            CustomerListPageResponse.builder()
                .addItem(
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
                )
                .total(0L)
                .build()

        assertThat(customerListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(customerListPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListPageResponse =
            CustomerListPageResponse.builder()
                .addItem(
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
                )
                .total(0L)
                .build()

        val roundtrippedCustomerListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListPageResponse),
                jacksonTypeRef<CustomerListPageResponse>(),
            )

        assertThat(roundtrippedCustomerListPageResponse).isEqualTo(customerListPageResponse)
    }
}
