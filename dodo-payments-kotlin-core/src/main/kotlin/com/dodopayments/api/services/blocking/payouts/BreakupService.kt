// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.payouts

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveParams
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveResponse
import com.dodopayments.api.services.blocking.payouts.breakup.DetailService
import com.google.errorprone.annotations.MustBeClosed

interface BreakupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BreakupService

    fun details(): DetailService

    /**
     * Returns the breakdown of a payout by event type (payments, refunds, disputes, fees, etc.) in
     * the payout's currency. Each amount is proportionally allocated based on USD equivalent
     * values, ensuring the total sums exactly to the payout amount.
     */
    fun retrieve(
        payoutId: String,
        params: BreakupRetrieveParams = BreakupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BreakupRetrieveResponse> =
        retrieve(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BreakupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BreakupRetrieveResponse>

    /** @see retrieve */
    fun retrieve(payoutId: String, requestOptions: RequestOptions): List<BreakupRetrieveResponse> =
        retrieve(payoutId, BreakupRetrieveParams.none(), requestOptions)

    /** A view of [BreakupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BreakupService.WithRawResponse

        fun details(): DetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup`, but is otherwise the
         * same as [BreakupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            payoutId: String,
            params: BreakupRetrieveParams = BreakupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BreakupRetrieveResponse>> =
            retrieve(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BreakupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BreakupRetrieveResponse>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            payoutId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BreakupRetrieveResponse>> =
            retrieve(payoutId, BreakupRetrieveParams.none(), requestOptions)
    }
}
