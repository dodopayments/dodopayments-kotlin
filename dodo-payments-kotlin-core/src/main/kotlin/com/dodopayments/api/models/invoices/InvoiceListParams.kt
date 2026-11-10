// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** Lists invoice-led invoices, newest first. The items have no `lines` and no `payments`. */
class InvoiceListParams
private constructor(
    private val collectionMethod: CollectionMethod?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val customerId: String?,
    private val dueAtGte: OffsetDateTime?,
    private val dueAtLte: OffsetDateTime?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val status: List<Status>?,
    private val subscriptionId: String?,
    private val tags: List<Tag>?,
    private val totalAmountGte: Long?,
    private val totalAmountLte: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun collectionMethod(): CollectionMethod? = collectionMethod

    fun createdAtGte(): OffsetDateTime? = createdAtGte

    fun createdAtLte(): OffsetDateTime? = createdAtLte

    fun customerId(): String? = customerId

    fun dueAtGte(): OffsetDateTime? = dueAtGte

    fun dueAtLte(): OffsetDateTime? = dueAtLte

    /** Page number. The default is 0. */
    fun pageNumber(): Int? = pageNumber

    /** Page size. The default is 10 and the maximum is 100. */
    fun pageSize(): Int? = pageSize

    /** Repeat the key to match more than one status, for example `status=open&status=past_due`. */
    fun status(): List<Status>? = status

    fun subscriptionId(): String? = subscriptionId

    /** Repeat the key to match an invoice that has any one of the tags. */
    fun tags(): List<Tag>? = tags

    fun totalAmountGte(): Long? = totalAmountGte

    fun totalAmountLte(): Long? = totalAmountLte

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): InvoiceListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InvoiceListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceListParams]. */
    class Builder internal constructor() {

        private var collectionMethod: CollectionMethod? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var customerId: String? = null
        private var dueAtGte: OffsetDateTime? = null
        private var dueAtLte: OffsetDateTime? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var status: MutableList<Status>? = null
        private var subscriptionId: String? = null
        private var tags: MutableList<Tag>? = null
        private var totalAmountGte: Long? = null
        private var totalAmountLte: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceListParams: InvoiceListParams) = apply {
            collectionMethod = invoiceListParams.collectionMethod
            createdAtGte = invoiceListParams.createdAtGte
            createdAtLte = invoiceListParams.createdAtLte
            customerId = invoiceListParams.customerId
            dueAtGte = invoiceListParams.dueAtGte
            dueAtLte = invoiceListParams.dueAtLte
            pageNumber = invoiceListParams.pageNumber
            pageSize = invoiceListParams.pageSize
            status = invoiceListParams.status?.toMutableList()
            subscriptionId = invoiceListParams.subscriptionId
            tags = invoiceListParams.tags?.toMutableList()
            totalAmountGte = invoiceListParams.totalAmountGte
            totalAmountLte = invoiceListParams.totalAmountLte
            additionalHeaders = invoiceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceListParams.additionalQueryParams.toBuilder()
        }

        fun collectionMethod(collectionMethod: CollectionMethod?) = apply {
            this.collectionMethod = collectionMethod
        }

        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        fun dueAtGte(dueAtGte: OffsetDateTime?) = apply { this.dueAtGte = dueAtGte }

        fun dueAtLte(dueAtLte: OffsetDateTime?) = apply { this.dueAtLte = dueAtLte }

        /** Page number. The default is 0. */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Page size. The default is 10 and the maximum is 100. */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /**
         * Repeat the key to match more than one status, for example `status=open&status=past_due`.
         */
        fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

        /**
         * Adds a single [Status] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: Status) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /** Repeat the key to match an invoice that has any one of the tags. */
        fun tags(tags: List<Tag>?) = apply { this.tags = tags?.toMutableList() }

        /**
         * Adds a single [Tag] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: Tag) = apply { tags = (tags ?: mutableListOf()).apply { add(tag) } }

        fun totalAmountGte(totalAmountGte: Long?) = apply { this.totalAmountGte = totalAmountGte }

        /**
         * Alias for [Builder.totalAmountGte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalAmountGte(totalAmountGte: Long) = totalAmountGte(totalAmountGte as Long?)

        fun totalAmountLte(totalAmountLte: Long?) = apply { this.totalAmountLte = totalAmountLte }

        /**
         * Alias for [Builder.totalAmountLte].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalAmountLte(totalAmountLte: Long) = totalAmountLte(totalAmountLte as Long?)

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
         * Returns an immutable instance of [InvoiceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvoiceListParams =
            InvoiceListParams(
                collectionMethod,
                createdAtGte,
                createdAtLte,
                customerId,
                dueAtGte,
                dueAtLte,
                pageNumber,
                pageSize,
                status?.toImmutable(),
                subscriptionId,
                tags?.toImmutable(),
                totalAmountGte,
                totalAmountLte,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                collectionMethod?.let { put("collection_method", it.toString()) }
                createdAtGte?.let {
                    put("created_at_gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("created_at_lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                customerId?.let { put("customer_id", it) }
                dueAtGte?.let {
                    put("due_at_gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                dueAtLte?.let {
                    put("due_at_lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                status?.let { put("status", it.joinToString(",") { it.toString() }) }
                subscriptionId?.let { put("subscription_id", it) }
                tags?.let { put("tags", it.joinToString(",") { it.toString() }) }
                totalAmountGte?.let { put("total_amount_gte", it.toString()) }
                totalAmountLte?.let { put("total_amount_lte", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class CollectionMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val AUTO_CHARGE = of("auto_charge")

            val MANUAL = of("manual")

            fun of(value: String) = CollectionMethod(JsonField.of(value))
        }

        /** An enum containing [CollectionMethod]'s known values. */
        enum class Known {
            AUTO_CHARGE,
            MANUAL,
        }

        /**
         * An enum containing [CollectionMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CollectionMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO_CHARGE,
            MANUAL,
            /**
             * An enum member indicating that [CollectionMethod] was instantiated with an unknown
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
                AUTO_CHARGE -> Value.AUTO_CHARGE
                MANUAL -> Value.MANUAL
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
                AUTO_CHARGE -> Known.AUTO_CHARGE
                MANUAL -> Known.MANUAL
                else -> throw DodoPaymentsInvalidDataException("Unknown CollectionMethod: $value")
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): CollectionMethod = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DodoPaymentsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CollectionMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The `message` of each variant is the label of the invoice document. */
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

            val OPEN = of("open")

            val PAID = of("paid")

            val VOID = of("void")

            val DRAFT = of("draft")

            val PAST_DUE = of("past_due")

            val UNCOLLECTABLE = of("uncollectable")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPEN,
            PAID,
            VOID,
            DRAFT,
            PAST_DUE,
            UNCOLLECTABLE,
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
            OPEN,
            PAID,
            VOID,
            DRAFT,
            PAST_DUE,
            UNCOLLECTABLE,
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
                OPEN -> Value.OPEN
                PAID -> Value.PAID
                VOID -> Value.VOID
                DRAFT -> Value.DRAFT
                PAST_DUE -> Value.PAST_DUE
                UNCOLLECTABLE -> Value.UNCOLLECTABLE
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
                OPEN -> Known.OPEN
                PAID -> Known.PAID
                VOID -> Known.VOID
                DRAFT -> Known.DRAFT
                PAST_DUE -> Known.PAST_DUE
                UNCOLLECTABLE -> Known.UNCOLLECTABLE
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DodoPaymentsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Tag @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val REFUNDED = of("refunded")

            val PARTIALLY_REFUNDED = of("partially_refunded")

            val DISPUTED = of("disputed")

            val PAYMENT_REVERSED = of("payment_reversed")

            fun of(value: String) = Tag(JsonField.of(value))
        }

        /** An enum containing [Tag]'s known values. */
        enum class Known {
            REFUNDED,
            PARTIALLY_REFUNDED,
            DISPUTED,
            PAYMENT_REVERSED,
        }

        /**
         * An enum containing [Tag]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Tag] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REFUNDED,
            PARTIALLY_REFUNDED,
            DISPUTED,
            PAYMENT_REVERSED,
            /** An enum member indicating that [Tag] was instantiated with an unknown value. */
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
                REFUNDED -> Value.REFUNDED
                PARTIALLY_REFUNDED -> Value.PARTIALLY_REFUNDED
                DISPUTED -> Value.DISPUTED
                PAYMENT_REVERSED -> Value.PAYMENT_REVERSED
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
                REFUNDED -> Known.REFUNDED
                PARTIALLY_REFUNDED -> Known.PARTIALLY_REFUNDED
                DISPUTED -> Known.DISPUTED
                PAYMENT_REVERSED -> Known.PAYMENT_REVERSED
                else -> throw DodoPaymentsInvalidDataException("Unknown Tag: $value")
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Tag = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DodoPaymentsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tag && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListParams &&
            collectionMethod == other.collectionMethod &&
            createdAtGte == other.createdAtGte &&
            createdAtLte == other.createdAtLte &&
            customerId == other.customerId &&
            dueAtGte == other.dueAtGte &&
            dueAtLte == other.dueAtLte &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            status == other.status &&
            subscriptionId == other.subscriptionId &&
            tags == other.tags &&
            totalAmountGte == other.totalAmountGte &&
            totalAmountLte == other.totalAmountLte &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            collectionMethod,
            createdAtGte,
            createdAtLte,
            customerId,
            dueAtGte,
            dueAtLte,
            pageNumber,
            pageSize,
            status,
            subscriptionId,
            tags,
            totalAmountGte,
            totalAmountLte,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InvoiceListParams{collectionMethod=$collectionMethod, createdAtGte=$createdAtGte, createdAtLte=$createdAtLte, customerId=$customerId, dueAtGte=$dueAtGte, dueAtLte=$dueAtLte, pageNumber=$pageNumber, pageSize=$pageSize, status=$status, subscriptionId=$subscriptionId, tags=$tags, totalAmountGte=$totalAmountGte, totalAmountLte=$totalAmountLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
