// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.discounts

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkKnown
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Discount
@JsonCreator
private constructor(
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("business_id")
    @ExcludeMissing
    private val businessId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discount_id")
    @ExcludeMissing
    private val discountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("restricted_to")
    @ExcludeMissing
    private val restrictedTo: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("times_used")
    @ExcludeMissing
    private val timesUsed: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("usage_limit")
    @ExcludeMissing
    private val usageLimit: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The discount amount.
     * - If `discount_type` is `percentage`, this is in **basis points** (e.g., 540 => 5.4%).
     * - Otherwise, this is **USD cents** (e.g., 100 => `$1.00`).
     */
    fun amount(): Long = amount.getRequired("amount")

    /** The business this discount belongs to. */
    fun businessId(): String = businessId.getRequired("business_id")

    /** The discount code (up to 16 chars). */
    fun code(): String = code.getRequired("code")

    /** Timestamp when the discount is created */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The unique discount ID */
    fun discountId(): String = discountId.getRequired("discount_id")

    /** List of product IDs to which this discount is restricted. */
    fun restrictedTo(): List<String> = restrictedTo.getRequired("restricted_to")

    /** How many times this discount has been used. */
    fun timesUsed(): Long = timesUsed.getRequired("times_used")

    fun type(): Type = type.getRequired("type")

    /** Optional date/time after which discount is expired. */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /** Name for the Discount */
    fun name(): String? = name.getNullable("name")

    /** Usage limit for this discount, if any. */
    fun usageLimit(): Long? = usageLimit.getNullable("usage_limit")

    /**
     * The discount amount.
     * - If `discount_type` is `percentage`, this is in **basis points** (e.g., 540 => 5.4%).
     * - Otherwise, this is **USD cents** (e.g., 100 => `$1.00`).
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The business this discount belongs to. */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /** The discount code (up to 16 chars). */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** Timestamp when the discount is created */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The unique discount ID */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /** List of product IDs to which this discount is restricted. */
    @JsonProperty("restricted_to")
    @ExcludeMissing
    fun _restrictedTo(): JsonField<List<String>> = restrictedTo

    /** How many times this discount has been used. */
    @JsonProperty("times_used") @ExcludeMissing fun _timesUsed(): JsonField<Long> = timesUsed

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** Optional date/time after which discount is expired. */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /** Name for the Discount */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Usage limit for this discount, if any. */
    @JsonProperty("usage_limit") @ExcludeMissing fun _usageLimit(): JsonField<Long> = usageLimit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Discount = apply {
        if (validated) {
            return@apply
        }

        amount()
        businessId()
        code()
        createdAt()
        discountId()
        restrictedTo()
        timesUsed()
        type()
        expiresAt()
        name()
        usageLimit()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Discount].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .businessId()
         * .code()
         * .createdAt()
         * .discountId()
         * .restrictedTo()
         * .timesUsed()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Discount]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var businessId: JsonField<String>? = null
        private var code: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discountId: JsonField<String>? = null
        private var restrictedTo: JsonField<MutableList<String>>? = null
        private var timesUsed: JsonField<Long>? = null
        private var type: JsonField<Type>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var usageLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(discount: Discount) = apply {
            amount = discount.amount
            businessId = discount.businessId
            code = discount.code
            createdAt = discount.createdAt
            discountId = discount.discountId
            restrictedTo = discount.restrictedTo.map { it.toMutableList() }
            timesUsed = discount.timesUsed
            type = discount.type
            expiresAt = discount.expiresAt
            name = discount.name
            usageLimit = discount.usageLimit
            additionalProperties = discount.additionalProperties.toMutableMap()
        }

        /**
         * The discount amount.
         * - If `discount_type` is `percentage`, this is in **basis points** (e.g., 540 => 5.4%).
         * - Otherwise, this is **USD cents** (e.g., 100 => `$1.00`).
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The discount amount.
         * - If `discount_type` is `percentage`, this is in **basis points** (e.g., 540 => 5.4%).
         * - Otherwise, this is **USD cents** (e.g., 100 => `$1.00`).
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The business this discount belongs to. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /** The business this discount belongs to. */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The discount code (up to 16 chars). */
        fun code(code: String) = code(JsonField.of(code))

        /** The discount code (up to 16 chars). */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Timestamp when the discount is created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** Timestamp when the discount is created */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The unique discount ID */
        fun discountId(discountId: String) = discountId(JsonField.of(discountId))

        /** The unique discount ID */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** List of product IDs to which this discount is restricted. */
        fun restrictedTo(restrictedTo: List<String>) = restrictedTo(JsonField.of(restrictedTo))

        /** List of product IDs to which this discount is restricted. */
        fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
            this.restrictedTo = restrictedTo.map { it.toMutableList() }
        }

        /** List of product IDs to which this discount is restricted. */
        fun addRestrictedTo(restrictedTo: String) = apply {
            this.restrictedTo =
                (this.restrictedTo ?: JsonField.of(mutableListOf())).also {
                    checkKnown("restrictedTo", it).add(restrictedTo)
                }
        }

        /** How many times this discount has been used. */
        fun timesUsed(timesUsed: Long) = timesUsed(JsonField.of(timesUsed))

        /** How many times this discount has been used. */
        fun timesUsed(timesUsed: JsonField<Long>) = apply { this.timesUsed = timesUsed }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Optional date/time after which discount is expired. */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Optional date/time after which discount is expired. */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Name for the Discount */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Name for the Discount */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Usage limit for this discount, if any. */
        fun usageLimit(usageLimit: Long?) = usageLimit(JsonField.ofNullable(usageLimit))

        /** Usage limit for this discount, if any. */
        fun usageLimit(usageLimit: Long) = usageLimit(usageLimit as Long?)

        /** Usage limit for this discount, if any. */
        fun usageLimit(usageLimit: JsonField<Long>) = apply { this.usageLimit = usageLimit }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): Discount =
            Discount(
                checkRequired("amount", amount),
                checkRequired("businessId", businessId),
                checkRequired("code", code),
                checkRequired("createdAt", createdAt),
                checkRequired("discountId", discountId),
                checkRequired("restrictedTo", restrictedTo).map { it.toImmutable() },
                checkRequired("timesUsed", timesUsed),
                checkRequired("type", type),
                expiresAt,
                name,
                usageLimit,
                additionalProperties.toImmutable(),
            )
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PERCENTAGE = of("percentage")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PERCENTAGE
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERCENTAGE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PERCENTAGE -> Value.PERCENTAGE
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
                PERCENTAGE -> Known.PERCENTAGE
                else -> throw DodoPaymentsInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Discount && amount == other.amount && businessId == other.businessId && code == other.code && createdAt == other.createdAt && discountId == other.discountId && restrictedTo == other.restrictedTo && timesUsed == other.timesUsed && type == other.type && expiresAt == other.expiresAt && name == other.name && usageLimit == other.usageLimit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, businessId, code, createdAt, discountId, restrictedTo, timesUsed, type, expiresAt, name, usageLimit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Discount{amount=$amount, businessId=$businessId, code=$code, createdAt=$createdAt, discountId=$discountId, restrictedTo=$restrictedTo, timesUsed=$timesUsed, type=$type, expiresAt=$expiresAt, name=$name, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
}
