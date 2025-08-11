// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhooks.WebhookCreateParams
import com.dodopayments.api.models.webhooks.WebhookCreateResponse
import com.dodopayments.api.models.webhooks.WebhookDeleteParams
import com.dodopayments.api.models.webhooks.WebhookListPage
import com.dodopayments.api.models.webhooks.WebhookListParams
import com.dodopayments.api.models.webhooks.WebhookRetrieveParams
import com.dodopayments.api.models.webhooks.WebhookRetrieveResponse
import com.dodopayments.api.models.webhooks.WebhookUpdateParams
import com.dodopayments.api.models.webhooks.WebhookUpdateResponse
import com.dodopayments.api.services.blocking.webhooks.HeaderService
import com.google.errorprone.annotations.MustBeClosed

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService

    fun headers(): HeaderService

    /** Create a new webhook */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookCreateResponse

    /** Get a webhook by id */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookRetrieveResponse =
        retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookRetrieveResponse

    /** @see retrieve */
    fun retrieve(webhookId: String, requestOptions: RequestOptions): WebhookRetrieveResponse =
        retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

    /** Patch a webhook by id */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookUpdateResponse =
        update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookUpdateResponse

    /** @see update */
    fun update(webhookId: String, requestOptions: RequestOptions): WebhookUpdateResponse =
        update(webhookId, WebhookUpdateParams.none(), requestOptions)

    /** List all webhooks */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): WebhookListPage =
        list(WebhookListParams.none(), requestOptions)

    /** Delete a webhook by id */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(params: WebhookDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(webhookId: String, requestOptions: RequestOptions) =
        delete(webhookId, WebhookDeleteParams.none(), requestOptions)

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookService.WithRawResponse

        fun headers(): HeaderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks`, but is otherwise the same as
         * [WebhookService.create].
         */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookCreateResponse>

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}`, but is otherwise the same
         * as [WebhookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookRetrieveResponse> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookRetrieveResponse> =
            retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/{webhook_id}`, but is otherwise the same
         * as [WebhookService.update].
         */
        @MustBeClosed
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookUpdateResponse> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookUpdateResponse> =
            update(webhookId, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks`, but is otherwise the same as
         * [WebhookService.list].
         */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookListPage> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/{webhook_id}`, but is otherwise the
         * same as [WebhookService.delete].
         */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(webhookId: String, requestOptions: RequestOptions): HttpResponse =
            delete(webhookId, WebhookDeleteParams.none(), requestOptions)
    }
}
