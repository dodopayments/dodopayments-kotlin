// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.services.async.misc.SupportedCountryServiceAsync

interface MiscServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun supportedCountries(): SupportedCountryServiceAsync

    /** A view of [MiscServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun supportedCountries(): SupportedCountryServiceAsync.WithRawResponse
    }
}
