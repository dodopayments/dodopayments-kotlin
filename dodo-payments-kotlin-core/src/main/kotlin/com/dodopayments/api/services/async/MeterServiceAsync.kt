// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.meters.Meter
import com.dodopayments.api.models.meters.MeterArchiveParams
import com.dodopayments.api.models.meters.MeterCreateParams
import com.dodopayments.api.models.meters.MeterListPageAsync
import com.dodopayments.api.models.meters.MeterListParams
import com.dodopayments.api.models.meters.MeterRetrieveParams
import com.dodopayments.api.models.meters.MeterUnarchiveParams
import com.google.errorprone.annotations.MustBeClosed

interface MeterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeterServiceAsync

    suspend fun create(
        params: MeterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Meter

    suspend fun retrieve(
        id: String,
        params: MeterRetrieveParams = MeterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Meter = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Meter

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Meter =
        retrieve(id, MeterRetrieveParams.none(), requestOptions)

    suspend fun list(
        params: MeterListParams = MeterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeterListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): MeterListPageAsync =
        list(MeterListParams.none(), requestOptions)

    suspend fun archive(
        id: String,
        params: MeterArchiveParams = MeterArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    suspend fun archive(
        params: MeterArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    suspend fun archive(id: String, requestOptions: RequestOptions) =
        archive(id, MeterArchiveParams.none(), requestOptions)

    suspend fun unarchive(
        id: String,
        params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    suspend fun unarchive(
        params: MeterUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unarchive */
    suspend fun unarchive(id: String, requestOptions: RequestOptions) =
        unarchive(id, MeterUnarchiveParams.none(), requestOptions)

    /** A view of [MeterServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MeterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /meters`, but is otherwise the same as
         * [MeterServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Meter>

        /**
         * Returns a raw HTTP response for `get /meters/{id}`, but is otherwise the same as
         * [MeterServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: MeterRetrieveParams = MeterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Meter> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Meter>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Meter> =
            retrieve(id, MeterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /meters`, but is otherwise the same as
         * [MeterServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: MeterListParams = MeterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeterListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<MeterListPageAsync> =
            list(MeterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /meters/{id}`, but is otherwise the same as
         * [MeterServiceAsync.archive].
         */
        @MustBeClosed
        suspend fun archive(
            id: String,
            params: MeterArchiveParams = MeterArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        suspend fun archive(
            params: MeterArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        suspend fun archive(id: String, requestOptions: RequestOptions): HttpResponse =
            archive(id, MeterArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /meters/{id}/unarchive`, but is otherwise the same
         * as [MeterServiceAsync.unarchive].
         */
        @MustBeClosed
        suspend fun unarchive(
            id: String,
            params: MeterUnarchiveParams = MeterUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        suspend fun unarchive(
            params: MeterUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unarchive */
        @MustBeClosed
        suspend fun unarchive(id: String, requestOptions: RequestOptions): HttpResponse =
            unarchive(id, MeterUnarchiveParams.none(), requestOptions)
    }
}
