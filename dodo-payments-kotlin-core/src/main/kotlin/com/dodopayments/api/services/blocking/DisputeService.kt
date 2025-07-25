// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.disputes.DisputeListPage
import com.dodopayments.api.models.disputes.DisputeListParams
import com.dodopayments.api.models.disputes.DisputeRetrieveParams
import com.dodopayments.api.models.disputes.GetDispute
import com.google.errorprone.annotations.MustBeClosed

interface DisputeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DisputeService

    fun retrieve(
        disputeId: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetDispute = retrieve(params.toBuilder().disputeId(disputeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetDispute

    /** @see retrieve */
    fun retrieve(disputeId: String, requestOptions: RequestOptions): GetDispute =
        retrieve(disputeId, DisputeRetrieveParams.none(), requestOptions)

    fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): DisputeListPage =
        list(DisputeListParams.none(), requestOptions)

    /** A view of [DisputeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DisputeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /disputes/{dispute_id}`, but is otherwise the same
         * as [DisputeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            disputeId: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetDispute> =
            retrieve(params.toBuilder().disputeId(disputeId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetDispute>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            disputeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GetDispute> =
            retrieve(disputeId, DisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /disputes`, but is otherwise the same as
         * [DisputeService.list].
         */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DisputeListPage> =
            list(DisputeListParams.none(), requestOptions)
    }
}
