// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.services.blocking.misc.SupportedCountryService

interface MiscService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun supportedCountries(): SupportedCountryService

    /** A view of [MiscService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun supportedCountries(): SupportedCountryService.WithRawResponse
    }
}
