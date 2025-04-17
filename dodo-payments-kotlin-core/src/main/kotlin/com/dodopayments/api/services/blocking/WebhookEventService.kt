// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhookevents.WebhookEvent
import com.dodopayments.api.models.webhookevents.WebhookEventListPage
import com.dodopayments.api.models.webhookevents.WebhookEventListParams
import com.dodopayments.api.models.webhookevents.WebhookEventRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface WebhookEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(
        params: WebhookEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEvent

    fun list(
        params: WebhookEventListParams = WebhookEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEventListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): WebhookEventListPage =
        list(WebhookEventListParams.none(), requestOptions)

    /**
     * A view of [WebhookEventService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /webhook_events/{webhook_event_id}`, but is
         * otherwise the same as [WebhookEventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: WebhookEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEvent>

        /**
         * Returns a raw HTTP response for `get /webhook_events`, but is otherwise the same as
         * [WebhookEventService.list].
         */
        @MustBeClosed
        fun list(
            params: WebhookEventListParams = WebhookEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEventListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookEventListPage> =
            list(WebhookEventListParams.none(), requestOptions)
    }
}
