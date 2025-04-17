// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.customers

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
import com.dodo_payments.api.models.customers.CustomerPortalSession
import com.dodo_payments.api.models.customers.customerportal.CustomerPortalCreateParams

class CustomerPortalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerPortalService {

    private val withRawResponse: CustomerPortalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerPortalService.WithRawResponse = withRawResponse

    override fun create(
        params: CustomerPortalCreateParams,
        requestOptions: RequestOptions,
    ): CustomerPortalSession =
        // post /customers/{customer_id}/customer-portal/session
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerPortalService.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CustomerPortalSession> =
            jsonHandler<CustomerPortalSession>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CustomerPortalCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPortalSession> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "customers",
                        params.getPathParam(0),
                        "customer-portal",
                        "session",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
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
    }
}
