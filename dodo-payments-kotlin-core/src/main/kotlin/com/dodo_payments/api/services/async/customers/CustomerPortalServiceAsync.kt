// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.customers

import com.dodo_payments.api.services.async.customers.customerportal.SessionServiceAsync

interface CustomerPortalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun session(): SessionServiceAsync

    /**
     * A view of [CustomerPortalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun session(): SessionServiceAsync.WithRawResponse
    }
}
