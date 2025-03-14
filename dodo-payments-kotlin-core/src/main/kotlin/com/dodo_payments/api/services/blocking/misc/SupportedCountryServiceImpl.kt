// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.misc

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
import com.dodo_payments.api.core.prepare
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.misc.supportedcountries.CountryCode
import com.dodo_payments.api.models.misc.supportedcountries.SupportedCountryListParams

class SupportedCountryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SupportedCountryService {

    private val withRawResponse: SupportedCountryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SupportedCountryService.WithRawResponse = withRawResponse

    override fun list(
        params: SupportedCountryListParams,
        requestOptions: RequestOptions,
    ): List<CountryCode> =
        // get /checkout/supported_countries
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SupportedCountryService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<List<CountryCode>> =
            jsonHandler<List<CountryCode>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: SupportedCountryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CountryCode>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("checkout", "supported_countries")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { listHandler.handle(it) } }
        }
    }
}
