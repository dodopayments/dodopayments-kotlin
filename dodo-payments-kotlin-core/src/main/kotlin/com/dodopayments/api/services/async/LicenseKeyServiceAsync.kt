// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeys.LicenseKey
import com.dodopayments.api.models.licensekeys.LicenseKeyCreateParams
import com.dodopayments.api.models.licensekeys.LicenseKeyListPageAsync
import com.dodopayments.api.models.licensekeys.LicenseKeyListParams
import com.dodopayments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodopayments.api.models.licensekeys.LicenseKeyUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface LicenseKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LicenseKeyServiceAsync

    suspend fun create(
        params: LicenseKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    @Deprecated("deprecated")
    suspend fun retrieve(
        id: String,
        params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    suspend fun retrieve(
        params: LicenseKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    /** @see retrieve */
    @Deprecated("deprecated")
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LicenseKey =
        retrieve(id, LicenseKeyRetrieveParams.none(), requestOptions)

    @Deprecated("deprecated")
    suspend fun update(
        id: String,
        params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    @Deprecated("deprecated")
    suspend fun update(
        params: LicenseKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    /** @see update */
    @Deprecated("deprecated")
    suspend fun update(id: String, requestOptions: RequestOptions): LicenseKey =
        update(id, LicenseKeyUpdateParams.none(), requestOptions)

    @Deprecated("deprecated")
    suspend fun list(
        params: LicenseKeyListParams = LicenseKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyListPageAsync

    /** @see list */
    @Deprecated("deprecated")
    suspend fun list(requestOptions: RequestOptions): LicenseKeyListPageAsync =
        list(LicenseKeyListParams.none(), requestOptions)

    /**
     * A view of [LicenseKeyServiceAsync] that provides access to raw HTTP responses for each
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
        ): LicenseKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /license_keys`, but is otherwise the same as
         * [LicenseKeyServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LicenseKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /**
         * Returns a raw HTTP response for `get /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            params: LicenseKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKey> =
            retrieve(id, LicenseKeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyServiceAsync.update].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun update(
            params: LicenseKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKey> = update(id, LicenseKeyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /license_keys`, but is otherwise the same as
         * [LicenseKeyServiceAsync.list].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyListPageAsync>

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<LicenseKeyListPageAsync> =
            list(LicenseKeyListParams.none(), requestOptions)
    }
}
