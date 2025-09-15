// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhooks.WebhookCreateParams
import com.dodopayments.api.models.webhooks.WebhookDeleteParams
import com.dodopayments.api.models.webhooks.WebhookDetails
import com.dodopayments.api.models.webhooks.WebhookListPageAsync
import com.dodopayments.api.models.webhooks.WebhookListParams
import com.dodopayments.api.models.webhooks.WebhookRetrieveParams
import com.dodopayments.api.models.webhooks.WebhookRetrieveSecretParams
import com.dodopayments.api.models.webhooks.WebhookRetrieveSecretResponse
import com.dodopayments.api.models.webhooks.WebhookUpdateParams
import com.dodopayments.api.services.async.webhooks.HeaderServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookServiceAsync

    fun headers(): HeaderServiceAsync

    /** Create a new webhook */
    suspend fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDetails

    /** Get a webhook by id */
    suspend fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDetails = retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDetails

    /** @see retrieve */
    suspend fun retrieve(webhookId: String, requestOptions: RequestOptions): WebhookDetails =
        retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

    /** Patch a webhook by id */
    suspend fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDetails = update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDetails

    /** @see update */
    suspend fun update(webhookId: String, requestOptions: RequestOptions): WebhookDetails =
        update(webhookId, WebhookUpdateParams.none(), requestOptions)

    /** List all webhooks */
    suspend fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): WebhookListPageAsync =
        list(WebhookListParams.none(), requestOptions)

    /** Delete a webhook by id */
    suspend fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(webhookId: String, requestOptions: RequestOptions) =
        delete(webhookId, WebhookDeleteParams.none(), requestOptions)

    /** Get webhook secret by id */
    suspend fun retrieveSecret(
        webhookId: String,
        params: WebhookRetrieveSecretParams = WebhookRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookRetrieveSecretResponse =
        retrieveSecret(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieveSecret */
    suspend fun retrieveSecret(
        params: WebhookRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookRetrieveSecretResponse

    /** @see retrieveSecret */
    suspend fun retrieveSecret(
        webhookId: String,
        requestOptions: RequestOptions,
    ): WebhookRetrieveSecretResponse =
        retrieveSecret(webhookId, WebhookRetrieveSecretParams.none(), requestOptions)

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookServiceAsync.WithRawResponse

        fun headers(): HeaderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDetails>

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}`, but is otherwise the same
         * as [WebhookServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDetails> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDetails>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDetails> =
            retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/{webhook_id}`, but is otherwise the same
         * as [WebhookServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDetails> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDetails>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDetails> =
            update(webhookId, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookListPageAsync> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/{webhook_id}`, but is otherwise the
         * same as [WebhookServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(webhookId: String, requestOptions: RequestOptions): HttpResponse =
            delete(webhookId, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}/secret`, but is otherwise the
         * same as [WebhookServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        suspend fun retrieveSecret(
            webhookId: String,
            params: WebhookRetrieveSecretParams = WebhookRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookRetrieveSecretResponse> =
            retrieveSecret(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieveSecret */
        @MustBeClosed
        suspend fun retrieveSecret(
            params: WebhookRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookRetrieveSecretResponse>

        /** @see retrieveSecret */
        @MustBeClosed
        suspend fun retrieveSecret(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookRetrieveSecretResponse> =
            retrieveSecret(webhookId, WebhookRetrieveSecretParams.none(), requestOptions)
    }
}
