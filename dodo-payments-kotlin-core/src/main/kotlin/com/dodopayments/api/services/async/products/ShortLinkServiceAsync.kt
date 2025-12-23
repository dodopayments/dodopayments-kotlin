// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateParams
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateResponse
import com.dodopayments.api.models.products.shortlinks.ShortLinkListPageAsync
import com.dodopayments.api.models.products.shortlinks.ShortLinkListParams
import com.google.errorprone.annotations.MustBeClosed

interface ShortLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShortLinkServiceAsync

    /**
     * Gives a Short Checkout URL with custom slug for a product. Uses a Static Checkout URL under
     * the hood.
     */
    suspend fun create(
        id: String,
        params: ShortLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortLinkCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    suspend fun create(
        params: ShortLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortLinkCreateResponse

    /** Lists all short links created by the business. */
    suspend fun list(
        params: ShortLinkListParams = ShortLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortLinkListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ShortLinkListPageAsync =
        list(ShortLinkListParams.none(), requestOptions)

    /**
     * A view of [ShortLinkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ShortLinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products/{id}/short_links`, but is otherwise the
         * same as [ShortLinkServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            id: String,
            params: ShortLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortLinkCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        suspend fun create(
            params: ShortLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortLinkCreateResponse>

        /**
         * Returns a raw HTTP response for `get /products/short_links`, but is otherwise the same as
         * [ShortLinkServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ShortLinkListParams = ShortLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortLinkListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ShortLinkListPageAsync> =
            list(ShortLinkListParams.none(), requestOptions)
    }
}
