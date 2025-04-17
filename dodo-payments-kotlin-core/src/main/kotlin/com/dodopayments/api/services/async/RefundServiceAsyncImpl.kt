// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundCreateParams
import com.dodopayments.api.models.refunds.RefundListPageAsync
import com.dodopayments.api.models.refunds.RefundListParams
import com.dodopayments.api.models.refunds.RefundRetrieveParams

class RefundServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RefundServiceAsync {

    private val withRawResponse: RefundServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RefundServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: RefundCreateParams,
        requestOptions: RequestOptions,
    ): Refund =
        // post /refunds
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: RefundRetrieveParams,
        requestOptions: RequestOptions,
    ): Refund =
        // get /refunds/{refund_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: RefundListParams,
        requestOptions: RequestOptions,
    ): RefundListPageAsync =
        // get /refunds
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RefundServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Refund> =
            jsonHandler<Refund>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: RefundCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Refund> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("refunds")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Refund> =
            jsonHandler<Refund>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: RefundRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Refund> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("refunds", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<RefundListPageAsync.Response> =
            jsonHandler<RefundListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: RefundListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RefundListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("refunds")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        RefundListPageAsync.of(RefundServiceAsyncImpl(clientOptions), params, it)
                    }
            }
        }
    }
}
