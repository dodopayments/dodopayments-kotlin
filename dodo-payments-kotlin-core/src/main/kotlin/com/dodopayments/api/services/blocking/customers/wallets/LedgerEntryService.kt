// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers.wallets

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.wallets.CustomerWallet
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryCreateParams
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListPage
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListParams
import com.google.errorprone.annotations.MustBeClosed

interface LedgerEntryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerEntryService

    fun create(
        customerId: String,
        params: LedgerEntryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerWallet = create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    fun create(
        params: LedgerEntryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerWallet

    fun list(
        customerId: String,
        params: LedgerEntryListParams = LedgerEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntryListPage = list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        params: LedgerEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntryListPage

    /** @see list */
    fun list(customerId: String, requestOptions: RequestOptions): LedgerEntryListPage =
        list(customerId, LedgerEntryListParams.none(), requestOptions)

    /**
     * A view of [LedgerEntryService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerEntryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/wallets/ledger-entries`,
         * but is otherwise the same as [LedgerEntryService.create].
         */
        @MustBeClosed
        fun create(
            customerId: String,
            params: LedgerEntryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerWallet> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: LedgerEntryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerWallet>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/wallets/ledger-entries`,
         * but is otherwise the same as [LedgerEntryService.list].
         */
        @MustBeClosed
        fun list(
            customerId: String,
            params: LedgerEntryListParams = LedgerEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntryListPage> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: LedgerEntryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntryListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerEntryListPage> =
            list(customerId, LedgerEntryListParams.none(), requestOptions)
    }
}
