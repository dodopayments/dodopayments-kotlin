// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.Customer
import com.dodopayments.api.models.customers.CustomerCreateParams
import com.dodopayments.api.models.customers.CustomerListCreditEntitlementsParams
import com.dodopayments.api.models.customers.CustomerListCreditEntitlementsResponse
import com.dodopayments.api.models.customers.CustomerListPageAsync
import com.dodopayments.api.models.customers.CustomerListParams
import com.dodopayments.api.models.customers.CustomerRetrieveParams
import com.dodopayments.api.models.customers.CustomerRetrievePaymentMethodsParams
import com.dodopayments.api.models.customers.CustomerRetrievePaymentMethodsResponse
import com.dodopayments.api.models.customers.CustomerUpdateParams
import com.dodopayments.api.services.async.customers.CustomerPortalServiceAsync
import com.dodopayments.api.services.async.customers.WalletServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerServiceAsync

    fun customerPortal(): CustomerPortalServiceAsync

    fun wallets(): WalletServiceAsync

    suspend fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    suspend fun retrieve(
        customerId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer = retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /** @see retrieve */
    suspend fun retrieve(customerId: String, requestOptions: RequestOptions): Customer =
        retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

    suspend fun update(
        customerId: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer = update(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /** @see update */
    suspend fun update(customerId: String, requestOptions: RequestOptions): Customer =
        update(customerId, CustomerUpdateParams.none(), requestOptions)

    suspend fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CustomerListPageAsync =
        list(CustomerListParams.none(), requestOptions)

    /** List all credit entitlements for a customer with their current balances */
    suspend fun listCreditEntitlements(
        customerId: String,
        params: CustomerListCreditEntitlementsParams = CustomerListCreditEntitlementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListCreditEntitlementsResponse =
        listCreditEntitlements(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see listCreditEntitlements */
    suspend fun listCreditEntitlements(
        params: CustomerListCreditEntitlementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListCreditEntitlementsResponse

    /** @see listCreditEntitlements */
    suspend fun listCreditEntitlements(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerListCreditEntitlementsResponse =
        listCreditEntitlements(
            customerId,
            CustomerListCreditEntitlementsParams.none(),
            requestOptions,
        )

    suspend fun retrievePaymentMethods(
        customerId: String,
        params: CustomerRetrievePaymentMethodsParams = CustomerRetrievePaymentMethodsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrievePaymentMethodsResponse =
        retrievePaymentMethods(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrievePaymentMethods */
    suspend fun retrievePaymentMethods(
        params: CustomerRetrievePaymentMethodsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrievePaymentMethodsResponse

    /** @see retrievePaymentMethods */
    suspend fun retrievePaymentMethods(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerRetrievePaymentMethodsResponse =
        retrievePaymentMethods(
            customerId,
            CustomerRetrievePaymentMethodsParams.none(),
            requestOptions,
        )

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CustomerServiceAsync.WithRawResponse

        fun customerPortal(): CustomerPortalServiceAsync.WithRawResponse

        fun wallets(): WalletServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}`, but is otherwise the same
         * as [CustomerServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            customerId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer> =
            retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> =
            retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /customers/{customer_id}`, but is otherwise the
         * same as [CustomerServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            customerId: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer> =
            update(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> =
            update(customerId, CustomerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPageAsync> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credit-entitlements`, but
         * is otherwise the same as [CustomerServiceAsync.listCreditEntitlements].
         */
        @MustBeClosed
        suspend fun listCreditEntitlements(
            customerId: String,
            params: CustomerListCreditEntitlementsParams =
                CustomerListCreditEntitlementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListCreditEntitlementsResponse> =
            listCreditEntitlements(
                params.toBuilder().customerId(customerId).build(),
                requestOptions,
            )

        /** @see listCreditEntitlements */
        @MustBeClosed
        suspend fun listCreditEntitlements(
            params: CustomerListCreditEntitlementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListCreditEntitlementsResponse>

        /** @see listCreditEntitlements */
        @MustBeClosed
        suspend fun listCreditEntitlements(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerListCreditEntitlementsResponse> =
            listCreditEntitlements(
                customerId,
                CustomerListCreditEntitlementsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/payment-methods`, but is
         * otherwise the same as [CustomerServiceAsync.retrievePaymentMethods].
         */
        @MustBeClosed
        suspend fun retrievePaymentMethods(
            customerId: String,
            params: CustomerRetrievePaymentMethodsParams =
                CustomerRetrievePaymentMethodsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrievePaymentMethodsResponse> =
            retrievePaymentMethods(
                params.toBuilder().customerId(customerId).build(),
                requestOptions,
            )

        /** @see retrievePaymentMethods */
        @MustBeClosed
        suspend fun retrievePaymentMethods(
            params: CustomerRetrievePaymentMethodsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrievePaymentMethodsResponse>

        /** @see retrievePaymentMethods */
        @MustBeClosed
        suspend fun retrievePaymentMethods(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerRetrievePaymentMethodsResponse> =
            retrievePaymentMethods(
                customerId,
                CustomerRetrievePaymentMethodsParams.none(),
                requestOptions,
            )
    }
}
