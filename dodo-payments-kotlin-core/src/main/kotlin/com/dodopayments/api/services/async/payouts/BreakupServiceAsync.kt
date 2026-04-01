// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.payouts

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveParams
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveResponse
import com.dodopayments.api.services.async.payouts.breakup.DetailServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface BreakupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BreakupServiceAsync

    fun details(): DetailServiceAsync

    /**
     * Returns the breakdown of a payout by event type (payments, refunds, disputes, fees, etc.) in
     * the payout's currency. Each amount is proportionally allocated based on USD equivalent
     * values, ensuring the total sums exactly to the payout amount.
     */
    suspend fun retrieve(
        payoutId: String,
        params: BreakupRetrieveParams = BreakupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BreakupRetrieveResponse> =
        retrieve(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: BreakupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BreakupRetrieveResponse>

    /** @see retrieve */
    suspend fun retrieve(
        payoutId: String,
        requestOptions: RequestOptions,
    ): List<BreakupRetrieveResponse> =
        retrieve(payoutId, BreakupRetrieveParams.none(), requestOptions)

    /**
     * A view of [BreakupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BreakupServiceAsync.WithRawResponse

        fun details(): DetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup`, but is otherwise the
         * same as [BreakupServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            payoutId: String,
            params: BreakupRetrieveParams = BreakupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BreakupRetrieveResponse>> =
            retrieve(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: BreakupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BreakupRetrieveResponse>>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            payoutId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BreakupRetrieveResponse>> =
            retrieve(payoutId, BreakupRetrieveParams.none(), requestOptions)
    }
}
