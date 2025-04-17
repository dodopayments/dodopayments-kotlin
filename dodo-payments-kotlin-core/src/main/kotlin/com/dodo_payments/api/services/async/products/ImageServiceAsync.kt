// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.products

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.products.images.ImageUpdateParams
import com.dodo_payments.api.models.products.images.ImageUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface ImageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun update(
        params: ImageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImageUpdateResponse

    /** A view of [ImageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /products/{id}/images`, but is otherwise the same as
         * [ImageServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: ImageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImageUpdateResponse>
    }
}
