// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.payouts

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
import com.dodopayments.api.core.prepare
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveParams
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveResponse
import com.dodopayments.api.services.blocking.payouts.breakup.DetailService
import com.dodopayments.api.services.blocking.payouts.breakup.DetailServiceImpl

class BreakupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BreakupService {

    private val withRawResponse: BreakupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val details: DetailService by lazy { DetailServiceImpl(clientOptions) }

    override fun withRawResponse(): BreakupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BreakupService =
        BreakupServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun details(): DetailService = details

    override fun retrieve(
        params: BreakupRetrieveParams,
        requestOptions: RequestOptions,
    ): List<BreakupRetrieveResponse> =
        // get /payouts/{payout_id}/breakup
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BreakupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val details: DetailService.WithRawResponse by lazy {
            DetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BreakupService.WithRawResponse =
            BreakupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun details(): DetailService.WithRawResponse = details

        private val retrieveHandler: Handler<List<BreakupRetrieveResponse>> =
            jsonHandler<List<BreakupRetrieveResponse>>(clientOptions.jsonMapper)

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
