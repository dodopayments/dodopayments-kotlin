// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeListPage
import com.dodopayments.api.models.disputes.DisputeListParams
import com.dodopayments.api.models.disputes.DisputeRetrieveParams

class DisputeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DisputeService {

    private val withRawResponse: DisputeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DisputeService.WithRawResponse = withRawResponse

    override fun retrieve(params: DisputeRetrieveParams, requestOptions: RequestOptions): Dispute =
        // get /disputes/{dispute_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: DisputeListParams, requestOptions: RequestOptions): DisputeListPage =
        // get /disputes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DisputeService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Dispute> =
            jsonHandler<Dispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dispute> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("disputes", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DisputeListPage.Response> =
            jsonHandler<DisputeListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DisputeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("disputes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { DisputeListPage.of(DisputeServiceImpl(clientOptions), params, it) }
            }
        }
    }
}
