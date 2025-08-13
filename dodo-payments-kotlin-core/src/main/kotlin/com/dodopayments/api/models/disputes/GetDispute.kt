// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class GetDispute
private constructor(
    private val amount: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val customer: JsonField<CustomerLimitedDetails>,
    private val disputeId: JsonField<String>,
    private val disputeStage: JsonField<DisputeStage>,
    private val disputeStatus: JsonField<DisputeStatus>,
    private val paymentId: JsonField<String>,
    private val reason: JsonField<String>,
    private val remarks: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
        @JsonProperty("dispute_id") @ExcludeMissing disputeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dispute_stage")
        @ExcludeMissing
        disputeStage: JsonField<DisputeStage> = JsonMissing.of(),
        @JsonProperty("dispute_status")
        @ExcludeMissing
        disputeStatus: JsonField<DisputeStatus> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remarks") @ExcludeMissing remarks: JsonField<String> = JsonMissing.of(),
    ) : this(
        amount,
        businessId,
        createdAt,
        currency,
        customer,
        disputeId,
        disputeStage,
        disputeStatus,
        paymentId,
        reason,
        remarks,
        mutableMapOf(),
    )

    /**
     * The amount involved in the dispute, represented as a string to accommodate precision.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * The unique identifier of the business involved in the dispute.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * The timestamp of when the dispute was created, in UTC.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The currency of the disputed amount, represented as an ISO 4217 currency code.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The customer who filed the dispute
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    /**
     * The unique identifier of the dispute.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputeId(): String = disputeId.getRequired("dispute_id")

    /**
     * The current stage of the dispute process.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputeStage(): DisputeStage = disputeStage.getRequired("dispute_stage")

    /**
     * The current status of the dispute.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputeStatus(): DisputeStatus = disputeStatus.getRequired("dispute_status")

    /**
     * The unique identifier of the payment associated with the dispute.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * Reason for the dispute
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * Remarks
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
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

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
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerLimitedDetails> = customer

    /**
     * Returns the raw JSON value of [disputeId].
     *
     * Unlike [disputeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dispute_id") @ExcludeMissing fun _disputeId(): JsonField<String> = disputeId

    /**
     * Returns the raw JSON value of [disputeStage].
     *
     * Unlike [disputeStage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dispute_stage")
    @ExcludeMissing
    fun _disputeStage(): JsonField<DisputeStage> = disputeStage

    /**
     * Returns the raw JSON value of [disputeStatus].
     *
     * Unlike [disputeStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dispute_status")
    @ExcludeMissing
    fun _disputeStatus(): JsonField<DisputeStatus> = disputeStatus

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
         * Returns a mutable builder for constructing an instance of [GetDispute].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .businessId()
         * .createdAt()
         * .currency()
         * .customer()
         * .disputeId()
         * .disputeStage()
         * .disputeStatus()
         * .paymentId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [GetDispute]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var disputeId: JsonField<String>? = null
        private var disputeStage: JsonField<DisputeStage>? = null
        private var disputeStatus: JsonField<DisputeStatus>? = null
        private var paymentId: JsonField<String>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var remarks: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(getDispute: GetDispute) = apply {
            amount = getDispute.amount
            businessId = getDispute.businessId
            createdAt = getDispute.createdAt
            currency = getDispute.currency
            customer = getDispute.customer
            disputeId = getDispute.disputeId
            disputeStage = getDispute.disputeStage
            disputeStatus = getDispute.disputeStatus
            paymentId = getDispute.paymentId
            reason = getDispute.reason
            remarks = getDispute.remarks
            additionalProperties = getDispute.additionalProperties.toMutableMap()
        }

        /** The amount involved in the dispute, represented as a string to accommodate precision. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The unique identifier of the business involved in the dispute. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The timestamp of when the dispute was created, in UTC. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the disputed amount, represented as an ISO 4217 currency code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The customer who filed the dispute */
        fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [CustomerLimitedDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
            this.customer = customer
        }

        /** The unique identifier of the dispute. */
        fun disputeId(disputeId: String) = disputeId(JsonField.of(disputeId))

        /**
         * Sets [Builder.disputeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disputeId(disputeId: JsonField<String>) = apply { this.disputeId = disputeId }

        /** The current stage of the dispute process. */
        fun disputeStage(disputeStage: DisputeStage) = disputeStage(JsonField.of(disputeStage))

        /**
         * Sets [Builder.disputeStage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputeStage] with a well-typed [DisputeStage] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disputeStage(disputeStage: JsonField<DisputeStage>) = apply {
            this.disputeStage = disputeStage
        }

        /** The current status of the dispute. */
        fun disputeStatus(disputeStatus: DisputeStatus) = disputeStatus(JsonField.of(disputeStatus))

        /**
         * Sets [Builder.disputeStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputeStatus] with a well-typed [DisputeStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disputeStatus(disputeStatus: JsonField<DisputeStatus>) = apply {
            this.disputeStatus = disputeStatus
        }

        /** The unique identifier of the payment associated with the dispute. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** Reason for the dispute */
        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Remarks */
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
         * Returns an immutable instance of [GetDispute].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .businessId()
         * .createdAt()
         * .currency()
         * .customer()
         * .disputeId()
         * .disputeStage()
         * .disputeStatus()
         * .paymentId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GetDispute =
            GetDispute(
                checkRequired("amount", amount),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("disputeId", disputeId),
                checkRequired("disputeStage", disputeStage),
                checkRequired("disputeStatus", disputeStatus),
                checkRequired("paymentId", paymentId),
                reason,
                remarks,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GetDispute = apply {
        if (validated) {
            return@apply
        }

        amount()
        businessId()
        createdAt()
        currency()
        customer().validate()
        disputeId()
        disputeStage().validate()
        disputeStatus().validate()
        paymentId()
        reason()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (currency.asKnown() == null) 0 else 1) +
            (customer.asKnown()?.validity() ?: 0) +
            (if (disputeId.asKnown() == null) 0 else 1) +
            (disputeStage.asKnown()?.validity() ?: 0) +
            (disputeStatus.asKnown()?.validity() ?: 0) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (if (reason.asKnown() == null) 0 else 1) +
            (if (remarks.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GetDispute &&
            amount == other.amount &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            customer == other.customer &&
            disputeId == other.disputeId &&
            disputeStage == other.disputeStage &&
            disputeStatus == other.disputeStatus &&
            paymentId == other.paymentId &&
            reason == other.reason &&
            remarks == other.remarks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            businessId,
            createdAt,
            currency,
            customer,
            disputeId,
            disputeStage,
            disputeStatus,
            paymentId,
            reason,
            remarks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GetDispute{amount=$amount, businessId=$businessId, createdAt=$createdAt, currency=$currency, customer=$customer, disputeId=$disputeId, disputeStage=$disputeStage, disputeStatus=$disputeStatus, paymentId=$paymentId, reason=$reason, remarks=$remarks, additionalProperties=$additionalProperties}"
}
