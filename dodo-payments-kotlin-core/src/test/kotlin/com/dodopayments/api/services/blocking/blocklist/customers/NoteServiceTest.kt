// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.blocklist.customers

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.blocklist.customers.notes.NoteCreateParams
import com.dodopayments.api.models.blocklist.customers.notes.NoteRequest
import com.dodopayments.api.models.blocklist.customers.notes.NoteUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NoteServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val noteService = client.blocklist().customers().notes()

        val blockedCustomerNote =
            noteService.create(
                NoteCreateParams.builder()
                    .entryId("entry_id")
                    .noteRequest(NoteRequest.builder().note("note").build())
                    .build()
            )

        blockedCustomerNote.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val noteService = client.blocklist().customers().notes()

        val blockedCustomerNote =
            noteService.update(
                NoteUpdateParams.builder()
                    .entryId("entry_id")
                    .noteId("note_id")
                    .noteRequest(NoteRequest.builder().note("note").build())
                    .build()
            )

        blockedCustomerNote.validate()
    }
}
