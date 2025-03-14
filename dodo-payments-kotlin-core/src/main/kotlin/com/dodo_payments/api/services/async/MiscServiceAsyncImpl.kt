// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.services.async.misc.SupportedCountryServiceAsync
import com.dodo_payments.api.services.async.misc.SupportedCountryServiceAsyncImpl

class MiscServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MiscServiceAsync {

    private val withRawResponse: MiscServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val supportedCountries: SupportedCountryServiceAsync by lazy {
        SupportedCountryServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MiscServiceAsync.WithRawResponse = withRawResponse

    override fun supportedCountries(): SupportedCountryServiceAsync = supportedCountries

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MiscServiceAsync.WithRawResponse {

        private val supportedCountries: SupportedCountryServiceAsync.WithRawResponse by lazy {
            SupportedCountryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun supportedCountries(): SupportedCountryServiceAsync.WithRawResponse =
            supportedCountries
    }
}
