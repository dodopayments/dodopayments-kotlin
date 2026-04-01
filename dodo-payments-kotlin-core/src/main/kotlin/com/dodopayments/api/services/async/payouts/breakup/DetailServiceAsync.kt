// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.payouts.breakup

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.breakup.details.DetailDownloadCsvParams
import com.dodopayments.api.models.payouts.breakup.details.DetailListPageAsync
import com.dodopayments.api.models.payouts.breakup.details.DetailListParams
import com.google.errorprone.annotations.MustBeClosed

interface DetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DetailServiceAsync

    /**
     * Returns paginated individual balance ledger entries for a payout, with each entry's amount
     * pro-rated into the payout's currency. Supports pagination via `page_size` (default 10,
     * max 100) and `page_number` (default 0) query parameters.
     */
    suspend fun list(
        payoutId: String,
        params: DetailListParams = DetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailListPageAsync = list(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see list */
    suspend fun list(
        params: DetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailListPageAsync

    /** @see list */
    suspend fun list(payoutId: String, requestOptions: RequestOptions): DetailListPageAsync =
        list(payoutId, DetailListParams.none(), requestOptions)

    /**
     * Downloads the complete payout breakup as a CSV file. Each row represents a balance ledger
     * entry with columns: Ledger ID, Event Type, Original Amount, Original Currency, Reference
     * Object ID, Description, Created At, USD Equivalent Amount, and Payout Currency Amount.
     */
    suspend fun downloadCsv(
        payoutId: String,
        params: DetailDownloadCsvParams = DetailDownloadCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = downloadCsv(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see downloadCsv */
    suspend fun downloadCsv(
        params: DetailDownloadCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see downloadCsv */
    suspend fun downloadCsv(payoutId: String, requestOptions: RequestOptions) =
        downloadCsv(payoutId, DetailDownloadCsvParams.none(), requestOptions)

    /**
     * A view of [DetailServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup/details`, but is
         * otherwise the same as [DetailServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            payoutId: String,
            params: DetailListParams = DetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailListPageAsync> =
            list(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        suspend fun list(
            params: DetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            payoutId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailListPageAsync> =
            list(payoutId, DetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup/details/csv`, but is
         * otherwise the same as [DetailServiceAsync.downloadCsv].
         */
        @MustBeClosed
        suspend fun downloadCsv(
            payoutId: String,
            params: DetailDownloadCsvParams = DetailDownloadCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = downloadCsv(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see downloadCsv */
        @MustBeClosed
        suspend fun downloadCsv(
            params: DetailDownloadCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see downloadCsv */
        @MustBeClosed
        suspend fun downloadCsv(payoutId: String, requestOptions: RequestOptions): HttpResponse =
            downloadCsv(payoutId, DetailDownloadCsvParams.none(), requestOptions)
    }
}
