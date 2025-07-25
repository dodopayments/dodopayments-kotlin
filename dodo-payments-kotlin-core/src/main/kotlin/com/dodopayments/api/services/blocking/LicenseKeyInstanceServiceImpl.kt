// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

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
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListPage
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListPageResponse
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams

class LicenseKeyInstanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseKeyInstanceService {

    private val withRawResponse: LicenseKeyInstanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LicenseKeyInstanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LicenseKeyInstanceService =
        LicenseKeyInstanceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: LicenseKeyInstanceRetrieveParams,
        requestOptions: RequestOptions,
    ): LicenseKeyInstance =
        // get /license_key_instances/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LicenseKeyInstanceUpdateParams,
        requestOptions: RequestOptions,
    ): LicenseKeyInstance =
        // patch /license_key_instances/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LicenseKeyInstanceListParams,
        requestOptions: RequestOptions,
    ): LicenseKeyInstanceListPage =
        // get /license_key_instances
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseKeyInstanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LicenseKeyInstanceService.WithRawResponse =
            LicenseKeyInstanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<LicenseKeyInstance> =
            jsonHandler<LicenseKeyInstance>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LicenseKeyInstanceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyInstance> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("license_key_instances", params._pathParam(0))
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

        private val updateHandler: Handler<LicenseKeyInstance> =
            jsonHandler<LicenseKeyInstance>(clientOptions.jsonMapper)

        override fun update(
            params: LicenseKeyInstanceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyInstance> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("license_key_instances", params._pathParam(0))
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

        private val listHandler: Handler<LicenseKeyInstanceListPageResponse> =
            jsonHandler<LicenseKeyInstanceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LicenseKeyInstanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyInstanceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("license_key_instances")
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
                        LicenseKeyInstanceListPage.builder()
                            .service(LicenseKeyInstanceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
