// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers

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
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.models.customers.wallets.WalletListParams
import com.dodopayments.api.models.customers.wallets.WalletListResponse
import com.dodopayments.api.services.blocking.customers.wallets.LedgerEntryService
import com.dodopayments.api.services.blocking.customers.wallets.LedgerEntryServiceImpl

class WalletServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WalletService {

    private val withRawResponse: WalletService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ledgerEntries: LedgerEntryService by lazy { LedgerEntryServiceImpl(clientOptions) }

    override fun withRawResponse(): WalletService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WalletService =
        WalletServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun ledgerEntries(): LedgerEntryService = ledgerEntries

    override fun list(
        params: WalletListParams,
        requestOptions: RequestOptions,
    ): WalletListResponse =
        // get /customers/{customer_id}/wallets
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WalletService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val ledgerEntries: LedgerEntryService.WithRawResponse by lazy {
            LedgerEntryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WalletService.WithRawResponse =
            WalletServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun ledgerEntries(): LedgerEntryService.WithRawResponse = ledgerEntries

        private val listHandler: Handler<WalletListResponse> =
            jsonHandler<WalletListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WalletListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WalletListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "wallets")
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
            }
        }
    }
}
