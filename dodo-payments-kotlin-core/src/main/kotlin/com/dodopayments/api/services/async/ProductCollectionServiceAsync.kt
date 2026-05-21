// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.productcollections.ProductCollection
import com.dodopayments.api.models.productcollections.ProductCollectionCreateParams
import com.dodopayments.api.models.productcollections.ProductCollectionDeleteParams
import com.dodopayments.api.models.productcollections.ProductCollectionListPageAsync
import com.dodopayments.api.models.productcollections.ProductCollectionListParams
import com.dodopayments.api.models.productcollections.ProductCollectionRetrieveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateParams
import com.dodopayments.api.services.async.productcollections.GroupServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface ProductCollectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProductCollectionServiceAsync

    fun groups(): GroupServiceAsync

    suspend fun create(
        params: ProductCollectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollection

    suspend fun retrieve(
        id: String,
        params: ProductCollectionRetrieveParams = ProductCollectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollection = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ProductCollectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollection

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): ProductCollection =
        retrieve(id, ProductCollectionRetrieveParams.none(), requestOptions)

    suspend fun update(
        id: String,
        params: ProductCollectionUpdateParams = ProductCollectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: ProductCollectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions) =
        update(id, ProductCollectionUpdateParams.none(), requestOptions)

    suspend fun list(
        params: ProductCollectionListParams = ProductCollectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ProductCollectionListPageAsync =
        list(ProductCollectionListParams.none(), requestOptions)

    suspend fun delete(
        id: String,
        params: ProductCollectionDeleteParams = ProductCollectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ProductCollectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ProductCollectionDeleteParams.none(), requestOptions)

    suspend fun unarchive(
        id: String,
        params: ProductCollectionUnarchiveParams = ProductCollectionUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionUnarchiveResponse =
        unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    suspend fun unarchive(
        params: ProductCollectionUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionUnarchiveResponse

    /** @see unarchive */
    suspend fun unarchive(
        id: String,
        requestOptions: RequestOptions,
    ): ProductCollectionUnarchiveResponse =
        unarchive(id, ProductCollectionUnarchiveParams.none(), requestOptions)

    suspend fun updateImages(
        id: String,
        params: ProductCollectionUpdateImagesParams = ProductCollectionUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionUpdateImagesResponse =
        updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateImages */
    suspend fun updateImages(
        params: ProductCollectionUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionUpdateImagesResponse

    /** @see updateImages */
    suspend fun updateImages(
        id: String,
        requestOptions: RequestOptions,
    ): ProductCollectionUpdateImagesResponse =
        updateImages(id, ProductCollectionUpdateImagesParams.none(), requestOptions)

    /**
     * A view of [ProductCollectionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ProductCollectionServiceAsync.WithRawResponse

        fun groups(): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /product-collections`, but is otherwise the same as
         * [ProductCollectionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ProductCollectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollection>

        /**
         * Returns a raw HTTP response for `get /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: ProductCollectionRetrieveParams = ProductCollectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollection> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ProductCollectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollection>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollection> =
            retrieve(id, ProductCollectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: ProductCollectionUpdateParams = ProductCollectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ProductCollectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        suspend fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, ProductCollectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /product-collections`, but is otherwise the same as
         * [ProductCollectionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ProductCollectionListParams = ProductCollectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ProductCollectionListPageAsync> =
            list(ProductCollectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: ProductCollectionDeleteParams = ProductCollectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ProductCollectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ProductCollectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /product-collections/{id}/unarchive`, but is
         * otherwise the same as [ProductCollectionServiceAsync.unarchive].
         */
        @MustBeClosed
        suspend fun unarchive(
            id: String,
            params: ProductCollectionUnarchiveParams = ProductCollectionUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionUnarchiveResponse> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        suspend fun unarchive(
            params: ProductCollectionUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionUnarchiveResponse>

        /** @see unarchive */
        @MustBeClosed
        suspend fun unarchive(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionUnarchiveResponse> =
            unarchive(id, ProductCollectionUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /product-collections/{id}/images`, but is otherwise
         * the same as [ProductCollectionServiceAsync.updateImages].
         */
        @MustBeClosed
        suspend fun updateImages(
            id: String,
            params: ProductCollectionUpdateImagesParams =
                ProductCollectionUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionUpdateImagesResponse> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateImages */
        @MustBeClosed
        suspend fun updateImages(
            params: ProductCollectionUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionUpdateImagesResponse>

        /** @see updateImages */
        @MustBeClosed
        suspend fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionUpdateImagesResponse> =
            updateImages(id, ProductCollectionUpdateImagesParams.none(), requestOptions)
    }
}
