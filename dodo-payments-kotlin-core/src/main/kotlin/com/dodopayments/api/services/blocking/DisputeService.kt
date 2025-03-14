// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeListPage
import com.dodopayments.api.models.disputes.DisputeListParams
import com.dodopayments.api.models.disputes.DisputeRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface DisputeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dispute

    fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DisputeListPage =
        list(DisputeListParams.none(), requestOptions)

    /** A view of [DisputeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /disputes/{dispute_id}`, but is otherwise the same
         * as [DisputeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dispute>

        /**
         * Returns a raw HTTP response for `get /disputes`, but is otherwise the same as
         * [DisputeService.list].
         */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DisputeListPage> =
            list(DisputeListParams.none(), requestOptions)
    }
}
