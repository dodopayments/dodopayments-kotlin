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
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerPage
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerPageResponse
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerParams

class BalanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceService {

    private val withRawResponse: BalanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceService =
        BalanceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieveLedger(
        params: BalanceRetrieveLedgerParams,
        requestOptions: RequestOptions,
    ): BalanceRetrieveLedgerPage =
        // get /balances/ledger
        withRawResponse().retrieveLedger(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceService.WithRawResponse =
            BalanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveLedgerHandler: Handler<BalanceRetrieveLedgerPageResponse> =
            jsonHandler<BalanceRetrieveLedgerPageResponse>(clientOptions.jsonMapper)

        override fun retrieveLedger(
            params: BalanceRetrieveLedgerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceRetrieveLedgerPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("balances", "ledger")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveLedgerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BalanceRetrieveLedgerPage.builder()
                            .service(BalanceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
