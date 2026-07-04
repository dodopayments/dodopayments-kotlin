// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class CustomerRetrievePaymentMethodsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
         * Returns a mutable builder for constructing an instance of
         * [CustomerRetrievePaymentMethodsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerRetrievePaymentMethodsResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerRetrievePaymentMethodsResponse: CustomerRetrievePaymentMethodsResponse
        ) = apply {
            items = customerRetrievePaymentMethodsResponse.items.map { it.toMutableList() }
            additionalProperties =
                customerRetrievePaymentMethodsResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
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
         * Returns an immutable instance of [CustomerRetrievePaymentMethodsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerRetrievePaymentMethodsResponse =
            CustomerRetrievePaymentMethodsResponse(
                checkRequired("items", items).map { it.toImmutable() },
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
    fun validate(): CustomerRetrievePaymentMethodsResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
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
    internal fun validity(): Int = (items.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val paymentMethod: JsonField<PaymentMethod>,
        private val paymentMethodId: JsonField<String>,
        private val card: JsonField<Card>,
        private val lastUsedAt: JsonField<OffsetDateTime>,
        private val paymentMethodType: JsonField<PaymentMethodTypes>,
        private val recurringEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payment_method")
            @ExcludeMissing
            paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
            @JsonProperty("payment_method_id")
            @ExcludeMissing
            paymentMethodId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card") @ExcludeMissing card: JsonField<Card> = JsonMissing.of(),
            @JsonProperty("last_used_at")
            @ExcludeMissing
            lastUsedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payment_method_type")
            @ExcludeMissing
            paymentMethodType: JsonField<PaymentMethodTypes> = JsonMissing.of(),
            @JsonProperty("recurring_enabled")
            @ExcludeMissing
            recurringEnabled: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            paymentMethod,
            paymentMethodId,
            card,
            lastUsedAt,
            paymentMethodType,
            recurringEnabled,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentMethod(): PaymentMethod = paymentMethod.getRequired("payment_method")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentMethodId(): String = paymentMethodId.getRequired("payment_method_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun card(): Card? = card.getNullable("card")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastUsedAt(): OffsetDateTime? = lastUsedAt.getNullable("last_used_at")

        /**
         * All supported payment method types.
         *
         * Used for disabled-payment-methods filtering and validation.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentMethodType(): PaymentMethodTypes? =
            paymentMethodType.getNullable("payment_method_type")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun recurringEnabled(): Boolean? = recurringEnabled.getNullable("recurring_enabled")

        /**
         * Returns the raw JSON value of [paymentMethod].
         *
         * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method")
        @ExcludeMissing
        fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

        /**
         * Returns the raw JSON value of [paymentMethodId].
         *
         * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method_id")
        @ExcludeMissing
        fun _paymentMethodId(): JsonField<String> = paymentMethodId

        /**
         * Returns the raw JSON value of [card].
         *
         * Unlike [card], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card") @ExcludeMissing fun _card(): JsonField<Card> = card

        /**
         * Returns the raw JSON value of [lastUsedAt].
         *
         * Unlike [lastUsedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_used_at")
        @ExcludeMissing
        fun _lastUsedAt(): JsonField<OffsetDateTime> = lastUsedAt

        /**
         * Returns the raw JSON value of [paymentMethodType].
         *
         * Unlike [paymentMethodType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method_type")
        @ExcludeMissing
        fun _paymentMethodType(): JsonField<PaymentMethodTypes> = paymentMethodType

        /**
         * Returns the raw JSON value of [recurringEnabled].
         *
         * Unlike [recurringEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recurring_enabled")
        @ExcludeMissing
        fun _recurringEnabled(): JsonField<Boolean> = recurringEnabled

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```kotlin
             * .paymentMethod()
             * .paymentMethodId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var paymentMethod: JsonField<PaymentMethod>? = null
            private var paymentMethodId: JsonField<String>? = null
            private var card: JsonField<Card> = JsonMissing.of()
            private var lastUsedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var paymentMethodType: JsonField<PaymentMethodTypes> = JsonMissing.of()
            private var recurringEnabled: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(item: Item) = apply {
                paymentMethod = item.paymentMethod
                paymentMethodId = item.paymentMethodId
                card = item.card
                lastUsedAt = item.lastUsedAt
                paymentMethodType = item.paymentMethodType
                recurringEnabled = item.recurringEnabled
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            fun paymentMethod(paymentMethod: PaymentMethod) =
                paymentMethod(JsonField.of(paymentMethod))

            /**
             * Sets [Builder.paymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
                this.paymentMethod = paymentMethod
            }

            fun paymentMethodId(paymentMethodId: String) =
                paymentMethodId(JsonField.of(paymentMethodId))

            /**
             * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethodId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
                this.paymentMethodId = paymentMethodId
            }

            fun card(card: Card?) = card(JsonField.ofNullable(card))

            /**
             * Sets [Builder.card] to an arbitrary JSON value.
             *
             * You should usually call [Builder.card] with a well-typed [Card] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun card(card: JsonField<Card>) = apply { this.card = card }

            fun lastUsedAt(lastUsedAt: OffsetDateTime?) =
                lastUsedAt(JsonField.ofNullable(lastUsedAt))

            /**
             * Sets [Builder.lastUsedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastUsedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastUsedAt(lastUsedAt: JsonField<OffsetDateTime>) = apply {
                this.lastUsedAt = lastUsedAt
            }

            /**
             * All supported payment method types.
             *
             * Used for disabled-payment-methods filtering and validation.
             */
            fun paymentMethodType(paymentMethodType: PaymentMethodTypes?) =
                paymentMethodType(JsonField.ofNullable(paymentMethodType))

            /**
             * Sets [Builder.paymentMethodType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethodType] with a well-typed
             * [PaymentMethodTypes] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun paymentMethodType(paymentMethodType: JsonField<PaymentMethodTypes>) = apply {
                this.paymentMethodType = paymentMethodType
            }

            fun recurringEnabled(recurringEnabled: Boolean?) =
                recurringEnabled(JsonField.ofNullable(recurringEnabled))

            /**
             * Alias for [Builder.recurringEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun recurringEnabled(recurringEnabled: Boolean) =
                recurringEnabled(recurringEnabled as Boolean?)

            /**
             * Sets [Builder.recurringEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurringEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recurringEnabled(recurringEnabled: JsonField<Boolean>) = apply {
                this.recurringEnabled = recurringEnabled
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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .paymentMethod()
             * .paymentMethodId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("paymentMethod", paymentMethod),
                    checkRequired("paymentMethodId", paymentMethodId),
                    card,
                    lastUsedAt,
                    paymentMethodType,
                    recurringEnabled,
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
        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            paymentMethod().validate()
            paymentMethodId()
            card()?.validate()
            lastUsedAt()
            paymentMethodType()?.validate()
            recurringEnabled()
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
            (paymentMethod.asKnown()?.validity() ?: 0) +
                (if (paymentMethodId.asKnown() == null) 0 else 1) +
                (card.asKnown()?.validity() ?: 0) +
                (if (lastUsedAt.asKnown() == null) 0 else 1) +
                (paymentMethodType.asKnown()?.validity() ?: 0) +
                (if (recurringEnabled.asKnown() == null) 0 else 1)

        class PaymentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val CARD = of("card")

                val CARD_REDIRECT = of("card_redirect")

                val PAY_LATER = of("pay_later")

                val WALLET = of("wallet")

                val BANK_REDIRECT = of("bank_redirect")

                val BANK_TRANSFER = of("bank_transfer")

                val CRYPTO = of("crypto")

                val BANK_DEBIT = of("bank_debit")

                val REWARD = of("reward")

                val REAL_TIME_PAYMENT = of("real_time_payment")

                val UPI = of("upi")

                val VOUCHER = of("voucher")

                val GIFT_CARD = of("gift_card")

                val OPEN_BANKING = of("open_banking")

                val MOBILE_PAYMENT = of("mobile_payment")

                fun of(value: String) = PaymentMethod(JsonField.of(value))
            }

            /** An enum containing [PaymentMethod]'s known values. */
            enum class Known {
                CARD,
                CARD_REDIRECT,
                PAY_LATER,
                WALLET,
                BANK_REDIRECT,
                BANK_TRANSFER,
                CRYPTO,
                BANK_DEBIT,
                REWARD,
                REAL_TIME_PAYMENT,
                UPI,
                VOUCHER,
                GIFT_CARD,
                OPEN_BANKING,
                MOBILE_PAYMENT,
            }

            /**
             * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CARD,
                CARD_REDIRECT,
                PAY_LATER,
                WALLET,
                BANK_REDIRECT,
                BANK_TRANSFER,
                CRYPTO,
                BANK_DEBIT,
                REWARD,
                REAL_TIME_PAYMENT,
                UPI,
                VOUCHER,
                GIFT_CARD,
                OPEN_BANKING,
                MOBILE_PAYMENT,
                /**
                 * An enum member indicating that [PaymentMethod] was instantiated with an unknown
                 * value.
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
                    CARD -> Value.CARD
                    CARD_REDIRECT -> Value.CARD_REDIRECT
                    PAY_LATER -> Value.PAY_LATER
                    WALLET -> Value.WALLET
                    BANK_REDIRECT -> Value.BANK_REDIRECT
                    BANK_TRANSFER -> Value.BANK_TRANSFER
                    CRYPTO -> Value.CRYPTO
                    BANK_DEBIT -> Value.BANK_DEBIT
                    REWARD -> Value.REWARD
                    REAL_TIME_PAYMENT -> Value.REAL_TIME_PAYMENT
                    UPI -> Value.UPI
                    VOUCHER -> Value.VOUCHER
                    GIFT_CARD -> Value.GIFT_CARD
                    OPEN_BANKING -> Value.OPEN_BANKING
                    MOBILE_PAYMENT -> Value.MOBILE_PAYMENT
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
                    CARD -> Known.CARD
                    CARD_REDIRECT -> Known.CARD_REDIRECT
                    PAY_LATER -> Known.PAY_LATER
                    WALLET -> Known.WALLET
                    BANK_REDIRECT -> Known.BANK_REDIRECT
                    BANK_TRANSFER -> Known.BANK_TRANSFER
                    CRYPTO -> Known.CRYPTO
                    BANK_DEBIT -> Known.BANK_DEBIT
                    REWARD -> Known.REWARD
                    REAL_TIME_PAYMENT -> Known.REAL_TIME_PAYMENT
                    UPI -> Known.UPI
                    VOUCHER -> Known.VOUCHER
                    GIFT_CARD -> Known.GIFT_CARD
                    OPEN_BANKING -> Known.OPEN_BANKING
                    MOBILE_PAYMENT -> Known.MOBILE_PAYMENT
                    else -> throw DodoPaymentsInvalidDataException("Unknown PaymentMethod: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): PaymentMethod = apply {
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

                return other is PaymentMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Card
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cardHolderName: JsonField<String>,
            private val cardIssuingCountry: JsonField<CountryCode>,
            private val cardNetwork: JsonField<String>,
            private val cardType: JsonField<String>,
            private val expiryMonth: JsonField<String>,
            private val expiryYear: JsonField<String>,
            private val last4Digits: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("card_holder_name")
                @ExcludeMissing
                cardHolderName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("card_issuing_country")
                @ExcludeMissing
                cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of(),
                @JsonProperty("card_network")
                @ExcludeMissing
                cardNetwork: JsonField<String> = JsonMissing.of(),
                @JsonProperty("card_type")
                @ExcludeMissing
                cardType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_month")
                @ExcludeMissing
                expiryMonth: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expiry_year")
                @ExcludeMissing
                expiryYear: JsonField<String> = JsonMissing.of(),
                @JsonProperty("last4_digits")
                @ExcludeMissing
                last4Digits: JsonField<String> = JsonMissing.of(),
            ) : this(
                cardHolderName,
                cardIssuingCountry,
                cardNetwork,
                cardType,
                expiryMonth,
                expiryYear,
                last4Digits,
                mutableMapOf(),
            )

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardHolderName(): String? = cardHolderName.getNullable("card_holder_name")

            /**
             * ISO country code alpha2 variant
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardIssuingCountry(): CountryCode? =
                cardIssuingCountry.getNullable("card_issuing_country")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardNetwork(): String? = cardNetwork.getNullable("card_network")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cardType(): String? = cardType.getNullable("card_type")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expiryMonth(): String? = expiryMonth.getNullable("expiry_month")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expiryYear(): String? = expiryYear.getNullable("expiry_year")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun last4Digits(): String? = last4Digits.getNullable("last4_digits")

            /**
             * Returns the raw JSON value of [cardHolderName].
             *
             * Unlike [cardHolderName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("card_holder_name")
            @ExcludeMissing
            fun _cardHolderName(): JsonField<String> = cardHolderName

            /**
             * Returns the raw JSON value of [cardIssuingCountry].
             *
             * Unlike [cardIssuingCountry], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("card_issuing_country")
            @ExcludeMissing
            fun _cardIssuingCountry(): JsonField<CountryCode> = cardIssuingCountry

            /**
             * Returns the raw JSON value of [cardNetwork].
             *
             * Unlike [cardNetwork], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_network")
            @ExcludeMissing
            fun _cardNetwork(): JsonField<String> = cardNetwork

            /**
             * Returns the raw JSON value of [cardType].
             *
             * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_type") @ExcludeMissing fun _cardType(): JsonField<String> = cardType

            /**
             * Returns the raw JSON value of [expiryMonth].
             *
             * Unlike [expiryMonth], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_month")
            @ExcludeMissing
            fun _expiryMonth(): JsonField<String> = expiryMonth

            /**
             * Returns the raw JSON value of [expiryYear].
             *
             * Unlike [expiryYear], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expiry_year")
            @ExcludeMissing
            fun _expiryYear(): JsonField<String> = expiryYear

            /**
             * Returns the raw JSON value of [last4Digits].
             *
             * Unlike [last4Digits], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("last4_digits")
            @ExcludeMissing
            fun _last4Digits(): JsonField<String> = last4Digits

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

                /** Returns a mutable builder for constructing an instance of [Card]. */
                fun builder() = Builder()
            }

            /** A builder for [Card]. */
            class Builder internal constructor() {

                private var cardHolderName: JsonField<String> = JsonMissing.of()
                private var cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of()
                private var cardNetwork: JsonField<String> = JsonMissing.of()
                private var cardType: JsonField<String> = JsonMissing.of()
                private var expiryMonth: JsonField<String> = JsonMissing.of()
                private var expiryYear: JsonField<String> = JsonMissing.of()
                private var last4Digits: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(card: Card) = apply {
                    cardHolderName = card.cardHolderName
                    cardIssuingCountry = card.cardIssuingCountry
                    cardNetwork = card.cardNetwork
                    cardType = card.cardType
                    expiryMonth = card.expiryMonth
                    expiryYear = card.expiryYear
                    last4Digits = card.last4Digits
                    additionalProperties = card.additionalProperties.toMutableMap()
                }

                fun cardHolderName(cardHolderName: String?) =
                    cardHolderName(JsonField.ofNullable(cardHolderName))

                /**
                 * Sets [Builder.cardHolderName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardHolderName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardHolderName(cardHolderName: JsonField<String>) = apply {
                    this.cardHolderName = cardHolderName
                }

                /** ISO country code alpha2 variant */
                fun cardIssuingCountry(cardIssuingCountry: CountryCode?) =
                    cardIssuingCountry(JsonField.ofNullable(cardIssuingCountry))

                /**
                 * Sets [Builder.cardIssuingCountry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardIssuingCountry] with a well-typed
                 * [CountryCode] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun cardIssuingCountry(cardIssuingCountry: JsonField<CountryCode>) = apply {
                    this.cardIssuingCountry = cardIssuingCountry
                }

                fun cardNetwork(cardNetwork: String?) =
                    cardNetwork(JsonField.ofNullable(cardNetwork))

                /**
                 * Sets [Builder.cardNetwork] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardNetwork] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardNetwork(cardNetwork: JsonField<String>) = apply {
                    this.cardNetwork = cardNetwork
                }

                fun cardType(cardType: String?) = cardType(JsonField.ofNullable(cardType))

                /**
                 * Sets [Builder.cardType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardType(cardType: JsonField<String>) = apply { this.cardType = cardType }

                fun expiryMonth(expiryMonth: String?) =
                    expiryMonth(JsonField.ofNullable(expiryMonth))

                /**
                 * Sets [Builder.expiryMonth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryMonth] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expiryMonth(expiryMonth: JsonField<String>) = apply {
                    this.expiryMonth = expiryMonth
                }

                fun expiryYear(expiryYear: String?) = expiryYear(JsonField.ofNullable(expiryYear))

                /**
                 * Sets [Builder.expiryYear] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiryYear] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expiryYear(expiryYear: JsonField<String>) = apply {
                    this.expiryYear = expiryYear
                }

                fun last4Digits(last4Digits: String?) =
                    last4Digits(JsonField.ofNullable(last4Digits))

                /**
                 * Sets [Builder.last4Digits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.last4Digits] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun last4Digits(last4Digits: JsonField<String>) = apply {
                    this.last4Digits = last4Digits
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Card].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Card =
                    Card(
                        cardHolderName,
                        cardIssuingCountry,
                        cardNetwork,
                        cardType,
                        expiryMonth,
                        expiryYear,
                        last4Digits,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Card = apply {
                if (validated) {
                    return@apply
                }

                cardHolderName()
                cardIssuingCountry()?.validate()
                cardNetwork()
                cardType()
                expiryMonth()
                expiryYear()
                last4Digits()
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
                (if (cardHolderName.asKnown() == null) 0 else 1) +
                    (cardIssuingCountry.asKnown()?.validity() ?: 0) +
                    (if (cardNetwork.asKnown() == null) 0 else 1) +
                    (if (cardType.asKnown() == null) 0 else 1) +
                    (if (expiryMonth.asKnown() == null) 0 else 1) +
                    (if (expiryYear.asKnown() == null) 0 else 1) +
                    (if (last4Digits.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Card &&
                    cardHolderName == other.cardHolderName &&
                    cardIssuingCountry == other.cardIssuingCountry &&
                    cardNetwork == other.cardNetwork &&
                    cardType == other.cardType &&
                    expiryMonth == other.expiryMonth &&
                    expiryYear == other.expiryYear &&
                    last4Digits == other.last4Digits &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cardHolderName,
                    cardIssuingCountry,
                    cardNetwork,
                    cardType,
                    expiryMonth,
                    expiryYear,
                    last4Digits,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Card{cardHolderName=$cardHolderName, cardIssuingCountry=$cardIssuingCountry, cardNetwork=$cardNetwork, cardType=$cardType, expiryMonth=$expiryMonth, expiryYear=$expiryYear, last4Digits=$last4Digits, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                paymentMethod == other.paymentMethod &&
                paymentMethodId == other.paymentMethodId &&
                card == other.card &&
                lastUsedAt == other.lastUsedAt &&
                paymentMethodType == other.paymentMethodType &&
                recurringEnabled == other.recurringEnabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                paymentMethod,
                paymentMethodId,
                card,
                lastUsedAt,
                paymentMethodType,
                recurringEnabled,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{paymentMethod=$paymentMethod, paymentMethodId=$paymentMethodId, card=$card, lastUsedAt=$lastUsedAt, paymentMethodType=$paymentMethodType, recurringEnabled=$recurringEnabled, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerRetrievePaymentMethodsResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerRetrievePaymentMethodsResponse{items=$items, additionalProperties=$additionalProperties}"
}
