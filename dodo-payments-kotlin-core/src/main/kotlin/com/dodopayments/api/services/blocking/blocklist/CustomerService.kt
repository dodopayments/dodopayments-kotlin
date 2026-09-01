// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.blocklist

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.blocklist.customers.BlockedCustomer
import com.dodopayments.api.models.blocklist.customers.CreateBlockedCustomerRequest
import com.dodopayments.api.models.blocklist.customers.CustomerCreateParams
import com.dodopayments.api.models.blocklist.customers.CustomerDeleteParams
import com.dodopayments.api.models.blocklist.customers.CustomerListPage
import com.dodopayments.api.models.blocklist.customers.CustomerListParams
import com.dodopayments.api.models.blocklist.customers.CustomerRetrieveParams
import com.dodopayments.api.services.blocking.blocklist.customers.NoteService
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

    fun notes(): NoteService

    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer

    /** @see create */
    fun create(
        createBlockedCustomerRequest: CreateBlockedCustomerRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer =
        create(
            CustomerCreateParams.builder()
                .createBlockedCustomerRequest(createBlockedCustomerRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        blocklistCustomersBlockByCustomerId:
            CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer =
        create(
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                blocklistCustomersBlockByCustomerId
            ),
            requestOptions,
        )

    /** @see create */
    fun create(
        blocklistCustomersBlockByEmail: CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer =
        create(
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                blocklistCustomersBlockByEmail
            ),
            requestOptions,
        )

    fun retrieve(
        entryId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer = retrieve(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer

    /** @see retrieve */
    fun retrieve(entryId: String, requestOptions: RequestOptions): BlockedCustomer =
        retrieve(entryId, CustomerRetrieveParams.none(), requestOptions)

    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomerListPage =
        list(CustomerListParams.none(), requestOptions)

    fun delete(
        entryId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CustomerDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(entryId: String, requestOptions: RequestOptions) =
        delete(entryId, CustomerDeleteParams.none(), requestOptions)

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CustomerService.WithRawResponse

        fun notes(): NoteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /blocklist/customers`, but is otherwise the same as
         * [CustomerService.create].
         */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer>

        /** @see create */
        @MustBeClosed
        fun create(
            createBlockedCustomerRequest: CreateBlockedCustomerRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            create(
                CustomerCreateParams.builder()
                    .createBlockedCustomerRequest(createBlockedCustomerRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            blocklistCustomersBlockByCustomerId:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            create(
                CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                    blocklistCustomersBlockByCustomerId
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            blocklistCustomersBlockByEmail:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            create(
                CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                    blocklistCustomersBlockByEmail
                ),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /blocklist/customers/{entry_id}`, but is otherwise
         * the same as [CustomerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            entryId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            retrieve(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockedCustomer> =
            retrieve(entryId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /blocklist/customers`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /blocklist/customers/{entry_id}`, but is
         * otherwise the same as [CustomerService.delete].
         */
        @MustBeClosed
        fun delete(
            entryId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(entryId: String, requestOptions: RequestOptions): HttpResponse =
            delete(entryId, CustomerDeleteParams.none(), requestOptions)
    }
}
