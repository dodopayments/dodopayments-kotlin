// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.PayoutListPageAsync
import com.dodopayments.api.models.payouts.PayoutListParams
import com.google.errorprone.annotations.MustBeClosed

interface PayoutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PayoutServiceAsync

    suspend fun list(
        params: PayoutListParams = PayoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayoutListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PayoutListPageAsync =
        list(PayoutListParams.none(), requestOptions)

    /**
     * A view of [PayoutServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PayoutServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payouts`, but is otherwise the same as
         * [PayoutServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PayoutListParams = PayoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayoutListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PayoutListPageAsync> =
            list(PayoutListParams.none(), requestOptions)
    }
}
