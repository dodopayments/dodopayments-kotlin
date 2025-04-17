// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.disputes.Dispute
import com.dodo_payments.api.models.disputes.DisputeListPageAsync
import com.dodo_payments.api.models.disputes.DisputeListParams
import com.dodo_payments.api.models.disputes.DisputeRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface DisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dispute

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
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dispute>

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
