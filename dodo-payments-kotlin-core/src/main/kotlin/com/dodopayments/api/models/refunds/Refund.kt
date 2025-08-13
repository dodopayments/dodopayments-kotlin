// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

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

class Refund
private constructor(
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val isPartial: JsonField<Boolean>,
    private val paymentId: JsonField<String>,
    private val refundId: JsonField<String>,
    private val status: JsonField<RefundStatus>,
    private val amount: JsonField<Int>,
    private val currency: JsonField<Currency>,
    private val reason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_partial")
        @ExcludeMissing
        isPartial: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refund_id") @ExcludeMissing refundId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<RefundStatus> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
    ) : this(
        businessId,
        createdAt,
        isPartial,
        paymentId,
        refundId,
        status,
        amount,
        currency,
        reason,
        mutableMapOf(),
    )

    /**
     * The unique identifier of the business issuing the refund.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * The timestamp of when the refund was created in UTC.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * If true the refund is a partial refund
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPartial(): Boolean = isPartial.getRequired("is_partial")

    /**
     * The unique identifier of the payment associated with the refund.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * The unique identifier of the refund.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun refundId(): String = refundId.getRequired("refund_id")

    /**
     * The current status of the refund.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): RefundStatus = status.getRequired("status")

    /**
     * The refunded amount.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amount(): Int? = amount.getNullable("amount")

    /**
     * The currency of the refund, represented as an ISO 4217 currency code.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = currency.getNullable("currency")

    /**
     * The reason provided for the refund, if any. Optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

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
     * Returns the raw JSON value of [isPartial].
     *
     * Unlike [isPartial], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_partial") @ExcludeMissing fun _isPartial(): JsonField<Boolean> = isPartial

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [refundId].
     *
     * Unlike [refundId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refund_id") @ExcludeMissing fun _refundId(): JsonField<String> = refundId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<RefundStatus> = status

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Int> = amount

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
         * Returns a mutable builder for constructing an instance of [Refund].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .createdAt()
         * .isPartial()
         * .paymentId()
         * .refundId()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Refund]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isPartial: JsonField<Boolean>? = null
        private var paymentId: JsonField<String>? = null
        private var refundId: JsonField<String>? = null
        private var status: JsonField<RefundStatus>? = null
        private var amount: JsonField<Int> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(refund: Refund) = apply {
            businessId = refund.businessId
            createdAt = refund.createdAt
            isPartial = refund.isPartial
            paymentId = refund.paymentId
            refundId = refund.refundId
            status = refund.status
            amount = refund.amount
            currency = refund.currency
            reason = refund.reason
            additionalProperties = refund.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the business issuing the refund. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The timestamp of when the refund was created in UTC. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** If true the refund is a partial refund */
        fun isPartial(isPartial: Boolean) = isPartial(JsonField.of(isPartial))

        /**
         * Sets [Builder.isPartial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPartial] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPartial(isPartial: JsonField<Boolean>) = apply { this.isPartial = isPartial }

        /** The unique identifier of the payment associated with the refund. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** The unique identifier of the refund. */
        fun refundId(refundId: String) = refundId(JsonField.of(refundId))

        /**
         * Sets [Builder.refundId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun refundId(refundId: JsonField<String>) = apply { this.refundId = refundId }

        /** The current status of the refund. */
        fun status(status: RefundStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [RefundStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<RefundStatus>) = apply { this.status = status }

        /** The refunded amount. */
        fun amount(amount: Int?) = amount(JsonField.ofNullable(amount))

        /**
         * Alias for [Builder.amount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amount(amount: Int) = amount(amount as Int?)

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

        /** The currency of the refund, represented as an ISO 4217 currency code. */
        fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The reason provided for the refund, if any. Optional. */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
         * Returns an immutable instance of [Refund].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .createdAt()
         * .isPartial()
         * .paymentId()
         * .refundId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Refund =
            Refund(
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("isPartial", isPartial),
                checkRequired("paymentId", paymentId),
                checkRequired("refundId", refundId),
                checkRequired("status", status),
                amount,
                currency,
                reason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Refund = apply {
        if (validated) {
            return@apply
        }

        businessId()
        createdAt()
        isPartial()
        paymentId()
        refundId()
        status().validate()
        amount()
        currency()?.validate()
        reason()
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
        (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (isPartial.asKnown() == null) 0 else 1) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (if (refundId.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (amount.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (reason.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Refund &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            isPartial == other.isPartial &&
            paymentId == other.paymentId &&
            refundId == other.refundId &&
            status == other.status &&
            amount == other.amount &&
            currency == other.currency &&
            reason == other.reason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            businessId,
            createdAt,
            isPartial,
            paymentId,
            refundId,
            status,
            amount,
            currency,
            reason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Refund{businessId=$businessId, createdAt=$createdAt, isPartial=$isPartial, paymentId=$paymentId, refundId=$refundId, status=$status, amount=$amount, currency=$currency, reason=$reason, additionalProperties=$additionalProperties}"
}
