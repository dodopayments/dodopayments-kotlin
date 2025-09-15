// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * Get detailed usage history for a subscription that includes usage-based billing (metered
 * components). This endpoint provides insights into customer usage patterns and billing
 * calculations over time.
 *
 * ## What You'll Get:
 * - **Billing periods**: Each item represents a billing cycle with start and end dates
 * - **Meter usage**: Detailed breakdown of usage for each meter configured on the subscription
 * - **Usage calculations**: Total units consumed, free threshold units, and chargeable units
 * - **Historical tracking**: Complete audit trail of usage-based charges
 *
 * ## Use Cases:
 * - **Customer support**: Investigate billing questions and usage discrepancies
 * - **Usage analytics**: Analyze customer consumption patterns over time
 * - **Billing transparency**: Provide customers with detailed usage breakdowns
 * - **Revenue optimization**: Identify usage trends to optimize pricing strategies
 *
 * ## Filtering Options:
 * - **Date range filtering**: Get usage history for specific time periods
 * - **Meter-specific filtering**: Focus on usage for a particular meter
 * - **Pagination**: Navigate through large usage histories efficiently
 *
 * ## Important Notes:
 * - Only returns data for subscriptions with usage-based (metered) components
 * - Usage history is organized by billing periods (subscription cycles)
 * - Free threshold units are calculated and displayed separately from chargeable units
 * - Historical data is preserved even if meter configurations change
 *
 * ## Example Query Patterns:
 * - Get last 3 months: `?start_date=2024-01-01T00:00:00Z&end_date=2024-03-31T23:59:59Z`
 * - Filter by meter: `?meter_id=mtr_api_requests`
 * - Paginate results: `?page_size=20&page_number=1`
 * - Recent usage: `?start_date=2024-03-01T00:00:00Z` (from March 1st to now)
 */
class SubscriptionRetrieveUsageHistoryParams
private constructor(
    private val subscriptionId: String?,
    private val endDate: OffsetDateTime?,
    private val meterId: String?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val startDate: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String? = subscriptionId

    /** Filter by end date (inclusive) */
    fun endDate(): OffsetDateTime? = endDate

    /** Filter by specific meter ID */
    fun meterId(): String? = meterId

    /** Page number (default: 0) */
    fun pageNumber(): Int? = pageNumber

    /** Page size (default: 10, max: 100) */
    fun pageSize(): Int? = pageSize

    /** Filter by start date (inclusive) */
    fun startDate(): OffsetDateTime? = startDate

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SubscriptionRetrieveUsageHistoryParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionRetrieveUsageHistoryParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionRetrieveUsageHistoryParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var endDate: OffsetDateTime? = null
        private var meterId: String? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var startDate: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            subscriptionRetrieveUsageHistoryParams: SubscriptionRetrieveUsageHistoryParams
        ) = apply {
            subscriptionId = subscriptionRetrieveUsageHistoryParams.subscriptionId
            endDate = subscriptionRetrieveUsageHistoryParams.endDate
            meterId = subscriptionRetrieveUsageHistoryParams.meterId
            pageNumber = subscriptionRetrieveUsageHistoryParams.pageNumber
            pageSize = subscriptionRetrieveUsageHistoryParams.pageSize
            startDate = subscriptionRetrieveUsageHistoryParams.startDate
            additionalHeaders = subscriptionRetrieveUsageHistoryParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                subscriptionRetrieveUsageHistoryParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /** Filter by end date (inclusive) */
        fun endDate(endDate: OffsetDateTime?) = apply { this.endDate = endDate }

        /** Filter by specific meter ID */
        fun meterId(meterId: String?) = apply { this.meterId = meterId }

        /** Page number (default: 0) */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Page size (default: 10, max: 100) */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Filter by start date (inclusive) */
        fun startDate(startDate: OffsetDateTime?) = apply { this.startDate = startDate }

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
         * Returns an immutable instance of [SubscriptionRetrieveUsageHistoryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionRetrieveUsageHistoryParams =
            SubscriptionRetrieveUsageHistoryParams(
                subscriptionId,
                endDate,
                meterId,
                pageNumber,
                pageSize,
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endDate?.let { put("end_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                meterId?.let { put("meter_id", it) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                startDate?.let {
                    put("start_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionRetrieveUsageHistoryParams &&
            subscriptionId == other.subscriptionId &&
            endDate == other.endDate &&
            meterId == other.meterId &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            subscriptionId,
            endDate,
            meterId,
            pageNumber,
            pageSize,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SubscriptionRetrieveUsageHistoryParams{subscriptionId=$subscriptionId, endDate=$endDate, meterId=$meterId, pageNumber=$pageNumber, pageSize=$pageSize, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
