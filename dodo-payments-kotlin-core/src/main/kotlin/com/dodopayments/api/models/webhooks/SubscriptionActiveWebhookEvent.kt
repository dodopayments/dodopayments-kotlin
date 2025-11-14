// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

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
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.subscriptions.AddonCartResponseItem
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

class SubscriptionActiveWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val businessId: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
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
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(businessId, data, timestamp, type, mutableMapOf())

    /**
     * The business identifier
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Event-specific data
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
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

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

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [SubscriptionActiveWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionActiveWebhookEvent]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionActiveWebhookEvent: SubscriptionActiveWebhookEvent) = apply {
            businessId = subscriptionActiveWebhookEvent.businessId
            data = subscriptionActiveWebhookEvent.data
            timestamp = subscriptionActiveWebhookEvent.timestamp
            type = subscriptionActiveWebhookEvent.type
            additionalProperties =
                subscriptionActiveWebhookEvent.additionalProperties.toMutableMap()
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

        /** Event-specific data */
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

        /** The event type */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [SubscriptionActiveWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .data()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionActiveWebhookEvent =
            SubscriptionActiveWebhookEvent(
                checkRequired("businessId", businessId),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionActiveWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        businessId()
        data().validate()
        timestamp()
        type().validate()
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
            (type.asKnown()?.validity() ?: 0)

    /** Event-specific data */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addons: JsonField<List<AddonCartResponseItem>>,
        private val billing: JsonField<BillingAddress>,
        private val cancelAtNextBillingDate: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<Currency>,
        private val customer: JsonField<CustomerLimitedDetails>,
        private val metadata: JsonField<Subscription.Metadata>,
        private val meters: JsonField<List<Subscription.Meter>>,
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
        private val discountCyclesRemaining: JsonField<Int>,
        private val discountId: JsonField<String>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val paymentMethodId: JsonField<String>,
        private val taxId: JsonField<String>,
        private val payloadType: JsonField<PayloadType>,
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
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Subscription.Metadata> = JsonMissing.of(),
            @JsonProperty("meters")
            @ExcludeMissing
            meters: JsonField<List<Subscription.Meter>> = JsonMissing.of(),
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
            @JsonProperty("cancelled_at")
            @ExcludeMissing
            cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
            @JsonProperty("payload_type")
            @ExcludeMissing
            payloadType: JsonField<PayloadType> = JsonMissing.of(),
        ) : this(
            addons,
            billing,
            cancelAtNextBillingDate,
            createdAt,
            currency,
            customer,
            metadata,
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
            discountCyclesRemaining,
            discountId,
            expiresAt,
            paymentMethodId,
            taxId,
            payloadType,
            mutableMapOf(),
        )

        fun toSubscription(): Subscription =
            Subscription.builder()
                .addons(addons)
                .billing(billing)
                .cancelAtNextBillingDate(cancelAtNextBillingDate)
                .createdAt(createdAt)
                .currency(currency)
                .customer(customer)
                .metadata(metadata)
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
                .cancelledAt(cancelledAt)
                .discountCyclesRemaining(discountCyclesRemaining)
                .discountId(discountId)
                .expiresAt(expiresAt)
                .paymentMethodId(paymentMethodId)
                .taxId(taxId)
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
        fun metadata(): Subscription.Metadata = metadata.getRequired("metadata")

        /**
         * Meters associated with this subscription (for usage-based billing)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meters(): List<Subscription.Meter> = meters.getRequired("meters")

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
         * Amount charged before tax for each recurring payment in smallest currency unit (e.g.
         * cents)
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
         * Cancelled timestamp if the subscription is cancelled
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancelledAt(): OffsetDateTime? = cancelledAt.getNullable("cancelled_at")

        /**
         * Number of remaining discount cycles if discount is applied
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountCyclesRemaining(): Int? =
            discountCyclesRemaining.getNullable("discount_cycles_remaining")

        /**
         * The discount id if discount is applied
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountId(): String? = discountId.getNullable("discount_id")

        /**
         * Timestamp when the subscription will expire
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        /**
         * Saved payment method id used for recurring charges
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentMethodId(): String? = paymentMethodId.getNullable("payment_method_id")

        /**
         * Tax identifier provided for this subscription (if applicable)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): String? = taxId.getNullable("tax_id")

        /**
         * The type of payload in the data field
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun payloadType(): PayloadType? = payloadType.getNullable("payload_type")

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
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): JsonField<Subscription.Metadata> = metadata

        /**
         * Returns the raw JSON value of [meters].
         *
         * Unlike [meters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meters")
        @ExcludeMissing
        fun _meters(): JsonField<List<Subscription.Meter>> = meters

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
         * Returns the raw JSON value of [cancelledAt].
         *
         * Unlike [cancelledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cancelled_at")
        @ExcludeMissing
        fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

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
         * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an unexpected
         * type.
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

        /**
         * Returns the raw JSON value of [payloadType].
         *
         * Unlike [payloadType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload_type")
        @ExcludeMissing
        fun _payloadType(): JsonField<PayloadType> = payloadType

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
             * .cancelAtNextBillingDate()
             * .createdAt()
             * .currency()
             * .customer()
             * .metadata()
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
            private var cancelAtNextBillingDate: JsonField<Boolean>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<Currency>? = null
            private var customer: JsonField<CustomerLimitedDetails>? = null
            private var metadata: JsonField<Subscription.Metadata>? = null
            private var meters: JsonField<MutableList<Subscription.Meter>>? = null
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
            private var discountCyclesRemaining: JsonField<Int> = JsonMissing.of()
            private var discountId: JsonField<String> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var paymentMethodId: JsonField<String> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var payloadType: JsonField<PayloadType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                addons = data.addons.map { it.toMutableList() }
                billing = data.billing
                cancelAtNextBillingDate = data.cancelAtNextBillingDate
                createdAt = data.createdAt
                currency = data.currency
                customer = data.customer
                metadata = data.metadata
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
                cancelledAt = data.cancelledAt
                discountCyclesRemaining = data.discountCyclesRemaining
                discountId = data.discountId
                expiresAt = data.expiresAt
                paymentMethodId = data.paymentMethodId
                taxId = data.taxId
                payloadType = data.payloadType
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
            fun metadata(metadata: Subscription.Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Subscription.Metadata]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun metadata(metadata: JsonField<Subscription.Metadata>) = apply {
                this.metadata = metadata
            }

            /** Meters associated with this subscription (for usage-based billing) */
            fun meters(meters: List<Subscription.Meter>) = meters(JsonField.of(meters))

            /**
             * Sets [Builder.meters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meters] with a well-typed `List<Subscription.Meter>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun meters(meters: JsonField<List<Subscription.Meter>>) = apply {
                this.meters = meters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Subscription.Meter] to [meters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMeter(meter: Subscription.Meter) = apply {
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
             * You should usually call [Builder.discountCyclesRemaining] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun discountCyclesRemaining(discountCyclesRemaining: JsonField<Int>) = apply {
                this.discountCyclesRemaining = discountCyclesRemaining
            }

            /** The discount id if discount is applied */
            fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

            /**
             * Sets [Builder.discountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

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
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

            /** The type of payload in the data field */
            fun payloadType(payloadType: PayloadType) = payloadType(JsonField.of(payloadType))

            /**
             * Sets [Builder.payloadType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadType] with a well-typed [PayloadType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadType(payloadType: JsonField<PayloadType>) = apply {
                this.payloadType = payloadType
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
             * .cancelAtNextBillingDate()
             * .createdAt()
             * .currency()
             * .customer()
             * .metadata()
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
                    checkRequired("cancelAtNextBillingDate", cancelAtNextBillingDate),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("metadata", metadata),
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
                    discountCyclesRemaining,
                    discountId,
                    expiresAt,
                    paymentMethodId,
                    taxId,
                    payloadType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            addons().forEach { it.validate() }
            billing().validate()
            cancelAtNextBillingDate()
            createdAt()
            currency().validate()
            customer().validate()
            metadata().validate()
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
            discountCyclesRemaining()
            discountId()
            expiresAt()
            paymentMethodId()
            taxId()
            payloadType()?.validate()
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
                (if (cancelAtNextBillingDate.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (currency.asKnown()?.validity() ?: 0) +
                (customer.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
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
                (if (discountCyclesRemaining.asKnown() == null) 0 else 1) +
                (if (discountId.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (if (paymentMethodId.asKnown() == null) 0 else 1) +
                (if (taxId.asKnown() == null) 0 else 1) +
                (payloadType.asKnown()?.validity() ?: 0)

        /** The type of payload in the data field */
        class PayloadType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val SUBSCRIPTION = of("Subscription")

                fun of(value: String) = PayloadType(JsonField.of(value))
            }

            /** An enum containing [PayloadType]'s known values. */
            enum class Known {
                SUBSCRIPTION
            }

            /**
             * An enum containing [PayloadType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PayloadType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUBSCRIPTION,
                /**
                 * An enum member indicating that [PayloadType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SUBSCRIPTION -> Value.SUBSCRIPTION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    SUBSCRIPTION -> Known.SUBSCRIPTION
                    else -> throw DodoPaymentsInvalidDataException("Unknown PayloadType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw DodoPaymentsInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): PayloadType = apply {
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

                return other is PayloadType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                addons == other.addons &&
                billing == other.billing &&
                cancelAtNextBillingDate == other.cancelAtNextBillingDate &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                customer == other.customer &&
                metadata == other.metadata &&
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
                discountCyclesRemaining == other.discountCyclesRemaining &&
                discountId == other.discountId &&
                expiresAt == other.expiresAt &&
                paymentMethodId == other.paymentMethodId &&
                taxId == other.taxId &&
                payloadType == other.payloadType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addons,
                billing,
                cancelAtNextBillingDate,
                createdAt,
                currency,
                customer,
                metadata,
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
                discountCyclesRemaining,
                discountId,
                expiresAt,
                paymentMethodId,
                taxId,
                payloadType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{addons=$addons, billing=$billing, cancelAtNextBillingDate=$cancelAtNextBillingDate, createdAt=$createdAt, currency=$currency, customer=$customer, metadata=$metadata, meters=$meters, nextBillingDate=$nextBillingDate, onDemand=$onDemand, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, previousBillingDate=$previousBillingDate, productId=$productId, quantity=$quantity, recurringPreTaxAmount=$recurringPreTaxAmount, status=$status, subscriptionId=$subscriptionId, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, taxInclusive=$taxInclusive, trialPeriodDays=$trialPeriodDays, cancelledAt=$cancelledAt, discountCyclesRemaining=$discountCyclesRemaining, discountId=$discountId, expiresAt=$expiresAt, paymentMethodId=$paymentMethodId, taxId=$taxId, payloadType=$payloadType, additionalProperties=$additionalProperties}"
    }

    /** The event type */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val SUBSCRIPTION_ACTIVE = of("subscription.active")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SUBSCRIPTION_ACTIVE
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUBSCRIPTION_ACTIVE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                SUBSCRIPTION_ACTIVE -> Value.SUBSCRIPTION_ACTIVE
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
                SUBSCRIPTION_ACTIVE -> Known.SUBSCRIPTION_ACTIVE
                else -> throw DodoPaymentsInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionActiveWebhookEvent &&
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
        "SubscriptionActiveWebhookEvent{businessId=$businessId, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
