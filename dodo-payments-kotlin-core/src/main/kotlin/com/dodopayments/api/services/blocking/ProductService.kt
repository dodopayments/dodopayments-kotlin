// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.Product
import com.dodopayments.api.models.products.ProductArchiveParams
import com.dodopayments.api.models.products.ProductCreateParams
import com.dodopayments.api.models.products.ProductListPage
import com.dodopayments.api.models.products.ProductListParams
import com.dodopayments.api.models.products.ProductRetrieveParams
import com.dodopayments.api.models.products.ProductUnarchiveParams
import com.dodopayments.api.models.products.ProductUpdateFilesParams
import com.dodopayments.api.models.products.ProductUpdateFilesResponse
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.services.blocking.products.ImageService
import com.dodopayments.api.services.blocking.products.LocalizedPriceService
import com.dodopayments.api.services.blocking.products.ShortLinkService
import com.google.errorprone.annotations.MustBeClosed

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProductService

    fun images(): ImageService

    fun shortLinks(): ShortLinkService

    fun localizedPrices(): LocalizedPriceService

    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Product =
        retrieve(id, ProductRetrieveParams.none(), requestOptions)

    fun update(
        id: String,
        params: ProductUpdateParams = ProductUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ProductUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, ProductUpdateParams.none(), requestOptions)

    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): ProductListPage =
        list(ProductListParams.none(), requestOptions)

    fun archive(
        id: String,
        params: ProductArchiveParams = ProductArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        params: ProductArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions) =
        archive(id, ProductArchiveParams.none(), requestOptions)

    fun unarchive(
        id: String,
        params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        params: ProductUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unarchive */
    fun unarchive(id: String, requestOptions: RequestOptions) =
        unarchive(id, ProductUnarchiveParams.none(), requestOptions)

    fun updateFiles(
        id: String,
        params: ProductUpdateFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductUpdateFilesResponse = updateFiles(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateFiles */
    fun updateFiles(
        params: ProductUpdateFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductUpdateFilesResponse

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProductService.WithRawResponse

        fun images(): ImageService.WithRawResponse

        fun shortLinks(): ShortLinkService.WithRawResponse

        fun localizedPrices(): LocalizedPriceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products`, but is otherwise the same as
         * [ProductService.create].
         */
        @MustBeClosed
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /**
         * Returns a raw HTTP response for `get /products/{id}`, but is otherwise the same as
         * [ProductService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Product> =
            retrieve(id, ProductRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /products/{id}`, but is otherwise the same as
         * [ProductService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ProductUpdateParams = ProductUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, ProductUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /products`, but is otherwise the same as
         * [ProductService.list].
         */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPage> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{id}`, but is otherwise the same as
         * [ProductService.archive].
         */
        @MustBeClosed
        fun archive(
            id: String,
            params: ProductArchiveParams = ProductArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: ProductArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(id: String, requestOptions: RequestOptions): HttpResponse =
            archive(id, ProductArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /products/{id}/unarchive`, but is otherwise the
         * same as [ProductService.unarchive].
         */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(id: String, requestOptions: RequestOptions): HttpResponse =
            unarchive(id, ProductUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /products/{id}/files`, but is otherwise the same as
         * [ProductService.updateFiles].
         */
        @MustBeClosed
        fun updateFiles(
            id: String,
            params: ProductUpdateFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductUpdateFilesResponse> =
            updateFiles(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateFiles */
        @MustBeClosed
        fun updateFiles(
            params: ProductUpdateFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductUpdateFilesResponse>
    }
}
