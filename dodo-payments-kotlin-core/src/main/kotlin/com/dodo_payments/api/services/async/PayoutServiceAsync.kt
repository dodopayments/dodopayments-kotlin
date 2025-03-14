// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.payouts.PayoutListPageAsync
import com.dodo_payments.api.models.payouts.PayoutListParams
import com.google.errorprone.annotations.MustBeClosed

interface PayoutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun list(
        params: PayoutListParams = PayoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayoutListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PayoutListPageAsync =
        list(PayoutListParams.none(), requestOptions)

    /**
     * A view of [PayoutServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /payouts`, but is otherwise the same as
         * [PayoutServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PayoutListParams = PayoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayoutListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PayoutListPageAsync> =
            list(PayoutListParams.none(), requestOptions)
    }
}
