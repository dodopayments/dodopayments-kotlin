// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.payouts

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.errorBodyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveParams
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveResponse
import com.dodopayments.api.services.async.payouts.breakup.DetailServiceAsync
import com.dodopayments.api.services.async.payouts.breakup.DetailServiceAsyncImpl

class BreakupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BreakupServiceAsync {

    private val withRawResponse: BreakupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val details: DetailServiceAsync by lazy { DetailServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BreakupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BreakupServiceAsync =
        BreakupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun details(): DetailServiceAsync = details

    override suspend fun retrieve(
        params: BreakupRetrieveParams,
        requestOptions: RequestOptions,
    ): List<BreakupRetrieveResponse> =
        // get /payouts/{payout_id}/breakup
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BreakupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val details: DetailServiceAsync.WithRawResponse by lazy {
            DetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BreakupServiceAsync.WithRawResponse =
            BreakupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun details(): DetailServiceAsync.WithRawResponse = details

        private val retrieveHandler: Handler<List<BreakupRetrieveResponse>> =
            jsonHandler<List<BreakupRetrieveResponse>>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: BreakupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<BreakupRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("payoutId", params.payoutId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payouts", params._pathParam(0), "breakup")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
