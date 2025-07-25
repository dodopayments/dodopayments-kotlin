// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhookevents.WebhookEvent
import com.dodopayments.api.models.webhookevents.WebhookEventListPageAsync
import com.dodopayments.api.models.webhookevents.WebhookEventListParams
import com.dodopayments.api.models.webhookevents.WebhookEventRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface WebhookEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookEventServiceAsync

    @Deprecated("deprecated")
    suspend fun retrieve(
        webhookEventId: String,
        params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEvent =
        retrieve(params.toBuilder().webhookEventId(webhookEventId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    suspend fun retrieve(
        params: WebhookEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEvent

    /** @see retrieve */
    @Deprecated("deprecated")
    suspend fun retrieve(webhookEventId: String, requestOptions: RequestOptions): WebhookEvent =
        retrieve(webhookEventId, WebhookEventRetrieveParams.none(), requestOptions)

    suspend fun list(
        params: WebhookEventListParams = WebhookEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEventListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): WebhookEventListPageAsync =
        list(WebhookEventListParams.none(), requestOptions)

    /**
     * A view of [WebhookEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhook_events/{webhook_event_id}`, but is
         * otherwise the same as [WebhookEventServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            webhookEventId: String,
            params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEvent> =
            retrieve(params.toBuilder().webhookEventId(webhookEventId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            params: WebhookEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEvent>

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            webhookEventId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEvent> =
            retrieve(webhookEventId, WebhookEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhook_events`, but is otherwise the same as
         * [WebhookEventServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: WebhookEventListParams = WebhookEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEventListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<WebhookEventListPageAsync> =
            list(WebhookEventListParams.none(), requestOptions)
    }
}
