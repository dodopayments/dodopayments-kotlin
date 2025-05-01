// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.addons.AddonCreateParams
import com.dodopayments.api.models.addons.AddonListPageAsync
import com.dodopayments.api.models.addons.AddonListParams
import com.dodopayments.api.models.addons.AddonResponse
import com.dodopayments.api.models.addons.AddonRetrieveParams
import com.dodopayments.api.models.addons.AddonUpdateImagesParams
import com.dodopayments.api.models.addons.AddonUpdateImagesResponse
import com.dodopayments.api.models.addons.AddonUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface AddonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun create(
        params: AddonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    suspend fun retrieve(
        params: AddonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    suspend fun update(
        params: AddonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    suspend fun list(
        params: AddonListParams = AddonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AddonListPageAsync =
        list(AddonListParams.none(), requestOptions)

    suspend fun updateImages(
        params: AddonUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonUpdateImagesResponse

    /** A view of [AddonServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /addons`, but is otherwise the same as
         * [AddonServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AddonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse>

        /**
         * Returns a raw HTTP response for `get /addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse>

        /**
         * Returns a raw HTTP response for `patch /addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse>

        /**
         * Returns a raw HTTP response for `get /addons`, but is otherwise the same as
         * [AddonServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AddonListParams = AddonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AddonListPageAsync> =
            list(AddonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /addons/{id}/images`, but is otherwise the same as
         * [AddonServiceAsync.updateImages].
         */
        @MustBeClosed
        suspend fun updateImages(
            params: AddonUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonUpdateImagesResponse>
    }
}
