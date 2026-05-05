// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

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

/**
 * Individual balance ledger entry for a payout, with amounts pro-rated into the payout's currency.
 */
class DetailListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val eventType: JsonField<String>,
    private val originalAmount: JsonField<Long>,
    private val originalCurrency: JsonField<String>,
    private val payoutCurrencyAmount: JsonField<Long>,
    private val usdEquivalentAmount: JsonField<Long>,
    private val description: JsonField<String>,
    private val referenceObjectId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("event_type") @ExcludeMissing eventType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("original_amount")
        @ExcludeMissing
        originalAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("original_currency")
        @ExcludeMissing
        originalCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payout_currency_amount")
        @ExcludeMissing
        payoutCurrencyAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("usd_equivalent_amount")
        @ExcludeMissing
        usdEquivalentAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_object_id")
        @ExcludeMissing
        referenceObjectId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        eventType,
        originalAmount,
        originalCurrency,
        payoutCurrencyAmount,
        usdEquivalentAmount,
        description,
        referenceObjectId,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the balance ledger entry.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Timestamp when this entry was created.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The type of balance ledger event (e.g., "payment", "refund", "dispute", "payment_fees").
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): String = eventType.getRequired("event_type")

    /**
     * Original amount in the original currency (in smallest currency unit, e.g., cents).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originalAmount(): Long = originalAmount.getRequired("original_amount")

    /**
     * Original currency as ISO 4217 code (e.g., "USD", "EUR").
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originalCurrency(): String = originalCurrency.getRequired("original_currency")

    /**
     * Amount in the payout's currency (in smallest currency unit). Uses cumulative rounding to
     * ensure sum matches payout total exactly.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payoutCurrencyAmount(): Long = payoutCurrencyAmount.getRequired("payout_currency_amount")

    /**
     * USD equivalent of the original amount (in cents).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usdEquivalentAmount(): Long = usdEquivalentAmount.getRequired("usd_equivalent_amount")

    /**
     * Human-readable description of the transaction.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * ID of the related object (e.g., payment ID, refund ID) if applicable.
     *
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

    /**
     * Returns the raw JSON value of [originalAmount].
     *
     * Unlike [originalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("original_amount")
    @ExcludeMissing
    fun _originalAmount(): JsonField<Long> = originalAmount

    /**
     * Returns the raw JSON value of [originalCurrency].
     *
     * Unlike [originalCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("original_currency")
    @ExcludeMissing
    fun _originalCurrency(): JsonField<String> = originalCurrency

    /**
     * Returns the raw JSON value of [payoutCurrencyAmount].
     *
     * Unlike [payoutCurrencyAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payout_currency_amount")
    @ExcludeMissing
    fun _payoutCurrencyAmount(): JsonField<Long> = payoutCurrencyAmount

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [DetailListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .eventType()
         * .originalAmount()
         * .originalCurrency()
         * .payoutCurrencyAmount()
         * .usdEquivalentAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DetailListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var eventType: JsonField<String>? = null
        private var originalAmount: JsonField<Long>? = null
        private var originalCurrency: JsonField<String>? = null
        private var payoutCurrencyAmount: JsonField<Long>? = null
        private var usdEquivalentAmount: JsonField<Long>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var referenceObjectId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(detailListResponse: DetailListResponse) = apply {
            id = detailListResponse.id
            createdAt = detailListResponse.createdAt
            eventType = detailListResponse.eventType
            originalAmount = detailListResponse.originalAmount
            originalCurrency = detailListResponse.originalCurrency
            payoutCurrencyAmount = detailListResponse.payoutCurrencyAmount
            usdEquivalentAmount = detailListResponse.usdEquivalentAmount
            description = detailListResponse.description
            referenceObjectId = detailListResponse.referenceObjectId
            additionalProperties = detailListResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the balance ledger entry. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Timestamp when this entry was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The type of balance ledger event (e.g., "payment", "refund", "dispute", "payment_fees").
         */
        fun eventType(eventType: String) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

        /** Original amount in the original currency (in smallest currency unit, e.g., cents). */
        fun originalAmount(originalAmount: Long) = originalAmount(JsonField.of(originalAmount))

        /**
         * Sets [Builder.originalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun originalAmount(originalAmount: JsonField<Long>) = apply {
            this.originalAmount = originalAmount
        }

        /** Original currency as ISO 4217 code (e.g., "USD", "EUR"). */
        fun originalCurrency(originalCurrency: String) =
            originalCurrency(JsonField.of(originalCurrency))

        /**
         * Sets [Builder.originalCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originalCurrency(originalCurrency: JsonField<String>) = apply {
            this.originalCurrency = originalCurrency
        }

        /**
         * Amount in the payout's currency (in smallest currency unit). Uses cumulative rounding to
         * ensure sum matches payout total exactly.
         */
        fun payoutCurrencyAmount(payoutCurrencyAmount: Long) =
            payoutCurrencyAmount(JsonField.of(payoutCurrencyAmount))

        /**
         * Sets [Builder.payoutCurrencyAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payoutCurrencyAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payoutCurrencyAmount(payoutCurrencyAmount: JsonField<Long>) = apply {
            this.payoutCurrencyAmount = payoutCurrencyAmount
        }

        /** USD equivalent of the original amount (in cents). */
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

        /** Human-readable description of the transaction. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** ID of the related object (e.g., payment ID, refund ID) if applicable. */
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
         * Returns an immutable instance of [DetailListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .eventType()
         * .originalAmount()
         * .originalCurrency()
         * .payoutCurrencyAmount()
         * .usdEquivalentAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DetailListResponse =
            DetailListResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("eventType", eventType),
                checkRequired("originalAmount", originalAmount),
                checkRequired("originalCurrency", originalCurrency),
                checkRequired("payoutCurrencyAmount", payoutCurrencyAmount),
                checkRequired("usdEquivalentAmount", usdEquivalentAmount),
                description,
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
    fun validate(): DetailListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        eventType()
        originalAmount()
        originalCurrency()
        payoutCurrencyAmount()
        usdEquivalentAmount()
        description()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (eventType.asKnown() == null) 0 else 1) +
            (if (originalAmount.asKnown() == null) 0 else 1) +
            (if (originalCurrency.asKnown() == null) 0 else 1) +
            (if (payoutCurrencyAmount.asKnown() == null) 0 else 1) +
            (if (usdEquivalentAmount.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (referenceObjectId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetailListResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            eventType == other.eventType &&
            originalAmount == other.originalAmount &&
            originalCurrency == other.originalCurrency &&
            payoutCurrencyAmount == other.payoutCurrencyAmount &&
            usdEquivalentAmount == other.usdEquivalentAmount &&
            description == other.description &&
            referenceObjectId == other.referenceObjectId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            eventType,
            originalAmount,
            originalCurrency,
            payoutCurrencyAmount,
            usdEquivalentAmount,
            description,
            referenceObjectId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DetailListResponse{id=$id, createdAt=$createdAt, eventType=$eventType, originalAmount=$originalAmount, originalCurrency=$originalCurrency, payoutCurrencyAmount=$payoutCurrencyAmount, usdEquivalentAmount=$usdEquivalentAmount, description=$description, referenceObjectId=$referenceObjectId, additionalProperties=$additionalProperties}"
}
