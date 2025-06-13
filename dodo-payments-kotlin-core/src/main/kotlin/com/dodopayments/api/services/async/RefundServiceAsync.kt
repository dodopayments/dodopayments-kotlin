// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundCreateParams
import com.dodopayments.api.models.refunds.RefundListPageAsync
import com.dodopayments.api.models.refunds.RefundListParams
import com.dodopayments.api.models.refunds.RefundRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface RefundServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RefundServiceAsync

    suspend fun create(
        params: RefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    suspend fun retrieve(
        refundId: String,
        params: RefundRetrieveParams = RefundRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund = retrieve(params.toBuilder().refundId(refundId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: RefundRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    /** @see [retrieve] */
    suspend fun retrieve(refundId: String, requestOptions: RequestOptions): Refund =
        retrieve(refundId, RefundRetrieveParams.none(), requestOptions)

    suspend fun list(
        params: RefundListParams = RefundListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RefundListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): RefundListPageAsync =
        list(RefundListParams.none(), requestOptions)

    /**
     * A view of [RefundServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RefundServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /refunds`, but is otherwise the same as
         * [RefundServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: RefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

        /**
         * Returns a raw HTTP response for `get /refunds/{refund_id}`, but is otherwise the same as
         * [RefundServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            refundId: String,
            params: RefundRetrieveParams = RefundRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund> =
            retrieve(params.toBuilder().refundId(refundId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: RefundRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            refundId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Refund> = retrieve(refundId, RefundRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /refunds`, but is otherwise the same as
         * [RefundServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RefundListParams = RefundListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RefundListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<RefundListPageAsync> =
            list(RefundListParams.none(), requestOptions)
    }
}
