// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Discount
private constructor(
    private val amount: JsonField<Int>,
    private val businessId: JsonField<String>,
    private val code: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val discountId: JsonField<String>,
    private val restrictedTo: JsonField<List<String>>,
    private val timesUsed: JsonField<Int>,
    private val type: JsonField<DiscountType>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val subscriptionCycles: JsonField<Int>,
    private val usageLimit: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("restricted_to")
        @ExcludeMissing
        restrictedTo: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("times_used") @ExcludeMissing timesUsed: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscription_cycles")
        @ExcludeMissing
        subscriptionCycles: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("usage_limit") @ExcludeMissing usageLimit: JsonField<Int> = JsonMissing.of(),
    ) : this(
        amount,
        businessId,
        code,
        createdAt,
        discountId,
        restrictedTo,
        timesUsed,
        type,
        expiresAt,
        name,
        subscriptionCycles,
        usageLimit,
        mutableMapOf(),
    )

    /**
     * The discount amount.
     * - If `discount_type` is `percentage`, this is in **basis points** (e.g., 540 => 5.4%).
     * - Otherwise, this is **USD cents** (e.g., 100 => `$1.00`).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Int = amount.getRequired("amount")

    /**
     * The business this discount belongs to.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * The discount code (up to 16 chars).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * Timestamp when the discount is created
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The unique discount ID
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discountId(): String = discountId.getRequired("discount_id")

    /**
     * List of product IDs to which this discount is restricted.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun restrictedTo(): List<String> = restrictedTo.getRequired("restricted_to")

    /**
     * How many times this discount has been used.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timesUsed(): Int = timesUsed.getRequired("times_used")

    /**
     * The type of discount, e.g. `percentage`, `flat`, or `flat_per_unit`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): DiscountType = type.getRequired("type")

    /**
     * Optional date/time after which discount is expired.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /**
     * Name for the Discount
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Number of subscription billing cycles this discount is valid for. If not provided, the
     * discount will be applied indefinitely to all recurring payments related to the subscription.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionCycles(): Int? = subscriptionCycles.getNullable("subscription_cycles")

    /**
     * Usage limit for this discount, if any.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun usageLimit(): Int? = usageLimit.getNullable("usage_limit")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Int> = amount

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [discountId].
     *
     * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /**
     * Returns the raw JSON value of [restrictedTo].
     *
     * Unlike [restrictedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restricted_to")
    @ExcludeMissing
    fun _restrictedTo(): JsonField<List<String>> = restrictedTo

    /**
     * Returns the raw JSON value of [timesUsed].
     *
     * Unlike [timesUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("times_used") @ExcludeMissing fun _timesUsed(): JsonField<Int> = timesUsed

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<DiscountType> = type

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [subscriptionCycles].
     *
     * Unlike [subscriptionCycles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscription_cycles")
    @ExcludeMissing
    fun _subscriptionCycles(): JsonField<Int> = subscriptionCycles

    /**
     * Returns the raw JSON value of [usageLimit].
     *
     * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage_limit") @ExcludeMissing fun _usageLimit(): JsonField<Int> = usageLimit

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

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

        private var amount: JsonField<Int>? = null
        private var businessId: JsonField<String>? = null
        private var code: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discountId: JsonField<String>? = null
        private var restrictedTo: JsonField<MutableList<String>>? = null
        private var timesUsed: JsonField<Int>? = null
        private var type: JsonField<DiscountType>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var subscriptionCycles: JsonField<Int> = JsonMissing.of()
        private var usageLimit: JsonField<Int> = JsonMissing.of()
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
            subscriptionCycles = discount.subscriptionCycles
            usageLimit = discount.usageLimit
            additionalProperties = discount.additionalProperties.toMutableMap()
        }

        /**
         * The discount amount.
         * - If `discount_type` is `percentage`, this is in **basis points** (e.g., 540 => 5.4%).
         * - Otherwise, this is **USD cents** (e.g., 100 => `$1.00`).
         */
        fun amount(amount: Int) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

        /** The business this discount belongs to. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The discount code (up to 16 chars). */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Timestamp when the discount is created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The unique discount ID */
        fun discountId(discountId: String) = discountId(JsonField.of(discountId))

        /**
         * Sets [Builder.discountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** List of product IDs to which this discount is restricted. */
        fun restrictedTo(restrictedTo: List<String>) = restrictedTo(JsonField.of(restrictedTo))

        /**
         * Sets [Builder.restrictedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictedTo] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
            this.restrictedTo = restrictedTo.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.restrictedTo].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRestrictedTo(restrictedTo: String) = apply {
            this.restrictedTo =
                (this.restrictedTo ?: JsonField.of(mutableListOf())).also {
                    checkKnown("restrictedTo", it).add(restrictedTo)
                }
        }

        /** How many times this discount has been used. */
        fun timesUsed(timesUsed: Int) = timesUsed(JsonField.of(timesUsed))

        /**
         * Sets [Builder.timesUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timesUsed] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timesUsed(timesUsed: JsonField<Int>) = apply { this.timesUsed = timesUsed }

        /** The type of discount, e.g. `percentage`, `flat`, or `flat_per_unit`. */
        fun type(type: DiscountType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [DiscountType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<DiscountType>) = apply { this.type = type }

        /** Optional date/time after which discount is expired. */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Name for the Discount */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Number of subscription billing cycles this discount is valid for. If not provided, the
         * discount will be applied indefinitely to all recurring payments related to the
         * subscription.
         */
        fun subscriptionCycles(subscriptionCycles: Int?) =
            subscriptionCycles(JsonField.ofNullable(subscriptionCycles))

        /**
         * Alias for [Builder.subscriptionCycles].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun subscriptionCycles(subscriptionCycles: Int) =
            subscriptionCycles(subscriptionCycles as Int?)

        /**
         * Sets [Builder.subscriptionCycles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionCycles] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionCycles(subscriptionCycles: JsonField<Int>) = apply {
            this.subscriptionCycles = subscriptionCycles
        }

        /** Usage limit for this discount, if any. */
        fun usageLimit(usageLimit: Int?) = usageLimit(JsonField.ofNullable(usageLimit))

        /**
         * Alias for [Builder.usageLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun usageLimit(usageLimit: Int) = usageLimit(usageLimit as Int?)

        /**
         * Sets [Builder.usageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageLimit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usageLimit(usageLimit: JsonField<Int>) = apply { this.usageLimit = usageLimit }

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

        /**
         * Returns an immutable instance of [Discount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                subscriptionCycles,
                usageLimit,
                additionalProperties.toMutableMap(),
            )
    }

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
        type().validate()
        expiresAt()
        name()
        subscriptionCycles()
        usageLimit()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (amount.asKnown() == null) 0 else 1) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (code.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (discountId.asKnown() == null) 0 else 1) +
            (restrictedTo.asKnown()?.size ?: 0) +
            (if (timesUsed.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (subscriptionCycles.asKnown() == null) 0 else 1) +
            (if (usageLimit.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Discount &&
            amount == other.amount &&
            businessId == other.businessId &&
            code == other.code &&
            createdAt == other.createdAt &&
            discountId == other.discountId &&
            restrictedTo == other.restrictedTo &&
            timesUsed == other.timesUsed &&
            type == other.type &&
            expiresAt == other.expiresAt &&
            name == other.name &&
            subscriptionCycles == other.subscriptionCycles &&
            usageLimit == other.usageLimit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            businessId,
            code,
            createdAt,
            discountId,
            restrictedTo,
            timesUsed,
            type,
            expiresAt,
            name,
            subscriptionCycles,
            usageLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Discount{amount=$amount, businessId=$businessId, code=$code, createdAt=$createdAt, discountId=$discountId, restrictedTo=$restrictedTo, timesUsed=$timesUsed, type=$type, expiresAt=$expiresAt, name=$name, subscriptionCycles=$subscriptionCycles, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
}
