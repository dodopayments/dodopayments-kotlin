// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.products

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
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateParams
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateResponse
import com.dodopayments.api.models.products.shortlinks.ShortLinkListPage
import com.dodopayments.api.models.products.shortlinks.ShortLinkListPageResponse
import com.dodopayments.api.models.products.shortlinks.ShortLinkListParams

class ShortLinkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ShortLinkService {

    private val withRawResponse: ShortLinkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ShortLinkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShortLinkService =
        ShortLinkServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: ShortLinkCreateParams,
        requestOptions: RequestOptions,
    ): ShortLinkCreateResponse =
        // post /products/{id}/short_links
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: ShortLinkListParams,
        requestOptions: RequestOptions,
    ): ShortLinkListPage =
        // get /products/short_links
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ShortLinkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ShortLinkService.WithRawResponse =
            ShortLinkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<ShortLinkCreateResponse> =
            jsonHandler<ShortLinkCreateResponse>(clientOptions.jsonMapper)

        override fun create(
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

        private val listHandler: Handler<ShortLinkListPageResponse> =
            jsonHandler<ShortLinkListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ShortLinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShortLinkListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("products", "short_links")
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
                        ShortLinkListPage.builder()
                            .service(ShortLinkServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
