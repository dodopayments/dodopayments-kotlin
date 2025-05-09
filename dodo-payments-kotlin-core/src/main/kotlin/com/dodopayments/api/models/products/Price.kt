// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
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

@JsonDeserialize(using = Price.Deserializer::class)
@JsonSerialize(using = Price.Serializer::class)
class Price
private constructor(
    private val oneTime: OneTimePrice? = null,
    private val recurring: RecurringPrice? = null,
    private val _json: JsonValue? = null,
) {

    fun oneTime(): OneTimePrice? = oneTime

    fun recurring(): RecurringPrice? = recurring

    fun isOneTime(): Boolean = oneTime != null

    fun isRecurring(): Boolean = recurring != null

    fun asOneTime(): OneTimePrice = oneTime.getOrThrow("oneTime")

    fun asRecurring(): RecurringPrice = recurring.getOrThrow("recurring")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            oneTime != null -> visitor.visitOneTime(oneTime)
            recurring != null -> visitor.visitRecurring(recurring)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

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

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Price && oneTime == other.oneTime && recurring == other.recurring /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(oneTime, recurring) /* spotless:on */

    override fun toString(): String =
        when {
            oneTime != null -> "Price{oneTime=$oneTime}"
            recurring != null -> "Price{recurring=$recurring}"
            _json != null -> "Price{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Price")
        }

    companion object {

        fun ofOneTime(oneTime: OneTimePrice) = Price(oneTime = oneTime)

        fun ofRecurring(recurring: RecurringPrice) = Price(recurring = recurring)
    }

    /** An interface that defines how to map each variant of [Price] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitOneTime(oneTime: OneTimePrice): T

        fun visitRecurring(recurring: RecurringPrice): T

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
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Price")
            }
        }
    }

    class OneTimePrice
    private constructor(
        private val currency: JsonField<Currency>,
        private val discount: JsonField<Float>,
        private val price: JsonField<Int>,
        private val purchasingPowerParity: JsonField<Boolean>,
        private val type: JsonField<Type>,
        private val payWhatYouWant: JsonField<Boolean>,
        private val suggestedPrice: JsonField<Int>,
        private val taxInclusive: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount") @ExcludeMissing discount: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("pay_what_you_want")
            @ExcludeMissing
            payWhatYouWant: JsonField<Boolean> = JsonMissing.of(),
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
            purchasingPowerParity,
            type,
            payWhatYouWant,
            suggestedPrice,
            taxInclusive,
            mutableMapOf(),
        )

        /**
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
        fun discount(): Float = discount.getRequired("discount")

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
         * Indicates if purchasing power parity adjustments are applied to the price. Purchasing
         * power parity feature is not available as of now.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun purchasingPowerParity(): Boolean =
            purchasingPowerParity.getRequired("purchasing_power_parity")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Indicates whether the customer can pay any amount they choose. If set to `true`, the
         * [`price`](Self::price) field is the minimum amount.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun payWhatYouWant(): Boolean? = payWhatYouWant.getNullable("pay_what_you_want")

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
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Float> = discount

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Int> = price

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * .purchasingPowerParity()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [OneTimePrice]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var discount: JsonField<Float>? = null
            private var price: JsonField<Int>? = null
            private var purchasingPowerParity: JsonField<Boolean>? = null
            private var type: JsonField<Type>? = null
            private var payWhatYouWant: JsonField<Boolean> = JsonMissing.of()
            private var suggestedPrice: JsonField<Int> = JsonMissing.of()
            private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(oneTimePrice: OneTimePrice) = apply {
                currency = oneTimePrice.currency
                discount = oneTimePrice.discount
                price = oneTimePrice.price
                purchasingPowerParity = oneTimePrice.purchasingPowerParity
                type = oneTimePrice.type
                payWhatYouWant = oneTimePrice.payWhatYouWant
                suggestedPrice = oneTimePrice.suggestedPrice
                taxInclusive = oneTimePrice.taxInclusive
                additionalProperties = oneTimePrice.additionalProperties.toMutableMap()
            }

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
            fun discount(discount: Float) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Float>) = apply { this.discount = discount }

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
             * Indicates if purchasing power parity adjustments are applied to the price. Purchasing
             * power parity feature is not available as of now.
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

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * .purchasingPowerParity()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OneTimePrice =
                OneTimePrice(
                    checkRequired("currency", currency),
                    checkRequired("discount", discount),
                    checkRequired("price", price),
                    checkRequired("purchasingPowerParity", purchasingPowerParity),
                    checkRequired("type", type),
                    payWhatYouWant,
                    suggestedPrice,
                    taxInclusive,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OneTimePrice = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            discount()
            price()
            purchasingPowerParity()
            type().validate()
            payWhatYouWant()
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
                (if (purchasingPowerParity.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (payWhatYouWant.asKnown() == null) 0 else 1) +
                (if (suggestedPrice.asKnown() == null) 0 else 1) +
                (if (taxInclusive.asKnown() == null) 0 else 1)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ONE_TIME_PRICE = of("one_time_price")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ONE_TIME_PRICE
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ONE_TIME_PRICE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ONE_TIME_PRICE -> Value.ONE_TIME_PRICE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ONE_TIME_PRICE -> Known.ONE_TIME_PRICE
                    else -> throw DodoPaymentsInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw DodoPaymentsInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OneTimePrice && currency == other.currency && discount == other.discount && price == other.price && purchasingPowerParity == other.purchasingPowerParity && type == other.type && payWhatYouWant == other.payWhatYouWant && suggestedPrice == other.suggestedPrice && taxInclusive == other.taxInclusive && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currency, discount, price, purchasingPowerParity, type, payWhatYouWant, suggestedPrice, taxInclusive, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OneTimePrice{currency=$currency, discount=$discount, price=$price, purchasingPowerParity=$purchasingPowerParity, type=$type, payWhatYouWant=$payWhatYouWant, suggestedPrice=$suggestedPrice, taxInclusive=$taxInclusive, additionalProperties=$additionalProperties}"
    }

    class RecurringPrice
    private constructor(
        private val currency: JsonField<Currency>,
        private val discount: JsonField<Float>,
        private val paymentFrequencyCount: JsonField<Int>,
        private val paymentFrequencyInterval: JsonField<TimeInterval>,
        private val price: JsonField<Int>,
        private val purchasingPowerParity: JsonField<Boolean>,
        private val subscriptionPeriodCount: JsonField<Int>,
        private val subscriptionPeriodInterval: JsonField<TimeInterval>,
        private val type: JsonField<Type>,
        private val taxInclusive: JsonField<Boolean>,
        private val trialPeriodDays: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount") @ExcludeMissing discount: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("payment_frequency_count")
            @ExcludeMissing
            paymentFrequencyCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("payment_frequency_interval")
            @ExcludeMissing
            paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscription_period_count")
            @ExcludeMissing
            subscriptionPeriodCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("subscription_period_interval")
            @ExcludeMissing
            subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            taxInclusive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            trialPeriodDays: JsonField<Int> = JsonMissing.of(),
        ) : this(
            currency,
            discount,
            paymentFrequencyCount,
            paymentFrequencyInterval,
            price,
            purchasingPowerParity,
            subscriptionPeriodCount,
            subscriptionPeriodInterval,
            type,
            taxInclusive,
            trialPeriodDays,
            mutableMapOf(),
        )

        /**
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
        fun discount(): Float = discount.getRequired("discount")

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
         * Indicates if purchasing power parity adjustments are applied to the price. Purchasing
         * power parity feature is not available as of now
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun purchasingPowerParity(): Boolean =
            purchasingPowerParity.getRequired("purchasing_power_parity")

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
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionPeriodInterval(): TimeInterval =
            subscriptionPeriodInterval.getRequired("subscription_period_interval")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Indicates if the price is tax inclusive
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxInclusive(): Boolean? = taxInclusive.getNullable("tax_inclusive")

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
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Float> = discount

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
         * Returns the raw JSON value of [purchasingPowerParity].
         *
         * Unlike [purchasingPowerParity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("purchasing_power_parity")
        @ExcludeMissing
        fun _purchasingPowerParity(): JsonField<Boolean> = purchasingPowerParity

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
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * .purchasingPowerParity()
             * .subscriptionPeriodCount()
             * .subscriptionPeriodInterval()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RecurringPrice]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var discount: JsonField<Float>? = null
            private var paymentFrequencyCount: JsonField<Int>? = null
            private var paymentFrequencyInterval: JsonField<TimeInterval>? = null
            private var price: JsonField<Int>? = null
            private var purchasingPowerParity: JsonField<Boolean>? = null
            private var subscriptionPeriodCount: JsonField<Int>? = null
            private var subscriptionPeriodInterval: JsonField<TimeInterval>? = null
            private var type: JsonField<Type>? = null
            private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
            private var trialPeriodDays: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(recurringPrice: RecurringPrice) = apply {
                currency = recurringPrice.currency
                discount = recurringPrice.discount
                paymentFrequencyCount = recurringPrice.paymentFrequencyCount
                paymentFrequencyInterval = recurringPrice.paymentFrequencyInterval
                price = recurringPrice.price
                purchasingPowerParity = recurringPrice.purchasingPowerParity
                subscriptionPeriodCount = recurringPrice.subscriptionPeriodCount
                subscriptionPeriodInterval = recurringPrice.subscriptionPeriodInterval
                type = recurringPrice.type
                taxInclusive = recurringPrice.taxInclusive
                trialPeriodDays = recurringPrice.trialPeriodDays
                additionalProperties = recurringPrice.additionalProperties.toMutableMap()
            }

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
            fun discount(discount: Float) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Float>) = apply { this.discount = discount }

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
             * Indicates if purchasing power parity adjustments are applied to the price. Purchasing
             * power parity feature is not available as of now
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

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * .purchasingPowerParity()
             * .subscriptionPeriodCount()
             * .subscriptionPeriodInterval()
             * .type()
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
                    checkRequired("purchasingPowerParity", purchasingPowerParity),
                    checkRequired("subscriptionPeriodCount", subscriptionPeriodCount),
                    checkRequired("subscriptionPeriodInterval", subscriptionPeriodInterval),
                    checkRequired("type", type),
                    taxInclusive,
                    trialPeriodDays,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RecurringPrice = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            discount()
            paymentFrequencyCount()
            paymentFrequencyInterval().validate()
            price()
            purchasingPowerParity()
            subscriptionPeriodCount()
            subscriptionPeriodInterval().validate()
            type().validate()
            taxInclusive()
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
                (if (purchasingPowerParity.asKnown() == null) 0 else 1) +
                (if (subscriptionPeriodCount.asKnown() == null) 0 else 1) +
                (subscriptionPeriodInterval.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0) +
                (if (taxInclusive.asKnown() == null) 0 else 1) +
                (if (trialPeriodDays.asKnown() == null) 0 else 1)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val RECURRING_PRICE = of("recurring_price")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                RECURRING_PRICE
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RECURRING_PRICE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    RECURRING_PRICE -> Value.RECURRING_PRICE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    RECURRING_PRICE -> Known.RECURRING_PRICE
                    else -> throw DodoPaymentsInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw DodoPaymentsInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RecurringPrice && currency == other.currency && discount == other.discount && paymentFrequencyCount == other.paymentFrequencyCount && paymentFrequencyInterval == other.paymentFrequencyInterval && price == other.price && purchasingPowerParity == other.purchasingPowerParity && subscriptionPeriodCount == other.subscriptionPeriodCount && subscriptionPeriodInterval == other.subscriptionPeriodInterval && type == other.type && taxInclusive == other.taxInclusive && trialPeriodDays == other.trialPeriodDays && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currency, discount, paymentFrequencyCount, paymentFrequencyInterval, price, purchasingPowerParity, subscriptionPeriodCount, subscriptionPeriodInterval, type, taxInclusive, trialPeriodDays, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringPrice{currency=$currency, discount=$discount, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, price=$price, purchasingPowerParity=$purchasingPowerParity, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, type=$type, taxInclusive=$taxInclusive, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
    }
}
