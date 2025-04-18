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
        private val discount: JsonField<Double>,
        private val price: JsonField<Long>,
        private val purchasingPowerParity: JsonField<Boolean>,
        private val type: JsonField<Type>,
        private val payWhatYouWant: JsonField<Boolean>,
        private val suggestedPrice: JsonField<Long>,
        private val taxInclusive: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount")
            @ExcludeMissing
            discount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("pay_what_you_want")
            @ExcludeMissing
            payWhatYouWant: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("suggested_price")
            @ExcludeMissing
            suggestedPrice: JsonField<Long> = JsonMissing.of(),
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
        fun discount(): Double = discount.getRequired("discount")

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
        fun price(): Long = price.getRequired("price")

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
        fun suggestedPrice(): Long? = suggestedPrice.getNullable("suggested_price")

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
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Double> = discount

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Long> = price

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
        fun _suggestedPrice(): JsonField<Long> = suggestedPrice

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
            private var discount: JsonField<Double>? = null
            private var price: JsonField<Long>? = null
            private var purchasingPowerParity: JsonField<Boolean>? = null
            private var type: JsonField<Type>? = null
            private var payWhatYouWant: JsonField<Boolean> = JsonMissing.of()
            private var suggestedPrice: JsonField<Long> = JsonMissing.of()
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
            fun discount(discount: Double) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Double>) = apply { this.discount = discount }

            /**
             * The payment amount, in the smallest denomination of the currency (e.g., cents for
             * USD). For example, to charge $1.00, pass `100`.
             *
             * If [`pay_what_you_want`](Self::pay_what_you_want) is set to `true`, this field
             * represents the **minimum** amount the customer must pay.
             */
            fun price(price: Long) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Long>) = apply { this.price = price }

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
            fun suggestedPrice(suggestedPrice: Long?) =
                suggestedPrice(JsonField.ofNullable(suggestedPrice))

            /**
             * Alias for [Builder.suggestedPrice].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun suggestedPrice(suggestedPrice: Long) = suggestedPrice(suggestedPrice as Long?)

            /**
             * Sets [Builder.suggestedPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suggestedPrice] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suggestedPrice(suggestedPrice: JsonField<Long>) = apply {
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

        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val AED = of("AED")

                val ALL = of("ALL")

                val AMD = of("AMD")

                val ANG = of("ANG")

                val AOA = of("AOA")

                val ARS = of("ARS")

                val AUD = of("AUD")

                val AWG = of("AWG")

                val AZN = of("AZN")

                val BAM = of("BAM")

                val BBD = of("BBD")

                val BDT = of("BDT")

                val BGN = of("BGN")

                val BHD = of("BHD")

                val BIF = of("BIF")

                val BMD = of("BMD")

                val BND = of("BND")

                val BOB = of("BOB")

                val BRL = of("BRL")

                val BSD = of("BSD")

                val BWP = of("BWP")

                val BYN = of("BYN")

                val BZD = of("BZD")

                val CAD = of("CAD")

                val CHF = of("CHF")

                val CLP = of("CLP")

                val CNY = of("CNY")

                val COP = of("COP")

                val CRC = of("CRC")

                val CUP = of("CUP")

                val CVE = of("CVE")

                val CZK = of("CZK")

                val DJF = of("DJF")

                val DKK = of("DKK")

                val DOP = of("DOP")

                val DZD = of("DZD")

                val EGP = of("EGP")

                val ETB = of("ETB")

                val EUR = of("EUR")

                val FJD = of("FJD")

                val FKP = of("FKP")

                val GBP = of("GBP")

                val GEL = of("GEL")

                val GHS = of("GHS")

                val GIP = of("GIP")

                val GMD = of("GMD")

                val GNF = of("GNF")

                val GTQ = of("GTQ")

                val GYD = of("GYD")

                val HKD = of("HKD")

                val HNL = of("HNL")

                val HRK = of("HRK")

                val HTG = of("HTG")

                val HUF = of("HUF")

                val IDR = of("IDR")

                val ILS = of("ILS")

                val INR = of("INR")

                val IQD = of("IQD")

                val JMD = of("JMD")

                val JOD = of("JOD")

                val JPY = of("JPY")

                val KES = of("KES")

                val KGS = of("KGS")

                val KHR = of("KHR")

                val KMF = of("KMF")

                val KRW = of("KRW")

                val KWD = of("KWD")

                val KYD = of("KYD")

                val KZT = of("KZT")

                val LAK = of("LAK")

                val LBP = of("LBP")

                val LKR = of("LKR")

                val LRD = of("LRD")

                val LSL = of("LSL")

                val LYD = of("LYD")

                val MAD = of("MAD")

                val MDL = of("MDL")

                val MGA = of("MGA")

                val MKD = of("MKD")

                val MMK = of("MMK")

                val MNT = of("MNT")

                val MOP = of("MOP")

                val MRU = of("MRU")

                val MUR = of("MUR")

                val MVR = of("MVR")

                val MWK = of("MWK")

                val MXN = of("MXN")

                val MYR = of("MYR")

                val MZN = of("MZN")

                val NAD = of("NAD")

                val NGN = of("NGN")

                val NIO = of("NIO")

                val NOK = of("NOK")

                val NPR = of("NPR")

                val NZD = of("NZD")

                val OMR = of("OMR")

                val PAB = of("PAB")

                val PEN = of("PEN")

                val PGK = of("PGK")

                val PHP = of("PHP")

                val PKR = of("PKR")

                val PLN = of("PLN")

                val PYG = of("PYG")

                val QAR = of("QAR")

                val RON = of("RON")

                val RSD = of("RSD")

                val RUB = of("RUB")

                val RWF = of("RWF")

                val SAR = of("SAR")

                val SBD = of("SBD")

                val SCR = of("SCR")

                val SEK = of("SEK")

                val SGD = of("SGD")

                val SHP = of("SHP")

                val SLE = of("SLE")

                val SLL = of("SLL")

                val SOS = of("SOS")

                val SRD = of("SRD")

                val SSP = of("SSP")

                val STN = of("STN")

                val SVC = of("SVC")

                val SZL = of("SZL")

                val THB = of("THB")

                val TND = of("TND")

                val TOP = of("TOP")

                val TRY = of("TRY")

                val TTD = of("TTD")

                val TWD = of("TWD")

                val TZS = of("TZS")

                val UAH = of("UAH")

                val UGX = of("UGX")

                val USD = of("USD")

                val UYU = of("UYU")

                val UZS = of("UZS")

                val VES = of("VES")

                val VND = of("VND")

                val VUV = of("VUV")

                val WST = of("WST")

                val XAF = of("XAF")

                val XCD = of("XCD")

                val XOF = of("XOF")

                val XPF = of("XPF")

                val YER = of("YER")

                val ZAR = of("ZAR")

                val ZMW = of("ZMW")

                fun of(value: String) = Currency(JsonField.of(value))
            }

            /** An enum containing [Currency]'s known values. */
            enum class Known {
                AED,
                ALL,
                AMD,
                ANG,
                AOA,
                ARS,
                AUD,
                AWG,
                AZN,
                BAM,
                BBD,
                BDT,
                BGN,
                BHD,
                BIF,
                BMD,
                BND,
                BOB,
                BRL,
                BSD,
                BWP,
                BYN,
                BZD,
                CAD,
                CHF,
                CLP,
                CNY,
                COP,
                CRC,
                CUP,
                CVE,
                CZK,
                DJF,
                DKK,
                DOP,
                DZD,
                EGP,
                ETB,
                EUR,
                FJD,
                FKP,
                GBP,
                GEL,
                GHS,
                GIP,
                GMD,
                GNF,
                GTQ,
                GYD,
                HKD,
                HNL,
                HRK,
                HTG,
                HUF,
                IDR,
                ILS,
                INR,
                IQD,
                JMD,
                JOD,
                JPY,
                KES,
                KGS,
                KHR,
                KMF,
                KRW,
                KWD,
                KYD,
                KZT,
                LAK,
                LBP,
                LKR,
                LRD,
                LSL,
                LYD,
                MAD,
                MDL,
                MGA,
                MKD,
                MMK,
                MNT,
                MOP,
                MRU,
                MUR,
                MVR,
                MWK,
                MXN,
                MYR,
                MZN,
                NAD,
                NGN,
                NIO,
                NOK,
                NPR,
                NZD,
                OMR,
                PAB,
                PEN,
                PGK,
                PHP,
                PKR,
                PLN,
                PYG,
                QAR,
                RON,
                RSD,
                RUB,
                RWF,
                SAR,
                SBD,
                SCR,
                SEK,
                SGD,
                SHP,
                SLE,
                SLL,
                SOS,
                SRD,
                SSP,
                STN,
                SVC,
                SZL,
                THB,
                TND,
                TOP,
                TRY,
                TTD,
                TWD,
                TZS,
                UAH,
                UGX,
                USD,
                UYU,
                UZS,
                VES,
                VND,
                VUV,
                WST,
                XAF,
                XCD,
                XOF,
                XPF,
                YER,
                ZAR,
                ZMW,
            }

            /**
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AED,
                ALL,
                AMD,
                ANG,
                AOA,
                ARS,
                AUD,
                AWG,
                AZN,
                BAM,
                BBD,
                BDT,
                BGN,
                BHD,
                BIF,
                BMD,
                BND,
                BOB,
                BRL,
                BSD,
                BWP,
                BYN,
                BZD,
                CAD,
                CHF,
                CLP,
                CNY,
                COP,
                CRC,
                CUP,
                CVE,
                CZK,
                DJF,
                DKK,
                DOP,
                DZD,
                EGP,
                ETB,
                EUR,
                FJD,
                FKP,
                GBP,
                GEL,
                GHS,
                GIP,
                GMD,
                GNF,
                GTQ,
                GYD,
                HKD,
                HNL,
                HRK,
                HTG,
                HUF,
                IDR,
                ILS,
                INR,
                IQD,
                JMD,
                JOD,
                JPY,
                KES,
                KGS,
                KHR,
                KMF,
                KRW,
                KWD,
                KYD,
                KZT,
                LAK,
                LBP,
                LKR,
                LRD,
                LSL,
                LYD,
                MAD,
                MDL,
                MGA,
                MKD,
                MMK,
                MNT,
                MOP,
                MRU,
                MUR,
                MVR,
                MWK,
                MXN,
                MYR,
                MZN,
                NAD,
                NGN,
                NIO,
                NOK,
                NPR,
                NZD,
                OMR,
                PAB,
                PEN,
                PGK,
                PHP,
                PKR,
                PLN,
                PYG,
                QAR,
                RON,
                RSD,
                RUB,
                RWF,
                SAR,
                SBD,
                SCR,
                SEK,
                SGD,
                SHP,
                SLE,
                SLL,
                SOS,
                SRD,
                SSP,
                STN,
                SVC,
                SZL,
                THB,
                TND,
                TOP,
                TRY,
                TTD,
                TWD,
                TZS,
                UAH,
                UGX,
                USD,
                UYU,
                UZS,
                VES,
                VND,
                VUV,
                WST,
                XAF,
                XCD,
                XOF,
                XPF,
                YER,
                ZAR,
                ZMW,
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
                 */
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
                    AED -> Value.AED
                    ALL -> Value.ALL
                    AMD -> Value.AMD
                    ANG -> Value.ANG
                    AOA -> Value.AOA
                    ARS -> Value.ARS
                    AUD -> Value.AUD
                    AWG -> Value.AWG
                    AZN -> Value.AZN
                    BAM -> Value.BAM
                    BBD -> Value.BBD
                    BDT -> Value.BDT
                    BGN -> Value.BGN
                    BHD -> Value.BHD
                    BIF -> Value.BIF
                    BMD -> Value.BMD
                    BND -> Value.BND
                    BOB -> Value.BOB
                    BRL -> Value.BRL
                    BSD -> Value.BSD
                    BWP -> Value.BWP
                    BYN -> Value.BYN
                    BZD -> Value.BZD
                    CAD -> Value.CAD
                    CHF -> Value.CHF
                    CLP -> Value.CLP
                    CNY -> Value.CNY
                    COP -> Value.COP
                    CRC -> Value.CRC
                    CUP -> Value.CUP
                    CVE -> Value.CVE
                    CZK -> Value.CZK
                    DJF -> Value.DJF
                    DKK -> Value.DKK
                    DOP -> Value.DOP
                    DZD -> Value.DZD
                    EGP -> Value.EGP
                    ETB -> Value.ETB
                    EUR -> Value.EUR
                    FJD -> Value.FJD
                    FKP -> Value.FKP
                    GBP -> Value.GBP
                    GEL -> Value.GEL
                    GHS -> Value.GHS
                    GIP -> Value.GIP
                    GMD -> Value.GMD
                    GNF -> Value.GNF
                    GTQ -> Value.GTQ
                    GYD -> Value.GYD
                    HKD -> Value.HKD
                    HNL -> Value.HNL
                    HRK -> Value.HRK
                    HTG -> Value.HTG
                    HUF -> Value.HUF
                    IDR -> Value.IDR
                    ILS -> Value.ILS
                    INR -> Value.INR
                    IQD -> Value.IQD
                    JMD -> Value.JMD
                    JOD -> Value.JOD
                    JPY -> Value.JPY
                    KES -> Value.KES
                    KGS -> Value.KGS
                    KHR -> Value.KHR
                    KMF -> Value.KMF
                    KRW -> Value.KRW
                    KWD -> Value.KWD
                    KYD -> Value.KYD
                    KZT -> Value.KZT
                    LAK -> Value.LAK
                    LBP -> Value.LBP
                    LKR -> Value.LKR
                    LRD -> Value.LRD
                    LSL -> Value.LSL
                    LYD -> Value.LYD
                    MAD -> Value.MAD
                    MDL -> Value.MDL
                    MGA -> Value.MGA
                    MKD -> Value.MKD
                    MMK -> Value.MMK
                    MNT -> Value.MNT
                    MOP -> Value.MOP
                    MRU -> Value.MRU
                    MUR -> Value.MUR
                    MVR -> Value.MVR
                    MWK -> Value.MWK
                    MXN -> Value.MXN
                    MYR -> Value.MYR
                    MZN -> Value.MZN
                    NAD -> Value.NAD
                    NGN -> Value.NGN
                    NIO -> Value.NIO
                    NOK -> Value.NOK
                    NPR -> Value.NPR
                    NZD -> Value.NZD
                    OMR -> Value.OMR
                    PAB -> Value.PAB
                    PEN -> Value.PEN
                    PGK -> Value.PGK
                    PHP -> Value.PHP
                    PKR -> Value.PKR
                    PLN -> Value.PLN
                    PYG -> Value.PYG
                    QAR -> Value.QAR
                    RON -> Value.RON
                    RSD -> Value.RSD
                    RUB -> Value.RUB
                    RWF -> Value.RWF
                    SAR -> Value.SAR
                    SBD -> Value.SBD
                    SCR -> Value.SCR
                    SEK -> Value.SEK
                    SGD -> Value.SGD
                    SHP -> Value.SHP
                    SLE -> Value.SLE
                    SLL -> Value.SLL
                    SOS -> Value.SOS
                    SRD -> Value.SRD
                    SSP -> Value.SSP
                    STN -> Value.STN
                    SVC -> Value.SVC
                    SZL -> Value.SZL
                    THB -> Value.THB
                    TND -> Value.TND
                    TOP -> Value.TOP
                    TRY -> Value.TRY
                    TTD -> Value.TTD
                    TWD -> Value.TWD
                    TZS -> Value.TZS
                    UAH -> Value.UAH
                    UGX -> Value.UGX
                    USD -> Value.USD
                    UYU -> Value.UYU
                    UZS -> Value.UZS
                    VES -> Value.VES
                    VND -> Value.VND
                    VUV -> Value.VUV
                    WST -> Value.WST
                    XAF -> Value.XAF
                    XCD -> Value.XCD
                    XOF -> Value.XOF
                    XPF -> Value.XPF
                    YER -> Value.YER
                    ZAR -> Value.ZAR
                    ZMW -> Value.ZMW
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
                    AED -> Known.AED
                    ALL -> Known.ALL
                    AMD -> Known.AMD
                    ANG -> Known.ANG
                    AOA -> Known.AOA
                    ARS -> Known.ARS
                    AUD -> Known.AUD
                    AWG -> Known.AWG
                    AZN -> Known.AZN
                    BAM -> Known.BAM
                    BBD -> Known.BBD
                    BDT -> Known.BDT
                    BGN -> Known.BGN
                    BHD -> Known.BHD
                    BIF -> Known.BIF
                    BMD -> Known.BMD
                    BND -> Known.BND
                    BOB -> Known.BOB
                    BRL -> Known.BRL
                    BSD -> Known.BSD
                    BWP -> Known.BWP
                    BYN -> Known.BYN
                    BZD -> Known.BZD
                    CAD -> Known.CAD
                    CHF -> Known.CHF
                    CLP -> Known.CLP
                    CNY -> Known.CNY
                    COP -> Known.COP
                    CRC -> Known.CRC
                    CUP -> Known.CUP
                    CVE -> Known.CVE
                    CZK -> Known.CZK
                    DJF -> Known.DJF
                    DKK -> Known.DKK
                    DOP -> Known.DOP
                    DZD -> Known.DZD
                    EGP -> Known.EGP
                    ETB -> Known.ETB
                    EUR -> Known.EUR
                    FJD -> Known.FJD
                    FKP -> Known.FKP
                    GBP -> Known.GBP
                    GEL -> Known.GEL
                    GHS -> Known.GHS
                    GIP -> Known.GIP
                    GMD -> Known.GMD
                    GNF -> Known.GNF
                    GTQ -> Known.GTQ
                    GYD -> Known.GYD
                    HKD -> Known.HKD
                    HNL -> Known.HNL
                    HRK -> Known.HRK
                    HTG -> Known.HTG
                    HUF -> Known.HUF
                    IDR -> Known.IDR
                    ILS -> Known.ILS
                    INR -> Known.INR
                    IQD -> Known.IQD
                    JMD -> Known.JMD
                    JOD -> Known.JOD
                    JPY -> Known.JPY
                    KES -> Known.KES
                    KGS -> Known.KGS
                    KHR -> Known.KHR
                    KMF -> Known.KMF
                    KRW -> Known.KRW
                    KWD -> Known.KWD
                    KYD -> Known.KYD
                    KZT -> Known.KZT
                    LAK -> Known.LAK
                    LBP -> Known.LBP
                    LKR -> Known.LKR
                    LRD -> Known.LRD
                    LSL -> Known.LSL
                    LYD -> Known.LYD
                    MAD -> Known.MAD
                    MDL -> Known.MDL
                    MGA -> Known.MGA
                    MKD -> Known.MKD
                    MMK -> Known.MMK
                    MNT -> Known.MNT
                    MOP -> Known.MOP
                    MRU -> Known.MRU
                    MUR -> Known.MUR
                    MVR -> Known.MVR
                    MWK -> Known.MWK
                    MXN -> Known.MXN
                    MYR -> Known.MYR
                    MZN -> Known.MZN
                    NAD -> Known.NAD
                    NGN -> Known.NGN
                    NIO -> Known.NIO
                    NOK -> Known.NOK
                    NPR -> Known.NPR
                    NZD -> Known.NZD
                    OMR -> Known.OMR
                    PAB -> Known.PAB
                    PEN -> Known.PEN
                    PGK -> Known.PGK
                    PHP -> Known.PHP
                    PKR -> Known.PKR
                    PLN -> Known.PLN
                    PYG -> Known.PYG
                    QAR -> Known.QAR
                    RON -> Known.RON
                    RSD -> Known.RSD
                    RUB -> Known.RUB
                    RWF -> Known.RWF
                    SAR -> Known.SAR
                    SBD -> Known.SBD
                    SCR -> Known.SCR
                    SEK -> Known.SEK
                    SGD -> Known.SGD
                    SHP -> Known.SHP
                    SLE -> Known.SLE
                    SLL -> Known.SLL
                    SOS -> Known.SOS
                    SRD -> Known.SRD
                    SSP -> Known.SSP
                    STN -> Known.STN
                    SVC -> Known.SVC
                    SZL -> Known.SZL
                    THB -> Known.THB
                    TND -> Known.TND
                    TOP -> Known.TOP
                    TRY -> Known.TRY
                    TTD -> Known.TTD
                    TWD -> Known.TWD
                    TZS -> Known.TZS
                    UAH -> Known.UAH
                    UGX -> Known.UGX
                    USD -> Known.USD
                    UYU -> Known.UYU
                    UZS -> Known.UZS
                    VES -> Known.VES
                    VND -> Known.VND
                    VUV -> Known.VUV
                    WST -> Known.WST
                    XAF -> Known.XAF
                    XCD -> Known.XCD
                    XOF -> Known.XOF
                    XPF -> Known.XPF
                    YER -> Known.YER
                    ZAR -> Known.ZAR
                    ZMW -> Known.ZMW
                    else -> throw DodoPaymentsInvalidDataException("Unknown Currency: $value")
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

            fun validate(): Currency = apply {
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

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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
        private val discount: JsonField<Double>,
        private val paymentFrequencyCount: JsonField<Long>,
        private val paymentFrequencyInterval: JsonField<TimeInterval>,
        private val price: JsonField<Long>,
        private val purchasingPowerParity: JsonField<Boolean>,
        private val subscriptionPeriodCount: JsonField<Long>,
        private val subscriptionPeriodInterval: JsonField<TimeInterval>,
        private val type: JsonField<Type>,
        private val taxInclusive: JsonField<Boolean>,
        private val trialPeriodDays: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount")
            @ExcludeMissing
            discount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("payment_frequency_count")
            @ExcludeMissing
            paymentFrequencyCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("payment_frequency_interval")
            @ExcludeMissing
            paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscription_period_count")
            @ExcludeMissing
            subscriptionPeriodCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("subscription_period_interval")
            @ExcludeMissing
            subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            taxInclusive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            trialPeriodDays: JsonField<Long> = JsonMissing.of(),
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
        fun discount(): Double = discount.getRequired("discount")

        /**
         * Number of units for the payment frequency. For example, a value of `1` with a
         * `payment_frequency_interval` of `month` represents monthly payments.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentFrequencyCount(): Long =
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
        fun price(): Long = price.getRequired("price")

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
        fun subscriptionPeriodCount(): Long =
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
        fun trialPeriodDays(): Long? = trialPeriodDays.getNullable("trial_period_days")

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
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Double> = discount

        /**
         * Returns the raw JSON value of [paymentFrequencyCount].
         *
         * Unlike [paymentFrequencyCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_frequency_count")
        @ExcludeMissing
        fun _paymentFrequencyCount(): JsonField<Long> = paymentFrequencyCount

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
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Long> = price

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
        fun _subscriptionPeriodCount(): JsonField<Long> = subscriptionPeriodCount

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
        fun _trialPeriodDays(): JsonField<Long> = trialPeriodDays

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
            private var discount: JsonField<Double>? = null
            private var paymentFrequencyCount: JsonField<Long>? = null
            private var paymentFrequencyInterval: JsonField<TimeInterval>? = null
            private var price: JsonField<Long>? = null
            private var purchasingPowerParity: JsonField<Boolean>? = null
            private var subscriptionPeriodCount: JsonField<Long>? = null
            private var subscriptionPeriodInterval: JsonField<TimeInterval>? = null
            private var type: JsonField<Type>? = null
            private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
            private var trialPeriodDays: JsonField<Long> = JsonMissing.of()
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
            fun discount(discount: Double) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Double>) = apply { this.discount = discount }

            /**
             * Number of units for the payment frequency. For example, a value of `1` with a
             * `payment_frequency_interval` of `month` represents monthly payments.
             */
            fun paymentFrequencyCount(paymentFrequencyCount: Long) =
                paymentFrequencyCount(JsonField.of(paymentFrequencyCount))

            /**
             * Sets [Builder.paymentFrequencyCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentFrequencyCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentFrequencyCount(paymentFrequencyCount: JsonField<Long>) = apply {
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
            fun price(price: Long) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Long>) = apply { this.price = price }

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
            fun subscriptionPeriodCount(subscriptionPeriodCount: Long) =
                subscriptionPeriodCount(JsonField.of(subscriptionPeriodCount))

            /**
             * Sets [Builder.subscriptionPeriodCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Long>) = apply {
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
            fun trialPeriodDays(trialPeriodDays: Long) =
                trialPeriodDays(JsonField.of(trialPeriodDays))

            /**
             * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialPeriodDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialPeriodDays(trialPeriodDays: JsonField<Long>) = apply {
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

        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val AED = of("AED")

                val ALL = of("ALL")

                val AMD = of("AMD")

                val ANG = of("ANG")

                val AOA = of("AOA")

                val ARS = of("ARS")

                val AUD = of("AUD")

                val AWG = of("AWG")

                val AZN = of("AZN")

                val BAM = of("BAM")

                val BBD = of("BBD")

                val BDT = of("BDT")

                val BGN = of("BGN")

                val BHD = of("BHD")

                val BIF = of("BIF")

                val BMD = of("BMD")

                val BND = of("BND")

                val BOB = of("BOB")

                val BRL = of("BRL")

                val BSD = of("BSD")

                val BWP = of("BWP")

                val BYN = of("BYN")

                val BZD = of("BZD")

                val CAD = of("CAD")

                val CHF = of("CHF")

                val CLP = of("CLP")

                val CNY = of("CNY")

                val COP = of("COP")

                val CRC = of("CRC")

                val CUP = of("CUP")

                val CVE = of("CVE")

                val CZK = of("CZK")

                val DJF = of("DJF")

                val DKK = of("DKK")

                val DOP = of("DOP")

                val DZD = of("DZD")

                val EGP = of("EGP")

                val ETB = of("ETB")

                val EUR = of("EUR")

                val FJD = of("FJD")

                val FKP = of("FKP")

                val GBP = of("GBP")

                val GEL = of("GEL")

                val GHS = of("GHS")

                val GIP = of("GIP")

                val GMD = of("GMD")

                val GNF = of("GNF")

                val GTQ = of("GTQ")

                val GYD = of("GYD")

                val HKD = of("HKD")

                val HNL = of("HNL")

                val HRK = of("HRK")

                val HTG = of("HTG")

                val HUF = of("HUF")

                val IDR = of("IDR")

                val ILS = of("ILS")

                val INR = of("INR")

                val IQD = of("IQD")

                val JMD = of("JMD")

                val JOD = of("JOD")

                val JPY = of("JPY")

                val KES = of("KES")

                val KGS = of("KGS")

                val KHR = of("KHR")

                val KMF = of("KMF")

                val KRW = of("KRW")

                val KWD = of("KWD")

                val KYD = of("KYD")

                val KZT = of("KZT")

                val LAK = of("LAK")

                val LBP = of("LBP")

                val LKR = of("LKR")

                val LRD = of("LRD")

                val LSL = of("LSL")

                val LYD = of("LYD")

                val MAD = of("MAD")

                val MDL = of("MDL")

                val MGA = of("MGA")

                val MKD = of("MKD")

                val MMK = of("MMK")

                val MNT = of("MNT")

                val MOP = of("MOP")

                val MRU = of("MRU")

                val MUR = of("MUR")

                val MVR = of("MVR")

                val MWK = of("MWK")

                val MXN = of("MXN")

                val MYR = of("MYR")

                val MZN = of("MZN")

                val NAD = of("NAD")

                val NGN = of("NGN")

                val NIO = of("NIO")

                val NOK = of("NOK")

                val NPR = of("NPR")

                val NZD = of("NZD")

                val OMR = of("OMR")

                val PAB = of("PAB")

                val PEN = of("PEN")

                val PGK = of("PGK")

                val PHP = of("PHP")

                val PKR = of("PKR")

                val PLN = of("PLN")

                val PYG = of("PYG")

                val QAR = of("QAR")

                val RON = of("RON")

                val RSD = of("RSD")

                val RUB = of("RUB")

                val RWF = of("RWF")

                val SAR = of("SAR")

                val SBD = of("SBD")

                val SCR = of("SCR")

                val SEK = of("SEK")

                val SGD = of("SGD")

                val SHP = of("SHP")

                val SLE = of("SLE")

                val SLL = of("SLL")

                val SOS = of("SOS")

                val SRD = of("SRD")

                val SSP = of("SSP")

                val STN = of("STN")

                val SVC = of("SVC")

                val SZL = of("SZL")

                val THB = of("THB")

                val TND = of("TND")

                val TOP = of("TOP")

                val TRY = of("TRY")

                val TTD = of("TTD")

                val TWD = of("TWD")

                val TZS = of("TZS")

                val UAH = of("UAH")

                val UGX = of("UGX")

                val USD = of("USD")

                val UYU = of("UYU")

                val UZS = of("UZS")

                val VES = of("VES")

                val VND = of("VND")

                val VUV = of("VUV")

                val WST = of("WST")

                val XAF = of("XAF")

                val XCD = of("XCD")

                val XOF = of("XOF")

                val XPF = of("XPF")

                val YER = of("YER")

                val ZAR = of("ZAR")

                val ZMW = of("ZMW")

                fun of(value: String) = Currency(JsonField.of(value))
            }

            /** An enum containing [Currency]'s known values. */
            enum class Known {
                AED,
                ALL,
                AMD,
                ANG,
                AOA,
                ARS,
                AUD,
                AWG,
                AZN,
                BAM,
                BBD,
                BDT,
                BGN,
                BHD,
                BIF,
                BMD,
                BND,
                BOB,
                BRL,
                BSD,
                BWP,
                BYN,
                BZD,
                CAD,
                CHF,
                CLP,
                CNY,
                COP,
                CRC,
                CUP,
                CVE,
                CZK,
                DJF,
                DKK,
                DOP,
                DZD,
                EGP,
                ETB,
                EUR,
                FJD,
                FKP,
                GBP,
                GEL,
                GHS,
                GIP,
                GMD,
                GNF,
                GTQ,
                GYD,
                HKD,
                HNL,
                HRK,
                HTG,
                HUF,
                IDR,
                ILS,
                INR,
                IQD,
                JMD,
                JOD,
                JPY,
                KES,
                KGS,
                KHR,
                KMF,
                KRW,
                KWD,
                KYD,
                KZT,
                LAK,
                LBP,
                LKR,
                LRD,
                LSL,
                LYD,
                MAD,
                MDL,
                MGA,
                MKD,
                MMK,
                MNT,
                MOP,
                MRU,
                MUR,
                MVR,
                MWK,
                MXN,
                MYR,
                MZN,
                NAD,
                NGN,
                NIO,
                NOK,
                NPR,
                NZD,
                OMR,
                PAB,
                PEN,
                PGK,
                PHP,
                PKR,
                PLN,
                PYG,
                QAR,
                RON,
                RSD,
                RUB,
                RWF,
                SAR,
                SBD,
                SCR,
                SEK,
                SGD,
                SHP,
                SLE,
                SLL,
                SOS,
                SRD,
                SSP,
                STN,
                SVC,
                SZL,
                THB,
                TND,
                TOP,
                TRY,
                TTD,
                TWD,
                TZS,
                UAH,
                UGX,
                USD,
                UYU,
                UZS,
                VES,
                VND,
                VUV,
                WST,
                XAF,
                XCD,
                XOF,
                XPF,
                YER,
                ZAR,
                ZMW,
            }

            /**
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AED,
                ALL,
                AMD,
                ANG,
                AOA,
                ARS,
                AUD,
                AWG,
                AZN,
                BAM,
                BBD,
                BDT,
                BGN,
                BHD,
                BIF,
                BMD,
                BND,
                BOB,
                BRL,
                BSD,
                BWP,
                BYN,
                BZD,
                CAD,
                CHF,
                CLP,
                CNY,
                COP,
                CRC,
                CUP,
                CVE,
                CZK,
                DJF,
                DKK,
                DOP,
                DZD,
                EGP,
                ETB,
                EUR,
                FJD,
                FKP,
                GBP,
                GEL,
                GHS,
                GIP,
                GMD,
                GNF,
                GTQ,
                GYD,
                HKD,
                HNL,
                HRK,
                HTG,
                HUF,
                IDR,
                ILS,
                INR,
                IQD,
                JMD,
                JOD,
                JPY,
                KES,
                KGS,
                KHR,
                KMF,
                KRW,
                KWD,
                KYD,
                KZT,
                LAK,
                LBP,
                LKR,
                LRD,
                LSL,
                LYD,
                MAD,
                MDL,
                MGA,
                MKD,
                MMK,
                MNT,
                MOP,
                MRU,
                MUR,
                MVR,
                MWK,
                MXN,
                MYR,
                MZN,
                NAD,
                NGN,
                NIO,
                NOK,
                NPR,
                NZD,
                OMR,
                PAB,
                PEN,
                PGK,
                PHP,
                PKR,
                PLN,
                PYG,
                QAR,
                RON,
                RSD,
                RUB,
                RWF,
                SAR,
                SBD,
                SCR,
                SEK,
                SGD,
                SHP,
                SLE,
                SLL,
                SOS,
                SRD,
                SSP,
                STN,
                SVC,
                SZL,
                THB,
                TND,
                TOP,
                TRY,
                TTD,
                TWD,
                TZS,
                UAH,
                UGX,
                USD,
                UYU,
                UZS,
                VES,
                VND,
                VUV,
                WST,
                XAF,
                XCD,
                XOF,
                XPF,
                YER,
                ZAR,
                ZMW,
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
                 */
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
                    AED -> Value.AED
                    ALL -> Value.ALL
                    AMD -> Value.AMD
                    ANG -> Value.ANG
                    AOA -> Value.AOA
                    ARS -> Value.ARS
                    AUD -> Value.AUD
                    AWG -> Value.AWG
                    AZN -> Value.AZN
                    BAM -> Value.BAM
                    BBD -> Value.BBD
                    BDT -> Value.BDT
                    BGN -> Value.BGN
                    BHD -> Value.BHD
                    BIF -> Value.BIF
                    BMD -> Value.BMD
                    BND -> Value.BND
                    BOB -> Value.BOB
                    BRL -> Value.BRL
                    BSD -> Value.BSD
                    BWP -> Value.BWP
                    BYN -> Value.BYN
                    BZD -> Value.BZD
                    CAD -> Value.CAD
                    CHF -> Value.CHF
                    CLP -> Value.CLP
                    CNY -> Value.CNY
                    COP -> Value.COP
                    CRC -> Value.CRC
                    CUP -> Value.CUP
                    CVE -> Value.CVE
                    CZK -> Value.CZK
                    DJF -> Value.DJF
                    DKK -> Value.DKK
                    DOP -> Value.DOP
                    DZD -> Value.DZD
                    EGP -> Value.EGP
                    ETB -> Value.ETB
                    EUR -> Value.EUR
                    FJD -> Value.FJD
                    FKP -> Value.FKP
                    GBP -> Value.GBP
                    GEL -> Value.GEL
                    GHS -> Value.GHS
                    GIP -> Value.GIP
                    GMD -> Value.GMD
                    GNF -> Value.GNF
                    GTQ -> Value.GTQ
                    GYD -> Value.GYD
                    HKD -> Value.HKD
                    HNL -> Value.HNL
                    HRK -> Value.HRK
                    HTG -> Value.HTG
                    HUF -> Value.HUF
                    IDR -> Value.IDR
                    ILS -> Value.ILS
                    INR -> Value.INR
                    IQD -> Value.IQD
                    JMD -> Value.JMD
                    JOD -> Value.JOD
                    JPY -> Value.JPY
                    KES -> Value.KES
                    KGS -> Value.KGS
                    KHR -> Value.KHR
                    KMF -> Value.KMF
                    KRW -> Value.KRW
                    KWD -> Value.KWD
                    KYD -> Value.KYD
                    KZT -> Value.KZT
                    LAK -> Value.LAK
                    LBP -> Value.LBP
                    LKR -> Value.LKR
                    LRD -> Value.LRD
                    LSL -> Value.LSL
                    LYD -> Value.LYD
                    MAD -> Value.MAD
                    MDL -> Value.MDL
                    MGA -> Value.MGA
                    MKD -> Value.MKD
                    MMK -> Value.MMK
                    MNT -> Value.MNT
                    MOP -> Value.MOP
                    MRU -> Value.MRU
                    MUR -> Value.MUR
                    MVR -> Value.MVR
                    MWK -> Value.MWK
                    MXN -> Value.MXN
                    MYR -> Value.MYR
                    MZN -> Value.MZN
                    NAD -> Value.NAD
                    NGN -> Value.NGN
                    NIO -> Value.NIO
                    NOK -> Value.NOK
                    NPR -> Value.NPR
                    NZD -> Value.NZD
                    OMR -> Value.OMR
                    PAB -> Value.PAB
                    PEN -> Value.PEN
                    PGK -> Value.PGK
                    PHP -> Value.PHP
                    PKR -> Value.PKR
                    PLN -> Value.PLN
                    PYG -> Value.PYG
                    QAR -> Value.QAR
                    RON -> Value.RON
                    RSD -> Value.RSD
                    RUB -> Value.RUB
                    RWF -> Value.RWF
                    SAR -> Value.SAR
                    SBD -> Value.SBD
                    SCR -> Value.SCR
                    SEK -> Value.SEK
                    SGD -> Value.SGD
                    SHP -> Value.SHP
                    SLE -> Value.SLE
                    SLL -> Value.SLL
                    SOS -> Value.SOS
                    SRD -> Value.SRD
                    SSP -> Value.SSP
                    STN -> Value.STN
                    SVC -> Value.SVC
                    SZL -> Value.SZL
                    THB -> Value.THB
                    TND -> Value.TND
                    TOP -> Value.TOP
                    TRY -> Value.TRY
                    TTD -> Value.TTD
                    TWD -> Value.TWD
                    TZS -> Value.TZS
                    UAH -> Value.UAH
                    UGX -> Value.UGX
                    USD -> Value.USD
                    UYU -> Value.UYU
                    UZS -> Value.UZS
                    VES -> Value.VES
                    VND -> Value.VND
                    VUV -> Value.VUV
                    WST -> Value.WST
                    XAF -> Value.XAF
                    XCD -> Value.XCD
                    XOF -> Value.XOF
                    XPF -> Value.XPF
                    YER -> Value.YER
                    ZAR -> Value.ZAR
                    ZMW -> Value.ZMW
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
                    AED -> Known.AED
                    ALL -> Known.ALL
                    AMD -> Known.AMD
                    ANG -> Known.ANG
                    AOA -> Known.AOA
                    ARS -> Known.ARS
                    AUD -> Known.AUD
                    AWG -> Known.AWG
                    AZN -> Known.AZN
                    BAM -> Known.BAM
                    BBD -> Known.BBD
                    BDT -> Known.BDT
                    BGN -> Known.BGN
                    BHD -> Known.BHD
                    BIF -> Known.BIF
                    BMD -> Known.BMD
                    BND -> Known.BND
                    BOB -> Known.BOB
                    BRL -> Known.BRL
                    BSD -> Known.BSD
                    BWP -> Known.BWP
                    BYN -> Known.BYN
                    BZD -> Known.BZD
                    CAD -> Known.CAD
                    CHF -> Known.CHF
                    CLP -> Known.CLP
                    CNY -> Known.CNY
                    COP -> Known.COP
                    CRC -> Known.CRC
                    CUP -> Known.CUP
                    CVE -> Known.CVE
                    CZK -> Known.CZK
                    DJF -> Known.DJF
                    DKK -> Known.DKK
                    DOP -> Known.DOP
                    DZD -> Known.DZD
                    EGP -> Known.EGP
                    ETB -> Known.ETB
                    EUR -> Known.EUR
                    FJD -> Known.FJD
                    FKP -> Known.FKP
                    GBP -> Known.GBP
                    GEL -> Known.GEL
                    GHS -> Known.GHS
                    GIP -> Known.GIP
                    GMD -> Known.GMD
                    GNF -> Known.GNF
                    GTQ -> Known.GTQ
                    GYD -> Known.GYD
                    HKD -> Known.HKD
                    HNL -> Known.HNL
                    HRK -> Known.HRK
                    HTG -> Known.HTG
                    HUF -> Known.HUF
                    IDR -> Known.IDR
                    ILS -> Known.ILS
                    INR -> Known.INR
                    IQD -> Known.IQD
                    JMD -> Known.JMD
                    JOD -> Known.JOD
                    JPY -> Known.JPY
                    KES -> Known.KES
                    KGS -> Known.KGS
                    KHR -> Known.KHR
                    KMF -> Known.KMF
                    KRW -> Known.KRW
                    KWD -> Known.KWD
                    KYD -> Known.KYD
                    KZT -> Known.KZT
                    LAK -> Known.LAK
                    LBP -> Known.LBP
                    LKR -> Known.LKR
                    LRD -> Known.LRD
                    LSL -> Known.LSL
                    LYD -> Known.LYD
                    MAD -> Known.MAD
                    MDL -> Known.MDL
                    MGA -> Known.MGA
                    MKD -> Known.MKD
                    MMK -> Known.MMK
                    MNT -> Known.MNT
                    MOP -> Known.MOP
                    MRU -> Known.MRU
                    MUR -> Known.MUR
                    MVR -> Known.MVR
                    MWK -> Known.MWK
                    MXN -> Known.MXN
                    MYR -> Known.MYR
                    MZN -> Known.MZN
                    NAD -> Known.NAD
                    NGN -> Known.NGN
                    NIO -> Known.NIO
                    NOK -> Known.NOK
                    NPR -> Known.NPR
                    NZD -> Known.NZD
                    OMR -> Known.OMR
                    PAB -> Known.PAB
                    PEN -> Known.PEN
                    PGK -> Known.PGK
                    PHP -> Known.PHP
                    PKR -> Known.PKR
                    PLN -> Known.PLN
                    PYG -> Known.PYG
                    QAR -> Known.QAR
                    RON -> Known.RON
                    RSD -> Known.RSD
                    RUB -> Known.RUB
                    RWF -> Known.RWF
                    SAR -> Known.SAR
                    SBD -> Known.SBD
                    SCR -> Known.SCR
                    SEK -> Known.SEK
                    SGD -> Known.SGD
                    SHP -> Known.SHP
                    SLE -> Known.SLE
                    SLL -> Known.SLL
                    SOS -> Known.SOS
                    SRD -> Known.SRD
                    SSP -> Known.SSP
                    STN -> Known.STN
                    SVC -> Known.SVC
                    SZL -> Known.SZL
                    THB -> Known.THB
                    TND -> Known.TND
                    TOP -> Known.TOP
                    TRY -> Known.TRY
                    TTD -> Known.TTD
                    TWD -> Known.TWD
                    TZS -> Known.TZS
                    UAH -> Known.UAH
                    UGX -> Known.UGX
                    USD -> Known.USD
                    UYU -> Known.UYU
                    UZS -> Known.UZS
                    VES -> Known.VES
                    VND -> Known.VND
                    VUV -> Known.VUV
                    WST -> Known.WST
                    XAF -> Known.XAF
                    XCD -> Known.XCD
                    XOF -> Known.XOF
                    XPF -> Known.XPF
                    YER -> Known.YER
                    ZAR -> Known.ZAR
                    ZMW -> Known.ZMW
                    else -> throw DodoPaymentsInvalidDataException("Unknown Currency: $value")
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

            fun validate(): Currency = apply {
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

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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
