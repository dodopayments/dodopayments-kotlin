// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.licensekeys.LicenseKey
import com.dodo_payments.api.models.licensekeys.LicenseKeyListPageAsync
import com.dodo_payments.api.models.licensekeys.LicenseKeyListParams
import com.dodo_payments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodo_payments.api.models.licensekeys.LicenseKeyUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface LicenseKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        params: LicenseKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    suspend fun update(
        params: LicenseKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    suspend fun list(
        params: LicenseKeyListParams = LicenseKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): LicenseKeyListPageAsync =
        list(LicenseKeyListParams.none(), requestOptions)

    /**
     * A view of [LicenseKeyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: LicenseKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /**
         * Returns a raw HTTP response for `patch /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: LicenseKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /**
         * Returns a raw HTTP response for `get /license_keys`, but is otherwise the same as
         * [LicenseKeyServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<LicenseKeyListPageAsync> =
            list(LicenseKeyListParams.none(), requestOptions)
    }
}
