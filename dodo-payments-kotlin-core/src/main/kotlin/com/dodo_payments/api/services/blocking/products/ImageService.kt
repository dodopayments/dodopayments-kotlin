// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.products

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.products.images.ImageUpdateParams
import com.dodo_payments.api.models.products.images.ImageUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface ImageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun update(
        params: ImageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImageUpdateResponse

    /** A view of [ImageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /products/{id}/images`, but is otherwise the same as
         * [ImageService.update].
         */
        @MustBeClosed
        fun update(
            params: ImageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImageUpdateResponse>
    }
}
