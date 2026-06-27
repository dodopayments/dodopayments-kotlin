// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class CreditEntitlement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val overageBehavior: JsonField<CbbOverageBehavior>,
    private val overageEnabled: JsonField<Boolean>,
    private val precision: JsonField<Int>,
    private val rolloverEnabled: JsonField<Boolean>,
    private val unit: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val expiresAfterDays: JsonField<Int>,
    private val maxRolloverCount: JsonField<Int>,
    private val overageLimit: JsonField<Long>,
    private val pricePerUnit: JsonField<String>,
    private val rolloverPercentage: JsonField<Int>,
    private val rolloverTimeframeCount: JsonField<Int>,
    private val rolloverTimeframeInterval: JsonField<TimeInterval>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overage_behavior")
        @ExcludeMissing
        overageBehavior: JsonField<CbbOverageBehavior> = JsonMissing.of(),
        @JsonProperty("overage_enabled")
        @ExcludeMissing
        overageEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("precision") @ExcludeMissing precision: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rollover_enabled")
        @ExcludeMissing
        rolloverEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_after_days")
        @ExcludeMissing
        expiresAfterDays: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("max_rollover_count")
        @ExcludeMissing
        maxRolloverCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("overage_limit")
        @ExcludeMissing
        overageLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        pricePerUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rollover_percentage")
        @ExcludeMissing
        rolloverPercentage: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rollover_timeframe_count")
        @ExcludeMissing
        rolloverTimeframeCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rollover_timeframe_interval")
        @ExcludeMissing
        rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of(),
    ) : this(
        id,
        businessId,
        createdAt,
        name,
        overageBehavior,
        overageEnabled,
        precision,
        rolloverEnabled,
        unit,
        updatedAt,
        currency,
        description,
        expiresAfterDays,
        maxRolloverCount,
        overageLimit,
        pricePerUnit,
        rolloverPercentage,
        rolloverTimeframeCount,
        rolloverTimeframeInterval,
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
    fun name(): String = name.getRequired("name")

    /**
     * Controls how overage is handled at billing cycle end.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overageBehavior(): CbbOverageBehavior = overageBehavior.getRequired("overage_behavior")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overageEnabled(): Boolean = overageEnabled.getRequired("overage_enabled")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun precision(): Int = precision.getRequired("precision")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rolloverEnabled(): Boolean = rolloverEnabled.getRequired("rollover_enabled")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unit(): String = unit.getRequired("unit")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = currency.getNullable("currency")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAfterDays(): Int? = expiresAfterDays.getNullable("expires_after_days")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxRolloverCount(): Int? = maxRolloverCount.getNullable("max_rollover_count")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overageLimit(): Long? = overageLimit.getNullable("overage_limit")

    /**
     * Price per credit unit
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pricePerUnit(): String? = pricePerUnit.getNullable("price_per_unit")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverPercentage(): Int? = rolloverPercentage.getNullable("rollover_percentage")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverTimeframeCount(): Int? =
        rolloverTimeframeCount.getNullable("rollover_timeframe_count")

    /**
     * Unit of a duration count (e.g. license-key validity period).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverTimeframeInterval(): TimeInterval? =
        rolloverTimeframeInterval.getNullable("rollover_timeframe_interval")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [overageBehavior].
     *
     * Unlike [overageBehavior], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overage_behavior")
    @ExcludeMissing
    fun _overageBehavior(): JsonField<CbbOverageBehavior> = overageBehavior

    /**
     * Returns the raw JSON value of [overageEnabled].
     *
     * Unlike [overageEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overage_enabled")
    @ExcludeMissing
    fun _overageEnabled(): JsonField<Boolean> = overageEnabled

    /**
     * Returns the raw JSON value of [precision].
     *
     * Unlike [precision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("precision") @ExcludeMissing fun _precision(): JsonField<Int> = precision

    /**
     * Returns the raw JSON value of [rolloverEnabled].
     *
     * Unlike [rolloverEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rollover_enabled")
    @ExcludeMissing
    fun _rolloverEnabled(): JsonField<Boolean> = rolloverEnabled

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [expiresAfterDays].
     *
     * Unlike [expiresAfterDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expires_after_days")
    @ExcludeMissing
    fun _expiresAfterDays(): JsonField<Int> = expiresAfterDays

    /**
     * Returns the raw JSON value of [maxRolloverCount].
     *
     * Unlike [maxRolloverCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_rollover_count")
    @ExcludeMissing
    fun _maxRolloverCount(): JsonField<Int> = maxRolloverCount

    /**
     * Returns the raw JSON value of [overageLimit].
     *
     * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overage_limit")
    @ExcludeMissing
    fun _overageLimit(): JsonField<Long> = overageLimit

    /**
     * Returns the raw JSON value of [pricePerUnit].
     *
     * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_per_unit")
    @ExcludeMissing
    fun _pricePerUnit(): JsonField<String> = pricePerUnit

    /**
     * Returns the raw JSON value of [rolloverPercentage].
     *
     * Unlike [rolloverPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rollover_percentage")
    @ExcludeMissing
    fun _rolloverPercentage(): JsonField<Int> = rolloverPercentage

    /**
     * Returns the raw JSON value of [rolloverTimeframeCount].
     *
     * Unlike [rolloverTimeframeCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("rollover_timeframe_count")
    @ExcludeMissing
    fun _rolloverTimeframeCount(): JsonField<Int> = rolloverTimeframeCount

    /**
     * Returns the raw JSON value of [rolloverTimeframeInterval].
     *
     * Unlike [rolloverTimeframeInterval], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("rollover_timeframe_interval")
    @ExcludeMissing
    fun _rolloverTimeframeInterval(): JsonField<TimeInterval> = rolloverTimeframeInterval

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
         * Returns a mutable builder for constructing an instance of [CreditEntitlement].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .businessId()
         * .createdAt()
         * .name()
         * .overageBehavior()
         * .overageEnabled()
         * .precision()
         * .rolloverEnabled()
         * .unit()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditEntitlement]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var overageBehavior: JsonField<CbbOverageBehavior>? = null
        private var overageEnabled: JsonField<Boolean>? = null
        private var precision: JsonField<Int>? = null
        private var rolloverEnabled: JsonField<Boolean>? = null
        private var unit: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var expiresAfterDays: JsonField<Int> = JsonMissing.of()
        private var maxRolloverCount: JsonField<Int> = JsonMissing.of()
        private var overageLimit: JsonField<Long> = JsonMissing.of()
        private var pricePerUnit: JsonField<String> = JsonMissing.of()
        private var rolloverPercentage: JsonField<Int> = JsonMissing.of()
        private var rolloverTimeframeCount: JsonField<Int> = JsonMissing.of()
        private var rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditEntitlement: CreditEntitlement) = apply {
            id = creditEntitlement.id
            businessId = creditEntitlement.businessId
            createdAt = creditEntitlement.createdAt
            name = creditEntitlement.name
            overageBehavior = creditEntitlement.overageBehavior
            overageEnabled = creditEntitlement.overageEnabled
            precision = creditEntitlement.precision
            rolloverEnabled = creditEntitlement.rolloverEnabled
            unit = creditEntitlement.unit
            updatedAt = creditEntitlement.updatedAt
            currency = creditEntitlement.currency
            description = creditEntitlement.description
            expiresAfterDays = creditEntitlement.expiresAfterDays
            maxRolloverCount = creditEntitlement.maxRolloverCount
            overageLimit = creditEntitlement.overageLimit
            pricePerUnit = creditEntitlement.pricePerUnit
            rolloverPercentage = creditEntitlement.rolloverPercentage
            rolloverTimeframeCount = creditEntitlement.rolloverTimeframeCount
            rolloverTimeframeInterval = creditEntitlement.rolloverTimeframeInterval
            additionalProperties = creditEntitlement.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Controls how overage is handled at billing cycle end. */
        fun overageBehavior(overageBehavior: CbbOverageBehavior) =
            overageBehavior(JsonField.of(overageBehavior))

        /**
         * Sets [Builder.overageBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageBehavior] with a well-typed [CbbOverageBehavior]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overageBehavior(overageBehavior: JsonField<CbbOverageBehavior>) = apply {
            this.overageBehavior = overageBehavior
        }

        fun overageEnabled(overageEnabled: Boolean) = overageEnabled(JsonField.of(overageEnabled))

        /**
         * Sets [Builder.overageEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overageEnabled(overageEnabled: JsonField<Boolean>) = apply {
            this.overageEnabled = overageEnabled
        }

        fun precision(precision: Int) = precision(JsonField.of(precision))

        /**
         * Sets [Builder.precision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precision] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun precision(precision: JsonField<Int>) = apply { this.precision = precision }

        fun rolloverEnabled(rolloverEnabled: Boolean) =
            rolloverEnabled(JsonField.of(rolloverEnabled))

        /**
         * Sets [Builder.rolloverEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rolloverEnabled(rolloverEnabled: JsonField<Boolean>) = apply {
            this.rolloverEnabled = rolloverEnabled
        }

        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun expiresAfterDays(expiresAfterDays: Int?) =
            expiresAfterDays(JsonField.ofNullable(expiresAfterDays))

        /**
         * Alias for [Builder.expiresAfterDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expiresAfterDays(expiresAfterDays: Int) = expiresAfterDays(expiresAfterDays as Int?)

        /**
         * Sets [Builder.expiresAfterDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAfterDays] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresAfterDays(expiresAfterDays: JsonField<Int>) = apply {
            this.expiresAfterDays = expiresAfterDays
        }

        fun maxRolloverCount(maxRolloverCount: Int?) =
            maxRolloverCount(JsonField.ofNullable(maxRolloverCount))

        /**
         * Alias for [Builder.maxRolloverCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxRolloverCount(maxRolloverCount: Int) = maxRolloverCount(maxRolloverCount as Int?)

        /**
         * Sets [Builder.maxRolloverCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRolloverCount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxRolloverCount(maxRolloverCount: JsonField<Int>) = apply {
            this.maxRolloverCount = maxRolloverCount
        }

        fun overageLimit(overageLimit: Long?) = overageLimit(JsonField.ofNullable(overageLimit))

        /**
         * Alias for [Builder.overageLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun overageLimit(overageLimit: Long) = overageLimit(overageLimit as Long?)

        /**
         * Sets [Builder.overageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overageLimit(overageLimit: JsonField<Long>) = apply { this.overageLimit = overageLimit }

        /** Price per credit unit */
        fun pricePerUnit(pricePerUnit: String?) = pricePerUnit(JsonField.ofNullable(pricePerUnit))

        /**
         * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricePerUnit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
            this.pricePerUnit = pricePerUnit
        }

        fun rolloverPercentage(rolloverPercentage: Int?) =
            rolloverPercentage(JsonField.ofNullable(rolloverPercentage))

        /**
         * Alias for [Builder.rolloverPercentage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rolloverPercentage(rolloverPercentage: Int) =
            rolloverPercentage(rolloverPercentage as Int?)

        /**
         * Sets [Builder.rolloverPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverPercentage] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rolloverPercentage(rolloverPercentage: JsonField<Int>) = apply {
            this.rolloverPercentage = rolloverPercentage
        }

        fun rolloverTimeframeCount(rolloverTimeframeCount: Int?) =
            rolloverTimeframeCount(JsonField.ofNullable(rolloverTimeframeCount))

        /**
         * Alias for [Builder.rolloverTimeframeCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rolloverTimeframeCount(rolloverTimeframeCount: Int) =
            rolloverTimeframeCount(rolloverTimeframeCount as Int?)

        /**
         * Sets [Builder.rolloverTimeframeCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverTimeframeCount] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rolloverTimeframeCount(rolloverTimeframeCount: JsonField<Int>) = apply {
            this.rolloverTimeframeCount = rolloverTimeframeCount
        }

        /** Unit of a duration count (e.g. license-key validity period). */
        fun rolloverTimeframeInterval(rolloverTimeframeInterval: TimeInterval?) =
            rolloverTimeframeInterval(JsonField.ofNullable(rolloverTimeframeInterval))

        /**
         * Sets [Builder.rolloverTimeframeInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverTimeframeInterval] with a well-typed
         * [TimeInterval] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun rolloverTimeframeInterval(rolloverTimeframeInterval: JsonField<TimeInterval>) = apply {
            this.rolloverTimeframeInterval = rolloverTimeframeInterval
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
         * Returns an immutable instance of [CreditEntitlement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .businessId()
         * .createdAt()
         * .name()
         * .overageBehavior()
         * .overageEnabled()
         * .precision()
         * .rolloverEnabled()
         * .unit()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditEntitlement =
            CreditEntitlement(
                checkRequired("id", id),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("name", name),
                checkRequired("overageBehavior", overageBehavior),
                checkRequired("overageEnabled", overageEnabled),
                checkRequired("precision", precision),
                checkRequired("rolloverEnabled", rolloverEnabled),
                checkRequired("unit", unit),
                checkRequired("updatedAt", updatedAt),
                currency,
                description,
                expiresAfterDays,
                maxRolloverCount,
                overageLimit,
                pricePerUnit,
                rolloverPercentage,
                rolloverTimeframeCount,
                rolloverTimeframeInterval,
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
    fun validate(): CreditEntitlement = apply {
        if (validated) {
            return@apply
        }

        id()
        businessId()
        createdAt()
        name()
        overageBehavior().validate()
        overageEnabled()
        precision()
        rolloverEnabled()
        unit()
        updatedAt()
        currency()?.validate()
        description()
        expiresAfterDays()
        maxRolloverCount()
        overageLimit()
        pricePerUnit()
        rolloverPercentage()
        rolloverTimeframeCount()
        rolloverTimeframeInterval()?.validate()
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
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (overageBehavior.asKnown()?.validity() ?: 0) +
            (if (overageEnabled.asKnown() == null) 0 else 1) +
            (if (precision.asKnown() == null) 0 else 1) +
            (if (rolloverEnabled.asKnown() == null) 0 else 1) +
            (if (unit.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (expiresAfterDays.asKnown() == null) 0 else 1) +
            (if (maxRolloverCount.asKnown() == null) 0 else 1) +
            (if (overageLimit.asKnown() == null) 0 else 1) +
            (if (pricePerUnit.asKnown() == null) 0 else 1) +
            (if (rolloverPercentage.asKnown() == null) 0 else 1) +
            (if (rolloverTimeframeCount.asKnown() == null) 0 else 1) +
            (rolloverTimeframeInterval.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditEntitlement &&
            id == other.id &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            name == other.name &&
            overageBehavior == other.overageBehavior &&
            overageEnabled == other.overageEnabled &&
            precision == other.precision &&
            rolloverEnabled == other.rolloverEnabled &&
            unit == other.unit &&
            updatedAt == other.updatedAt &&
            currency == other.currency &&
            description == other.description &&
            expiresAfterDays == other.expiresAfterDays &&
            maxRolloverCount == other.maxRolloverCount &&
            overageLimit == other.overageLimit &&
            pricePerUnit == other.pricePerUnit &&
            rolloverPercentage == other.rolloverPercentage &&
            rolloverTimeframeCount == other.rolloverTimeframeCount &&
            rolloverTimeframeInterval == other.rolloverTimeframeInterval &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            businessId,
            createdAt,
            name,
            overageBehavior,
            overageEnabled,
            precision,
            rolloverEnabled,
            unit,
            updatedAt,
            currency,
            description,
            expiresAfterDays,
            maxRolloverCount,
            overageLimit,
            pricePerUnit,
            rolloverPercentage,
            rolloverTimeframeCount,
            rolloverTimeframeInterval,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditEntitlement{id=$id, businessId=$businessId, createdAt=$createdAt, name=$name, overageBehavior=$overageBehavior, overageEnabled=$overageEnabled, precision=$precision, rolloverEnabled=$rolloverEnabled, unit=$unit, updatedAt=$updatedAt, currency=$currency, description=$description, expiresAfterDays=$expiresAfterDays, maxRolloverCount=$maxRolloverCount, overageLimit=$overageLimit, pricePerUnit=$pricePerUnit, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, additionalProperties=$additionalProperties}"
}
