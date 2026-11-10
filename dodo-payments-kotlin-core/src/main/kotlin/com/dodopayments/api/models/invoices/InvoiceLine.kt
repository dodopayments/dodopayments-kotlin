// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** One frozen line. Amounts are in the smallest currency unit. */
class InvoiceLine
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val kind: JsonField<Kind>,
    private val quantity: JsonField<Int>,
    private val tax: JsonField<Long>,
    private val taxInclusive: JsonField<Boolean>,
    private val unitAmount: JsonField<Long>,
    private val addonId: JsonField<String>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val periodEnd: JsonField<OffsetDateTime>,
    private val periodStart: JsonField<OffsetDateTime>,
    private val productId: JsonField<String>,
    private val subscriptionId: JsonField<String>,
    private val taxRate: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing tax: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        taxInclusive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("unit_amount") @ExcludeMissing unitAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("addon_id") @ExcludeMissing addonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("period_end")
        @ExcludeMissing
        periodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("period_start")
        @ExcludeMissing
        periodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_rate") @ExcludeMissing taxRate: JsonField<Int> = JsonMissing.of(),
    ) : this(
        amount,
        kind,
        quantity,
        tax,
        taxInclusive,
        unitAmount,
        addonId,
        description,
        name,
        periodEnd,
        periodStart,
        productId,
        subscriptionId,
        taxRate,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): Kind = kind.getRequired("kind")

    /**
     * A usage line has a quantity of 1. Its amount is the full usage charge.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Int = quantity.getRequired("quantity")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tax(): Long = tax.getRequired("tax")

    /**
     * `true` when `amount` includes `tax`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitAmount(): Long = unitAmount.getRequired("unit_amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addonId(): String? = addonId.getNullable("addon_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun periodEnd(): OffsetDateTime? = periodEnd.getNullable("period_end")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun periodStart(): OffsetDateTime? = periodStart.getNullable("period_start")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productId(): String? = productId.getNullable("product_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

    /**
     * Tax percent times 100. For example, 1800 is 18%.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxRate(): Int? = taxRate.getNullable("tax_rate")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [tax].
     *
     * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Long> = tax

    /**
     * Returns the raw JSON value of [taxInclusive].
     *
     * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_inclusive")
    @ExcludeMissing
    fun _taxInclusive(): JsonField<Boolean> = taxInclusive

    /**
     * Returns the raw JSON value of [unitAmount].
     *
     * Unlike [unitAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<Long> = unitAmount

    /**
     * Returns the raw JSON value of [addonId].
     *
     * Unlike [addonId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addon_id") @ExcludeMissing fun _addonId(): JsonField<String> = addonId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [periodEnd].
     *
     * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_end")
    @ExcludeMissing
    fun _periodEnd(): JsonField<OffsetDateTime> = periodEnd

    /**
     * Returns the raw JSON value of [periodStart].
     *
     * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_start")
    @ExcludeMissing
    fun _periodStart(): JsonField<OffsetDateTime> = periodStart

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [taxRate].
     *
     * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<Int> = taxRate

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
         * Returns a mutable builder for constructing an instance of [InvoiceLine].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .kind()
         * .quantity()
         * .tax()
         * .taxInclusive()
         * .unitAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceLine]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var kind: JsonField<Kind>? = null
        private var quantity: JsonField<Int>? = null
        private var tax: JsonField<Long>? = null
        private var taxInclusive: JsonField<Boolean>? = null
        private var unitAmount: JsonField<Long>? = null
        private var addonId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var taxRate: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLine: InvoiceLine) = apply {
            amount = invoiceLine.amount
            kind = invoiceLine.kind
            quantity = invoiceLine.quantity
            tax = invoiceLine.tax
            taxInclusive = invoiceLine.taxInclusive
            unitAmount = invoiceLine.unitAmount
            addonId = invoiceLine.addonId
            description = invoiceLine.description
            name = invoiceLine.name
            periodEnd = invoiceLine.periodEnd
            periodStart = invoiceLine.periodStart
            productId = invoiceLine.productId
            subscriptionId = invoiceLine.subscriptionId
            taxRate = invoiceLine.taxRate
            additionalProperties = invoiceLine.additionalProperties.toMutableMap()
        }

        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun kind(kind: Kind) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [Kind] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

        /** A usage line has a quantity of 1. Its amount is the full usage charge. */
        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        fun tax(tax: Long) = tax(JsonField.of(tax))

        /**
         * Sets [Builder.tax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tax] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tax(tax: JsonField<Long>) = apply { this.tax = tax }

        /** `true` when `amount` includes `tax`. */
        fun taxInclusive(taxInclusive: Boolean) = taxInclusive(JsonField.of(taxInclusive))

        /**
         * Sets [Builder.taxInclusive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
            this.taxInclusive = taxInclusive
        }

        fun unitAmount(unitAmount: Long) = unitAmount(JsonField.of(unitAmount))

        /**
         * Sets [Builder.unitAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unitAmount(unitAmount: JsonField<Long>) = apply { this.unitAmount = unitAmount }

        fun addonId(addonId: String?) = addonId(JsonField.ofNullable(addonId))

        /**
         * Sets [Builder.addonId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addonId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addonId(addonId: JsonField<String>) = apply { this.addonId = addonId }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun periodEnd(periodEnd: OffsetDateTime?) = periodEnd(JsonField.ofNullable(periodEnd))

        /**
         * Sets [Builder.periodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply { this.periodEnd = periodEnd }

        fun periodStart(periodStart: OffsetDateTime?) =
            periodStart(JsonField.ofNullable(periodStart))

        /**
         * Sets [Builder.periodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
            this.periodStart = periodStart
        }

        fun productId(productId: String?) = productId(JsonField.ofNullable(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun subscriptionId(subscriptionId: String?) =
            subscriptionId(JsonField.ofNullable(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

        /** Tax percent times 100. For example, 1800 is 18%. */
        fun taxRate(taxRate: Int?) = taxRate(JsonField.ofNullable(taxRate))

        /**
         * Alias for [Builder.taxRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun taxRate(taxRate: Int) = taxRate(taxRate as Int?)

        /**
         * Sets [Builder.taxRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxRate] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxRate(taxRate: JsonField<Int>) = apply { this.taxRate = taxRate }

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
         * Returns an immutable instance of [InvoiceLine].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .kind()
         * .quantity()
         * .tax()
         * .taxInclusive()
         * .unitAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceLine =
            InvoiceLine(
                checkRequired("amount", amount),
                checkRequired("kind", kind),
                checkRequired("quantity", quantity),
                checkRequired("tax", tax),
                checkRequired("taxInclusive", taxInclusive),
                checkRequired("unitAmount", unitAmount),
                addonId,
                description,
                name,
                periodEnd,
                periodStart,
                productId,
                subscriptionId,
                taxRate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): InvoiceLine = apply {
        if (validated) {
            return@apply
        }

        amount()
        kind().validate()
        quantity()
        tax()
        taxInclusive()
        unitAmount()
        addonId()
        description()
        name()
        periodEnd()
        periodStart()
        productId()
        subscriptionId()
        taxRate()
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
            (kind.asKnown()?.validity() ?: 0) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (if (tax.asKnown() == null) 0 else 1) +
            (if (taxInclusive.asKnown() == null) 0 else 1) +
            (if (unitAmount.asKnown() == null) 0 else 1) +
            (if (addonId.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (periodEnd.asKnown() == null) 0 else 1) +
            (if (periodStart.asKnown() == null) 0 else 1) +
            (if (productId.asKnown() == null) 0 else 1) +
            (if (subscriptionId.asKnown() == null) 0 else 1) +
            (if (taxRate.asKnown() == null) 0 else 1)

    class Kind @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val SUBSCRIPTION = of("subscription")

            val ADDON = of("addon")

            val METER = of("meter")

            val CREDIT_OVERAGE = of("credit_overage")

            val ONE_TIME = of("one_time")

            fun of(value: String) = Kind(JsonField.of(value))
        }

        /** An enum containing [Kind]'s known values. */
        enum class Known {
            SUBSCRIPTION,
            ADDON,
            METER,
            CREDIT_OVERAGE,
            ONE_TIME,
        }

        /**
         * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Kind] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUBSCRIPTION,
            ADDON,
            METER,
            CREDIT_OVERAGE,
            ONE_TIME,
            /** An enum member indicating that [Kind] was instantiated with an unknown value. */
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
                SUBSCRIPTION -> Value.SUBSCRIPTION
                ADDON -> Value.ADDON
                METER -> Value.METER
                CREDIT_OVERAGE -> Value.CREDIT_OVERAGE
                ONE_TIME -> Value.ONE_TIME
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
                SUBSCRIPTION -> Known.SUBSCRIPTION
                ADDON -> Known.ADDON
                METER -> Known.METER
                CREDIT_OVERAGE -> Known.CREDIT_OVERAGE
                ONE_TIME -> Known.ONE_TIME
                else -> throw DodoPaymentsInvalidDataException("Unknown Kind: $value")
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
        fun validate(): Kind = apply {
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

            return other is Kind && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceLine &&
            amount == other.amount &&
            kind == other.kind &&
            quantity == other.quantity &&
            tax == other.tax &&
            taxInclusive == other.taxInclusive &&
            unitAmount == other.unitAmount &&
            addonId == other.addonId &&
            description == other.description &&
            name == other.name &&
            periodEnd == other.periodEnd &&
            periodStart == other.periodStart &&
            productId == other.productId &&
            subscriptionId == other.subscriptionId &&
            taxRate == other.taxRate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            kind,
            quantity,
            tax,
            taxInclusive,
            unitAmount,
            addonId,
            description,
            name,
            periodEnd,
            periodStart,
            productId,
            subscriptionId,
            taxRate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceLine{amount=$amount, kind=$kind, quantity=$quantity, tax=$tax, taxInclusive=$taxInclusive, unitAmount=$unitAmount, addonId=$addonId, description=$description, name=$name, periodEnd=$periodEnd, periodStart=$periodStart, productId=$productId, subscriptionId=$subscriptionId, taxRate=$taxRate, additionalProperties=$additionalProperties}"
}
