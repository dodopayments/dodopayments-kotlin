// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.customers

import com.dodo_payments.api.services.blocking.customers.customerportal.SessionService

interface CustomerPortalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun session(): SessionService

    /**
     * A view of [CustomerPortalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun session(): SessionService.WithRawResponse
    }
}
