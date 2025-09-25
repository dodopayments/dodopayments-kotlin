// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * Fetch events from your account with powerful filtering capabilities. This endpoint is ideal for:
 * - Debugging event ingestion issues
 * - Analyzing customer usage patterns
 * - Building custom analytics dashboards
 * - Auditing billing-related events
 *
 * ## Filtering Options:
 * - **Customer filtering**: Filter by specific customer ID
 * - **Event name filtering**: Filter by event type/name
 * - **Meter-based filtering**: Use a meter ID to apply the meter's event name and filter criteria
 *   automatically
 * - **Time range filtering**: Filter events within a specific date range
 * - **Pagination**: Navigate through large result sets
 *
 * ## Meter Integration:
 * When using `meter_id`, the endpoint automatically applies:
 * - The meter's configured `event_name` filter
 * - The meter's custom filter criteria (if any)
 * - If you also provide `event_name`, it must match the meter's event name
 *
 * ## Example Queries:
 * - Get all events for a customer: `?customer_id=cus_abc123`
 * - Get API request events: `?event_name=api_request`
 * - Get events from last 24 hours: `?start=2024-01-14T10:30:00Z&end=2024-01-15T10:30:00Z`
 * - Get events with meter filtering: `?meter_id=mtr_xyz789`
 * - Paginate results: `?page_size=50&page_number=2`
 */
class UsageEventListParams
private constructor(
    private val customerId: String?,
    private val end: OffsetDateTime?,
    private val eventName: String?,
    private val meterId: String?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val start: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter events by customer ID */
    fun customerId(): String? = customerId

    /** Filter events created before this timestamp */
    fun end(): OffsetDateTime? = end

    /**
     * Filter events by event name. If both event_name and meter_id are provided, they must match
     * the meter's configured event_name
     */
    fun eventName(): String? = eventName

    /**
     * Filter events by meter ID. When provided, only events that match the meter's event_name and
     * filter criteria will be returned
     */
    fun meterId(): String? = meterId

    /** Page number (0-based, default: 0) */
    fun pageNumber(): Int? = pageNumber

    /** Number of events to return per page (default: 10) */
    fun pageSize(): Int? = pageSize

    /** Filter events created after this timestamp */
    fun start(): OffsetDateTime? = start

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): UsageEventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [UsageEventListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [UsageEventListParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var end: OffsetDateTime? = null
        private var eventName: String? = null
        private var meterId: String? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var start: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(usageEventListParams: UsageEventListParams) = apply {
            customerId = usageEventListParams.customerId
            end = usageEventListParams.end
            eventName = usageEventListParams.eventName
            meterId = usageEventListParams.meterId
            pageNumber = usageEventListParams.pageNumber
            pageSize = usageEventListParams.pageSize
            start = usageEventListParams.start
            additionalHeaders = usageEventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageEventListParams.additionalQueryParams.toBuilder()
        }

        /** Filter events by customer ID */
        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Filter events created before this timestamp */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /**
         * Filter events by event name. If both event_name and meter_id are provided, they must
         * match the meter's configured event_name
         */
        fun eventName(eventName: String?) = apply { this.eventName = eventName }

        /**
         * Filter events by meter ID. When provided, only events that match the meter's event_name
         * and filter criteria will be returned
         */
        fun meterId(meterId: String?) = apply { this.meterId = meterId }

        /** Page number (0-based, default: 0) */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Number of events to return per page (default: 10) */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Filter events created after this timestamp */
        fun start(start: OffsetDateTime?) = apply { this.start = start }

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
         * Returns an immutable instance of [UsageEventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageEventListParams =
            UsageEventListParams(
                customerId,
                end,
                eventName,
                meterId,
                pageNumber,
                pageSize,
                start,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                customerId?.let { put("customer_id", it) }
                end?.let { put("end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                eventName?.let { put("event_name", it) }
                meterId?.let { put("meter_id", it) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                start?.let { put("start", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageEventListParams &&
            customerId == other.customerId &&
            end == other.end &&
            eventName == other.eventName &&
            meterId == other.meterId &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            start == other.start &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            end,
            eventName,
            meterId,
            pageNumber,
            pageSize,
            start,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "UsageEventListParams{customerId=$customerId, end=$end, eventName=$eventName, meterId=$meterId, pageNumber=$pageNumber, pageSize=$pageSize, start=$start, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
