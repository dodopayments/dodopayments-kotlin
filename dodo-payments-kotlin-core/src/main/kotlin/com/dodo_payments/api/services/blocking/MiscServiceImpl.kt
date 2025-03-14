// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.services.blocking.misc.SupportedCountryService
import com.dodo_payments.api.services.blocking.misc.SupportedCountryServiceImpl

class MiscServiceImpl internal constructor(private val clientOptions: ClientOptions) : MiscService {

    private val withRawResponse: MiscService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val supportedCountries: SupportedCountryService by lazy {
        SupportedCountryServiceImpl(clientOptions)
    }

    override fun withRawResponse(): MiscService.WithRawResponse = withRawResponse

    override fun supportedCountries(): SupportedCountryService = supportedCountries

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MiscService.WithRawResponse {

        private val supportedCountries: SupportedCountryService.WithRawResponse by lazy {
            SupportedCountryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun supportedCountries(): SupportedCountryService.WithRawResponse =
            supportedCountries
    }
}
