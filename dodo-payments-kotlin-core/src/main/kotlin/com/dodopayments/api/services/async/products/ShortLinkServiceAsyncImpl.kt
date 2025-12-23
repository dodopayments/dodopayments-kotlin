// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

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
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateParams
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateResponse
import com.dodopayments.api.models.products.shortlinks.ShortLinkListPageAsync
import com.dodopayments.api.models.products.shortlinks.ShortLinkListPageResponse
import com.dodopayments.api.models.products.shortlinks.ShortLinkListParams

class ShortLinkServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ShortLinkServiceAsync {

    private val withRawResponse: ShortLinkServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ShortLinkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShortLinkServiceAsync =
        ShortLinkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: ShortLinkCreateParams,
        requestOptions: RequestOptions,
    ): ShortLinkCreateResponse =
        // post /products/{id}/short_links
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: ShortLinkListParams,
        requestOptions: RequestOptions,
    ): ShortLinkListPageAsync =
        // get /products/short_links
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ShortLinkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ShortLinkServiceAsync.WithRawResponse =
            ShortLinkServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<ShortLinkCreateResponse> =
            jsonHandler<ShortLinkCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: ShortLinkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShortLinkCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("products", params._pathParam(0), "short_links")
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

        private val listHandler: Handler<ShortLinkListPageResponse> =
            jsonHandler<ShortLinkListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ShortLinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShortLinkListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("products", "short_links")
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
                        ShortLinkListPageAsync.builder()
                            .service(ShortLinkServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
