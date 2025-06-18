// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.Product
import com.dodopayments.api.models.products.ProductCreateParams
import com.dodopayments.api.models.products.ProductDeleteParams
import com.dodopayments.api.models.products.ProductListPageAsync
import com.dodopayments.api.models.products.ProductListParams
import com.dodopayments.api.models.products.ProductRetrieveParams
import com.dodopayments.api.models.products.ProductUnarchiveParams
import com.dodopayments.api.models.products.ProductUpdateFilesParams
import com.dodopayments.api.models.products.ProductUpdateFilesResponse
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.services.async.products.ImageServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProductServiceAsync

    fun images(): ImageServiceAsync

    suspend fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    suspend fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Product =
        retrieve(id, ProductRetrieveParams.none(), requestOptions)

    suspend fun update(
        id: String,
        params: ProductUpdateParams = ProductUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions) =
        update(id, ProductUpdateParams.none(), requestOptions)

    suspend fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ProductListPageAsync =
        list(ProductListParams.none(), requestOptions)

    suspend fun delete(
        id: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ProductDeleteParams.none(), requestOptions)

    suspend fun unarchive(
        id: String,
        params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see [unarchive] */
    suspend fun unarchive(
        params: ProductUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [unarchive] */
    suspend fun unarchive(id: String, requestOptions: RequestOptions) =
        unarchive(id, ProductUnarchiveParams.none(), requestOptions)

    suspend fun updateFiles(
        id: String,
        params: ProductUpdateFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductUpdateFilesResponse = updateFiles(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateFiles] */
    suspend fun updateFiles(
        params: ProductUpdateFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductUpdateFilesResponse

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ProductServiceAsync.WithRawResponse

        fun images(): ImageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products`, but is otherwise the same as
         * [ProductServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /**
         * Returns a raw HTTP response for `get /products/{id}`, but is otherwise the same as
         * [ProductServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Product> =
            retrieve(id, ProductRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /products/{id}`, but is otherwise the same as
         * [ProductServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: ProductUpdateParams = ProductUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [update] */
        @MustBeClosed
        suspend fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, ProductUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /products`, but is otherwise the same as
         * [ProductServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPageAsync> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{id}`, but is otherwise the same as
         * [ProductServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ProductDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /products/{id}/unarchive`, but is otherwise the
         * same as [ProductServiceAsync.unarchive].
         */
        @MustBeClosed
        suspend fun unarchive(
            id: String,
            params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see [unarchive] */
        @MustBeClosed
        suspend fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [unarchive] */
        @MustBeClosed
        suspend fun unarchive(id: String, requestOptions: RequestOptions): HttpResponse =
            unarchive(id, ProductUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /products/{id}/files`, but is otherwise the same as
         * [ProductServiceAsync.updateFiles].
         */
        @MustBeClosed
        suspend fun updateFiles(
            id: String,
            params: ProductUpdateFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductUpdateFilesResponse> =
            updateFiles(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateFiles] */
        @MustBeClosed
        suspend fun updateFiles(
            params: ProductUpdateFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductUpdateFilesResponse>
    }
}
