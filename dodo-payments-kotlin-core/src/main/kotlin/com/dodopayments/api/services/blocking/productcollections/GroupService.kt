// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.productcollections

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.productcollections.groups.GroupCreateParams
import com.dodopayments.api.models.productcollections.groups.GroupCreateResponse
import com.dodopayments.api.models.productcollections.groups.GroupDeleteParams
import com.dodopayments.api.models.productcollections.groups.GroupUpdateParams
import com.dodopayments.api.services.blocking.productcollections.groups.ItemService
import com.google.errorprone.annotations.MustBeClosed

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GroupService

    fun items(): ItemService

    fun create(
        id: String,
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupCreateResponse

    fun update(
        groupId: String,
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(params: GroupUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    fun delete(
        groupId: String,
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(params: GroupDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): GroupService.WithRawResponse

        fun items(): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /product-collections/{id}/groups`, but is otherwise
         * the same as [GroupService.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /product-collections/{id}/groups/{group_id}`, but
         * is otherwise the same as [GroupService.update].
         */
        @MustBeClosed
        fun update(
            groupId: String,
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /product-collections/{id}/groups/{group_id}`, but
         * is otherwise the same as [GroupService.delete].
         */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
