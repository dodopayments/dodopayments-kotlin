// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.invoices

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.handlers.emptyHandler
import com.dodo_payments.api.core.handlers.errorHandler
import com.dodo_payments.api.core.handlers.withErrorHandler
import com.dodo_payments.api.core.http.HttpMethod
import com.dodo_payments.api.core.http.HttpRequest
import com.dodo_payments.api.core.http.HttpResponse
import com.dodo_payments.api.core.http.HttpResponse.Handler
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepareAsync
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.invoices.payments.PaymentRetrieveParams

class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val withRawResponse: PaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(params: PaymentRetrieveParams, requestOptions: RequestOptions) {
        // get /invoices/payments/{payment_id}
        withRawResponse().retrieve(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("invoices", "payments", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { retrieveHandler.handle(it) } }
        }
    }
}
