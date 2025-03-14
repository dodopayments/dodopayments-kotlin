// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface LicenseKeyInstanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        params: LicenseKeyInstanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    suspend fun update(
        params: LicenseKeyInstanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    suspend fun list(
        params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListLicenseKeyInstancesResponse>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ListLicenseKeyInstancesResponse> =
        list(LicenseKeyInstanceListParams.none(), requestOptions)

    /**
     * A view of [LicenseKeyInstanceServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: LicenseKeyInstanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /**
         * Returns a raw HTTP response for `patch /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: LicenseKeyInstanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /**
         * Returns a raw HTTP response for `get /license_key_instances`, but is otherwise the same
         * as [LicenseKeyInstanceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListLicenseKeyInstancesResponse>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ListLicenseKeyInstancesResponse>> =
            list(LicenseKeyInstanceListParams.none(), requestOptions)
    }
}
