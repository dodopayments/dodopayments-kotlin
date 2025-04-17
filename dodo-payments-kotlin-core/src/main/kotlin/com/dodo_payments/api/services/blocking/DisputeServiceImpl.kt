// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

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
import com.dodo_payments.api.models.disputes.Dispute
import com.dodo_payments.api.models.disputes.DisputeListPage
import com.dodo_payments.api.models.disputes.DisputeListParams
import com.dodo_payments.api.models.disputes.DisputeRetrieveParams

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
