// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.productcollections.groups

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.productcollections.groups.items.ItemCreateParams
import com.dodopayments.api.models.productcollections.groups.items.ItemDeleteParams
import com.dodopayments.api.models.productcollections.groups.items.ItemUpdateParams
import com.dodopayments.api.models.productcollections.groups.items.ProductCollectionProduct
import com.google.errorprone.annotations.MustBeClosed

interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ItemServiceAsync

    suspend fun create(
        groupId: String,
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ProductCollectionProduct> =
        create(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ProductCollectionProduct>

    suspend fun update(
        itemId: String,
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun delete(
        itemId: String,
        params: ItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /product-collections/{id}/groups/{group_id}/items`,
         * but is otherwise the same as [ItemServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            groupId: String,
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ProductCollectionProduct>> =
            create(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ProductCollectionProduct>>

        /**
         * Returns a raw HTTP response for `patch
         * /product-collections/{id}/groups/{group_id}/items/{item_id}`, but is otherwise the same
         * as [ItemServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            itemId: String,
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /product-collections/{id}/groups/{group_id}/items/{item_id}`, but is otherwise the same
         * as [ItemServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            itemId: String,
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
