// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.webhookevents.WebhookEvent
import com.dodo_payments.api.models.webhookevents.WebhookEventListPageAsync
import com.dodo_payments.api.models.webhookevents.WebhookEventListParams
import com.dodo_payments.api.models.webhookevents.WebhookEventRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface WebhookEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        params: WebhookEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEvent

    suspend fun list(
        params: WebhookEventListParams = WebhookEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEventListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): WebhookEventListPageAsync =
        list(WebhookEventListParams.none(), requestOptions)

    /**
     * A view of [WebhookEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /webhook_events/{webhook_event_id}`, but is
         * otherwise the same as [WebhookEventServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: WebhookEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEvent>

        /**
         * Returns a raw HTTP response for `get /webhook_events`, but is otherwise the same as
         * [WebhookEventServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: WebhookEventListParams = WebhookEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEventListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<WebhookEventListPageAsync> =
            list(WebhookEventListParams.none(), requestOptions)
    }
}
