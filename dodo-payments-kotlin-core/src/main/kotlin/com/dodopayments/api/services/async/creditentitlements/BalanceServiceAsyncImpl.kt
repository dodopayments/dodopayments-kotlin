// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.creditentitlements

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
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsPageAsync
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerPageAsync
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListPageAsync
import com.dodopayments.api.models.creditentitlements.balances.BalanceListPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceRetrieveParams
import com.dodopayments.api.models.creditentitlements.balances.CustomerCreditBalance

class BalanceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceServiceAsync {

    private val withRawResponse: BalanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceServiceAsync =
        BalanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: BalanceRetrieveParams,
        requestOptions: RequestOptions,
    ): CustomerCreditBalance =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions,
    ): BalanceListPageAsync =
        // get /credit-entitlements/{credit_entitlement_id}/balances
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun createLedgerEntry(
        params: BalanceCreateLedgerEntryParams,
        requestOptions: RequestOptions,
    ): BalanceCreateLedgerEntryResponse =
        // post /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/ledger-entries
        withRawResponse().createLedgerEntry(params, requestOptions).parse()

    override suspend fun listGrants(
        params: BalanceListGrantsParams,
        requestOptions: RequestOptions,
    ): BalanceListGrantsPageAsync =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/grants
        withRawResponse().listGrants(params, requestOptions).parse()

    override suspend fun listLedger(
        params: BalanceListLedgerParams,
        requestOptions: RequestOptions,
    ): BalanceListLedgerPageAsync =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/ledger
        withRawResponse().listLedger(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BalanceServiceAsync.WithRawResponse =
            BalanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<CustomerCreditBalance> =
            jsonHandler<CustomerCreditBalance>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: BalanceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerCreditBalance> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "credit-entitlements",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BalanceListPageResponse> =
            jsonHandler<BalanceListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: BalanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("creditEntitlementId", params.creditEntitlementId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0), "balances")
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
                        BalanceListPageAsync.builder()
                            .service(BalanceServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val createLedgerEntryHandler: Handler<BalanceCreateLedgerEntryResponse> =
            jsonHandler<BalanceCreateLedgerEntryResponse>(clientOptions.jsonMapper)

        override suspend fun createLedgerEntry(
            params: BalanceCreateLedgerEntryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceCreateLedgerEntryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "credit-entitlements",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "ledger-entries",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createLedgerEntryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listGrantsHandler: Handler<BalanceListGrantsPageResponse> =
            jsonHandler<BalanceListGrantsPageResponse>(clientOptions.jsonMapper)

        override suspend fun listGrants(
            params: BalanceListGrantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceListGrantsPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "credit-entitlements",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "grants",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listGrantsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BalanceListGrantsPageAsync.builder()
                            .service(BalanceServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listLedgerHandler: Handler<BalanceListLedgerPageResponse> =
            jsonHandler<BalanceListLedgerPageResponse>(clientOptions.jsonMapper)

        override suspend fun listLedger(
            params: BalanceListLedgerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceListLedgerPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "credit-entitlements",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "ledger",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLedgerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BalanceListLedgerPageAsync.builder()
                            .service(BalanceServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
