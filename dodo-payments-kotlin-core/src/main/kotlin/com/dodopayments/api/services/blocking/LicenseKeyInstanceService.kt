// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListPage
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
        id: String,
        params: LicenseKeyInstanceRetrieveParams = LicenseKeyInstanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: LicenseKeyInstanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): LicenseKeyInstance =
        retrieve(id, LicenseKeyInstanceRetrieveParams.none(), requestOptions)

    fun update(
        id: String,
        params: LicenseKeyInstanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: LicenseKeyInstanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstance

    fun list(
        params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LicenseKeyInstanceListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LicenseKeyInstanceListPage =
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
            id: String,
            params: LicenseKeyInstanceRetrieveParams = LicenseKeyInstanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyInstanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyInstance> =
            retrieve(id, LicenseKeyInstanceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LicenseKeyInstanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LicenseKeyInstance> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        ): HttpResponseFor<LicenseKeyInstanceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LicenseKeyInstanceListPage> =
            list(LicenseKeyInstanceListParams.none(), requestOptions)
    }
}
