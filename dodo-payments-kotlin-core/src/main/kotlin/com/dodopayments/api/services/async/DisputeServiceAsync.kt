// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.disputes.DisputeListPageAsync
import com.dodopayments.api.models.disputes.DisputeListParams
import com.dodopayments.api.models.disputes.DisputeRetrieveParams
import com.dodopayments.api.models.disputes.DisputeRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed

interface DisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        disputeId: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeRetrieveResponse =
        retrieve(params.toBuilder().disputeId(disputeId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        disputeId: String,
        requestOptions: RequestOptions,
    ): DisputeRetrieveResponse = retrieve(disputeId, DisputeRetrieveParams.none(), requestOptions)

    suspend fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): DisputeListPageAsync =
        list(DisputeListParams.none(), requestOptions)

    /**
     * A view of [DisputeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /disputes/{dispute_id}`, but is otherwise the same
         * as [DisputeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            disputeId: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(params.toBuilder().disputeId(disputeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            disputeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeRetrieveResponse> =
            retrieve(disputeId, DisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /disputes`, but is otherwise the same as
         * [DisputeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DisputeListPageAsync> =
            list(DisputeListParams.none(), requestOptions)
    }
}
