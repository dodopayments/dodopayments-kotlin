// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundCreateParams
import com.dodopayments.api.models.refunds.RefundListPage
import com.dodopayments.api.models.refunds.RefundListParams
import com.dodopayments.api.models.refunds.RefundRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface RefundService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RefundService

    fun create(
        params: RefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    fun retrieve(
        refundId: String,
        params: RefundRetrieveParams = RefundRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund = retrieve(params.toBuilder().refundId(refundId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: RefundRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    /** @see retrieve */
    fun retrieve(refundId: String, requestOptions: RequestOptions): Refund =
        retrieve(refundId, RefundRetrieveParams.none(), requestOptions)

    fun list(
        params: RefundListParams = RefundListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RefundListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): RefundListPage =
        list(RefundListParams.none(), requestOptions)

    /** A view of [RefundService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RefundService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /refunds`, but is otherwise the same as
         * [RefundService.create].
         */
        @MustBeClosed
        fun create(
            params: RefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

        /**
         * Returns a raw HTTP response for `get /refunds/{refund_id}`, but is otherwise the same as
         * [RefundService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            refundId: String,
            params: RefundRetrieveParams = RefundRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund> =
            retrieve(params.toBuilder().refundId(refundId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RefundRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(refundId: String, requestOptions: RequestOptions): HttpResponseFor<Refund> =
            retrieve(refundId, RefundRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /refunds`, but is otherwise the same as
         * [RefundService.list].
         */
        @MustBeClosed
        fun list(
            params: RefundListParams = RefundListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RefundListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RefundListPage> =
            list(RefundListParams.none(), requestOptions)
    }
}
