// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.brands.Brand
import com.dodopayments.api.models.brands.BrandCreateParams
import com.dodopayments.api.models.brands.BrandListParams
import com.dodopayments.api.models.brands.BrandListResponse
import com.dodopayments.api.models.brands.BrandRetrieveParams
import com.dodopayments.api.models.brands.BrandUpdateImagesParams
import com.dodopayments.api.models.brands.BrandUpdateImagesResponse
import com.dodopayments.api.models.brands.BrandUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BrandService

    fun create(
        params: BrandCreateParams = BrandCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** @see [create] */
    fun create(requestOptions: RequestOptions): Brand =
        create(BrandCreateParams.none(), requestOptions)

    /** Thin handler just calls `get_brand` and wraps in `Json(...)` */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): Brand =
        retrieve(id, BrandRetrieveParams.none(), requestOptions)

    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): Brand =
        update(id, BrandUpdateParams.none(), requestOptions)

    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BrandListResponse =
        list(BrandListParams.none(), requestOptions)

    fun updateImages(
        id: String,
        params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateImagesResponse = updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateImages] */
    fun updateImages(
        params: BrandUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateImagesResponse

    /** @see [updateImages] */
    fun updateImages(id: String, requestOptions: RequestOptions): BrandUpdateImagesResponse =
        updateImages(id, BrandUpdateImagesParams.none(), requestOptions)

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BrandService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /brands`, but is otherwise the same as
         * [BrandService.create].
         */
        @MustBeClosed
        fun create(
            params: BrandCreateParams = BrandCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<Brand> =
            create(BrandCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands/{id}`, but is otherwise the same as
         * [BrandService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Brand> =
            retrieve(id, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /brands/{id}`, but is otherwise the same as
         * [BrandService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Brand> =
            update(id, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands`, but is otherwise the same as
         * [BrandService.list].
         */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BrandListResponse> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /brands/{id}/images`, but is otherwise the same as
         * [BrandService.updateImages].
         */
        @MustBeClosed
        fun updateImages(
            id: String,
            params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateImagesResponse> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateImages] */
        @MustBeClosed
        fun updateImages(
            params: BrandUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateImagesResponse>

        /** @see [updateImages] */
        @MustBeClosed
        fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandUpdateImagesResponse> =
            updateImages(id, BrandUpdateImagesParams.none(), requestOptions)
    }
}
