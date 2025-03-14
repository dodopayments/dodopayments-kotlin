// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.handlers.errorHandler
import com.dodo_payments.api.core.handlers.jsonHandler
import com.dodo_payments.api.core.handlers.withErrorHandler
import com.dodo_payments.api.core.http.HttpMethod
import com.dodo_payments.api.core.http.HttpRequest
import com.dodo_payments.api.core.http.HttpResponse.Handler
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.core.http.json
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepare
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams

class LicenseKeyInstanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseKeyInstanceService {

    private val withRawResponse: LicenseKeyInstanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LicenseKeyInstanceService.WithRawResponse = withRawResponse

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
    ): List<ListLicenseKeyInstancesResponse> =
        // get /license_key_instances
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseKeyInstanceService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<LicenseKeyInstance> =
            jsonHandler<LicenseKeyInstance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LicenseKeyInstanceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyInstance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("license_key_instances", params.getPathParam(0))
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

        private val updateHandler: Handler<LicenseKeyInstance> =
            jsonHandler<LicenseKeyInstance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LicenseKeyInstanceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseKeyInstance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("license_key_instances", params.getPathParam(0))
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

        private val listHandler: Handler<List<ListLicenseKeyInstancesResponse>> =
            jsonHandler<List<ListLicenseKeyInstancesResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LicenseKeyInstanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ListLicenseKeyInstancesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("license_key_instances")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
