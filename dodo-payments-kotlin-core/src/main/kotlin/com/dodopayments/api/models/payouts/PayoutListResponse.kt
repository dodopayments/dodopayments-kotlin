// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts

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

class PayoutListResponse
private constructor(
    private val amount: JsonField<Long>,
    private val businessId: JsonField<String>,
    private val chargebacks: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val fee: JsonField<Long>,
    private val paymentMethod: JsonField<String>,
    private val payoutId: JsonField<String>,
    private val refunds: JsonField<Long>,
    private val status: JsonField<Status>,
    private val tax: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val payoutDocumentUrl: JsonField<String>,
    private val remarks: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chargebacks")
        @ExcludeMissing
        chargebacks: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("fee") @ExcludeMissing fee: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payout_id") @ExcludeMissing payoutId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refunds") @ExcludeMissing refunds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing tax: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payout_document_url")
        @ExcludeMissing
        payoutDocumentUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remarks") @ExcludeMissing remarks: JsonField<String> = JsonMissing.of(),
    ) : this(
        amount,
        businessId,
        chargebacks,
        createdAt,
        currency,
        fee,
        paymentMethod,
        payoutId,
        refunds,
        status,
        tax,
        updatedAt,
        name,
        payoutDocumentUrl,
        remarks,
        mutableMapOf(),
    )

    /**
     * The total amount of the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The unique identifier of the business associated with the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * The total value of chargebacks associated with the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chargebacks(): Long = chargebacks.getRequired("chargebacks")

    /**
     * The timestamp when the payout was created, in UTC.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The currency of the payout, represented as an ISO 4217 currency code.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The fee charged for processing the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fee(): Long = fee.getRequired("fee")

    /**
     * The payment method used for the payout (e.g., bank transfer, card, etc.).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentMethod(): String = paymentMethod.getRequired("payment_method")

    /**
     * The unique identifier of the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payoutId(): String = payoutId.getRequired("payout_id")

    /**
     * The total value of refunds associated with the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun refunds(): Long = refunds.getRequired("refunds")

    /**
     * The current status of the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The tax applied to the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tax(): Long = tax.getRequired("tax")

    /**
     * The timestamp when the payout was last updated, in UTC.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * The name of the payout recipient or purpose.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * The URL of the document associated with the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun payoutDocumentUrl(): String? = payoutDocumentUrl.getNullable("payout_document_url")

    /**
     * Any additional remarks or notes associated with the payout.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remarks(): String? = remarks.getNullable("remarks")

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
     * Returns the raw JSON value of [chargebacks].
     *
     * Unlike [chargebacks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chargebacks") @ExcludeMissing fun _chargebacks(): JsonField<Long> = chargebacks

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
     * Returns the raw JSON value of [fee].
     *
     * Unlike [fee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee") @ExcludeMissing fun _fee(): JsonField<Long> = fee

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<String> = paymentMethod

    /**
     * Returns the raw JSON value of [payoutId].
     *
     * Unlike [payoutId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payout_id") @ExcludeMissing fun _payoutId(): JsonField<String> = payoutId

    /**
     * Returns the raw JSON value of [refunds].
     *
     * Unlike [refunds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refunds") @ExcludeMissing fun _refunds(): JsonField<Long> = refunds

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tax].
     *
     * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Long> = tax

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [payoutDocumentUrl].
     *
     * Unlike [payoutDocumentUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payout_document_url")
    @ExcludeMissing
    fun _payoutDocumentUrl(): JsonField<String> = payoutDocumentUrl

    /**
     * Returns the raw JSON value of [remarks].
     *
     * Unlike [remarks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remarks") @ExcludeMissing fun _remarks(): JsonField<String> = remarks

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
         * Returns a mutable builder for constructing an instance of [PayoutListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .businessId()
         * .chargebacks()
         * .createdAt()
         * .currency()
         * .fee()
         * .paymentMethod()
         * .payoutId()
         * .refunds()
         * .status()
         * .tax()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PayoutListResponse]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var businessId: JsonField<String>? = null
        private var chargebacks: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var fee: JsonField<Long>? = null
        private var paymentMethod: JsonField<String>? = null
        private var payoutId: JsonField<String>? = null
        private var refunds: JsonField<Long>? = null
        private var status: JsonField<Status>? = null
        private var tax: JsonField<Long>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var payoutDocumentUrl: JsonField<String> = JsonMissing.of()
        private var remarks: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payoutListResponse: PayoutListResponse) = apply {
            amount = payoutListResponse.amount
            businessId = payoutListResponse.businessId
            chargebacks = payoutListResponse.chargebacks
            createdAt = payoutListResponse.createdAt
            currency = payoutListResponse.currency
            fee = payoutListResponse.fee
            paymentMethod = payoutListResponse.paymentMethod
            payoutId = payoutListResponse.payoutId
            refunds = payoutListResponse.refunds
            status = payoutListResponse.status
            tax = payoutListResponse.tax
            updatedAt = payoutListResponse.updatedAt
            name = payoutListResponse.name
            payoutDocumentUrl = payoutListResponse.payoutDocumentUrl
            remarks = payoutListResponse.remarks
            additionalProperties = payoutListResponse.additionalProperties.toMutableMap()
        }

        /** The total amount of the payout. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The unique identifier of the business associated with the payout. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The total value of chargebacks associated with the payout. */
        fun chargebacks(chargebacks: Long) = chargebacks(JsonField.of(chargebacks))

        /**
         * Sets [Builder.chargebacks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargebacks] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chargebacks(chargebacks: JsonField<Long>) = apply { this.chargebacks = chargebacks }

        /** The timestamp when the payout was created, in UTC. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the payout, represented as an ISO 4217 currency code. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The fee charged for processing the payout. */
        fun fee(fee: Long) = fee(JsonField.of(fee))

        /**
         * Sets [Builder.fee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fee] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fee(fee: JsonField<Long>) = apply { this.fee = fee }

        /** The payment method used for the payout (e.g., bank transfer, card, etc.). */
        fun paymentMethod(paymentMethod: String) = paymentMethod(JsonField.of(paymentMethod))

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentMethod(paymentMethod: JsonField<String>) = apply {
            this.paymentMethod = paymentMethod
        }

        /** The unique identifier of the payout. */
        fun payoutId(payoutId: String) = payoutId(JsonField.of(payoutId))

        /**
         * Sets [Builder.payoutId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payoutId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payoutId(payoutId: JsonField<String>) = apply { this.payoutId = payoutId }

        /** The total value of refunds associated with the payout. */
        fun refunds(refunds: Long) = refunds(JsonField.of(refunds))

        /**
         * Sets [Builder.refunds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refunds] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refunds(refunds: JsonField<Long>) = apply { this.refunds = refunds }

        /** The current status of the payout. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The tax applied to the payout. */
        fun tax(tax: Long) = tax(JsonField.of(tax))

        /**
         * Sets [Builder.tax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tax] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tax(tax: JsonField<Long>) = apply { this.tax = tax }

        /** The timestamp when the payout was last updated, in UTC. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The name of the payout recipient or purpose. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The URL of the document associated with the payout. */
        fun payoutDocumentUrl(payoutDocumentUrl: String?) =
            payoutDocumentUrl(JsonField.ofNullable(payoutDocumentUrl))

        /**
         * Sets [Builder.payoutDocumentUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payoutDocumentUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payoutDocumentUrl(payoutDocumentUrl: JsonField<String>) = apply {
            this.payoutDocumentUrl = payoutDocumentUrl
        }

        /** Any additional remarks or notes associated with the payout. */
        fun remarks(remarks: String?) = remarks(JsonField.ofNullable(remarks))

        /**
         * Sets [Builder.remarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remarks] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun remarks(remarks: JsonField<String>) = apply { this.remarks = remarks }

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
         * Returns an immutable instance of [PayoutListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .businessId()
         * .chargebacks()
         * .createdAt()
         * .currency()
         * .fee()
         * .paymentMethod()
         * .payoutId()
         * .refunds()
         * .status()
         * .tax()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PayoutListResponse =
            PayoutListResponse(
                checkRequired("amount", amount),
                checkRequired("businessId", businessId),
                checkRequired("chargebacks", chargebacks),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("fee", fee),
                checkRequired("paymentMethod", paymentMethod),
                checkRequired("payoutId", payoutId),
                checkRequired("refunds", refunds),
                checkRequired("status", status),
                checkRequired("tax", tax),
                checkRequired("updatedAt", updatedAt),
                name,
                payoutDocumentUrl,
                remarks,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PayoutListResponse = apply {
        if (validated) {
            return@apply
        }

        amount()
        businessId()
        chargebacks()
        createdAt()
        currency().validate()
        fee()
        paymentMethod()
        payoutId()
        refunds()
        status().validate()
        tax()
        updatedAt()
        name()
        payoutDocumentUrl()
        remarks()
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
            (if (chargebacks.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (fee.asKnown() == null) 0 else 1) +
            (if (paymentMethod.asKnown() == null) 0 else 1) +
            (if (payoutId.asKnown() == null) 0 else 1) +
            (if (refunds.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (tax.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (payoutDocumentUrl.asKnown() == null) 0 else 1) +
            (if (remarks.asKnown() == null) 0 else 1)

    /** The current status of the payout. */
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

            val NOT_INITIATED = of("not_initiated")

            val IN_PROGRESS = of("in_progress")

            val ON_HOLD = of("on_hold")

            val FAILED = of("failed")

            val SUCCESS = of("success")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            NOT_INITIATED,
            IN_PROGRESS,
            ON_HOLD,
            FAILED,
            SUCCESS,
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
            NOT_INITIATED,
            IN_PROGRESS,
            ON_HOLD,
            FAILED,
            SUCCESS,
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
                NOT_INITIATED -> Value.NOT_INITIATED
                IN_PROGRESS -> Value.IN_PROGRESS
                ON_HOLD -> Value.ON_HOLD
                FAILED -> Value.FAILED
                SUCCESS -> Value.SUCCESS
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
                NOT_INITIATED -> Known.NOT_INITIATED
                IN_PROGRESS -> Known.IN_PROGRESS
                ON_HOLD -> Known.ON_HOLD
                FAILED -> Known.FAILED
                SUCCESS -> Known.SUCCESS
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayoutListResponse && amount == other.amount && businessId == other.businessId && chargebacks == other.chargebacks && createdAt == other.createdAt && currency == other.currency && fee == other.fee && paymentMethod == other.paymentMethod && payoutId == other.payoutId && refunds == other.refunds && status == other.status && tax == other.tax && updatedAt == other.updatedAt && name == other.name && payoutDocumentUrl == other.payoutDocumentUrl && remarks == other.remarks && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, businessId, chargebacks, createdAt, currency, fee, paymentMethod, payoutId, refunds, status, tax, updatedAt, name, payoutDocumentUrl, remarks, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayoutListResponse{amount=$amount, businessId=$businessId, chargebacks=$chargebacks, createdAt=$createdAt, currency=$currency, fee=$fee, paymentMethod=$paymentMethod, payoutId=$payoutId, refunds=$refunds, status=$status, tax=$tax, updatedAt=$updatedAt, name=$name, payoutDocumentUrl=$payoutDocumentUrl, remarks=$remarks, additionalProperties=$additionalProperties}"
}
