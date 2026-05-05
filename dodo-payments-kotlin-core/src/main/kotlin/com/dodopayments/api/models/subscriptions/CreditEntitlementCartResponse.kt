// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Response struct representing credit entitlement cart details for a subscription */
class CreditEntitlementCartResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creditEntitlementId: JsonField<String>,
    private val creditEntitlementName: JsonField<String>,
    private val creditsAmount: JsonField<String>,
    private val overageBalance: JsonField<String>,
    private val overageBehavior: JsonField<CbbOverageBehavior>,
    private val overageEnabled: JsonField<Boolean>,
    private val productId: JsonField<String>,
    private val remainingBalance: JsonField<String>,
    private val rolloverEnabled: JsonField<Boolean>,
    private val unit: JsonField<String>,
    private val expiresAfterDays: JsonField<Int>,
    private val lowBalanceThresholdPercent: JsonField<Int>,
    private val maxRolloverCount: JsonField<Int>,
    private val overageLimit: JsonField<String>,
    private val rolloverPercentage: JsonField<Int>,
    private val rolloverTimeframeCount: JsonField<Int>,
    private val rolloverTimeframeInterval: JsonField<TimeInterval>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        creditEntitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_entitlement_name")
        @ExcludeMissing
        creditEntitlementName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credits_amount")
        @ExcludeMissing
        creditsAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overage_balance")
        @ExcludeMissing
        overageBalance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overage_behavior")
        @ExcludeMissing
        overageBehavior: JsonField<CbbOverageBehavior> = JsonMissing.of(),
        @JsonProperty("overage_enabled")
        @ExcludeMissing
        overageEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remaining_balance")
        @ExcludeMissing
        remainingBalance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rollover_enabled")
        @ExcludeMissing
        rolloverEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_after_days")
        @ExcludeMissing
        expiresAfterDays: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("low_balance_threshold_percent")
        @ExcludeMissing
        lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("max_rollover_count")
        @ExcludeMissing
        maxRolloverCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("overage_limit")
        @ExcludeMissing
        overageLimit: JsonField<String> = JsonMissing.of(),
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
        creditEntitlementId,
        creditEntitlementName,
        creditsAmount,
        overageBalance,
        overageBehavior,
        overageEnabled,
        productId,
        remainingBalance,
        rolloverEnabled,
        unit,
        expiresAfterDays,
        lowBalanceThresholdPercent,
        maxRolloverCount,
        overageLimit,
        rolloverPercentage,
        rolloverTimeframeCount,
        rolloverTimeframeInterval,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditEntitlementName(): String =
        creditEntitlementName.getRequired("credit_entitlement_name")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditsAmount(): String = creditsAmount.getRequired("credits_amount")

    /**
     * Customer's current overage balance for this entitlement
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overageBalance(): String = overageBalance.getRequired("overage_balance")

    /**
     * Controls how overage is handled at the end of a billing cycle.
     *
     * |Preset                    |Charge at billing|Credits reduce overage|Preserve overage at reset|
     * |--------------------------|:---------------:|:--------------------:|:-----------------------:|
     * |`forgive_at_reset`        |       No        |          No          |           No            |
     * |`invoice_at_billing`      |       Yes       |          No          |           No            |
     * |`carry_deficit`           |       No        |          No          |           Yes           |
     * |`carry_deficit_auto_repay`|       No        |         Yes          |           Yes           |
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
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Customer's current remaining credit balance for this entitlement
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun remainingBalance(): String = remainingBalance.getRequired("remaining_balance")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rolloverEnabled(): Boolean = rolloverEnabled.getRequired("rollover_enabled")

    /**
     * Unit label for the credit entitlement (e.g., "API Calls", "Tokens")
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unit(): String = unit.getRequired("unit")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAfterDays(): Int? = expiresAfterDays.getNullable("expires_after_days")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lowBalanceThresholdPercent(): Int? =
        lowBalanceThresholdPercent.getNullable("low_balance_threshold_percent")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxRolloverCount(): Int? = maxRolloverCount.getNullable("max_rollover_count")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overageLimit(): String? = overageLimit.getNullable("overage_limit")

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
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverTimeframeInterval(): TimeInterval? =
        rolloverTimeframeInterval.getNullable("rollover_timeframe_interval")

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
     * Returns the raw JSON value of [creditEntitlementName].
     *
     * Unlike [creditEntitlementName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_entitlement_name")
    @ExcludeMissing
    fun _creditEntitlementName(): JsonField<String> = creditEntitlementName

    /**
     * Returns the raw JSON value of [creditsAmount].
     *
     * Unlike [creditsAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credits_amount")
    @ExcludeMissing
    fun _creditsAmount(): JsonField<String> = creditsAmount

    /**
     * Returns the raw JSON value of [overageBalance].
     *
     * Unlike [overageBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overage_balance")
    @ExcludeMissing
    fun _overageBalance(): JsonField<String> = overageBalance

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
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [remainingBalance].
     *
     * Unlike [remainingBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remaining_balance")
    @ExcludeMissing
    fun _remainingBalance(): JsonField<String> = remainingBalance

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
     * Returns the raw JSON value of [expiresAfterDays].
     *
     * Unlike [expiresAfterDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expires_after_days")
    @ExcludeMissing
    fun _expiresAfterDays(): JsonField<Int> = expiresAfterDays

    /**
     * Returns the raw JSON value of [lowBalanceThresholdPercent].
     *
     * Unlike [lowBalanceThresholdPercent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("low_balance_threshold_percent")
    @ExcludeMissing
    fun _lowBalanceThresholdPercent(): JsonField<Int> = lowBalanceThresholdPercent

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
    fun _overageLimit(): JsonField<String> = overageLimit

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
         * Returns a mutable builder for constructing an instance of
         * [CreditEntitlementCartResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .creditEntitlementId()
         * .creditEntitlementName()
         * .creditsAmount()
         * .overageBalance()
         * .overageBehavior()
         * .overageEnabled()
         * .productId()
         * .remainingBalance()
         * .rolloverEnabled()
         * .unit()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditEntitlementCartResponse]. */
    class Builder internal constructor() {

        private var creditEntitlementId: JsonField<String>? = null
        private var creditEntitlementName: JsonField<String>? = null
        private var creditsAmount: JsonField<String>? = null
        private var overageBalance: JsonField<String>? = null
        private var overageBehavior: JsonField<CbbOverageBehavior>? = null
        private var overageEnabled: JsonField<Boolean>? = null
        private var productId: JsonField<String>? = null
        private var remainingBalance: JsonField<String>? = null
        private var rolloverEnabled: JsonField<Boolean>? = null
        private var unit: JsonField<String>? = null
        private var expiresAfterDays: JsonField<Int> = JsonMissing.of()
        private var lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of()
        private var maxRolloverCount: JsonField<Int> = JsonMissing.of()
        private var overageLimit: JsonField<String> = JsonMissing.of()
        private var rolloverPercentage: JsonField<Int> = JsonMissing.of()
        private var rolloverTimeframeCount: JsonField<Int> = JsonMissing.of()
        private var rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditEntitlementCartResponse: CreditEntitlementCartResponse) = apply {
            creditEntitlementId = creditEntitlementCartResponse.creditEntitlementId
            creditEntitlementName = creditEntitlementCartResponse.creditEntitlementName
            creditsAmount = creditEntitlementCartResponse.creditsAmount
            overageBalance = creditEntitlementCartResponse.overageBalance
            overageBehavior = creditEntitlementCartResponse.overageBehavior
            overageEnabled = creditEntitlementCartResponse.overageEnabled
            productId = creditEntitlementCartResponse.productId
            remainingBalance = creditEntitlementCartResponse.remainingBalance
            rolloverEnabled = creditEntitlementCartResponse.rolloverEnabled
            unit = creditEntitlementCartResponse.unit
            expiresAfterDays = creditEntitlementCartResponse.expiresAfterDays
            lowBalanceThresholdPercent = creditEntitlementCartResponse.lowBalanceThresholdPercent
            maxRolloverCount = creditEntitlementCartResponse.maxRolloverCount
            overageLimit = creditEntitlementCartResponse.overageLimit
            rolloverPercentage = creditEntitlementCartResponse.rolloverPercentage
            rolloverTimeframeCount = creditEntitlementCartResponse.rolloverTimeframeCount
            rolloverTimeframeInterval = creditEntitlementCartResponse.rolloverTimeframeInterval
            additionalProperties = creditEntitlementCartResponse.additionalProperties.toMutableMap()
        }

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

        fun creditEntitlementName(creditEntitlementName: String) =
            creditEntitlementName(JsonField.of(creditEntitlementName))

        /**
         * Sets [Builder.creditEntitlementName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlementName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditEntitlementName(creditEntitlementName: JsonField<String>) = apply {
            this.creditEntitlementName = creditEntitlementName
        }

        fun creditsAmount(creditsAmount: String) = creditsAmount(JsonField.of(creditsAmount))

        /**
         * Sets [Builder.creditsAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditsAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditsAmount(creditsAmount: JsonField<String>) = apply {
            this.creditsAmount = creditsAmount
        }

        /** Customer's current overage balance for this entitlement */
        fun overageBalance(overageBalance: String) = overageBalance(JsonField.of(overageBalance))

        /**
         * Sets [Builder.overageBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageBalance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overageBalance(overageBalance: JsonField<String>) = apply {
            this.overageBalance = overageBalance
        }

        /**
         * Controls how overage is handled at the end of a billing cycle.
         *
         * |Preset                    |Charge at billing|Credits reduce overage|Preserve overage at reset|
         * |--------------------------|:---------------:|:--------------------:|:-----------------------:|
         * |`forgive_at_reset`        |       No        |          No          |           No            |
         * |`invoice_at_billing`      |       Yes       |          No          |           No            |
         * |`carry_deficit`           |       No        |          No          |           Yes           |
         * |`carry_deficit_auto_repay`|       No        |         Yes          |           Yes           |
         */
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

        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Customer's current remaining credit balance for this entitlement */
        fun remainingBalance(remainingBalance: String) =
            remainingBalance(JsonField.of(remainingBalance))

        /**
         * Sets [Builder.remainingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingBalance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remainingBalance(remainingBalance: JsonField<String>) = apply {
            this.remainingBalance = remainingBalance
        }

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

        /** Unit label for the credit entitlement (e.g., "API Calls", "Tokens") */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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

        fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Int?) =
            lowBalanceThresholdPercent(JsonField.ofNullable(lowBalanceThresholdPercent))

        /**
         * Alias for [Builder.lowBalanceThresholdPercent].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Int) =
            lowBalanceThresholdPercent(lowBalanceThresholdPercent as Int?)

        /**
         * Sets [Builder.lowBalanceThresholdPercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowBalanceThresholdPercent] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: JsonField<Int>) = apply {
            this.lowBalanceThresholdPercent = lowBalanceThresholdPercent
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

        fun overageLimit(overageLimit: String?) = overageLimit(JsonField.ofNullable(overageLimit))

        /**
         * Sets [Builder.overageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageLimit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overageLimit(overageLimit: JsonField<String>) = apply {
            this.overageLimit = overageLimit
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
         * Returns an immutable instance of [CreditEntitlementCartResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .creditEntitlementId()
         * .creditEntitlementName()
         * .creditsAmount()
         * .overageBalance()
         * .overageBehavior()
         * .overageEnabled()
         * .productId()
         * .remainingBalance()
         * .rolloverEnabled()
         * .unit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditEntitlementCartResponse =
            CreditEntitlementCartResponse(
                checkRequired("creditEntitlementId", creditEntitlementId),
                checkRequired("creditEntitlementName", creditEntitlementName),
                checkRequired("creditsAmount", creditsAmount),
                checkRequired("overageBalance", overageBalance),
                checkRequired("overageBehavior", overageBehavior),
                checkRequired("overageEnabled", overageEnabled),
                checkRequired("productId", productId),
                checkRequired("remainingBalance", remainingBalance),
                checkRequired("rolloverEnabled", rolloverEnabled),
                checkRequired("unit", unit),
                expiresAfterDays,
                lowBalanceThresholdPercent,
                maxRolloverCount,
                overageLimit,
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
    fun validate(): CreditEntitlementCartResponse = apply {
        if (validated) {
            return@apply
        }

        creditEntitlementId()
        creditEntitlementName()
        creditsAmount()
        overageBalance()
        overageBehavior().validate()
        overageEnabled()
        productId()
        remainingBalance()
        rolloverEnabled()
        unit()
        expiresAfterDays()
        lowBalanceThresholdPercent()
        maxRolloverCount()
        overageLimit()
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
        (if (creditEntitlementId.asKnown() == null) 0 else 1) +
            (if (creditEntitlementName.asKnown() == null) 0 else 1) +
            (if (creditsAmount.asKnown() == null) 0 else 1) +
            (if (overageBalance.asKnown() == null) 0 else 1) +
            (overageBehavior.asKnown()?.validity() ?: 0) +
            (if (overageEnabled.asKnown() == null) 0 else 1) +
            (if (productId.asKnown() == null) 0 else 1) +
            (if (remainingBalance.asKnown() == null) 0 else 1) +
            (if (rolloverEnabled.asKnown() == null) 0 else 1) +
            (if (unit.asKnown() == null) 0 else 1) +
            (if (expiresAfterDays.asKnown() == null) 0 else 1) +
            (if (lowBalanceThresholdPercent.asKnown() == null) 0 else 1) +
            (if (maxRolloverCount.asKnown() == null) 0 else 1) +
            (if (overageLimit.asKnown() == null) 0 else 1) +
            (if (rolloverPercentage.asKnown() == null) 0 else 1) +
            (if (rolloverTimeframeCount.asKnown() == null) 0 else 1) +
            (rolloverTimeframeInterval.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditEntitlementCartResponse &&
            creditEntitlementId == other.creditEntitlementId &&
            creditEntitlementName == other.creditEntitlementName &&
            creditsAmount == other.creditsAmount &&
            overageBalance == other.overageBalance &&
            overageBehavior == other.overageBehavior &&
            overageEnabled == other.overageEnabled &&
            productId == other.productId &&
            remainingBalance == other.remainingBalance &&
            rolloverEnabled == other.rolloverEnabled &&
            unit == other.unit &&
            expiresAfterDays == other.expiresAfterDays &&
            lowBalanceThresholdPercent == other.lowBalanceThresholdPercent &&
            maxRolloverCount == other.maxRolloverCount &&
            overageLimit == other.overageLimit &&
            rolloverPercentage == other.rolloverPercentage &&
            rolloverTimeframeCount == other.rolloverTimeframeCount &&
            rolloverTimeframeInterval == other.rolloverTimeframeInterval &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            creditEntitlementId,
            creditEntitlementName,
            creditsAmount,
            overageBalance,
            overageBehavior,
            overageEnabled,
            productId,
            remainingBalance,
            rolloverEnabled,
            unit,
            expiresAfterDays,
            lowBalanceThresholdPercent,
            maxRolloverCount,
            overageLimit,
            rolloverPercentage,
            rolloverTimeframeCount,
            rolloverTimeframeInterval,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditEntitlementCartResponse{creditEntitlementId=$creditEntitlementId, creditEntitlementName=$creditEntitlementName, creditsAmount=$creditsAmount, overageBalance=$overageBalance, overageBehavior=$overageBehavior, overageEnabled=$overageEnabled, productId=$productId, remainingBalance=$remainingBalance, rolloverEnabled=$rolloverEnabled, unit=$unit, expiresAfterDays=$expiresAfterDays, lowBalanceThresholdPercent=$lowBalanceThresholdPercent, maxRolloverCount=$maxRolloverCount, overageLimit=$overageLimit, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, additionalProperties=$additionalProperties}"
}
