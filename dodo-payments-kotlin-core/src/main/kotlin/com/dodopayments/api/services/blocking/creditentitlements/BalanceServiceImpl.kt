// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.creditentitlements

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
import com.dodopayments.api.core.prepare
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsPage
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerPage
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListPage
import com.dodopayments.api.models.creditentitlements.balances.BalanceListPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceRetrieveParams
import com.dodopayments.api.models.creditentitlements.balances.CustomerCreditBalance

class BalanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceService {

    private val withRawResponse: BalanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceService =
        BalanceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: BalanceRetrieveParams,
        requestOptions: RequestOptions,
    ): CustomerCreditBalance =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: BalanceListParams, requestOptions: RequestOptions): BalanceListPage =
        // get /credit-entitlements/{credit_entitlement_id}/balances
        withRawResponse().list(params, requestOptions).parse()

    override fun createLedgerEntry(
        params: BalanceCreateLedgerEntryParams,
        requestOptions: RequestOptions,
    ): BalanceCreateLedgerEntryResponse =
        // post /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/ledger-entries
        withRawResponse().createLedgerEntry(params, requestOptions).parse()

    override fun listGrants(
        params: BalanceListGrantsParams,
        requestOptions: RequestOptions,
    ): BalanceListGrantsPage =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/grants
        withRawResponse().listGrants(params, requestOptions).parse()

    override fun listLedger(
        params: BalanceListLedgerParams,
        requestOptions: RequestOptions,
    ): BalanceListLedgerPage =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/ledger
        withRawResponse().listLedger(params, requestOptions).parse()

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

        private val retrieveHandler: Handler<CustomerCreditBalance> =
            jsonHandler<CustomerCreditBalance>(clientOptions.jsonMapper)

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: BalanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("creditEntitlementId", params.creditEntitlementId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0), "balances")
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
                        BalanceListPage.builder()
                            .service(BalanceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val createLedgerEntryHandler: Handler<BalanceCreateLedgerEntryResponse> =
            jsonHandler<BalanceCreateLedgerEntryResponse>(clientOptions.jsonMapper)

        override fun createLedgerEntry(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun listGrants(
            params: BalanceListGrantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceListGrantsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listGrantsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BalanceListGrantsPage.builder()
                            .service(BalanceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listLedgerHandler: Handler<BalanceListLedgerPageResponse> =
            jsonHandler<BalanceListLedgerPageResponse>(clientOptions.jsonMapper)

        override fun listLedger(
            params: BalanceListLedgerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceListLedgerPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLedgerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BalanceListLedgerPage.builder()
                            .service(BalanceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
