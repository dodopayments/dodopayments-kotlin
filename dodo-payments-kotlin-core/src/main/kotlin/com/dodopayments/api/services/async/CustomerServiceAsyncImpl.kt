// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

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
import com.dodopayments.api.models.customers.Customer
import com.dodopayments.api.models.customers.CustomerCreateParams
import com.dodopayments.api.models.customers.CustomerListPageAsync
import com.dodopayments.api.models.customers.CustomerListPageResponse
import com.dodopayments.api.models.customers.CustomerListParams
import com.dodopayments.api.models.customers.CustomerRetrieveParams
import com.dodopayments.api.models.customers.CustomerUpdateParams
import com.dodopayments.api.services.async.customers.CustomerPortalServiceAsync
import com.dodopayments.api.services.async.customers.CustomerPortalServiceAsyncImpl

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customerPortal: CustomerPortalServiceAsync by lazy {
        CustomerPortalServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerServiceAsync =
        CustomerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun customerPortal(): CustomerPortalServiceAsync = customerPortal

    override suspend fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): Customer =
        // post /customers
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): Customer =
        // get /customers/{customer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): Customer =
        // patch /customers/{customer_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CustomerListPageAsync =
        // get /customers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val customerPortal: CustomerPortalServiceAsync.WithRawResponse by lazy {
            CustomerPortalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CustomerServiceAsync.WithRawResponse =
            CustomerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun customerPortal(): CustomerPortalServiceAsync.WithRawResponse = customerPortal

        private val createHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers")
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

        private val retrieveHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val updateHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper)

        override suspend fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0))
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

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers")
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
                        CustomerListPageAsync.builder()
                            .service(CustomerServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
