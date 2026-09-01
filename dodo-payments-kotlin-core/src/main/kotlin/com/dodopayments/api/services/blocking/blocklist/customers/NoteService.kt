// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.blocklist.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.blocklist.customers.notes.BlockedCustomerNote
import com.dodopayments.api.models.blocklist.customers.notes.NoteCreateParams
import com.dodopayments.api.models.blocklist.customers.notes.NoteUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface NoteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): NoteService

    fun create(
        entryId: String,
        params: NoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomerNote = create(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see create */
    fun create(
        params: NoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomerNote

    fun update(
        noteId: String,
        params: NoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomerNote = update(params.toBuilder().noteId(noteId).build(), requestOptions)

    /** @see update */
    fun update(
        params: NoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomerNote

    /** A view of [NoteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): NoteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /blocklist/customers/{entry_id}/notes`, but is
         * otherwise the same as [NoteService.create].
         */
        @MustBeClosed
        fun create(
            entryId: String,
            params: NoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomerNote> =
            create(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: NoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomerNote>

        /**
         * Returns a raw HTTP response for `patch /blocklist/customers/{entry_id}/notes/{note_id}`,
         * but is otherwise the same as [NoteService.update].
         */
        @MustBeClosed
        fun update(
            noteId: String,
            params: NoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomerNote> =
            update(params.toBuilder().noteId(noteId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: NoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomerNote>
    }
}
