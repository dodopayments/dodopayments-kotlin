// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Discount
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Int>,
    private val businessId: JsonField<String>,
    private val code: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerEligibility: JsonField<CustomerEligibility>,
    private val discountId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val preserveOnPlanChange: JsonField<Boolean>,
    private val restrictedTo: JsonField<List<String>>,
    private val timesUsed: JsonField<Int>,
    private val type: JsonField<DiscountType>,
    private val currencyOptions: JsonField<List<CurrencyOption>>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val perCustomerUsageLimit: JsonField<Int>,
    private val startsAt: JsonField<OffsetDateTime>,
    private val subscriptionCycles: JsonField<Int>,
    private val usageLimit: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_eligibility")
        @ExcludeMissing
        customerEligibility: JsonField<CustomerEligibility> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("preserve_on_plan_change")
        @ExcludeMissing
        preserveOnPlanChange: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("restricted_to")
        @ExcludeMissing
        restrictedTo: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("times_used") @ExcludeMissing timesUsed: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("currency_options")
        @ExcludeMissing
        currencyOptions: JsonField<List<CurrencyOption>> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("per_customer_usage_limit")
        @ExcludeMissing
        perCustomerUsageLimit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("starts_at")
        @ExcludeMissing
        startsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subscription_cycles")
        @ExcludeMissing
        subscriptionCycles: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("usage_limit") @ExcludeMissing usageLimit: JsonField<Int> = JsonMissing.of(),
    ) : this(
        amount,
        businessId,
        code,
        createdAt,
        customerEligibility,
        discountId,
        metadata,
        preserveOnPlanChange,
        restrictedTo,
        timesUsed,
        type,
        currencyOptions,
        expiresAt,
        name,
        perCustomerUsageLimit,
        startsAt,
        subscriptionCycles,
        usageLimit,
        mutableMapOf(),
    )

    /**
     * The discount amount in **basis points** (e.g., 540 => 5.4%).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Int = amount.getRequired("amount")

    /**
     * The business this discount belongs to.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * The discount code (up to 16 chars).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * Timestamp when the discount is created
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Who may redeem this discount code.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerEligibility(): CustomerEligibility =
        customerEligibility.getRequired("customer_eligibility")

    /**
     * The unique discount ID
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discountId(): String = discountId.getRequired("discount_id")

    /**
     * Arbitrary key-value metadata. Values can be string, integer, number, or boolean.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Whether this discount should be preserved when a subscription changes plans. Default: false
     * (discount is removed on plan change)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun preserveOnPlanChange(): Boolean =
        preserveOnPlanChange.getRequired("preserve_on_plan_change")

    /**
     * List of product IDs to which this discount is restricted.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun restrictedTo(): List<String> = restrictedTo.getRequired("restricted_to")

    /**
     * How many times this discount has been used.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timesUsed(): Int = timesUsed.getRequired("times_used")

    /**
     * The type of discount (`percentage` or `flat`).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): DiscountType = type.getRequired("type")

    /**
     * Per-currency options (flat deduction / percentage cap + minimum subtotal). Empty for
     * discounts without any configured currency options.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currencyOptions(): List<CurrencyOption>? = currencyOptions.getNullable("currency_options")

    /**
     * Optional date/time after which discount is expired.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /**
     * Name for the Discount
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Maximum number of times a single customer may redeem this discount, if any.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun perCustomerUsageLimit(): Int? =
        perCustomerUsageLimit.getNullable("per_customer_usage_limit")

    /**
     * Optional date/time before which the discount is not yet active. NULL = active immediately.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startsAt(): OffsetDateTime? = startsAt.getNullable("starts_at")

    /**
     * Number of subscription billing cycles this discount is valid for. If not provided, the
     * discount will be applied indefinitely to all recurring payments related to the subscription.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionCycles(): Int? = subscriptionCycles.getNullable("subscription_cycles")

    /**
     * Usage limit for this discount, if any.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun usageLimit(): Int? = usageLimit.getNullable("usage_limit")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Int> = amount

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerEligibility].
     *
     * Unlike [customerEligibility], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customer_eligibility")
    @ExcludeMissing
    fun _customerEligibility(): JsonField<CustomerEligibility> = customerEligibility

    /**
     * Returns the raw JSON value of [discountId].
     *
     * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [preserveOnPlanChange].
     *
     * Unlike [preserveOnPlanChange], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("preserve_on_plan_change")
    @ExcludeMissing
    fun _preserveOnPlanChange(): JsonField<Boolean> = preserveOnPlanChange

    /**
     * Returns the raw JSON value of [restrictedTo].
     *
     * Unlike [restrictedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restricted_to")
    @ExcludeMissing
    fun _restrictedTo(): JsonField<List<String>> = restrictedTo

    /**
     * Returns the raw JSON value of [timesUsed].
     *
     * Unlike [timesUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("times_used") @ExcludeMissing fun _timesUsed(): JsonField<Int> = timesUsed

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<DiscountType> = type

    /**
     * Returns the raw JSON value of [currencyOptions].
     *
     * Unlike [currencyOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_options")
    @ExcludeMissing
    fun _currencyOptions(): JsonField<List<CurrencyOption>> = currencyOptions

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [perCustomerUsageLimit].
     *
     * Unlike [perCustomerUsageLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("per_customer_usage_limit")
    @ExcludeMissing
    fun _perCustomerUsageLimit(): JsonField<Int> = perCustomerUsageLimit

    /**
     * Returns the raw JSON value of [startsAt].
     *
     * Unlike [startsAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starts_at") @ExcludeMissing fun _startsAt(): JsonField<OffsetDateTime> = startsAt

    /**
     * Returns the raw JSON value of [subscriptionCycles].
     *
     * Unlike [subscriptionCycles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscription_cycles")
    @ExcludeMissing
    fun _subscriptionCycles(): JsonField<Int> = subscriptionCycles

    /**
     * Returns the raw JSON value of [usageLimit].
     *
     * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage_limit") @ExcludeMissing fun _usageLimit(): JsonField<Int> = usageLimit

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
         * Returns a mutable builder for constructing an instance of [Discount].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .businessId()
         * .code()
         * .createdAt()
         * .customerEligibility()
         * .discountId()
         * .metadata()
         * .preserveOnPlanChange()
         * .restrictedTo()
         * .timesUsed()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Discount]. */
    class Builder internal constructor() {

        private var amount: JsonField<Int>? = null
        private var businessId: JsonField<String>? = null
        private var code: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerEligibility: JsonField<CustomerEligibility>? = null
        private var discountId: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var preserveOnPlanChange: JsonField<Boolean>? = null
        private var restrictedTo: JsonField<MutableList<String>>? = null
        private var timesUsed: JsonField<Int>? = null
        private var type: JsonField<DiscountType>? = null
        private var currencyOptions: JsonField<MutableList<CurrencyOption>>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var perCustomerUsageLimit: JsonField<Int> = JsonMissing.of()
        private var startsAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subscriptionCycles: JsonField<Int> = JsonMissing.of()
        private var usageLimit: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(discount: Discount) = apply {
            amount = discount.amount
            businessId = discount.businessId
            code = discount.code
            createdAt = discount.createdAt
            customerEligibility = discount.customerEligibility
            discountId = discount.discountId
            metadata = discount.metadata
            preserveOnPlanChange = discount.preserveOnPlanChange
            restrictedTo = discount.restrictedTo.map { it.toMutableList() }
            timesUsed = discount.timesUsed
            type = discount.type
            currencyOptions = discount.currencyOptions.map { it.toMutableList() }
            expiresAt = discount.expiresAt
            name = discount.name
            perCustomerUsageLimit = discount.perCustomerUsageLimit
            startsAt = discount.startsAt
            subscriptionCycles = discount.subscriptionCycles
            usageLimit = discount.usageLimit
            additionalProperties = discount.additionalProperties.toMutableMap()
        }

        /** The discount amount in **basis points** (e.g., 540 => 5.4%). */
        fun amount(amount: Int) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

        /** The business this discount belongs to. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** The discount code (up to 16 chars). */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Timestamp when the discount is created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Who may redeem this discount code. */
        fun customerEligibility(customerEligibility: CustomerEligibility) =
            customerEligibility(JsonField.of(customerEligibility))

        /**
         * Sets [Builder.customerEligibility] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerEligibility] with a well-typed
         * [CustomerEligibility] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun customerEligibility(customerEligibility: JsonField<CustomerEligibility>) = apply {
            this.customerEligibility = customerEligibility
        }

        /** The unique discount ID */
        fun discountId(discountId: String) = discountId(JsonField.of(discountId))

        /**
         * Sets [Builder.discountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** Arbitrary key-value metadata. Values can be string, integer, number, or boolean. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Whether this discount should be preserved when a subscription changes plans. Default:
         * false (discount is removed on plan change)
         */
        fun preserveOnPlanChange(preserveOnPlanChange: Boolean) =
            preserveOnPlanChange(JsonField.of(preserveOnPlanChange))

        /**
         * Sets [Builder.preserveOnPlanChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preserveOnPlanChange] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preserveOnPlanChange(preserveOnPlanChange: JsonField<Boolean>) = apply {
            this.preserveOnPlanChange = preserveOnPlanChange
        }

        /** List of product IDs to which this discount is restricted. */
        fun restrictedTo(restrictedTo: List<String>) = restrictedTo(JsonField.of(restrictedTo))

        /**
         * Sets [Builder.restrictedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictedTo] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restrictedTo(restrictedTo: JsonField<List<String>>) = apply {
            this.restrictedTo = restrictedTo.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.restrictedTo].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRestrictedTo(restrictedTo: String) = apply {
            this.restrictedTo =
                (this.restrictedTo ?: JsonField.of(mutableListOf())).also {
                    checkKnown("restrictedTo", it).add(restrictedTo)
                }
        }

        /** How many times this discount has been used. */
        fun timesUsed(timesUsed: Int) = timesUsed(JsonField.of(timesUsed))

        /**
         * Sets [Builder.timesUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timesUsed] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timesUsed(timesUsed: JsonField<Int>) = apply { this.timesUsed = timesUsed }

        /** The type of discount (`percentage` or `flat`). */
        fun type(type: DiscountType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [DiscountType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<DiscountType>) = apply { this.type = type }

        /**
         * Per-currency options (flat deduction / percentage cap + minimum subtotal). Empty for
         * discounts without any configured currency options.
         */
        fun currencyOptions(currencyOptions: List<CurrencyOption>) =
            currencyOptions(JsonField.of(currencyOptions))

        /**
         * Sets [Builder.currencyOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyOptions] with a well-typed
         * `List<CurrencyOption>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun currencyOptions(currencyOptions: JsonField<List<CurrencyOption>>) = apply {
            this.currencyOptions = currencyOptions.map { it.toMutableList() }
        }

        /**
         * Adds a single [CurrencyOption] to [currencyOptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCurrencyOption(currencyOption: CurrencyOption) = apply {
            currencyOptions =
                (currencyOptions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("currencyOptions", it).add(currencyOption)
                }
        }

        /** Optional date/time after which discount is expired. */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Name for the Discount */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Maximum number of times a single customer may redeem this discount, if any. */
        fun perCustomerUsageLimit(perCustomerUsageLimit: Int?) =
            perCustomerUsageLimit(JsonField.ofNullable(perCustomerUsageLimit))

        /**
         * Alias for [Builder.perCustomerUsageLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perCustomerUsageLimit(perCustomerUsageLimit: Int) =
            perCustomerUsageLimit(perCustomerUsageLimit as Int?)

        /**
         * Sets [Builder.perCustomerUsageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perCustomerUsageLimit] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun perCustomerUsageLimit(perCustomerUsageLimit: JsonField<Int>) = apply {
            this.perCustomerUsageLimit = perCustomerUsageLimit
        }

        /**
         * Optional date/time before which the discount is not yet active. NULL = active
         * immediately.
         */
        fun startsAt(startsAt: OffsetDateTime?) = startsAt(JsonField.ofNullable(startsAt))

        /**
         * Sets [Builder.startsAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startsAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startsAt(startsAt: JsonField<OffsetDateTime>) = apply { this.startsAt = startsAt }

        /**
         * Number of subscription billing cycles this discount is valid for. If not provided, the
         * discount will be applied indefinitely to all recurring payments related to the
         * subscription.
         */
        fun subscriptionCycles(subscriptionCycles: Int?) =
            subscriptionCycles(JsonField.ofNullable(subscriptionCycles))

        /**
         * Alias for [Builder.subscriptionCycles].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun subscriptionCycles(subscriptionCycles: Int) =
            subscriptionCycles(subscriptionCycles as Int?)

        /**
         * Sets [Builder.subscriptionCycles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionCycles] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionCycles(subscriptionCycles: JsonField<Int>) = apply {
            this.subscriptionCycles = subscriptionCycles
        }

        /** Usage limit for this discount, if any. */
        fun usageLimit(usageLimit: Int?) = usageLimit(JsonField.ofNullable(usageLimit))

        /**
         * Alias for [Builder.usageLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun usageLimit(usageLimit: Int) = usageLimit(usageLimit as Int?)

        /**
         * Sets [Builder.usageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageLimit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usageLimit(usageLimit: JsonField<Int>) = apply { this.usageLimit = usageLimit }

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
         * Returns an immutable instance of [Discount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .businessId()
         * .code()
         * .createdAt()
         * .customerEligibility()
         * .discountId()
         * .metadata()
         * .preserveOnPlanChange()
         * .restrictedTo()
         * .timesUsed()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Discount =
            Discount(
                checkRequired("amount", amount),
                checkRequired("businessId", businessId),
                checkRequired("code", code),
                checkRequired("createdAt", createdAt),
                checkRequired("customerEligibility", customerEligibility),
                checkRequired("discountId", discountId),
                checkRequired("metadata", metadata),
                checkRequired("preserveOnPlanChange", preserveOnPlanChange),
                checkRequired("restrictedTo", restrictedTo).map { it.toImmutable() },
                checkRequired("timesUsed", timesUsed),
                checkRequired("type", type),
                (currencyOptions ?: JsonMissing.of()).map { it.toImmutable() },
                expiresAt,
                name,
                perCustomerUsageLimit,
                startsAt,
                subscriptionCycles,
                usageLimit,
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
    fun validate(): Discount = apply {
        if (validated) {
            return@apply
        }

        amount()
        businessId()
        code()
        createdAt()
        customerEligibility().validate()
        discountId()
        metadata().validate()
        preserveOnPlanChange()
        restrictedTo()
        timesUsed()
        type().validate()
        currencyOptions()?.forEach { it.validate() }
        expiresAt()
        name()
        perCustomerUsageLimit()
        startsAt()
        subscriptionCycles()
        usageLimit()
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
            (if (code.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (customerEligibility.asKnown()?.validity() ?: 0) +
            (if (discountId.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (preserveOnPlanChange.asKnown() == null) 0 else 1) +
            (restrictedTo.asKnown()?.size ?: 0) +
            (if (timesUsed.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (currencyOptions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (perCustomerUsageLimit.asKnown() == null) 0 else 1) +
            (if (startsAt.asKnown() == null) 0 else 1) +
            (if (subscriptionCycles.asKnown() == null) 0 else 1) +
            (if (usageLimit.asKnown() == null) 0 else 1)

    /** Who may redeem this discount code. */
    class CustomerEligibility
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val ANY = of("any")

            val FIRST_TIME = of("first_time")

            val EXISTING = of("existing")

            val SPECIFIC = of("specific")

            fun of(value: String) = CustomerEligibility(JsonField.of(value))
        }

        /** An enum containing [CustomerEligibility]'s known values. */
        enum class Known {
            ANY,
            FIRST_TIME,
            EXISTING,
            SPECIFIC,
        }

        /**
         * An enum containing [CustomerEligibility]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CustomerEligibility] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANY,
            FIRST_TIME,
            EXISTING,
            SPECIFIC,
            /**
             * An enum member indicating that [CustomerEligibility] was instantiated with an unknown
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
                ANY -> Value.ANY
                FIRST_TIME -> Value.FIRST_TIME
                EXISTING -> Value.EXISTING
                SPECIFIC -> Value.SPECIFIC
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
                ANY -> Known.ANY
                FIRST_TIME -> Known.FIRST_TIME
                EXISTING -> Known.EXISTING
                SPECIFIC -> Known.SPECIFIC
                else ->
                    throw DodoPaymentsInvalidDataException("Unknown CustomerEligibility: $value")
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
        fun validate(): CustomerEligibility = apply {
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

            return other is CustomerEligibility && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A per-currency discount option (response shape). `max_amount_possible` mirrors the DB column
     * of the same name.
     */
    class CurrencyOption
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val isDefault: JsonField<Boolean>,
        private val minimumSubtotal: JsonField<Int>,
        private val maxAmountPossible: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("is_default")
            @ExcludeMissing
            isDefault: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("minimum_subtotal")
            @ExcludeMissing
            minimumSubtotal: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("max_amount_possible")
            @ExcludeMissing
            maxAmountPossible: JsonField<Int> = JsonMissing.of(),
        ) : this(currency, isDefault, minimumSubtotal, maxAmountPossible, mutableMapOf())

        /**
         * The currency this option applies to.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Whether this is the default row FX conversions pivot from.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isDefault(): Boolean = isDefault.getRequired("is_default")

        /**
         * Eligible-cart threshold in this currency's subunits (0 = no minimum).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minimumSubtotal(): Int = minimumSubtotal.getRequired("minimum_subtotal")

        /**
         * The most this code discounts in this currency's subunits (flat deduction or percentage
         * cap).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxAmountPossible(): Int? = maxAmountPossible.getNullable("max_amount_possible")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [isDefault].
         *
         * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

        /**
         * Returns the raw JSON value of [minimumSubtotal].
         *
         * Unlike [minimumSubtotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_subtotal")
        @ExcludeMissing
        fun _minimumSubtotal(): JsonField<Int> = minimumSubtotal

        /**
         * Returns the raw JSON value of [maxAmountPossible].
         *
         * Unlike [maxAmountPossible], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_amount_possible")
        @ExcludeMissing
        fun _maxAmountPossible(): JsonField<Int> = maxAmountPossible

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
             * Returns a mutable builder for constructing an instance of [CurrencyOption].
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .isDefault()
             * .minimumSubtotal()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CurrencyOption]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var isDefault: JsonField<Boolean>? = null
            private var minimumSubtotal: JsonField<Int>? = null
            private var maxAmountPossible: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(currencyOption: CurrencyOption) = apply {
                currency = currencyOption.currency
                isDefault = currencyOption.isDefault
                minimumSubtotal = currencyOption.minimumSubtotal
                maxAmountPossible = currencyOption.maxAmountPossible
                additionalProperties = currencyOption.additionalProperties.toMutableMap()
            }

            /** The currency this option applies to. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Whether this is the default row FX conversions pivot from. */
            fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

            /**
             * Sets [Builder.isDefault] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDefault] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

            /** Eligible-cart threshold in this currency's subunits (0 = no minimum). */
            fun minimumSubtotal(minimumSubtotal: Int) =
                minimumSubtotal(JsonField.of(minimumSubtotal))

            /**
             * Sets [Builder.minimumSubtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumSubtotal] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumSubtotal(minimumSubtotal: JsonField<Int>) = apply {
                this.minimumSubtotal = minimumSubtotal
            }

            /**
             * The most this code discounts in this currency's subunits (flat deduction or
             * percentage cap).
             */
            fun maxAmountPossible(maxAmountPossible: Int?) =
                maxAmountPossible(JsonField.ofNullable(maxAmountPossible))

            /**
             * Alias for [Builder.maxAmountPossible].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxAmountPossible(maxAmountPossible: Int) =
                maxAmountPossible(maxAmountPossible as Int?)

            /**
             * Sets [Builder.maxAmountPossible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxAmountPossible] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxAmountPossible(maxAmountPossible: JsonField<Int>) = apply {
                this.maxAmountPossible = maxAmountPossible
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
             * Returns an immutable instance of [CurrencyOption].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .isDefault()
             * .minimumSubtotal()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CurrencyOption =
                CurrencyOption(
                    checkRequired("currency", currency),
                    checkRequired("isDefault", isDefault),
                    checkRequired("minimumSubtotal", minimumSubtotal),
                    maxAmountPossible,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): CurrencyOption = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            isDefault()
            minimumSubtotal()
            maxAmountPossible()
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
                (if (isDefault.asKnown() == null) 0 else 1) +
                (if (minimumSubtotal.asKnown() == null) 0 else 1) +
                (if (maxAmountPossible.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CurrencyOption &&
                currency == other.currency &&
                isDefault == other.isDefault &&
                minimumSubtotal == other.minimumSubtotal &&
                maxAmountPossible == other.maxAmountPossible &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                isDefault,
                minimumSubtotal,
                maxAmountPossible,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrencyOption{currency=$currency, isDefault=$isDefault, minimumSubtotal=$minimumSubtotal, maxAmountPossible=$maxAmountPossible, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Discount &&
            amount == other.amount &&
            businessId == other.businessId &&
            code == other.code &&
            createdAt == other.createdAt &&
            customerEligibility == other.customerEligibility &&
            discountId == other.discountId &&
            metadata == other.metadata &&
            preserveOnPlanChange == other.preserveOnPlanChange &&
            restrictedTo == other.restrictedTo &&
            timesUsed == other.timesUsed &&
            type == other.type &&
            currencyOptions == other.currencyOptions &&
            expiresAt == other.expiresAt &&
            name == other.name &&
            perCustomerUsageLimit == other.perCustomerUsageLimit &&
            startsAt == other.startsAt &&
            subscriptionCycles == other.subscriptionCycles &&
            usageLimit == other.usageLimit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            businessId,
            code,
            createdAt,
            customerEligibility,
            discountId,
            metadata,
            preserveOnPlanChange,
            restrictedTo,
            timesUsed,
            type,
            currencyOptions,
            expiresAt,
            name,
            perCustomerUsageLimit,
            startsAt,
            subscriptionCycles,
            usageLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Discount{amount=$amount, businessId=$businessId, code=$code, createdAt=$createdAt, customerEligibility=$customerEligibility, discountId=$discountId, metadata=$metadata, preserveOnPlanChange=$preserveOnPlanChange, restrictedTo=$restrictedTo, timesUsed=$timesUsed, type=$type, currencyOptions=$currencyOptions, expiresAt=$expiresAt, name=$name, perCustomerUsageLimit=$perCustomerUsageLimit, startsAt=$startsAt, subscriptionCycles=$subscriptionCycles, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
}
