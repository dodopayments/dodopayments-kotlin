// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.Customer
import com.dodopayments.api.models.customers.CustomerCreateParams
import com.dodopayments.api.models.customers.CustomerDeletePaymentMethodParams
import com.dodopayments.api.models.customers.CustomerListCreditEntitlementsParams
import com.dodopayments.api.models.customers.CustomerListCreditEntitlementsResponse
import com.dodopayments.api.models.customers.CustomerListPage
import com.dodopayments.api.models.customers.CustomerListParams
import com.dodopayments.api.models.customers.CustomerRetrieveParams
import com.dodopayments.api.models.customers.CustomerRetrievePaymentMethodsParams
import com.dodopayments.api.models.customers.CustomerRetrievePaymentMethodsResponse
import com.dodopayments.api.models.customers.CustomerUpdateParams
import com.dodopayments.api.services.blocking.customers.CustomerPortalService
import com.dodopayments.api.services.blocking.customers.WalletService
import com.google.errorprone.annotations.MustBeClosed

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerService

    fun customerPortal(): CustomerPortalService

    fun wallets(): WalletService

    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    fun retrieve(
        customerId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer = retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /** @see retrieve */
    fun retrieve(customerId: String, requestOptions: RequestOptions): Customer =
        retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

    fun update(
        customerId: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer = update(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see update */
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Customer

    /** @see update */
    fun update(customerId: String, requestOptions: RequestOptions): Customer =
        update(customerId, CustomerUpdateParams.none(), requestOptions)

    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomerListPage =
        list(CustomerListParams.none(), requestOptions)

    fun deletePaymentMethod(
        paymentMethodId: String,
        params: CustomerDeletePaymentMethodParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deletePaymentMethod(
            params.toBuilder().paymentMethodId(paymentMethodId).build(),
            requestOptions,
        )

    /** @see deletePaymentMethod */
    fun deletePaymentMethod(
        params: CustomerDeletePaymentMethodParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List all credit entitlements for a customer with their current balances */
    fun listCreditEntitlements(
        customerId: String,
        params: CustomerListCreditEntitlementsParams = CustomerListCreditEntitlementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListCreditEntitlementsResponse =
        listCreditEntitlements(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see listCreditEntitlements */
    fun listCreditEntitlements(
        params: CustomerListCreditEntitlementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListCreditEntitlementsResponse

    /** @see listCreditEntitlements */
    fun listCreditEntitlements(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerListCreditEntitlementsResponse =
        listCreditEntitlements(
            customerId,
            CustomerListCreditEntitlementsParams.none(),
            requestOptions,
        )

    fun retrievePaymentMethods(
        customerId: String,
        params: CustomerRetrievePaymentMethodsParams = CustomerRetrievePaymentMethodsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrievePaymentMethodsResponse =
        retrievePaymentMethods(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrievePaymentMethods */
    fun retrievePaymentMethods(
        params: CustomerRetrievePaymentMethodsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrievePaymentMethodsResponse

    /** @see retrievePaymentMethods */
    fun retrievePaymentMethods(
        customerId: String,
        requestOptions: RequestOptions,
    ): CustomerRetrievePaymentMethodsResponse =
        retrievePaymentMethods(
            customerId,
            CustomerRetrievePaymentMethodsParams.none(),
            requestOptions,
        )

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerService.WithRawResponse

        fun customerPortal(): CustomerPortalService.WithRawResponse

        fun wallets(): WalletService.WithRawResponse

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
            customerId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer> =
            retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Customer> =
            retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /customers/{customer_id}`, but is otherwise the
         * same as [CustomerService.update].
         */
        @MustBeClosed
        fun update(
            customerId: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer> =
            update(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Customer>

        /** @see update */
        @MustBeClosed
        fun update(customerId: String, requestOptions: RequestOptions): HttpResponseFor<Customer> =
            update(customerId, CustomerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerService.list].
         */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPage> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /customers/{customer_id}/payment-methods/{payment_method_id}`, but is otherwise the same
         * as [CustomerService.deletePaymentMethod].
         */
        @MustBeClosed
        fun deletePaymentMethod(
            paymentMethodId: String,
            params: CustomerDeletePaymentMethodParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deletePaymentMethod(
                params.toBuilder().paymentMethodId(paymentMethodId).build(),
                requestOptions,
            )

        /** @see deletePaymentMethod */
        @MustBeClosed
        fun deletePaymentMethod(
            params: CustomerDeletePaymentMethodParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credit-entitlements`, but
         * is otherwise the same as [CustomerService.listCreditEntitlements].
         */
        @MustBeClosed
        fun listCreditEntitlements(
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
        fun listCreditEntitlements(
            params: CustomerListCreditEntitlementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListCreditEntitlementsResponse>

        /** @see listCreditEntitlements */
        @MustBeClosed
        fun listCreditEntitlements(
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
         * otherwise the same as [CustomerService.retrievePaymentMethods].
         */
        @MustBeClosed
        fun retrievePaymentMethods(
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
        fun retrievePaymentMethods(
            params: CustomerRetrievePaymentMethodsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrievePaymentMethodsResponse>

        /** @see retrievePaymentMethods */
        @MustBeClosed
        fun retrievePaymentMethods(
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
