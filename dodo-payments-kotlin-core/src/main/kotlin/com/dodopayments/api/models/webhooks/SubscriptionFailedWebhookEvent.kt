// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.discounts.DiscountDetail
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomFieldResponse
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.subscriptions.AddonCartResponseItem
import com.dodopayments.api.models.subscriptions.CancellationFeedback
import com.dodopayments.api.models.subscriptions.CreditEntitlementCartResponse
import com.dodopayments.api.models.subscriptions.MeterCartResponseItem
import com.dodopayments.api.models.subscriptions.MeterCreditEntitlementCartResponse
import com.dodopayments.api.models.subscriptions.ScheduledPlanChange
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SubscriptionFailedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val businessId: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
    ) : this(businessId, data, timestamp, type, mutableMapOf())

    /**
     * The business identifier
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Subscription payload sent on a webhook. It carries every field of `SubscriptionResponse`,
     * plus the grace-period deadline.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * The timestamp of when the event occurred
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The event type
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("subscription.failed")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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
         * [SubscriptionFailedWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionFailedWebhookEvent]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonValue = JsonValue.from("subscription.failed")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionFailedWebhookEvent: SubscriptionFailedWebhookEvent) = apply {
            businessId = subscriptionFailedWebhookEvent.businessId
            data = subscriptionFailedWebhookEvent.data
            timestamp = subscriptionFailedWebhookEvent.timestamp
            type = subscriptionFailedWebhookEvent.type
            additionalProperties =
                subscriptionFailedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The business identifier */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /**
         * Subscription payload sent on a webhook. It carries every field of `SubscriptionResponse`,
         * plus the grace-period deadline.
         */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** The timestamp of when the event occurred */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("subscription.failed")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

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
         * Returns an immutable instance of [SubscriptionFailedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionFailedWebhookEvent =
            SubscriptionFailedWebhookEvent(
                checkRequired("businessId", businessId),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                type,
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
    fun validate(): SubscriptionFailedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        businessId()
        data().validate()
        timestamp()
        _type().let {
            if (it != JsonValue.from("subscription.failed")) {
                throw DodoPaymentsInvalidDataException("'type' is invalid, received $it")
            }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (businessId.asKnown() == null) 0 else 1) +
            (data.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            type.let { if (it == JsonValue.from("subscription.failed")) 1 else 0 }

    /**
     * Subscription payload sent on a webhook. It carries every field of `SubscriptionResponse`,
     * plus the grace-period deadline.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addons: JsonField<List<AddonCartResponseItem>>,
        private val billing: JsonField<BillingAddress>,
        private val brandId: JsonField<String>,
        private val cancelAtNextBillingDate: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditEntitlementCart: JsonField<List<CreditEntitlementCartResponse>>,
        private val currency: JsonField<Currency>,
        private val customer: JsonField<CustomerLimitedDetails>,
        private val metadata: JsonField<Metadata>,
        private val meterCreditEntitlementCart: JsonField<List<MeterCreditEntitlementCartResponse>>,
        private val meters: JsonField<List<MeterCartResponseItem>>,
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
        private val cancellationComment: JsonField<String>,
        private val cancellationFeedback: JsonField<CancellationFeedback>,
        private val cancelledAt: JsonField<OffsetDateTime>,
        private val customFieldResponses: JsonField<List<CustomFieldResponse>>,
        private val customerBusinessName: JsonField<String>,
        private val discountCyclesRemaining: JsonField<Int>,
        private val discountId: JsonField<String>,
        private val discounts: JsonField<List<DiscountDetail>>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val pausedAt: JsonField<OffsetDateTime>,
        private val paymentMethodId: JsonField<String>,
        private val scheduledChange: JsonField<ScheduledPlanChange>,
        private val taxId: JsonField<String>,
        private val trialAmount: JsonField<Int>,
        private val pastDueEndsAt: JsonField<OffsetDateTime>,
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
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cancel_at_next_billing_date")
            @ExcludeMissing
            cancelAtNextBillingDate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_cart")
            @ExcludeMissing
            creditEntitlementCart: JsonField<List<CreditEntitlementCartResponse>> =
                JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("meter_credit_entitlement_cart")
            @ExcludeMissing
            meterCreditEntitlementCart: JsonField<List<MeterCreditEntitlementCartResponse>> =
                JsonMissing.of(),
            @JsonProperty("meters")
            @ExcludeMissing
            meters: JsonField<List<MeterCartResponseItem>> = JsonMissing.of(),
            @JsonProperty("next_billing_date")
            @ExcludeMissing
            nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_demand")
            @ExcludeMissing
            onDemand: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("payment_frequency_count")
            @ExcludeMissing
            paymentFrequencyCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("payment_frequency_interval")
            @ExcludeMissing
            paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("previous_billing_date")
            @ExcludeMissing
            previousBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("cancellation_comment")
            @ExcludeMissing
            cancellationComment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cancellation_feedback")
            @ExcludeMissing
            cancellationFeedback: JsonField<CancellationFeedback> = JsonMissing.of(),
            @JsonProperty("cancelled_at")
            @ExcludeMissing
            cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("custom_field_responses")
            @ExcludeMissing
            customFieldResponses: JsonField<List<CustomFieldResponse>> = JsonMissing.of(),
            @JsonProperty("customer_business_name")
            @ExcludeMissing
            customerBusinessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_cycles_remaining")
            @ExcludeMissing
            discountCyclesRemaining: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("discount_id")
            @ExcludeMissing
            discountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            discounts: JsonField<List<DiscountDetail>> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("paused_at")
            @ExcludeMissing
            pausedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payment_method_id")
            @ExcludeMissing
            paymentMethodId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scheduled_change")
            @ExcludeMissing
            scheduledChange: JsonField<ScheduledPlanChange> = JsonMissing.of(),
            @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trial_amount")
            @ExcludeMissing
            trialAmount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("past_due_ends_at")
            @ExcludeMissing
            pastDueEndsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            addons,
            billing,
            brandId,
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
            cancellationComment,
            cancellationFeedback,
            cancelledAt,
            customFieldResponses,
            customerBusinessName,
            discountCyclesRemaining,
            discountId,
            discounts,
            expiresAt,
            pausedAt,
            paymentMethodId,
            scheduledChange,
            taxId,
            trialAmount,
            pastDueEndsAt,
            mutableMapOf(),
        )

        fun toSubscription(): Subscription =
            Subscription.builder()
                .addons(addons)
                .billing(billing)
                .brandId(brandId)
                .cancelAtNextBillingDate(cancelAtNextBillingDate)
                .createdAt(createdAt)
                .creditEntitlementCart(creditEntitlementCart)
                .currency(currency)
                .customer(customer)
                .metadata(metadata)
                .meterCreditEntitlementCart(meterCreditEntitlementCart)
                .meters(meters)
                .nextBillingDate(nextBillingDate)
                .onDemand(onDemand)
                .paymentFrequencyCount(paymentFrequencyCount)
                .paymentFrequencyInterval(paymentFrequencyInterval)
                .previousBillingDate(previousBillingDate)
                .productId(productId)
                .quantity(quantity)
                .recurringPreTaxAmount(recurringPreTaxAmount)
                .status(status)
                .subscriptionId(subscriptionId)
                .subscriptionPeriodCount(subscriptionPeriodCount)
                .subscriptionPeriodInterval(subscriptionPeriodInterval)
                .taxInclusive(taxInclusive)
                .trialPeriodDays(trialPeriodDays)
                .cancellationComment(cancellationComment)
                .cancellationFeedback(cancellationFeedback)
                .cancelledAt(cancelledAt)
                .customFieldResponses(customFieldResponses)
                .customerBusinessName(customerBusinessName)
                .discountCyclesRemaining(discountCyclesRemaining)
                .discountId(discountId)
                .discounts(discounts)
                .expiresAt(expiresAt)
                .pausedAt(pausedAt)
                .paymentMethodId(paymentMethodId)
                .scheduledChange(scheduledChange)
                .taxId(taxId)
                .trialAmount(trialAmount)
                .build()

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
         * Brand id this subscription belongs to
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun brandId(): String = brandId.getRequired("brand_id")

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
        fun creditEntitlementCart(): List<CreditEntitlementCartResponse> =
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
        fun meterCreditEntitlementCart(): List<MeterCreditEntitlementCartResponse> =
            meterCreditEntitlementCart.getRequired("meter_credit_entitlement_cart")

        /**
         * Meters associated with this subscription (for usage-based billing)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meters(): List<MeterCartResponseItem> = meters.getRequired("meters")

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
        fun paymentFrequencyCount(): Int =
            paymentFrequencyCount.getRequired("payment_frequency_count")

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
         * Amount charged before tax for each recurring payment in the currency's smallest unit
         * (cents for USD, yen for JPY, fils for KWD)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recurringPreTaxAmount(): Int =
            recurringPreTaxAmount.getRequired("recurring_pre_tax_amount")

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
         * Free-text cancellation comment, if any
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancellationComment(): String? = cancellationComment.getNullable("cancellation_comment")

        /**
         * Customer-supplied churn reason, if any
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancellationFeedback(): CancellationFeedback? =
            cancellationFeedback.getNullable("cancellation_feedback")

        /**
         * Cancelled timestamp if the subscription is cancelled
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancelledAt(): OffsetDateTime? = cancelledAt.getNullable("cancelled_at")

        /**
         * Customer's responses to custom fields collected during checkout
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customFieldResponses(): List<CustomFieldResponse>? =
            customFieldResponses.getNullable("custom_field_responses")

        /**
         * Business / legal name associated with the tax id (B2B). When set this is used on the
         * invoice in place of the customer's personal name.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerBusinessName(): String? =
            customerBusinessName.getNullable("customer_business_name")

        /**
         * DEPRECATED: Use discounts[].cycles_remaining instead.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountCyclesRemaining(): Int? =
            discountCyclesRemaining.getNullable("discount_cycles_remaining")

        /**
         * DEPRECATED: Use discounts instead. Returns the first discount's ID if present.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountId(): String? = discountId.getNullable("discount_id")

        /**
         * All stacked discounts applied, ordered by position
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discounts(): List<DiscountDetail>? = discounts.getNullable("discounts")

        /**
         * Timestamp when the subscription will expire
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        /**
         * Timestamp when the subscription was paused, if it currently is (or is `OnHold` due to an
         * unresolved pause settlement). `null` otherwise.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pausedAt(): OffsetDateTime? = pausedAt.getNullable("paused_at")

        /**
         * Saved payment method id used for recurring charges
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentMethodId(): String? = paymentMethodId.getNullable("payment_method_id")

        /**
         * Scheduled plan change details, if any
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun scheduledChange(): ScheduledPlanChange? =
            scheduledChange.getNullable("scheduled_change")

        /**
         * Tax identifier provided for this subscription (if applicable)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): String? = taxId.getNullable("tax_id")

        /**
         * Per-unit trial amount after discounts, snapshotted at subscription creation (price
         * currency minor units, pre-quantity, pre-tax). Null for a free trial or no trial.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialAmount(): Int? = trialAmount.getNullable("trial_amount")

        /**
         * Time when the grace period ends. The subscription moves to `on_hold` or to `cancelled` at
         * this time.
         *
         * Read in the same query as the rest of the payload, so it always comes from the row
         * snapshot that produced `status`. It is set whenever the subscription sits in a window at
         * that moment. A delayed event of another type therefore carries the deadline too, next to
         * a `past_due` status.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pastDueEndsAt(): OffsetDateTime? = pastDueEndsAt.getNullable("past_due_ends_at")

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
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

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
         * Unlike [creditEntitlementCart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlement_cart")
        @ExcludeMissing
        fun _creditEntitlementCart(): JsonField<List<CreditEntitlementCartResponse>> =
            creditEntitlementCart

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
        fun _meterCreditEntitlementCart(): JsonField<List<MeterCreditEntitlementCartResponse>> =
            meterCreditEntitlementCart

        /**
         * Returns the raw JSON value of [meters].
         *
         * Unlike [meters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meters")
        @ExcludeMissing
        fun _meters(): JsonField<List<MeterCartResponseItem>> = meters

        /**
         * Returns the raw JSON value of [nextBillingDate].
         *
         * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [paymentFrequencyCount], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [previousBillingDate], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [recurringPreTaxAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recurring_pre_tax_amount")
        @ExcludeMissing
        fun _recurringPreTaxAmount(): JsonField<Int> = recurringPreTaxAmount

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<SubscriptionStatus> = status

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        fun _taxInclusive(): JsonField<Boolean> = taxInclusive

        /**
         * Returns the raw JSON value of [trialPeriodDays].
         *
         * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        fun _trialPeriodDays(): JsonField<Int> = trialPeriodDays

        /**
         * Returns the raw JSON value of [cancellationComment].
         *
         * Unlike [cancellationComment], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cancellation_comment")
        @ExcludeMissing
        fun _cancellationComment(): JsonField<String> = cancellationComment

        /**
         * Returns the raw JSON value of [cancellationFeedback].
         *
         * Unlike [cancellationFeedback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cancellation_feedback")
        @ExcludeMissing
        fun _cancellationFeedback(): JsonField<CancellationFeedback> = cancellationFeedback

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
         * Unlike [customFieldResponses], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("custom_field_responses")
        @ExcludeMissing
        fun _customFieldResponses(): JsonField<List<CustomFieldResponse>> = customFieldResponses

        /**
         * Returns the raw JSON value of [customerBusinessName].
         *
         * Unlike [customerBusinessName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customer_business_name")
        @ExcludeMissing
        fun _customerBusinessName(): JsonField<String> = customerBusinessName

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
        @JsonProperty("discount_id")
        @ExcludeMissing
        fun _discountId(): JsonField<String> = discountId

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<DiscountDetail>> = discounts

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [pausedAt].
         *
         * Unlike [pausedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paused_at")
        @ExcludeMissing
        fun _pausedAt(): JsonField<OffsetDateTime> = pausedAt

        /**
         * Returns the raw JSON value of [paymentMethodId].
         *
         * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method_id")
        @ExcludeMissing
        fun _paymentMethodId(): JsonField<String> = paymentMethodId

        /**
         * Returns the raw JSON value of [scheduledChange].
         *
         * Unlike [scheduledChange], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scheduled_change")
        @ExcludeMissing
        fun _scheduledChange(): JsonField<ScheduledPlanChange> = scheduledChange

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

        /**
         * Returns the raw JSON value of [trialAmount].
         *
         * Unlike [trialAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trial_amount")
        @ExcludeMissing
        fun _trialAmount(): JsonField<Int> = trialAmount

        /**
         * Returns the raw JSON value of [pastDueEndsAt].
         *
         * Unlike [pastDueEndsAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("past_due_ends_at")
        @ExcludeMissing
        fun _pastDueEndsAt(): JsonField<OffsetDateTime> = pastDueEndsAt

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .addons()
             * .billing()
             * .brandId()
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

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var addons: JsonField<MutableList<AddonCartResponseItem>>? = null
            private var billing: JsonField<BillingAddress>? = null
            private var brandId: JsonField<String>? = null
            private var cancelAtNextBillingDate: JsonField<Boolean>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditEntitlementCart:
                JsonField<MutableList<CreditEntitlementCartResponse>>? =
                null
            private var currency: JsonField<Currency>? = null
            private var customer: JsonField<CustomerLimitedDetails>? = null
            private var metadata: JsonField<Metadata>? = null
            private var meterCreditEntitlementCart:
                JsonField<MutableList<MeterCreditEntitlementCartResponse>>? =
                null
            private var meters: JsonField<MutableList<MeterCartResponseItem>>? = null
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
            private var cancellationComment: JsonField<String> = JsonMissing.of()
            private var cancellationFeedback: JsonField<CancellationFeedback> = JsonMissing.of()
            private var cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customFieldResponses: JsonField<MutableList<CustomFieldResponse>>? = null
            private var customerBusinessName: JsonField<String> = JsonMissing.of()
            private var discountCyclesRemaining: JsonField<Int> = JsonMissing.of()
            private var discountId: JsonField<String> = JsonMissing.of()
            private var discounts: JsonField<MutableList<DiscountDetail>>? = null
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pausedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var paymentMethodId: JsonField<String> = JsonMissing.of()
            private var scheduledChange: JsonField<ScheduledPlanChange> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var trialAmount: JsonField<Int> = JsonMissing.of()
            private var pastDueEndsAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                addons = data.addons.map { it.toMutableList() }
                billing = data.billing
                brandId = data.brandId
                cancelAtNextBillingDate = data.cancelAtNextBillingDate
                createdAt = data.createdAt
                creditEntitlementCart = data.creditEntitlementCart.map { it.toMutableList() }
                currency = data.currency
                customer = data.customer
                metadata = data.metadata
                meterCreditEntitlementCart =
                    data.meterCreditEntitlementCart.map { it.toMutableList() }
                meters = data.meters.map { it.toMutableList() }
                nextBillingDate = data.nextBillingDate
                onDemand = data.onDemand
                paymentFrequencyCount = data.paymentFrequencyCount
                paymentFrequencyInterval = data.paymentFrequencyInterval
                previousBillingDate = data.previousBillingDate
                productId = data.productId
                quantity = data.quantity
                recurringPreTaxAmount = data.recurringPreTaxAmount
                status = data.status
                subscriptionId = data.subscriptionId
                subscriptionPeriodCount = data.subscriptionPeriodCount
                subscriptionPeriodInterval = data.subscriptionPeriodInterval
                taxInclusive = data.taxInclusive
                trialPeriodDays = data.trialPeriodDays
                cancellationComment = data.cancellationComment
                cancellationFeedback = data.cancellationFeedback
                cancelledAt = data.cancelledAt
                customFieldResponses = data.customFieldResponses.map { it.toMutableList() }
                customerBusinessName = data.customerBusinessName
                discountCyclesRemaining = data.discountCyclesRemaining
                discountId = data.discountId
                discounts = data.discounts.map { it.toMutableList() }
                expiresAt = data.expiresAt
                pausedAt = data.pausedAt
                paymentMethodId = data.paymentMethodId
                scheduledChange = data.scheduledChange
                taxId = data.taxId
                trialAmount = data.trialAmount
                pastDueEndsAt = data.pastDueEndsAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Addons associated with this subscription */
            fun addons(addons: List<AddonCartResponseItem>) = addons(JsonField.of(addons))

            /**
             * Sets [Builder.addons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addons] with a well-typed
             * `List<AddonCartResponseItem>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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

            /** Brand id this subscription belongs to */
            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /** Indicates if the subscription will cancel at the next billing date */
            fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean) =
                cancelAtNextBillingDate(JsonField.of(cancelAtNextBillingDate))

            /**
             * Sets [Builder.cancelAtNextBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelAtNextBillingDate] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Credit entitlement cart settings for this subscription */
            fun creditEntitlementCart(creditEntitlementCart: List<CreditEntitlementCartResponse>) =
                creditEntitlementCart(JsonField.of(creditEntitlementCart))

            /**
             * Sets [Builder.creditEntitlementCart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementCart] with a well-typed
             * `List<CreditEntitlementCartResponse>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun creditEntitlementCart(
                creditEntitlementCart: JsonField<List<CreditEntitlementCartResponse>>
            ) = apply {
                this.creditEntitlementCart = creditEntitlementCart.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditEntitlementCartResponse] to [Builder.creditEntitlementCart].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditEntitlementCart(creditEntitlementCart: CreditEntitlementCartResponse) =
                apply {
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
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Customer details associated with the subscription */
            fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [CustomerLimitedDetails]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
                this.customer = customer
            }

            /** Additional custom data associated with the subscription */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Meter credit entitlement cart settings for this subscription */
            fun meterCreditEntitlementCart(
                meterCreditEntitlementCart: List<MeterCreditEntitlementCartResponse>
            ) = meterCreditEntitlementCart(JsonField.of(meterCreditEntitlementCart))

            /**
             * Sets [Builder.meterCreditEntitlementCart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterCreditEntitlementCart] with a well-typed
             * `List<MeterCreditEntitlementCartResponse>` value instead. This method is primarily
             * for setting the field to an undocumented or not yet supported value.
             */
            fun meterCreditEntitlementCart(
                meterCreditEntitlementCart: JsonField<List<MeterCreditEntitlementCartResponse>>
            ) = apply {
                this.meterCreditEntitlementCart =
                    meterCreditEntitlementCart.map { it.toMutableList() }
            }

            /**
             * Adds a single [MeterCreditEntitlementCartResponse] to
             * [Builder.meterCreditEntitlementCart].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMeterCreditEntitlementCart(
                meterCreditEntitlementCart: MeterCreditEntitlementCartResponse
            ) = apply {
                this.meterCreditEntitlementCart =
                    (this.meterCreditEntitlementCart ?: JsonField.of(mutableListOf())).also {
                        checkKnown("meterCreditEntitlementCart", it).add(meterCreditEntitlementCart)
                    }
            }

            /** Meters associated with this subscription (for usage-based billing) */
            fun meters(meters: List<MeterCartResponseItem>) = meters(JsonField.of(meters))

            /**
             * Sets [Builder.meters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meters] with a well-typed
             * `List<MeterCartResponseItem>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun meters(meters: JsonField<List<MeterCartResponseItem>>) = apply {
                this.meters = meters.map { it.toMutableList() }
            }

            /**
             * Adds a single [MeterCartResponseItem] to [meters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMeter(meter: MeterCartResponseItem) = apply {
                meters =
                    (meters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("meters", it).add(meter)
                    }
            }

            /**
             * Timestamp of the next scheduled billing. Indicates the end of current billing period
             */
            fun nextBillingDate(nextBillingDate: OffsetDateTime) =
                nextBillingDate(JsonField.of(nextBillingDate))

            /**
             * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun paymentFrequencyInterval(paymentFrequencyInterval: JsonField<TimeInterval>) =
                apply {
                    this.paymentFrequencyInterval = paymentFrequencyInterval
                }

            /** Timestamp of the last payment. Indicates the start of current billing period */
            fun previousBillingDate(previousBillingDate: OffsetDateTime) =
                previousBillingDate(JsonField.of(previousBillingDate))

            /**
             * Sets [Builder.previousBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousBillingDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Number of units/items included in the subscription */
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
             * Amount charged before tax for each recurring payment in the currency's smallest unit
             * (cents for USD, yen for JPY, fils for KWD)
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
            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

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
             * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                this.taxInclusive = taxInclusive
            }

            /** Number of days in the trial period (0 if no trial) */
            fun trialPeriodDays(trialPeriodDays: Int) =
                trialPeriodDays(JsonField.of(trialPeriodDays))

            /**
             * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialPeriodDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialPeriodDays(trialPeriodDays: JsonField<Int>) = apply {
                this.trialPeriodDays = trialPeriodDays
            }

            /** Free-text cancellation comment, if any */
            fun cancellationComment(cancellationComment: String?) =
                cancellationComment(JsonField.ofNullable(cancellationComment))

            /**
             * Sets [Builder.cancellationComment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancellationComment] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cancellationComment(cancellationComment: JsonField<String>) = apply {
                this.cancellationComment = cancellationComment
            }

            /** Customer-supplied churn reason, if any */
            fun cancellationFeedback(cancellationFeedback: CancellationFeedback?) =
                cancellationFeedback(JsonField.ofNullable(cancellationFeedback))

            /**
             * Sets [Builder.cancellationFeedback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancellationFeedback] with a well-typed
             * [CancellationFeedback] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun cancellationFeedback(cancellationFeedback: JsonField<CancellationFeedback>) =
                apply {
                    this.cancellationFeedback = cancellationFeedback
                }

            /** Cancelled timestamp if the subscription is cancelled */
            fun cancelledAt(cancelledAt: OffsetDateTime?) =
                cancelledAt(JsonField.ofNullable(cancelledAt))

            /**
             * Sets [Builder.cancelledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelledAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * `List<CustomFieldResponse>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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

            /**
             * Business / legal name associated with the tax id (B2B). When set this is used on the
             * invoice in place of the customer's personal name.
             */
            fun customerBusinessName(customerBusinessName: String?) =
                customerBusinessName(JsonField.ofNullable(customerBusinessName))

            /**
             * Sets [Builder.customerBusinessName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerBusinessName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customerBusinessName(customerBusinessName: JsonField<String>) = apply {
                this.customerBusinessName = customerBusinessName
            }

            /** DEPRECATED: Use discounts[].cycles_remaining instead. */
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
             * You should usually call [Builder.discountCyclesRemaining] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun discountCyclesRemaining(discountCyclesRemaining: JsonField<Int>) = apply {
                this.discountCyclesRemaining = discountCyclesRemaining
            }

            /** DEPRECATED: Use discounts instead. Returns the first discount's ID if present. */
            fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

            /**
             * Sets [Builder.discountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

            /** All stacked discounts applied, ordered by position */
            fun discounts(discounts: List<DiscountDetail>?) =
                discounts(JsonField.ofNullable(discounts))

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed `List<DiscountDetail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun discounts(discounts: JsonField<List<DiscountDetail>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiscountDetail] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiscount(discount: DiscountDetail) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /** Timestamp when the subscription will expire */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * Timestamp when the subscription was paused, if it currently is (or is `OnHold` due to
             * an unresolved pause settlement). `null` otherwise.
             */
            fun pausedAt(pausedAt: OffsetDateTime?) = pausedAt(JsonField.ofNullable(pausedAt))

            /**
             * Sets [Builder.pausedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pausedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pausedAt(pausedAt: JsonField<OffsetDateTime>) = apply { this.pausedAt = pausedAt }

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

            /** Scheduled plan change details, if any */
            fun scheduledChange(scheduledChange: ScheduledPlanChange?) =
                scheduledChange(JsonField.ofNullable(scheduledChange))

            /**
             * Sets [Builder.scheduledChange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledChange] with a well-typed
             * [ScheduledPlanChange] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun scheduledChange(scheduledChange: JsonField<ScheduledPlanChange>) = apply {
                this.scheduledChange = scheduledChange
            }

            /** Tax identifier provided for this subscription (if applicable) */
            fun taxId(taxId: String?) = taxId(JsonField.ofNullable(taxId))

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

            /**
             * Per-unit trial amount after discounts, snapshotted at subscription creation (price
             * currency minor units, pre-quantity, pre-tax). Null for a free trial or no trial.
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
             * You should usually call [Builder.trialAmount] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialAmount(trialAmount: JsonField<Int>) = apply { this.trialAmount = trialAmount }

            /**
             * Time when the grace period ends. The subscription moves to `on_hold` or to
             * `cancelled` at this time.
             *
             * Read in the same query as the rest of the payload, so it always comes from the row
             * snapshot that produced `status`. It is set whenever the subscription sits in a window
             * at that moment. A delayed event of another type therefore carries the deadline too,
             * next to a `past_due` status.
             */
            fun pastDueEndsAt(pastDueEndsAt: OffsetDateTime?) =
                pastDueEndsAt(JsonField.ofNullable(pastDueEndsAt))

            /**
             * Sets [Builder.pastDueEndsAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pastDueEndsAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pastDueEndsAt(pastDueEndsAt: JsonField<OffsetDateTime>) = apply {
                this.pastDueEndsAt = pastDueEndsAt
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .addons()
             * .billing()
             * .brandId()
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
            fun build(): Data =
                Data(
                    checkRequired("addons", addons).map { it.toImmutable() },
                    checkRequired("billing", billing),
                    checkRequired("brandId", brandId),
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
                    cancellationComment,
                    cancellationFeedback,
                    cancelledAt,
                    (customFieldResponses ?: JsonMissing.of()).map { it.toImmutable() },
                    customerBusinessName,
                    discountCyclesRemaining,
                    discountId,
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    expiresAt,
                    pausedAt,
                    paymentMethodId,
                    scheduledChange,
                    taxId,
                    trialAmount,
                    pastDueEndsAt,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            addons().forEach { it.validate() }
            billing().validate()
            brandId()
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
            cancellationComment()
            cancellationFeedback()?.validate()
            cancelledAt()
            customFieldResponses()?.forEach { it.validate() }
            customerBusinessName()
            discountCyclesRemaining()
            discountId()
            discounts()?.forEach { it.validate() }
            expiresAt()
            pausedAt()
            paymentMethodId()
            scheduledChange()?.validate()
            taxId()
            trialAmount()
            pastDueEndsAt()
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
            (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (billing.asKnown()?.validity() ?: 0) +
                (if (brandId.asKnown() == null) 0 else 1) +
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
                (if (cancellationComment.asKnown() == null) 0 else 1) +
                (cancellationFeedback.asKnown()?.validity() ?: 0) +
                (if (cancelledAt.asKnown() == null) 0 else 1) +
                (customFieldResponses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (customerBusinessName.asKnown() == null) 0 else 1) +
                (if (discountCyclesRemaining.asKnown() == null) 0 else 1) +
                (if (discountId.asKnown() == null) 0 else 1) +
                (discounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (if (pausedAt.asKnown() == null) 0 else 1) +
                (if (paymentMethodId.asKnown() == null) 0 else 1) +
                (scheduledChange.asKnown()?.validity() ?: 0) +
                (if (taxId.asKnown() == null) 0 else 1) +
                (if (trialAmount.asKnown() == null) 0 else 1) +
                (if (pastDueEndsAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                addons == other.addons &&
                billing == other.billing &&
                brandId == other.brandId &&
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
                cancellationComment == other.cancellationComment &&
                cancellationFeedback == other.cancellationFeedback &&
                cancelledAt == other.cancelledAt &&
                customFieldResponses == other.customFieldResponses &&
                customerBusinessName == other.customerBusinessName &&
                discountCyclesRemaining == other.discountCyclesRemaining &&
                discountId == other.discountId &&
                discounts == other.discounts &&
                expiresAt == other.expiresAt &&
                pausedAt == other.pausedAt &&
                paymentMethodId == other.paymentMethodId &&
                scheduledChange == other.scheduledChange &&
                taxId == other.taxId &&
                trialAmount == other.trialAmount &&
                pastDueEndsAt == other.pastDueEndsAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addons,
                billing,
                brandId,
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
                cancellationComment,
                cancellationFeedback,
                cancelledAt,
                customFieldResponses,
                customerBusinessName,
                discountCyclesRemaining,
                discountId,
                discounts,
                expiresAt,
                pausedAt,
                paymentMethodId,
                scheduledChange,
                taxId,
                trialAmount,
                pastDueEndsAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{addons=$addons, billing=$billing, brandId=$brandId, cancelAtNextBillingDate=$cancelAtNextBillingDate, createdAt=$createdAt, creditEntitlementCart=$creditEntitlementCart, currency=$currency, customer=$customer, metadata=$metadata, meterCreditEntitlementCart=$meterCreditEntitlementCart, meters=$meters, nextBillingDate=$nextBillingDate, onDemand=$onDemand, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, previousBillingDate=$previousBillingDate, productId=$productId, quantity=$quantity, recurringPreTaxAmount=$recurringPreTaxAmount, status=$status, subscriptionId=$subscriptionId, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, taxInclusive=$taxInclusive, trialPeriodDays=$trialPeriodDays, cancellationComment=$cancellationComment, cancellationFeedback=$cancellationFeedback, cancelledAt=$cancelledAt, customFieldResponses=$customFieldResponses, customerBusinessName=$customerBusinessName, discountCyclesRemaining=$discountCyclesRemaining, discountId=$discountId, discounts=$discounts, expiresAt=$expiresAt, pausedAt=$pausedAt, paymentMethodId=$paymentMethodId, scheduledChange=$scheduledChange, taxId=$taxId, trialAmount=$trialAmount, pastDueEndsAt=$pastDueEndsAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionFailedWebhookEvent &&
            businessId == other.businessId &&
            data == other.data &&
            timestamp == other.timestamp &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(businessId, data, timestamp, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionFailedWebhookEvent{businessId=$businessId, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
