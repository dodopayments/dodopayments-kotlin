// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

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

class ManualRetry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val invoiceId: JsonField<String>,
    private val isManualRetry: JsonField<Boolean>,
    private val paymentId: JsonField<String>,
    private val retryAttempt: JsonField<Int>,
    private val sendsAllowed: JsonField<Long>,
    private val sendsUsed: JsonField<Long>,
    private val retryAvailableAt: JsonField<OffsetDateTime>,
    private val status: JsonField<IntentStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_manual_retry")
        @ExcludeMissing
        isManualRetry: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retry_attempt")
        @ExcludeMissing
        retryAttempt: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sends_allowed")
        @ExcludeMissing
        sendsAllowed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sends_used") @ExcludeMissing sendsUsed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("retry_available_at")
        @ExcludeMissing
        retryAvailableAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<IntentStatus> = JsonMissing.of(),
    ) : this(
        invoiceId,
        isManualRetry,
        paymentId,
        retryAttempt,
        sendsAllowed,
        sendsUsed,
        retryAvailableAt,
        status,
        mutableMapOf(),
    )

    /**
     * The invoice the send charged.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceId(): String = invoiceId.getRequired("invoice_id")

    /**
     * Always true on this route. Tells the row apart from an automatic attempt.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isManualRetry(): Boolean = isManualRetry.getRequired("is_manual_retry")

    /**
     * The payment row this send created.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * Which attempt this send is, counting manual sends on the invoice.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retryAttempt(): Int = retryAttempt.getRequired("retry_attempt")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendsAllowed(): Long = sendsAllowed.getRequired("sends_allowed")

    /**
     * Manual sends spent on this invoice, including this one.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sendsUsed(): Long = sendsUsed.getRequired("sends_used")

    /**
     * When the next send becomes available. Null when no send is left.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun retryAvailableAt(): OffsetDateTime? = retryAvailableAt.getNullable("retry_available_at")

    /**
     * Outcome of the charge. `processing` means the processor has not settled it yet, and the
     * payment webhooks report the result.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): IntentStatus? = status.getNullable("status")

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [isManualRetry].
     *
     * Unlike [isManualRetry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_manual_retry")
    @ExcludeMissing
    fun _isManualRetry(): JsonField<Boolean> = isManualRetry

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [retryAttempt].
     *
     * Unlike [retryAttempt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_attempt")
    @ExcludeMissing
    fun _retryAttempt(): JsonField<Int> = retryAttempt

    /**
     * Returns the raw JSON value of [sendsAllowed].
     *
     * Unlike [sendsAllowed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sends_allowed")
    @ExcludeMissing
    fun _sendsAllowed(): JsonField<Long> = sendsAllowed

    /**
     * Returns the raw JSON value of [sendsUsed].
     *
     * Unlike [sendsUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sends_used") @ExcludeMissing fun _sendsUsed(): JsonField<Long> = sendsUsed

    /**
     * Returns the raw JSON value of [retryAvailableAt].
     *
     * Unlike [retryAvailableAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("retry_available_at")
    @ExcludeMissing
    fun _retryAvailableAt(): JsonField<OffsetDateTime> = retryAvailableAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IntentStatus> = status

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
         * Returns a mutable builder for constructing an instance of [ManualRetry].
         *
         * The following fields are required:
         * ```kotlin
         * .invoiceId()
         * .isManualRetry()
         * .paymentId()
         * .retryAttempt()
         * .sendsAllowed()
         * .sendsUsed()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ManualRetry]. */
    class Builder internal constructor() {

        private var invoiceId: JsonField<String>? = null
        private var isManualRetry: JsonField<Boolean>? = null
        private var paymentId: JsonField<String>? = null
        private var retryAttempt: JsonField<Int>? = null
        private var sendsAllowed: JsonField<Long>? = null
        private var sendsUsed: JsonField<Long>? = null
        private var retryAvailableAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<IntentStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(manualRetry: ManualRetry) = apply {
            invoiceId = manualRetry.invoiceId
            isManualRetry = manualRetry.isManualRetry
            paymentId = manualRetry.paymentId
            retryAttempt = manualRetry.retryAttempt
            sendsAllowed = manualRetry.sendsAllowed
            sendsUsed = manualRetry.sendsUsed
            retryAvailableAt = manualRetry.retryAvailableAt
            status = manualRetry.status
            additionalProperties = manualRetry.additionalProperties.toMutableMap()
        }

        /** The invoice the send charged. */
        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /** Always true on this route. Tells the row apart from an automatic attempt. */
        fun isManualRetry(isManualRetry: Boolean) = isManualRetry(JsonField.of(isManualRetry))

        /**
         * Sets [Builder.isManualRetry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isManualRetry] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isManualRetry(isManualRetry: JsonField<Boolean>) = apply {
            this.isManualRetry = isManualRetry
        }

        /** The payment row this send created. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** Which attempt this send is, counting manual sends on the invoice. */
        fun retryAttempt(retryAttempt: Int) = retryAttempt(JsonField.of(retryAttempt))

        /**
         * Sets [Builder.retryAttempt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryAttempt] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retryAttempt(retryAttempt: JsonField<Int>) = apply { this.retryAttempt = retryAttempt }

        fun sendsAllowed(sendsAllowed: Long) = sendsAllowed(JsonField.of(sendsAllowed))

        /**
         * Sets [Builder.sendsAllowed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendsAllowed] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sendsAllowed(sendsAllowed: JsonField<Long>) = apply { this.sendsAllowed = sendsAllowed }

        /** Manual sends spent on this invoice, including this one. */
        fun sendsUsed(sendsUsed: Long) = sendsUsed(JsonField.of(sendsUsed))

        /**
         * Sets [Builder.sendsUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendsUsed] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sendsUsed(sendsUsed: JsonField<Long>) = apply { this.sendsUsed = sendsUsed }

        /** When the next send becomes available. Null when no send is left. */
        fun retryAvailableAt(retryAvailableAt: OffsetDateTime?) =
            retryAvailableAt(JsonField.ofNullable(retryAvailableAt))

        /**
         * Sets [Builder.retryAvailableAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryAvailableAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun retryAvailableAt(retryAvailableAt: JsonField<OffsetDateTime>) = apply {
            this.retryAvailableAt = retryAvailableAt
        }

        /**
         * Outcome of the charge. `processing` means the processor has not settled it yet, and the
         * payment webhooks report the result.
         */
        fun status(status: IntentStatus?) = status(JsonField.ofNullable(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [IntentStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<IntentStatus>) = apply { this.status = status }

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
         * Returns an immutable instance of [ManualRetry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .invoiceId()
         * .isManualRetry()
         * .paymentId()
         * .retryAttempt()
         * .sendsAllowed()
         * .sendsUsed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ManualRetry =
            ManualRetry(
                checkRequired("invoiceId", invoiceId),
                checkRequired("isManualRetry", isManualRetry),
                checkRequired("paymentId", paymentId),
                checkRequired("retryAttempt", retryAttempt),
                checkRequired("sendsAllowed", sendsAllowed),
                checkRequired("sendsUsed", sendsUsed),
                retryAvailableAt,
                status,
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
    fun validate(): ManualRetry = apply {
        if (validated) {
            return@apply
        }

        invoiceId()
        isManualRetry()
        paymentId()
        retryAttempt()
        sendsAllowed()
        sendsUsed()
        retryAvailableAt()
        status()?.validate()
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
        (if (invoiceId.asKnown() == null) 0 else 1) +
            (if (isManualRetry.asKnown() == null) 0 else 1) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (if (retryAttempt.asKnown() == null) 0 else 1) +
            (if (sendsAllowed.asKnown() == null) 0 else 1) +
            (if (sendsUsed.asKnown() == null) 0 else 1) +
            (if (retryAvailableAt.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManualRetry &&
            invoiceId == other.invoiceId &&
            isManualRetry == other.isManualRetry &&
            paymentId == other.paymentId &&
            retryAttempt == other.retryAttempt &&
            sendsAllowed == other.sendsAllowed &&
            sendsUsed == other.sendsUsed &&
            retryAvailableAt == other.retryAvailableAt &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            invoiceId,
            isManualRetry,
            paymentId,
            retryAttempt,
            sendsAllowed,
            sendsUsed,
            retryAvailableAt,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ManualRetry{invoiceId=$invoiceId, isManualRetry=$isManualRetry, paymentId=$paymentId, retryAttempt=$retryAttempt, sendsAllowed=$sendsAllowed, sendsUsed=$sendsUsed, retryAvailableAt=$retryAvailableAt, status=$status, additionalProperties=$additionalProperties}"
}
