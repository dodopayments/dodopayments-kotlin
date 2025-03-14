// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.products.Product
import com.dodo_payments.api.models.products.ProductCreateParams
import com.dodo_payments.api.models.products.ProductDeleteParams
import com.dodo_payments.api.models.products.ProductListPage
import com.dodo_payments.api.models.products.ProductListParams
import com.dodo_payments.api.models.products.ProductRetrieveParams
import com.dodo_payments.api.models.products.ProductUnarchiveParams
import com.dodo_payments.api.models.products.ProductUpdateParams
import com.dodo_payments.api.services.blocking.products.ImageService
import com.google.errorprone.annotations.MustBeClosed

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun images(): ImageService

    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    fun update(params: ProductUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProductListPage =
        list(ProductListParams.none(), requestOptions)

    fun delete(params: ProductDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    fun unarchive(
        params: ProductUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun images(): ImageService.WithRawResponse

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
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /**
         * Returns a raw HTTP response for `patch /products/{id}`, but is otherwise the same as
         * [ProductService.update].
         */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /products`, but is otherwise the same as
         * [ProductService.list].
         */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPage> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{id}`, but is otherwise the same as
         * [ProductService.delete].
         */
        @MustBeClosed
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /products/{id}/unarchive`, but is otherwise the
         * same as [ProductService.unarchive].
         */
        @MustBeClosed
        fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
