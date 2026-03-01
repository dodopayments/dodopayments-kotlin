// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.creditentitlements

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsPage
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerPage
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListPage
import com.dodopayments.api.models.creditentitlements.balances.BalanceListParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceRetrieveParams
import com.dodopayments.api.models.creditentitlements.balances.CustomerCreditBalance
import com.google.errorprone.annotations.MustBeClosed

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceService

    /**
     * Returns the credit balance details for a specific customer and credit entitlement.
     *
     * # Authentication
     * Requires an API key with `Viewer` role or higher.
     *
     * # Path Parameters
     * - `credit_entitlement_id` - The unique identifier of the credit entitlement
     * - `customer_id` - The unique identifier of the customer
     *
     * # Responses
     * - `200 OK` - Returns the customer's balance
     * - `404 Not Found` - Credit entitlement or customer balance not found
     * - `500 Internal Server Error` - Database or server error
     */
    fun retrieve(
        customerId: String,
        params: BalanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditBalance =
        retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BalanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreditBalance

    /**
     * Returns a paginated list of customer credit balances for the given credit entitlement.
     *
     * # Authentication
     * Requires an API key with `Viewer` role or higher.
     *
     * # Path Parameters
     * - `credit_entitlement_id` - The unique identifier of the credit entitlement
     *
     * # Query Parameters
     * - `page_size` - Number of items per page (default: 10, max: 100)
     * - `page_number` - Zero-based page number (default: 0)
     * - `customer_id` - Optional filter by specific customer
     *
     * # Responses
     * - `200 OK` - Returns list of customer balances
     * - `404 Not Found` - Credit entitlement not found
     * - `500 Internal Server Error` - Database or server error
     */
    fun list(
        creditEntitlementId: String,
        params: BalanceListParams = BalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListPage =
        list(params.toBuilder().creditEntitlementId(creditEntitlementId).build(), requestOptions)

    /** @see list */
    fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListPage

    /** @see list */
    fun list(creditEntitlementId: String, requestOptions: RequestOptions): BalanceListPage =
        list(creditEntitlementId, BalanceListParams.none(), requestOptions)

    /**
     * For credit entries, a new grant is created. For debit entries, credits are deducted from
     * existing grants using FIFO (oldest first).
     *
     * # Authentication
     * Requires an API key with `Editor` role.
     *
     * # Path Parameters
     * - `credit_entitlement_id` - The unique identifier of the credit entitlement
     * - `customer_id` - The unique identifier of the customer
     *
     * # Request Body
     * - `entry_type` - "credit" or "debit"
     * - `amount` - Amount to credit or debit
     * - `reason` - Optional human-readable reason
     * - `expires_at` - Optional expiration for credited amount (only for credit type)
     * - `idempotency_key` - Optional key to prevent duplicate entries
     *
     * # Responses
     * - `201 Created` - Ledger entry created successfully
     * - `400 Bad Request` - Invalid request (e.g., debit with insufficient balance)
     * - `404 Not Found` - Credit entitlement or customer not found
     * - `409 Conflict` - Idempotency key already exists
     * - `500 Internal Server Error` - Database or server error
     */
    fun createLedgerEntry(
        customerId: String,
        params: BalanceCreateLedgerEntryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceCreateLedgerEntryResponse =
        createLedgerEntry(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see createLedgerEntry */
    fun createLedgerEntry(
        params: BalanceCreateLedgerEntryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceCreateLedgerEntryResponse

    /**
     * Returns a paginated list of credit grants with optional filtering by status.
     *
     * # Authentication
     * Requires an API key with `Viewer` role or higher.
     *
     * # Path Parameters
     * - `credit_entitlement_id` - The unique identifier of the credit entitlement
     * - `customer_id` - The unique identifier of the customer
     *
     * # Query Parameters
     * - `page_size` - Number of items per page (default: 10, max: 100)
     * - `page_number` - Zero-based page number (default: 0)
     * - `status` - Filter by status: active, expired, depleted
     *
     * # Responses
     * - `200 OK` - Returns list of grants
     * - `404 Not Found` - Credit entitlement not found
     * - `500 Internal Server Error` - Database or server error
     */
    fun listGrants(
        customerId: String,
        params: BalanceListGrantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListGrantsPage =
        listGrants(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see listGrants */
    fun listGrants(
        params: BalanceListGrantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListGrantsPage

    /**
     * Returns a paginated list of credit transaction history with optional filtering.
     *
     * # Authentication
     * Requires an API key with `Viewer` role or higher.
     *
     * # Path Parameters
     * - `credit_entitlement_id` - The unique identifier of the credit entitlement
     * - `customer_id` - The unique identifier of the customer
     *
     * # Query Parameters
     * - `page_size` - Number of items per page (default: 10, max: 100)
     * - `page_number` - Zero-based page number (default: 0)
     * - `transaction_type` - Filter by transaction type
     * - `start_date` - Filter entries from this date
     * - `end_date` - Filter entries until this date
     *
     * # Responses
     * - `200 OK` - Returns list of ledger entries
     * - `404 Not Found` - Credit entitlement not found
     * - `500 Internal Server Error` - Database or server error
     */
    fun listLedger(
        customerId: String,
        params: BalanceListLedgerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListLedgerPage =
        listLedger(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see listLedger */
    fun listLedger(
        params: BalanceListLedgerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListLedgerPage

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}`, but is otherwise
         * the same as [BalanceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            customerId: String,
            params: BalanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditBalance> =
            retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreditBalance>

        /**
         * Returns a raw HTTP response for `get
         * /credit-entitlements/{credit_entitlement_id}/balances`, but is otherwise the same as
         * [BalanceService.list].
         */
        @MustBeClosed
        fun list(
            creditEntitlementId: String,
            params: BalanceListParams = BalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListPage> =
            list(
                params.toBuilder().creditEntitlementId(creditEntitlementId).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            params: BalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            creditEntitlementId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceListPage> =
            list(creditEntitlementId, BalanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/ledger-entries`, but
         * is otherwise the same as [BalanceService.createLedgerEntry].
         */
        @MustBeClosed
        fun createLedgerEntry(
            customerId: String,
            params: BalanceCreateLedgerEntryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceCreateLedgerEntryResponse> =
            createLedgerEntry(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see createLedgerEntry */
        @MustBeClosed
        fun createLedgerEntry(
            params: BalanceCreateLedgerEntryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceCreateLedgerEntryResponse>

        /**
         * Returns a raw HTTP response for `get
         * /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/grants`, but is
         * otherwise the same as [BalanceService.listGrants].
         */
        @MustBeClosed
        fun listGrants(
            customerId: String,
            params: BalanceListGrantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListGrantsPage> =
            listGrants(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see listGrants */
        @MustBeClosed
        fun listGrants(
            params: BalanceListGrantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListGrantsPage>

        /**
         * Returns a raw HTTP response for `get
         * /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/ledger`, but is
         * otherwise the same as [BalanceService.listLedger].
         */
        @MustBeClosed
        fun listLedger(
            customerId: String,
            params: BalanceListLedgerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListLedgerPage> =
            listLedger(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see listLedger */
        @MustBeClosed
        fun listLedger(
            params: BalanceListLedgerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListLedgerPage>
    }
}
