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
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.dodopayments.api.models.payments.PaymentCreateResponse
import com.dodopayments.api.models.payments.PaymentListPage
import com.dodopayments.api.models.payments.PaymentListParams
import com.dodopayments.api.models.payments.PaymentRetrieveParams

class PaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentService {

    private val withRawResponse: PaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentService.WithRawResponse = withRawResponse

    override fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions,
    ): PaymentCreateResponse =
        // post /payments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: PaymentRetrieveParams, requestOptions: RequestOptions): Payment =
        // get /payments/{payment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: PaymentListParams, requestOptions: RequestOptions): PaymentListPage =
        // get /payments
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PaymentCreateResponse> =
            jsonHandler<PaymentCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("payments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<Payment> =
            jsonHandler<Payment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Payment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("payments", params.getPathParam(0))
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

        private val listHandler: Handler<PaymentListPage.Response> =
            jsonHandler<PaymentListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("payments")
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
                    .let { PaymentListPage.of(PaymentServiceImpl(clientOptions), params, it) }
            }
        }
    }
}
