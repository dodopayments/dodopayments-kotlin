// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.models.yourwebhookurl.YourWebhookUrlCreateParams
import com.google.errorprone.annotations.MustBeClosed

interface YourWebhookUrlService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): YourWebhookUrlService

    fun create(
        params: YourWebhookUrlCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [YourWebhookUrlService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): YourWebhookUrlService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /your-webhook-url`, but is otherwise the same as
         * [YourWebhookUrlService.create].
         */
        @MustBeClosed
        fun create(
            params: YourWebhookUrlCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
