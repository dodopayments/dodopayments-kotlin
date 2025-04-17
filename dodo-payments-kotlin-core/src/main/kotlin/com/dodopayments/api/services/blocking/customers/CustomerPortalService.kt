// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.CustomerPortalSession
import com.dodopayments.api.models.customers.customerportal.CustomerPortalCreateParams
import com.google.errorprone.annotations.MustBeClosed

interface CustomerPortalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(
        params: CustomerPortalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPortalSession

    /**
     * A view of [CustomerPortalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/customer-portal/session`,
         * but is otherwise the same as [CustomerPortalService.create].
         */
        @MustBeClosed
        fun create(
            params: CustomerPortalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPortalSession>
    }
}
