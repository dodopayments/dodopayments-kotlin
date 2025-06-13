// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.products

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.images.ImageUpdateParams
import com.dodopayments.api.models.products.images.ImageUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface ImageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageService

    fun update(
        id: String,
        params: ImageUpdateParams = ImageUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImageUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: ImageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImageUpdateResponse

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): ImageUpdateResponse =
        update(id, ImageUpdateParams.none(), requestOptions)

    /** A view of [ImageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ImageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /products/{id}/images`, but is otherwise the same as
         * [ImageService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ImageUpdateParams = ImageUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImageUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ImageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImageUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImageUpdateResponse> =
            update(id, ImageUpdateParams.none(), requestOptions)
    }
}
