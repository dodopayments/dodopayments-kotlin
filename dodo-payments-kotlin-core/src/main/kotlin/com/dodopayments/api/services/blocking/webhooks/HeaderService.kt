// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.webhooks

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhooks.headers.HeaderRetrieveParams
import com.dodopayments.api.models.webhooks.headers.HeaderRetrieveResponse
import com.dodopayments.api.models.webhooks.headers.HeaderUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface HeaderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HeaderService

    /** Get a webhook by id */
    fun retrieve(
        webhookId: String,
        params: HeaderRetrieveParams = HeaderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HeaderRetrieveResponse =
        retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: HeaderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HeaderRetrieveResponse

    /** @see retrieve */
    fun retrieve(webhookId: String, requestOptions: RequestOptions): HeaderRetrieveResponse =
        retrieve(webhookId, HeaderRetrieveParams.none(), requestOptions)

    /** Patch a webhook by id */
    fun update(
        webhookId: String,
        params: HeaderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(params: HeaderUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [HeaderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HeaderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}/headers`, but is otherwise
         * the same as [HeaderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            params: HeaderRetrieveParams = HeaderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HeaderRetrieveResponse> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HeaderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HeaderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HeaderRetrieveResponse> =
            retrieve(webhookId, HeaderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/{webhook_id}/headers`, but is otherwise
         * the same as [HeaderService.update].
         */
        @MustBeClosed
        fun update(
            webhookId: String,
            params: HeaderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: HeaderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
