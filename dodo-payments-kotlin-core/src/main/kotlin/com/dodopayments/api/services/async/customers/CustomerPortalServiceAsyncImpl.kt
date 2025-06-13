// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.customers.CustomerPortalSession
import com.dodopayments.api.models.customers.customerportal.CustomerPortalCreateParams

class CustomerPortalServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CustomerPortalServiceAsync {

    private val withRawResponse: CustomerPortalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerPortalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): CustomerPortalServiceAsync =
        CustomerPortalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CustomerPortalCreateParams,
        requestOptions: RequestOptions,
    ): CustomerPortalSession =
        // post /customers/{customer_id}/customer-portal/session
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerPortalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CustomerPortalServiceAsync.WithRawResponse =
            CustomerPortalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CustomerPortalSession> =
            jsonHandler<CustomerPortalSession>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: CustomerPortalCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPortalSession> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "customer-portal",
                        "session",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
