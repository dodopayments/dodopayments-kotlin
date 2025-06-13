// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.brands.BrandCreateParams
import com.dodopayments.api.models.brands.BrandCreateResponse
import com.dodopayments.api.models.brands.BrandListParams
import com.dodopayments.api.models.brands.BrandListResponse
import com.dodopayments.api.models.brands.BrandRetrieveParams
import com.dodopayments.api.models.brands.BrandRetrieveResponse
import com.dodopayments.api.models.brands.BrandUpdateImagesParams
import com.dodopayments.api.models.brands.BrandUpdateImagesResponse
import com.dodopayments.api.models.brands.BrandUpdateParams
import com.dodopayments.api.models.brands.BrandUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BrandServiceAsync

    suspend fun create(
        params: BrandCreateParams = BrandCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): BrandCreateResponse =
        create(BrandCreateParams.none(), requestOptions)

    /** Thin handler just calls `get_brand` and wraps in `Json(...)` */
    suspend fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): BrandRetrieveResponse =
        retrieve(id, BrandRetrieveParams.none(), requestOptions)

    suspend fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateResponse

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): BrandUpdateResponse =
        update(id, BrandUpdateParams.none(), requestOptions)

    suspend fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): BrandListResponse =
        list(BrandListParams.none(), requestOptions)

    suspend fun updateImages(
        id: String,
        params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateImagesResponse = updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateImages] */
    suspend fun updateImages(
        params: BrandUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateImagesResponse

    /** @see [updateImages] */
    suspend fun updateImages(
        id: String,
        requestOptions: RequestOptions,
    ): BrandUpdateImagesResponse = updateImages(id, BrandUpdateImagesParams.none(), requestOptions)

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BrandServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /brands`, but is otherwise the same as
         * [BrandServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BrandCreateParams = BrandCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<BrandCreateResponse> =
            create(BrandCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands/{id}`, but is otherwise the same as
         * [BrandServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandRetrieveResponse> =
            retrieve(id, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /brands/{id}`, but is otherwise the same as
         * [BrandServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandUpdateResponse> =
            update(id, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands`, but is otherwise the same as
         * [BrandServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<BrandListResponse> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /brands/{id}/images`, but is otherwise the same as
         * [BrandServiceAsync.updateImages].
         */
        @MustBeClosed
        suspend fun updateImages(
            id: String,
            params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateImagesResponse> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateImages] */
        @MustBeClosed
        suspend fun updateImages(
            params: BrandUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateImagesResponse>

        /** @see [updateImages] */
        @MustBeClosed
        suspend fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandUpdateImagesResponse> =
            updateImages(id, BrandUpdateImagesParams.none(), requestOptions)
    }
}
