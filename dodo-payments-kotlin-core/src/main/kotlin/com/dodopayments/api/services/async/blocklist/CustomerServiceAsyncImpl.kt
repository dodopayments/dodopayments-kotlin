// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.blocklist

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
import com.dodopayments.api.models.blocklist.customers.BlockedCustomer
import com.dodopayments.api.models.blocklist.customers.CustomerCreateParams
import com.dodopayments.api.models.blocklist.customers.CustomerDeleteParams
import com.dodopayments.api.models.blocklist.customers.CustomerListPageAsync
import com.dodopayments.api.models.blocklist.customers.CustomerListPageResponse
import com.dodopayments.api.models.blocklist.customers.CustomerListParams
import com.dodopayments.api.models.blocklist.customers.CustomerRetrieveParams
import com.dodopayments.api.services.async.blocklist.customers.NoteServiceAsync
import com.dodopayments.api.services.async.blocklist.customers.NoteServiceAsyncImpl

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val notes: NoteServiceAsync by lazy { NoteServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerServiceAsync =
        CustomerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun notes(): NoteServiceAsync = notes

    override suspend fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): BlockedCustomer =
        // post /blocklist/customers
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions,
    ): BlockedCustomer =
        // get /blocklist/customers/{entry_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CustomerListPageAsync =
        // get /blocklist/customers
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: CustomerDeleteParams, requestOptions: RequestOptions) {
        // delete /blocklist/customers/{entry_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val notes: NoteServiceAsync.WithRawResponse by lazy {
            NoteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CustomerServiceAsync.WithRawResponse =
            CustomerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun notes(): NoteServiceAsync.WithRawResponse = notes

        private val createHandler: Handler<BlockedCustomer> =
            jsonHandler<BlockedCustomer>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockedCustomer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("blocklist", "customers")
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

        private val retrieveHandler: Handler<BlockedCustomer> =
            jsonHandler<BlockedCustomer>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockedCustomer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entryId", params.entryId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("blocklist", "customers", params._pathParam(0))
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
                    .addPathSegments("blocklist", "customers")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entryId", params.entryId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("blocklist", "customers", params._pathParam(0))
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
