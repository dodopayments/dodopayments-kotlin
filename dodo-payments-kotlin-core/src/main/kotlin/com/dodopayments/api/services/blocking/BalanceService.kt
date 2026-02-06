// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerPage
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerParams
import com.google.errorprone.annotations.MustBeClosed

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceService

    fun retrieveLedger(
        params: BalanceRetrieveLedgerParams = BalanceRetrieveLedgerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceRetrieveLedgerPage

    /** @see retrieveLedger */
    fun retrieveLedger(requestOptions: RequestOptions): BalanceRetrieveLedgerPage =
        retrieveLedger(BalanceRetrieveLedgerParams.none(), requestOptions)

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /balances/ledger`, but is otherwise the same as
         * [BalanceService.retrieveLedger].
         */
        @MustBeClosed
        fun retrieveLedger(
            params: BalanceRetrieveLedgerParams = BalanceRetrieveLedgerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceRetrieveLedgerPage>

        /** @see retrieveLedger */
        @MustBeClosed
        fun retrieveLedger(
            requestOptions: RequestOptions
        ): HttpResponseFor<BalanceRetrieveLedgerPage> =
            retrieveLedger(BalanceRetrieveLedgerParams.none(), requestOptions)
    }
}
