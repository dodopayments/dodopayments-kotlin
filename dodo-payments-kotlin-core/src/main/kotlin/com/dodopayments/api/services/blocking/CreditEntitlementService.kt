// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.creditentitlements.CreditEntitlement
import com.dodopayments.api.models.creditentitlements.CreditEntitlementCreateParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementDeleteParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementListPage
import com.dodopayments.api.models.creditentitlements.CreditEntitlementListParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementRetrieveParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUndeleteParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUpdateParams
import com.dodopayments.api.services.blocking.creditentitlements.BalanceService
import com.google.errorprone.annotations.MustBeClosed

interface CreditEntitlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CreditEntitlementService

    fun balances(): BalanceService

    /**
     * Credit entitlements define reusable credit templates that can be attached to products. Each
     * entitlement defines how credits behave in terms of expiration, rollover, and overage.
     *
     * # Authentication
     * Requires an API key with `Editor` role.
     *
     * # Request Body
     * - `name` - Human-readable name of the credit entitlement (1-255 characters, required)
     * - `description` - Optional description (max 1000 characters)
     * - `precision` - Decimal precision for credit amounts (0-10 decimal places)
     * - `unit` - Unit of measurement for the credit (e.g., "API Calls", "Tokens", "Credits")
     * - `expires_after_days` - Number of days after which credits expire (optional)
     * - `rollover_enabled` - Whether unused credits can rollover to the next period
     * - `rollover_percentage` - Percentage of unused credits that rollover (0-100)
     * - `rollover_timeframe_count` - Count of timeframe periods for rollover limit
     * - `rollover_timeframe_interval` - Interval type (day, week, month, year)
     * - `max_rollover_count` - Maximum number of times credits can be rolled over
     * - `overage_enabled` - Whether overage charges apply when credits run out (requires
     *   price_per_unit)
     * - `overage_limit` - Maximum overage units allowed (optional)
     * - `currency` - Currency for pricing (required if price_per_unit is set)
     * - `price_per_unit` - Price per credit unit (decimal)
     *
     * # Responses
     * - `201 Created` - Credit entitlement created successfully, returns the full entitlement
     *   object
     * - `422 Unprocessable Entity` - Invalid request parameters or validation failure
     * - `500 Internal Server Error` - Database or server error
     *
     * # Business Logic
     * - A unique ID with prefix `cde_` is automatically generated for the entitlement
     * - Created and updated timestamps are automatically set
     * - Currency is required when price_per_unit is set
     * - price_per_unit is required when overage_enabled is true
     * - rollover_timeframe_count and rollover_timeframe_interval must both be set or both be null
     */
    fun create(
        params: CreditEntitlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlement

    /**
     * Returns the full details of a single credit entitlement including all configuration settings
     * for expiration, rollover, and overage policies.
     *
     * # Authentication
     * Requires an API key with `Viewer` role or higher.
     *
     * # Path Parameters
     * - `id` - The unique identifier of the credit entitlement (format: `cde_...`)
     *
     * # Responses
     * - `200 OK` - Returns the full credit entitlement object
     * - `404 Not Found` - Credit entitlement does not exist or does not belong to the authenticated
     *   business
     * - `500 Internal Server Error` - Database or server error
     *
     * # Business Logic
     * - Only non-deleted credit entitlements can be retrieved through this endpoint
     * - The entitlement must belong to the authenticated business (business_id check)
     * - Deleted entitlements return a 404 error and must be retrieved via the list endpoint with
     *   `deleted=true`
     */
    fun retrieve(
        id: String,
        params: CreditEntitlementRetrieveParams = CreditEntitlementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlement = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CreditEntitlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlement

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CreditEntitlement =
        retrieve(id, CreditEntitlementRetrieveParams.none(), requestOptions)

    /**
     * Allows partial updates to a credit entitlement's configuration. Only the fields provided in
     * the request body will be updated; all other fields remain unchanged. This endpoint supports
     * nullable fields using the double option pattern.
     *
     * # Authentication
     * Requires an API key with `Editor` role.
     *
     * # Path Parameters
     * - `id` - The unique identifier of the credit entitlement to update (format: `cde_...`)
     *
     * # Request Body (all fields optional)
     * - `name` - Human-readable name of the credit entitlement (1-255 characters)
     * - `description` - Optional description (max 1000 characters)
     * - `unit` - Unit of measurement for the credit (1-50 characters)
     *
     * Note: `precision` cannot be modified after creation as it would invalidate existing grants.
     * - `expires_after_days` - Number of days after which credits expire (use `null` to remove
     *   expiration)
     * - `rollover_enabled` - Whether unused credits can rollover to the next period
     * - `rollover_percentage` - Percentage of unused credits that rollover (0-100, nullable)
     * - `rollover_timeframe_count` - Count of timeframe periods for rollover limit (nullable)
     * - `rollover_timeframe_interval` - Interval type (day, week, month, year, nullable)
     * - `max_rollover_count` - Maximum number of times credits can be rolled over (nullable)
     * - `overage_enabled` - Whether overage charges apply when credits run out
     * - `overage_limit` - Maximum overage units allowed (nullable)
     * - `currency` - Currency for pricing (nullable)
     * - `price_per_unit` - Price per credit unit (decimal, nullable)
     *
     * # Responses
     * - `200 OK` - Credit entitlement updated successfully
     * - `404 Not Found` - Credit entitlement does not exist or does not belong to the authenticated
     *   business
     * - `422 Unprocessable Entity` - Invalid request parameters or validation failure
     * - `500 Internal Server Error` - Database or server error
     *
     * # Business Logic
     * - Only non-deleted credit entitlements can be updated
     * - Fields set to `null` explicitly will clear the database value (using double option pattern)
     * - The `updated_at` timestamp is automatically updated on successful modification
     * - Changes take effect immediately but do not retroactively affect existing credit grants
     * - The merged state is validated: currency required with price, rollover timeframe fields
     *   together, price required for overage
     */
    fun update(
        id: String,
        params: CreditEntitlementUpdateParams = CreditEntitlementUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: CreditEntitlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, CreditEntitlementUpdateParams.none(), requestOptions)

    /**
     * Returns a paginated list of credit entitlements, allowing filtering of deleted entitlements.
     * By default, only non-deleted entitlements are returned.
     *
     * # Authentication
     * Requires an API key with `Viewer` role or higher.
     *
     * # Query Parameters
     * - `page_size` - Number of items per page (default: 10, max: 100)
     * - `page_number` - Zero-based page number (default: 0)
     * - `deleted` - Boolean flag to list deleted entitlements instead of active ones (default:
     *   false)
     *
     * # Responses
     * - `200 OK` - Returns a list of credit entitlements wrapped in a response object
     * - `422 Unprocessable Entity` - Invalid query parameters (e.g., page_size > 100)
     * - `500 Internal Server Error` - Database or server error
     *
     * # Business Logic
     * - Results are ordered by creation date in descending order (newest first)
     * - Only entitlements belonging to the authenticated business are returned
     * - The `deleted` parameter controls visibility of soft-deleted entitlements
     * - Pagination uses offset-based pagination (offset = page_number * page_size)
     */
    fun list(
        params: CreditEntitlementListParams = CreditEntitlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditEntitlementListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CreditEntitlementListPage =
        list(CreditEntitlementListParams.none(), requestOptions)

    fun delete(
        id: String,
        params: CreditEntitlementDeleteParams = CreditEntitlementDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: CreditEntitlementDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, CreditEntitlementDeleteParams.none(), requestOptions)

    /**
     * Undeletes a soft-deleted credit entitlement by clearing `deleted_at`, making it available
     * again through standard list and get endpoints.
     *
     * # Authentication
     * Requires an API key with `Editor` role.
     *
     * # Path Parameters
     * - `id` - The unique identifier of the credit entitlement to restore (format: `cde_...`)
     *
     * # Responses
     * - `200 OK` - Credit entitlement restored successfully
     * - `500 Internal Server Error` - Database error, entitlement not found, or entitlement is not
     *   deleted
     *
     * # Business Logic
     * - Only deleted credit entitlements can be restored
     * - The query filters for `deleted_at IS NOT NULL`, so non-deleted entitlements will result in
     *   0 rows affected
     * - If no rows are affected (entitlement doesn't exist, doesn't belong to business, or is not
     *   deleted), returns 500
     * - The `updated_at` timestamp is automatically updated on successful restoration
     * - Once restored, the entitlement becomes immediately available in the standard list and get
     *   endpoints
     * - All configuration settings are preserved during delete/restore operations
     *
     * # Error Handling
     * This endpoint returns 500 Internal Server Error in several cases:
     * - The credit entitlement does not exist
     * - The credit entitlement belongs to a different business
     * - The credit entitlement is not currently deleted (already active)
     *
     * Callers should verify the entitlement exists and is deleted before calling this endpoint.
     */
    fun undelete(
        id: String,
        params: CreditEntitlementUndeleteParams = CreditEntitlementUndeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = undelete(params.toBuilder().id(id).build(), requestOptions)

    /** @see undelete */
    fun undelete(
        params: CreditEntitlementUndeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see undelete */
    fun undelete(id: String, requestOptions: RequestOptions) =
        undelete(id, CreditEntitlementUndeleteParams.none(), requestOptions)

    /**
     * A view of [CreditEntitlementService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CreditEntitlementService.WithRawResponse

        fun balances(): BalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /credit-entitlements`, but is otherwise the same as
         * [CreditEntitlementService.create].
         */
        @MustBeClosed
        fun create(
            params: CreditEntitlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlement>

        /**
         * Returns a raw HTTP response for `get /credit-entitlements/{id}`, but is otherwise the
         * same as [CreditEntitlementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CreditEntitlementRetrieveParams = CreditEntitlementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlement> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CreditEntitlementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlement>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditEntitlement> =
            retrieve(id, CreditEntitlementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /credit-entitlements/{id}`, but is otherwise the
         * same as [CreditEntitlementService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: CreditEntitlementUpdateParams = CreditEntitlementUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CreditEntitlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, CreditEntitlementUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /credit-entitlements`, but is otherwise the same as
         * [CreditEntitlementService.list].
         */
        @MustBeClosed
        fun list(
            params: CreditEntitlementListParams = CreditEntitlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditEntitlementListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CreditEntitlementListPage> =
            list(CreditEntitlementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credit-entitlements/{id}`, but is otherwise the
         * same as [CreditEntitlementService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: CreditEntitlementDeleteParams = CreditEntitlementDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CreditEntitlementDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, CreditEntitlementDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /credit-entitlements/{id}/undelete`, but is
         * otherwise the same as [CreditEntitlementService.undelete].
         */
        @MustBeClosed
        fun undelete(
            id: String,
            params: CreditEntitlementUndeleteParams = CreditEntitlementUndeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = undelete(params.toBuilder().id(id).build(), requestOptions)

        /** @see undelete */
        @MustBeClosed
        fun undelete(
            params: CreditEntitlementUndeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see undelete */
        @MustBeClosed
        fun undelete(id: String, requestOptions: RequestOptions): HttpResponse =
            undelete(id, CreditEntitlementUndeleteParams.none(), requestOptions)
    }
}
