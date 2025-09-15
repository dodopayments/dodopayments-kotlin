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
import com.dodopayments.api.models.meters.Meter
import com.dodopayments.api.models.meters.MeterArchiveParams
import com.dodopayments.api.models.meters.MeterCreateParams
import com.dodopayments.api.models.meters.MeterListPageAsync
import com.dodopayments.api.models.meters.MeterListPageResponse
import com.dodopayments.api.models.meters.MeterListParams
import com.dodopayments.api.models.meters.MeterRetrieveParams
import com.dodopayments.api.models.meters.MeterUnarchiveParams

class MeterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeterServiceAsync {

    private val withRawResponse: MeterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MeterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeterServiceAsync =
        MeterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(params: MeterCreateParams, requestOptions: RequestOptions): Meter =
        // post /meters
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions,
    ): Meter =
        // get /meters/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: MeterListParams,
        requestOptions: RequestOptions,
    ): MeterListPageAsync =
        // get /meters
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun archive(params: MeterArchiveParams, requestOptions: RequestOptions) {
        // delete /meters/{id}
        withRawResponse().archive(params, requestOptions)
    }

    override suspend fun unarchive(params: MeterUnarchiveParams, requestOptions: RequestOptions) {
        // post /meters/{id}/unarchive
        withRawResponse().unarchive(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MeterServiceAsync.WithRawResponse =
            MeterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Meter> = jsonHandler<Meter>(clientOptions.jsonMapper)

        override suspend fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Meter> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meters")
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

        private val retrieveHandler: Handler<Meter> = jsonHandler<Meter>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Meter> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meters", params._pathParam(0))
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

        private val listHandler: Handler<MeterListPageResponse> =
            jsonHandler<MeterListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: MeterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeterListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meters")
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
                        MeterListPageAsync.builder()
                            .service(MeterServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<Void?> = emptyHandler()

        override suspend fun archive(
            params: MeterArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meters", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
            }
        }

        private val unarchiveHandler: Handler<Void?> = emptyHandler()

        override suspend fun unarchive(
            params: MeterUnarchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meters", params._pathParam(0), "unarchive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unarchiveHandler.handle(it) }
            }
        }
    }
}
