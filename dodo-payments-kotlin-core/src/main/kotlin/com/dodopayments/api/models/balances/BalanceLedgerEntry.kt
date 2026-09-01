// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.balances

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class BalanceLedgerEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val eventType: JsonField<EventType>,
    private val isCredit: JsonField<Boolean>,
    private val usdEquivalentAmount: JsonField<Long>,
    private val afterBalance: JsonField<Long>,
    private val beforeBalance: JsonField<Long>,
    private val description: JsonField<String>,
    private val payoutId: JsonField<String>,
    private val referenceObjectId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("is_credit") @ExcludeMissing isCredit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usd_equivalent_amount")
        @ExcludeMissing
        usdEquivalentAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("after_balance")
        @ExcludeMissing
        afterBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("before_balance")
        @ExcludeMissing
        beforeBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payout_id") @ExcludeMissing payoutId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_object_id")
        @ExcludeMissing
        referenceObjectId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        businessId,
        createdAt,
        currency,
        eventType,
        isCredit,
        usdEquivalentAmount,
        afterBalance,
        beforeBalance,
        description,
        payoutId,
        referenceObjectId,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCredit(): Boolean = isCredit.getRequired("is_credit")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usdEquivalentAmount(): Long = usdEquivalentAmount.getRequired("usd_equivalent_amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun afterBalance(): Long? = afterBalance.getNullable("after_balance")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun beforeBalance(): Long? = beforeBalance.getNullable("before_balance")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun payoutId(): String? = payoutId.getNullable("payout_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun referenceObjectId(): String? = referenceObjectId.getNullable("reference_object_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [isCredit].
     *
     * Unlike [isCredit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_credit") @ExcludeMissing fun _isCredit(): JsonField<Boolean> = isCredit

    /**
     * Returns the raw JSON value of [usdEquivalentAmount].
     *
     * Unlike [usdEquivalentAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usd_equivalent_amount")
    @ExcludeMissing
    fun _usdEquivalentAmount(): JsonField<Long> = usdEquivalentAmount

    /**
     * Returns the raw JSON value of [afterBalance].
     *
     * Unlike [afterBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("after_balance")
    @ExcludeMissing
    fun _afterBalance(): JsonField<Long> = afterBalance

    /**
     * Returns the raw JSON value of [beforeBalance].
     *
     * Unlike [beforeBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("before_balance")
    @ExcludeMissing
    fun _beforeBalance(): JsonField<Long> = beforeBalance

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [payoutId].
     *
     * Unlike [payoutId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payout_id") @ExcludeMissing fun _payoutId(): JsonField<String> = payoutId

    /**
     * Returns the raw JSON value of [referenceObjectId].
     *
     * Unlike [referenceObjectId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_object_id")
    @ExcludeMissing
    fun _referenceObjectId(): JsonField<String> = referenceObjectId

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
         * Returns a mutable builder for constructing an instance of [BalanceLedgerEntry].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .businessId()
         * .createdAt()
         * .currency()
         * .eventType()
         * .isCredit()
         * .usdEquivalentAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceLedgerEntry]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var eventType: JsonField<EventType>? = null
        private var isCredit: JsonField<Boolean>? = null
        private var usdEquivalentAmount: JsonField<Long>? = null
        private var afterBalance: JsonField<Long> = JsonMissing.of()
        private var beforeBalance: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var payoutId: JsonField<String> = JsonMissing.of()
        private var referenceObjectId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceLedgerEntry: BalanceLedgerEntry) = apply {
            id = balanceLedgerEntry.id
            amount = balanceLedgerEntry.amount
            businessId = balanceLedgerEntry.businessId
            createdAt = balanceLedgerEntry.createdAt
            currency = balanceLedgerEntry.currency
            eventType = balanceLedgerEntry.eventType
            isCredit = balanceLedgerEntry.isCredit
            usdEquivalentAmount = balanceLedgerEntry.usdEquivalentAmount
            afterBalance = balanceLedgerEntry.afterBalance
            beforeBalance = balanceLedgerEntry.beforeBalance
            description = balanceLedgerEntry.description
            payoutId = balanceLedgerEntry.payoutId
            referenceObjectId = balanceLedgerEntry.referenceObjectId
            additionalProperties = balanceLedgerEntry.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun isCredit(isCredit: Boolean) = isCredit(JsonField.of(isCredit))

        /**
         * Sets [Builder.isCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCredit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCredit(isCredit: JsonField<Boolean>) = apply { this.isCredit = isCredit }

        fun usdEquivalentAmount(usdEquivalentAmount: Long) =
            usdEquivalentAmount(JsonField.of(usdEquivalentAmount))

        /**
         * Sets [Builder.usdEquivalentAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usdEquivalentAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usdEquivalentAmount(usdEquivalentAmount: JsonField<Long>) = apply {
            this.usdEquivalentAmount = usdEquivalentAmount
        }

        fun afterBalance(afterBalance: Long?) = afterBalance(JsonField.ofNullable(afterBalance))

        /**
         * Alias for [Builder.afterBalance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun afterBalance(afterBalance: Long) = afterBalance(afterBalance as Long?)

        /**
         * Sets [Builder.afterBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.afterBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun afterBalance(afterBalance: JsonField<Long>) = apply { this.afterBalance = afterBalance }

        fun beforeBalance(beforeBalance: Long?) = beforeBalance(JsonField.ofNullable(beforeBalance))

        /**
         * Alias for [Builder.beforeBalance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun beforeBalance(beforeBalance: Long) = beforeBalance(beforeBalance as Long?)

        /**
         * Sets [Builder.beforeBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beforeBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun beforeBalance(beforeBalance: JsonField<Long>) = apply {
            this.beforeBalance = beforeBalance
        }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun payoutId(payoutId: String?) = payoutId(JsonField.ofNullable(payoutId))

        /**
         * Sets [Builder.payoutId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payoutId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payoutId(payoutId: JsonField<String>) = apply { this.payoutId = payoutId }

        fun referenceObjectId(referenceObjectId: String?) =
            referenceObjectId(JsonField.ofNullable(referenceObjectId))

        /**
         * Sets [Builder.referenceObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceObjectId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceObjectId(referenceObjectId: JsonField<String>) = apply {
            this.referenceObjectId = referenceObjectId
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
         * Returns an immutable instance of [BalanceLedgerEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .businessId()
         * .createdAt()
         * .currency()
         * .eventType()
         * .isCredit()
         * .usdEquivalentAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceLedgerEntry =
            BalanceLedgerEntry(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("eventType", eventType),
                checkRequired("isCredit", isCredit),
                checkRequired("usdEquivalentAmount", usdEquivalentAmount),
                afterBalance,
                beforeBalance,
                description,
                payoutId,
                referenceObjectId,
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
    fun validate(): BalanceLedgerEntry = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        businessId()
        createdAt()
        currency().validate()
        eventType().validate()
        isCredit()
        usdEquivalentAmount()
        afterBalance()
        beforeBalance()
        description()
        payoutId()
        referenceObjectId()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (amount.asKnown() == null) 0 else 1) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (eventType.asKnown()?.validity() ?: 0) +
            (if (isCredit.asKnown() == null) 0 else 1) +
            (if (usdEquivalentAmount.asKnown() == null) 0 else 1) +
            (if (afterBalance.asKnown() == null) 0 else 1) +
            (if (beforeBalance.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (payoutId.asKnown() == null) 0 else 1) +
            (if (referenceObjectId.asKnown() == null) 0 else 1)

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PAYMENT = of("payment")

            val REFUND = of("refund")

            val REFUND_REVERSAL = of("refund_reversal")

            val DISPUTE = of("dispute")

            val DISPUTE_REVERSAL = of("dispute_reversal")

            val TAX = of("tax")

            val TAX_REVERSAL = of("tax_reversal")

            val PAYMENT_FEES = of("payment_fees")

            val REFUND_FEES = of("refund_fees")

            val REFUND_FEES_REVERSAL = of("refund_fees_reversal")

            val DISPUTE_FEES = of("dispute_fees")

            val PAYOUT = of("payout")

            val PAYOUT_FEES = of("payout_fees")

            val PAYOUT_REVERSAL = of("payout_reversal")

            val PAYOUT_FEES_REVERSAL = of("payout_fees_reversal")

            val DODO_CREDITS = of("dodo_credits")

            val ADJUSTMENT = of("adjustment")

            val CURRENCY_CONVERSION = of("currency_conversion")

            val ABANDONED_CART_RECOVERY_FEE = of("abandoned_cart_recovery_fee")

            val DUNNING_FEES = of("dunning_fees")

            val PAYMENT_RETRY_FEE = of("payment_retry_fee")

            val BYOP_FEE = of("byop_fee")

            fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            PAYMENT,
            REFUND,
            REFUND_REVERSAL,
            DISPUTE,
            DISPUTE_REVERSAL,
            TAX,
            TAX_REVERSAL,
            PAYMENT_FEES,
            REFUND_FEES,
            REFUND_FEES_REVERSAL,
            DISPUTE_FEES,
            PAYOUT,
            PAYOUT_FEES,
            PAYOUT_REVERSAL,
            PAYOUT_FEES_REVERSAL,
            DODO_CREDITS,
            ADJUSTMENT,
            CURRENCY_CONVERSION,
            ABANDONED_CART_RECOVERY_FEE,
            DUNNING_FEES,
            PAYMENT_RETRY_FEE,
            BYOP_FEE,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT,
            REFUND,
            REFUND_REVERSAL,
            DISPUTE,
            DISPUTE_REVERSAL,
            TAX,
            TAX_REVERSAL,
            PAYMENT_FEES,
            REFUND_FEES,
            REFUND_FEES_REVERSAL,
            DISPUTE_FEES,
            PAYOUT,
            PAYOUT_FEES,
            PAYOUT_REVERSAL,
            PAYOUT_FEES_REVERSAL,
            DODO_CREDITS,
            ADJUSTMENT,
            CURRENCY_CONVERSION,
            ABANDONED_CART_RECOVERY_FEE,
            DUNNING_FEES,
            PAYMENT_RETRY_FEE,
            BYOP_FEE,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                PAYMENT -> Value.PAYMENT
                REFUND -> Value.REFUND
                REFUND_REVERSAL -> Value.REFUND_REVERSAL
                DISPUTE -> Value.DISPUTE
                DISPUTE_REVERSAL -> Value.DISPUTE_REVERSAL
                TAX -> Value.TAX
                TAX_REVERSAL -> Value.TAX_REVERSAL
                PAYMENT_FEES -> Value.PAYMENT_FEES
                REFUND_FEES -> Value.REFUND_FEES
                REFUND_FEES_REVERSAL -> Value.REFUND_FEES_REVERSAL
                DISPUTE_FEES -> Value.DISPUTE_FEES
                PAYOUT -> Value.PAYOUT
                PAYOUT_FEES -> Value.PAYOUT_FEES
                PAYOUT_REVERSAL -> Value.PAYOUT_REVERSAL
                PAYOUT_FEES_REVERSAL -> Value.PAYOUT_FEES_REVERSAL
                DODO_CREDITS -> Value.DODO_CREDITS
                ADJUSTMENT -> Value.ADJUSTMENT
                CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                ABANDONED_CART_RECOVERY_FEE -> Value.ABANDONED_CART_RECOVERY_FEE
                DUNNING_FEES -> Value.DUNNING_FEES
                PAYMENT_RETRY_FEE -> Value.PAYMENT_RETRY_FEE
                BYOP_FEE -> Value.BYOP_FEE
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
                PAYMENT -> Known.PAYMENT
                REFUND -> Known.REFUND
                REFUND_REVERSAL -> Known.REFUND_REVERSAL
                DISPUTE -> Known.DISPUTE
                DISPUTE_REVERSAL -> Known.DISPUTE_REVERSAL
                TAX -> Known.TAX
                TAX_REVERSAL -> Known.TAX_REVERSAL
                PAYMENT_FEES -> Known.PAYMENT_FEES
                REFUND_FEES -> Known.REFUND_FEES
                REFUND_FEES_REVERSAL -> Known.REFUND_FEES_REVERSAL
                DISPUTE_FEES -> Known.DISPUTE_FEES
                PAYOUT -> Known.PAYOUT
                PAYOUT_FEES -> Known.PAYOUT_FEES
                PAYOUT_REVERSAL -> Known.PAYOUT_REVERSAL
                PAYOUT_FEES_REVERSAL -> Known.PAYOUT_FEES_REVERSAL
                DODO_CREDITS -> Known.DODO_CREDITS
                ADJUSTMENT -> Known.ADJUSTMENT
                CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                ABANDONED_CART_RECOVERY_FEE -> Known.ABANDONED_CART_RECOVERY_FEE
                DUNNING_FEES -> Known.DUNNING_FEES
                PAYMENT_RETRY_FEE -> Known.PAYMENT_RETRY_FEE
                BYOP_FEE -> Known.BYOP_FEE
                else -> throw DodoPaymentsInvalidDataException("Unknown EventType: $value")
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
        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceLedgerEntry &&
            id == other.id &&
            amount == other.amount &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            eventType == other.eventType &&
            isCredit == other.isCredit &&
            usdEquivalentAmount == other.usdEquivalentAmount &&
            afterBalance == other.afterBalance &&
            beforeBalance == other.beforeBalance &&
            description == other.description &&
            payoutId == other.payoutId &&
            referenceObjectId == other.referenceObjectId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            businessId,
            createdAt,
            currency,
            eventType,
            isCredit,
            usdEquivalentAmount,
            afterBalance,
            beforeBalance,
            description,
            payoutId,
            referenceObjectId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceLedgerEntry{id=$id, amount=$amount, businessId=$businessId, createdAt=$createdAt, currency=$currency, eventType=$eventType, isCredit=$isCredit, usdEquivalentAmount=$usdEquivalentAmount, afterBalance=$afterBalance, beforeBalance=$beforeBalance, description=$description, payoutId=$payoutId, referenceObjectId=$referenceObjectId, additionalProperties=$additionalProperties}"
}
