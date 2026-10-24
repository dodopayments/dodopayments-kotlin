// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.entitlements

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
import com.dodopayments.api.models.entitlements.translations.EntitlementTranslation
import com.dodopayments.api.models.entitlements.translations.EntitlementTranslationsListResponse
import com.dodopayments.api.models.entitlements.translations.TranslationDeleteParams
import com.dodopayments.api.models.entitlements.translations.TranslationListParams
import com.dodopayments.api.models.entitlements.translations.TranslationUpdateParams

class TranslationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TranslationService {

    private val withRawResponse: TranslationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TranslationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TranslationService =
        TranslationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun update(
        params: TranslationUpdateParams,
        requestOptions: RequestOptions,
    ): EntitlementTranslation =
        // put /entitlements/{id}/translations/{locale}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TranslationListParams,
        requestOptions: RequestOptions,
    ): EntitlementTranslationsListResponse =
        // get /entitlements/{id}/translations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TranslationDeleteParams, requestOptions: RequestOptions) {
        // delete /entitlements/{id}/translations/{locale}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TranslationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TranslationService.WithRawResponse =
            TranslationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val updateHandler: Handler<EntitlementTranslation> =
            jsonHandler<EntitlementTranslation>(clientOptions.jsonMapper)

        override fun update(
            params: TranslationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementTranslation> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("locale", params.locale())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "entitlements",
                        params._pathParam(0),
                        "translations",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<EntitlementTranslationsListResponse> =
            jsonHandler<EntitlementTranslationsListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TranslationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitlementTranslationsListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entitlements", params._pathParam(0), "translations")
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
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
                        "entitlements",
                        params._pathParam(0),
                        "translations",
                        params._pathParam(1),
                    )
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
