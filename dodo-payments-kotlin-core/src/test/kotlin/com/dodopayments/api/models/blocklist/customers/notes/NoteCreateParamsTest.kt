// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers.notes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NoteCreateParamsTest {

    @Test
    fun create() {
        NoteCreateParams.builder()
            .entryId("entry_id")
            .noteRequest(NoteRequest.builder().text("text").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NoteCreateParams.builder()
                .entryId("entry_id")
                .noteRequest(NoteRequest.builder().text("text").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entry_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NoteCreateParams.builder()
                .entryId("entry_id")
                .noteRequest(NoteRequest.builder().text("text").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(NoteRequest.builder().text("text").build())
    }
}
