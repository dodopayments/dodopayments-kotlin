// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Request struct for attaching a credit entitlement to a product */
class AttachCreditEntitlement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creditEntitlementId: JsonField<String>,
    private val creditsAmount: JsonField<String>,
    private val currency: JsonField<Currency>,
    private val expiresAfterDays: JsonField<Int>,
    private val lowBalanceThresholdPercent: JsonField<Int>,
    private val maxRolloverCount: JsonField<Int>,
    private val overageBehavior: JsonField<CbbOverageBehavior>,
    private val overageEnabled: JsonField<Boolean>,
    private val overageLimit: JsonField<String>,
    private val pricePerUnit: JsonField<String>,
    private val prorationBehavior: JsonField<CbbProrationBehavior>,
    private val rolloverEnabled: JsonField<Boolean>,
    private val rolloverPercentage: JsonField<Int>,
    private val rolloverTimeframeCount: JsonField<Int>,
    private val rolloverTimeframeInterval: JsonField<TimeInterval>,
    private val trialCredits: JsonField<String>,
    private val trialCreditsExpireAfterTrial: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        creditEntitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credits_amount")
        @ExcludeMissing
        creditsAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("expires_after_days")
        @ExcludeMissing
        expiresAfterDays: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("low_balance_threshold_percent")
        @ExcludeMissing
        lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("max_rollover_count")
        @ExcludeMissing
        maxRolloverCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("overage_behavior")
        @ExcludeMissing
        overageBehavior: JsonField<CbbOverageBehavior> = JsonMissing.of(),
        @JsonProperty("overage_enabled")
        @ExcludeMissing
        overageEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("overage_limit")
        @ExcludeMissing
        overageLimit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        pricePerUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proration_behavior")
        @ExcludeMissing
        prorationBehavior: JsonField<CbbProrationBehavior> = JsonMissing.of(),
        @JsonProperty("rollover_enabled")
        @ExcludeMissing
        rolloverEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rollover_percentage")
        @ExcludeMissing
        rolloverPercentage: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rollover_timeframe_count")
        @ExcludeMissing
        rolloverTimeframeCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rollover_timeframe_interval")
        @ExcludeMissing
        rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of(),
        @JsonProperty("trial_credits")
        @ExcludeMissing
        trialCredits: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trial_credits_expire_after_trial")
        @ExcludeMissing
        trialCreditsExpireAfterTrial: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        creditEntitlementId,
        creditsAmount,
        currency,
        expiresAfterDays,
        lowBalanceThresholdPercent,
        maxRolloverCount,
        overageBehavior,
        overageEnabled,
        overageLimit,
        pricePerUnit,
        prorationBehavior,
        rolloverEnabled,
        rolloverPercentage,
        rolloverTimeframeCount,
        rolloverTimeframeInterval,
        trialCredits,
        trialCreditsExpireAfterTrial,
        mutableMapOf(),
    )

    /**
     * ID of the credit entitlement to attach
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

    /**
     * Number of credits to grant when this product is purchased
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditsAmount(): String = creditsAmount.getRequired("credits_amount")

    /**
     * Currency for credit-related pricing
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = currency.getNullable("currency")

    /**
     * Number of days after which credits expire
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAfterDays(): Int? = expiresAfterDays.getNullable("expires_after_days")

    /**
     * Balance threshold percentage for low balance notifications (0-100)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lowBalanceThresholdPercent(): Int? =
        lowBalanceThresholdPercent.getNullable("low_balance_threshold_percent")

    /**
     * Maximum number of rollover cycles allowed
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxRolloverCount(): Int? = maxRolloverCount.getNullable("max_rollover_count")

    /**
     * Controls how overage is handled at billing cycle end.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overageBehavior(): CbbOverageBehavior? = overageBehavior.getNullable("overage_behavior")

    /**
     * Whether overage usage is allowed beyond credit balance
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overageEnabled(): Boolean? = overageEnabled.getNullable("overage_enabled")

    /**
     * Maximum amount of overage allowed
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overageLimit(): String? = overageLimit.getNullable("overage_limit")

    /**
     * Price per credit unit for purchasing additional credits
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pricePerUnit(): String? = pricePerUnit.getNullable("price_per_unit")

    /**
     * Proration behavior for credit grants during plan changes
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun prorationBehavior(): CbbProrationBehavior? =
        prorationBehavior.getNullable("proration_behavior")

    /**
     * Whether unused credits can roll over to the next billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverEnabled(): Boolean? = rolloverEnabled.getNullable("rollover_enabled")

    /**
     * Percentage of unused credits that can roll over (0-100)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverPercentage(): Int? = rolloverPercentage.getNullable("rollover_percentage")

    /**
     * Number of timeframe units for rollover window
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverTimeframeCount(): Int? =
        rolloverTimeframeCount.getNullable("rollover_timeframe_count")

    /**
     * Time interval for rollover window (day, week, month, year)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverTimeframeInterval(): TimeInterval? =
        rolloverTimeframeInterval.getNullable("rollover_timeframe_interval")

    /**
     * Credits granted during trial period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trialCredits(): String? = trialCredits.getNullable("trial_credits")

    /**
     * Whether trial credits expire when trial ends
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trialCreditsExpireAfterTrial(): Boolean? =
        trialCreditsExpireAfterTrial.getNullable("trial_credits_expire_after_trial")

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
     * Returns the raw JSON value of [creditsAmount].
     *
     * Unlike [creditsAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credits_amount")
    @ExcludeMissing
    fun _creditsAmount(): JsonField<String> = creditsAmount

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

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
     * Returns the raw JSON value of [overageLimit].
     *
     * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overage_limit")
    @ExcludeMissing
    fun _overageLimit(): JsonField<String> = overageLimit

    /**
     * Returns the raw JSON value of [pricePerUnit].
     *
     * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_per_unit")
    @ExcludeMissing
    fun _pricePerUnit(): JsonField<String> = pricePerUnit

    /**
     * Returns the raw JSON value of [prorationBehavior].
     *
     * Unlike [prorationBehavior], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("proration_behavior")
    @ExcludeMissing
    fun _prorationBehavior(): JsonField<CbbProrationBehavior> = prorationBehavior

    /**
     * Returns the raw JSON value of [rolloverEnabled].
     *
     * Unlike [rolloverEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rollover_enabled")
    @ExcludeMissing
    fun _rolloverEnabled(): JsonField<Boolean> = rolloverEnabled

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

    /**
     * Returns the raw JSON value of [trialCredits].
     *
     * Unlike [trialCredits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_credits")
    @ExcludeMissing
    fun _trialCredits(): JsonField<String> = trialCredits

    /**
     * Returns the raw JSON value of [trialCreditsExpireAfterTrial].
     *
     * Unlike [trialCreditsExpireAfterTrial], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("trial_credits_expire_after_trial")
    @ExcludeMissing
    fun _trialCreditsExpireAfterTrial(): JsonField<Boolean> = trialCreditsExpireAfterTrial

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
         * Returns a mutable builder for constructing an instance of [AttachCreditEntitlement].
         *
         * The following fields are required:
         * ```kotlin
         * .creditEntitlementId()
         * .creditsAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AttachCreditEntitlement]. */
    class Builder internal constructor() {

        private var creditEntitlementId: JsonField<String>? = null
        private var creditsAmount: JsonField<String>? = null
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var expiresAfterDays: JsonField<Int> = JsonMissing.of()
        private var lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of()
        private var maxRolloverCount: JsonField<Int> = JsonMissing.of()
        private var overageBehavior: JsonField<CbbOverageBehavior> = JsonMissing.of()
        private var overageEnabled: JsonField<Boolean> = JsonMissing.of()
        private var overageLimit: JsonField<String> = JsonMissing.of()
        private var pricePerUnit: JsonField<String> = JsonMissing.of()
        private var prorationBehavior: JsonField<CbbProrationBehavior> = JsonMissing.of()
        private var rolloverEnabled: JsonField<Boolean> = JsonMissing.of()
        private var rolloverPercentage: JsonField<Int> = JsonMissing.of()
        private var rolloverTimeframeCount: JsonField<Int> = JsonMissing.of()
        private var rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of()
        private var trialCredits: JsonField<String> = JsonMissing.of()
        private var trialCreditsExpireAfterTrial: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(attachCreditEntitlement: AttachCreditEntitlement) = apply {
            creditEntitlementId = attachCreditEntitlement.creditEntitlementId
            creditsAmount = attachCreditEntitlement.creditsAmount
            currency = attachCreditEntitlement.currency
            expiresAfterDays = attachCreditEntitlement.expiresAfterDays
            lowBalanceThresholdPercent = attachCreditEntitlement.lowBalanceThresholdPercent
            maxRolloverCount = attachCreditEntitlement.maxRolloverCount
            overageBehavior = attachCreditEntitlement.overageBehavior
            overageEnabled = attachCreditEntitlement.overageEnabled
            overageLimit = attachCreditEntitlement.overageLimit
            pricePerUnit = attachCreditEntitlement.pricePerUnit
            prorationBehavior = attachCreditEntitlement.prorationBehavior
            rolloverEnabled = attachCreditEntitlement.rolloverEnabled
            rolloverPercentage = attachCreditEntitlement.rolloverPercentage
            rolloverTimeframeCount = attachCreditEntitlement.rolloverTimeframeCount
            rolloverTimeframeInterval = attachCreditEntitlement.rolloverTimeframeInterval
            trialCredits = attachCreditEntitlement.trialCredits
            trialCreditsExpireAfterTrial = attachCreditEntitlement.trialCreditsExpireAfterTrial
            additionalProperties = attachCreditEntitlement.additionalProperties.toMutableMap()
        }

        /** ID of the credit entitlement to attach */
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

        /** Number of credits to grant when this product is purchased */
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

        /** Currency for credit-related pricing */
        fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Number of days after which credits expire */
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

        /** Balance threshold percentage for low balance notifications (0-100) */
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

        /** Maximum number of rollover cycles allowed */
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

        /** Controls how overage is handled at billing cycle end. */
        fun overageBehavior(overageBehavior: CbbOverageBehavior?) =
            overageBehavior(JsonField.ofNullable(overageBehavior))

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

        /** Whether overage usage is allowed beyond credit balance */
        fun overageEnabled(overageEnabled: Boolean?) =
            overageEnabled(JsonField.ofNullable(overageEnabled))

        /**
         * Alias for [Builder.overageEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun overageEnabled(overageEnabled: Boolean) = overageEnabled(overageEnabled as Boolean?)

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

        /** Maximum amount of overage allowed */
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

        /** Price per credit unit for purchasing additional credits */
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

        /** Proration behavior for credit grants during plan changes */
        fun prorationBehavior(prorationBehavior: CbbProrationBehavior?) =
            prorationBehavior(JsonField.ofNullable(prorationBehavior))

        /**
         * Sets [Builder.prorationBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prorationBehavior] with a well-typed
         * [CbbProrationBehavior] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun prorationBehavior(prorationBehavior: JsonField<CbbProrationBehavior>) = apply {
            this.prorationBehavior = prorationBehavior
        }

        /** Whether unused credits can roll over to the next billing period */
        fun rolloverEnabled(rolloverEnabled: Boolean?) =
            rolloverEnabled(JsonField.ofNullable(rolloverEnabled))

        /**
         * Alias for [Builder.rolloverEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rolloverEnabled(rolloverEnabled: Boolean) = rolloverEnabled(rolloverEnabled as Boolean?)

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

        /** Percentage of unused credits that can roll over (0-100) */
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

        /** Number of timeframe units for rollover window */
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

        /** Time interval for rollover window (day, week, month, year) */
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

        /** Credits granted during trial period */
        fun trialCredits(trialCredits: String?) = trialCredits(JsonField.ofNullable(trialCredits))

        /**
         * Sets [Builder.trialCredits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialCredits] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trialCredits(trialCredits: JsonField<String>) = apply {
            this.trialCredits = trialCredits
        }

        /** Whether trial credits expire when trial ends */
        fun trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial: Boolean?) =
            trialCreditsExpireAfterTrial(JsonField.ofNullable(trialCreditsExpireAfterTrial))

        /**
         * Alias for [Builder.trialCreditsExpireAfterTrial].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial: Boolean) =
            trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial as Boolean?)

        /**
         * Sets [Builder.trialCreditsExpireAfterTrial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialCreditsExpireAfterTrial] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial: JsonField<Boolean>) = apply {
            this.trialCreditsExpireAfterTrial = trialCreditsExpireAfterTrial
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
         * Returns an immutable instance of [AttachCreditEntitlement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .creditEntitlementId()
         * .creditsAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttachCreditEntitlement =
            AttachCreditEntitlement(
                checkRequired("creditEntitlementId", creditEntitlementId),
                checkRequired("creditsAmount", creditsAmount),
                currency,
                expiresAfterDays,
                lowBalanceThresholdPercent,
                maxRolloverCount,
                overageBehavior,
                overageEnabled,
                overageLimit,
                pricePerUnit,
                prorationBehavior,
                rolloverEnabled,
                rolloverPercentage,
                rolloverTimeframeCount,
                rolloverTimeframeInterval,
                trialCredits,
                trialCreditsExpireAfterTrial,
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
    fun validate(): AttachCreditEntitlement = apply {
        if (validated) {
            return@apply
        }

        creditEntitlementId()
        creditsAmount()
        currency()?.validate()
        expiresAfterDays()
        lowBalanceThresholdPercent()
        maxRolloverCount()
        overageBehavior()?.validate()
        overageEnabled()
        overageLimit()
        pricePerUnit()
        prorationBehavior()?.validate()
        rolloverEnabled()
        rolloverPercentage()
        rolloverTimeframeCount()
        rolloverTimeframeInterval()?.validate()
        trialCredits()
        trialCreditsExpireAfterTrial()
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
            (if (creditsAmount.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (expiresAfterDays.asKnown() == null) 0 else 1) +
            (if (lowBalanceThresholdPercent.asKnown() == null) 0 else 1) +
            (if (maxRolloverCount.asKnown() == null) 0 else 1) +
            (overageBehavior.asKnown()?.validity() ?: 0) +
            (if (overageEnabled.asKnown() == null) 0 else 1) +
            (if (overageLimit.asKnown() == null) 0 else 1) +
            (if (pricePerUnit.asKnown() == null) 0 else 1) +
            (prorationBehavior.asKnown()?.validity() ?: 0) +
            (if (rolloverEnabled.asKnown() == null) 0 else 1) +
            (if (rolloverPercentage.asKnown() == null) 0 else 1) +
            (if (rolloverTimeframeCount.asKnown() == null) 0 else 1) +
            (rolloverTimeframeInterval.asKnown()?.validity() ?: 0) +
            (if (trialCredits.asKnown() == null) 0 else 1) +
            (if (trialCreditsExpireAfterTrial.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachCreditEntitlement &&
            creditEntitlementId == other.creditEntitlementId &&
            creditsAmount == other.creditsAmount &&
            currency == other.currency &&
            expiresAfterDays == other.expiresAfterDays &&
            lowBalanceThresholdPercent == other.lowBalanceThresholdPercent &&
            maxRolloverCount == other.maxRolloverCount &&
            overageBehavior == other.overageBehavior &&
            overageEnabled == other.overageEnabled &&
            overageLimit == other.overageLimit &&
            pricePerUnit == other.pricePerUnit &&
            prorationBehavior == other.prorationBehavior &&
            rolloverEnabled == other.rolloverEnabled &&
            rolloverPercentage == other.rolloverPercentage &&
            rolloverTimeframeCount == other.rolloverTimeframeCount &&
            rolloverTimeframeInterval == other.rolloverTimeframeInterval &&
            trialCredits == other.trialCredits &&
            trialCreditsExpireAfterTrial == other.trialCreditsExpireAfterTrial &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            creditEntitlementId,
            creditsAmount,
            currency,
            expiresAfterDays,
            lowBalanceThresholdPercent,
            maxRolloverCount,
            overageBehavior,
            overageEnabled,
            overageLimit,
            pricePerUnit,
            prorationBehavior,
            rolloverEnabled,
            rolloverPercentage,
            rolloverTimeframeCount,
            rolloverTimeframeInterval,
            trialCredits,
            trialCreditsExpireAfterTrial,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttachCreditEntitlement{creditEntitlementId=$creditEntitlementId, creditsAmount=$creditsAmount, currency=$currency, expiresAfterDays=$expiresAfterDays, lowBalanceThresholdPercent=$lowBalanceThresholdPercent, maxRolloverCount=$maxRolloverCount, overageBehavior=$overageBehavior, overageEnabled=$overageEnabled, overageLimit=$overageLimit, pricePerUnit=$pricePerUnit, prorationBehavior=$prorationBehavior, rolloverEnabled=$rolloverEnabled, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, trialCredits=$trialCredits, trialCreditsExpireAfterTrial=$trialCreditsExpireAfterTrial, additionalProperties=$additionalProperties}"
}
