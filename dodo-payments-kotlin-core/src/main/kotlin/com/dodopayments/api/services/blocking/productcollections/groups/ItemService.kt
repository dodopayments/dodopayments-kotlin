// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.productcollections.groups

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.productcollections.groups.items.ItemCreateParams
import com.dodopayments.api.models.productcollections.groups.items.ItemDeleteParams
import com.dodopayments.api.models.productcollections.groups.items.ItemUpdateParams
import com.dodopayments.api.models.productcollections.groups.items.ProductCollectionProduct
import com.google.errorprone.annotations.MustBeClosed

interface ItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ItemService

    fun create(
        groupId: String,
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ProductCollectionProduct> =
        create(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see create */
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ProductCollectionProduct>

    fun update(
        itemId: String,
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see update */
    fun update(params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    fun delete(
        itemId: String,
        params: ItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ItemDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /product-collections/{id}/groups/{group_id}/items`,
         * but is otherwise the same as [ItemService.create].
         */
        @MustBeClosed
        fun create(
            groupId: String,
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ProductCollectionProduct>> =
            create(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ProductCollectionProduct>>

        /**
         * Returns a raw HTTP response for `patch
         * /product-collections/{id}/groups/{group_id}/items/{item_id}`, but is otherwise the same
         * as [ItemService.update].
         */
        @MustBeClosed
        fun update(
            itemId: String,
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /product-collections/{id}/groups/{group_id}/items/{item_id}`, but is otherwise the same
         * as [ItemService.delete].
         */
        @MustBeClosed
        fun delete(
            itemId: String,
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
