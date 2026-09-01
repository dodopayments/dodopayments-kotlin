// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers.notes

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NoteRequestTest {

    @Test
    fun create() {
        val noteRequest = NoteRequest.builder().note("note").build()

        assertThat(noteRequest.note()).isEqualTo("note")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val noteRequest = NoteRequest.builder().note("note").build()

        val roundtrippedNoteRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(noteRequest),
                jacksonTypeRef<NoteRequest>(),
            )

        assertThat(roundtrippedNoteRequest).isEqualTo(noteRequest)
    }
}
