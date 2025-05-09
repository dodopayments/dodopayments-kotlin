// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

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
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.services.async.products.ImageServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun images(): ImageServiceAsync

    suspend fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    suspend fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    suspend fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ProductListPageAsync =
        list(ProductListParams.none(), requestOptions)

    suspend fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun unarchive(
        params: ProductUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

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
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /**
         * Returns a raw HTTP response for `patch /products/{id}`, but is otherwise the same as
         * [ProductServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /products/{id}/unarchive`, but is otherwise the
         * same as [ProductServiceAsync.unarchive].
         */
        @MustBeClosed
        suspend fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
