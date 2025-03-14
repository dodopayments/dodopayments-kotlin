// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.customers.customerportal

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.models.customers.customerportal.session.SessionCreateParams
import com.google.errorprone.annotations.MustBeClosed

interface SessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: SessionCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/customer-portal/session`,
         * but is otherwise the same as [SessionService.create].
         */
        @MustBeClosed
        fun create(
            params: SessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
