// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class DisputeListParams
private constructor(
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val customerId: String?,
    private val disputeStage: DisputeStage?,
    private val disputeStatus: DisputeStatus?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Get events after this created time */
    fun createdAtGte(): OffsetDateTime? = createdAtGte

    /** Get events created before this time */
    fun createdAtLte(): OffsetDateTime? = createdAtLte

    /** Filter by customer_id */
    fun customerId(): String? = customerId

    /** Filter by dispute stage */
    fun disputeStage(): DisputeStage? = disputeStage

    /** Filter by dispute status */
    fun disputeStatus(): DisputeStatus? = disputeStatus

    /** Page number default is 0 */
    fun pageNumber(): Long? = pageNumber

    /** Page size default is 10 max is 100 */
    fun pageSize(): Long? = pageSize

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): DisputeListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DisputeListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [DisputeListParams]. */
    class Builder internal constructor() {

        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var customerId: String? = null
        private var disputeStage: DisputeStage? = null
        private var disputeStatus: DisputeStatus? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(disputeListParams: DisputeListParams) = apply {
            createdAtGte = disputeListParams.createdAtGte
            createdAtLte = disputeListParams.createdAtLte
            customerId = disputeListParams.customerId
            disputeStage = disputeListParams.disputeStage
            disputeStatus = disputeListParams.disputeStatus
            pageNumber = disputeListParams.pageNumber
            pageSize = disputeListParams.pageSize
            additionalHeaders = disputeListParams.additionalHeaders.toBuilder()
            additionalQueryParams = disputeListParams.additionalQueryParams.toBuilder()
        }

        /** Get events after this created time */
        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Get events created before this time */
        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Filter by customer_id */
        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Filter by dispute stage */
        fun disputeStage(disputeStage: DisputeStage?) = apply { this.disputeStage = disputeStage }

        /** Filter by dispute status */
        fun disputeStatus(disputeStatus: DisputeStatus?) = apply {
            this.disputeStatus = disputeStatus
        }

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

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
         * Returns an immutable instance of [DisputeListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DisputeListParams =
            DisputeListParams(
                createdAtGte,
                createdAtLte,
                customerId,
                disputeStage,
                disputeStatus,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAtGte?.let {
                    put("created_at_gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("created_at_lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                customerId?.let { put("customer_id", it) }
                disputeStage?.let { put("dispute_stage", it.toString()) }
                disputeStatus?.let { put("dispute_status", it.toString()) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListParams && createdAtGte == other.createdAtGte && createdAtLte == other.createdAtLte && customerId == other.customerId && disputeStage == other.disputeStage && disputeStatus == other.disputeStatus && pageNumber == other.pageNumber && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(createdAtGte, createdAtLte, customerId, disputeStage, disputeStatus, pageNumber, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DisputeListParams{createdAtGte=$createdAtGte, createdAtLte=$createdAtLte, customerId=$customerId, disputeStage=$disputeStage, disputeStatus=$disputeStatus, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
