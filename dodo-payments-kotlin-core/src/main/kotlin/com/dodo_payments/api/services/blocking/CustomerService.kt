// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.customers.Customer
import com.dodo_payments.api.models.customers.CustomerCreateParams
import com.dodo_payments.api.models.customers.CustomerListPage
import com.dodo_payments.api.models.customers.CustomerListParams
import com.dodo_payments.api.models.customers.CustomerRetrieveParams
import com.dodo_payments.api.models.customers.CustomerUpdateParams
import com.dodo_payments.api.services.blocking.customers.CustomerPortalService
import com.google.errorprone.annotations.MustBeClosed

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun customerPortal(): CustomerPortalService

    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CustomerListPage =
        list(CustomerListParams.none(), requestOptions)

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun customerPortal(): CustomerPortalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerService.create].
         */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}`, but is otherwise the same
         * as [CustomerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /**
         * Returns a raw HTTP response for `patch /customers/{customer_id}`, but is otherwise the
         * same as [CustomerService.update].
         */
        @MustBeClosed
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerService.list].
         */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPage> =
            list(CustomerListParams.none(), requestOptions)
    }
}
