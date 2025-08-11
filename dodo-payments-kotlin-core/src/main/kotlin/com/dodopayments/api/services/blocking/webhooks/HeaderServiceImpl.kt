// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.webhooks

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
import com.dodopayments.api.models.webhooks.headers.HeaderRetrieveParams
import com.dodopayments.api.models.webhooks.headers.HeaderRetrieveResponse
import com.dodopayments.api.models.webhooks.headers.HeaderUpdateParams

class HeaderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HeaderService {

    private val withRawResponse: HeaderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HeaderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HeaderService =
        HeaderServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: HeaderRetrieveParams,
        requestOptions: RequestOptions,
    ): HeaderRetrieveResponse =
        // get /webhooks/{webhook_id}/headers
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: HeaderUpdateParams, requestOptions: RequestOptions) {
        // patch /webhooks/{webhook_id}/headers
        withRawResponse().update(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HeaderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HeaderService.WithRawResponse =
            HeaderServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<HeaderRetrieveResponse> =
            jsonHandler<HeaderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: HeaderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HeaderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", params._pathParam(0), "headers")
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
            params: HeaderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", params._pathParam(0), "headers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }
    }
}
