// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.refunds.Refund
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Payment
@JsonCreator
private constructor(
    @JsonProperty("business_id")
    @ExcludeMissing
    private val businessId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
    @JsonProperty("disputes")
    @ExcludeMissing
    private val disputes: JsonField<List<Dispute>> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("payment_id")
    @ExcludeMissing
    private val paymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("refunds")
    @ExcludeMissing
    private val refunds: JsonField<List<Refund>> = JsonMissing.of(),
    @JsonProperty("total_amount")
    @ExcludeMissing
    private val totalAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("discount_id")
    @ExcludeMissing
    private val discountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("error_message")
    @ExcludeMissing
    private val errorMessage: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_link")
    @ExcludeMissing
    private val paymentLink: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_method")
    @ExcludeMissing
    private val paymentMethod: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_method_type")
    @ExcludeMissing
    private val paymentMethodType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("product_cart")
    @ExcludeMissing
    private val productCart: JsonField<List<ProductCart>> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<IntentStatus> = JsonMissing.of(),
    @JsonProperty("subscription_id")
    @ExcludeMissing
    private val subscriptionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tax") @ExcludeMissing private val tax: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Identifier of the business associated with the payment */
    fun businessId(): String = businessId.getRequired("business_id")

    /** Timestamp when the payment was created */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun currency(): Currency = currency.getRequired("currency")

    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    /** List of disputes associated with this payment */
    fun disputes(): List<Dispute> = disputes.getRequired("disputes")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** Unique identifier for the payment */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /** List of refunds issued for this payment */
    fun refunds(): List<Refund> = refunds.getRequired("refunds")

    /**
     * Total amount charged to the customer including tax, in smallest currency unit (e.g. cents)
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /** The discount id if discount is applied */
    fun discountId(): String? = discountId.getNullable("discount_id")

    /** An error message if the payment failed */
    fun errorMessage(): String? = errorMessage.getNullable("error_message")

    /** Checkout URL */
    fun paymentLink(): String? = paymentLink.getNullable("payment_link")

    /** Payment method used by customer (e.g. "card", "bank_transfer") */
    fun paymentMethod(): String? = paymentMethod.getNullable("payment_method")

    /** Specific type of payment method (e.g. "visa", "mastercard") */
    fun paymentMethodType(): String? = paymentMethodType.getNullable("payment_method_type")

    /** List of products purchased in a one-time payment */
    fun productCart(): List<ProductCart>? = productCart.getNullable("product_cart")

    fun status(): IntentStatus? = status.getNullable("status")

    /** Identifier of the subscription if payment is part of a subscription */
    fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

    /** Amount of tax collected in smallest currency unit (e.g. cents) */
    fun tax(): Long? = tax.getNullable("tax")

    /** Timestamp when the payment was last updated */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /** Identifier of the business associated with the payment */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /** Timestamp when the payment was created */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerLimitedDetails> = customer

    /** List of disputes associated with this payment */
    @JsonProperty("disputes") @ExcludeMissing fun _disputes(): JsonField<List<Dispute>> = disputes

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** Unique identifier for the payment */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /** List of refunds issued for this payment */
    @JsonProperty("refunds") @ExcludeMissing fun _refunds(): JsonField<List<Refund>> = refunds

    /**
     * Total amount charged to the customer including tax, in smallest currency unit (e.g. cents)
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Long> = totalAmount

    /** The discount id if discount is applied */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /** An error message if the payment failed */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /** Checkout URL */
    @JsonProperty("payment_link")
    @ExcludeMissing
    fun _paymentLink(): JsonField<String> = paymentLink

    /** Payment method used by customer (e.g. "card", "bank_transfer") */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<String> = paymentMethod

    /** Specific type of payment method (e.g. "visa", "mastercard") */
    @JsonProperty("payment_method_type")
    @ExcludeMissing
    fun _paymentMethodType(): JsonField<String> = paymentMethodType

    /** List of products purchased in a one-time payment */
    @JsonProperty("product_cart")
    @ExcludeMissing
    fun _productCart(): JsonField<List<ProductCart>> = productCart

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IntentStatus> = status

    /** Identifier of the subscription if payment is part of a subscription */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /** Amount of tax collected in smallest currency unit (e.g. cents) */
    @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Long> = tax

    /** Timestamp when the payment was last updated */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Payment = apply {
        if (validated) {
            return@apply
        }

        businessId()
        createdAt()
        currency()
        customer().validate()
        disputes().forEach { it.validate() }
        metadata().validate()
        paymentId()
        refunds().forEach { it.validate() }
        totalAmount()
        discountId()
        errorMessage()
        paymentLink()
        paymentMethod()
        paymentMethodType()
        productCart()?.forEach { it.validate() }
        status()
        subscriptionId()
        tax()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Payment].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .createdAt()
         * .currency()
         * .customer()
         * .disputes()
         * .metadata()
         * .paymentId()
         * .refunds()
         * .totalAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Payment]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var disputes: JsonField<MutableList<Dispute>>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var refunds: JsonField<MutableList<Refund>>? = null
        private var totalAmount: JsonField<Long>? = null
        private var discountId: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var paymentMethod: JsonField<String> = JsonMissing.of()
        private var paymentMethodType: JsonField<String> = JsonMissing.of()
        private var productCart: JsonField<MutableList<ProductCart>>? = null
        private var status: JsonField<IntentStatus> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var tax: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payment: Payment) = apply {
            businessId = payment.businessId
            createdAt = payment.createdAt
            currency = payment.currency
            customer = payment.customer
            disputes = payment.disputes.map { it.toMutableList() }
            metadata = payment.metadata
            paymentId = payment.paymentId
            refunds = payment.refunds.map { it.toMutableList() }
            totalAmount = payment.totalAmount
            discountId = payment.discountId
            errorMessage = payment.errorMessage
            paymentLink = payment.paymentLink
            paymentMethod = payment.paymentMethod
            paymentMethodType = payment.paymentMethodType
            productCart = payment.productCart.map { it.toMutableList() }
            status = payment.status
            subscriptionId = payment.subscriptionId
            tax = payment.tax
            updatedAt = payment.updatedAt
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        /** Identifier of the business associated with the payment */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /** Identifier of the business associated with the payment */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Timestamp when the payment was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** Timestamp when the payment was created */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
            this.customer = customer
        }

        /** List of disputes associated with this payment */
        fun disputes(disputes: List<Dispute>) = disputes(JsonField.of(disputes))

        /** List of disputes associated with this payment */
        fun disputes(disputes: JsonField<List<Dispute>>) = apply {
            this.disputes = disputes.map { it.toMutableList() }
        }

        /** List of disputes associated with this payment */
        fun addDispute(dispute: Dispute) = apply {
            disputes =
                (disputes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("disputes", it).add(dispute)
                }
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Unique identifier for the payment */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /** Unique identifier for the payment */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** List of refunds issued for this payment */
        fun refunds(refunds: List<Refund>) = refunds(JsonField.of(refunds))

        /** List of refunds issued for this payment */
        fun refunds(refunds: JsonField<List<Refund>>) = apply {
            this.refunds = refunds.map { it.toMutableList() }
        }

        /** List of refunds issued for this payment */
        fun addRefund(refund: Refund) = apply {
            refunds =
                (refunds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("refunds", it).add(refund)
                }
        }

        /**
         * Total amount charged to the customer including tax, in smallest currency unit (e.g.
         * cents)
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * Total amount charged to the customer including tax, in smallest currency unit (e.g.
         * cents)
         */
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** The discount id if discount is applied */
        fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

        /** The discount id if discount is applied */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** An error message if the payment failed */
        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /** An error message if the payment failed */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** Checkout URL */
        fun paymentLink(paymentLink: String?) = paymentLink(JsonField.ofNullable(paymentLink))

        /** Checkout URL */
        fun paymentLink(paymentLink: JsonField<String>) = apply { this.paymentLink = paymentLink }

        /** Payment method used by customer (e.g. "card", "bank_transfer") */
        fun paymentMethod(paymentMethod: String?) =
            paymentMethod(JsonField.ofNullable(paymentMethod))

        /** Payment method used by customer (e.g. "card", "bank_transfer") */
        fun paymentMethod(paymentMethod: JsonField<String>) = apply {
            this.paymentMethod = paymentMethod
        }

        /** Specific type of payment method (e.g. "visa", "mastercard") */
        fun paymentMethodType(paymentMethodType: String?) =
            paymentMethodType(JsonField.ofNullable(paymentMethodType))

        /** Specific type of payment method (e.g. "visa", "mastercard") */
        fun paymentMethodType(paymentMethodType: JsonField<String>) = apply {
            this.paymentMethodType = paymentMethodType
        }

        /** List of products purchased in a one-time payment */
        fun productCart(productCart: List<ProductCart>?) =
            productCart(JsonField.ofNullable(productCart))

        /** List of products purchased in a one-time payment */
        fun productCart(productCart: JsonField<List<ProductCart>>) = apply {
            this.productCart = productCart.map { it.toMutableList() }
        }

        /** List of products purchased in a one-time payment */
        fun addProductCart(productCart: ProductCart) = apply {
            this.productCart =
                (this.productCart ?: JsonField.of(mutableListOf())).also {
                    checkKnown("productCart", it).add(productCart)
                }
        }

        fun status(status: IntentStatus?) = status(JsonField.ofNullable(status))

        fun status(status: JsonField<IntentStatus>) = apply { this.status = status }

        /** Identifier of the subscription if payment is part of a subscription */
        fun subscriptionId(subscriptionId: String?) =
            subscriptionId(JsonField.ofNullable(subscriptionId))

        /** Identifier of the subscription if payment is part of a subscription */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

        /** Amount of tax collected in smallest currency unit (e.g. cents) */
        fun tax(tax: Long?) = tax(JsonField.ofNullable(tax))

        /** Amount of tax collected in smallest currency unit (e.g. cents) */
        fun tax(tax: Long) = tax(tax as Long?)

        /** Amount of tax collected in smallest currency unit (e.g. cents) */
        fun tax(tax: JsonField<Long>) = apply { this.tax = tax }

        /** Timestamp when the payment was last updated */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Timestamp when the payment was last updated */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): Payment =
            Payment(
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("disputes", disputes).map { it.toImmutable() },
                checkRequired("metadata", metadata),
                checkRequired("paymentId", paymentId),
                checkRequired("refunds", refunds).map { it.toImmutable() },
                checkRequired("totalAmount", totalAmount),
                discountId,
                errorMessage,
                paymentLink,
                paymentMethod,
                paymentMethodType,
                (productCart ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                subscriptionId,
                tax,
                updatedAt,
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

    @NoAutoDetect
    class ProductCart
    @JsonCreator
    private constructor(
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun productId(): String = productId.getRequired("product_id")

        fun quantity(): Long = quantity.getRequired("quantity")

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ProductCart = apply {
            if (validated) {
                return@apply
            }

            productId()
            quantity()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ProductCart].
             *
             * The following fields are required:
             * ```kotlin
             * .productId()
             * .quantity()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ProductCart]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(productCart: ProductCart) = apply {
                productId = productCart.productId
                quantity = productCart.quantity
                additionalProperties = productCart.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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

            fun build(): ProductCart =
                ProductCart(
                    checkRequired("productId", productId),
                    checkRequired("quantity", quantity),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProductCart && productId == other.productId && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, quantity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductCart{productId=$productId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Payment && businessId == other.businessId && createdAt == other.createdAt && currency == other.currency && customer == other.customer && disputes == other.disputes && metadata == other.metadata && paymentId == other.paymentId && refunds == other.refunds && totalAmount == other.totalAmount && discountId == other.discountId && errorMessage == other.errorMessage && paymentLink == other.paymentLink && paymentMethod == other.paymentMethod && paymentMethodType == other.paymentMethodType && productCart == other.productCart && status == other.status && subscriptionId == other.subscriptionId && tax == other.tax && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(businessId, createdAt, currency, customer, disputes, metadata, paymentId, refunds, totalAmount, discountId, errorMessage, paymentLink, paymentMethod, paymentMethodType, productCart, status, subscriptionId, tax, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{businessId=$businessId, createdAt=$createdAt, currency=$currency, customer=$customer, disputes=$disputes, metadata=$metadata, paymentId=$paymentId, refunds=$refunds, totalAmount=$totalAmount, discountId=$discountId, errorMessage=$errorMessage, paymentLink=$paymentLink, paymentMethod=$paymentMethod, paymentMethodType=$paymentMethodType, productCart=$productCart, status=$status, subscriptionId=$subscriptionId, tax=$tax, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
