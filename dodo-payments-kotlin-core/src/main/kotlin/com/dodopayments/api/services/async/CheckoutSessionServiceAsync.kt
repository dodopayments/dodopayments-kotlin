// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionCreateParams
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionRequest
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionResponse
import com.google.errorprone.annotations.MustBeClosed

interface CheckoutSessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckoutSessionServiceAsync

    suspend fun create(
        params: CheckoutSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckoutSessionResponse

    /** @see create */
    suspend fun create(
        checkoutSessionRequest: CheckoutSessionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckoutSessionResponse =
        create(
            CheckoutSessionCreateParams.builder()
                .checkoutSessionRequest(checkoutSessionRequest)
                .build(),
            requestOptions,
        )

    /**
     * A view of [CheckoutSessionServiceAsync] that provides access to raw HTTP responses for each
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
        ): CheckoutSessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /checkouts`, but is otherwise the same as
         * [CheckoutSessionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CheckoutSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckoutSessionResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            checkoutSessionRequest: CheckoutSessionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckoutSessionResponse> =
            create(
                CheckoutSessionCreateParams.builder()
                    .checkoutSessionRequest(checkoutSessionRequest)
                    .build(),
                requestOptions,
            )
    }
}
