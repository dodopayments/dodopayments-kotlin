// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

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
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.payouts.PayoutListPageAsync
import com.dodopayments.api.models.payouts.PayoutListPageResponse
import com.dodopayments.api.models.payouts.PayoutListParams
import com.dodopayments.api.services.async.payouts.BreakupServiceAsync
import com.dodopayments.api.services.async.payouts.BreakupServiceAsyncImpl

class PayoutServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PayoutServiceAsync {

    private val withRawResponse: PayoutServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val breakup: BreakupServiceAsync by lazy { BreakupServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PayoutServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PayoutServiceAsync =
        PayoutServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun breakup(): BreakupServiceAsync = breakup

    override suspend fun list(
        params: PayoutListParams,
        requestOptions: RequestOptions,
    ): PayoutListPageAsync =
        // get /payouts
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayoutServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val breakup: BreakupServiceAsync.WithRawResponse by lazy {
            BreakupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PayoutServiceAsync.WithRawResponse =
            PayoutServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun breakup(): BreakupServiceAsync.WithRawResponse = breakup

        private val listHandler: Handler<PayoutListPageResponse> =
            jsonHandler<PayoutListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PayoutListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayoutListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payouts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PayoutListPageAsync.builder()
                            .service(PayoutServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
