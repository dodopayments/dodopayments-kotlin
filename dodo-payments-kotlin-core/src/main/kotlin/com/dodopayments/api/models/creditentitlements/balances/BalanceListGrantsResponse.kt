// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Response for a credit grant */
class BalanceListGrantsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditEntitlementId: JsonField<String>,
    private val customerId: JsonField<String>,
    private val initialAmount: JsonField<String>,
    private val isExpired: JsonField<Boolean>,
    private val isRolledOver: JsonField<Boolean>,
    private val remainingAmount: JsonField<String>,
    private val rolloverCount: JsonField<Int>,
    private val sourceType: JsonField<SourceType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val metadata: JsonField<Metadata>,
    private val parentGrantId: JsonField<String>,
    private val sourceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        creditEntitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initial_amount")
        @ExcludeMissing
        initialAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_expired")
        @ExcludeMissing
        isExpired: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_rolled_over")
        @ExcludeMissing
        isRolledOver: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("remaining_amount")
        @ExcludeMissing
        remainingAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rollover_count")
        @ExcludeMissing
        rolloverCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source_type")
        @ExcludeMissing
        sourceType: JsonField<SourceType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("parent_grant_id")
        @ExcludeMissing
        parentGrantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        creditEntitlementId,
        customerId,
        initialAmount,
        isExpired,
        isRolledOver,
        remainingAmount,
        rolloverCount,
        sourceType,
        updatedAt,
        expiresAt,
        metadata,
        parentGrantId,
        sourceId,
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
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initialAmount(): String = initialAmount.getRequired("initial_amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isExpired(): Boolean = isExpired.getRequired("is_expired")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRolledOver(): Boolean = isRolledOver.getRequired("is_rolled_over")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun remainingAmount(): String = remainingAmount.getRequired("remaining_amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rolloverCount(): Int = rolloverCount.getRequired("rollover_count")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): SourceType = sourceType.getRequired("source_type")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /**
     * Arbitrary key-value metadata. Values can be string, integer, number, or boolean.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun parentGrantId(): String? = parentGrantId.getNullable("parent_grant_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceId(): String? = sourceId.getNullable("source_id")

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
     * Returns the raw JSON value of [creditEntitlementId].
     *
     * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_entitlement_id")
    @ExcludeMissing
    fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [initialAmount].
     *
     * Unlike [initialAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("initial_amount")
    @ExcludeMissing
    fun _initialAmount(): JsonField<String> = initialAmount

    /**
     * Returns the raw JSON value of [isExpired].
     *
     * Unlike [isExpired], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_expired") @ExcludeMissing fun _isExpired(): JsonField<Boolean> = isExpired

    /**
     * Returns the raw JSON value of [isRolledOver].
     *
     * Unlike [isRolledOver], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_rolled_over")
    @ExcludeMissing
    fun _isRolledOver(): JsonField<Boolean> = isRolledOver

    /**
     * Returns the raw JSON value of [remainingAmount].
     *
     * Unlike [remainingAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remaining_amount")
    @ExcludeMissing
    fun _remainingAmount(): JsonField<String> = remainingAmount

    /**
     * Returns the raw JSON value of [rolloverCount].
     *
     * Unlike [rolloverCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rollover_count")
    @ExcludeMissing
    fun _rolloverCount(): JsonField<Int> = rolloverCount

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_type")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [parentGrantId].
     *
     * Unlike [parentGrantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_grant_id")
    @ExcludeMissing
    fun _parentGrantId(): JsonField<String> = parentGrantId

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

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
         * Returns a mutable builder for constructing an instance of [BalanceListGrantsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .creditEntitlementId()
         * .customerId()
         * .initialAmount()
         * .isExpired()
         * .isRolledOver()
         * .remainingAmount()
         * .rolloverCount()
         * .sourceType()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceListGrantsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditEntitlementId: JsonField<String>? = null
        private var customerId: JsonField<String>? = null
        private var initialAmount: JsonField<String>? = null
        private var isExpired: JsonField<Boolean>? = null
        private var isRolledOver: JsonField<Boolean>? = null
        private var remainingAmount: JsonField<String>? = null
        private var rolloverCount: JsonField<Int>? = null
        private var sourceType: JsonField<SourceType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var parentGrantId: JsonField<String> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceListGrantsResponse: BalanceListGrantsResponse) = apply {
            id = balanceListGrantsResponse.id
            createdAt = balanceListGrantsResponse.createdAt
            creditEntitlementId = balanceListGrantsResponse.creditEntitlementId
            customerId = balanceListGrantsResponse.customerId
            initialAmount = balanceListGrantsResponse.initialAmount
            isExpired = balanceListGrantsResponse.isExpired
            isRolledOver = balanceListGrantsResponse.isRolledOver
            remainingAmount = balanceListGrantsResponse.remainingAmount
            rolloverCount = balanceListGrantsResponse.rolloverCount
            sourceType = balanceListGrantsResponse.sourceType
            updatedAt = balanceListGrantsResponse.updatedAt
            expiresAt = balanceListGrantsResponse.expiresAt
            metadata = balanceListGrantsResponse.metadata
            parentGrantId = balanceListGrantsResponse.parentGrantId
            sourceId = balanceListGrantsResponse.sourceId
            additionalProperties = balanceListGrantsResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun creditEntitlementId(creditEntitlementId: String) =
            creditEntitlementId(JsonField.of(creditEntitlementId))

        /**
         * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlementId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
            this.creditEntitlementId = creditEntitlementId
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun initialAmount(initialAmount: String) = initialAmount(JsonField.of(initialAmount))

        /**
         * Sets [Builder.initialAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun initialAmount(initialAmount: JsonField<String>) = apply {
            this.initialAmount = initialAmount
        }

        fun isExpired(isExpired: Boolean) = isExpired(JsonField.of(isExpired))

        /**
         * Sets [Builder.isExpired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isExpired] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isExpired(isExpired: JsonField<Boolean>) = apply { this.isExpired = isExpired }

        fun isRolledOver(isRolledOver: Boolean) = isRolledOver(JsonField.of(isRolledOver))

        /**
         * Sets [Builder.isRolledOver] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRolledOver] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRolledOver(isRolledOver: JsonField<Boolean>) = apply {
            this.isRolledOver = isRolledOver
        }

        fun remainingAmount(remainingAmount: String) =
            remainingAmount(JsonField.of(remainingAmount))

        /**
         * Sets [Builder.remainingAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remainingAmount(remainingAmount: JsonField<String>) = apply {
            this.remainingAmount = remainingAmount
        }

        fun rolloverCount(rolloverCount: Int) = rolloverCount(JsonField.of(rolloverCount))

        /**
         * Sets [Builder.rolloverCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverCount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rolloverCount(rolloverCount: JsonField<Int>) = apply {
            this.rolloverCount = rolloverCount
        }

        fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Arbitrary key-value metadata. Values can be string, integer, number, or boolean. */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun parentGrantId(parentGrantId: String?) =
            parentGrantId(JsonField.ofNullable(parentGrantId))

        /**
         * Sets [Builder.parentGrantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentGrantId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentGrantId(parentGrantId: JsonField<String>) = apply {
            this.parentGrantId = parentGrantId
        }

        fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

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
         * Returns an immutable instance of [BalanceListGrantsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .creditEntitlementId()
         * .customerId()
         * .initialAmount()
         * .isExpired()
         * .isRolledOver()
         * .remainingAmount()
         * .rolloverCount()
         * .sourceType()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceListGrantsResponse =
            BalanceListGrantsResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("creditEntitlementId", creditEntitlementId),
                checkRequired("customerId", customerId),
                checkRequired("initialAmount", initialAmount),
                checkRequired("isExpired", isExpired),
                checkRequired("isRolledOver", isRolledOver),
                checkRequired("remainingAmount", remainingAmount),
                checkRequired("rolloverCount", rolloverCount),
                checkRequired("sourceType", sourceType),
                checkRequired("updatedAt", updatedAt),
                expiresAt,
                metadata,
                parentGrantId,
                sourceId,
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
    fun validate(): BalanceListGrantsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        creditEntitlementId()
        customerId()
        initialAmount()
        isExpired()
        isRolledOver()
        remainingAmount()
        rolloverCount()
        sourceType().validate()
        updatedAt()
        expiresAt()
        metadata()?.validate()
        parentGrantId()
        sourceId()
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
            (if (creditEntitlementId.asKnown() == null) 0 else 1) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (initialAmount.asKnown() == null) 0 else 1) +
            (if (isExpired.asKnown() == null) 0 else 1) +
            (if (isRolledOver.asKnown() == null) 0 else 1) +
            (if (remainingAmount.asKnown() == null) 0 else 1) +
            (if (rolloverCount.asKnown() == null) 0 else 1) +
            (sourceType.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (parentGrantId.asKnown() == null) 0 else 1) +
            (if (sourceId.asKnown() == null) 0 else 1)

    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val SUBSCRIPTION = of("subscription")

            val ONE_TIME = of("one_time")

            val ADDON = of("addon")

            val API = of("api")

            val ROLLOVER = of("rollover")

            fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            SUBSCRIPTION,
            ONE_TIME,
            ADDON,
            API,
            ROLLOVER,
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUBSCRIPTION,
            ONE_TIME,
            ADDON,
            API,
            ROLLOVER,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
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
                SUBSCRIPTION -> Value.SUBSCRIPTION
                ONE_TIME -> Value.ONE_TIME
                ADDON -> Value.ADDON
                API -> Value.API
                ROLLOVER -> Value.ROLLOVER
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
                SUBSCRIPTION -> Known.SUBSCRIPTION
                ONE_TIME -> Known.ONE_TIME
                ADDON -> Known.ADDON
                API -> Known.API
                ROLLOVER -> Known.ROLLOVER
                else -> throw DodoPaymentsInvalidDataException("Unknown SourceType: $value")
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
        fun validate(): SourceType = apply {
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

            return other is SourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceListGrantsResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            creditEntitlementId == other.creditEntitlementId &&
            customerId == other.customerId &&
            initialAmount == other.initialAmount &&
            isExpired == other.isExpired &&
            isRolledOver == other.isRolledOver &&
            remainingAmount == other.remainingAmount &&
            rolloverCount == other.rolloverCount &&
            sourceType == other.sourceType &&
            updatedAt == other.updatedAt &&
            expiresAt == other.expiresAt &&
            metadata == other.metadata &&
            parentGrantId == other.parentGrantId &&
            sourceId == other.sourceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            creditEntitlementId,
            customerId,
            initialAmount,
            isExpired,
            isRolledOver,
            remainingAmount,
            rolloverCount,
            sourceType,
            updatedAt,
            expiresAt,
            metadata,
            parentGrantId,
            sourceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceListGrantsResponse{id=$id, createdAt=$createdAt, creditEntitlementId=$creditEntitlementId, customerId=$customerId, initialAmount=$initialAmount, isExpired=$isExpired, isRolledOver=$isRolledOver, remainingAmount=$remainingAmount, rolloverCount=$rolloverCount, sourceType=$sourceType, updatedAt=$updatedAt, expiresAt=$expiresAt, metadata=$metadata, parentGrantId=$parentGrantId, sourceId=$sourceId, additionalProperties=$additionalProperties}"
}
