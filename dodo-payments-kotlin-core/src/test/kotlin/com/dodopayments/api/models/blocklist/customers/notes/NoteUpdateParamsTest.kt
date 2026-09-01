// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers.notes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NoteUpdateParamsTest {

    @Test
    fun create() {
        NoteUpdateParams.builder()
            .entryId("entry_id")
            .noteId("note_id")
            .noteRequest(NoteRequest.builder().note("note").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NoteUpdateParams.builder()
                .entryId("entry_id")
                .noteId("note_id")
                .noteRequest(NoteRequest.builder().note("note").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entry_id")
        assertThat(params._pathParam(1)).isEqualTo("note_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NoteUpdateParams.builder()
                .entryId("entry_id")
                .noteId("note_id")
                .noteRequest(NoteRequest.builder().note("note").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(NoteRequest.builder().note("note").build())
    }
}
