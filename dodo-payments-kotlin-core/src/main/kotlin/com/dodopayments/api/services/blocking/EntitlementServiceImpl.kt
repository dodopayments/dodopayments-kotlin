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
import com.dodopayments.api.models.entitlements.EntitlementCreateParams
import com.dodopayments.api.models.entitlements.EntitlementCreateResponse
import com.dodopayments.api.models.entitlements.EntitlementDeleteParams
import com.dodopayments.api.models.entitlements.EntitlementListPage
import com.dodopayments.api.models.entitlements.EntitlementListPageResponse
import com.dodopayments.api.models.entitlements.EntitlementListParams
import com.dodopayments.api.models.entitlements.EntitlementRetrieveParams
import com.dodopayments.api.models.entitlements.EntitlementRetrieveResponse
import com.dodopayments.api.models.entitlements.EntitlementUpdateParams
import com.dodopayments.api.models.entitlements.EntitlementUpdateResponse
import com.dodopayments.api.services.blocking.entitlements.FileService
import com.dodopayments.api.services.blocking.entitlements.FileServiceImpl
import com.dodopayments.api.services.blocking.entitlements.GrantService
import com.dodopayments.api.services.blocking.entitlements.GrantServiceImpl

class EntitlementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EntitlementService {

    private val withRawResponse: EntitlementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    private val grants: GrantService by lazy { GrantServiceImpl(clientOptions) }

    override fun withRawResponse(): EntitlementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EntitlementService =
        EntitlementServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun files(): FileService = files

    override fun grants(): GrantService = grants

    override fun create(
        params: EntitlementCreateParams,
        requestOptions: RequestOptions,
    ): EntitlementCreateResponse =
        // post /entitlements
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EntitlementRetrieveParams,
        requestOptions: RequestOptions,
    ): EntitlementRetrieveResponse =
        // get /entitlements/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: EntitlementUpdateParams,
        requestOptions: RequestOptions,
    ): EntitlementUpdateResponse =
        // patch /entitlements/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EntitlementListParams,
        requestOptions: RequestOptions,
    ): EntitlementListPage =
        // get /entitlements
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EntitlementDeleteParams, requestOptions: RequestOptions) {
        // delete /entitlements/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntitlementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val grants: GrantService.WithRawResponse by lazy {
            GrantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntitlementService.WithRawResponse =
            EntitlementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun files(): FileService.WithRawResponse = files

        override fun grants(): GrantService.WithRawResponse = grants

        private val createHandler: Handler<EntitlementCreateResponse> =
            jsonHandler<EntitlementCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EntitlementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements")
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

        private val retrieveHandler: Handler<EntitlementRetrieveResponse> =
            jsonHandler<EntitlementRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EntitlementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements", params._pathParam(0))
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

        private val updateHandler: Handler<EntitlementUpdateResponse> =
            jsonHandler<EntitlementUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: EntitlementUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: EntitlementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements")
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
                        EntitlementListPage.builder()
                            .service(EntitlementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
