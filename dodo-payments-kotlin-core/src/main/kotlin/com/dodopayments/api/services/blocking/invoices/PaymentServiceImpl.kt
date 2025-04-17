// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.invoices

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.emptyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.invoices.payments.PaymentRetrieveParams

class PaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentService {

    private val withRawResponse: PaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentService.WithRawResponse = withRawResponse

    override fun retrieve(params: PaymentRetrieveParams, requestOptions: RequestOptions) {
        // get /invoices/payments/{payment_id}
        withRawResponse().retrieve(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("invoices", "payments", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { retrieveHandler.handle(it) } }
        }
    }
}
