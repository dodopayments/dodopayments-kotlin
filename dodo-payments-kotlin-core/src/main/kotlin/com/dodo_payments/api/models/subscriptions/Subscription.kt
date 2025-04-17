// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

/** Response struct representing subscription details */
@NoAutoDetect
class Subscription
@JsonCreator
private constructor(
    @JsonProperty("billing")
    @ExcludeMissing
    private val billing: JsonField<BillingAddress> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("next_billing_date")
    @ExcludeMissing
    private val nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("payment_frequency_count")
    @ExcludeMissing
    private val paymentFrequencyCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("payment_frequency_interval")
    @ExcludeMissing
    private val paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
    @JsonProperty("product_id")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("recurring_pre_tax_amount")
    @ExcludeMissing
    private val recurringPreTaxAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<SubscriptionStatus> = JsonMissing.of(),
    @JsonProperty("subscription_id")
    @ExcludeMissing
    private val subscriptionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("subscription_period_count")
    @ExcludeMissing
    private val subscriptionPeriodCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("subscription_period_interval")
    @ExcludeMissing
    private val subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
    @JsonProperty("tax_inclusive")
    @ExcludeMissing
    private val taxInclusive: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("trial_period_days")
    @ExcludeMissing
    private val trialPeriodDays: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("cancelled_at")
    @ExcludeMissing
    private val cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discount_id")
    @ExcludeMissing
    private val discountId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun billing(): BillingAddress = billing.getRequired("billing")

    /** Timestamp when the subscription was created */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun currency(): Currency = currency.getRequired("currency")

    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** Timestamp of the next scheduled billing */
    fun nextBillingDate(): OffsetDateTime = nextBillingDate.getRequired("next_billing_date")

    /** Number of payment frequency intervals */
    fun paymentFrequencyCount(): Long = paymentFrequencyCount.getRequired("payment_frequency_count")

    fun paymentFrequencyInterval(): TimeInterval =
        paymentFrequencyInterval.getRequired("payment_frequency_interval")

    /** Identifier of the product associated with this subscription */
    fun productId(): String = productId.getRequired("product_id")

    /** Number of units/items included in the subscription */
    fun quantity(): Long = quantity.getRequired("quantity")

    /**
     * Amount charged before tax for each recurring payment in smallest currency unit (e.g. cents)
     */
    fun recurringPreTaxAmount(): Long =
        recurringPreTaxAmount.getRequired("recurring_pre_tax_amount")

    fun status(): SubscriptionStatus = status.getRequired("status")

    /** Unique identifier for the subscription */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /** Number of subscription period intervals */
    fun subscriptionPeriodCount(): Long =
        subscriptionPeriodCount.getRequired("subscription_period_count")

    fun subscriptionPeriodInterval(): TimeInterval =
        subscriptionPeriodInterval.getRequired("subscription_period_interval")

    /** Indicates if the recurring_pre_tax_amount is tax inclusive */
    fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

    /** Number of days in the trial period (0 if no trial) */
    fun trialPeriodDays(): Long = trialPeriodDays.getRequired("trial_period_days")

    /** Cancelled timestamp if the subscription is cancelled */
    fun cancelledAt(): OffsetDateTime? = cancelledAt.getNullable("cancelled_at")

    /** The discount id if discount is applied */
    fun discountId(): String? = discountId.getNullable("discount_id")

    @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<BillingAddress> = billing

    /** Timestamp when the subscription was created */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerLimitedDetails> = customer

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** Timestamp of the next scheduled billing */
    @JsonProperty("next_billing_date")
    @ExcludeMissing
    fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

    /** Number of payment frequency intervals */
    @JsonProperty("payment_frequency_count")
    @ExcludeMissing
    fun _paymentFrequencyCount(): JsonField<Long> = paymentFrequencyCount

    @JsonProperty("payment_frequency_interval")
    @ExcludeMissing
    fun _paymentFrequencyInterval(): JsonField<TimeInterval> = paymentFrequencyInterval

    /** Identifier of the product associated with this subscription */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /** Number of units/items included in the subscription */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * Amount charged before tax for each recurring payment in smallest currency unit (e.g. cents)
     */
    @JsonProperty("recurring_pre_tax_amount")
    @ExcludeMissing
    fun _recurringPreTaxAmount(): JsonField<Long> = recurringPreTaxAmount

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<SubscriptionStatus> = status

    /** Unique identifier for the subscription */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /** Number of subscription period intervals */
    @JsonProperty("subscription_period_count")
    @ExcludeMissing
    fun _subscriptionPeriodCount(): JsonField<Long> = subscriptionPeriodCount

    @JsonProperty("subscription_period_interval")
    @ExcludeMissing
    fun _subscriptionPeriodInterval(): JsonField<TimeInterval> = subscriptionPeriodInterval

    /** Indicates if the recurring_pre_tax_amount is tax inclusive */
    @JsonProperty("tax_inclusive")
    @ExcludeMissing
    fun _taxInclusive(): JsonField<Boolean> = taxInclusive

    /** Number of days in the trial period (0 if no trial) */
    @JsonProperty("trial_period_days")
    @ExcludeMissing
    fun _trialPeriodDays(): JsonField<Long> = trialPeriodDays

    /** Cancelled timestamp if the subscription is cancelled */
    @JsonProperty("cancelled_at")
    @ExcludeMissing
    fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

    /** The discount id if discount is applied */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Subscription = apply {
        if (validated) {
            return@apply
        }

        billing().validate()
        createdAt()
        currency()
        customer().validate()
        metadata().validate()
        nextBillingDate()
        paymentFrequencyCount()
        paymentFrequencyInterval()
        productId()
        quantity()
        recurringPreTaxAmount()
        status()
        subscriptionId()
        subscriptionPeriodCount()
        subscriptionPeriodInterval()
        taxInclusive()
        trialPeriodDays()
        cancelledAt()
        discountId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Subscription].
         *
         * The following fields are required:
         * ```kotlin
         * .billing()
         * .createdAt()
         * .currency()
         * .customer()
         * .metadata()
         * .nextBillingDate()
         * .paymentFrequencyCount()
         * .paymentFrequencyInterval()
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

        private var billing: JsonField<BillingAddress>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var metadata: JsonField<Metadata>? = null
        private var nextBillingDate: JsonField<OffsetDateTime>? = null
        private var paymentFrequencyCount: JsonField<Long>? = null
        private var paymentFrequencyInterval: JsonField<TimeInterval>? = null
        private var productId: JsonField<String>? = null
        private var quantity: JsonField<Long>? = null
        private var recurringPreTaxAmount: JsonField<Long>? = null
        private var status: JsonField<SubscriptionStatus>? = null
        private var subscriptionId: JsonField<String>? = null
        private var subscriptionPeriodCount: JsonField<Long>? = null
        private var subscriptionPeriodInterval: JsonField<TimeInterval>? = null
        private var taxInclusive: JsonField<Boolean>? = null
        private var trialPeriodDays: JsonField<Long>? = null
        private var cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discountId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscription: Subscription) = apply {
            billing = subscription.billing
            createdAt = subscription.createdAt
            currency = subscription.currency
            customer = subscription.customer
            metadata = subscription.metadata
            nextBillingDate = subscription.nextBillingDate
            paymentFrequencyCount = subscription.paymentFrequencyCount
            paymentFrequencyInterval = subscription.paymentFrequencyInterval
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
            discountId = subscription.discountId
            additionalProperties = subscription.additionalProperties.toMutableMap()
        }

        fun billing(billing: BillingAddress) = billing(JsonField.of(billing))

        fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

        /** Timestamp when the subscription was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** Timestamp when the subscription was created */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
            this.customer = customer
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Timestamp of the next scheduled billing */
        fun nextBillingDate(nextBillingDate: OffsetDateTime) =
            nextBillingDate(JsonField.of(nextBillingDate))

        /** Timestamp of the next scheduled billing */
        fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
            this.nextBillingDate = nextBillingDate
        }

        /** Number of payment frequency intervals */
        fun paymentFrequencyCount(paymentFrequencyCount: Long) =
            paymentFrequencyCount(JsonField.of(paymentFrequencyCount))

        /** Number of payment frequency intervals */
        fun paymentFrequencyCount(paymentFrequencyCount: JsonField<Long>) = apply {
            this.paymentFrequencyCount = paymentFrequencyCount
        }

        fun paymentFrequencyInterval(paymentFrequencyInterval: TimeInterval) =
            paymentFrequencyInterval(JsonField.of(paymentFrequencyInterval))

        fun paymentFrequencyInterval(paymentFrequencyInterval: JsonField<TimeInterval>) = apply {
            this.paymentFrequencyInterval = paymentFrequencyInterval
        }

        /** Identifier of the product associated with this subscription */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** Identifier of the product associated with this subscription */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Number of units/items included in the subscription */
        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        /** Number of units/items included in the subscription */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /**
         * Amount charged before tax for each recurring payment in smallest currency unit (e.g.
         * cents)
         */
        fun recurringPreTaxAmount(recurringPreTaxAmount: Long) =
            recurringPreTaxAmount(JsonField.of(recurringPreTaxAmount))

        /**
         * Amount charged before tax for each recurring payment in smallest currency unit (e.g.
         * cents)
         */
        fun recurringPreTaxAmount(recurringPreTaxAmount: JsonField<Long>) = apply {
            this.recurringPreTaxAmount = recurringPreTaxAmount
        }

        fun status(status: SubscriptionStatus) = status(JsonField.of(status))

        fun status(status: JsonField<SubscriptionStatus>) = apply { this.status = status }

        /** Unique identifier for the subscription */
        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

        /** Unique identifier for the subscription */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

        /** Number of subscription period intervals */
        fun subscriptionPeriodCount(subscriptionPeriodCount: Long) =
            subscriptionPeriodCount(JsonField.of(subscriptionPeriodCount))

        /** Number of subscription period intervals */
        fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Long>) = apply {
            this.subscriptionPeriodCount = subscriptionPeriodCount
        }

        fun subscriptionPeriodInterval(subscriptionPeriodInterval: TimeInterval) =
            subscriptionPeriodInterval(JsonField.of(subscriptionPeriodInterval))

        fun subscriptionPeriodInterval(subscriptionPeriodInterval: JsonField<TimeInterval>) =
            apply {
                this.subscriptionPeriodInterval = subscriptionPeriodInterval
            }

        /** Indicates if the recurring_pre_tax_amount is tax inclusive */
        fun taxInclusive(taxInclusive: Boolean) = taxInclusive(JsonField.of(taxInclusive))

        /** Indicates if the recurring_pre_tax_amount is tax inclusive */
        fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
            this.taxInclusive = taxInclusive
        }

        /** Number of days in the trial period (0 if no trial) */
        fun trialPeriodDays(trialPeriodDays: Long) = trialPeriodDays(JsonField.of(trialPeriodDays))

        /** Number of days in the trial period (0 if no trial) */
        fun trialPeriodDays(trialPeriodDays: JsonField<Long>) = apply {
            this.trialPeriodDays = trialPeriodDays
        }

        /** Cancelled timestamp if the subscription is cancelled */
        fun cancelledAt(cancelledAt: OffsetDateTime?) =
            cancelledAt(JsonField.ofNullable(cancelledAt))

        /** Cancelled timestamp if the subscription is cancelled */
        fun cancelledAt(cancelledAt: JsonField<OffsetDateTime>) = apply {
            this.cancelledAt = cancelledAt
        }

        /** The discount id if discount is applied */
        fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

        /** The discount id if discount is applied */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

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

        fun build(): Subscription =
            Subscription(
                checkRequired("billing", billing),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("metadata", metadata),
                checkRequired("nextBillingDate", nextBillingDate),
                checkRequired("paymentFrequencyCount", paymentFrequencyCount),
                checkRequired("paymentFrequencyInterval", paymentFrequencyInterval),
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
                discountId,
                additionalProperties.toImmutable(),
            )
    }

    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val AED = of("AED")

            val ALL = of("ALL")

            val AMD = of("AMD")

            val ANG = of("ANG")

            val AOA = of("AOA")

            val ARS = of("ARS")

            val AUD = of("AUD")

            val AWG = of("AWG")

            val AZN = of("AZN")

            val BAM = of("BAM")

            val BBD = of("BBD")

            val BDT = of("BDT")

            val BGN = of("BGN")

            val BHD = of("BHD")

            val BIF = of("BIF")

            val BMD = of("BMD")

            val BND = of("BND")

            val BOB = of("BOB")

            val BRL = of("BRL")

            val BSD = of("BSD")

            val BWP = of("BWP")

            val BYN = of("BYN")

            val BZD = of("BZD")

            val CAD = of("CAD")

            val CHF = of("CHF")

            val CLP = of("CLP")

            val CNY = of("CNY")

            val COP = of("COP")

            val CRC = of("CRC")

            val CUP = of("CUP")

            val CVE = of("CVE")

            val CZK = of("CZK")

            val DJF = of("DJF")

            val DKK = of("DKK")

            val DOP = of("DOP")

            val DZD = of("DZD")

            val EGP = of("EGP")

            val ETB = of("ETB")

            val EUR = of("EUR")

            val FJD = of("FJD")

            val FKP = of("FKP")

            val GBP = of("GBP")

            val GEL = of("GEL")

            val GHS = of("GHS")

            val GIP = of("GIP")

            val GMD = of("GMD")

            val GNF = of("GNF")

            val GTQ = of("GTQ")

            val GYD = of("GYD")

            val HKD = of("HKD")

            val HNL = of("HNL")

            val HRK = of("HRK")

            val HTG = of("HTG")

            val HUF = of("HUF")

            val IDR = of("IDR")

            val ILS = of("ILS")

            val INR = of("INR")

            val IQD = of("IQD")

            val JMD = of("JMD")

            val JOD = of("JOD")

            val JPY = of("JPY")

            val KES = of("KES")

            val KGS = of("KGS")

            val KHR = of("KHR")

            val KMF = of("KMF")

            val KRW = of("KRW")

            val KWD = of("KWD")

            val KYD = of("KYD")

            val KZT = of("KZT")

            val LAK = of("LAK")

            val LBP = of("LBP")

            val LKR = of("LKR")

            val LRD = of("LRD")

            val LSL = of("LSL")

            val LYD = of("LYD")

            val MAD = of("MAD")

            val MDL = of("MDL")

            val MGA = of("MGA")

            val MKD = of("MKD")

            val MMK = of("MMK")

            val MNT = of("MNT")

            val MOP = of("MOP")

            val MRU = of("MRU")

            val MUR = of("MUR")

            val MVR = of("MVR")

            val MWK = of("MWK")

            val MXN = of("MXN")

            val MYR = of("MYR")

            val MZN = of("MZN")

            val NAD = of("NAD")

            val NGN = of("NGN")

            val NIO = of("NIO")

            val NOK = of("NOK")

            val NPR = of("NPR")

            val NZD = of("NZD")

            val OMR = of("OMR")

            val PAB = of("PAB")

            val PEN = of("PEN")

            val PGK = of("PGK")

            val PHP = of("PHP")

            val PKR = of("PKR")

            val PLN = of("PLN")

            val PYG = of("PYG")

            val QAR = of("QAR")

            val RON = of("RON")

            val RSD = of("RSD")

            val RUB = of("RUB")

            val RWF = of("RWF")

            val SAR = of("SAR")

            val SBD = of("SBD")

            val SCR = of("SCR")

            val SEK = of("SEK")

            val SGD = of("SGD")

            val SHP = of("SHP")

            val SLE = of("SLE")

            val SLL = of("SLL")

            val SOS = of("SOS")

            val SRD = of("SRD")

            val SSP = of("SSP")

            val STN = of("STN")

            val SVC = of("SVC")

            val SZL = of("SZL")

            val THB = of("THB")

            val TND = of("TND")

            val TOP = of("TOP")

            val TRY = of("TRY")

            val TTD = of("TTD")

            val TWD = of("TWD")

            val TZS = of("TZS")

            val UAH = of("UAH")

            val UGX = of("UGX")

            val USD = of("USD")

            val UYU = of("UYU")

            val UZS = of("UZS")

            val VES = of("VES")

            val VND = of("VND")

            val VUV = of("VUV")

            val WST = of("WST")

            val XAF = of("XAF")

            val XCD = of("XCD")

            val XOF = of("XOF")

            val XPF = of("XPF")

            val YER = of("YER")

            val ZAR = of("ZAR")

            val ZMW = of("ZMW")

            fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            AED,
            ALL,
            AMD,
            ANG,
            AOA,
            ARS,
            AUD,
            AWG,
            AZN,
            BAM,
            BBD,
            BDT,
            BGN,
            BHD,
            BIF,
            BMD,
            BND,
            BOB,
            BRL,
            BSD,
            BWP,
            BYN,
            BZD,
            CAD,
            CHF,
            CLP,
            CNY,
            COP,
            CRC,
            CUP,
            CVE,
            CZK,
            DJF,
            DKK,
            DOP,
            DZD,
            EGP,
            ETB,
            EUR,
            FJD,
            FKP,
            GBP,
            GEL,
            GHS,
            GIP,
            GMD,
            GNF,
            GTQ,
            GYD,
            HKD,
            HNL,
            HRK,
            HTG,
            HUF,
            IDR,
            ILS,
            INR,
            IQD,
            JMD,
            JOD,
            JPY,
            KES,
            KGS,
            KHR,
            KMF,
            KRW,
            KWD,
            KYD,
            KZT,
            LAK,
            LBP,
            LKR,
            LRD,
            LSL,
            LYD,
            MAD,
            MDL,
            MGA,
            MKD,
            MMK,
            MNT,
            MOP,
            MRU,
            MUR,
            MVR,
            MWK,
            MXN,
            MYR,
            MZN,
            NAD,
            NGN,
            NIO,
            NOK,
            NPR,
            NZD,
            OMR,
            PAB,
            PEN,
            PGK,
            PHP,
            PKR,
            PLN,
            PYG,
            QAR,
            RON,
            RSD,
            RUB,
            RWF,
            SAR,
            SBD,
            SCR,
            SEK,
            SGD,
            SHP,
            SLE,
            SLL,
            SOS,
            SRD,
            SSP,
            STN,
            SVC,
            SZL,
            THB,
            TND,
            TOP,
            TRY,
            TTD,
            TWD,
            TZS,
            UAH,
            UGX,
            USD,
            UYU,
            UZS,
            VES,
            VND,
            VUV,
            WST,
            XAF,
            XCD,
            XOF,
            XPF,
            YER,
            ZAR,
            ZMW,
        }

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AED,
            ALL,
            AMD,
            ANG,
            AOA,
            ARS,
            AUD,
            AWG,
            AZN,
            BAM,
            BBD,
            BDT,
            BGN,
            BHD,
            BIF,
            BMD,
            BND,
            BOB,
            BRL,
            BSD,
            BWP,
            BYN,
            BZD,
            CAD,
            CHF,
            CLP,
            CNY,
            COP,
            CRC,
            CUP,
            CVE,
            CZK,
            DJF,
            DKK,
            DOP,
            DZD,
            EGP,
            ETB,
            EUR,
            FJD,
            FKP,
            GBP,
            GEL,
            GHS,
            GIP,
            GMD,
            GNF,
            GTQ,
            GYD,
            HKD,
            HNL,
            HRK,
            HTG,
            HUF,
            IDR,
            ILS,
            INR,
            IQD,
            JMD,
            JOD,
            JPY,
            KES,
            KGS,
            KHR,
            KMF,
            KRW,
            KWD,
            KYD,
            KZT,
            LAK,
            LBP,
            LKR,
            LRD,
            LSL,
            LYD,
            MAD,
            MDL,
            MGA,
            MKD,
            MMK,
            MNT,
            MOP,
            MRU,
            MUR,
            MVR,
            MWK,
            MXN,
            MYR,
            MZN,
            NAD,
            NGN,
            NIO,
            NOK,
            NPR,
            NZD,
            OMR,
            PAB,
            PEN,
            PGK,
            PHP,
            PKR,
            PLN,
            PYG,
            QAR,
            RON,
            RSD,
            RUB,
            RWF,
            SAR,
            SBD,
            SCR,
            SEK,
            SGD,
            SHP,
            SLE,
            SLL,
            SOS,
            SRD,
            SSP,
            STN,
            SVC,
            SZL,
            THB,
            TND,
            TOP,
            TRY,
            TTD,
            TWD,
            TZS,
            UAH,
            UGX,
            USD,
            UYU,
            UZS,
            VES,
            VND,
            VUV,
            WST,
            XAF,
            XCD,
            XOF,
            XPF,
            YER,
            ZAR,
            ZMW,
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
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
                AED -> Value.AED
                ALL -> Value.ALL
                AMD -> Value.AMD
                ANG -> Value.ANG
                AOA -> Value.AOA
                ARS -> Value.ARS
                AUD -> Value.AUD
                AWG -> Value.AWG
                AZN -> Value.AZN
                BAM -> Value.BAM
                BBD -> Value.BBD
                BDT -> Value.BDT
                BGN -> Value.BGN
                BHD -> Value.BHD
                BIF -> Value.BIF
                BMD -> Value.BMD
                BND -> Value.BND
                BOB -> Value.BOB
                BRL -> Value.BRL
                BSD -> Value.BSD
                BWP -> Value.BWP
                BYN -> Value.BYN
                BZD -> Value.BZD
                CAD -> Value.CAD
                CHF -> Value.CHF
                CLP -> Value.CLP
                CNY -> Value.CNY
                COP -> Value.COP
                CRC -> Value.CRC
                CUP -> Value.CUP
                CVE -> Value.CVE
                CZK -> Value.CZK
                DJF -> Value.DJF
                DKK -> Value.DKK
                DOP -> Value.DOP
                DZD -> Value.DZD
                EGP -> Value.EGP
                ETB -> Value.ETB
                EUR -> Value.EUR
                FJD -> Value.FJD
                FKP -> Value.FKP
                GBP -> Value.GBP
                GEL -> Value.GEL
                GHS -> Value.GHS
                GIP -> Value.GIP
                GMD -> Value.GMD
                GNF -> Value.GNF
                GTQ -> Value.GTQ
                GYD -> Value.GYD
                HKD -> Value.HKD
                HNL -> Value.HNL
                HRK -> Value.HRK
                HTG -> Value.HTG
                HUF -> Value.HUF
                IDR -> Value.IDR
                ILS -> Value.ILS
                INR -> Value.INR
                IQD -> Value.IQD
                JMD -> Value.JMD
                JOD -> Value.JOD
                JPY -> Value.JPY
                KES -> Value.KES
                KGS -> Value.KGS
                KHR -> Value.KHR
                KMF -> Value.KMF
                KRW -> Value.KRW
                KWD -> Value.KWD
                KYD -> Value.KYD
                KZT -> Value.KZT
                LAK -> Value.LAK
                LBP -> Value.LBP
                LKR -> Value.LKR
                LRD -> Value.LRD
                LSL -> Value.LSL
                LYD -> Value.LYD
                MAD -> Value.MAD
                MDL -> Value.MDL
                MGA -> Value.MGA
                MKD -> Value.MKD
                MMK -> Value.MMK
                MNT -> Value.MNT
                MOP -> Value.MOP
                MRU -> Value.MRU
                MUR -> Value.MUR
                MVR -> Value.MVR
                MWK -> Value.MWK
                MXN -> Value.MXN
                MYR -> Value.MYR
                MZN -> Value.MZN
                NAD -> Value.NAD
                NGN -> Value.NGN
                NIO -> Value.NIO
                NOK -> Value.NOK
                NPR -> Value.NPR
                NZD -> Value.NZD
                OMR -> Value.OMR
                PAB -> Value.PAB
                PEN -> Value.PEN
                PGK -> Value.PGK
                PHP -> Value.PHP
                PKR -> Value.PKR
                PLN -> Value.PLN
                PYG -> Value.PYG
                QAR -> Value.QAR
                RON -> Value.RON
                RSD -> Value.RSD
                RUB -> Value.RUB
                RWF -> Value.RWF
                SAR -> Value.SAR
                SBD -> Value.SBD
                SCR -> Value.SCR
                SEK -> Value.SEK
                SGD -> Value.SGD
                SHP -> Value.SHP
                SLE -> Value.SLE
                SLL -> Value.SLL
                SOS -> Value.SOS
                SRD -> Value.SRD
                SSP -> Value.SSP
                STN -> Value.STN
                SVC -> Value.SVC
                SZL -> Value.SZL
                THB -> Value.THB
                TND -> Value.TND
                TOP -> Value.TOP
                TRY -> Value.TRY
                TTD -> Value.TTD
                TWD -> Value.TWD
                TZS -> Value.TZS
                UAH -> Value.UAH
                UGX -> Value.UGX
                USD -> Value.USD
                UYU -> Value.UYU
                UZS -> Value.UZS
                VES -> Value.VES
                VND -> Value.VND
                VUV -> Value.VUV
                WST -> Value.WST
                XAF -> Value.XAF
                XCD -> Value.XCD
                XOF -> Value.XOF
                XPF -> Value.XPF
                YER -> Value.YER
                ZAR -> Value.ZAR
                ZMW -> Value.ZMW
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
                AED -> Known.AED
                ALL -> Known.ALL
                AMD -> Known.AMD
                ANG -> Known.ANG
                AOA -> Known.AOA
                ARS -> Known.ARS
                AUD -> Known.AUD
                AWG -> Known.AWG
                AZN -> Known.AZN
                BAM -> Known.BAM
                BBD -> Known.BBD
                BDT -> Known.BDT
                BGN -> Known.BGN
                BHD -> Known.BHD
                BIF -> Known.BIF
                BMD -> Known.BMD
                BND -> Known.BND
                BOB -> Known.BOB
                BRL -> Known.BRL
                BSD -> Known.BSD
                BWP -> Known.BWP
                BYN -> Known.BYN
                BZD -> Known.BZD
                CAD -> Known.CAD
                CHF -> Known.CHF
                CLP -> Known.CLP
                CNY -> Known.CNY
                COP -> Known.COP
                CRC -> Known.CRC
                CUP -> Known.CUP
                CVE -> Known.CVE
                CZK -> Known.CZK
                DJF -> Known.DJF
                DKK -> Known.DKK
                DOP -> Known.DOP
                DZD -> Known.DZD
                EGP -> Known.EGP
                ETB -> Known.ETB
                EUR -> Known.EUR
                FJD -> Known.FJD
                FKP -> Known.FKP
                GBP -> Known.GBP
                GEL -> Known.GEL
                GHS -> Known.GHS
                GIP -> Known.GIP
                GMD -> Known.GMD
                GNF -> Known.GNF
                GTQ -> Known.GTQ
                GYD -> Known.GYD
                HKD -> Known.HKD
                HNL -> Known.HNL
                HRK -> Known.HRK
                HTG -> Known.HTG
                HUF -> Known.HUF
                IDR -> Known.IDR
                ILS -> Known.ILS
                INR -> Known.INR
                IQD -> Known.IQD
                JMD -> Known.JMD
                JOD -> Known.JOD
                JPY -> Known.JPY
                KES -> Known.KES
                KGS -> Known.KGS
                KHR -> Known.KHR
                KMF -> Known.KMF
                KRW -> Known.KRW
                KWD -> Known.KWD
                KYD -> Known.KYD
                KZT -> Known.KZT
                LAK -> Known.LAK
                LBP -> Known.LBP
                LKR -> Known.LKR
                LRD -> Known.LRD
                LSL -> Known.LSL
                LYD -> Known.LYD
                MAD -> Known.MAD
                MDL -> Known.MDL
                MGA -> Known.MGA
                MKD -> Known.MKD
                MMK -> Known.MMK
                MNT -> Known.MNT
                MOP -> Known.MOP
                MRU -> Known.MRU
                MUR -> Known.MUR
                MVR -> Known.MVR
                MWK -> Known.MWK
                MXN -> Known.MXN
                MYR -> Known.MYR
                MZN -> Known.MZN
                NAD -> Known.NAD
                NGN -> Known.NGN
                NIO -> Known.NIO
                NOK -> Known.NOK
                NPR -> Known.NPR
                NZD -> Known.NZD
                OMR -> Known.OMR
                PAB -> Known.PAB
                PEN -> Known.PEN
                PGK -> Known.PGK
                PHP -> Known.PHP
                PKR -> Known.PKR
                PLN -> Known.PLN
                PYG -> Known.PYG
                QAR -> Known.QAR
                RON -> Known.RON
                RSD -> Known.RSD
                RUB -> Known.RUB
                RWF -> Known.RWF
                SAR -> Known.SAR
                SBD -> Known.SBD
                SCR -> Known.SCR
                SEK -> Known.SEK
                SGD -> Known.SGD
                SHP -> Known.SHP
                SLE -> Known.SLE
                SLL -> Known.SLL
                SOS -> Known.SOS
                SRD -> Known.SRD
                SSP -> Known.SSP
                STN -> Known.STN
                SVC -> Known.SVC
                SZL -> Known.SZL
                THB -> Known.THB
                TND -> Known.TND
                TOP -> Known.TOP
                TRY -> Known.TRY
                TTD -> Known.TTD
                TWD -> Known.TWD
                TZS -> Known.TZS
                UAH -> Known.UAH
                UGX -> Known.UGX
                USD -> Known.USD
                UYU -> Known.UYU
                UZS -> Known.UZS
                VES -> Known.VES
                VND -> Known.VND
                VUV -> Known.VUV
                WST -> Known.WST
                XAF -> Known.XAF
                XCD -> Known.XCD
                XOF -> Known.XOF
                XPF -> Known.XPF
                YER -> Known.YER
                ZAR -> Known.ZAR
                ZMW -> Known.ZMW
                else -> throw DodoPaymentsInvalidDataException("Unknown Currency: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Subscription && billing == other.billing && createdAt == other.createdAt && currency == other.currency && customer == other.customer && metadata == other.metadata && nextBillingDate == other.nextBillingDate && paymentFrequencyCount == other.paymentFrequencyCount && paymentFrequencyInterval == other.paymentFrequencyInterval && productId == other.productId && quantity == other.quantity && recurringPreTaxAmount == other.recurringPreTaxAmount && status == other.status && subscriptionId == other.subscriptionId && subscriptionPeriodCount == other.subscriptionPeriodCount && subscriptionPeriodInterval == other.subscriptionPeriodInterval && taxInclusive == other.taxInclusive && trialPeriodDays == other.trialPeriodDays && cancelledAt == other.cancelledAt && discountId == other.discountId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(billing, createdAt, currency, customer, metadata, nextBillingDate, paymentFrequencyCount, paymentFrequencyInterval, productId, quantity, recurringPreTaxAmount, status, subscriptionId, subscriptionPeriodCount, subscriptionPeriodInterval, taxInclusive, trialPeriodDays, cancelledAt, discountId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{billing=$billing, createdAt=$createdAt, currency=$currency, customer=$customer, metadata=$metadata, nextBillingDate=$nextBillingDate, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, productId=$productId, quantity=$quantity, recurringPreTaxAmount=$recurringPreTaxAmount, status=$status, subscriptionId=$subscriptionId, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, taxInclusive=$taxInclusive, trialPeriodDays=$trialPeriodDays, cancelledAt=$cancelledAt, discountId=$discountId, additionalProperties=$additionalProperties}"
}
