// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

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

    suspend fun create(
        params: RefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    suspend fun retrieve(
        params: RefundRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

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
            params: RefundRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

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
