// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeys.LicenseKey
import com.dodopayments.api.models.licensekeys.LicenseKeyListParams
import com.dodopayments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodopayments.api.models.licensekeys.LicenseKeyUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface LicenseKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(
        params: LicenseKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    fun update(
        params: LicenseKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKey

    fun list(
        params: LicenseKeyListParams = LicenseKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListLicenseKeysResponse>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ListLicenseKeysResponse> =
        list(LicenseKeyListParams.none(), requestOptions)

    /** A view of [LicenseKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /**
         * Returns a raw HTTP response for `patch /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyService.update].
         */
        @MustBeClosed
        fun update(
            params: LicenseKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKey>

        /**
         * Returns a raw HTTP response for `get /license_keys`, but is otherwise the same as
         * [LicenseKeyService.list].
         */
        @MustBeClosed
        fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListLicenseKeysResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ListLicenseKeysResponse>> =
            list(LicenseKeyListParams.none(), requestOptions)
    }
}
