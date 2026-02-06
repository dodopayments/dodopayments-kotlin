// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerPageAsync
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerParams
import com.google.errorprone.annotations.MustBeClosed

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceServiceAsync

    suspend fun retrieveLedger(
        params: BalanceRetrieveLedgerParams = BalanceRetrieveLedgerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceRetrieveLedgerPageAsync

    /** @see retrieveLedger */
    suspend fun retrieveLedger(requestOptions: RequestOptions): BalanceRetrieveLedgerPageAsync =
        retrieveLedger(BalanceRetrieveLedgerParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /balances/ledger`, but is otherwise the same as
         * [BalanceServiceAsync.retrieveLedger].
         */
        @MustBeClosed
        suspend fun retrieveLedger(
            params: BalanceRetrieveLedgerParams = BalanceRetrieveLedgerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceRetrieveLedgerPageAsync>

        /** @see retrieveLedger */
        @MustBeClosed
        suspend fun retrieveLedger(
            requestOptions: RequestOptions
        ): HttpResponseFor<BalanceRetrieveLedgerPageAsync> =
            retrieveLedger(BalanceRetrieveLedgerParams.none(), requestOptions)
    }
}
