// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.disputes

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.Params
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.http.QueryParams
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
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

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.createdAtGte?.let {
            queryParams.put(
                "created_at_gte",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.createdAtLte?.let {
            queryParams.put(
                "created_at_lte",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.customerId?.let { queryParams.put("customer_id", listOf(it.toString())) }
        this.disputeStage?.let { queryParams.put("dispute_stage", listOf(it.toString())) }
        this.disputeStatus?.let { queryParams.put("dispute_status", listOf(it.toString())) }
        this.pageNumber?.let { queryParams.put("page_number", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): DisputeListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DisputeListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [DisputeListParams]. */
    @NoAutoDetect
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

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Page size default is 10 max is 100 */
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

    /** Filter by dispute stage */
    class DisputeStage @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PRE_DISPUTE = of("pre_dispute")

            val DISPUTE = of("dispute")

            val PRE_ARBITRATION = of("pre_arbitration")

            fun of(value: String) = DisputeStage(JsonField.of(value))
        }

        /** An enum containing [DisputeStage]'s known values. */
        enum class Known {
            PRE_DISPUTE,
            DISPUTE,
            PRE_ARBITRATION,
        }

        /**
         * An enum containing [DisputeStage]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DisputeStage] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRE_DISPUTE,
            DISPUTE,
            PRE_ARBITRATION,
            /**
             * An enum member indicating that [DisputeStage] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PRE_DISPUTE -> Value.PRE_DISPUTE
                DISPUTE -> Value.DISPUTE
                PRE_ARBITRATION -> Value.PRE_ARBITRATION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PRE_DISPUTE -> Known.PRE_DISPUTE
                DISPUTE -> Known.DISPUTE
                PRE_ARBITRATION -> Known.PRE_ARBITRATION
                else -> throw DodoPaymentsInvalidDataException("Unknown DisputeStage: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DisputeStage && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by dispute status */
    class DisputeStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DISPUTE_OPENED = of("dispute_opened")

            val DISPUTE_EXPIRED = of("dispute_expired")

            val DISPUTE_ACCEPTED = of("dispute_accepted")

            val DISPUTE_CANCELLED = of("dispute_cancelled")

            val DISPUTE_CHALLENGED = of("dispute_challenged")

            val DISPUTE_WON = of("dispute_won")

            val DISPUTE_LOST = of("dispute_lost")

            fun of(value: String) = DisputeStatus(JsonField.of(value))
        }

        /** An enum containing [DisputeStatus]'s known values. */
        enum class Known {
            DISPUTE_OPENED,
            DISPUTE_EXPIRED,
            DISPUTE_ACCEPTED,
            DISPUTE_CANCELLED,
            DISPUTE_CHALLENGED,
            DISPUTE_WON,
            DISPUTE_LOST,
        }

        /**
         * An enum containing [DisputeStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DisputeStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISPUTE_OPENED,
            DISPUTE_EXPIRED,
            DISPUTE_ACCEPTED,
            DISPUTE_CANCELLED,
            DISPUTE_CHALLENGED,
            DISPUTE_WON,
            DISPUTE_LOST,
            /**
             * An enum member indicating that [DisputeStatus] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DISPUTE_OPENED -> Value.DISPUTE_OPENED
                DISPUTE_EXPIRED -> Value.DISPUTE_EXPIRED
                DISPUTE_ACCEPTED -> Value.DISPUTE_ACCEPTED
                DISPUTE_CANCELLED -> Value.DISPUTE_CANCELLED
                DISPUTE_CHALLENGED -> Value.DISPUTE_CHALLENGED
                DISPUTE_WON -> Value.DISPUTE_WON
                DISPUTE_LOST -> Value.DISPUTE_LOST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DISPUTE_OPENED -> Known.DISPUTE_OPENED
                DISPUTE_EXPIRED -> Known.DISPUTE_EXPIRED
                DISPUTE_ACCEPTED -> Known.DISPUTE_ACCEPTED
                DISPUTE_CANCELLED -> Known.DISPUTE_CANCELLED
                DISPUTE_CHALLENGED -> Known.DISPUTE_CHALLENGED
                DISPUTE_WON -> Known.DISPUTE_WON
                DISPUTE_LOST -> Known.DISPUTE_LOST
                else -> throw DodoPaymentsInvalidDataException("Unknown DisputeStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DisputeStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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
