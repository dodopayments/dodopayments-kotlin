// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.disputes

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Dispute
@JsonCreator
private constructor(
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("business_id")
    @ExcludeMissing
    private val businessId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dispute_id")
    @ExcludeMissing
    private val disputeId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dispute_stage")
    @ExcludeMissing
    private val disputeStage: JsonField<DisputeStage> = JsonMissing.of(),
    @JsonProperty("dispute_status")
    @ExcludeMissing
    private val disputeStatus: JsonField<DisputeStatus> = JsonMissing.of(),
    @JsonProperty("payment_id")
    @ExcludeMissing
    private val paymentId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The amount involved in the dispute, represented as a string to accommodate precision. */
    fun amount(): String = amount.getRequired("amount")

    /** The unique identifier of the business involved in the dispute. */
    fun businessId(): String = businessId.getRequired("business_id")

    /** The timestamp of when the dispute was created, in UTC. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The currency of the disputed amount, represented as an ISO 4217 currency code. */
    fun currency(): String = currency.getRequired("currency")

    /** The unique identifier of the dispute. */
    fun disputeId(): String = disputeId.getRequired("dispute_id")

    fun disputeStage(): DisputeStage = disputeStage.getRequired("dispute_stage")

    fun disputeStatus(): DisputeStatus = disputeStatus.getRequired("dispute_status")

    /** The unique identifier of the payment associated with the dispute. */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /** The amount involved in the dispute, represented as a string to accommodate precision. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /** The unique identifier of the business involved in the dispute. */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /** The timestamp of when the dispute was created, in UTC. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The currency of the disputed amount, represented as an ISO 4217 currency code. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** The unique identifier of the dispute. */
    @JsonProperty("dispute_id") @ExcludeMissing fun _disputeId(): JsonField<String> = disputeId

    @JsonProperty("dispute_stage")
    @ExcludeMissing
    fun _disputeStage(): JsonField<DisputeStage> = disputeStage

    @JsonProperty("dispute_status")
    @ExcludeMissing
    fun _disputeStatus(): JsonField<DisputeStatus> = disputeStatus

    /** The unique identifier of the payment associated with the dispute. */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Dispute = apply {
        if (validated) {
            return@apply
        }

        amount()
        businessId()
        createdAt()
        currency()
        disputeId()
        disputeStage()
        disputeStatus()
        paymentId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Dispute].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .businessId()
         * .createdAt()
         * .currency()
         * .disputeId()
         * .disputeStage()
         * .disputeStatus()
         * .paymentId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Dispute]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var disputeId: JsonField<String>? = null
        private var disputeStage: JsonField<DisputeStage>? = null
        private var disputeStatus: JsonField<DisputeStatus>? = null
        private var paymentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(dispute: Dispute) = apply {
            amount = dispute.amount
            businessId = dispute.businessId
            createdAt = dispute.createdAt
            currency = dispute.currency
            disputeId = dispute.disputeId
            disputeStage = dispute.disputeStage
            disputeStatus = dispute.disputeStatus
            paymentId = dispute.paymentId
            additionalProperties = dispute.additionalProperties.toMutableMap()
        }

        /** The amount involved in the dispute, represented as a string to accommodate precision. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The amount involved in the dispute, represented as a string to accommodate precision. */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The unique identifier of the business involved in the dispute. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /** The unique identifier of the business involved in the dispute. */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The timestamp of when the dispute was created, in UTC. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The timestamp of when the dispute was created, in UTC. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the disputed amount, represented as an ISO 4217 currency code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency of the disputed amount, represented as an ISO 4217 currency code. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The unique identifier of the dispute. */
        fun disputeId(disputeId: String) = disputeId(JsonField.of(disputeId))

        /** The unique identifier of the dispute. */
        fun disputeId(disputeId: JsonField<String>) = apply { this.disputeId = disputeId }

        fun disputeStage(disputeStage: DisputeStage) = disputeStage(JsonField.of(disputeStage))

        fun disputeStage(disputeStage: JsonField<DisputeStage>) = apply {
            this.disputeStage = disputeStage
        }

        fun disputeStatus(disputeStatus: DisputeStatus) = disputeStatus(JsonField.of(disputeStatus))

        fun disputeStatus(disputeStatus: JsonField<DisputeStatus>) = apply {
            this.disputeStatus = disputeStatus
        }

        /** The unique identifier of the payment associated with the dispute. */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /** The unique identifier of the payment associated with the dispute. */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

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

        fun build(): Dispute =
            Dispute(
                checkRequired("amount", amount),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("disputeId", disputeId),
                checkRequired("disputeStage", disputeStage),
                checkRequired("disputeStatus", disputeStatus),
                checkRequired("paymentId", paymentId),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Dispute && amount == other.amount && businessId == other.businessId && createdAt == other.createdAt && currency == other.currency && disputeId == other.disputeId && disputeStage == other.disputeStage && disputeStatus == other.disputeStatus && paymentId == other.paymentId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, businessId, createdAt, currency, disputeId, disputeStage, disputeStatus, paymentId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Dispute{amount=$amount, businessId=$businessId, createdAt=$createdAt, currency=$currency, disputeId=$disputeId, disputeStage=$disputeStage, disputeStatus=$disputeStatus, paymentId=$paymentId, additionalProperties=$additionalProperties}"
}
