// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface LicenseKeyInstanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(
        params: LicenseKeyInstanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    fun update(
        params: LicenseKeyInstanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    fun list(
        params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListLicenseKeyInstancesResponse>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ListLicenseKeyInstancesResponse> =
        list(LicenseKeyInstanceListParams.none(), requestOptions)

    /**
     * A view of [LicenseKeyInstanceService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyInstanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /**
         * Returns a raw HTTP response for `patch /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceService.update].
         */
        @MustBeClosed
        fun update(
            params: LicenseKeyInstanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /**
         * Returns a raw HTTP response for `get /license_key_instances`, but is otherwise the same
         * as [LicenseKeyInstanceService.list].
         */
        @MustBeClosed
        fun list(
            params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListLicenseKeyInstancesResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ListLicenseKeyInstancesResponse>> =
            list(LicenseKeyInstanceListParams.none(), requestOptions)
    }
}
