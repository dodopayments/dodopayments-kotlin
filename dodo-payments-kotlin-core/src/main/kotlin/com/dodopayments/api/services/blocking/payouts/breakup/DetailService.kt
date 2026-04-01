// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.payouts.breakup

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.breakup.details.DetailDownloadCsvParams
import com.dodopayments.api.models.payouts.breakup.details.DetailListPage
import com.dodopayments.api.models.payouts.breakup.details.DetailListParams
import com.google.errorprone.annotations.MustBeClosed

interface DetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DetailService

    /**
     * Returns paginated individual balance ledger entries for a payout, with each entry's amount
     * pro-rated into the payout's currency. Supports pagination via `page_size` (default 10,
     * max 100) and `page_number` (default 0) query parameters.
     */
    fun list(
        payoutId: String,
        params: DetailListParams = DetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailListPage = list(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see list */
    fun list(
        params: DetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetailListPage

    /** @see list */
    fun list(payoutId: String, requestOptions: RequestOptions): DetailListPage =
        list(payoutId, DetailListParams.none(), requestOptions)

    /**
     * Downloads the complete payout breakup as a CSV file. Each row represents a balance ledger
     * entry with columns: Ledger ID, Event Type, Original Amount, Original Currency, Reference
     * Object ID, Description, Created At, USD Equivalent Amount, and Payout Currency Amount.
     */
    fun downloadCsv(
        payoutId: String,
        params: DetailDownloadCsvParams = DetailDownloadCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = downloadCsv(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see downloadCsv */
    fun downloadCsv(
        params: DetailDownloadCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see downloadCsv */
    fun downloadCsv(payoutId: String, requestOptions: RequestOptions) =
        downloadCsv(payoutId, DetailDownloadCsvParams.none(), requestOptions)

    /** A view of [DetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup/details`, but is
         * otherwise the same as [DetailService.list].
         */
        @MustBeClosed
        fun list(
            payoutId: String,
            params: DetailListParams = DetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailListPage> =
            list(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: DetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetailListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            payoutId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailListPage> = list(payoutId, DetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup/details/csv`, but is
         * otherwise the same as [DetailService.downloadCsv].
         */
        @MustBeClosed
        fun downloadCsv(
            payoutId: String,
            params: DetailDownloadCsvParams = DetailDownloadCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = downloadCsv(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see downloadCsv */
        @MustBeClosed
        fun downloadCsv(
            params: DetailDownloadCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see downloadCsv */
        @MustBeClosed
        fun downloadCsv(payoutId: String, requestOptions: RequestOptions): HttpResponse =
            downloadCsv(payoutId, DetailDownloadCsvParams.none(), requestOptions)
    }
}
