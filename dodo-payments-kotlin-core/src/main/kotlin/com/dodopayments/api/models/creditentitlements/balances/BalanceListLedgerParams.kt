// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

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
class BalanceListLedgerParams
private constructor(
    private val creditEntitlementId: String,
    private val customerId: String?,
    private val endDate: OffsetDateTime?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val startDate: OffsetDateTime?,
    private val transactionType: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun creditEntitlementId(): String = creditEntitlementId

    fun customerId(): String? = customerId

    /** Filter by end date */
    fun endDate(): OffsetDateTime? = endDate

    /** Page number default is 0 */
    fun pageNumber(): Int? = pageNumber

    /** Page size default is 10 max is 100 */
    fun pageSize(): Int? = pageSize

    /** Filter by start date */
    fun startDate(): OffsetDateTime? = startDate

    /**
     * Filter by transaction type (snake_case: credit_added, credit_deducted, credit_expired, etc.)
     */
    fun transactionType(): String? = transactionType

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListLedgerParams].
         *
         * The following fields are required:
         * ```kotlin
         * .creditEntitlementId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceListLedgerParams]. */
    class Builder internal constructor() {

        private var creditEntitlementId: String? = null
        private var customerId: String? = null
        private var endDate: OffsetDateTime? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var startDate: OffsetDateTime? = null
        private var transactionType: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(balanceListLedgerParams: BalanceListLedgerParams) = apply {
            creditEntitlementId = balanceListLedgerParams.creditEntitlementId
            customerId = balanceListLedgerParams.customerId
            endDate = balanceListLedgerParams.endDate
            pageNumber = balanceListLedgerParams.pageNumber
            pageSize = balanceListLedgerParams.pageSize
            startDate = balanceListLedgerParams.startDate
            transactionType = balanceListLedgerParams.transactionType
            additionalHeaders = balanceListLedgerParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceListLedgerParams.additionalQueryParams.toBuilder()
        }

        fun creditEntitlementId(creditEntitlementId: String) = apply {
            this.creditEntitlementId = creditEntitlementId
        }

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Filter by end date */
        fun endDate(endDate: OffsetDateTime?) = apply { this.endDate = endDate }

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Filter by start date */
        fun startDate(startDate: OffsetDateTime?) = apply { this.startDate = startDate }

        /**
         * Filter by transaction type (snake_case: credit_added, credit_deducted, credit_expired,
         * etc.)
         */
        fun transactionType(transactionType: String?) = apply {
            this.transactionType = transactionType
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BalanceListLedgerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .creditEntitlementId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceListLedgerParams =
            BalanceListLedgerParams(
                checkRequired("creditEntitlementId", creditEntitlementId),
                customerId,
                endDate,
                pageNumber,
                pageSize,
                startDate,
                transactionType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> creditEntitlementId
            1 -> customerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endDate?.let { put("end_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                startDate?.let {
                    put("start_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                transactionType?.let { put("transaction_type", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceListLedgerParams &&
            creditEntitlementId == other.creditEntitlementId &&
            customerId == other.customerId &&
            endDate == other.endDate &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            startDate == other.startDate &&
            transactionType == other.transactionType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            creditEntitlementId,
            customerId,
            endDate,
            pageNumber,
            pageSize,
            startDate,
            transactionType,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BalanceListLedgerParams{creditEntitlementId=$creditEntitlementId, customerId=$customerId, endDate=$endDate, pageNumber=$pageNumber, pageSize=$pageSize, startDate=$startDate, transactionType=$transactionType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
