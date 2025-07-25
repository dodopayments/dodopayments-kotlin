// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AddonServiceAsync

    suspend fun create(
        params: AddonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    suspend fun retrieve(
        id: String,
        params: AddonRetrieveParams = AddonRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AddonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): AddonResponse =
        retrieve(id, AddonRetrieveParams.none(), requestOptions)

    suspend fun update(
        id: String,
        params: AddonUpdateParams = AddonUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: AddonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonResponse

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): AddonResponse =
        update(id, AddonUpdateParams.none(), requestOptions)

    suspend fun list(
        params: AddonListParams = AddonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AddonListPageAsync =
        list(AddonListParams.none(), requestOptions)

    suspend fun updateImages(
        id: String,
        params: AddonUpdateImagesParams = AddonUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonUpdateImagesResponse = updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateImages */
    suspend fun updateImages(
        params: AddonUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddonUpdateImagesResponse

    /** @see updateImages */
    suspend fun updateImages(
        id: String,
        requestOptions: RequestOptions,
    ): AddonUpdateImagesResponse = updateImages(id, AddonUpdateImagesParams.none(), requestOptions)

    /** A view of [AddonServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AddonServiceAsync.WithRawResponse

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
            id: String,
            params: AddonRetrieveParams = AddonRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonResponse> = retrieve(id, AddonRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: AddonUpdateParams = AddonUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonResponse> = update(id, AddonUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /addons`, but is otherwise the same as
         * [AddonServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AddonListParams = AddonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AddonListPageAsync> =
            list(AddonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /addons/{id}/images`, but is otherwise the same as
         * [AddonServiceAsync.updateImages].
         */
        @MustBeClosed
        suspend fun updateImages(
            id: String,
            params: AddonUpdateImagesParams = AddonUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonUpdateImagesResponse> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateImages */
        @MustBeClosed
        suspend fun updateImages(
            params: AddonUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddonUpdateImagesResponse>

        /** @see updateImages */
        @MustBeClosed
        suspend fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonUpdateImagesResponse> =
            updateImages(id, AddonUpdateImagesParams.none(), requestOptions)
    }
}
