// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.errorBodyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.MiscListSupportedCountriesParams

class MiscServiceImpl internal constructor(private val clientOptions: ClientOptions) : MiscService {

    private val withRawResponse: MiscService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MiscService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MiscService =
        MiscServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun listSupportedCountries(
        params: MiscListSupportedCountriesParams,
        requestOptions: RequestOptions,
    ): List<CountryCode> =
        // get /checkout/supported_countries
        withRawResponse().listSupportedCountries(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MiscService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MiscService.WithRawResponse =
            MiscServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val listSupportedCountriesHandler: Handler<List<CountryCode>> =
            jsonHandler<List<CountryCode>>(clientOptions.jsonMapper)

        override fun listSupportedCountries(
            params: MiscListSupportedCountriesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CountryCode>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkout", "supported_countries")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSupportedCountriesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
