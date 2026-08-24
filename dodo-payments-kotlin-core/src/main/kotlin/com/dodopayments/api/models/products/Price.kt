// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects

/** One-time price details. */
@JsonDeserialize(using = Price.Deserializer::class)
@JsonSerialize(using = Price.Serializer::class)
class Price
private constructor(
    private val oneTime: OneTimePrice? = null,
    private val recurring: RecurringPrice? = null,
    private val usageBased: UsageBasedPrice? = null,
    private val _json: JsonValue? = null,
) {

    /** One-time price details. */
    fun oneTime(): OneTimePrice? = oneTime

    /** Recurring price details. */
    fun recurring(): RecurringPrice? = recurring

    /** Usage Based price details. */
    fun usageBased(): UsageBasedPrice? = usageBased

    fun isOneTime(): Boolean = oneTime != null

    fun isRecurring(): Boolean = recurring != null

    fun isUsageBased(): Boolean = usageBased != null

    /** One-time price details. */
    fun asOneTime(): OneTimePrice = oneTime.getOrThrow("oneTime")

    /** Recurring price details. */
    fun asRecurring(): RecurringPrice = recurring.getOrThrow("recurring")

    /** Usage Based price details. */
    fun asUsageBased(): UsageBasedPrice = usageBased.getOrThrow("usageBased")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.dodopayments.api.core.JsonValue
     *
     * val result: String? = price.accept(object : Price.Visitor<String?> {
     *     override fun visitOneTime(oneTime: OneTimePrice): String? = oneTime.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws DodoPaymentsInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
     *   and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            oneTime != null -> visitor.visitOneTime(oneTime)
            recurring != null -> visitor.visitRecurring(recurring)
            usageBased != null -> visitor.visitUsageBased(usageBased)
            else -> visitor.unknown(_json)
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
    fun validate(): Price = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitOneTime(oneTime: OneTimePrice) {
                    oneTime.validate()
                }

                override fun visitRecurring(recurring: RecurringPrice) {
                    recurring.validate()
                }

                override fun visitUsageBased(usageBased: UsageBasedPrice) {
                    usageBased.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitOneTime(oneTime: OneTimePrice) = oneTime.validity()

                override fun visitRecurring(recurring: RecurringPrice) = recurring.validity()

                override fun visitUsageBased(usageBased: UsageBasedPrice) = usageBased.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Price &&
            oneTime == other.oneTime &&
            recurring == other.recurring &&
            usageBased == other.usageBased
    }

    override fun hashCode(): Int = Objects.hash(oneTime, recurring, usageBased)

    override fun toString(): String =
        when {
            oneTime != null -> "Price{oneTime=$oneTime}"
            recurring != null -> "Price{recurring=$recurring}"
            usageBased != null -> "Price{usageBased=$usageBased}"
            _json != null -> "Price{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Price")
        }

    companion object {

        /** One-time price details. */
        fun ofOneTime(oneTime: OneTimePrice) = Price(oneTime = oneTime)

        /** Recurring price details. */
        fun ofRecurring(recurring: RecurringPrice) = Price(recurring = recurring)

        /** Usage Based price details. */
        fun ofUsageBased(usageBased: UsageBasedPrice) = Price(usageBased = usageBased)
    }

    /** An interface that defines how to map each variant of [Price] to a value of type [T]. */
    interface Visitor<out T> {

        /** One-time price details. */
        fun visitOneTime(oneTime: OneTimePrice): T

        /** Recurring price details. */
        fun visitRecurring(recurring: RecurringPrice): T

        /** Usage Based price details. */
        fun visitUsageBased(usageBased: UsageBasedPrice): T

        /**
         * Maps an unknown variant of [Price] to a value of type [T].
         *
         * An instance of [Price] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown Price: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Price>(Price::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Price {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "one_time_price" -> {
                    return tryDeserialize(node, jacksonTypeRef<OneTimePrice>())?.let {
                        Price(oneTime = it, _json = json)
                    } ?: Price(_json = json)
                }
                "recurring_price" -> {
                    return tryDeserialize(node, jacksonTypeRef<RecurringPrice>())?.let {
                        Price(recurring = it, _json = json)
                    } ?: Price(_json = json)
                }
                "usage_based_price" -> {
                    return tryDeserialize(node, jacksonTypeRef<UsageBasedPrice>())?.let {
                        Price(usageBased = it, _json = json)
                    } ?: Price(_json = json)
                }
            }

            return Price(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<Price>(Price::class) {

        override fun serialize(
            value: Price,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.oneTime != null -> generator.writeObject(value.oneTime)
                value.recurring != null -> generator.writeObject(value.recurring)
                value.usageBased != null -> generator.writeObject(value.usageBased)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Price")
            }
        }
    }

    /** One-time price details. */
    class OneTimePrice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val discount: JsonField<Long>,
        private val price: JsonField<Int>,
        private val type: JsonValue,
        private val payWhatYouWant: JsonField<Boolean>,
        private val purchasingPowerParity: JsonField<Boolean>,
        private val suggestedPrice: JsonField<Int>,
        private val taxInclusive: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount") @ExcludeMissing discount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("pay_what_you_want")
            @ExcludeMissing
            payWhatYouWant: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("suggested_price")
            @ExcludeMissing
            suggestedPrice: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            taxInclusive: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            currency,
            discount,
            price,
            type,
            payWhatYouWant,
            purchasingPowerParity,
            suggestedPrice,
            taxInclusive,
            mutableMapOf(),
        )

        /**
         * The currency in which the payment is made.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Discount applied to the price, represented as a percentage (0 to 100).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discount(): Long = discount.getRequired("discount")

        /**
         * The payment amount, in the smallest denomination of the currency (e.g., cents for USD).
         * For example, to charge $1.00, pass `100`.
         *
         * If [`pay_what_you_want`](Self::pay_what_you_want) is set to `true`, this field represents
         * the **minimum** amount the customer must pay.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun price(): Int = price.getRequired("price")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("one_time_price")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Indicates whether the customer can pay any amount they choose. If set to `true`, the
         * [`price`](Self::price) field is the minimum amount.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun payWhatYouWant(): Boolean? = payWhatYouWant.getNullable("pay_what_you_want")

        /**
         * Opts this price in to purchasing power parity. The business must also enable purchasing
         * power parity. The discount percentage per country is always business-wide. Defaults to
         * `false`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun purchasingPowerParity(): Boolean? =
            purchasingPowerParity.getNullable("purchasing_power_parity")

        /**
         * A suggested price for the user to pay. This value is only considered if
         * [`pay_what_you_want`](Self::pay_what_you_want) is `true`. Otherwise, it is ignored.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun suggestedPrice(): Int? = suggestedPrice.getNullable("suggested_price")

        /**
         * Indicates if the price is tax inclusive.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxInclusive(): Boolean? = taxInclusive.getNullable("tax_inclusive")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Long> = discount

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Int> = price

        /**
         * Returns the raw JSON value of [payWhatYouWant].
         *
         * Unlike [payWhatYouWant], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pay_what_you_want")
        @ExcludeMissing
        fun _payWhatYouWant(): JsonField<Boolean> = payWhatYouWant

        /**
         * Returns the raw JSON value of [purchasingPowerParity].
         *
         * Unlike [purchasingPowerParity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("purchasing_power_parity")
        @ExcludeMissing
        fun _purchasingPowerParity(): JsonField<Boolean> = purchasingPowerParity

        /**
         * Returns the raw JSON value of [suggestedPrice].
         *
         * Unlike [suggestedPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("suggested_price")
        @ExcludeMissing
        fun _suggestedPrice(): JsonField<Int> = suggestedPrice

        /**
         * Returns the raw JSON value of [taxInclusive].
         *
         * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        fun _taxInclusive(): JsonField<Boolean> = taxInclusive

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
             * Returns a mutable builder for constructing an instance of [OneTimePrice].
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .discount()
             * .price()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [OneTimePrice]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var discount: JsonField<Long>? = null
            private var price: JsonField<Int>? = null
            private var type: JsonValue = JsonValue.from("one_time_price")
            private var payWhatYouWant: JsonField<Boolean> = JsonMissing.of()
            private var purchasingPowerParity: JsonField<Boolean> = JsonMissing.of()
            private var suggestedPrice: JsonField<Int> = JsonMissing.of()
            private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(oneTimePrice: OneTimePrice) = apply {
                currency = oneTimePrice.currency
                discount = oneTimePrice.discount
                price = oneTimePrice.price
                type = oneTimePrice.type
                payWhatYouWant = oneTimePrice.payWhatYouWant
                purchasingPowerParity = oneTimePrice.purchasingPowerParity
                suggestedPrice = oneTimePrice.suggestedPrice
                taxInclusive = oneTimePrice.taxInclusive
                additionalProperties = oneTimePrice.additionalProperties.toMutableMap()
            }

            /** The currency in which the payment is made. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Discount applied to the price, represented as a percentage (0 to 100). */
            fun discount(discount: Long) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Long>) = apply { this.discount = discount }

            /**
             * The payment amount, in the smallest denomination of the currency (e.g., cents for
             * USD). For example, to charge $1.00, pass `100`.
             *
             * If [`pay_what_you_want`](Self::pay_what_you_want) is set to `true`, this field
             * represents the **minimum** amount the customer must pay.
             */
            fun price(price: Int) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Int>) = apply { this.price = price }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("one_time_price")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            /**
             * Indicates whether the customer can pay any amount they choose. If set to `true`, the
             * [`price`](Self::price) field is the minimum amount.
             */
            fun payWhatYouWant(payWhatYouWant: Boolean) =
                payWhatYouWant(JsonField.of(payWhatYouWant))

            /**
             * Sets [Builder.payWhatYouWant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payWhatYouWant] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payWhatYouWant(payWhatYouWant: JsonField<Boolean>) = apply {
                this.payWhatYouWant = payWhatYouWant
            }

            /**
             * Opts this price in to purchasing power parity. The business must also enable
             * purchasing power parity. The discount percentage per country is always business-wide.
             * Defaults to `false`.
             */
            fun purchasingPowerParity(purchasingPowerParity: Boolean) =
                purchasingPowerParity(JsonField.of(purchasingPowerParity))

            /**
             * Sets [Builder.purchasingPowerParity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchasingPowerParity] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun purchasingPowerParity(purchasingPowerParity: JsonField<Boolean>) = apply {
                this.purchasingPowerParity = purchasingPowerParity
            }

            /**
             * A suggested price for the user to pay. This value is only considered if
             * [`pay_what_you_want`](Self::pay_what_you_want) is `true`. Otherwise, it is ignored.
             */
            fun suggestedPrice(suggestedPrice: Int?) =
                suggestedPrice(JsonField.ofNullable(suggestedPrice))

            /**
             * Alias for [Builder.suggestedPrice].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun suggestedPrice(suggestedPrice: Int) = suggestedPrice(suggestedPrice as Int?)

            /**
             * Sets [Builder.suggestedPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suggestedPrice] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suggestedPrice(suggestedPrice: JsonField<Int>) = apply {
                this.suggestedPrice = suggestedPrice
            }

            /** Indicates if the price is tax inclusive. */
            fun taxInclusive(taxInclusive: Boolean?) =
                taxInclusive(JsonField.ofNullable(taxInclusive))

            /**
             * Alias for [Builder.taxInclusive].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun taxInclusive(taxInclusive: Boolean) = taxInclusive(taxInclusive as Boolean?)

            /**
             * Sets [Builder.taxInclusive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                this.taxInclusive = taxInclusive
            }

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
             * Returns an immutable instance of [OneTimePrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .discount()
             * .price()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OneTimePrice =
                OneTimePrice(
                    checkRequired("currency", currency),
                    checkRequired("discount", discount),
                    checkRequired("price", price),
                    type,
                    payWhatYouWant,
                    purchasingPowerParity,
                    suggestedPrice,
                    taxInclusive,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): OneTimePrice = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            discount()
            price()
            _type().let {
                if (it != JsonValue.from("one_time_price")) {
                    throw DodoPaymentsInvalidDataException("'type' is invalid, received $it")
                }
            }
            payWhatYouWant()
            purchasingPowerParity()
            suggestedPrice()
            taxInclusive()
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
        internal fun validity(): Int =
            (currency.asKnown()?.validity() ?: 0) +
                (if (discount.asKnown() == null) 0 else 1) +
                (if (price.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("one_time_price")) 1 else 0 } +
                (if (payWhatYouWant.asKnown() == null) 0 else 1) +
                (if (purchasingPowerParity.asKnown() == null) 0 else 1) +
                (if (suggestedPrice.asKnown() == null) 0 else 1) +
                (if (taxInclusive.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OneTimePrice &&
                currency == other.currency &&
                discount == other.discount &&
                price == other.price &&
                type == other.type &&
                payWhatYouWant == other.payWhatYouWant &&
                purchasingPowerParity == other.purchasingPowerParity &&
                suggestedPrice == other.suggestedPrice &&
                taxInclusive == other.taxInclusive &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                discount,
                price,
                type,
                payWhatYouWant,
                purchasingPowerParity,
                suggestedPrice,
                taxInclusive,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OneTimePrice{currency=$currency, discount=$discount, price=$price, type=$type, payWhatYouWant=$payWhatYouWant, purchasingPowerParity=$purchasingPowerParity, suggestedPrice=$suggestedPrice, taxInclusive=$taxInclusive, additionalProperties=$additionalProperties}"
    }

    /** Recurring price details. */
    class RecurringPrice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val discount: JsonField<Long>,
        private val paymentFrequencyCount: JsonField<Int>,
        private val paymentFrequencyInterval: JsonField<TimeInterval>,
        private val price: JsonField<Int>,
        private val subscriptionPeriodCount: JsonField<Int>,
        private val subscriptionPeriodInterval: JsonField<TimeInterval>,
        private val type: JsonValue,
        private val purchasingPowerParity: JsonField<Boolean>,
        private val taxInclusive: JsonField<Boolean>,
        private val trialAmount: JsonField<Int>,
        private val trialApplyDiscounts: JsonField<Boolean>,
        private val trialPeriodDays: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount") @ExcludeMissing discount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("payment_frequency_count")
            @ExcludeMissing
            paymentFrequencyCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("payment_frequency_interval")
            @ExcludeMissing
            paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("subscription_period_count")
            @ExcludeMissing
            subscriptionPeriodCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("subscription_period_interval")
            @ExcludeMissing
            subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            taxInclusive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("trial_amount")
            @ExcludeMissing
            trialAmount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("trial_apply_discounts")
            @ExcludeMissing
            trialApplyDiscounts: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            trialPeriodDays: JsonField<Int> = JsonMissing.of(),
        ) : this(
            currency,
            discount,
            paymentFrequencyCount,
            paymentFrequencyInterval,
            price,
            subscriptionPeriodCount,
            subscriptionPeriodInterval,
            type,
            purchasingPowerParity,
            taxInclusive,
            trialAmount,
            trialApplyDiscounts,
            trialPeriodDays,
            mutableMapOf(),
        )

        /**
         * The currency in which the payment is made.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Discount applied to the price, represented as a percentage (0 to 100).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discount(): Long = discount.getRequired("discount")

        /**
         * Number of units for the payment frequency. For example, a value of `1` with a
         * `payment_frequency_interval` of `month` represents monthly payments.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentFrequencyCount(): Int =
            paymentFrequencyCount.getRequired("payment_frequency_count")

        /**
         * The time interval for the payment frequency (e.g., day, month, year).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentFrequencyInterval(): TimeInterval =
            paymentFrequencyInterval.getRequired("payment_frequency_interval")

        /**
         * The payment amount. Represented in the lowest denomination of the currency (e.g., cents
         * for USD). For example, to charge $1.00, pass `100`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun price(): Int = price.getRequired("price")

        /**
         * Number of units for the subscription period. For example, a value of `12` with a
         * `subscription_period_interval` of `month` represents a one-year subscription.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionPeriodCount(): Int =
            subscriptionPeriodCount.getRequired("subscription_period_count")

        /**
         * The time interval for the subscription period (e.g., day, month, year).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionPeriodInterval(): TimeInterval =
            subscriptionPeriodInterval.getRequired("subscription_period_interval")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("recurring_price")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Opts this price in to purchasing power parity. The business must also enable purchasing
         * power parity. The discount percentage per country is always business-wide. Defaults to
         * `false`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun purchasingPowerParity(): Boolean? =
            purchasingPowerParity.getNullable("purchasing_power_parity")

        /**
         * Indicates if the price is tax inclusive
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxInclusive(): Boolean? = taxInclusive.getNullable("tax_inclusive")

        /**
         * Amount charged today for a paid trial, in the price currency's minor units. Requires
         * `trial_period_days > 0`. Omit or null for a free trial (the default).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialAmount(): Int? = trialAmount.getNullable("trial_amount")

        /**
         * Whether discount codes reduce the trial charge. Defaults to false. Only meaningful when a
         * paid trial is configured.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialApplyDiscounts(): Boolean? =
            trialApplyDiscounts.getNullable("trial_apply_discounts")

        /**
         * Number of days for the trial period. A value of `0` indicates no trial period.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialPeriodDays(): Int? = trialPeriodDays.getNullable("trial_period_days")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Long> = discount

        /**
         * Returns the raw JSON value of [paymentFrequencyCount].
         *
         * Unlike [paymentFrequencyCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_frequency_count")
        @ExcludeMissing
        fun _paymentFrequencyCount(): JsonField<Int> = paymentFrequencyCount

        /**
         * Returns the raw JSON value of [paymentFrequencyInterval].
         *
         * Unlike [paymentFrequencyInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_frequency_interval")
        @ExcludeMissing
        fun _paymentFrequencyInterval(): JsonField<TimeInterval> = paymentFrequencyInterval

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Int> = price

        /**
         * Returns the raw JSON value of [subscriptionPeriodCount].
         *
         * Unlike [subscriptionPeriodCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_period_count")
        @ExcludeMissing
        fun _subscriptionPeriodCount(): JsonField<Int> = subscriptionPeriodCount

        /**
         * Returns the raw JSON value of [subscriptionPeriodInterval].
         *
         * Unlike [subscriptionPeriodInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_period_interval")
        @ExcludeMissing
        fun _subscriptionPeriodInterval(): JsonField<TimeInterval> = subscriptionPeriodInterval

        /**
         * Returns the raw JSON value of [purchasingPowerParity].
         *
         * Unlike [purchasingPowerParity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("purchasing_power_parity")
        @ExcludeMissing
        fun _purchasingPowerParity(): JsonField<Boolean> = purchasingPowerParity

        /**
         * Returns the raw JSON value of [taxInclusive].
         *
         * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        fun _taxInclusive(): JsonField<Boolean> = taxInclusive

        /**
         * Returns the raw JSON value of [trialAmount].
         *
         * Unlike [trialAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trial_amount")
        @ExcludeMissing
        fun _trialAmount(): JsonField<Int> = trialAmount

        /**
         * Returns the raw JSON value of [trialApplyDiscounts].
         *
         * Unlike [trialApplyDiscounts], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("trial_apply_discounts")
        @ExcludeMissing
        fun _trialApplyDiscounts(): JsonField<Boolean> = trialApplyDiscounts

        /**
         * Returns the raw JSON value of [trialPeriodDays].
         *
         * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        fun _trialPeriodDays(): JsonField<Int> = trialPeriodDays

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
             * Returns a mutable builder for constructing an instance of [RecurringPrice].
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .discount()
             * .paymentFrequencyCount()
             * .paymentFrequencyInterval()
             * .price()
             * .subscriptionPeriodCount()
             * .subscriptionPeriodInterval()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RecurringPrice]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var discount: JsonField<Long>? = null
            private var paymentFrequencyCount: JsonField<Int>? = null
            private var paymentFrequencyInterval: JsonField<TimeInterval>? = null
            private var price: JsonField<Int>? = null
            private var subscriptionPeriodCount: JsonField<Int>? = null
            private var subscriptionPeriodInterval: JsonField<TimeInterval>? = null
            private var type: JsonValue = JsonValue.from("recurring_price")
            private var purchasingPowerParity: JsonField<Boolean> = JsonMissing.of()
            private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
            private var trialAmount: JsonField<Int> = JsonMissing.of()
            private var trialApplyDiscounts: JsonField<Boolean> = JsonMissing.of()
            private var trialPeriodDays: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(recurringPrice: RecurringPrice) = apply {
                currency = recurringPrice.currency
                discount = recurringPrice.discount
                paymentFrequencyCount = recurringPrice.paymentFrequencyCount
                paymentFrequencyInterval = recurringPrice.paymentFrequencyInterval
                price = recurringPrice.price
                subscriptionPeriodCount = recurringPrice.subscriptionPeriodCount
                subscriptionPeriodInterval = recurringPrice.subscriptionPeriodInterval
                type = recurringPrice.type
                purchasingPowerParity = recurringPrice.purchasingPowerParity
                taxInclusive = recurringPrice.taxInclusive
                trialAmount = recurringPrice.trialAmount
                trialApplyDiscounts = recurringPrice.trialApplyDiscounts
                trialPeriodDays = recurringPrice.trialPeriodDays
                additionalProperties = recurringPrice.additionalProperties.toMutableMap()
            }

            /** The currency in which the payment is made. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Discount applied to the price, represented as a percentage (0 to 100). */
            fun discount(discount: Long) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Long>) = apply { this.discount = discount }

            /**
             * Number of units for the payment frequency. For example, a value of `1` with a
             * `payment_frequency_interval` of `month` represents monthly payments.
             */
            fun paymentFrequencyCount(paymentFrequencyCount: Int) =
                paymentFrequencyCount(JsonField.of(paymentFrequencyCount))

            /**
             * Sets [Builder.paymentFrequencyCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentFrequencyCount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentFrequencyCount(paymentFrequencyCount: JsonField<Int>) = apply {
                this.paymentFrequencyCount = paymentFrequencyCount
            }

            /** The time interval for the payment frequency (e.g., day, month, year). */
            fun paymentFrequencyInterval(paymentFrequencyInterval: TimeInterval) =
                paymentFrequencyInterval(JsonField.of(paymentFrequencyInterval))

            /**
             * Sets [Builder.paymentFrequencyInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentFrequencyInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentFrequencyInterval(paymentFrequencyInterval: JsonField<TimeInterval>) =
                apply {
                    this.paymentFrequencyInterval = paymentFrequencyInterval
                }

            /**
             * The payment amount. Represented in the lowest denomination of the currency (e.g.,
             * cents for USD). For example, to charge $1.00, pass `100`.
             */
            fun price(price: Int) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Int>) = apply { this.price = price }

            /**
             * Number of units for the subscription period. For example, a value of `12` with a
             * `subscription_period_interval` of `month` represents a one-year subscription.
             */
            fun subscriptionPeriodCount(subscriptionPeriodCount: Int) =
                subscriptionPeriodCount(JsonField.of(subscriptionPeriodCount))

            /**
             * Sets [Builder.subscriptionPeriodCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Int>) = apply {
                this.subscriptionPeriodCount = subscriptionPeriodCount
            }

            /** The time interval for the subscription period (e.g., day, month, year). */
            fun subscriptionPeriodInterval(subscriptionPeriodInterval: TimeInterval) =
                subscriptionPeriodInterval(JsonField.of(subscriptionPeriodInterval))

            /**
             * Sets [Builder.subscriptionPeriodInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionPeriodInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun subscriptionPeriodInterval(subscriptionPeriodInterval: JsonField<TimeInterval>) =
                apply {
                    this.subscriptionPeriodInterval = subscriptionPeriodInterval
                }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("recurring_price")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            /**
             * Opts this price in to purchasing power parity. The business must also enable
             * purchasing power parity. The discount percentage per country is always business-wide.
             * Defaults to `false`.
             */
            fun purchasingPowerParity(purchasingPowerParity: Boolean) =
                purchasingPowerParity(JsonField.of(purchasingPowerParity))

            /**
             * Sets [Builder.purchasingPowerParity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchasingPowerParity] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun purchasingPowerParity(purchasingPowerParity: JsonField<Boolean>) = apply {
                this.purchasingPowerParity = purchasingPowerParity
            }

            /** Indicates if the price is tax inclusive */
            fun taxInclusive(taxInclusive: Boolean?) =
                taxInclusive(JsonField.ofNullable(taxInclusive))

            /**
             * Alias for [Builder.taxInclusive].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun taxInclusive(taxInclusive: Boolean) = taxInclusive(taxInclusive as Boolean?)

            /**
             * Sets [Builder.taxInclusive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                this.taxInclusive = taxInclusive
            }

            /**
             * Amount charged today for a paid trial, in the price currency's minor units. Requires
             * `trial_period_days > 0`. Omit or null for a free trial (the default).
             */
            fun trialAmount(trialAmount: Int?) = trialAmount(JsonField.ofNullable(trialAmount))

            /**
             * Alias for [Builder.trialAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialAmount(trialAmount: Int) = trialAmount(trialAmount as Int?)

            /**
             * Sets [Builder.trialAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialAmount] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialAmount(trialAmount: JsonField<Int>) = apply { this.trialAmount = trialAmount }

            /**
             * Whether discount codes reduce the trial charge. Defaults to false. Only meaningful
             * when a paid trial is configured.
             */
            fun trialApplyDiscounts(trialApplyDiscounts: Boolean?) =
                trialApplyDiscounts(JsonField.ofNullable(trialApplyDiscounts))

            /**
             * Alias for [Builder.trialApplyDiscounts].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialApplyDiscounts(trialApplyDiscounts: Boolean) =
                trialApplyDiscounts(trialApplyDiscounts as Boolean?)

            /**
             * Sets [Builder.trialApplyDiscounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialApplyDiscounts] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun trialApplyDiscounts(trialApplyDiscounts: JsonField<Boolean>) = apply {
                this.trialApplyDiscounts = trialApplyDiscounts
            }

            /** Number of days for the trial period. A value of `0` indicates no trial period. */
            fun trialPeriodDays(trialPeriodDays: Int) =
                trialPeriodDays(JsonField.of(trialPeriodDays))

            /**
             * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialPeriodDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialPeriodDays(trialPeriodDays: JsonField<Int>) = apply {
                this.trialPeriodDays = trialPeriodDays
            }

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
             * Returns an immutable instance of [RecurringPrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .discount()
             * .paymentFrequencyCount()
             * .paymentFrequencyInterval()
             * .price()
             * .subscriptionPeriodCount()
             * .subscriptionPeriodInterval()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RecurringPrice =
                RecurringPrice(
                    checkRequired("currency", currency),
                    checkRequired("discount", discount),
                    checkRequired("paymentFrequencyCount", paymentFrequencyCount),
                    checkRequired("paymentFrequencyInterval", paymentFrequencyInterval),
                    checkRequired("price", price),
                    checkRequired("subscriptionPeriodCount", subscriptionPeriodCount),
                    checkRequired("subscriptionPeriodInterval", subscriptionPeriodInterval),
                    type,
                    purchasingPowerParity,
                    taxInclusive,
                    trialAmount,
                    trialApplyDiscounts,
                    trialPeriodDays,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): RecurringPrice = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            discount()
            paymentFrequencyCount()
            paymentFrequencyInterval().validate()
            price()
            subscriptionPeriodCount()
            subscriptionPeriodInterval().validate()
            _type().let {
                if (it != JsonValue.from("recurring_price")) {
                    throw DodoPaymentsInvalidDataException("'type' is invalid, received $it")
                }
            }
            purchasingPowerParity()
            taxInclusive()
            trialAmount()
            trialApplyDiscounts()
            trialPeriodDays()
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
        internal fun validity(): Int =
            (currency.asKnown()?.validity() ?: 0) +
                (if (discount.asKnown() == null) 0 else 1) +
                (if (paymentFrequencyCount.asKnown() == null) 0 else 1) +
                (paymentFrequencyInterval.asKnown()?.validity() ?: 0) +
                (if (price.asKnown() == null) 0 else 1) +
                (if (subscriptionPeriodCount.asKnown() == null) 0 else 1) +
                (subscriptionPeriodInterval.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("recurring_price")) 1 else 0 } +
                (if (purchasingPowerParity.asKnown() == null) 0 else 1) +
                (if (taxInclusive.asKnown() == null) 0 else 1) +
                (if (trialAmount.asKnown() == null) 0 else 1) +
                (if (trialApplyDiscounts.asKnown() == null) 0 else 1) +
                (if (trialPeriodDays.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecurringPrice &&
                currency == other.currency &&
                discount == other.discount &&
                paymentFrequencyCount == other.paymentFrequencyCount &&
                paymentFrequencyInterval == other.paymentFrequencyInterval &&
                price == other.price &&
                subscriptionPeriodCount == other.subscriptionPeriodCount &&
                subscriptionPeriodInterval == other.subscriptionPeriodInterval &&
                type == other.type &&
                purchasingPowerParity == other.purchasingPowerParity &&
                taxInclusive == other.taxInclusive &&
                trialAmount == other.trialAmount &&
                trialApplyDiscounts == other.trialApplyDiscounts &&
                trialPeriodDays == other.trialPeriodDays &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                discount,
                paymentFrequencyCount,
                paymentFrequencyInterval,
                price,
                subscriptionPeriodCount,
                subscriptionPeriodInterval,
                type,
                purchasingPowerParity,
                taxInclusive,
                trialAmount,
                trialApplyDiscounts,
                trialPeriodDays,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringPrice{currency=$currency, discount=$discount, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, price=$price, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, type=$type, purchasingPowerParity=$purchasingPowerParity, taxInclusive=$taxInclusive, trialAmount=$trialAmount, trialApplyDiscounts=$trialApplyDiscounts, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
    }

    /** Usage Based price details. */
    class UsageBasedPrice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val discount: JsonField<Long>,
        private val fixedPrice: JsonField<Int>,
        private val paymentFrequencyCount: JsonField<Int>,
        private val paymentFrequencyInterval: JsonField<TimeInterval>,
        private val subscriptionPeriodCount: JsonField<Int>,
        private val subscriptionPeriodInterval: JsonField<TimeInterval>,
        private val type: JsonValue,
        private val meters: JsonField<List<AddMeterToPrice>>,
        private val purchasingPowerParity: JsonField<Boolean>,
        private val taxInclusive: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount") @ExcludeMissing discount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("fixed_price")
            @ExcludeMissing
            fixedPrice: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("payment_frequency_count")
            @ExcludeMissing
            paymentFrequencyCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("payment_frequency_interval")
            @ExcludeMissing
            paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("subscription_period_count")
            @ExcludeMissing
            subscriptionPeriodCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("subscription_period_interval")
            @ExcludeMissing
            subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("meters")
            @ExcludeMissing
            meters: JsonField<List<AddMeterToPrice>> = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            taxInclusive: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            currency,
            discount,
            fixedPrice,
            paymentFrequencyCount,
            paymentFrequencyInterval,
            subscriptionPeriodCount,
            subscriptionPeriodInterval,
            type,
            meters,
            purchasingPowerParity,
            taxInclusive,
            mutableMapOf(),
        )

        /**
         * The currency in which the payment is made.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Discount applied to the price, represented as a percentage (0 to 100).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discount(): Long = discount.getRequired("discount")

        /**
         * The fixed payment amount. Represented in the lowest denomination of the currency (e.g.,
         * cents for USD). For example, to charge $1.00, pass `100`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fixedPrice(): Int = fixedPrice.getRequired("fixed_price")

        /**
         * Number of units for the payment frequency. For example, a value of `1` with a
         * `payment_frequency_interval` of `month` represents monthly payments.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentFrequencyCount(): Int =
            paymentFrequencyCount.getRequired("payment_frequency_count")

        /**
         * The time interval for the payment frequency (e.g., day, month, year).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentFrequencyInterval(): TimeInterval =
            paymentFrequencyInterval.getRequired("payment_frequency_interval")

        /**
         * Number of units for the subscription period. For example, a value of `12` with a
         * `subscription_period_interval` of `month` represents a one-year subscription.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionPeriodCount(): Int =
            subscriptionPeriodCount.getRequired("subscription_period_count")

        /**
         * The time interval for the subscription period (e.g., day, month, year).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionPeriodInterval(): TimeInterval =
            subscriptionPeriodInterval.getRequired("subscription_period_interval")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("usage_based_price")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun meters(): List<AddMeterToPrice>? = meters.getNullable("meters")

        /**
         * Opts this price in to purchasing power parity. The business must also enable purchasing
         * power parity. The discount percentage per country is always business-wide. Applies to the
         * fixed fee only, never to metered usage. Defaults to `false`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun purchasingPowerParity(): Boolean? =
            purchasingPowerParity.getNullable("purchasing_power_parity")

        /**
         * Indicates if the price is tax inclusive
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxInclusive(): Boolean? = taxInclusive.getNullable("tax_inclusive")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Long> = discount

        /**
         * Returns the raw JSON value of [fixedPrice].
         *
         * Unlike [fixedPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fixed_price") @ExcludeMissing fun _fixedPrice(): JsonField<Int> = fixedPrice

        /**
         * Returns the raw JSON value of [paymentFrequencyCount].
         *
         * Unlike [paymentFrequencyCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_frequency_count")
        @ExcludeMissing
        fun _paymentFrequencyCount(): JsonField<Int> = paymentFrequencyCount

        /**
         * Returns the raw JSON value of [paymentFrequencyInterval].
         *
         * Unlike [paymentFrequencyInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_frequency_interval")
        @ExcludeMissing
        fun _paymentFrequencyInterval(): JsonField<TimeInterval> = paymentFrequencyInterval

        /**
         * Returns the raw JSON value of [subscriptionPeriodCount].
         *
         * Unlike [subscriptionPeriodCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_period_count")
        @ExcludeMissing
        fun _subscriptionPeriodCount(): JsonField<Int> = subscriptionPeriodCount

        /**
         * Returns the raw JSON value of [subscriptionPeriodInterval].
         *
         * Unlike [subscriptionPeriodInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_period_interval")
        @ExcludeMissing
        fun _subscriptionPeriodInterval(): JsonField<TimeInterval> = subscriptionPeriodInterval

        /**
         * Returns the raw JSON value of [meters].
         *
         * Unlike [meters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meters")
        @ExcludeMissing
        fun _meters(): JsonField<List<AddMeterToPrice>> = meters

        /**
         * Returns the raw JSON value of [purchasingPowerParity].
         *
         * Unlike [purchasingPowerParity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("purchasing_power_parity")
        @ExcludeMissing
        fun _purchasingPowerParity(): JsonField<Boolean> = purchasingPowerParity

        /**
         * Returns the raw JSON value of [taxInclusive].
         *
         * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        fun _taxInclusive(): JsonField<Boolean> = taxInclusive

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
             * Returns a mutable builder for constructing an instance of [UsageBasedPrice].
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .discount()
             * .fixedPrice()
             * .paymentFrequencyCount()
             * .paymentFrequencyInterval()
             * .subscriptionPeriodCount()
             * .subscriptionPeriodInterval()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UsageBasedPrice]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var discount: JsonField<Long>? = null
            private var fixedPrice: JsonField<Int>? = null
            private var paymentFrequencyCount: JsonField<Int>? = null
            private var paymentFrequencyInterval: JsonField<TimeInterval>? = null
            private var subscriptionPeriodCount: JsonField<Int>? = null
            private var subscriptionPeriodInterval: JsonField<TimeInterval>? = null
            private var type: JsonValue = JsonValue.from("usage_based_price")
            private var meters: JsonField<MutableList<AddMeterToPrice>>? = null
            private var purchasingPowerParity: JsonField<Boolean> = JsonMissing.of()
            private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(usageBasedPrice: UsageBasedPrice) = apply {
                currency = usageBasedPrice.currency
                discount = usageBasedPrice.discount
                fixedPrice = usageBasedPrice.fixedPrice
                paymentFrequencyCount = usageBasedPrice.paymentFrequencyCount
                paymentFrequencyInterval = usageBasedPrice.paymentFrequencyInterval
                subscriptionPeriodCount = usageBasedPrice.subscriptionPeriodCount
                subscriptionPeriodInterval = usageBasedPrice.subscriptionPeriodInterval
                type = usageBasedPrice.type
                meters = usageBasedPrice.meters.map { it.toMutableList() }
                purchasingPowerParity = usageBasedPrice.purchasingPowerParity
                taxInclusive = usageBasedPrice.taxInclusive
                additionalProperties = usageBasedPrice.additionalProperties.toMutableMap()
            }

            /** The currency in which the payment is made. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Discount applied to the price, represented as a percentage (0 to 100). */
            fun discount(discount: Long) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Long>) = apply { this.discount = discount }

            /**
             * The fixed payment amount. Represented in the lowest denomination of the currency
             * (e.g., cents for USD). For example, to charge $1.00, pass `100`.
             */
            fun fixedPrice(fixedPrice: Int) = fixedPrice(JsonField.of(fixedPrice))

            /**
             * Sets [Builder.fixedPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedPrice] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fixedPrice(fixedPrice: JsonField<Int>) = apply { this.fixedPrice = fixedPrice }

            /**
             * Number of units for the payment frequency. For example, a value of `1` with a
             * `payment_frequency_interval` of `month` represents monthly payments.
             */
            fun paymentFrequencyCount(paymentFrequencyCount: Int) =
                paymentFrequencyCount(JsonField.of(paymentFrequencyCount))

            /**
             * Sets [Builder.paymentFrequencyCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentFrequencyCount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentFrequencyCount(paymentFrequencyCount: JsonField<Int>) = apply {
                this.paymentFrequencyCount = paymentFrequencyCount
            }

            /** The time interval for the payment frequency (e.g., day, month, year). */
            fun paymentFrequencyInterval(paymentFrequencyInterval: TimeInterval) =
                paymentFrequencyInterval(JsonField.of(paymentFrequencyInterval))

            /**
             * Sets [Builder.paymentFrequencyInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentFrequencyInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentFrequencyInterval(paymentFrequencyInterval: JsonField<TimeInterval>) =
                apply {
                    this.paymentFrequencyInterval = paymentFrequencyInterval
                }

            /**
             * Number of units for the subscription period. For example, a value of `12` with a
             * `subscription_period_interval` of `month` represents a one-year subscription.
             */
            fun subscriptionPeriodCount(subscriptionPeriodCount: Int) =
                subscriptionPeriodCount(JsonField.of(subscriptionPeriodCount))

            /**
             * Sets [Builder.subscriptionPeriodCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Int>) = apply {
                this.subscriptionPeriodCount = subscriptionPeriodCount
            }

            /** The time interval for the subscription period (e.g., day, month, year). */
            fun subscriptionPeriodInterval(subscriptionPeriodInterval: TimeInterval) =
                subscriptionPeriodInterval(JsonField.of(subscriptionPeriodInterval))

            /**
             * Sets [Builder.subscriptionPeriodInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionPeriodInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun subscriptionPeriodInterval(subscriptionPeriodInterval: JsonField<TimeInterval>) =
                apply {
                    this.subscriptionPeriodInterval = subscriptionPeriodInterval
                }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("usage_based_price")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun meters(meters: List<AddMeterToPrice>?) = meters(JsonField.ofNullable(meters))

            /**
             * Sets [Builder.meters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meters] with a well-typed `List<AddMeterToPrice>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun meters(meters: JsonField<List<AddMeterToPrice>>) = apply {
                this.meters = meters.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddMeterToPrice] to [meters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMeter(meter: AddMeterToPrice) = apply {
                meters =
                    (meters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("meters", it).add(meter)
                    }
            }

            /**
             * Opts this price in to purchasing power parity. The business must also enable
             * purchasing power parity. The discount percentage per country is always business-wide.
             * Applies to the fixed fee only, never to metered usage. Defaults to `false`.
             */
            fun purchasingPowerParity(purchasingPowerParity: Boolean) =
                purchasingPowerParity(JsonField.of(purchasingPowerParity))

            /**
             * Sets [Builder.purchasingPowerParity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchasingPowerParity] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun purchasingPowerParity(purchasingPowerParity: JsonField<Boolean>) = apply {
                this.purchasingPowerParity = purchasingPowerParity
            }

            /** Indicates if the price is tax inclusive */
            fun taxInclusive(taxInclusive: Boolean?) =
                taxInclusive(JsonField.ofNullable(taxInclusive))

            /**
             * Alias for [Builder.taxInclusive].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun taxInclusive(taxInclusive: Boolean) = taxInclusive(taxInclusive as Boolean?)

            /**
             * Sets [Builder.taxInclusive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                this.taxInclusive = taxInclusive
            }

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
             * Returns an immutable instance of [UsageBasedPrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .discount()
             * .fixedPrice()
             * .paymentFrequencyCount()
             * .paymentFrequencyInterval()
             * .subscriptionPeriodCount()
             * .subscriptionPeriodInterval()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UsageBasedPrice =
                UsageBasedPrice(
                    checkRequired("currency", currency),
                    checkRequired("discount", discount),
                    checkRequired("fixedPrice", fixedPrice),
                    checkRequired("paymentFrequencyCount", paymentFrequencyCount),
                    checkRequired("paymentFrequencyInterval", paymentFrequencyInterval),
                    checkRequired("subscriptionPeriodCount", subscriptionPeriodCount),
                    checkRequired("subscriptionPeriodInterval", subscriptionPeriodInterval),
                    type,
                    (meters ?: JsonMissing.of()).map { it.toImmutable() },
                    purchasingPowerParity,
                    taxInclusive,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): UsageBasedPrice = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            discount()
            fixedPrice()
            paymentFrequencyCount()
            paymentFrequencyInterval().validate()
            subscriptionPeriodCount()
            subscriptionPeriodInterval().validate()
            _type().let {
                if (it != JsonValue.from("usage_based_price")) {
                    throw DodoPaymentsInvalidDataException("'type' is invalid, received $it")
                }
            }
            meters()?.forEach { it.validate() }
            purchasingPowerParity()
            taxInclusive()
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
        internal fun validity(): Int =
            (currency.asKnown()?.validity() ?: 0) +
                (if (discount.asKnown() == null) 0 else 1) +
                (if (fixedPrice.asKnown() == null) 0 else 1) +
                (if (paymentFrequencyCount.asKnown() == null) 0 else 1) +
                (paymentFrequencyInterval.asKnown()?.validity() ?: 0) +
                (if (subscriptionPeriodCount.asKnown() == null) 0 else 1) +
                (subscriptionPeriodInterval.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("usage_based_price")) 1 else 0 } +
                (meters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (purchasingPowerParity.asKnown() == null) 0 else 1) +
                (if (taxInclusive.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsageBasedPrice &&
                currency == other.currency &&
                discount == other.discount &&
                fixedPrice == other.fixedPrice &&
                paymentFrequencyCount == other.paymentFrequencyCount &&
                paymentFrequencyInterval == other.paymentFrequencyInterval &&
                subscriptionPeriodCount == other.subscriptionPeriodCount &&
                subscriptionPeriodInterval == other.subscriptionPeriodInterval &&
                type == other.type &&
                meters == other.meters &&
                purchasingPowerParity == other.purchasingPowerParity &&
                taxInclusive == other.taxInclusive &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                discount,
                fixedPrice,
                paymentFrequencyCount,
                paymentFrequencyInterval,
                subscriptionPeriodCount,
                subscriptionPeriodInterval,
                type,
                meters,
                purchasingPowerParity,
                taxInclusive,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageBasedPrice{currency=$currency, discount=$discount, fixedPrice=$fixedPrice, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, type=$type, meters=$meters, purchasingPowerParity=$purchasingPowerParity, taxInclusive=$taxInclusive, additionalProperties=$additionalProperties}"
    }
}
