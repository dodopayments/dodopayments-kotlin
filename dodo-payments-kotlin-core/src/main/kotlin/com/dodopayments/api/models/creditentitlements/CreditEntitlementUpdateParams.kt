// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/**
 * Allows partial updates to a credit entitlement's configuration. Only the fields provided in the
 * request body will be updated; all other fields remain unchanged. This endpoint supports nullable
 * fields using the double option pattern.
 *
 * # Authentication
 * Requires an API key with `Editor` role.
 *
 * # Path Parameters
 * - `id` - The unique identifier of the credit entitlement to update (format: `cde_...`)
 *
 * # Request Body (all fields optional)
 * - `name` - Human-readable name of the credit entitlement (1-255 characters)
 * - `description` - Optional description (max 1000 characters)
 * - `unit` - Unit of measurement for the credit (1-50 characters)
 *
 * Note: `precision` cannot be modified after creation as it would invalidate existing grants.
 * - `expires_after_days` - Number of days after which credits expire (use `null` to remove
 *   expiration)
 * - `rollover_enabled` - Whether unused credits can rollover to the next period
 * - `rollover_percentage` - Percentage of unused credits that rollover (0-100, nullable)
 * - `rollover_timeframe_count` - Count of timeframe periods for rollover limit (nullable)
 * - `rollover_timeframe_interval` - Interval type (day, week, month, year, nullable)
 * - `max_rollover_count` - Maximum number of times credits can be rolled over (nullable)
 * - `overage_enabled` - Whether overage charges apply when credits run out
 * - `overage_limit` - Maximum overage units allowed (nullable)
 * - `currency` - Currency for pricing (nullable)
 * - `price_per_unit` - Price per credit unit (decimal, nullable)
 *
 * # Responses
 * - `200 OK` - Credit entitlement updated successfully
 * - `404 Not Found` - Credit entitlement does not exist or does not belong to the authenticated
 *   business
 * - `422 Unprocessable Entity` - Invalid request parameters or validation failure
 * - `500 Internal Server Error` - Database or server error
 *
 * # Business Logic
 * - Only non-deleted credit entitlements can be updated
 * - Fields set to `null` explicitly will clear the database value (using double option pattern)
 * - The `updated_at` timestamp is automatically updated on successful modification
 * - Changes take effect immediately but do not retroactively affect existing credit grants
 * - The merged state is validated: currency required with price, rollover timeframe fields
 *   together, price required for overage
 */
class CreditEntitlementUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Currency for pricing
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = body.currency()

    /**
     * Optional description of the credit entitlement
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Number of days after which credits expire
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAfterDays(): Int? = body.expiresAfterDays()

    /**
     * Maximum number of times credits can be rolled over
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxRolloverCount(): Int? = body.maxRolloverCount()

    /**
     * Name of the credit entitlement
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * Controls how overage is handled at billing cycle end.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overageBehavior(): CbbOverageBehavior? = body.overageBehavior()

    /**
     * Whether overage charges are enabled when credits run out
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overageEnabled(): Boolean? = body.overageEnabled()

    /**
     * Maximum overage units allowed
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overageLimit(): Long? = body.overageLimit()

    /**
     * Price per credit unit
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pricePerUnit(): String? = body.pricePerUnit()

    /**
     * Whether rollover is enabled for unused credits
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverEnabled(): Boolean? = body.rolloverEnabled()

    /**
     * Percentage of unused credits that can rollover (0-100)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverPercentage(): Int? = body.rolloverPercentage()

    /**
     * Count of timeframe periods for rollover limit
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverTimeframeCount(): Int? = body.rolloverTimeframeCount()

    /**
     * Interval type for rollover timeframe
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rolloverTimeframeInterval(): TimeInterval? = body.rolloverTimeframeInterval()

    /**
     * Unit of measurement for the credit (e.g., "API Calls", "Tokens", "Credits")
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun unit(): String? = body.unit()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<Currency> = body._currency()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [expiresAfterDays].
     *
     * Unlike [expiresAfterDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expiresAfterDays(): JsonField<Int> = body._expiresAfterDays()

    /**
     * Returns the raw JSON value of [maxRolloverCount].
     *
     * Unlike [maxRolloverCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxRolloverCount(): JsonField<Int> = body._maxRolloverCount()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [overageBehavior].
     *
     * Unlike [overageBehavior], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overageBehavior(): JsonField<CbbOverageBehavior> = body._overageBehavior()

    /**
     * Returns the raw JSON value of [overageEnabled].
     *
     * Unlike [overageEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overageEnabled(): JsonField<Boolean> = body._overageEnabled()

    /**
     * Returns the raw JSON value of [overageLimit].
     *
     * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overageLimit(): JsonField<Long> = body._overageLimit()

    /**
     * Returns the raw JSON value of [pricePerUnit].
     *
     * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pricePerUnit(): JsonField<String> = body._pricePerUnit()

    /**
     * Returns the raw JSON value of [rolloverEnabled].
     *
     * Unlike [rolloverEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rolloverEnabled(): JsonField<Boolean> = body._rolloverEnabled()

    /**
     * Returns the raw JSON value of [rolloverPercentage].
     *
     * Unlike [rolloverPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _rolloverPercentage(): JsonField<Int> = body._rolloverPercentage()

    /**
     * Returns the raw JSON value of [rolloverTimeframeCount].
     *
     * Unlike [rolloverTimeframeCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _rolloverTimeframeCount(): JsonField<Int> = body._rolloverTimeframeCount()

    /**
     * Returns the raw JSON value of [rolloverTimeframeInterval].
     *
     * Unlike [rolloverTimeframeInterval], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _rolloverTimeframeInterval(): JsonField<TimeInterval> = body._rolloverTimeframeInterval()

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _unit(): JsonField<String> = body._unit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CreditEntitlementUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CreditEntitlementUpdateParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditEntitlementUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(creditEntitlementUpdateParams: CreditEntitlementUpdateParams) = apply {
            id = creditEntitlementUpdateParams.id
            body = creditEntitlementUpdateParams.body.toBuilder()
            additionalHeaders = creditEntitlementUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = creditEntitlementUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [currency]
         * - [description]
         * - [expiresAfterDays]
         * - [maxRolloverCount]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Currency for pricing */
        fun currency(currency: Currency?) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        /** Optional description of the credit entitlement */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Number of days after which credits expire */
        fun expiresAfterDays(expiresAfterDays: Int?) = apply {
            body.expiresAfterDays(expiresAfterDays)
        }

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
            body.expiresAfterDays(expiresAfterDays)
        }

        /** Maximum number of times credits can be rolled over */
        fun maxRolloverCount(maxRolloverCount: Int?) = apply {
            body.maxRolloverCount(maxRolloverCount)
        }

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
            body.maxRolloverCount(maxRolloverCount)
        }

        /** Name of the credit entitlement */
        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Controls how overage is handled at billing cycle end. */
        fun overageBehavior(overageBehavior: CbbOverageBehavior?) = apply {
            body.overageBehavior(overageBehavior)
        }

        /**
         * Sets [Builder.overageBehavior] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overageBehavior] with a well-typed [CbbOverageBehavior]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overageBehavior(overageBehavior: JsonField<CbbOverageBehavior>) = apply {
            body.overageBehavior(overageBehavior)
        }

        /** Whether overage charges are enabled when credits run out */
        fun overageEnabled(overageEnabled: Boolean?) = apply { body.overageEnabled(overageEnabled) }

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
            body.overageEnabled(overageEnabled)
        }

        /** Maximum overage units allowed */
        fun overageLimit(overageLimit: Long?) = apply { body.overageLimit(overageLimit) }

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
        fun overageLimit(overageLimit: JsonField<Long>) = apply { body.overageLimit(overageLimit) }

        /** Price per credit unit */
        fun pricePerUnit(pricePerUnit: String?) = apply { body.pricePerUnit(pricePerUnit) }

        /**
         * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricePerUnit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
            body.pricePerUnit(pricePerUnit)
        }

        /** Whether rollover is enabled for unused credits */
        fun rolloverEnabled(rolloverEnabled: Boolean?) = apply {
            body.rolloverEnabled(rolloverEnabled)
        }

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
            body.rolloverEnabled(rolloverEnabled)
        }

        /** Percentage of unused credits that can rollover (0-100) */
        fun rolloverPercentage(rolloverPercentage: Int?) = apply {
            body.rolloverPercentage(rolloverPercentage)
        }

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
            body.rolloverPercentage(rolloverPercentage)
        }

        /** Count of timeframe periods for rollover limit */
        fun rolloverTimeframeCount(rolloverTimeframeCount: Int?) = apply {
            body.rolloverTimeframeCount(rolloverTimeframeCount)
        }

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
            body.rolloverTimeframeCount(rolloverTimeframeCount)
        }

        /** Interval type for rollover timeframe */
        fun rolloverTimeframeInterval(rolloverTimeframeInterval: TimeInterval?) = apply {
            body.rolloverTimeframeInterval(rolloverTimeframeInterval)
        }

        /**
         * Sets [Builder.rolloverTimeframeInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverTimeframeInterval] with a well-typed
         * [TimeInterval] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun rolloverTimeframeInterval(rolloverTimeframeInterval: JsonField<TimeInterval>) = apply {
            body.rolloverTimeframeInterval(rolloverTimeframeInterval)
        }

        /** Unit of measurement for the credit (e.g., "API Calls", "Tokens", "Credits") */
        fun unit(unit: String?) = apply { body.unit(unit) }

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { body.unit(unit) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CreditEntitlementUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreditEntitlementUpdateParams =
            CreditEntitlementUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val description: JsonField<String>,
        private val expiresAfterDays: JsonField<Int>,
        private val maxRolloverCount: JsonField<Int>,
        private val name: JsonField<String>,
        private val overageBehavior: JsonField<CbbOverageBehavior>,
        private val overageEnabled: JsonField<Boolean>,
        private val overageLimit: JsonField<Long>,
        private val pricePerUnit: JsonField<String>,
        private val rolloverEnabled: JsonField<Boolean>,
        private val rolloverPercentage: JsonField<Int>,
        private val rolloverTimeframeCount: JsonField<Int>,
        private val rolloverTimeframeInterval: JsonField<TimeInterval>,
        private val unit: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_after_days")
            @ExcludeMissing
            expiresAfterDays: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("max_rollover_count")
            @ExcludeMissing
            maxRolloverCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overage_behavior")
            @ExcludeMissing
            overageBehavior: JsonField<CbbOverageBehavior> = JsonMissing.of(),
            @JsonProperty("overage_enabled")
            @ExcludeMissing
            overageEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("overage_limit")
            @ExcludeMissing
            overageLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price_per_unit")
            @ExcludeMissing
            pricePerUnit: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
        ) : this(
            currency,
            description,
            expiresAfterDays,
            maxRolloverCount,
            name,
            overageBehavior,
            overageEnabled,
            overageLimit,
            pricePerUnit,
            rolloverEnabled,
            rolloverPercentage,
            rolloverTimeframeCount,
            rolloverTimeframeInterval,
            unit,
            mutableMapOf(),
        )

        /**
         * Currency for pricing
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): Currency? = currency.getNullable("currency")

        /**
         * Optional description of the credit entitlement
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Number of days after which credits expire
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAfterDays(): Int? = expiresAfterDays.getNullable("expires_after_days")

        /**
         * Maximum number of times credits can be rolled over
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxRolloverCount(): Int? = maxRolloverCount.getNullable("max_rollover_count")

        /**
         * Name of the credit entitlement
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Controls how overage is handled at billing cycle end.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageBehavior(): CbbOverageBehavior? = overageBehavior.getNullable("overage_behavior")

        /**
         * Whether overage charges are enabled when credits run out
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageEnabled(): Boolean? = overageEnabled.getNullable("overage_enabled")

        /**
         * Maximum overage units allowed
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageLimit(): Long? = overageLimit.getNullable("overage_limit")

        /**
         * Price per credit unit
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pricePerUnit(): String? = pricePerUnit.getNullable("price_per_unit")

        /**
         * Whether rollover is enabled for unused credits
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverEnabled(): Boolean? = rolloverEnabled.getNullable("rollover_enabled")

        /**
         * Percentage of unused credits that can rollover (0-100)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverPercentage(): Int? = rolloverPercentage.getNullable("rollover_percentage")

        /**
         * Count of timeframe periods for rollover limit
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeCount(): Int? =
            rolloverTimeframeCount.getNullable("rollover_timeframe_count")

        /**
         * Interval type for rollover timeframe
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeInterval(): TimeInterval? =
            rolloverTimeframeInterval.getNullable("rollover_timeframe_interval")

        /**
         * Unit of measurement for the credit (e.g., "API Calls", "Tokens", "Credits")
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun unit(): String? = unit.getNullable("unit")

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
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [overageBehavior].
         *
         * Unlike [overageBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_behavior")
        @ExcludeMissing
        fun _overageBehavior(): JsonField<CbbOverageBehavior> = overageBehavior

        /**
         * Returns the raw JSON value of [overageEnabled].
         *
         * Unlike [overageEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_enabled")
        @ExcludeMissing
        fun _overageEnabled(): JsonField<Boolean> = overageEnabled

        /**
         * Returns the raw JSON value of [overageLimit].
         *
         * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_limit")
        @ExcludeMissing
        fun _overageLimit(): JsonField<Long> = overageLimit

        /**
         * Returns the raw JSON value of [pricePerUnit].
         *
         * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        fun _pricePerUnit(): JsonField<String> = pricePerUnit

        /**
         * Returns the raw JSON value of [rolloverEnabled].
         *
         * Unlike [rolloverEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_enabled")
        @ExcludeMissing
        fun _rolloverEnabled(): JsonField<Boolean> = rolloverEnabled

        /**
         * Returns the raw JSON value of [rolloverPercentage].
         *
         * Unlike [rolloverPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var expiresAfterDays: JsonField<Int> = JsonMissing.of()
            private var maxRolloverCount: JsonField<Int> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var overageBehavior: JsonField<CbbOverageBehavior> = JsonMissing.of()
            private var overageEnabled: JsonField<Boolean> = JsonMissing.of()
            private var overageLimit: JsonField<Long> = JsonMissing.of()
            private var pricePerUnit: JsonField<String> = JsonMissing.of()
            private var rolloverEnabled: JsonField<Boolean> = JsonMissing.of()
            private var rolloverPercentage: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeCount: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of()
            private var unit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                currency = body.currency
                description = body.description
                expiresAfterDays = body.expiresAfterDays
                maxRolloverCount = body.maxRolloverCount
                name = body.name
                overageBehavior = body.overageBehavior
                overageEnabled = body.overageEnabled
                overageLimit = body.overageLimit
                pricePerUnit = body.pricePerUnit
                rolloverEnabled = body.rolloverEnabled
                rolloverPercentage = body.rolloverPercentage
                rolloverTimeframeCount = body.rolloverTimeframeCount
                rolloverTimeframeInterval = body.rolloverTimeframeInterval
                unit = body.unit
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Currency for pricing */
            fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Optional description of the credit entitlement */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

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
             * You should usually call [Builder.expiresAfterDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAfterDays(expiresAfterDays: JsonField<Int>) = apply {
                this.expiresAfterDays = expiresAfterDays
            }

            /** Maximum number of times credits can be rolled over */
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
             * You should usually call [Builder.maxRolloverCount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRolloverCount(maxRolloverCount: JsonField<Int>) = apply {
                this.maxRolloverCount = maxRolloverCount
            }

            /** Name of the credit entitlement */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Controls how overage is handled at billing cycle end. */
            fun overageBehavior(overageBehavior: CbbOverageBehavior?) =
                overageBehavior(JsonField.ofNullable(overageBehavior))

            /**
             * Sets [Builder.overageBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageBehavior] with a well-typed
             * [CbbOverageBehavior] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun overageBehavior(overageBehavior: JsonField<CbbOverageBehavior>) = apply {
                this.overageBehavior = overageBehavior
            }

            /** Whether overage charges are enabled when credits run out */
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

            /** Maximum overage units allowed */
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
             * You should usually call [Builder.overageLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageLimit(overageLimit: JsonField<Long>) = apply {
                this.overageLimit = overageLimit
            }

            /** Price per credit unit */
            fun pricePerUnit(pricePerUnit: String?) =
                pricePerUnit(JsonField.ofNullable(pricePerUnit))

            /**
             * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricePerUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
                this.pricePerUnit = pricePerUnit
            }

            /** Whether rollover is enabled for unused credits */
            fun rolloverEnabled(rolloverEnabled: Boolean?) =
                rolloverEnabled(JsonField.ofNullable(rolloverEnabled))

            /**
             * Alias for [Builder.rolloverEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverEnabled(rolloverEnabled: Boolean) =
                rolloverEnabled(rolloverEnabled as Boolean?)

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

            /** Percentage of unused credits that can rollover (0-100) */
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

            /** Count of timeframe periods for rollover limit */
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
             * You should usually call [Builder.rolloverTimeframeCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rolloverTimeframeCount(rolloverTimeframeCount: JsonField<Int>) = apply {
                this.rolloverTimeframeCount = rolloverTimeframeCount
            }

            /** Interval type for rollover timeframe */
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: TimeInterval?) =
                rolloverTimeframeInterval(JsonField.ofNullable(rolloverTimeframeInterval))

            /**
             * Sets [Builder.rolloverTimeframeInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverTimeframeInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: JsonField<TimeInterval>) =
                apply {
                    this.rolloverTimeframeInterval = rolloverTimeframeInterval
                }

            /** Unit of measurement for the credit (e.g., "API Calls", "Tokens", "Credits") */
            fun unit(unit: String?) = unit(JsonField.ofNullable(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    currency,
                    description,
                    expiresAfterDays,
                    maxRolloverCount,
                    name,
                    overageBehavior,
                    overageEnabled,
                    overageLimit,
                    pricePerUnit,
                    rolloverEnabled,
                    rolloverPercentage,
                    rolloverTimeframeCount,
                    rolloverTimeframeInterval,
                    unit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            currency()?.validate()
            description()
            expiresAfterDays()
            maxRolloverCount()
            name()
            overageBehavior()?.validate()
            overageEnabled()
            overageLimit()
            pricePerUnit()
            rolloverEnabled()
            rolloverPercentage()
            rolloverTimeframeCount()
            rolloverTimeframeInterval()?.validate()
            unit()
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
        internal fun validity(): Int =
            (currency.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (expiresAfterDays.asKnown() == null) 0 else 1) +
                (if (maxRolloverCount.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (overageBehavior.asKnown()?.validity() ?: 0) +
                (if (overageEnabled.asKnown() == null) 0 else 1) +
                (if (overageLimit.asKnown() == null) 0 else 1) +
                (if (pricePerUnit.asKnown() == null) 0 else 1) +
                (if (rolloverEnabled.asKnown() == null) 0 else 1) +
                (if (rolloverPercentage.asKnown() == null) 0 else 1) +
                (if (rolloverTimeframeCount.asKnown() == null) 0 else 1) +
                (rolloverTimeframeInterval.asKnown()?.validity() ?: 0) +
                (if (unit.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                currency == other.currency &&
                description == other.description &&
                expiresAfterDays == other.expiresAfterDays &&
                maxRolloverCount == other.maxRolloverCount &&
                name == other.name &&
                overageBehavior == other.overageBehavior &&
                overageEnabled == other.overageEnabled &&
                overageLimit == other.overageLimit &&
                pricePerUnit == other.pricePerUnit &&
                rolloverEnabled == other.rolloverEnabled &&
                rolloverPercentage == other.rolloverPercentage &&
                rolloverTimeframeCount == other.rolloverTimeframeCount &&
                rolloverTimeframeInterval == other.rolloverTimeframeInterval &&
                unit == other.unit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                description,
                expiresAfterDays,
                maxRolloverCount,
                name,
                overageBehavior,
                overageEnabled,
                overageLimit,
                pricePerUnit,
                rolloverEnabled,
                rolloverPercentage,
                rolloverTimeframeCount,
                rolloverTimeframeInterval,
                unit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{currency=$currency, description=$description, expiresAfterDays=$expiresAfterDays, maxRolloverCount=$maxRolloverCount, name=$name, overageBehavior=$overageBehavior, overageEnabled=$overageEnabled, overageLimit=$overageLimit, pricePerUnit=$pricePerUnit, rolloverEnabled=$rolloverEnabled, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, unit=$unit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditEntitlementUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CreditEntitlementUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
