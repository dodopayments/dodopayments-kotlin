// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.productcollections.ProductCollection
import com.dodopayments.api.models.productcollections.ProductCollectionCreateParams
import com.dodopayments.api.models.productcollections.ProductCollectionDeleteParams
import com.dodopayments.api.models.productcollections.ProductCollectionListPage
import com.dodopayments.api.models.productcollections.ProductCollectionListParams
import com.dodopayments.api.models.productcollections.ProductCollectionRetrieveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateParams
import com.dodopayments.api.services.blocking.productcollections.GroupService
import com.google.errorprone.annotations.MustBeClosed

interface ProductCollectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProductCollectionService

    fun groups(): GroupService

    fun create(
        params: ProductCollectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollection

    fun retrieve(
        id: String,
        params: ProductCollectionRetrieveParams = ProductCollectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollection = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ProductCollectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollection

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ProductCollection =
        retrieve(id, ProductCollectionRetrieveParams.none(), requestOptions)

    fun update(
        id: String,
        params: ProductCollectionUpdateParams = ProductCollectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: ProductCollectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, ProductCollectionUpdateParams.none(), requestOptions)

    fun list(
        params: ProductCollectionListParams = ProductCollectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): ProductCollectionListPage =
        list(ProductCollectionListParams.none(), requestOptions)

    fun delete(
        id: String,
        params: ProductCollectionDeleteParams = ProductCollectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: ProductCollectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ProductCollectionDeleteParams.none(), requestOptions)

    fun unarchive(
        id: String,
        params: ProductCollectionUnarchiveParams = ProductCollectionUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionUnarchiveResponse =
        unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        params: ProductCollectionUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionUnarchiveResponse

    /** @see unarchive */
    fun unarchive(id: String, requestOptions: RequestOptions): ProductCollectionUnarchiveResponse =
        unarchive(id, ProductCollectionUnarchiveParams.none(), requestOptions)

    fun updateImages(
        id: String,
        params: ProductCollectionUpdateImagesParams = ProductCollectionUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionUpdateImagesResponse =
        updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateImages */
    fun updateImages(
        params: ProductCollectionUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductCollectionUpdateImagesResponse

    /** @see updateImages */
    fun updateImages(
        id: String,
        requestOptions: RequestOptions,
    ): ProductCollectionUpdateImagesResponse =
        updateImages(id, ProductCollectionUpdateImagesParams.none(), requestOptions)

    /**
     * A view of [ProductCollectionService] that provides access to raw HTTP responses for each
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
        ): ProductCollectionService.WithRawResponse

        fun groups(): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /product-collections`, but is otherwise the same as
         * [ProductCollectionService.create].
         */
        @MustBeClosed
        fun create(
            params: ProductCollectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollection>

        /**
         * Returns a raw HTTP response for `get /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProductCollectionRetrieveParams = ProductCollectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollection> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProductCollectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollection>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollection> =
            retrieve(id, ProductCollectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ProductCollectionUpdateParams = ProductCollectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProductCollectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, ProductCollectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /product-collections`, but is otherwise the same as
         * [ProductCollectionService.list].
         */
        @MustBeClosed
        fun list(
            params: ProductCollectionListParams = ProductCollectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductCollectionListPage> =
            list(ProductCollectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProductCollectionDeleteParams = ProductCollectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProductCollectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ProductCollectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /product-collections/{id}/unarchive`, but is
         * otherwise the same as [ProductCollectionService.unarchive].
         */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: ProductCollectionUnarchiveParams = ProductCollectionUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionUnarchiveResponse> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            params: ProductCollectionUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionUnarchiveResponse>

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionUnarchiveResponse> =
            unarchive(id, ProductCollectionUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /product-collections/{id}/images`, but is otherwise
         * the same as [ProductCollectionService.updateImages].
         */
        @MustBeClosed
        fun updateImages(
            id: String,
            params: ProductCollectionUpdateImagesParams =
                ProductCollectionUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionUpdateImagesResponse> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            params: ProductCollectionUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductCollectionUpdateImagesResponse>

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductCollectionUpdateImagesResponse> =
            updateImages(id, ProductCollectionUpdateImagesParams.none(), requestOptions)
    }
}
