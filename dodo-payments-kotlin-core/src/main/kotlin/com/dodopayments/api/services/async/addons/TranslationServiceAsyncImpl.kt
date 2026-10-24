// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.addons

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
import com.dodopayments.api.models.addons.translations.TranslationDeleteParams
import com.dodopayments.api.models.addons.translations.TranslationListParams
import com.dodopayments.api.models.addons.translations.TranslationUpdateParams
import com.dodopayments.api.models.products.translations.Translation
import com.dodopayments.api.models.products.translations.TranslationsListResponse

class TranslationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TranslationServiceAsync {

    private val withRawResponse: TranslationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TranslationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TranslationServiceAsync =
        TranslationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun update(
        params: TranslationUpdateParams,
        requestOptions: RequestOptions,
    ): Translation =
        // put /addons/{id}/translations/{locale}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: TranslationListParams,
        requestOptions: RequestOptions,
    ): TranslationsListResponse =
        // get /addons/{id}/translations
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: TranslationDeleteParams, requestOptions: RequestOptions) {
        // delete /addons/{id}/translations/{locale}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TranslationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TranslationServiceAsync.WithRawResponse =
            TranslationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val updateHandler: Handler<Translation> =
            jsonHandler<Translation>(clientOptions.jsonMapper)

        override suspend fun update(
            params: TranslationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Translation> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("locale", params.locale())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "addons",
                        params._pathParam(0),
                        "translations",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<TranslationsListResponse> =
            jsonHandler<TranslationsListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TranslationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TranslationsListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addons", params._pathParam(0), "translations")
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: TranslationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("locale", params.locale())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "addons",
                        params._pathParam(0),
                        "translations",
                        params._pathParam(1),
                    )
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
