// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

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
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.entitlements.Entitlement
import com.dodopayments.api.models.entitlements.EntitlementCreateParams
import com.dodopayments.api.models.entitlements.EntitlementDeleteParams
import com.dodopayments.api.models.entitlements.EntitlementListPageAsync
import com.dodopayments.api.models.entitlements.EntitlementListPageResponse
import com.dodopayments.api.models.entitlements.EntitlementListParams
import com.dodopayments.api.models.entitlements.EntitlementRetrieveParams
import com.dodopayments.api.models.entitlements.EntitlementUpdateParams
import com.dodopayments.api.services.async.entitlements.FileServiceAsync
import com.dodopayments.api.services.async.entitlements.FileServiceAsyncImpl
import com.dodopayments.api.services.async.entitlements.GrantServiceAsync
import com.dodopayments.api.services.async.entitlements.GrantServiceAsyncImpl

class EntitlementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EntitlementServiceAsync {

    private val withRawResponse: EntitlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    private val grants: GrantServiceAsync by lazy { GrantServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EntitlementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntitlementServiceAsync =
        EntitlementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun files(): FileServiceAsync = files

    override fun grants(): GrantServiceAsync = grants

    override suspend fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions,
    ): Entitlement =
        // post /entitlements
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: EntitlementRetrieveParams,
        requestOptions: RequestOptions,
    ): Entitlement =
        // get /entitlements/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions,
    ): Entitlement =
        // patch /entitlements/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions,
    ): EntitlementListPageAsync =
        // get /entitlements
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: EntitlementDeleteParams, requestOptions: RequestOptions) {
        // delete /entitlements/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntitlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val grants: GrantServiceAsync.WithRawResponse by lazy {
            GrantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntitlementServiceAsync.WithRawResponse =
            EntitlementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun files(): FileServiceAsync.WithRawResponse = files

        override fun grants(): GrantServiceAsync.WithRawResponse = grants

        private val createHandler: Handler<Entitlement> =
            jsonHandler<Entitlement>(clientOptions.jsonMapper)

        override suspend fun create(
            params: EntitlementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entitlement> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements")
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

        private val retrieveHandler: Handler<Entitlement> =
            jsonHandler<Entitlement>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: EntitlementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entitlement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements", params._pathParam(0))
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

        private val updateHandler: Handler<Entitlement> =
            jsonHandler<Entitlement>(clientOptions.jsonMapper)

        override suspend fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entitlement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EntitlementListPageResponse> =
            jsonHandler<EntitlementListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements")
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
                        EntitlementListPageAsync.builder()
                            .service(EntitlementServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: EntitlementDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
