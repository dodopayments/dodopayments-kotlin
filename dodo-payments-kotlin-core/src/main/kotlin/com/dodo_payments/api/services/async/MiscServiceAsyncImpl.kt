// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.handlers.errorHandler
import com.dodo_payments.api.core.handlers.jsonHandler
import com.dodo_payments.api.core.handlers.withErrorHandler
import com.dodo_payments.api.core.http.HttpMethod
import com.dodo_payments.api.core.http.HttpRequest
import com.dodo_payments.api.core.http.HttpResponse.Handler
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepareAsync
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.misc.MiscListSupportedCountriesParams

class MiscServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MiscServiceAsync {

    private val withRawResponse: MiscServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MiscServiceAsync.WithRawResponse = withRawResponse

    override suspend fun listSupportedCountries(
        params: MiscListSupportedCountriesParams,
        requestOptions: RequestOptions,
    ): List<CountryCode> =
        // get /checkout/supported_countries
        withRawResponse().listSupportedCountries(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MiscServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val listSupportedCountriesHandler: Handler<List<CountryCode>> =
            jsonHandler<List<CountryCode>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun listSupportedCountries(
            params: MiscListSupportedCountriesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CountryCode>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("checkout", "supported_countries")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { listSupportedCountriesHandler.handle(it) } }
        }
    }
}
