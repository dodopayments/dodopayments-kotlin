// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.disputes

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
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

    class DisputeStage @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val PRE_DISPUTE = of("pre_dispute")

            val DISPUTE = of("dispute")

            val PRE_ARBITRATION = of("pre_arbitration")

            fun of(value: String) = DisputeStage(JsonField.of(value))
        }

        /** An enum containing [DisputeStage]'s known values. */
        enum class Known {
            PRE_DISPUTE,
            DISPUTE,
            PRE_ARBITRATION,
        }

        /**
         * An enum containing [DisputeStage]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DisputeStage] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRE_DISPUTE,
            DISPUTE,
            PRE_ARBITRATION,
            /**
             * An enum member indicating that [DisputeStage] was instantiated with an unknown value.
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
                PRE_DISPUTE -> Value.PRE_DISPUTE
                DISPUTE -> Value.DISPUTE
                PRE_ARBITRATION -> Value.PRE_ARBITRATION
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
                PRE_DISPUTE -> Known.PRE_DISPUTE
                DISPUTE -> Known.DISPUTE
                PRE_ARBITRATION -> Known.PRE_ARBITRATION
                else -> throw DodoPaymentsInvalidDataException("Unknown DisputeStage: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DisputeStage && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class DisputeStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val DISPUTE_OPENED = of("dispute_opened")

            val DISPUTE_EXPIRED = of("dispute_expired")

            val DISPUTE_ACCEPTED = of("dispute_accepted")

            val DISPUTE_CANCELLED = of("dispute_cancelled")

            val DISPUTE_CHALLENGED = of("dispute_challenged")

            val DISPUTE_WON = of("dispute_won")

            val DISPUTE_LOST = of("dispute_lost")

            fun of(value: String) = DisputeStatus(JsonField.of(value))
        }

        /** An enum containing [DisputeStatus]'s known values. */
        enum class Known {
            DISPUTE_OPENED,
            DISPUTE_EXPIRED,
            DISPUTE_ACCEPTED,
            DISPUTE_CANCELLED,
            DISPUTE_CHALLENGED,
            DISPUTE_WON,
            DISPUTE_LOST,
        }

        /**
         * An enum containing [DisputeStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DisputeStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISPUTE_OPENED,
            DISPUTE_EXPIRED,
            DISPUTE_ACCEPTED,
            DISPUTE_CANCELLED,
            DISPUTE_CHALLENGED,
            DISPUTE_WON,
            DISPUTE_LOST,
            /**
             * An enum member indicating that [DisputeStatus] was instantiated with an unknown
             * value.
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
                DISPUTE_OPENED -> Value.DISPUTE_OPENED
                DISPUTE_EXPIRED -> Value.DISPUTE_EXPIRED
                DISPUTE_ACCEPTED -> Value.DISPUTE_ACCEPTED
                DISPUTE_CANCELLED -> Value.DISPUTE_CANCELLED
                DISPUTE_CHALLENGED -> Value.DISPUTE_CHALLENGED
                DISPUTE_WON -> Value.DISPUTE_WON
                DISPUTE_LOST -> Value.DISPUTE_LOST
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
                DISPUTE_OPENED -> Known.DISPUTE_OPENED
                DISPUTE_EXPIRED -> Known.DISPUTE_EXPIRED
                DISPUTE_ACCEPTED -> Known.DISPUTE_ACCEPTED
                DISPUTE_CANCELLED -> Known.DISPUTE_CANCELLED
                DISPUTE_CHALLENGED -> Known.DISPUTE_CHALLENGED
                DISPUTE_WON -> Known.DISPUTE_WON
                DISPUTE_LOST -> Known.DISPUTE_LOST
                else -> throw DodoPaymentsInvalidDataException("Unknown DisputeStatus: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DisputeStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
