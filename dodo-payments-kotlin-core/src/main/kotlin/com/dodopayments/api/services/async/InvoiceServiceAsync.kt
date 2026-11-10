// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.invoices.Invoice
import com.dodopayments.api.models.invoices.InvoiceAddNoteParams
import com.dodopayments.api.models.invoices.InvoiceCreateHostedLinkParams
import com.dodopayments.api.models.invoices.InvoiceCreateHostedLinkResponse
import com.dodopayments.api.models.invoices.InvoiceCreateParams
import com.dodopayments.api.models.invoices.InvoiceDeleteParams
import com.dodopayments.api.models.invoices.InvoiceDuplicateParams
import com.dodopayments.api.models.invoices.InvoiceFinalizeParams
import com.dodopayments.api.models.invoices.InvoiceListEventsParams
import com.dodopayments.api.models.invoices.InvoiceListEventsResponse
import com.dodopayments.api.models.invoices.InvoiceListPageAsync
import com.dodopayments.api.models.invoices.InvoiceListParams
import com.dodopayments.api.models.invoices.InvoiceMarkUncollectableParams
import com.dodopayments.api.models.invoices.InvoicePreviewExistingParams
import com.dodopayments.api.models.invoices.InvoicePreviewParams
import com.dodopayments.api.models.invoices.InvoiceRetrieveParams
import com.dodopayments.api.models.invoices.InvoiceRetryParams
import com.dodopayments.api.models.invoices.InvoiceSendParams
import com.dodopayments.api.models.invoices.InvoiceUpdateDunningParams
import com.dodopayments.api.models.invoices.InvoiceUpdateParams
import com.dodopayments.api.models.invoices.InvoiceVoidParams
import com.dodopayments.api.services.async.invoices.PaymentServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InvoiceServiceAsync

    fun payments(): PaymentServiceAsync

    /** Creates a draft. A repeat with the same `Idempotency-Key` returns the first draft. */
    suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Get an invoice */
    suspend fun retrieve(
        invoiceId: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = retrieve(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see retrieve */
    suspend fun retrieve(invoiceId: String, requestOptions: RequestOptions): Invoice =
        retrieve(invoiceId, InvoiceRetrieveParams.none(), requestOptions)

    /** Changes only the sent fields. `null` clears a field that can be empty. */
    suspend fun update(
        invoiceId: String,
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Lists invoice-led invoices, newest first. The items have no `lines` and no `payments`. */
    suspend fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): InvoiceListPageAsync =
        list(InvoiceListParams.none(), requestOptions)

    /** Delete a draft invoice */
    suspend fun delete(
        invoiceId: String,
        params: InvoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: InvoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A note changes no field, so it needs no `If-Match`. The note shows in `/events`. */
    suspend fun addNote(
        invoiceId: String,
        params: InvoiceAddNoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = addNote(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see addNote */
    suspend fun addNote(
        params: InvoiceAddNoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * Returns the page where the customer pays. A copied link counts as a send, so the first call
     * sets `sent_at`.
     */
    suspend fun createHostedLink(
        invoiceId: String,
        params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceCreateHostedLinkResponse =
        createHostedLink(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see createHostedLink */
    suspend fun createHostedLink(
        params: InvoiceCreateHostedLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceCreateHostedLinkResponse

    /** @see createHostedLink */
    suspend fun createHostedLink(
        invoiceId: String,
        requestOptions: RequestOptions,
    ): InvoiceCreateHostedLinkResponse =
        createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none(), requestOptions)

    /**
     * Copies the customer, the product lines, the terms and the recipients into a new draft. Usage
     * lines are not copied.
     */
    suspend fun duplicate(
        invoiceId: String,
        params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = duplicate(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see duplicate */
    suspend fun duplicate(
        params: InvoiceDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see duplicate */
    suspend fun duplicate(invoiceId: String, requestOptions: RequestOptions): Invoice =
        duplicate(invoiceId, InvoiceDuplicateParams.none(), requestOptions)

    /**
     * Issues the draft. With `send: true`, the invoice email goes out after the issue. A failed
     * send keeps the invoice issued. Call `/send` again with the new `ETag`.
     */
    suspend fun finalize(
        invoiceId: String,
        params: InvoiceFinalizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = finalize(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see finalize */
    suspend fun finalize(
        params: InvoiceFinalizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Returns the change history of the invoice, oldest first. */
    suspend fun listEvents(
        invoiceId: String,
        params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListEventsResponse =
        listEvents(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see listEvents */
    suspend fun listEvents(
        params: InvoiceListEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListEventsResponse

    /** @see listEvents */
    suspend fun listEvents(
        invoiceId: String,
        requestOptions: RequestOptions,
    ): InvoiceListEventsResponse =
        listEvents(invoiceId, InvoiceListEventsParams.none(), requestOptions)

    /** Mark an invoice uncollectable */
    suspend fun markUncollectable(
        invoiceId: String,
        params: InvoiceMarkUncollectableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = markUncollectable(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see markUncollectable */
    suspend fun markUncollectable(
        params: InvoiceMarkUncollectableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Prices the body as a draft and returns it. No row is saved. */
    suspend fun preview(
        params: InvoicePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Preview a draft invoice */
    suspend fun previewExisting(
        invoiceId: String,
        params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = previewExisting(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see previewExisting */
    suspend fun previewExisting(
        params: InvoicePreviewExistingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see previewExisting */
    suspend fun previewExisting(invoiceId: String, requestOptions: RequestOptions) =
        previewExisting(invoiceId, InvoicePreviewExistingParams.none(), requestOptions)

    /** Charges the saved payment method of the invoice subscription now. */
    suspend fun retry(
        invoiceId: String,
        params: InvoiceRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = retry(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see retry */
    suspend fun retry(
        params: InvoiceRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Emails the invoice to the customer email and the CC emails. */
    suspend fun send(
        invoiceId: String,
        params: InvoiceSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = send(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see send */
    suspend fun send(
        params: InvoiceSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Pauses, resumes or moves the reminders of an open or past-due invoice. */
    suspend fun updateDunning(
        invoiceId: String,
        params: InvoiceUpdateDunningParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = updateDunning(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see updateDunning */
    suspend fun updateDunning(
        params: InvoiceUpdateDunningParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** Closes an open or past-due invoice. Applied credits go back to the customer wallet. */
    suspend fun void(
        invoiceId: String,
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = void(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see void */
    suspend fun void(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InvoiceServiceAsync.WithRawResponse

        fun payments(): PaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /billing/invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            invoiceId: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            retrieve(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> =
            retrieve(invoiceId, InvoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            invoiceId: String,
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /billing/invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPageAsync> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /billing/invoices/{invoice_id}`, but is otherwise
         * the same as [InvoiceServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            invoiceId: String,
            params: InvoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: InvoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/notes`, but is
         * otherwise the same as [InvoiceServiceAsync.addNote].
         */
        @MustBeClosed
        suspend fun addNote(
            invoiceId: String,
            params: InvoiceAddNoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            addNote(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see addNote */
        @MustBeClosed
        suspend fun addNote(
            params: InvoiceAddNoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/hosted-link`, but is
         * otherwise the same as [InvoiceServiceAsync.createHostedLink].
         */
        @MustBeClosed
        suspend fun createHostedLink(
            invoiceId: String,
            params: InvoiceCreateHostedLinkParams = InvoiceCreateHostedLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse> =
            createHostedLink(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see createHostedLink */
        @MustBeClosed
        suspend fun createHostedLink(
            params: InvoiceCreateHostedLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse>

        /** @see createHostedLink */
        @MustBeClosed
        suspend fun createHostedLink(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceCreateHostedLinkResponse> =
            createHostedLink(invoiceId, InvoiceCreateHostedLinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/duplicate`, but is
         * otherwise the same as [InvoiceServiceAsync.duplicate].
         */
        @MustBeClosed
        suspend fun duplicate(
            invoiceId: String,
            params: InvoiceDuplicateParams = InvoiceDuplicateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            duplicate(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see duplicate */
        @MustBeClosed
        suspend fun duplicate(
            params: InvoiceDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see duplicate */
        @MustBeClosed
        suspend fun duplicate(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> =
            duplicate(invoiceId, InvoiceDuplicateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/finalize`, but is
         * otherwise the same as [InvoiceServiceAsync.finalize].
         */
        @MustBeClosed
        suspend fun finalize(
            invoiceId: String,
            params: InvoiceFinalizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            finalize(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see finalize */
        @MustBeClosed
        suspend fun finalize(
            params: InvoiceFinalizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}/events`, but is
         * otherwise the same as [InvoiceServiceAsync.listEvents].
         */
        @MustBeClosed
        suspend fun listEvents(
            invoiceId: String,
            params: InvoiceListEventsParams = InvoiceListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListEventsResponse> =
            listEvents(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see listEvents */
        @MustBeClosed
        suspend fun listEvents(
            params: InvoiceListEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListEventsResponse>

        /** @see listEvents */
        @MustBeClosed
        suspend fun listEvents(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceListEventsResponse> =
            listEvents(invoiceId, InvoiceListEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/mark-uncollectable`,
         * but is otherwise the same as [InvoiceServiceAsync.markUncollectable].
         */
        @MustBeClosed
        suspend fun markUncollectable(
            invoiceId: String,
            params: InvoiceMarkUncollectableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            markUncollectable(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see markUncollectable */
        @MustBeClosed
        suspend fun markUncollectable(
            params: InvoiceMarkUncollectableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/preview`, but is otherwise the
         * same as [InvoiceServiceAsync.preview].
         */
        @MustBeClosed
        suspend fun preview(
            params: InvoicePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /billing/invoices/{invoice_id}/preview`, but is
         * otherwise the same as [InvoiceServiceAsync.previewExisting].
         */
        @MustBeClosed
        suspend fun previewExisting(
            invoiceId: String,
            params: InvoicePreviewExistingParams = InvoicePreviewExistingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            previewExisting(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see previewExisting */
        @MustBeClosed
        suspend fun previewExisting(
            params: InvoicePreviewExistingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see previewExisting */
        @MustBeClosed
        suspend fun previewExisting(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            previewExisting(invoiceId, InvoicePreviewExistingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/retry`, but is
         * otherwise the same as [InvoiceServiceAsync.retry].
         */
        @MustBeClosed
        suspend fun retry(
            invoiceId: String,
            params: InvoiceRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            retry(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see retry */
        @MustBeClosed
        suspend fun retry(
            params: InvoiceRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/send`, but is
         * otherwise the same as [InvoiceServiceAsync.send].
         */
        @MustBeClosed
        suspend fun send(
            invoiceId: String,
            params: InvoiceSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            send(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        suspend fun send(
            params: InvoiceSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/dunning`, but is
         * otherwise the same as [InvoiceServiceAsync.updateDunning].
         */
        @MustBeClosed
        suspend fun updateDunning(
            invoiceId: String,
            params: InvoiceUpdateDunningParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            updateDunning(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see updateDunning */
        @MustBeClosed
        suspend fun updateDunning(
            params: InvoiceUpdateDunningParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /billing/invoices/{invoice_id}/void`, but is
         * otherwise the same as [InvoiceServiceAsync.void].
         */
        @MustBeClosed
        suspend fun void(
            invoiceId: String,
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            void(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see void */
        @MustBeClosed
        suspend fun void(
            params: InvoiceVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>
    }
}
