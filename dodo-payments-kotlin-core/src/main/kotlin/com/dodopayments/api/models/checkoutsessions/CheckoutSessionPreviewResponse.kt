// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Data returned by the calculate checkout session API */
class CheckoutSessionPreviewResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billingCountry: JsonField<CountryCode>,
    private val currency: JsonField<Currency>,
    private val currentBreakup: JsonField<CurrentBreakup>,
    private val isByop: JsonField<Boolean>,
    private val productCart: JsonField<List<ProductCart>>,
    private val totalPrice: JsonField<Int>,
    private val nextBillingDate: JsonField<OffsetDateTime>,
    private val recurringBreakup: JsonField<RecurringBreakup>,
    private val taxIdBusinessName: JsonField<String>,
    private val taxIdErrMsg: JsonField<String>,
    private val taxIdFormatName: JsonField<String>,
    private val totalTax: JsonField<Int>,
    private val trialAmount: JsonField<Int>,
    private val trialPeriodDays: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("billing_country")
        @ExcludeMissing
        billingCountry: JsonField<CountryCode> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("current_breakup")
        @ExcludeMissing
        currentBreakup: JsonField<CurrentBreakup> = JsonMissing.of(),
        @JsonProperty("is_byop") @ExcludeMissing isByop: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("product_cart")
        @ExcludeMissing
        productCart: JsonField<List<ProductCart>> = JsonMissing.of(),
        @JsonProperty("total_price") @ExcludeMissing totalPrice: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("next_billing_date")
        @ExcludeMissing
        nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("recurring_breakup")
        @ExcludeMissing
        recurringBreakup: JsonField<RecurringBreakup> = JsonMissing.of(),
        @JsonProperty("tax_id_business_name")
        @ExcludeMissing
        taxIdBusinessName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_id_err_msg")
        @ExcludeMissing
        taxIdErrMsg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_id_format_name")
        @ExcludeMissing
        taxIdFormatName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_tax") @ExcludeMissing totalTax: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("trial_amount")
        @ExcludeMissing
        trialAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        trialPeriodDays: JsonField<Int> = JsonMissing.of(),
    ) : this(
        billingCountry,
        currency,
        currentBreakup,
        isByop,
        productCart,
        totalPrice,
        nextBillingDate,
        recurringBreakup,
        taxIdBusinessName,
        taxIdErrMsg,
        taxIdFormatName,
        totalTax,
        trialAmount,
        trialPeriodDays,
        mutableMapOf(),
    )

    /**
     * Billing country
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingCountry(): CountryCode = billingCountry.getRequired("billing_country")

    /**
     * Currency in which the calculations were made
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Breakup of the current payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentBreakup(): CurrentBreakup = currentBreakup.getRequired("current_breakup")

    /**
     * Whether the payment will be routed through the merchant's own processor (BYOP). True when the
     * session's business has a BYOP route configured for the billing country; in that case the
     * quoted amounts exclude Dodo-computed tax because the merchant is MoR and owns tax.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isByop(): Boolean = isByop.getRequired("is_byop")

    /**
     * The total product cart
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productCart(): List<ProductCart> = productCart.getRequired("product_cart")

    /**
     * Total calculate price of the product cart
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalPrice(): Int = totalPrice.getRequired("total_price")

    /**
     * The upcoming billing date for subscriptions, computed relative to now: with a trial it is
     * `now + trial_period_days`, otherwise `now + payment frequency`. `None` for one-time-only
     * carts. This is a preview estimate; the authoritative value is set when the subscription
     * activates.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nextBillingDate(): OffsetDateTime? = nextBillingDate.getNullable("next_billing_date")

    /**
     * Breakup of recurring payments (None for one-time only)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun recurringBreakup(): RecurringBreakup? = recurringBreakup.getNullable("recurring_breakup")

    /**
     * Registered business name from the official registry (EU/GB/AU) when found
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxIdBusinessName(): String? = taxIdBusinessName.getNullable("tax_id_business_name")

    /**
     * Error message if tax ID validation failed
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxIdErrMsg(): String? = taxIdErrMsg.getNullable("tax_id_err_msg")

    /**
     * The matched tax ID notation (e.g. "VAT Number", "GSTIN") when valid
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxIdFormatName(): String? = taxIdFormatName.getNullable("tax_id_format_name")

    /**
     * Total tax
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun totalTax(): Int? = totalTax.getNullable("total_tax")

    /**
     * Per-unit trial amount after discounts, in the price currency's minor units (pre-quantity,
     * pre-tax; see `current_breakup` for the taxed total due today). Only present for a paid trial;
     * `None` for a free trial or no trial.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trialAmount(): Int? = trialAmount.getNullable("trial_amount")

    /**
     * Effective trial duration in days for the subscription line, when there's a trial (free or
     * paid). `None` if no subscription or no trial.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trialPeriodDays(): Int? = trialPeriodDays.getNullable("trial_period_days")

    /**
     * Returns the raw JSON value of [billingCountry].
     *
     * Unlike [billingCountry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_country")
    @ExcludeMissing
    fun _billingCountry(): JsonField<CountryCode> = billingCountry

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [currentBreakup].
     *
     * Unlike [currentBreakup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_breakup")
    @ExcludeMissing
    fun _currentBreakup(): JsonField<CurrentBreakup> = currentBreakup

    /**
     * Returns the raw JSON value of [isByop].
     *
     * Unlike [isByop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_byop") @ExcludeMissing fun _isByop(): JsonField<Boolean> = isByop

    /**
     * Returns the raw JSON value of [productCart].
     *
     * Unlike [productCart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_cart")
    @ExcludeMissing
    fun _productCart(): JsonField<List<ProductCart>> = productCart

    /**
     * Returns the raw JSON value of [totalPrice].
     *
     * Unlike [totalPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_price") @ExcludeMissing fun _totalPrice(): JsonField<Int> = totalPrice

    /**
     * Returns the raw JSON value of [nextBillingDate].
     *
     * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_billing_date")
    @ExcludeMissing
    fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

    /**
     * Returns the raw JSON value of [recurringBreakup].
     *
     * Unlike [recurringBreakup], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recurring_breakup")
    @ExcludeMissing
    fun _recurringBreakup(): JsonField<RecurringBreakup> = recurringBreakup

    /**
     * Returns the raw JSON value of [taxIdBusinessName].
     *
     * Unlike [taxIdBusinessName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tax_id_business_name")
    @ExcludeMissing
    fun _taxIdBusinessName(): JsonField<String> = taxIdBusinessName

    /**
     * Returns the raw JSON value of [taxIdErrMsg].
     *
     * Unlike [taxIdErrMsg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_id_err_msg")
    @ExcludeMissing
    fun _taxIdErrMsg(): JsonField<String> = taxIdErrMsg

    /**
     * Returns the raw JSON value of [taxIdFormatName].
     *
     * Unlike [taxIdFormatName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_id_format_name")
    @ExcludeMissing
    fun _taxIdFormatName(): JsonField<String> = taxIdFormatName

    /**
     * Returns the raw JSON value of [totalTax].
     *
     * Unlike [totalTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tax") @ExcludeMissing fun _totalTax(): JsonField<Int> = totalTax

    /**
     * Returns the raw JSON value of [trialAmount].
     *
     * Unlike [trialAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_amount") @ExcludeMissing fun _trialAmount(): JsonField<Int> = trialAmount

    /**
     * Returns the raw JSON value of [trialPeriodDays].
     *
     * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_period_days")
    @ExcludeMissing
    fun _trialPeriodDays(): JsonField<Int> = trialPeriodDays

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
         * [CheckoutSessionPreviewResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .billingCountry()
         * .currency()
         * .currentBreakup()
         * .isByop()
         * .productCart()
         * .totalPrice()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CheckoutSessionPreviewResponse]. */
    class Builder internal constructor() {

        private var billingCountry: JsonField<CountryCode>? = null
        private var currency: JsonField<Currency>? = null
        private var currentBreakup: JsonField<CurrentBreakup>? = null
        private var isByop: JsonField<Boolean>? = null
        private var productCart: JsonField<MutableList<ProductCart>>? = null
        private var totalPrice: JsonField<Int>? = null
        private var nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var recurringBreakup: JsonField<RecurringBreakup> = JsonMissing.of()
        private var taxIdBusinessName: JsonField<String> = JsonMissing.of()
        private var taxIdErrMsg: JsonField<String> = JsonMissing.of()
        private var taxIdFormatName: JsonField<String> = JsonMissing.of()
        private var totalTax: JsonField<Int> = JsonMissing.of()
        private var trialAmount: JsonField<Int> = JsonMissing.of()
        private var trialPeriodDays: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkoutSessionPreviewResponse: CheckoutSessionPreviewResponse) = apply {
            billingCountry = checkoutSessionPreviewResponse.billingCountry
            currency = checkoutSessionPreviewResponse.currency
            currentBreakup = checkoutSessionPreviewResponse.currentBreakup
            isByop = checkoutSessionPreviewResponse.isByop
            productCart = checkoutSessionPreviewResponse.productCart.map { it.toMutableList() }
            totalPrice = checkoutSessionPreviewResponse.totalPrice
            nextBillingDate = checkoutSessionPreviewResponse.nextBillingDate
            recurringBreakup = checkoutSessionPreviewResponse.recurringBreakup
            taxIdBusinessName = checkoutSessionPreviewResponse.taxIdBusinessName
            taxIdErrMsg = checkoutSessionPreviewResponse.taxIdErrMsg
            taxIdFormatName = checkoutSessionPreviewResponse.taxIdFormatName
            totalTax = checkoutSessionPreviewResponse.totalTax
            trialAmount = checkoutSessionPreviewResponse.trialAmount
            trialPeriodDays = checkoutSessionPreviewResponse.trialPeriodDays
            additionalProperties =
                checkoutSessionPreviewResponse.additionalProperties.toMutableMap()
        }

        /** Billing country */
        fun billingCountry(billingCountry: CountryCode) =
            billingCountry(JsonField.of(billingCountry))

        /**
         * Sets [Builder.billingCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCountry] with a well-typed [CountryCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingCountry(billingCountry: JsonField<CountryCode>) = apply {
            this.billingCountry = billingCountry
        }

        /** Currency in which the calculations were made */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Breakup of the current payment */
        fun currentBreakup(currentBreakup: CurrentBreakup) =
            currentBreakup(JsonField.of(currentBreakup))

        /**
         * Sets [Builder.currentBreakup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBreakup] with a well-typed [CurrentBreakup] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentBreakup(currentBreakup: JsonField<CurrentBreakup>) = apply {
            this.currentBreakup = currentBreakup
        }

        /**
         * Whether the payment will be routed through the merchant's own processor (BYOP). True when
         * the session's business has a BYOP route configured for the billing country; in that case
         * the quoted amounts exclude Dodo-computed tax because the merchant is MoR and owns tax.
         */
        fun isByop(isByop: Boolean) = isByop(JsonField.of(isByop))

        /**
         * Sets [Builder.isByop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isByop] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isByop(isByop: JsonField<Boolean>) = apply { this.isByop = isByop }

        /** The total product cart */
        fun productCart(productCart: List<ProductCart>) = productCart(JsonField.of(productCart))

        /**
         * Sets [Builder.productCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productCart] with a well-typed `List<ProductCart>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productCart(productCart: JsonField<List<ProductCart>>) = apply {
            this.productCart = productCart.map { it.toMutableList() }
        }

        /**
         * Adds a single [ProductCart] to [Builder.productCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductCart(productCart: ProductCart) = apply {
            this.productCart =
                (this.productCart ?: JsonField.of(mutableListOf())).also {
                    checkKnown("productCart", it).add(productCart)
                }
        }

        /** Total calculate price of the product cart */
        fun totalPrice(totalPrice: Int) = totalPrice(JsonField.of(totalPrice))

        /**
         * Sets [Builder.totalPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPrice] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalPrice(totalPrice: JsonField<Int>) = apply { this.totalPrice = totalPrice }

        /**
         * The upcoming billing date for subscriptions, computed relative to now: with a trial it is
         * `now + trial_period_days`, otherwise `now + payment frequency`. `None` for one-time-only
         * carts. This is a preview estimate; the authoritative value is set when the subscription
         * activates.
         */
        fun nextBillingDate(nextBillingDate: OffsetDateTime?) =
            nextBillingDate(JsonField.ofNullable(nextBillingDate))

        /**
         * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
            this.nextBillingDate = nextBillingDate
        }

        /** Breakup of recurring payments (None for one-time only) */
        fun recurringBreakup(recurringBreakup: RecurringBreakup?) =
            recurringBreakup(JsonField.ofNullable(recurringBreakup))

        /**
         * Sets [Builder.recurringBreakup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringBreakup] with a well-typed [RecurringBreakup]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recurringBreakup(recurringBreakup: JsonField<RecurringBreakup>) = apply {
            this.recurringBreakup = recurringBreakup
        }

        /** Registered business name from the official registry (EU/GB/AU) when found */
        fun taxIdBusinessName(taxIdBusinessName: String?) =
            taxIdBusinessName(JsonField.ofNullable(taxIdBusinessName))

        /**
         * Sets [Builder.taxIdBusinessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxIdBusinessName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxIdBusinessName(taxIdBusinessName: JsonField<String>) = apply {
            this.taxIdBusinessName = taxIdBusinessName
        }

        /** Error message if tax ID validation failed */
        fun taxIdErrMsg(taxIdErrMsg: String?) = taxIdErrMsg(JsonField.ofNullable(taxIdErrMsg))

        /**
         * Sets [Builder.taxIdErrMsg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxIdErrMsg] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxIdErrMsg(taxIdErrMsg: JsonField<String>) = apply { this.taxIdErrMsg = taxIdErrMsg }

        /** The matched tax ID notation (e.g. "VAT Number", "GSTIN") when valid */
        fun taxIdFormatName(taxIdFormatName: String?) =
            taxIdFormatName(JsonField.ofNullable(taxIdFormatName))

        /**
         * Sets [Builder.taxIdFormatName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxIdFormatName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxIdFormatName(taxIdFormatName: JsonField<String>) = apply {
            this.taxIdFormatName = taxIdFormatName
        }

        /** Total tax */
        fun totalTax(totalTax: Int?) = totalTax(JsonField.ofNullable(totalTax))

        /**
         * Alias for [Builder.totalTax].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalTax(totalTax: Int) = totalTax(totalTax as Int?)

        /**
         * Sets [Builder.totalTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTax] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalTax(totalTax: JsonField<Int>) = apply { this.totalTax = totalTax }

        /**
         * Per-unit trial amount after discounts, in the price currency's minor units (pre-quantity,
         * pre-tax; see `current_breakup` for the taxed total due today). Only present for a paid
         * trial; `None` for a free trial or no trial.
         */
        fun trialAmount(trialAmount: Int?) = trialAmount(JsonField.ofNullable(trialAmount))

        /**
         * Alias for [Builder.trialAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialAmount(trialAmount: Int) = trialAmount(trialAmount as Int?)

        /**
         * Sets [Builder.trialAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialAmount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trialAmount(trialAmount: JsonField<Int>) = apply { this.trialAmount = trialAmount }

        /**
         * Effective trial duration in days for the subscription line, when there's a trial (free or
         * paid). `None` if no subscription or no trial.
         */
        fun trialPeriodDays(trialPeriodDays: Int?) =
            trialPeriodDays(JsonField.ofNullable(trialPeriodDays))

        /**
         * Alias for [Builder.trialPeriodDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialPeriodDays(trialPeriodDays: Int) = trialPeriodDays(trialPeriodDays as Int?)

        /**
         * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialPeriodDays] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trialPeriodDays(trialPeriodDays: JsonField<Int>) = apply {
            this.trialPeriodDays = trialPeriodDays
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
         * Returns an immutable instance of [CheckoutSessionPreviewResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .billingCountry()
         * .currency()
         * .currentBreakup()
         * .isByop()
         * .productCart()
         * .totalPrice()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CheckoutSessionPreviewResponse =
            CheckoutSessionPreviewResponse(
                checkRequired("billingCountry", billingCountry),
                checkRequired("currency", currency),
                checkRequired("currentBreakup", currentBreakup),
                checkRequired("isByop", isByop),
                checkRequired("productCart", productCart).map { it.toImmutable() },
                checkRequired("totalPrice", totalPrice),
                nextBillingDate,
                recurringBreakup,
                taxIdBusinessName,
                taxIdErrMsg,
                taxIdFormatName,
                totalTax,
                trialAmount,
                trialPeriodDays,
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
    fun validate(): CheckoutSessionPreviewResponse = apply {
        if (validated) {
            return@apply
        }

        billingCountry().validate()
        currency().validate()
        currentBreakup().validate()
        isByop()
        productCart().forEach { it.validate() }
        totalPrice()
        nextBillingDate()
        recurringBreakup()?.validate()
        taxIdBusinessName()
        taxIdErrMsg()
        taxIdFormatName()
        totalTax()
        trialAmount()
        trialPeriodDays()
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
        (billingCountry.asKnown()?.validity() ?: 0) +
            (currency.asKnown()?.validity() ?: 0) +
            (currentBreakup.asKnown()?.validity() ?: 0) +
            (if (isByop.asKnown() == null) 0 else 1) +
            (productCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalPrice.asKnown() == null) 0 else 1) +
            (if (nextBillingDate.asKnown() == null) 0 else 1) +
            (recurringBreakup.asKnown()?.validity() ?: 0) +
            (if (taxIdBusinessName.asKnown() == null) 0 else 1) +
            (if (taxIdErrMsg.asKnown() == null) 0 else 1) +
            (if (taxIdFormatName.asKnown() == null) 0 else 1) +
            (if (totalTax.asKnown() == null) 0 else 1) +
            (if (trialAmount.asKnown() == null) 0 else 1) +
            (if (trialPeriodDays.asKnown() == null) 0 else 1)

    /** Breakup of the current payment */
    class CurrentBreakup
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val discount: JsonField<Int>,
        private val subtotal: JsonField<Int>,
        private val totalAmount: JsonField<Int>,
        private val tax: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("discount") @ExcludeMissing discount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("total_amount")
            @ExcludeMissing
            totalAmount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
        ) : this(discount, subtotal, totalAmount, tax, mutableMapOf())

        /**
         * Total discount amount
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discount(): Int = discount.getRequired("discount")

        /**
         * Subtotal before discount (pre-tax original prices)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtotal(): Int = subtotal.getRequired("subtotal")

        /**
         * Total amount to be charged (final amount after all calculations)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalAmount(): Int = totalAmount.getRequired("total_amount")

        /**
         * Total tax amount
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tax(): Int? = tax.getNullable("tax")

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Int> = discount

        /**
         * Returns the raw JSON value of [subtotal].
         *
         * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Int> = subtotal

        /**
         * Returns the raw JSON value of [totalAmount].
         *
         * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_amount")
        @ExcludeMissing
        fun _totalAmount(): JsonField<Int> = totalAmount

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

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
             * Returns a mutable builder for constructing an instance of [CurrentBreakup].
             *
             * The following fields are required:
             * ```kotlin
             * .discount()
             * .subtotal()
             * .totalAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CurrentBreakup]. */
        class Builder internal constructor() {

            private var discount: JsonField<Int>? = null
            private var subtotal: JsonField<Int>? = null
            private var totalAmount: JsonField<Int>? = null
            private var tax: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(currentBreakup: CurrentBreakup) = apply {
                discount = currentBreakup.discount
                subtotal = currentBreakup.subtotal
                totalAmount = currentBreakup.totalAmount
                tax = currentBreakup.tax
                additionalProperties = currentBreakup.additionalProperties.toMutableMap()
            }

            /** Total discount amount */
            fun discount(discount: Int) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Int>) = apply { this.discount = discount }

            /** Subtotal before discount (pre-tax original prices) */
            fun subtotal(subtotal: Int) = subtotal(JsonField.of(subtotal))

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<Int>) = apply { this.subtotal = subtotal }

            /** Total amount to be charged (final amount after all calculations) */
            fun totalAmount(totalAmount: Int) = totalAmount(JsonField.of(totalAmount))

            /**
             * Sets [Builder.totalAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalAmount] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalAmount(totalAmount: JsonField<Int>) = apply { this.totalAmount = totalAmount }

            /** Total tax amount */
            fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

            /**
             * Alias for [Builder.tax].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tax(tax: Int) = tax(tax as Int?)

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

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
             * Returns an immutable instance of [CurrentBreakup].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .discount()
             * .subtotal()
             * .totalAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CurrentBreakup =
                CurrentBreakup(
                    checkRequired("discount", discount),
                    checkRequired("subtotal", subtotal),
                    checkRequired("totalAmount", totalAmount),
                    tax,
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
        fun validate(): CurrentBreakup = apply {
            if (validated) {
                return@apply
            }

            discount()
            subtotal()
            totalAmount()
            tax()
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
            (if (discount.asKnown() == null) 0 else 1) +
                (if (subtotal.asKnown() == null) 0 else 1) +
                (if (totalAmount.asKnown() == null) 0 else 1) +
                (if (tax.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CurrentBreakup &&
                discount == other.discount &&
                subtotal == other.subtotal &&
                totalAmount == other.totalAmount &&
                tax == other.tax &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(discount, subtotal, totalAmount, tax, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentBreakup{discount=$discount, subtotal=$subtotal, totalAmount=$totalAmount, tax=$tax, additionalProperties=$additionalProperties}"
    }

    class ProductCart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditEntitlements: JsonField<List<CreditEntitlement>>,
        private val currency: JsonField<Currency>,
        private val discountedPrice: JsonField<Int>,
        private val isSubscription: JsonField<Boolean>,
        private val isUsageBased: JsonField<Boolean>,
        private val meters: JsonField<List<Meter>>,
        private val ogCurrency: JsonField<Currency>,
        private val ogPrice: JsonField<Int>,
        private val productId: JsonField<String>,
        private val quantity: JsonField<Int>,
        private val taxCategory: JsonField<TaxCategory>,
        private val taxInclusive: JsonField<Boolean>,
        private val taxRate: JsonField<Int>,
        private val addons: JsonField<List<Addon>>,
        private val description: JsonField<String>,
        private val discountAmount: JsonField<Int>,
        private val discountCycle: JsonField<Int>,
        private val name: JsonField<String>,
        private val tax: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_entitlements")
            @ExcludeMissing
            creditEntitlements: JsonField<List<CreditEntitlement>> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discounted_price")
            @ExcludeMissing
            discountedPrice: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("is_subscription")
            @ExcludeMissing
            isSubscription: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_usage_based")
            @ExcludeMissing
            isUsageBased: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("meters")
            @ExcludeMissing
            meters: JsonField<List<Meter>> = JsonMissing.of(),
            @JsonProperty("og_currency")
            @ExcludeMissing
            ogCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("og_price") @ExcludeMissing ogPrice: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("tax_category")
            @ExcludeMissing
            taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            taxInclusive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tax_rate") @ExcludeMissing taxRate: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("addons")
            @ExcludeMissing
            addons: JsonField<List<Addon>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_amount")
            @ExcludeMissing
            discountAmount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("discount_cycle")
            @ExcludeMissing
            discountCycle: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
        ) : this(
            creditEntitlements,
            currency,
            discountedPrice,
            isSubscription,
            isUsageBased,
            meters,
            ogCurrency,
            ogPrice,
            productId,
            quantity,
            taxCategory,
            taxInclusive,
            taxRate,
            addons,
            description,
            discountAmount,
            discountCycle,
            name,
            tax,
            mutableMapOf(),
        )

        /**
         * Credit entitlements that will be granted upon purchase
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlements(): List<CreditEntitlement> =
            creditEntitlements.getRequired("credit_entitlements")

        /**
         * the currency in which the calculatiosn were made
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * discounted price
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discountedPrice(): Int = discountedPrice.getRequired("discounted_price")

        /**
         * Whether this is a subscription product (affects tax calculation in breakup)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isSubscription(): Boolean = isSubscription.getRequired("is_subscription")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isUsageBased(): Boolean = isUsageBased.getRequired("is_usage_based")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meters(): List<Meter> = meters.getRequired("meters")

        /**
         * the product currency
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ogCurrency(): Currency = ogCurrency.getRequired("og_currency")

        /**
         * original price of the product
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ogPrice(): Int = ogPrice.getRequired("og_price")

        /**
         * unique id of the product
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Quanitity
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Int = quantity.getRequired("quantity")

        /**
         * tax category
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxCategory(): TaxCategory = taxCategory.getRequired("tax_category")

        /**
         * Whether tax is included in the price
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

        /**
         * tax rate
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxRate(): Int = taxRate.getRequired("tax_rate")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addons(): List<Addon>? = addons.getNullable("addons")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Percentage rate (basis points) of the applicable percentage code; null for flat codes
         * (their deduction is `og_price - discounted_price`).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountAmount(): Int? = discountAmount.getNullable("discount_amount")

        /**
         * number of cycles the discount will apply
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountCycle(): Int? = discountCycle.getNullable("discount_cycle")

        /**
         * name of the product
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * total tax
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tax(): Int? = tax.getNullable("tax")

        /**
         * Returns the raw JSON value of [creditEntitlements].
         *
         * Unlike [creditEntitlements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlements")
        @ExcludeMissing
        fun _creditEntitlements(): JsonField<List<CreditEntitlement>> = creditEntitlements

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [discountedPrice].
         *
         * Unlike [discountedPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discounted_price")
        @ExcludeMissing
        fun _discountedPrice(): JsonField<Int> = discountedPrice

        /**
         * Returns the raw JSON value of [isSubscription].
         *
         * Unlike [isSubscription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_subscription")
        @ExcludeMissing
        fun _isSubscription(): JsonField<Boolean> = isSubscription

        /**
         * Returns the raw JSON value of [isUsageBased].
         *
         * Unlike [isUsageBased], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_usage_based")
        @ExcludeMissing
        fun _isUsageBased(): JsonField<Boolean> = isUsageBased

        /**
         * Returns the raw JSON value of [meters].
         *
         * Unlike [meters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meters") @ExcludeMissing fun _meters(): JsonField<List<Meter>> = meters

        /**
         * Returns the raw JSON value of [ogCurrency].
         *
         * Unlike [ogCurrency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("og_currency")
        @ExcludeMissing
        fun _ogCurrency(): JsonField<Currency> = ogCurrency

        /**
         * Returns the raw JSON value of [ogPrice].
         *
         * Unlike [ogPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("og_price") @ExcludeMissing fun _ogPrice(): JsonField<Int> = ogPrice

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

        /**
         * Returns the raw JSON value of [taxCategory].
         *
         * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_category")
        @ExcludeMissing
        fun _taxCategory(): JsonField<TaxCategory> = taxCategory

        /**
         * Returns the raw JSON value of [taxInclusive].
         *
         * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        fun _taxInclusive(): JsonField<Boolean> = taxInclusive

        /**
         * Returns the raw JSON value of [taxRate].
         *
         * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<Int> = taxRate

        /**
         * Returns the raw JSON value of [addons].
         *
         * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<Addon>> = addons

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [discountAmount].
         *
         * Unlike [discountAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_amount")
        @ExcludeMissing
        fun _discountAmount(): JsonField<Int> = discountAmount

        /**
         * Returns the raw JSON value of [discountCycle].
         *
         * Unlike [discountCycle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_cycle")
        @ExcludeMissing
        fun _discountCycle(): JsonField<Int> = discountCycle

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

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
             * Returns a mutable builder for constructing an instance of [ProductCart].
             *
             * The following fields are required:
             * ```kotlin
             * .creditEntitlements()
             * .currency()
             * .discountedPrice()
             * .isSubscription()
             * .isUsageBased()
             * .meters()
             * .ogCurrency()
             * .ogPrice()
             * .productId()
             * .quantity()
             * .taxCategory()
             * .taxInclusive()
             * .taxRate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ProductCart]. */
        class Builder internal constructor() {

            private var creditEntitlements: JsonField<MutableList<CreditEntitlement>>? = null
            private var currency: JsonField<Currency>? = null
            private var discountedPrice: JsonField<Int>? = null
            private var isSubscription: JsonField<Boolean>? = null
            private var isUsageBased: JsonField<Boolean>? = null
            private var meters: JsonField<MutableList<Meter>>? = null
            private var ogCurrency: JsonField<Currency>? = null
            private var ogPrice: JsonField<Int>? = null
            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Int>? = null
            private var taxCategory: JsonField<TaxCategory>? = null
            private var taxInclusive: JsonField<Boolean>? = null
            private var taxRate: JsonField<Int>? = null
            private var addons: JsonField<MutableList<Addon>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var discountAmount: JsonField<Int> = JsonMissing.of()
            private var discountCycle: JsonField<Int> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var tax: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(productCart: ProductCart) = apply {
                creditEntitlements = productCart.creditEntitlements.map { it.toMutableList() }
                currency = productCart.currency
                discountedPrice = productCart.discountedPrice
                isSubscription = productCart.isSubscription
                isUsageBased = productCart.isUsageBased
                meters = productCart.meters.map { it.toMutableList() }
                ogCurrency = productCart.ogCurrency
                ogPrice = productCart.ogPrice
                productId = productCart.productId
                quantity = productCart.quantity
                taxCategory = productCart.taxCategory
                taxInclusive = productCart.taxInclusive
                taxRate = productCart.taxRate
                addons = productCart.addons.map { it.toMutableList() }
                description = productCart.description
                discountAmount = productCart.discountAmount
                discountCycle = productCart.discountCycle
                name = productCart.name
                tax = productCart.tax
                additionalProperties = productCart.additionalProperties.toMutableMap()
            }

            /** Credit entitlements that will be granted upon purchase */
            fun creditEntitlements(creditEntitlements: List<CreditEntitlement>) =
                creditEntitlements(JsonField.of(creditEntitlements))

            /**
             * Sets [Builder.creditEntitlements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlements] with a well-typed
             * `List<CreditEntitlement>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun creditEntitlements(creditEntitlements: JsonField<List<CreditEntitlement>>) = apply {
                this.creditEntitlements = creditEntitlements.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditEntitlement] to [creditEntitlements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditEntitlement(creditEntitlement: CreditEntitlement) = apply {
                creditEntitlements =
                    (creditEntitlements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("creditEntitlements", it).add(creditEntitlement)
                    }
            }

            /** the currency in which the calculatiosn were made */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** discounted price */
            fun discountedPrice(discountedPrice: Int) =
                discountedPrice(JsonField.of(discountedPrice))

            /**
             * Sets [Builder.discountedPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountedPrice] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountedPrice(discountedPrice: JsonField<Int>) = apply {
                this.discountedPrice = discountedPrice
            }

            /** Whether this is a subscription product (affects tax calculation in breakup) */
            fun isSubscription(isSubscription: Boolean) =
                isSubscription(JsonField.of(isSubscription))

            /**
             * Sets [Builder.isSubscription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isSubscription] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isSubscription(isSubscription: JsonField<Boolean>) = apply {
                this.isSubscription = isSubscription
            }

            fun isUsageBased(isUsageBased: Boolean) = isUsageBased(JsonField.of(isUsageBased))

            /**
             * Sets [Builder.isUsageBased] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isUsageBased] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isUsageBased(isUsageBased: JsonField<Boolean>) = apply {
                this.isUsageBased = isUsageBased
            }

            fun meters(meters: List<Meter>) = meters(JsonField.of(meters))

            /**
             * Sets [Builder.meters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meters] with a well-typed `List<Meter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meters(meters: JsonField<List<Meter>>) = apply {
                this.meters = meters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Meter] to [meters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMeter(meter: Meter) = apply {
                meters =
                    (meters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("meters", it).add(meter)
                    }
            }

            /** the product currency */
            fun ogCurrency(ogCurrency: Currency) = ogCurrency(JsonField.of(ogCurrency))

            /**
             * Sets [Builder.ogCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ogCurrency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ogCurrency(ogCurrency: JsonField<Currency>) = apply { this.ogCurrency = ogCurrency }

            /** original price of the product */
            fun ogPrice(ogPrice: Int) = ogPrice(JsonField.of(ogPrice))

            /**
             * Sets [Builder.ogPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ogPrice] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ogPrice(ogPrice: JsonField<Int>) = apply { this.ogPrice = ogPrice }

            /** unique id of the product */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Quanitity */
            fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

            /** tax category */
            fun taxCategory(taxCategory: TaxCategory) = taxCategory(JsonField.of(taxCategory))

            /**
             * Sets [Builder.taxCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxCategory] with a well-typed [TaxCategory] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
                this.taxCategory = taxCategory
            }

            /** Whether tax is included in the price */
            fun taxInclusive(taxInclusive: Boolean) = taxInclusive(JsonField.of(taxInclusive))

            /**
             * Sets [Builder.taxInclusive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                this.taxInclusive = taxInclusive
            }

            /** tax rate */
            fun taxRate(taxRate: Int) = taxRate(JsonField.of(taxRate))

            /**
             * Sets [Builder.taxRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxRate] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun taxRate(taxRate: JsonField<Int>) = apply { this.taxRate = taxRate }

            fun addons(addons: List<Addon>?) = addons(JsonField.ofNullable(addons))

            /**
             * Sets [Builder.addons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addons] with a well-typed `List<Addon>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addons(addons: JsonField<List<Addon>>) = apply {
                this.addons = addons.map { it.toMutableList() }
            }

            /**
             * Adds a single [Addon] to [addons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddon(addon: Addon) = apply {
                addons =
                    (addons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addons", it).add(addon)
                    }
            }

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

            /**
             * Percentage rate (basis points) of the applicable percentage code; null for flat codes
             * (their deduction is `og_price - discounted_price`).
             */
            fun discountAmount(discountAmount: Int?) =
                discountAmount(JsonField.ofNullable(discountAmount))

            /**
             * Alias for [Builder.discountAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun discountAmount(discountAmount: Int) = discountAmount(discountAmount as Int?)

            /**
             * Sets [Builder.discountAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountAmount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountAmount(discountAmount: JsonField<Int>) = apply {
                this.discountAmount = discountAmount
            }

            /** number of cycles the discount will apply */
            fun discountCycle(discountCycle: Int?) =
                discountCycle(JsonField.ofNullable(discountCycle))

            /**
             * Alias for [Builder.discountCycle].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun discountCycle(discountCycle: Int) = discountCycle(discountCycle as Int?)

            /**
             * Sets [Builder.discountCycle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountCycle] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountCycle(discountCycle: JsonField<Int>) = apply {
                this.discountCycle = discountCycle
            }

            /** name of the product */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** total tax */
            fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

            /**
             * Alias for [Builder.tax].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tax(tax: Int) = tax(tax as Int?)

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

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
             * Returns an immutable instance of [ProductCart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .creditEntitlements()
             * .currency()
             * .discountedPrice()
             * .isSubscription()
             * .isUsageBased()
             * .meters()
             * .ogCurrency()
             * .ogPrice()
             * .productId()
             * .quantity()
             * .taxCategory()
             * .taxInclusive()
             * .taxRate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ProductCart =
                ProductCart(
                    checkRequired("creditEntitlements", creditEntitlements).map {
                        it.toImmutable()
                    },
                    checkRequired("currency", currency),
                    checkRequired("discountedPrice", discountedPrice),
                    checkRequired("isSubscription", isSubscription),
                    checkRequired("isUsageBased", isUsageBased),
                    checkRequired("meters", meters).map { it.toImmutable() },
                    checkRequired("ogCurrency", ogCurrency),
                    checkRequired("ogPrice", ogPrice),
                    checkRequired("productId", productId),
                    checkRequired("quantity", quantity),
                    checkRequired("taxCategory", taxCategory),
                    checkRequired("taxInclusive", taxInclusive),
                    checkRequired("taxRate", taxRate),
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    discountAmount,
                    discountCycle,
                    name,
                    tax,
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
        fun validate(): ProductCart = apply {
            if (validated) {
                return@apply
            }

            creditEntitlements().forEach { it.validate() }
            currency().validate()
            discountedPrice()
            isSubscription()
            isUsageBased()
            meters().forEach { it.validate() }
            ogCurrency().validate()
            ogPrice()
            productId()
            quantity()
            taxCategory().validate()
            taxInclusive()
            taxRate()
            addons()?.forEach { it.validate() }
            description()
            discountAmount()
            discountCycle()
            name()
            tax()
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
            (creditEntitlements.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (currency.asKnown()?.validity() ?: 0) +
                (if (discountedPrice.asKnown() == null) 0 else 1) +
                (if (isSubscription.asKnown() == null) 0 else 1) +
                (if (isUsageBased.asKnown() == null) 0 else 1) +
                (meters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (ogCurrency.asKnown()?.validity() ?: 0) +
                (if (ogPrice.asKnown() == null) 0 else 1) +
                (if (productId.asKnown() == null) 0 else 1) +
                (if (quantity.asKnown() == null) 0 else 1) +
                (taxCategory.asKnown()?.validity() ?: 0) +
                (if (taxInclusive.asKnown() == null) 0 else 1) +
                (if (taxRate.asKnown() == null) 0 else 1) +
                (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (discountAmount.asKnown() == null) 0 else 1) +
                (if (discountCycle.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (tax.asKnown() == null) 0 else 1)

        /**
         * Minimal credit entitlement info shown at checkout — what credits the customer will
         * receive
         */
        class CreditEntitlement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val creditEntitlementId: JsonField<String>,
            private val creditEntitlementName: JsonField<String>,
            private val creditEntitlementUnit: JsonField<String>,
            private val creditsAmount: JsonField<String>,
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
                @JsonProperty("credit_entitlement_unit")
                @ExcludeMissing
                creditEntitlementUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("credits_amount")
                @ExcludeMissing
                creditsAmount: JsonField<String> = JsonMissing.of(),
            ) : this(
                creditEntitlementId,
                creditEntitlementName,
                creditEntitlementUnit,
                creditsAmount,
                mutableMapOf(),
            )

            /**
             * ID of the credit entitlement
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditEntitlementId(): String =
                creditEntitlementId.getRequired("credit_entitlement_id")

            /**
             * Name of the credit entitlement
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditEntitlementName(): String =
                creditEntitlementName.getRequired("credit_entitlement_name")

            /**
             * Unit label (e.g. "API Calls", "Tokens")
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditEntitlementUnit(): String =
                creditEntitlementUnit.getRequired("credit_entitlement_unit")

            /**
             * Number of credits granted
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditsAmount(): String = creditsAmount.getRequired("credits_amount")

            /**
             * Returns the raw JSON value of [creditEntitlementId].
             *
             * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

            /**
             * Returns the raw JSON value of [creditEntitlementName].
             *
             * Unlike [creditEntitlementName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("credit_entitlement_name")
            @ExcludeMissing
            fun _creditEntitlementName(): JsonField<String> = creditEntitlementName

            /**
             * Returns the raw JSON value of [creditEntitlementUnit].
             *
             * Unlike [creditEntitlementUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("credit_entitlement_unit")
            @ExcludeMissing
            fun _creditEntitlementUnit(): JsonField<String> = creditEntitlementUnit

            /**
             * Returns the raw JSON value of [creditsAmount].
             *
             * Unlike [creditsAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credits_amount")
            @ExcludeMissing
            fun _creditsAmount(): JsonField<String> = creditsAmount

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
                 * .creditEntitlementId()
                 * .creditEntitlementName()
                 * .creditEntitlementUnit()
                 * .creditsAmount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CreditEntitlement]. */
            class Builder internal constructor() {

                private var creditEntitlementId: JsonField<String>? = null
                private var creditEntitlementName: JsonField<String>? = null
                private var creditEntitlementUnit: JsonField<String>? = null
                private var creditsAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditEntitlement: CreditEntitlement) = apply {
                    creditEntitlementId = creditEntitlement.creditEntitlementId
                    creditEntitlementName = creditEntitlement.creditEntitlementName
                    creditEntitlementUnit = creditEntitlement.creditEntitlementUnit
                    creditsAmount = creditEntitlement.creditsAmount
                    additionalProperties = creditEntitlement.additionalProperties.toMutableMap()
                }

                /** ID of the credit entitlement */
                fun creditEntitlementId(creditEntitlementId: String) =
                    creditEntitlementId(JsonField.of(creditEntitlementId))

                /**
                 * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                    this.creditEntitlementId = creditEntitlementId
                }

                /** Name of the credit entitlement */
                fun creditEntitlementName(creditEntitlementName: String) =
                    creditEntitlementName(JsonField.of(creditEntitlementName))

                /**
                 * Sets [Builder.creditEntitlementName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditEntitlementName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun creditEntitlementName(creditEntitlementName: JsonField<String>) = apply {
                    this.creditEntitlementName = creditEntitlementName
                }

                /** Unit label (e.g. "API Calls", "Tokens") */
                fun creditEntitlementUnit(creditEntitlementUnit: String) =
                    creditEntitlementUnit(JsonField.of(creditEntitlementUnit))

                /**
                 * Sets [Builder.creditEntitlementUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditEntitlementUnit] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun creditEntitlementUnit(creditEntitlementUnit: JsonField<String>) = apply {
                    this.creditEntitlementUnit = creditEntitlementUnit
                }

                /** Number of credits granted */
                fun creditsAmount(creditsAmount: String) =
                    creditsAmount(JsonField.of(creditsAmount))

                /**
                 * Sets [Builder.creditsAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditsAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditsAmount(creditsAmount: JsonField<String>) = apply {
                    this.creditsAmount = creditsAmount
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
                 * .creditEntitlementId()
                 * .creditEntitlementName()
                 * .creditEntitlementUnit()
                 * .creditsAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreditEntitlement =
                    CreditEntitlement(
                        checkRequired("creditEntitlementId", creditEntitlementId),
                        checkRequired("creditEntitlementName", creditEntitlementName),
                        checkRequired("creditEntitlementUnit", creditEntitlementUnit),
                        checkRequired("creditsAmount", creditsAmount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): CreditEntitlement = apply {
                if (validated) {
                    return@apply
                }

                creditEntitlementId()
                creditEntitlementName()
                creditEntitlementUnit()
                creditsAmount()
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
                (if (creditEntitlementId.asKnown() == null) 0 else 1) +
                    (if (creditEntitlementName.asKnown() == null) 0 else 1) +
                    (if (creditEntitlementUnit.asKnown() == null) 0 else 1) +
                    (if (creditsAmount.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditEntitlement &&
                    creditEntitlementId == other.creditEntitlementId &&
                    creditEntitlementName == other.creditEntitlementName &&
                    creditEntitlementUnit == other.creditEntitlementUnit &&
                    creditsAmount == other.creditsAmount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    creditEntitlementId,
                    creditEntitlementName,
                    creditEntitlementUnit,
                    creditsAmount,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditEntitlement{creditEntitlementId=$creditEntitlementId, creditEntitlementName=$creditEntitlementName, creditEntitlementUnit=$creditEntitlementUnit, creditsAmount=$creditsAmount, additionalProperties=$additionalProperties}"
        }

        class Meter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val measurementUnit: JsonField<String>,
            private val name: JsonField<String>,
            private val pricePerUnit: JsonField<String>,
            private val description: JsonField<String>,
            private val freeThreshold: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("measurement_unit")
                @ExcludeMissing
                measurementUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("price_per_unit")
                @ExcludeMissing
                pricePerUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("free_threshold")
                @ExcludeMissing
                freeThreshold: JsonField<Long> = JsonMissing.of(),
            ) : this(
                measurementUnit,
                name,
                pricePerUnit,
                description,
                freeThreshold,
                mutableMapOf(),
            )

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun measurementUnit(): String = measurementUnit.getRequired("measurement_unit")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pricePerUnit(): String = pricePerUnit.getRequired("price_per_unit")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun freeThreshold(): Long? = freeThreshold.getNullable("free_threshold")

            /**
             * Returns the raw JSON value of [measurementUnit].
             *
             * Unlike [measurementUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("measurement_unit")
            @ExcludeMissing
            fun _measurementUnit(): JsonField<String> = measurementUnit

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [freeThreshold].
             *
             * Unlike [freeThreshold], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("free_threshold")
            @ExcludeMissing
            fun _freeThreshold(): JsonField<Long> = freeThreshold

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
                 * Returns a mutable builder for constructing an instance of [Meter].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .measurementUnit()
                 * .name()
                 * .pricePerUnit()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Meter]. */
            class Builder internal constructor() {

                private var measurementUnit: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var pricePerUnit: JsonField<String>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var freeThreshold: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(meter: Meter) = apply {
                    measurementUnit = meter.measurementUnit
                    name = meter.name
                    pricePerUnit = meter.pricePerUnit
                    description = meter.description
                    freeThreshold = meter.freeThreshold
                    additionalProperties = meter.additionalProperties.toMutableMap()
                }

                fun measurementUnit(measurementUnit: String) =
                    measurementUnit(JsonField.of(measurementUnit))

                /**
                 * Sets [Builder.measurementUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.measurementUnit] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun measurementUnit(measurementUnit: JsonField<String>) = apply {
                    this.measurementUnit = measurementUnit
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun pricePerUnit(pricePerUnit: String) = pricePerUnit(JsonField.of(pricePerUnit))

                /**
                 * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pricePerUnit] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
                    this.pricePerUnit = pricePerUnit
                }

                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun freeThreshold(freeThreshold: Long?) =
                    freeThreshold(JsonField.ofNullable(freeThreshold))

                /**
                 * Alias for [Builder.freeThreshold].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun freeThreshold(freeThreshold: Long) = freeThreshold(freeThreshold as Long?)

                /**
                 * Sets [Builder.freeThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.freeThreshold] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun freeThreshold(freeThreshold: JsonField<Long>) = apply {
                    this.freeThreshold = freeThreshold
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Meter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .measurementUnit()
                 * .name()
                 * .pricePerUnit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Meter =
                    Meter(
                        checkRequired("measurementUnit", measurementUnit),
                        checkRequired("name", name),
                        checkRequired("pricePerUnit", pricePerUnit),
                        description,
                        freeThreshold,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Meter = apply {
                if (validated) {
                    return@apply
                }

                measurementUnit()
                name()
                pricePerUnit()
                description()
                freeThreshold()
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
                (if (measurementUnit.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (pricePerUnit.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (freeThreshold.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Meter &&
                    measurementUnit == other.measurementUnit &&
                    name == other.name &&
                    pricePerUnit == other.pricePerUnit &&
                    description == other.description &&
                    freeThreshold == other.freeThreshold &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    measurementUnit,
                    name,
                    pricePerUnit,
                    description,
                    freeThreshold,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Meter{measurementUnit=$measurementUnit, name=$name, pricePerUnit=$pricePerUnit, description=$description, freeThreshold=$freeThreshold, additionalProperties=$additionalProperties}"
        }

        class Addon
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val addonId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val discountedPrice: JsonField<Int>,
            private val name: JsonField<String>,
            private val ogCurrency: JsonField<Currency>,
            private val ogPrice: JsonField<Int>,
            private val quantity: JsonField<Int>,
            private val singleQuantityPrice: JsonField<Int>,
            private val taxCategory: JsonField<TaxCategory>,
            private val taxInclusive: JsonField<Boolean>,
            private val taxRate: JsonField<Int>,
            private val description: JsonField<String>,
            private val discountAmount: JsonField<Int>,
            private val tax: JsonField<Int>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("addon_id")
                @ExcludeMissing
                addonId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("discounted_price")
                @ExcludeMissing
                discountedPrice: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("og_currency")
                @ExcludeMissing
                ogCurrency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("og_price")
                @ExcludeMissing
                ogPrice: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("single_quantity_price")
                @ExcludeMissing
                singleQuantityPrice: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("tax_category")
                @ExcludeMissing
                taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
                @JsonProperty("tax_inclusive")
                @ExcludeMissing
                taxInclusive: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("tax_rate")
                @ExcludeMissing
                taxRate: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("discount_amount")
                @ExcludeMissing
                discountAmount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
            ) : this(
                addonId,
                currency,
                discountedPrice,
                name,
                ogCurrency,
                ogPrice,
                quantity,
                singleQuantityPrice,
                taxCategory,
                taxInclusive,
                taxRate,
                description,
                discountAmount,
                tax,
                mutableMapOf(),
            )

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun addonId(): String = addonId.getRequired("addon_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun discountedPrice(): Int = discountedPrice.getRequired("discounted_price")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ogCurrency(): Currency = ogCurrency.getRequired("og_currency")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ogPrice(): Int = ogPrice.getRequired("og_price")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Int = quantity.getRequired("quantity")

            /**
             * Per-unit price in `currency`, converted and adaptive-priced but pre-tax and
             * pre-discount (both depend on quantity and the rest of the cart). Set even when
             * `quantity` is 0, so the checkout page can price the addon before the buyer has
             * selected any.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun singleQuantityPrice(): Int =
                singleQuantityPrice.getRequired("single_quantity_price")

            /**
             * Represents the different categories of taxation applicable to various products and
             * services.
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxCategory(): TaxCategory = taxCategory.getRequired("tax_category")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxRate(): Int = taxRate.getRequired("tax_rate")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * Percentage rate (basis points) of the applicable percentage code; null for flat codes
             * (their deduction is `og_price - discounted_price`).
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun discountAmount(): Int? = discountAmount.getNullable("discount_amount")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tax(): Int? = tax.getNullable("tax")

            /**
             * Returns the raw JSON value of [addonId].
             *
             * Unlike [addonId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("addon_id") @ExcludeMissing fun _addonId(): JsonField<String> = addonId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [discountedPrice].
             *
             * Unlike [discountedPrice], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("discounted_price")
            @ExcludeMissing
            fun _discountedPrice(): JsonField<Int> = discountedPrice

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [ogCurrency].
             *
             * Unlike [ogCurrency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("og_currency")
            @ExcludeMissing
            fun _ogCurrency(): JsonField<Currency> = ogCurrency

            /**
             * Returns the raw JSON value of [ogPrice].
             *
             * Unlike [ogPrice], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("og_price") @ExcludeMissing fun _ogPrice(): JsonField<Int> = ogPrice

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

            /**
             * Returns the raw JSON value of [singleQuantityPrice].
             *
             * Unlike [singleQuantityPrice], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("single_quantity_price")
            @ExcludeMissing
            fun _singleQuantityPrice(): JsonField<Int> = singleQuantityPrice

            /**
             * Returns the raw JSON value of [taxCategory].
             *
             * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tax_category")
            @ExcludeMissing
            fun _taxCategory(): JsonField<TaxCategory> = taxCategory

            /**
             * Returns the raw JSON value of [taxInclusive].
             *
             * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            fun _taxInclusive(): JsonField<Boolean> = taxInclusive

            /**
             * Returns the raw JSON value of [taxRate].
             *
             * Unlike [taxRate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax_rate") @ExcludeMissing fun _taxRate(): JsonField<Int> = taxRate

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [discountAmount].
             *
             * Unlike [discountAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("discount_amount")
            @ExcludeMissing
            fun _discountAmount(): JsonField<Int> = discountAmount

            /**
             * Returns the raw JSON value of [tax].
             *
             * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

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
                 * Returns a mutable builder for constructing an instance of [Addon].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .addonId()
                 * .currency()
                 * .discountedPrice()
                 * .name()
                 * .ogCurrency()
                 * .ogPrice()
                 * .quantity()
                 * .singleQuantityPrice()
                 * .taxCategory()
                 * .taxInclusive()
                 * .taxRate()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Addon]. */
            class Builder internal constructor() {

                private var addonId: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var discountedPrice: JsonField<Int>? = null
                private var name: JsonField<String>? = null
                private var ogCurrency: JsonField<Currency>? = null
                private var ogPrice: JsonField<Int>? = null
                private var quantity: JsonField<Int>? = null
                private var singleQuantityPrice: JsonField<Int>? = null
                private var taxCategory: JsonField<TaxCategory>? = null
                private var taxInclusive: JsonField<Boolean>? = null
                private var taxRate: JsonField<Int>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var discountAmount: JsonField<Int> = JsonMissing.of()
                private var tax: JsonField<Int> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(addon: Addon) = apply {
                    addonId = addon.addonId
                    currency = addon.currency
                    discountedPrice = addon.discountedPrice
                    name = addon.name
                    ogCurrency = addon.ogCurrency
                    ogPrice = addon.ogPrice
                    quantity = addon.quantity
                    singleQuantityPrice = addon.singleQuantityPrice
                    taxCategory = addon.taxCategory
                    taxInclusive = addon.taxInclusive
                    taxRate = addon.taxRate
                    description = addon.description
                    discountAmount = addon.discountAmount
                    tax = addon.tax
                    additionalProperties = addon.additionalProperties.toMutableMap()
                }

                fun addonId(addonId: String) = addonId(JsonField.of(addonId))

                /**
                 * Sets [Builder.addonId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.addonId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun addonId(addonId: JsonField<String>) = apply { this.addonId = addonId }

                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun discountedPrice(discountedPrice: Int) =
                    discountedPrice(JsonField.of(discountedPrice))

                /**
                 * Sets [Builder.discountedPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discountedPrice] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun discountedPrice(discountedPrice: JsonField<Int>) = apply {
                    this.discountedPrice = discountedPrice
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun ogCurrency(ogCurrency: Currency) = ogCurrency(JsonField.of(ogCurrency))

                /**
                 * Sets [Builder.ogCurrency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ogCurrency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ogCurrency(ogCurrency: JsonField<Currency>) = apply {
                    this.ogCurrency = ogCurrency
                }

                fun ogPrice(ogPrice: Int) = ogPrice(JsonField.of(ogPrice))

                /**
                 * Sets [Builder.ogPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ogPrice] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ogPrice(ogPrice: JsonField<Int>) = apply { this.ogPrice = ogPrice }

                fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

                /**
                 * Per-unit price in `currency`, converted and adaptive-priced but pre-tax and
                 * pre-discount (both depend on quantity and the rest of the cart). Set even when
                 * `quantity` is 0, so the checkout page can price the addon before the buyer has
                 * selected any.
                 */
                fun singleQuantityPrice(singleQuantityPrice: Int) =
                    singleQuantityPrice(JsonField.of(singleQuantityPrice))

                /**
                 * Sets [Builder.singleQuantityPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.singleQuantityPrice] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun singleQuantityPrice(singleQuantityPrice: JsonField<Int>) = apply {
                    this.singleQuantityPrice = singleQuantityPrice
                }

                /**
                 * Represents the different categories of taxation applicable to various products
                 * and services.
                 */
                fun taxCategory(taxCategory: TaxCategory) = taxCategory(JsonField.of(taxCategory))

                /**
                 * Sets [Builder.taxCategory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxCategory] with a well-typed [TaxCategory]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
                    this.taxCategory = taxCategory
                }

                fun taxInclusive(taxInclusive: Boolean) = taxInclusive(JsonField.of(taxInclusive))

                /**
                 * Sets [Builder.taxInclusive] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                    this.taxInclusive = taxInclusive
                }

                fun taxRate(taxRate: Int) = taxRate(JsonField.of(taxRate))

                /**
                 * Sets [Builder.taxRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxRate] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun taxRate(taxRate: JsonField<Int>) = apply { this.taxRate = taxRate }

                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * Percentage rate (basis points) of the applicable percentage code; null for flat
                 * codes (their deduction is `og_price - discounted_price`).
                 */
                fun discountAmount(discountAmount: Int?) =
                    discountAmount(JsonField.ofNullable(discountAmount))

                /**
                 * Alias for [Builder.discountAmount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun discountAmount(discountAmount: Int) = discountAmount(discountAmount as Int?)

                /**
                 * Sets [Builder.discountAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.discountAmount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun discountAmount(discountAmount: JsonField<Int>) = apply {
                    this.discountAmount = discountAmount
                }

                fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

                /**
                 * Alias for [Builder.tax].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun tax(tax: Int) = tax(tax as Int?)

                /**
                 * Sets [Builder.tax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tax] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Addon].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .addonId()
                 * .currency()
                 * .discountedPrice()
                 * .name()
                 * .ogCurrency()
                 * .ogPrice()
                 * .quantity()
                 * .singleQuantityPrice()
                 * .taxCategory()
                 * .taxInclusive()
                 * .taxRate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Addon =
                    Addon(
                        checkRequired("addonId", addonId),
                        checkRequired("currency", currency),
                        checkRequired("discountedPrice", discountedPrice),
                        checkRequired("name", name),
                        checkRequired("ogCurrency", ogCurrency),
                        checkRequired("ogPrice", ogPrice),
                        checkRequired("quantity", quantity),
                        checkRequired("singleQuantityPrice", singleQuantityPrice),
                        checkRequired("taxCategory", taxCategory),
                        checkRequired("taxInclusive", taxInclusive),
                        checkRequired("taxRate", taxRate),
                        description,
                        discountAmount,
                        tax,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Addon = apply {
                if (validated) {
                    return@apply
                }

                addonId()
                currency().validate()
                discountedPrice()
                name()
                ogCurrency().validate()
                ogPrice()
                quantity()
                singleQuantityPrice()
                taxCategory().validate()
                taxInclusive()
                taxRate()
                description()
                discountAmount()
                tax()
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
                (if (addonId.asKnown() == null) 0 else 1) +
                    (currency.asKnown()?.validity() ?: 0) +
                    (if (discountedPrice.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (ogCurrency.asKnown()?.validity() ?: 0) +
                    (if (ogPrice.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1) +
                    (if (singleQuantityPrice.asKnown() == null) 0 else 1) +
                    (taxCategory.asKnown()?.validity() ?: 0) +
                    (if (taxInclusive.asKnown() == null) 0 else 1) +
                    (if (taxRate.asKnown() == null) 0 else 1) +
                    (if (description.asKnown() == null) 0 else 1) +
                    (if (discountAmount.asKnown() == null) 0 else 1) +
                    (if (tax.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Addon &&
                    addonId == other.addonId &&
                    currency == other.currency &&
                    discountedPrice == other.discountedPrice &&
                    name == other.name &&
                    ogCurrency == other.ogCurrency &&
                    ogPrice == other.ogPrice &&
                    quantity == other.quantity &&
                    singleQuantityPrice == other.singleQuantityPrice &&
                    taxCategory == other.taxCategory &&
                    taxInclusive == other.taxInclusive &&
                    taxRate == other.taxRate &&
                    description == other.description &&
                    discountAmount == other.discountAmount &&
                    tax == other.tax &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    addonId,
                    currency,
                    discountedPrice,
                    name,
                    ogCurrency,
                    ogPrice,
                    quantity,
                    singleQuantityPrice,
                    taxCategory,
                    taxInclusive,
                    taxRate,
                    description,
                    discountAmount,
                    tax,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Addon{addonId=$addonId, currency=$currency, discountedPrice=$discountedPrice, name=$name, ogCurrency=$ogCurrency, ogPrice=$ogPrice, quantity=$quantity, singleQuantityPrice=$singleQuantityPrice, taxCategory=$taxCategory, taxInclusive=$taxInclusive, taxRate=$taxRate, description=$description, discountAmount=$discountAmount, tax=$tax, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProductCart &&
                creditEntitlements == other.creditEntitlements &&
                currency == other.currency &&
                discountedPrice == other.discountedPrice &&
                isSubscription == other.isSubscription &&
                isUsageBased == other.isUsageBased &&
                meters == other.meters &&
                ogCurrency == other.ogCurrency &&
                ogPrice == other.ogPrice &&
                productId == other.productId &&
                quantity == other.quantity &&
                taxCategory == other.taxCategory &&
                taxInclusive == other.taxInclusive &&
                taxRate == other.taxRate &&
                addons == other.addons &&
                description == other.description &&
                discountAmount == other.discountAmount &&
                discountCycle == other.discountCycle &&
                name == other.name &&
                tax == other.tax &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditEntitlements,
                currency,
                discountedPrice,
                isSubscription,
                isUsageBased,
                meters,
                ogCurrency,
                ogPrice,
                productId,
                quantity,
                taxCategory,
                taxInclusive,
                taxRate,
                addons,
                description,
                discountAmount,
                discountCycle,
                name,
                tax,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductCart{creditEntitlements=$creditEntitlements, currency=$currency, discountedPrice=$discountedPrice, isSubscription=$isSubscription, isUsageBased=$isUsageBased, meters=$meters, ogCurrency=$ogCurrency, ogPrice=$ogPrice, productId=$productId, quantity=$quantity, taxCategory=$taxCategory, taxInclusive=$taxInclusive, taxRate=$taxRate, addons=$addons, description=$description, discountAmount=$discountAmount, discountCycle=$discountCycle, name=$name, tax=$tax, additionalProperties=$additionalProperties}"
    }

    /** Breakup of recurring payments (None for one-time only) */
    class RecurringBreakup
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val discount: JsonField<Int>,
        private val subtotal: JsonField<Int>,
        private val totalAmount: JsonField<Int>,
        private val tax: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("discount") @ExcludeMissing discount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("total_amount")
            @ExcludeMissing
            totalAmount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
        ) : this(discount, subtotal, totalAmount, tax, mutableMapOf())

        /**
         * Total discount amount
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discount(): Int = discount.getRequired("discount")

        /**
         * Subtotal before discount (pre-tax original prices)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtotal(): Int = subtotal.getRequired("subtotal")

        /**
         * Total recurring amount including tax
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalAmount(): Int = totalAmount.getRequired("total_amount")

        /**
         * Total tax on recurring payments
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tax(): Int? = tax.getNullable("tax")

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Int> = discount

        /**
         * Returns the raw JSON value of [subtotal].
         *
         * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Int> = subtotal

        /**
         * Returns the raw JSON value of [totalAmount].
         *
         * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_amount")
        @ExcludeMissing
        fun _totalAmount(): JsonField<Int> = totalAmount

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

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
             * Returns a mutable builder for constructing an instance of [RecurringBreakup].
             *
             * The following fields are required:
             * ```kotlin
             * .discount()
             * .subtotal()
             * .totalAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RecurringBreakup]. */
        class Builder internal constructor() {

            private var discount: JsonField<Int>? = null
            private var subtotal: JsonField<Int>? = null
            private var totalAmount: JsonField<Int>? = null
            private var tax: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(recurringBreakup: RecurringBreakup) = apply {
                discount = recurringBreakup.discount
                subtotal = recurringBreakup.subtotal
                totalAmount = recurringBreakup.totalAmount
                tax = recurringBreakup.tax
                additionalProperties = recurringBreakup.additionalProperties.toMutableMap()
            }

            /** Total discount amount */
            fun discount(discount: Int) = discount(JsonField.of(discount))

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Int>) = apply { this.discount = discount }

            /** Subtotal before discount (pre-tax original prices) */
            fun subtotal(subtotal: Int) = subtotal(JsonField.of(subtotal))

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<Int>) = apply { this.subtotal = subtotal }

            /** Total recurring amount including tax */
            fun totalAmount(totalAmount: Int) = totalAmount(JsonField.of(totalAmount))

            /**
             * Sets [Builder.totalAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalAmount] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalAmount(totalAmount: JsonField<Int>) = apply { this.totalAmount = totalAmount }

            /** Total tax on recurring payments */
            fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

            /**
             * Alias for [Builder.tax].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tax(tax: Int) = tax(tax as Int?)

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

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
             * Returns an immutable instance of [RecurringBreakup].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .discount()
             * .subtotal()
             * .totalAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RecurringBreakup =
                RecurringBreakup(
                    checkRequired("discount", discount),
                    checkRequired("subtotal", subtotal),
                    checkRequired("totalAmount", totalAmount),
                    tax,
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
        fun validate(): RecurringBreakup = apply {
            if (validated) {
                return@apply
            }

            discount()
            subtotal()
            totalAmount()
            tax()
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
            (if (discount.asKnown() == null) 0 else 1) +
                (if (subtotal.asKnown() == null) 0 else 1) +
                (if (totalAmount.asKnown() == null) 0 else 1) +
                (if (tax.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecurringBreakup &&
                discount == other.discount &&
                subtotal == other.subtotal &&
                totalAmount == other.totalAmount &&
                tax == other.tax &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(discount, subtotal, totalAmount, tax, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RecurringBreakup{discount=$discount, subtotal=$subtotal, totalAmount=$totalAmount, tax=$tax, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckoutSessionPreviewResponse &&
            billingCountry == other.billingCountry &&
            currency == other.currency &&
            currentBreakup == other.currentBreakup &&
            isByop == other.isByop &&
            productCart == other.productCart &&
            totalPrice == other.totalPrice &&
            nextBillingDate == other.nextBillingDate &&
            recurringBreakup == other.recurringBreakup &&
            taxIdBusinessName == other.taxIdBusinessName &&
            taxIdErrMsg == other.taxIdErrMsg &&
            taxIdFormatName == other.taxIdFormatName &&
            totalTax == other.totalTax &&
            trialAmount == other.trialAmount &&
            trialPeriodDays == other.trialPeriodDays &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            billingCountry,
            currency,
            currentBreakup,
            isByop,
            productCart,
            totalPrice,
            nextBillingDate,
            recurringBreakup,
            taxIdBusinessName,
            taxIdErrMsg,
            taxIdFormatName,
            totalTax,
            trialAmount,
            trialPeriodDays,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckoutSessionPreviewResponse{billingCountry=$billingCountry, currency=$currency, currentBreakup=$currentBreakup, isByop=$isByop, productCart=$productCart, totalPrice=$totalPrice, nextBillingDate=$nextBillingDate, recurringBreakup=$recurringBreakup, taxIdBusinessName=$taxIdBusinessName, taxIdErrMsg=$taxIdErrMsg, taxIdFormatName=$taxIdFormatName, totalTax=$totalTax, trialAmount=$trialAmount, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
}
