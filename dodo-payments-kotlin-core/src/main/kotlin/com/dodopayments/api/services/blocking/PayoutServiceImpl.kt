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
import com.dodopayments.api.models.payouts.PayoutListPage
import com.dodopayments.api.models.payouts.PayoutListPageResponse
import com.dodopayments.api.models.payouts.PayoutListParams

class PayoutServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PayoutService {

    private val withRawResponse: PayoutService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PayoutService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PayoutService =
        PayoutServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(params: PayoutListParams, requestOptions: RequestOptions): PayoutListPage =
        // get /payouts
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayoutService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PayoutService.WithRawResponse =
            PayoutServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val listHandler: Handler<PayoutListPageResponse> =
            jsonHandler<PayoutListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PayoutListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayoutListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payouts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PayoutListPage.builder()
                            .service(PayoutServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
