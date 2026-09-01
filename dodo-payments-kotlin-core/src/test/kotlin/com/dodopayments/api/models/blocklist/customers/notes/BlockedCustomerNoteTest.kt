// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers.notes

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockedCustomerNoteTest {

    @Test
    fun create() {
        val blockedCustomerNote =
            BlockedCustomerNote.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .note("note")
                .authorEmail("author_email")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(blockedCustomerNote.id()).isEqualTo("id")
        assertThat(blockedCustomerNote.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blockedCustomerNote.note()).isEqualTo("note")
        assertThat(blockedCustomerNote.authorEmail()).isEqualTo("author_email")
        assertThat(blockedCustomerNote.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blockedCustomerNote =
            BlockedCustomerNote.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .note("note")
                .authorEmail("author_email")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBlockedCustomerNote =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockedCustomerNote),
                jacksonTypeRef<BlockedCustomerNote>(),
            )

        assertThat(roundtrippedBlockedCustomerNote).isEqualTo(blockedCustomerNote)
    }
}
