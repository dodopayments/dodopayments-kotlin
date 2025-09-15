// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers.wallets

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.errorBodyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.customers.wallets.CustomerWallet
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryCreateParams
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListPageAsync
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListPageResponse
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListParams

class LedgerEntryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerEntryServiceAsync {

    private val withRawResponse: LedgerEntryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerEntryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerEntryServiceAsync =
        LedgerEntryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: LedgerEntryCreateParams,
        requestOptions: RequestOptions,
    ): CustomerWallet =
        // post /customers/{customer_id}/wallets/ledger-entries
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: LedgerEntryListParams,
        requestOptions: RequestOptions,
    ): LedgerEntryListPageAsync =
        // get /customers/{customer_id}/wallets/ledger-entries
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerEntryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerEntryServiceAsync.WithRawResponse =
            LedgerEntryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CustomerWallet> =
            jsonHandler<CustomerWallet>(clientOptions.jsonMapper)

        override suspend fun create(
            params: LedgerEntryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerWallet> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "wallets", "ledger-entries")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<LedgerEntryListPageResponse> =
            jsonHandler<LedgerEntryListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: LedgerEntryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerEntryListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "wallets", "ledger-entries")
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
                        LedgerEntryListPageAsync.builder()
                            .service(LedgerEntryServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
