// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeys.LicenseKey
import com.dodopayments.api.models.licensekeys.LicenseKeyListParams
import com.dodopayments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodopayments.api.models.licensekeys.LicenseKeyUpdateParams
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
    ): List<ListLicenseKeysResponse>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ListLicenseKeysResponse> =
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
        ): HttpResponseFor<List<ListLicenseKeysResponse>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ListLicenseKeysResponse>> =
            list(LicenseKeyListParams.none(), requestOptions)
    }
}
