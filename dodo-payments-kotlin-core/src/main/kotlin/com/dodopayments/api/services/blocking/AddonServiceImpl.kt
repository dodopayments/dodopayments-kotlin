// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepare
import com.dodopayments.api.models.addons.AddonCreateParams
import com.dodopayments.api.models.addons.AddonListPage
import com.dodopayments.api.models.addons.AddonListPageResponse
import com.dodopayments.api.models.addons.AddonListParams
import com.dodopayments.api.models.addons.AddonResponse
import com.dodopayments.api.models.addons.AddonRetrieveParams
import com.dodopayments.api.models.addons.AddonUpdateImagesParams
import com.dodopayments.api.models.addons.AddonUpdateImagesResponse
import com.dodopayments.api.models.addons.AddonUpdateParams

class AddonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AddonService {

    private val withRawResponse: AddonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AddonService.WithRawResponse = withRawResponse

    override fun create(params: AddonCreateParams, requestOptions: RequestOptions): AddonResponse =
        // post /addons
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AddonRetrieveParams,
        requestOptions: RequestOptions,
    ): AddonResponse =
        // get /addons/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AddonUpdateParams, requestOptions: RequestOptions): AddonResponse =
        // patch /addons/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AddonListParams, requestOptions: RequestOptions): AddonListPage =
        // get /addons
        withRawResponse().list(params, requestOptions).parse()

    override fun updateImages(
        params: AddonUpdateImagesParams,
        requestOptions: RequestOptions,
    ): AddonUpdateImagesResponse =
        // put /addons/{id}/images
        withRawResponse().updateImages(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddonService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AddonResponse> =
            jsonHandler<AddonResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AddonCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("addons")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<AddonResponse> =
            jsonHandler<AddonResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("addons", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<AddonResponse> =
            jsonHandler<AddonResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("addons", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AddonListPageResponse> =
            jsonHandler<AddonListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AddonListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("addons")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AddonListPage.builder()
                            .service(AddonServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val updateImagesHandler: Handler<AddonUpdateImagesResponse> =
            jsonHandler<AddonUpdateImagesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateImages(
            params: AddonUpdateImagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddonUpdateImagesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("addons", params._pathParam(0), "images")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateImagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
