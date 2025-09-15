// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers.wallets

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.wallets.CustomerWallet
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryCreateParams
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListPageAsync
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListParams
import com.google.errorprone.annotations.MustBeClosed

interface LedgerEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerEntryServiceAsync

    suspend fun create(
        customerId: String,
        params: LedgerEntryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerWallet = create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: LedgerEntryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerWallet

    suspend fun list(
        customerId: String,
        params: LedgerEntryListParams = LedgerEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntryListPageAsync =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: LedgerEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntryListPageAsync

    /** @see list */
    suspend fun list(customerId: String, requestOptions: RequestOptions): LedgerEntryListPageAsync =
        list(customerId, LedgerEntryListParams.none(), requestOptions)

    /**
     * A view of [LedgerEntryServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/wallets/ledger-entries`,
         * but is otherwise the same as [LedgerEntryServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            customerId: String,
            params: LedgerEntryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerWallet> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: LedgerEntryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerWallet>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/wallets/ledger-entries`,
         * but is otherwise the same as [LedgerEntryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            params: LedgerEntryListParams = LedgerEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntryListPageAsync> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: LedgerEntryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntryListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerEntryListPageAsync> =
            list(customerId, LedgerEntryListParams.none(), requestOptions)
    }
}
