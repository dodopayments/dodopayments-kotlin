// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomFieldResponse
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Response struct representing subscription details */
class Subscription
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addons: JsonField<List<AddonCartResponseItem>>,
    private val billing: JsonField<BillingAddress>,
    private val cancelAtNextBillingDate: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditEntitlementCart: JsonField<List<CreditEntitlementCart>>,
    private val currency: JsonField<Currency>,
    private val customer: JsonField<CustomerLimitedDetails>,
    private val metadata: JsonField<Metadata>,
    private val meterCreditEntitlementCart: JsonField<List<MeterCreditEntitlementCart>>,
    private val meters: JsonField<List<Meter>>,
    private val nextBillingDate: JsonField<OffsetDateTime>,
    private val onDemand: JsonField<Boolean>,
    private val paymentFrequencyCount: JsonField<Int>,
    private val paymentFrequencyInterval: JsonField<TimeInterval>,
    private val previousBillingDate: JsonField<OffsetDateTime>,
    private val productId: JsonField<String>,
    private val quantity: JsonField<Int>,
    private val recurringPreTaxAmount: JsonField<Int>,
    private val status: JsonField<SubscriptionStatus>,
    private val subscriptionId: JsonField<String>,
    private val subscriptionPeriodCount: JsonField<Int>,
    private val subscriptionPeriodInterval: JsonField<TimeInterval>,
    private val taxInclusive: JsonField<Boolean>,
    private val trialPeriodDays: JsonField<Int>,
    private val cancelledAt: JsonField<OffsetDateTime>,
    private val customFieldResponses: JsonField<List<CustomFieldResponse>>,
    private val discountCyclesRemaining: JsonField<Int>,
    private val discountId: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val paymentMethodId: JsonField<String>,
    private val taxId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("addons")
        @ExcludeMissing
        addons: JsonField<List<AddonCartResponseItem>> = JsonMissing.of(),
        @JsonProperty("billing")
        @ExcludeMissing
        billing: JsonField<BillingAddress> = JsonMissing.of(),
        @JsonProperty("cancel_at_next_billing_date")
        @ExcludeMissing
        cancelAtNextBillingDate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_entitlement_cart")
        @ExcludeMissing
        creditEntitlementCart: JsonField<List<CreditEntitlementCart>> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("meter_credit_entitlement_cart")
        @ExcludeMissing
        meterCreditEntitlementCart: JsonField<List<MeterCreditEntitlementCart>> = JsonMissing.of(),
        @JsonProperty("meters") @ExcludeMissing meters: JsonField<List<Meter>> = JsonMissing.of(),
        @JsonProperty("next_billing_date")
        @ExcludeMissing
        nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("on_demand") @ExcludeMissing onDemand: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_frequency_count")
        @ExcludeMissing
        paymentFrequencyCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("payment_frequency_interval")
        @ExcludeMissing
        paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
        @JsonProperty("previous_billing_date")
        @ExcludeMissing
        previousBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("recurring_pre_tax_amount")
        @ExcludeMissing
        recurringPreTaxAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<SubscriptionStatus> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscription_period_count")
        @ExcludeMissing
        subscriptionPeriodCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("subscription_period_interval")
        @ExcludeMissing
        subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        taxInclusive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        trialPeriodDays: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cancelled_at")
        @ExcludeMissing
        cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_field_responses")
        @ExcludeMissing
        customFieldResponses: JsonField<List<CustomFieldResponse>> = JsonMissing.of(),
        @JsonProperty("discount_cycles_remaining")
        @ExcludeMissing
        discountCyclesRemaining: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_method_id")
        @ExcludeMissing
        paymentMethodId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
    ) : this(
        addons,
        billing,
        cancelAtNextBillingDate,
        createdAt,
        creditEntitlementCart,
        currency,
        customer,
        metadata,
        meterCreditEntitlementCart,
        meters,
        nextBillingDate,
        onDemand,
        paymentFrequencyCount,
        paymentFrequencyInterval,
        previousBillingDate,
        productId,
        quantity,
        recurringPreTaxAmount,
        status,
        subscriptionId,
        subscriptionPeriodCount,
        subscriptionPeriodInterval,
        taxInclusive,
        trialPeriodDays,
        cancelledAt,
        customFieldResponses,
        discountCyclesRemaining,
        discountId,
        expiresAt,
        paymentMethodId,
        taxId,
        mutableMapOf(),
    )

    /**
     * Addons associated with this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addons(): List<AddonCartResponseItem> = addons.getRequired("addons")

    /**
     * Billing address details for payments
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billing(): BillingAddress = billing.getRequired("billing")

    /**
     * Indicates if the subscription will cancel at the next billing date
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cancelAtNextBillingDate(): Boolean =
        cancelAtNextBillingDate.getRequired("cancel_at_next_billing_date")

    /**
     * Timestamp when the subscription was created
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Credit entitlement cart settings for this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditEntitlementCart(): List<CreditEntitlementCart> =
        creditEntitlementCart.getRequired("credit_entitlement_cart")

    /**
     * Currency used for the subscription payments
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Customer details associated with the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    /**
     * Additional custom data associated with the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Meter credit entitlement cart settings for this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meterCreditEntitlementCart(): List<MeterCreditEntitlementCart> =
        meterCreditEntitlementCart.getRequired("meter_credit_entitlement_cart")

    /**
     * Meters associated with this subscription (for usage-based billing)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meters(): List<Meter> = meters.getRequired("meters")

    /**
     * Timestamp of the next scheduled billing. Indicates the end of current billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nextBillingDate(): OffsetDateTime = nextBillingDate.getRequired("next_billing_date")

    /**
     * Wether the subscription is on-demand or not
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun onDemand(): Boolean = onDemand.getRequired("on_demand")

    /**
     * Number of payment frequency intervals
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentFrequencyCount(): Int = paymentFrequencyCount.getRequired("payment_frequency_count")

    /**
     * Time interval for payment frequency (e.g. month, year)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentFrequencyInterval(): TimeInterval =
        paymentFrequencyInterval.getRequired("payment_frequency_interval")

    /**
     * Timestamp of the last payment. Indicates the start of current billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previousBillingDate(): OffsetDateTime =
        previousBillingDate.getRequired("previous_billing_date")

    /**
     * Identifier of the product associated with this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Number of units/items included in the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Int = quantity.getRequired("quantity")

    /**
     * Amount charged before tax for each recurring payment in smallest currency unit (e.g. cents)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recurringPreTaxAmount(): Int = recurringPreTaxAmount.getRequired("recurring_pre_tax_amount")

    /**
     * Current status of the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): SubscriptionStatus = status.getRequired("status")

    /**
     * Unique identifier for the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /**
     * Number of subscription period intervals
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionPeriodCount(): Int =
        subscriptionPeriodCount.getRequired("subscription_period_count")

    /**
     * Time interval for the subscription period (e.g. month, year)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionPeriodInterval(): TimeInterval =
        subscriptionPeriodInterval.getRequired("subscription_period_interval")

    /**
     * Indicates if the recurring_pre_tax_amount is tax inclusive
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

    /**
     * Number of days in the trial period (0 if no trial)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialPeriodDays(): Int = trialPeriodDays.getRequired("trial_period_days")

    /**
     * Cancelled timestamp if the subscription is cancelled
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelledAt(): OffsetDateTime? = cancelledAt.getNullable("cancelled_at")

    /**
     * Customer's responses to custom fields collected during checkout
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customFieldResponses(): List<CustomFieldResponse>? =
        customFieldResponses.getNullable("custom_field_responses")

    /**
     * Number of remaining discount cycles if discount is applied
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountCyclesRemaining(): Int? =
        discountCyclesRemaining.getNullable("discount_cycles_remaining")

    /**
     * The discount id if discount is applied
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountId(): String? = discountId.getNullable("discount_id")

    /**
     * Timestamp when the subscription will expire
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /**
     * Saved payment method id used for recurring charges
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethodId(): String? = paymentMethodId.getNullable("payment_method_id")

    /**
     * Tax identifier provided for this subscription (if applicable)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxId(): String? = taxId.getNullable("tax_id")

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addons")
    @ExcludeMissing
    fun _addons(): JsonField<List<AddonCartResponseItem>> = addons

    /**
     * Returns the raw JSON value of [billing].
     *
     * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<BillingAddress> = billing

    /**
     * Returns the raw JSON value of [cancelAtNextBillingDate].
     *
     * Unlike [cancelAtNextBillingDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cancel_at_next_billing_date")
    @ExcludeMissing
    fun _cancelAtNextBillingDate(): JsonField<Boolean> = cancelAtNextBillingDate

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditEntitlementCart].
     *
     * Unlike [creditEntitlementCart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_entitlement_cart")
    @ExcludeMissing
    fun _creditEntitlementCart(): JsonField<List<CreditEntitlementCart>> = creditEntitlementCart

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerLimitedDetails> = customer

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [meterCreditEntitlementCart].
     *
     * Unlike [meterCreditEntitlementCart], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("meter_credit_entitlement_cart")
    @ExcludeMissing
    fun _meterCreditEntitlementCart(): JsonField<List<MeterCreditEntitlementCart>> =
        meterCreditEntitlementCart

    /**
     * Returns the raw JSON value of [meters].
     *
     * Unlike [meters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meters") @ExcludeMissing fun _meters(): JsonField<List<Meter>> = meters

    /**
     * Returns the raw JSON value of [nextBillingDate].
     *
     * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_billing_date")
    @ExcludeMissing
    fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

    /**
     * Returns the raw JSON value of [onDemand].
     *
     * Unlike [onDemand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("on_demand") @ExcludeMissing fun _onDemand(): JsonField<Boolean> = onDemand

    /**
     * Returns the raw JSON value of [paymentFrequencyCount].
     *
     * Unlike [paymentFrequencyCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_frequency_count")
    @ExcludeMissing
    fun _paymentFrequencyCount(): JsonField<Int> = paymentFrequencyCount

    /**
     * Returns the raw JSON value of [paymentFrequencyInterval].
     *
     * Unlike [paymentFrequencyInterval], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("payment_frequency_interval")
    @ExcludeMissing
    fun _paymentFrequencyInterval(): JsonField<TimeInterval> = paymentFrequencyInterval

    /**
     * Returns the raw JSON value of [previousBillingDate].
     *
     * Unlike [previousBillingDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_billing_date")
    @ExcludeMissing
    fun _previousBillingDate(): JsonField<OffsetDateTime> = previousBillingDate

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
     * Returns the raw JSON value of [recurringPreTaxAmount].
     *
     * Unlike [recurringPreTaxAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recurring_pre_tax_amount")
    @ExcludeMissing
    fun _recurringPreTaxAmount(): JsonField<Int> = recurringPreTaxAmount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<SubscriptionStatus> = status

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [subscriptionPeriodCount].
     *
     * Unlike [subscriptionPeriodCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("subscription_period_count")
    @ExcludeMissing
    fun _subscriptionPeriodCount(): JsonField<Int> = subscriptionPeriodCount

    /**
     * Returns the raw JSON value of [subscriptionPeriodInterval].
     *
     * Unlike [subscriptionPeriodInterval], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("subscription_period_interval")
    @ExcludeMissing
    fun _subscriptionPeriodInterval(): JsonField<TimeInterval> = subscriptionPeriodInterval

    /**
     * Returns the raw JSON value of [taxInclusive].
     *
     * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_inclusive")
    @ExcludeMissing
    fun _taxInclusive(): JsonField<Boolean> = taxInclusive

    /**
     * Returns the raw JSON value of [trialPeriodDays].
     *
     * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_period_days")
    @ExcludeMissing
    fun _trialPeriodDays(): JsonField<Int> = trialPeriodDays

    /**
     * Returns the raw JSON value of [cancelledAt].
     *
     * Unlike [cancelledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelled_at")
    @ExcludeMissing
    fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

    /**
     * Returns the raw JSON value of [customFieldResponses].
     *
     * Unlike [customFieldResponses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("custom_field_responses")
    @ExcludeMissing
    fun _customFieldResponses(): JsonField<List<CustomFieldResponse>> = customFieldResponses

    /**
     * Returns the raw JSON value of [discountCyclesRemaining].
     *
     * Unlike [discountCyclesRemaining], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("discount_cycles_remaining")
    @ExcludeMissing
    fun _discountCyclesRemaining(): JsonField<Int> = discountCyclesRemaining

    /**
     * Returns the raw JSON value of [discountId].
     *
     * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [paymentMethodId].
     *
     * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method_id")
    @ExcludeMissing
    fun _paymentMethodId(): JsonField<String> = paymentMethodId

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
         * Returns a mutable builder for constructing an instance of [Subscription].
         *
         * The following fields are required:
         * ```kotlin
         * .addons()
         * .billing()
         * .cancelAtNextBillingDate()
         * .createdAt()
         * .creditEntitlementCart()
         * .currency()
         * .customer()
         * .metadata()
         * .meterCreditEntitlementCart()
         * .meters()
         * .nextBillingDate()
         * .onDemand()
         * .paymentFrequencyCount()
         * .paymentFrequencyInterval()
         * .previousBillingDate()
         * .productId()
         * .quantity()
         * .recurringPreTaxAmount()
         * .status()
         * .subscriptionId()
         * .subscriptionPeriodCount()
         * .subscriptionPeriodInterval()
         * .taxInclusive()
         * .trialPeriodDays()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Subscription]. */
    class Builder internal constructor() {

        private var addons: JsonField<MutableList<AddonCartResponseItem>>? = null
        private var billing: JsonField<BillingAddress>? = null
        private var cancelAtNextBillingDate: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditEntitlementCart: JsonField<MutableList<CreditEntitlementCart>>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var metadata: JsonField<Metadata>? = null
        private var meterCreditEntitlementCart:
            JsonField<MutableList<MeterCreditEntitlementCart>>? =
            null
        private var meters: JsonField<MutableList<Meter>>? = null
        private var nextBillingDate: JsonField<OffsetDateTime>? = null
        private var onDemand: JsonField<Boolean>? = null
        private var paymentFrequencyCount: JsonField<Int>? = null
        private var paymentFrequencyInterval: JsonField<TimeInterval>? = null
        private var previousBillingDate: JsonField<OffsetDateTime>? = null
        private var productId: JsonField<String>? = null
        private var quantity: JsonField<Int>? = null
        private var recurringPreTaxAmount: JsonField<Int>? = null
        private var status: JsonField<SubscriptionStatus>? = null
        private var subscriptionId: JsonField<String>? = null
        private var subscriptionPeriodCount: JsonField<Int>? = null
        private var subscriptionPeriodInterval: JsonField<TimeInterval>? = null
        private var taxInclusive: JsonField<Boolean>? = null
        private var trialPeriodDays: JsonField<Int>? = null
        private var cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customFieldResponses: JsonField<MutableList<CustomFieldResponse>>? = null
        private var discountCyclesRemaining: JsonField<Int> = JsonMissing.of()
        private var discountId: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var paymentMethodId: JsonField<String> = JsonMissing.of()
        private var taxId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscription: Subscription) = apply {
            addons = subscription.addons.map { it.toMutableList() }
            billing = subscription.billing
            cancelAtNextBillingDate = subscription.cancelAtNextBillingDate
            createdAt = subscription.createdAt
            creditEntitlementCart = subscription.creditEntitlementCart.map { it.toMutableList() }
            currency = subscription.currency
            customer = subscription.customer
            metadata = subscription.metadata
            meterCreditEntitlementCart =
                subscription.meterCreditEntitlementCart.map { it.toMutableList() }
            meters = subscription.meters.map { it.toMutableList() }
            nextBillingDate = subscription.nextBillingDate
            onDemand = subscription.onDemand
            paymentFrequencyCount = subscription.paymentFrequencyCount
            paymentFrequencyInterval = subscription.paymentFrequencyInterval
            previousBillingDate = subscription.previousBillingDate
            productId = subscription.productId
            quantity = subscription.quantity
            recurringPreTaxAmount = subscription.recurringPreTaxAmount
            status = subscription.status
            subscriptionId = subscription.subscriptionId
            subscriptionPeriodCount = subscription.subscriptionPeriodCount
            subscriptionPeriodInterval = subscription.subscriptionPeriodInterval
            taxInclusive = subscription.taxInclusive
            trialPeriodDays = subscription.trialPeriodDays
            cancelledAt = subscription.cancelledAt
            customFieldResponses = subscription.customFieldResponses.map { it.toMutableList() }
            discountCyclesRemaining = subscription.discountCyclesRemaining
            discountId = subscription.discountId
            expiresAt = subscription.expiresAt
            paymentMethodId = subscription.paymentMethodId
            taxId = subscription.taxId
            additionalProperties = subscription.additionalProperties.toMutableMap()
        }

        /** Addons associated with this subscription */
        fun addons(addons: List<AddonCartResponseItem>) = addons(JsonField.of(addons))

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<AddonCartResponseItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addons(addons: JsonField<List<AddonCartResponseItem>>) = apply {
            this.addons = addons.map { it.toMutableList() }
        }

        /**
         * Adds a single [AddonCartResponseItem] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: AddonCartResponseItem) = apply {
            addons =
                (addons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addons", it).add(addon)
                }
        }

        /** Billing address details for payments */
        fun billing(billing: BillingAddress) = billing(JsonField.of(billing))

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

        /** Indicates if the subscription will cancel at the next billing date */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean) =
            cancelAtNextBillingDate(JsonField.of(cancelAtNextBillingDate))

        /**
         * Sets [Builder.cancelAtNextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelAtNextBillingDate] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: JsonField<Boolean>) = apply {
            this.cancelAtNextBillingDate = cancelAtNextBillingDate
        }

        /** Timestamp when the subscription was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Credit entitlement cart settings for this subscription */
        fun creditEntitlementCart(creditEntitlementCart: List<CreditEntitlementCart>) =
            creditEntitlementCart(JsonField.of(creditEntitlementCart))

        /**
         * Sets [Builder.creditEntitlementCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlementCart] with a well-typed
         * `List<CreditEntitlementCart>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun creditEntitlementCart(creditEntitlementCart: JsonField<List<CreditEntitlementCart>>) =
            apply {
                this.creditEntitlementCart = creditEntitlementCart.map { it.toMutableList() }
            }

        /**
         * Adds a single [CreditEntitlementCart] to [Builder.creditEntitlementCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditEntitlementCart(creditEntitlementCart: CreditEntitlementCart) = apply {
            this.creditEntitlementCart =
                (this.creditEntitlementCart ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditEntitlementCart", it).add(creditEntitlementCart)
                }
        }

        /** Currency used for the subscription payments */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Customer details associated with the subscription */
        fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [CustomerLimitedDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
            this.customer = customer
        }

        /** Additional custom data associated with the subscription */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Meter credit entitlement cart settings for this subscription */
        fun meterCreditEntitlementCart(
            meterCreditEntitlementCart: List<MeterCreditEntitlementCart>
        ) = meterCreditEntitlementCart(JsonField.of(meterCreditEntitlementCart))

        /**
         * Sets [Builder.meterCreditEntitlementCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterCreditEntitlementCart] with a well-typed
         * `List<MeterCreditEntitlementCart>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun meterCreditEntitlementCart(
            meterCreditEntitlementCart: JsonField<List<MeterCreditEntitlementCart>>
        ) = apply {
            this.meterCreditEntitlementCart = meterCreditEntitlementCart.map { it.toMutableList() }
        }

        /**
         * Adds a single [MeterCreditEntitlementCart] to [Builder.meterCreditEntitlementCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeterCreditEntitlementCart(meterCreditEntitlementCart: MeterCreditEntitlementCart) =
            apply {
                this.meterCreditEntitlementCart =
                    (this.meterCreditEntitlementCart ?: JsonField.of(mutableListOf())).also {
                        checkKnown("meterCreditEntitlementCart", it).add(meterCreditEntitlementCart)
                    }
            }

        /** Meters associated with this subscription (for usage-based billing) */
        fun meters(meters: List<Meter>) = meters(JsonField.of(meters))

        /**
         * Sets [Builder.meters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meters] with a well-typed `List<Meter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /** Timestamp of the next scheduled billing. Indicates the end of current billing period */
        fun nextBillingDate(nextBillingDate: OffsetDateTime) =
            nextBillingDate(JsonField.of(nextBillingDate))

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

        /** Wether the subscription is on-demand or not */
        fun onDemand(onDemand: Boolean) = onDemand(JsonField.of(onDemand))

        /**
         * Sets [Builder.onDemand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onDemand] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onDemand(onDemand: JsonField<Boolean>) = apply { this.onDemand = onDemand }

        /** Number of payment frequency intervals */
        fun paymentFrequencyCount(paymentFrequencyCount: Int) =
            paymentFrequencyCount(JsonField.of(paymentFrequencyCount))

        /**
         * Sets [Builder.paymentFrequencyCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentFrequencyCount] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentFrequencyCount(paymentFrequencyCount: JsonField<Int>) = apply {
            this.paymentFrequencyCount = paymentFrequencyCount
        }

        /** Time interval for payment frequency (e.g. month, year) */
        fun paymentFrequencyInterval(paymentFrequencyInterval: TimeInterval) =
            paymentFrequencyInterval(JsonField.of(paymentFrequencyInterval))

        /**
         * Sets [Builder.paymentFrequencyInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentFrequencyInterval] with a well-typed
         * [TimeInterval] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun paymentFrequencyInterval(paymentFrequencyInterval: JsonField<TimeInterval>) = apply {
            this.paymentFrequencyInterval = paymentFrequencyInterval
        }

        /** Timestamp of the last payment. Indicates the start of current billing period */
        fun previousBillingDate(previousBillingDate: OffsetDateTime) =
            previousBillingDate(JsonField.of(previousBillingDate))

        /**
         * Sets [Builder.previousBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousBillingDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun previousBillingDate(previousBillingDate: JsonField<OffsetDateTime>) = apply {
            this.previousBillingDate = previousBillingDate
        }

        /** Identifier of the product associated with this subscription */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Number of units/items included in the subscription */
        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        /**
         * Amount charged before tax for each recurring payment in smallest currency unit (e.g.
         * cents)
         */
        fun recurringPreTaxAmount(recurringPreTaxAmount: Int) =
            recurringPreTaxAmount(JsonField.of(recurringPreTaxAmount))

        /**
         * Sets [Builder.recurringPreTaxAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringPreTaxAmount] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recurringPreTaxAmount(recurringPreTaxAmount: JsonField<Int>) = apply {
            this.recurringPreTaxAmount = recurringPreTaxAmount
        }

        /** Current status of the subscription */
        fun status(status: SubscriptionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [SubscriptionStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<SubscriptionStatus>) = apply { this.status = status }

        /** Unique identifier for the subscription */
        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

        /** Number of subscription period intervals */
        fun subscriptionPeriodCount(subscriptionPeriodCount: Int) =
            subscriptionPeriodCount(JsonField.of(subscriptionPeriodCount))

        /**
         * Sets [Builder.subscriptionPeriodCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Int>) = apply {
            this.subscriptionPeriodCount = subscriptionPeriodCount
        }

        /** Time interval for the subscription period (e.g. month, year) */
        fun subscriptionPeriodInterval(subscriptionPeriodInterval: TimeInterval) =
            subscriptionPeriodInterval(JsonField.of(subscriptionPeriodInterval))

        /**
         * Sets [Builder.subscriptionPeriodInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionPeriodInterval] with a well-typed
         * [TimeInterval] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun subscriptionPeriodInterval(subscriptionPeriodInterval: JsonField<TimeInterval>) =
            apply {
                this.subscriptionPeriodInterval = subscriptionPeriodInterval
            }

        /** Indicates if the recurring_pre_tax_amount is tax inclusive */
        fun taxInclusive(taxInclusive: Boolean) = taxInclusive(JsonField.of(taxInclusive))

        /**
         * Sets [Builder.taxInclusive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
            this.taxInclusive = taxInclusive
        }

        /** Number of days in the trial period (0 if no trial) */
        fun trialPeriodDays(trialPeriodDays: Int) = trialPeriodDays(JsonField.of(trialPeriodDays))

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

        /** Cancelled timestamp if the subscription is cancelled */
        fun cancelledAt(cancelledAt: OffsetDateTime?) =
            cancelledAt(JsonField.ofNullable(cancelledAt))

        /**
         * Sets [Builder.cancelledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelledAt(cancelledAt: JsonField<OffsetDateTime>) = apply {
            this.cancelledAt = cancelledAt
        }

        /** Customer's responses to custom fields collected during checkout */
        fun customFieldResponses(customFieldResponses: List<CustomFieldResponse>?) =
            customFieldResponses(JsonField.ofNullable(customFieldResponses))

        /**
         * Sets [Builder.customFieldResponses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFieldResponses] with a well-typed
         * `List<CustomFieldResponse>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun customFieldResponses(customFieldResponses: JsonField<List<CustomFieldResponse>>) =
            apply {
                this.customFieldResponses = customFieldResponses.map { it.toMutableList() }
            }

        /**
         * Adds a single [CustomFieldResponse] to [customFieldResponses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomFieldResponse(customFieldResponse: CustomFieldResponse) = apply {
            customFieldResponses =
                (customFieldResponses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customFieldResponses", it).add(customFieldResponse)
                }
        }

        /** Number of remaining discount cycles if discount is applied */
        fun discountCyclesRemaining(discountCyclesRemaining: Int?) =
            discountCyclesRemaining(JsonField.ofNullable(discountCyclesRemaining))

        /**
         * Alias for [Builder.discountCyclesRemaining].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun discountCyclesRemaining(discountCyclesRemaining: Int) =
            discountCyclesRemaining(discountCyclesRemaining as Int?)

        /**
         * Sets [Builder.discountCyclesRemaining] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCyclesRemaining] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountCyclesRemaining(discountCyclesRemaining: JsonField<Int>) = apply {
            this.discountCyclesRemaining = discountCyclesRemaining
        }

        /** The discount id if discount is applied */
        fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

        /**
         * Sets [Builder.discountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** Timestamp when the subscription will expire */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Saved payment method id used for recurring charges */
        fun paymentMethodId(paymentMethodId: String?) =
            paymentMethodId(JsonField.ofNullable(paymentMethodId))

        /**
         * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethodId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
            this.paymentMethodId = paymentMethodId
        }

        /** Tax identifier provided for this subscription (if applicable) */
        fun taxId(taxId: String?) = taxId(JsonField.ofNullable(taxId))

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
         * Returns an immutable instance of [Subscription].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .addons()
         * .billing()
         * .cancelAtNextBillingDate()
         * .createdAt()
         * .creditEntitlementCart()
         * .currency()
         * .customer()
         * .metadata()
         * .meterCreditEntitlementCart()
         * .meters()
         * .nextBillingDate()
         * .onDemand()
         * .paymentFrequencyCount()
         * .paymentFrequencyInterval()
         * .previousBillingDate()
         * .productId()
         * .quantity()
         * .recurringPreTaxAmount()
         * .status()
         * .subscriptionId()
         * .subscriptionPeriodCount()
         * .subscriptionPeriodInterval()
         * .taxInclusive()
         * .trialPeriodDays()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Subscription =
            Subscription(
                checkRequired("addons", addons).map { it.toImmutable() },
                checkRequired("billing", billing),
                checkRequired("cancelAtNextBillingDate", cancelAtNextBillingDate),
                checkRequired("createdAt", createdAt),
                checkRequired("creditEntitlementCart", creditEntitlementCart).map {
                    it.toImmutable()
                },
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("metadata", metadata),
                checkRequired("meterCreditEntitlementCart", meterCreditEntitlementCart).map {
                    it.toImmutable()
                },
                checkRequired("meters", meters).map { it.toImmutable() },
                checkRequired("nextBillingDate", nextBillingDate),
                checkRequired("onDemand", onDemand),
                checkRequired("paymentFrequencyCount", paymentFrequencyCount),
                checkRequired("paymentFrequencyInterval", paymentFrequencyInterval),
                checkRequired("previousBillingDate", previousBillingDate),
                checkRequired("productId", productId),
                checkRequired("quantity", quantity),
                checkRequired("recurringPreTaxAmount", recurringPreTaxAmount),
                checkRequired("status", status),
                checkRequired("subscriptionId", subscriptionId),
                checkRequired("subscriptionPeriodCount", subscriptionPeriodCount),
                checkRequired("subscriptionPeriodInterval", subscriptionPeriodInterval),
                checkRequired("taxInclusive", taxInclusive),
                checkRequired("trialPeriodDays", trialPeriodDays),
                cancelledAt,
                (customFieldResponses ?: JsonMissing.of()).map { it.toImmutable() },
                discountCyclesRemaining,
                discountId,
                expiresAt,
                paymentMethodId,
                taxId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Subscription = apply {
        if (validated) {
            return@apply
        }

        addons().forEach { it.validate() }
        billing().validate()
        cancelAtNextBillingDate()
        createdAt()
        creditEntitlementCart().forEach { it.validate() }
        currency().validate()
        customer().validate()
        metadata().validate()
        meterCreditEntitlementCart().forEach { it.validate() }
        meters().forEach { it.validate() }
        nextBillingDate()
        onDemand()
        paymentFrequencyCount()
        paymentFrequencyInterval().validate()
        previousBillingDate()
        productId()
        quantity()
        recurringPreTaxAmount()
        status().validate()
        subscriptionId()
        subscriptionPeriodCount()
        subscriptionPeriodInterval().validate()
        taxInclusive()
        trialPeriodDays()
        cancelledAt()
        customFieldResponses()?.forEach { it.validate() }
        discountCyclesRemaining()
        discountId()
        expiresAt()
        paymentMethodId()
        taxId()
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
        (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (billing.asKnown()?.validity() ?: 0) +
            (if (cancelAtNextBillingDate.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (creditEntitlementCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (currency.asKnown()?.validity() ?: 0) +
            (customer.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (meterCreditEntitlementCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (meters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextBillingDate.asKnown() == null) 0 else 1) +
            (if (onDemand.asKnown() == null) 0 else 1) +
            (if (paymentFrequencyCount.asKnown() == null) 0 else 1) +
            (paymentFrequencyInterval.asKnown()?.validity() ?: 0) +
            (if (previousBillingDate.asKnown() == null) 0 else 1) +
            (if (productId.asKnown() == null) 0 else 1) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (if (recurringPreTaxAmount.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (subscriptionId.asKnown() == null) 0 else 1) +
            (if (subscriptionPeriodCount.asKnown() == null) 0 else 1) +
            (subscriptionPeriodInterval.asKnown()?.validity() ?: 0) +
            (if (taxInclusive.asKnown() == null) 0 else 1) +
            (if (trialPeriodDays.asKnown() == null) 0 else 1) +
            (if (cancelledAt.asKnown() == null) 0 else 1) +
            (customFieldResponses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (discountCyclesRemaining.asKnown() == null) 0 else 1) +
            (if (discountId.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (paymentMethodId.asKnown() == null) 0 else 1) +
            (if (taxId.asKnown() == null) 0 else 1)

    /** Response struct representing credit entitlement cart details for a subscription */
    class CreditEntitlementCart
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
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
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
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAfterDays(): Int? = expiresAfterDays.getNullable("expires_after_days")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lowBalanceThresholdPercent(): Int? =
            lowBalanceThresholdPercent.getNullable("low_balance_threshold_percent")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxRolloverCount(): Int? = maxRolloverCount.getNullable("max_rollover_count")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageLimit(): String? = overageLimit.getNullable("overage_limit")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverPercentage(): Int? = rolloverPercentage.getNullable("rollover_percentage")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeCount(): Int? =
            rolloverTimeframeCount.getNullable("rollover_timeframe_count")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeInterval(): TimeInterval? =
            rolloverTimeframeInterval.getNullable("rollover_timeframe_interval")

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
         * Returns the raw JSON value of [creditsAmount].
         *
         * Unlike [creditsAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credits_amount")
        @ExcludeMissing
        fun _creditsAmount(): JsonField<String> = creditsAmount

        /**
         * Returns the raw JSON value of [overageBalance].
         *
         * Unlike [overageBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_balance")
        @ExcludeMissing
        fun _overageBalance(): JsonField<String> = overageBalance

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
         * Unlike [rolloverEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_limit")
        @ExcludeMissing
        fun _overageLimit(): JsonField<String> = overageLimit

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
             * Returns a mutable builder for constructing an instance of [CreditEntitlementCart].
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

        /** A builder for [CreditEntitlementCart]. */
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

            internal fun from(creditEntitlementCart: CreditEntitlementCart) = apply {
                creditEntitlementId = creditEntitlementCart.creditEntitlementId
                creditEntitlementName = creditEntitlementCart.creditEntitlementName
                creditsAmount = creditEntitlementCart.creditsAmount
                overageBalance = creditEntitlementCart.overageBalance
                overageBehavior = creditEntitlementCart.overageBehavior
                overageEnabled = creditEntitlementCart.overageEnabled
                productId = creditEntitlementCart.productId
                remainingBalance = creditEntitlementCart.remainingBalance
                rolloverEnabled = creditEntitlementCart.rolloverEnabled
                unit = creditEntitlementCart.unit
                expiresAfterDays = creditEntitlementCart.expiresAfterDays
                lowBalanceThresholdPercent = creditEntitlementCart.lowBalanceThresholdPercent
                maxRolloverCount = creditEntitlementCart.maxRolloverCount
                overageLimit = creditEntitlementCart.overageLimit
                rolloverPercentage = creditEntitlementCart.rolloverPercentage
                rolloverTimeframeCount = creditEntitlementCart.rolloverTimeframeCount
                rolloverTimeframeInterval = creditEntitlementCart.rolloverTimeframeInterval
                additionalProperties = creditEntitlementCart.additionalProperties.toMutableMap()
            }

            fun creditEntitlementId(creditEntitlementId: String) =
                creditEntitlementId(JsonField.of(creditEntitlementId))

            /**
             * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                this.creditEntitlementId = creditEntitlementId
            }

            fun creditEntitlementName(creditEntitlementName: String) =
                creditEntitlementName(JsonField.of(creditEntitlementName))

            /**
             * Sets [Builder.creditEntitlementName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementName(creditEntitlementName: JsonField<String>) = apply {
                this.creditEntitlementName = creditEntitlementName
            }

            fun creditsAmount(creditsAmount: String) = creditsAmount(JsonField.of(creditsAmount))

            /**
             * Sets [Builder.creditsAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditsAmount(creditsAmount: JsonField<String>) = apply {
                this.creditsAmount = creditsAmount
            }

            /** Customer's current overage balance for this entitlement */
            fun overageBalance(overageBalance: String) =
                overageBalance(JsonField.of(overageBalance))

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
             * You should usually call [Builder.overageBehavior] with a well-typed
             * [CbbOverageBehavior] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun overageBehavior(overageBehavior: JsonField<CbbOverageBehavior>) = apply {
                this.overageBehavior = overageBehavior
            }

            fun overageEnabled(overageEnabled: Boolean) =
                overageEnabled(JsonField.of(overageEnabled))

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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * You should usually call [Builder.expiresAfterDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.maxRolloverCount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRolloverCount(maxRolloverCount: JsonField<Int>) = apply {
                this.maxRolloverCount = maxRolloverCount
            }

            fun overageLimit(overageLimit: String?) =
                overageLimit(JsonField.ofNullable(overageLimit))

            /**
             * Sets [Builder.overageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageLimit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.rolloverTimeframeCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: JsonField<TimeInterval>) =
                apply {
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
             * Returns an immutable instance of [CreditEntitlementCart].
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
            fun build(): CreditEntitlementCart =
                CreditEntitlementCart(
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

        fun validate(): CreditEntitlementCart = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is CreditEntitlementCart &&
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
            "CreditEntitlementCart{creditEntitlementId=$creditEntitlementId, creditEntitlementName=$creditEntitlementName, creditsAmount=$creditsAmount, overageBalance=$overageBalance, overageBehavior=$overageBehavior, overageEnabled=$overageEnabled, productId=$productId, remainingBalance=$remainingBalance, rolloverEnabled=$rolloverEnabled, unit=$unit, expiresAfterDays=$expiresAfterDays, lowBalanceThresholdPercent=$lowBalanceThresholdPercent, maxRolloverCount=$maxRolloverCount, overageLimit=$overageLimit, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, additionalProperties=$additionalProperties}"
    }

    /** Additional custom data associated with the subscription */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * Response struct representing meter-credit entitlement mapping cart details for a subscription
     */
    class MeterCreditEntitlementCart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditEntitlementId: JsonField<String>,
        private val meterId: JsonField<String>,
        private val meterName: JsonField<String>,
        private val meterUnitsPerCredit: JsonField<String>,
        private val productId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            creditEntitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meter_id") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meter_name")
            @ExcludeMissing
            meterName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meter_units_per_credit")
            @ExcludeMissing
            meterUnitsPerCredit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
        ) : this(
            creditEntitlementId,
            meterId,
            meterName,
            meterUnitsPerCredit,
            productId,
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
        fun meterId(): String = meterId.getRequired("meter_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterName(): String = meterName.getRequired("meter_name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterUnitsPerCredit(): String =
            meterUnitsPerCredit.getRequired("meter_units_per_credit")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

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
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meter_id") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /**
         * Returns the raw JSON value of [meterName].
         *
         * Unlike [meterName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meter_name") @ExcludeMissing fun _meterName(): JsonField<String> = meterName

        /**
         * Returns the raw JSON value of [meterUnitsPerCredit].
         *
         * Unlike [meterUnitsPerCredit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("meter_units_per_credit")
        @ExcludeMissing
        fun _meterUnitsPerCredit(): JsonField<String> = meterUnitsPerCredit

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
             * [MeterCreditEntitlementCart].
             *
             * The following fields are required:
             * ```kotlin
             * .creditEntitlementId()
             * .meterId()
             * .meterName()
             * .meterUnitsPerCredit()
             * .productId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [MeterCreditEntitlementCart]. */
        class Builder internal constructor() {

            private var creditEntitlementId: JsonField<String>? = null
            private var meterId: JsonField<String>? = null
            private var meterName: JsonField<String>? = null
            private var meterUnitsPerCredit: JsonField<String>? = null
            private var productId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(meterCreditEntitlementCart: MeterCreditEntitlementCart) = apply {
                creditEntitlementId = meterCreditEntitlementCart.creditEntitlementId
                meterId = meterCreditEntitlementCart.meterId
                meterName = meterCreditEntitlementCart.meterName
                meterUnitsPerCredit = meterCreditEntitlementCart.meterUnitsPerCredit
                productId = meterCreditEntitlementCart.productId
                additionalProperties =
                    meterCreditEntitlementCart.additionalProperties.toMutableMap()
            }

            fun creditEntitlementId(creditEntitlementId: String) =
                creditEntitlementId(JsonField.of(creditEntitlementId))

            /**
             * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                this.creditEntitlementId = creditEntitlementId
            }

            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            fun meterName(meterName: String) = meterName(JsonField.of(meterName))

            /**
             * Sets [Builder.meterName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterName(meterName: JsonField<String>) = apply { this.meterName = meterName }

            fun meterUnitsPerCredit(meterUnitsPerCredit: String) =
                meterUnitsPerCredit(JsonField.of(meterUnitsPerCredit))

            /**
             * Sets [Builder.meterUnitsPerCredit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterUnitsPerCredit] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun meterUnitsPerCredit(meterUnitsPerCredit: JsonField<String>) = apply {
                this.meterUnitsPerCredit = meterUnitsPerCredit
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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
             * Returns an immutable instance of [MeterCreditEntitlementCart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .creditEntitlementId()
             * .meterId()
             * .meterName()
             * .meterUnitsPerCredit()
             * .productId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MeterCreditEntitlementCart =
                MeterCreditEntitlementCart(
                    checkRequired("creditEntitlementId", creditEntitlementId),
                    checkRequired("meterId", meterId),
                    checkRequired("meterName", meterName),
                    checkRequired("meterUnitsPerCredit", meterUnitsPerCredit),
                    checkRequired("productId", productId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MeterCreditEntitlementCart = apply {
            if (validated) {
                return@apply
            }

            creditEntitlementId()
            meterId()
            meterName()
            meterUnitsPerCredit()
            productId()
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
                (if (meterId.asKnown() == null) 0 else 1) +
                (if (meterName.asKnown() == null) 0 else 1) +
                (if (meterUnitsPerCredit.asKnown() == null) 0 else 1) +
                (if (productId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MeterCreditEntitlementCart &&
                creditEntitlementId == other.creditEntitlementId &&
                meterId == other.meterId &&
                meterName == other.meterName &&
                meterUnitsPerCredit == other.meterUnitsPerCredit &&
                productId == other.productId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditEntitlementId,
                meterId,
                meterName,
                meterUnitsPerCredit,
                productId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MeterCreditEntitlementCart{creditEntitlementId=$creditEntitlementId, meterId=$meterId, meterName=$meterName, meterUnitsPerCredit=$meterUnitsPerCredit, productId=$productId, additionalProperties=$additionalProperties}"
    }

    /** Response struct representing usage-based meter cart details for a subscription */
    class Meter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val freeThreshold: JsonField<Long>,
        private val measurementUnit: JsonField<String>,
        private val meterId: JsonField<String>,
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val pricePerUnit: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("free_threshold")
            @ExcludeMissing
            freeThreshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("measurement_unit")
            @ExcludeMissing
            measurementUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meter_id") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_per_unit")
            @ExcludeMissing
            pricePerUnit: JsonField<String> = JsonMissing.of(),
        ) : this(
            currency,
            freeThreshold,
            measurementUnit,
            meterId,
            name,
            description,
            pricePerUnit,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun freeThreshold(): Long = freeThreshold.getRequired("free_threshold")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun measurementUnit(): String = measurementUnit.getRequired("measurement_unit")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterId(): String = meterId.getRequired("meter_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pricePerUnit(): String? = pricePerUnit.getNullable("price_per_unit")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [freeThreshold].
         *
         * Unlike [freeThreshold], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("free_threshold")
        @ExcludeMissing
        fun _freeThreshold(): JsonField<Long> = freeThreshold

        /**
         * Returns the raw JSON value of [measurementUnit].
         *
         * Unlike [measurementUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("measurement_unit")
        @ExcludeMissing
        fun _measurementUnit(): JsonField<String> = measurementUnit

        /**
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meter_id") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [pricePerUnit].
         *
         * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        fun _pricePerUnit(): JsonField<String> = pricePerUnit

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
             * .currency()
             * .freeThreshold()
             * .measurementUnit()
             * .meterId()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Meter]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var freeThreshold: JsonField<Long>? = null
            private var measurementUnit: JsonField<String>? = null
            private var meterId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var pricePerUnit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(meter: Meter) = apply {
                currency = meter.currency
                freeThreshold = meter.freeThreshold
                measurementUnit = meter.measurementUnit
                meterId = meter.meterId
                name = meter.name
                description = meter.description
                pricePerUnit = meter.pricePerUnit
                additionalProperties = meter.additionalProperties.toMutableMap()
            }

            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            fun freeThreshold(freeThreshold: Long) = freeThreshold(JsonField.of(freeThreshold))

            /**
             * Sets [Builder.freeThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeThreshold] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeThreshold(freeThreshold: JsonField<Long>) = apply {
                this.freeThreshold = freeThreshold
            }

            fun measurementUnit(measurementUnit: String) =
                measurementUnit(JsonField.of(measurementUnit))

            /**
             * Sets [Builder.measurementUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.measurementUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun measurementUnit(measurementUnit: JsonField<String>) = apply {
                this.measurementUnit = measurementUnit
            }

            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Meter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * .freeThreshold()
             * .measurementUnit()
             * .meterId()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meter =
                Meter(
                    checkRequired("currency", currency),
                    checkRequired("freeThreshold", freeThreshold),
                    checkRequired("measurementUnit", measurementUnit),
                    checkRequired("meterId", meterId),
                    checkRequired("name", name),
                    description,
                    pricePerUnit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meter = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            freeThreshold()
            measurementUnit()
            meterId()
            name()
            description()
            pricePerUnit()
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
                (if (freeThreshold.asKnown() == null) 0 else 1) +
                (if (measurementUnit.asKnown() == null) 0 else 1) +
                (if (meterId.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (pricePerUnit.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meter &&
                currency == other.currency &&
                freeThreshold == other.freeThreshold &&
                measurementUnit == other.measurementUnit &&
                meterId == other.meterId &&
                name == other.name &&
                description == other.description &&
                pricePerUnit == other.pricePerUnit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                freeThreshold,
                measurementUnit,
                meterId,
                name,
                description,
                pricePerUnit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meter{currency=$currency, freeThreshold=$freeThreshold, measurementUnit=$measurementUnit, meterId=$meterId, name=$name, description=$description, pricePerUnit=$pricePerUnit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Subscription &&
            addons == other.addons &&
            billing == other.billing &&
            cancelAtNextBillingDate == other.cancelAtNextBillingDate &&
            createdAt == other.createdAt &&
            creditEntitlementCart == other.creditEntitlementCart &&
            currency == other.currency &&
            customer == other.customer &&
            metadata == other.metadata &&
            meterCreditEntitlementCart == other.meterCreditEntitlementCart &&
            meters == other.meters &&
            nextBillingDate == other.nextBillingDate &&
            onDemand == other.onDemand &&
            paymentFrequencyCount == other.paymentFrequencyCount &&
            paymentFrequencyInterval == other.paymentFrequencyInterval &&
            previousBillingDate == other.previousBillingDate &&
            productId == other.productId &&
            quantity == other.quantity &&
            recurringPreTaxAmount == other.recurringPreTaxAmount &&
            status == other.status &&
            subscriptionId == other.subscriptionId &&
            subscriptionPeriodCount == other.subscriptionPeriodCount &&
            subscriptionPeriodInterval == other.subscriptionPeriodInterval &&
            taxInclusive == other.taxInclusive &&
            trialPeriodDays == other.trialPeriodDays &&
            cancelledAt == other.cancelledAt &&
            customFieldResponses == other.customFieldResponses &&
            discountCyclesRemaining == other.discountCyclesRemaining &&
            discountId == other.discountId &&
            expiresAt == other.expiresAt &&
            paymentMethodId == other.paymentMethodId &&
            taxId == other.taxId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            addons,
            billing,
            cancelAtNextBillingDate,
            createdAt,
            creditEntitlementCart,
            currency,
            customer,
            metadata,
            meterCreditEntitlementCart,
            meters,
            nextBillingDate,
            onDemand,
            paymentFrequencyCount,
            paymentFrequencyInterval,
            previousBillingDate,
            productId,
            quantity,
            recurringPreTaxAmount,
            status,
            subscriptionId,
            subscriptionPeriodCount,
            subscriptionPeriodInterval,
            taxInclusive,
            trialPeriodDays,
            cancelledAt,
            customFieldResponses,
            discountCyclesRemaining,
            discountId,
            expiresAt,
            paymentMethodId,
            taxId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{addons=$addons, billing=$billing, cancelAtNextBillingDate=$cancelAtNextBillingDate, createdAt=$createdAt, creditEntitlementCart=$creditEntitlementCart, currency=$currency, customer=$customer, metadata=$metadata, meterCreditEntitlementCart=$meterCreditEntitlementCart, meters=$meters, nextBillingDate=$nextBillingDate, onDemand=$onDemand, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, previousBillingDate=$previousBillingDate, productId=$productId, quantity=$quantity, recurringPreTaxAmount=$recurringPreTaxAmount, status=$status, subscriptionId=$subscriptionId, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, taxInclusive=$taxInclusive, trialPeriodDays=$trialPeriodDays, cancelledAt=$cancelledAt, customFieldResponses=$customFieldResponses, discountCyclesRemaining=$discountCyclesRemaining, discountId=$discountId, expiresAt=$expiresAt, paymentMethodId=$paymentMethodId, taxId=$taxId, additionalProperties=$additionalProperties}"
}
