// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

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

class PaymentListParams
private constructor(
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val customerId: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val status: Status?,
    private val subscriptionId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Get events after this created time */
    fun createdAtGte(): OffsetDateTime? = createdAtGte

    /** Get events created before this time */
    fun createdAtLte(): OffsetDateTime? = createdAtLte

    /** Filter by customer id */
    fun customerId(): String? = customerId

    /** Page number default is 0 */
    fun pageNumber(): Long? = pageNumber

    /** Page size default is 10 max is 100 */
    fun pageSize(): Long? = pageSize

    /** Filter by status */
    fun status(): Status? = status

    /** Filter by subscription id */
    fun subscriptionId(): String? = subscriptionId

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
        this.pageNumber?.let { queryParams.put("page_number", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.subscriptionId?.let { queryParams.put("subscription_id", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PaymentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PaymentListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PaymentListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var customerId: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var status: Status? = null
        private var subscriptionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentListParams: PaymentListParams) = apply {
            createdAtGte = paymentListParams.createdAtGte
            createdAtLte = paymentListParams.createdAtLte
            customerId = paymentListParams.customerId
            pageNumber = paymentListParams.pageNumber
            pageSize = paymentListParams.pageSize
            status = paymentListParams.status
            subscriptionId = paymentListParams.subscriptionId
            additionalHeaders = paymentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentListParams.additionalQueryParams.toBuilder()
        }

        /** Get events after this created time */
        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Get events created before this time */
        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Filter by customer id */
        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Filter by status */
        fun status(status: Status?) = apply { this.status = status }

        /** Filter by subscription id */
        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

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

        fun build(): PaymentListParams =
            PaymentListParams(
                createdAtGte,
                createdAtLte,
                customerId,
                pageNumber,
                pageSize,
                status,
                subscriptionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Filter by status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val SUCCEEDED = of("succeeded")

            val FAILED = of("failed")

            val CANCELLED = of("cancelled")

            val PROCESSING = of("processing")

            val REQUIRES_CUSTOMER_ACTION = of("requires_customer_action")

            val REQUIRES_MERCHANT_ACTION = of("requires_merchant_action")

            val REQUIRES_PAYMENT_METHOD = of("requires_payment_method")

            val REQUIRES_CONFIRMATION = of("requires_confirmation")

            val REQUIRES_CAPTURE = of("requires_capture")

            val PARTIALLY_CAPTURED = of("partially_captured")

            val PARTIALLY_CAPTURED_AND_CAPTURABLE = of("partially_captured_and_capturable")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SUCCEEDED,
            FAILED,
            CANCELLED,
            PROCESSING,
            REQUIRES_CUSTOMER_ACTION,
            REQUIRES_MERCHANT_ACTION,
            REQUIRES_PAYMENT_METHOD,
            REQUIRES_CONFIRMATION,
            REQUIRES_CAPTURE,
            PARTIALLY_CAPTURED,
            PARTIALLY_CAPTURED_AND_CAPTURABLE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUCCEEDED,
            FAILED,
            CANCELLED,
            PROCESSING,
            REQUIRES_CUSTOMER_ACTION,
            REQUIRES_MERCHANT_ACTION,
            REQUIRES_PAYMENT_METHOD,
            REQUIRES_CONFIRMATION,
            REQUIRES_CAPTURE,
            PARTIALLY_CAPTURED,
            PARTIALLY_CAPTURED_AND_CAPTURABLE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                SUCCEEDED -> Value.SUCCEEDED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
                PROCESSING -> Value.PROCESSING
                REQUIRES_CUSTOMER_ACTION -> Value.REQUIRES_CUSTOMER_ACTION
                REQUIRES_MERCHANT_ACTION -> Value.REQUIRES_MERCHANT_ACTION
                REQUIRES_PAYMENT_METHOD -> Value.REQUIRES_PAYMENT_METHOD
                REQUIRES_CONFIRMATION -> Value.REQUIRES_CONFIRMATION
                REQUIRES_CAPTURE -> Value.REQUIRES_CAPTURE
                PARTIALLY_CAPTURED -> Value.PARTIALLY_CAPTURED
                PARTIALLY_CAPTURED_AND_CAPTURABLE -> Value.PARTIALLY_CAPTURED_AND_CAPTURABLE
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
                SUCCEEDED -> Known.SUCCEEDED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
                PROCESSING -> Known.PROCESSING
                REQUIRES_CUSTOMER_ACTION -> Known.REQUIRES_CUSTOMER_ACTION
                REQUIRES_MERCHANT_ACTION -> Known.REQUIRES_MERCHANT_ACTION
                REQUIRES_PAYMENT_METHOD -> Known.REQUIRES_PAYMENT_METHOD
                REQUIRES_CONFIRMATION -> Known.REQUIRES_CONFIRMATION
                REQUIRES_CAPTURE -> Known.REQUIRES_CAPTURE
                PARTIALLY_CAPTURED -> Known.PARTIALLY_CAPTURED
                PARTIALLY_CAPTURED_AND_CAPTURABLE -> Known.PARTIALLY_CAPTURED_AND_CAPTURABLE
                else -> throw DodoPaymentsInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentListParams && createdAtGte == other.createdAtGte && createdAtLte == other.createdAtLte && customerId == other.customerId && pageNumber == other.pageNumber && pageSize == other.pageSize && status == other.status && subscriptionId == other.subscriptionId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(createdAtGte, createdAtLte, customerId, pageNumber, pageSize, status, subscriptionId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentListParams{createdAtGte=$createdAtGte, createdAtLte=$createdAtLte, customerId=$customerId, pageNumber=$pageNumber, pageSize=$pageSize, status=$status, subscriptionId=$subscriptionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
