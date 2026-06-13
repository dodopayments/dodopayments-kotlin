// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.Enum
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

class DisputeListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val disputeId: JsonField<String>,
    private val disputeStage: JsonField<DisputeStage>,
    private val disputeStatus: JsonField<DisputeStatus>,
    private val paymentId: JsonField<String>,
    private val paymentProvider: JsonField<PaymentProvider>,
    private val isResolvedByRdr: JsonField<Boolean>,
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
        @JsonProperty("dispute_id") @ExcludeMissing disputeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dispute_stage")
        @ExcludeMissing
        disputeStage: JsonField<DisputeStage> = JsonMissing.of(),
        @JsonProperty("dispute_status")
        @ExcludeMissing
        disputeStatus: JsonField<DisputeStatus> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_provider")
        @ExcludeMissing
        paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
        @JsonProperty("is_resolved_by_rdr")
        @ExcludeMissing
        isResolvedByRdr: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        amount,
        businessId,
        createdAt,
        currency,
        disputeId,
        disputeStage,
        disputeStatus,
        paymentId,
        paymentProvider,
        isResolvedByRdr,
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
     * Which processor handled the underlying payment. `stripe` / `adyen` for BYOP routes (the
     * merchant's own payment connector); `dodo` for everything Dodo processed itself.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentProvider(): PaymentProvider = paymentProvider.getRequired("payment_provider")

    /**
     * Whether the dispute was resolved by Rapid Dispute Resolution
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isResolvedByRdr(): Boolean? = isResolvedByRdr.getNullable("is_resolved_by_rdr")

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
     * Returns the raw JSON value of [paymentProvider].
     *
     * Unlike [paymentProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_provider")
    @ExcludeMissing
    fun _paymentProvider(): JsonField<PaymentProvider> = paymentProvider

    /**
     * Returns the raw JSON value of [isResolvedByRdr].
     *
     * Unlike [isResolvedByRdr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_resolved_by_rdr")
    @ExcludeMissing
    fun _isResolvedByRdr(): JsonField<Boolean> = isResolvedByRdr

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
         * Returns a mutable builder for constructing an instance of [DisputeListResponse].
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
         * .paymentProvider()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DisputeListResponse]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var disputeId: JsonField<String>? = null
        private var disputeStage: JsonField<DisputeStage>? = null
        private var disputeStatus: JsonField<DisputeStatus>? = null
        private var paymentId: JsonField<String>? = null
        private var paymentProvider: JsonField<PaymentProvider>? = null
        private var isResolvedByRdr: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(disputeListResponse: DisputeListResponse) = apply {
            amount = disputeListResponse.amount
            businessId = disputeListResponse.businessId
            createdAt = disputeListResponse.createdAt
            currency = disputeListResponse.currency
            disputeId = disputeListResponse.disputeId
            disputeStage = disputeListResponse.disputeStage
            disputeStatus = disputeListResponse.disputeStatus
            paymentId = disputeListResponse.paymentId
            paymentProvider = disputeListResponse.paymentProvider
            isResolvedByRdr = disputeListResponse.isResolvedByRdr
            additionalProperties = disputeListResponse.additionalProperties.toMutableMap()
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

        /**
         * Which processor handled the underlying payment. `stripe` / `adyen` for BYOP routes (the
         * merchant's own payment connector); `dodo` for everything Dodo processed itself.
         */
        fun paymentProvider(paymentProvider: PaymentProvider) =
            paymentProvider(JsonField.of(paymentProvider))

        /**
         * Sets [Builder.paymentProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentProvider] with a well-typed [PaymentProvider]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
            this.paymentProvider = paymentProvider
        }

        /** Whether the dispute was resolved by Rapid Dispute Resolution */
        fun isResolvedByRdr(isResolvedByRdr: Boolean?) =
            isResolvedByRdr(JsonField.ofNullable(isResolvedByRdr))

        /**
         * Alias for [Builder.isResolvedByRdr].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isResolvedByRdr(isResolvedByRdr: Boolean) = isResolvedByRdr(isResolvedByRdr as Boolean?)

        /**
         * Sets [Builder.isResolvedByRdr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isResolvedByRdr] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isResolvedByRdr(isResolvedByRdr: JsonField<Boolean>) = apply {
            this.isResolvedByRdr = isResolvedByRdr
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
         * Returns an immutable instance of [DisputeListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         * .paymentProvider()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DisputeListResponse =
            DisputeListResponse(
                checkRequired("amount", amount),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("disputeId", disputeId),
                checkRequired("disputeStage", disputeStage),
                checkRequired("disputeStatus", disputeStatus),
                checkRequired("paymentId", paymentId),
                checkRequired("paymentProvider", paymentProvider),
                isResolvedByRdr,
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
    fun validate(): DisputeListResponse = apply {
        if (validated) {
            return@apply
        }

        amount()
        businessId()
        createdAt()
        currency()
        disputeId()
        disputeStage().validate()
        disputeStatus().validate()
        paymentId()
        paymentProvider().validate()
        isResolvedByRdr()
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
            (if (disputeId.asKnown() == null) 0 else 1) +
            (disputeStage.asKnown()?.validity() ?: 0) +
            (disputeStatus.asKnown()?.validity() ?: 0) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (paymentProvider.asKnown()?.validity() ?: 0) +
            (if (isResolvedByRdr.asKnown() == null) 0 else 1)

    /**
     * Which processor handled the underlying payment. `stripe` / `adyen` for BYOP routes (the
     * merchant's own payment connector); `dodo` for everything Dodo processed itself.
     */
    class PaymentProvider @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val STRIPE = of("stripe")

            val ADYEN = of("adyen")

            val DODO = of("dodo")

            fun of(value: String) = PaymentProvider(JsonField.of(value))
        }

        /** An enum containing [PaymentProvider]'s known values. */
        enum class Known {
            STRIPE,
            ADYEN,
            DODO,
        }

        /**
         * An enum containing [PaymentProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STRIPE,
            ADYEN,
            DODO,
            /**
             * An enum member indicating that [PaymentProvider] was instantiated with an unknown
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
                STRIPE -> Value.STRIPE
                ADYEN -> Value.ADYEN
                DODO -> Value.DODO
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
                STRIPE -> Known.STRIPE
                ADYEN -> Known.ADYEN
                DODO -> Known.DODO
                else -> throw DodoPaymentsInvalidDataException("Unknown PaymentProvider: $value")
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
        fun validate(): PaymentProvider = apply {
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

            return other is PaymentProvider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputeListResponse &&
            amount == other.amount &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            disputeId == other.disputeId &&
            disputeStage == other.disputeStage &&
            disputeStatus == other.disputeStatus &&
            paymentId == other.paymentId &&
            paymentProvider == other.paymentProvider &&
            isResolvedByRdr == other.isResolvedByRdr &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            businessId,
            createdAt,
            currency,
            disputeId,
            disputeStage,
            disputeStatus,
            paymentId,
            paymentProvider,
            isResolvedByRdr,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DisputeListResponse{amount=$amount, businessId=$businessId, createdAt=$createdAt, currency=$currency, disputeId=$disputeId, disputeStage=$disputeStage, disputeStatus=$disputeStatus, paymentId=$paymentId, paymentProvider=$paymentProvider, isResolvedByRdr=$isResolvedByRdr, additionalProperties=$additionalProperties}"
}
