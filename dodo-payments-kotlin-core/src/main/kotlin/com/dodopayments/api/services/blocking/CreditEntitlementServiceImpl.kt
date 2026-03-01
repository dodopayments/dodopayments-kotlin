// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.emptyHandler
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
import com.dodopayments.api.models.creditentitlements.CreditEntitlement
import com.dodopayments.api.models.creditentitlements.CreditEntitlementCreateParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementDeleteParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementListPage
import com.dodopayments.api.models.creditentitlements.CreditEntitlementListPageResponse
import com.dodopayments.api.models.creditentitlements.CreditEntitlementListParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementRetrieveParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUndeleteParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUpdateParams
import com.dodopayments.api.services.blocking.creditentitlements.BalanceService
import com.dodopayments.api.services.blocking.creditentitlements.BalanceServiceImpl

class CreditEntitlementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditEntitlementService {

    private val withRawResponse: CreditEntitlementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptions) }

    override fun withRawResponse(): CreditEntitlementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditEntitlementService =
        CreditEntitlementServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun balances(): BalanceService = balances

    override fun create(
        params: CreditEntitlementCreateParams,
        requestOptions: RequestOptions,
    ): CreditEntitlement =
        // post /credit-entitlements
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CreditEntitlementRetrieveParams,
        requestOptions: RequestOptions,
    ): CreditEntitlement =
        // get /credit-entitlements/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: CreditEntitlementUpdateParams, requestOptions: RequestOptions) {
        // patch /credit-entitlements/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(
        params: CreditEntitlementListParams,
        requestOptions: RequestOptions,
    ): CreditEntitlementListPage =
        // get /credit-entitlements
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CreditEntitlementDeleteParams, requestOptions: RequestOptions) {
        // delete /credit-entitlements/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun undelete(params: CreditEntitlementUndeleteParams, requestOptions: RequestOptions) {
        // post /credit-entitlements/{id}/undelete
        withRawResponse().undelete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditEntitlementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val balances: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CreditEntitlementService.WithRawResponse =
            CreditEntitlementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun balances(): BalanceService.WithRawResponse = balances

        private val createHandler: Handler<CreditEntitlement> =
            jsonHandler<CreditEntitlement>(clientOptions.jsonMapper)

        override fun create(
            params: CreditEntitlementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditEntitlement> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<CreditEntitlement> =
            jsonHandler<CreditEntitlement>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CreditEntitlementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditEntitlement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: CreditEntitlementUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<CreditEntitlementListPageResponse> =
            jsonHandler<CreditEntitlementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CreditEntitlementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditEntitlementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements")
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
                        CreditEntitlementListPage.builder()
                            .service(CreditEntitlementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CreditEntitlementDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val undeleteHandler: Handler<Void?> = emptyHandler()

        override fun undelete(
            params: CreditEntitlementUndeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0), "undelete")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { undeleteHandler.handle(it) }
            }
        }
    }
}
