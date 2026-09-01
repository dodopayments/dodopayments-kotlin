// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.blocklist

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.blocklist.customers.BlockedCustomer
import com.dodopayments.api.models.blocklist.customers.CreateBlockedCustomerRequest
import com.dodopayments.api.models.blocklist.customers.CustomerCreateParams
import com.dodopayments.api.models.blocklist.customers.CustomerDeleteParams
import com.dodopayments.api.models.blocklist.customers.CustomerListPageAsync
import com.dodopayments.api.models.blocklist.customers.CustomerListParams
import com.dodopayments.api.models.blocklist.customers.CustomerRetrieveParams
import com.dodopayments.api.services.async.blocklist.customers.NoteServiceAsync
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

    fun notes(): NoteServiceAsync

    suspend fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer

    /** @see create */
    suspend fun create(
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
    suspend fun create(
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
    suspend fun create(
        blocklistCustomersBlockByEmail: CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer =
        create(
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                blocklistCustomersBlockByEmail
            ),
            requestOptions,
        )

    suspend fun retrieve(
        entryId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer = retrieve(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer

    /** @see retrieve */
    suspend fun retrieve(entryId: String, requestOptions: RequestOptions): BlockedCustomer =
        retrieve(entryId, CustomerRetrieveParams.none(), requestOptions)

    suspend fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CustomerListPageAsync =
        list(CustomerListParams.none(), requestOptions)

    suspend fun delete(
        entryId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(entryId: String, requestOptions: RequestOptions) =
        delete(entryId, CustomerDeleteParams.none(), requestOptions)

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

        fun notes(): NoteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /blocklist/customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer>

        /** @see create */
        @MustBeClosed
        suspend fun create(
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
        suspend fun create(
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
        suspend fun create(
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
         * the same as [CustomerServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            entryId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            retrieve(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            entryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockedCustomer> =
            retrieve(entryId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /blocklist/customers`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /blocklist/customers/{entry_id}`, but is
         * otherwise the same as [CustomerServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            entryId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(entryId: String, requestOptions: RequestOptions): HttpResponse =
            delete(entryId, CustomerDeleteParams.none(), requestOptions)
    }
}
