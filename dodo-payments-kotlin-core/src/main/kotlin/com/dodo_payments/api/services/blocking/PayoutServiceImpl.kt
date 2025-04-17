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
import com.dodo_payments.api.models.payouts.PayoutListPage
import com.dodo_payments.api.models.payouts.PayoutListParams

class PayoutServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayoutService {

    private val withRawResponse: PayoutService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PayoutService.WithRawResponse = withRawResponse

    override fun list(params: PayoutListParams, requestOptions: RequestOptions): PayoutListPage =
        // get /payouts
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayoutService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<PayoutListPage.Response> =
            jsonHandler<PayoutListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PayoutListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayoutListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("payouts")
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
                    .let { PayoutListPage.of(PayoutServiceImpl(clientOptions), params, it) }
            }
        }
    }
}
