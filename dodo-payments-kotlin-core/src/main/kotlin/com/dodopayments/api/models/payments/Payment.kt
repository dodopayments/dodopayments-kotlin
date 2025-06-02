// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.refunds.Refund
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Payment
private constructor(
    private val billing: JsonField<BillingAddress>,
    private val brandId: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val customer: JsonField<CustomerLimitedDetails>,
    private val disputes: JsonField<List<Dispute>>,
    private val metadata: JsonField<Metadata>,
    private val paymentId: JsonField<String>,
    private val refunds: JsonField<List<Refund>>,
    private val settlementAmount: JsonField<Int>,
    private val settlementCurrency: JsonField<Currency>,
    private val totalAmount: JsonField<Int>,
    private val cardIssuingCountry: JsonField<CountryCode>,
    private val cardLastFour: JsonField<String>,
    private val cardNetwork: JsonField<String>,
    private val cardType: JsonField<String>,
    private val discountId: JsonField<String>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val paymentLink: JsonField<String>,
    private val paymentMethod: JsonField<String>,
    private val paymentMethodType: JsonField<String>,
    private val productCart: JsonField<List<ProductCart>>,
    private val settlementTax: JsonField<Int>,
    private val status: JsonField<IntentStatus>,
    private val subscriptionId: JsonField<String>,
    private val tax: JsonField<Int>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("billing")
        @ExcludeMissing
        billing: JsonField<BillingAddress> = JsonMissing.of(),
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
        @JsonProperty("disputes")
        @ExcludeMissing
        disputes: JsonField<List<Dispute>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refunds")
        @ExcludeMissing
        refunds: JsonField<List<Refund>> = JsonMissing.of(),
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        settlementAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        settlementCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        totalAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("card_issuing_country")
        @ExcludeMissing
        cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of(),
        @JsonProperty("card_last_four")
        @ExcludeMissing
        cardLastFour: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_network")
        @ExcludeMissing
        cardNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_type") @ExcludeMissing cardType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_code") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_link")
        @ExcludeMissing
        paymentLink: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_method_type")
        @ExcludeMissing
        paymentMethodType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_cart")
        @ExcludeMissing
        productCart: JsonField<List<ProductCart>> = JsonMissing.of(),
        @JsonProperty("settlement_tax")
        @ExcludeMissing
        settlementTax: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<IntentStatus> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        billing,
        brandId,
        businessId,
        createdAt,
        currency,
        customer,
        disputes,
        metadata,
        paymentId,
        refunds,
        settlementAmount,
        settlementCurrency,
        totalAmount,
        cardIssuingCountry,
        cardLastFour,
        cardNetwork,
        cardType,
        discountId,
        errorCode,
        errorMessage,
        paymentLink,
        paymentMethod,
        paymentMethodType,
        productCart,
        settlementTax,
        status,
        subscriptionId,
        tax,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billing(): BillingAddress = billing.getRequired("billing")

    /**
     * brand id this payment belongs to
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
     * Identifier of the business associated with the payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Timestamp when the payment was created
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    /**
     * List of disputes associated with this payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputes(): List<Dispute> = disputes.getRequired("disputes")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Unique identifier for the payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * List of refunds issued for this payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun refunds(): List<Refund> = refunds.getRequired("refunds")

    /**
     * The amount that will be credited to your Dodo balance after currency conversion and
     * processing. Especially relevant for adaptive pricing where the customer's payment currency
     * differs from your settlement currency.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementAmount(): Int = settlementAmount.getRequired("settlement_amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementCurrency(): Currency = settlementCurrency.getRequired("settlement_currency")

    /**
     * Total amount charged to the customer including tax, in smallest currency unit (e.g. cents)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalAmount(): Int = totalAmount.getRequired("total_amount")

    /**
     * ISO country code alpha2 variant
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardIssuingCountry(): CountryCode? = cardIssuingCountry.getNullable("card_issuing_country")

    /**
     * The last four digits of the card
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardLastFour(): String? = cardLastFour.getNullable("card_last_four")

    /**
     * Card network like VISA, MASTERCARD etc.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardNetwork(): String? = cardNetwork.getNullable("card_network")

    /**
     * The type of card DEBIT or CREDIT
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardType(): String? = cardType.getNullable("card_type")

    /**
     * The discount id if discount is applied
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountId(): String? = discountId.getNullable("discount_id")

    /**
     * An error code if the payment failed
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun errorCode(): String? = errorCode.getNullable("error_code")

    /**
     * An error message if the payment failed
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun errorMessage(): String? = errorMessage.getNullable("error_message")

    /**
     * Checkout URL
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentLink(): String? = paymentLink.getNullable("payment_link")

    /**
     * Payment method used by customer (e.g. "card", "bank_transfer")
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethod(): String? = paymentMethod.getNullable("payment_method")

    /**
     * Specific type of payment method (e.g. "visa", "mastercard")
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethodType(): String? = paymentMethodType.getNullable("payment_method_type")

    /**
     * List of products purchased in a one-time payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productCart(): List<ProductCart>? = productCart.getNullable("product_cart")

    /**
     * This represents the portion of settlement_amount that corresponds to taxes collected.
     * Especially relevant for adaptive pricing where the tax component must be tracked separately
     * in your Dodo balance.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settlementTax(): Int? = settlementTax.getNullable("settlement_tax")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): IntentStatus? = status.getNullable("status")

    /**
     * Identifier of the subscription if payment is part of a subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

    /**
     * Amount of tax collected in smallest currency unit (e.g. cents)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tax(): Int? = tax.getNullable("tax")

    /**
     * Timestamp when the payment was last updated
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

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
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

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
     * Returns the raw JSON value of [disputes].
     *
     * Unlike [disputes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disputes") @ExcludeMissing fun _disputes(): JsonField<List<Dispute>> = disputes

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [refunds].
     *
     * Unlike [refunds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refunds") @ExcludeMissing fun _refunds(): JsonField<List<Refund>> = refunds

    /**
     * Returns the raw JSON value of [settlementAmount].
     *
     * Unlike [settlementAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_amount")
    @ExcludeMissing
    fun _settlementAmount(): JsonField<Int> = settlementAmount

    /**
     * Returns the raw JSON value of [settlementCurrency].
     *
     * Unlike [settlementCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_currency")
    @ExcludeMissing
    fun _settlementCurrency(): JsonField<Currency> = settlementCurrency

    /**
     * Returns the raw JSON value of [totalAmount].
     *
     * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Int> = totalAmount

    /**
     * Returns the raw JSON value of [cardIssuingCountry].
     *
     * Unlike [cardIssuingCountry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("card_issuing_country")
    @ExcludeMissing
    fun _cardIssuingCountry(): JsonField<CountryCode> = cardIssuingCountry

    /**
     * Returns the raw JSON value of [cardLastFour].
     *
     * Unlike [cardLastFour], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_last_four")
    @ExcludeMissing
    fun _cardLastFour(): JsonField<String> = cardLastFour

    /**
     * Returns the raw JSON value of [cardNetwork].
     *
     * Unlike [cardNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_network")
    @ExcludeMissing
    fun _cardNetwork(): JsonField<String> = cardNetwork

    /**
     * Returns the raw JSON value of [cardType].
     *
     * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_type") @ExcludeMissing fun _cardType(): JsonField<String> = cardType

    /**
     * Returns the raw JSON value of [discountId].
     *
     * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /**
     * Returns the raw JSON value of [errorCode].
     *
     * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [paymentLink].
     *
     * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_link")
    @ExcludeMissing
    fun _paymentLink(): JsonField<String> = paymentLink

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<String> = paymentMethod

    /**
     * Returns the raw JSON value of [paymentMethodType].
     *
     * Unlike [paymentMethodType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_method_type")
    @ExcludeMissing
    fun _paymentMethodType(): JsonField<String> = paymentMethodType

    /**
     * Returns the raw JSON value of [productCart].
     *
     * Unlike [productCart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_cart")
    @ExcludeMissing
    fun _productCart(): JsonField<List<ProductCart>> = productCart

    /**
     * Returns the raw JSON value of [settlementTax].
     *
     * Unlike [settlementTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settlement_tax")
    @ExcludeMissing
    fun _settlementTax(): JsonField<Int> = settlementTax

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IntentStatus> = status

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [tax].
     *
     * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [Payment].
         *
         * The following fields are required:
         * ```kotlin
         * .billing()
         * .brandId()
         * .businessId()
         * .createdAt()
         * .currency()
         * .customer()
         * .disputes()
         * .metadata()
         * .paymentId()
         * .refunds()
         * .settlementAmount()
         * .settlementCurrency()
         * .totalAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Payment]. */
    class Builder internal constructor() {

        private var billing: JsonField<BillingAddress>? = null
        private var brandId: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var disputes: JsonField<MutableList<Dispute>>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var refunds: JsonField<MutableList<Refund>>? = null
        private var settlementAmount: JsonField<Int>? = null
        private var settlementCurrency: JsonField<Currency>? = null
        private var totalAmount: JsonField<Int>? = null
        private var cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of()
        private var cardLastFour: JsonField<String> = JsonMissing.of()
        private var cardNetwork: JsonField<String> = JsonMissing.of()
        private var cardType: JsonField<String> = JsonMissing.of()
        private var discountId: JsonField<String> = JsonMissing.of()
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var paymentMethod: JsonField<String> = JsonMissing.of()
        private var paymentMethodType: JsonField<String> = JsonMissing.of()
        private var productCart: JsonField<MutableList<ProductCart>>? = null
        private var settlementTax: JsonField<Int> = JsonMissing.of()
        private var status: JsonField<IntentStatus> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var tax: JsonField<Int> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payment: Payment) = apply {
            billing = payment.billing
            brandId = payment.brandId
            businessId = payment.businessId
            createdAt = payment.createdAt
            currency = payment.currency
            customer = payment.customer
            disputes = payment.disputes.map { it.toMutableList() }
            metadata = payment.metadata
            paymentId = payment.paymentId
            refunds = payment.refunds.map { it.toMutableList() }
            settlementAmount = payment.settlementAmount
            settlementCurrency = payment.settlementCurrency
            totalAmount = payment.totalAmount
            cardIssuingCountry = payment.cardIssuingCountry
            cardLastFour = payment.cardLastFour
            cardNetwork = payment.cardNetwork
            cardType = payment.cardType
            discountId = payment.discountId
            errorCode = payment.errorCode
            errorMessage = payment.errorMessage
            paymentLink = payment.paymentLink
            paymentMethod = payment.paymentMethod
            paymentMethodType = payment.paymentMethodType
            productCart = payment.productCart.map { it.toMutableList() }
            settlementTax = payment.settlementTax
            status = payment.status
            subscriptionId = payment.subscriptionId
            tax = payment.tax
            updatedAt = payment.updatedAt
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        fun billing(billing: BillingAddress) = billing(JsonField.of(billing))

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

        /** brand id this payment belongs to */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /** Identifier of the business associated with the payment */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Timestamp when the payment was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

        /** List of disputes associated with this payment */
        fun disputes(disputes: List<Dispute>) = disputes(JsonField.of(disputes))

        /**
         * Sets [Builder.disputes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputes] with a well-typed `List<Dispute>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disputes(disputes: JsonField<List<Dispute>>) = apply {
            this.disputes = disputes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Dispute] to [disputes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDispute(dispute: Dispute) = apply {
            disputes =
                (disputes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("disputes", it).add(dispute)
                }
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Unique identifier for the payment */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** List of refunds issued for this payment */
        fun refunds(refunds: List<Refund>) = refunds(JsonField.of(refunds))

        /**
         * Sets [Builder.refunds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refunds] with a well-typed `List<Refund>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refunds(refunds: JsonField<List<Refund>>) = apply {
            this.refunds = refunds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Refund] to [refunds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRefund(refund: Refund) = apply {
            refunds =
                (refunds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("refunds", it).add(refund)
                }
        }

        /**
         * The amount that will be credited to your Dodo balance after currency conversion and
         * processing. Especially relevant for adaptive pricing where the customer's payment
         * currency differs from your settlement currency.
         */
        fun settlementAmount(settlementAmount: Int) =
            settlementAmount(JsonField.of(settlementAmount))

        /**
         * Sets [Builder.settlementAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementAmount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settlementAmount(settlementAmount: JsonField<Int>) = apply {
            this.settlementAmount = settlementAmount
        }

        fun settlementCurrency(settlementCurrency: Currency) =
            settlementCurrency(JsonField.of(settlementCurrency))

        /**
         * Sets [Builder.settlementCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementCurrency(settlementCurrency: JsonField<Currency>) = apply {
            this.settlementCurrency = settlementCurrency
        }

        /**
         * Total amount charged to the customer including tax, in smallest currency unit (e.g.
         * cents)
         */
        fun totalAmount(totalAmount: Int) = totalAmount(JsonField.of(totalAmount))

        /**
         * Sets [Builder.totalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalAmount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalAmount(totalAmount: JsonField<Int>) = apply { this.totalAmount = totalAmount }

        /** ISO country code alpha2 variant */
        fun cardIssuingCountry(cardIssuingCountry: CountryCode?) =
            cardIssuingCountry(JsonField.ofNullable(cardIssuingCountry))

        /**
         * Sets [Builder.cardIssuingCountry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardIssuingCountry] with a well-typed [CountryCode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cardIssuingCountry(cardIssuingCountry: JsonField<CountryCode>) = apply {
            this.cardIssuingCountry = cardIssuingCountry
        }

        /** The last four digits of the card */
        fun cardLastFour(cardLastFour: String?) = cardLastFour(JsonField.ofNullable(cardLastFour))

        /**
         * Sets [Builder.cardLastFour] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardLastFour] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardLastFour(cardLastFour: JsonField<String>) = apply {
            this.cardLastFour = cardLastFour
        }

        /** Card network like VISA, MASTERCARD etc. */
        fun cardNetwork(cardNetwork: String?) = cardNetwork(JsonField.ofNullable(cardNetwork))

        /**
         * Sets [Builder.cardNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardNetwork(cardNetwork: JsonField<String>) = apply { this.cardNetwork = cardNetwork }

        /** The type of card DEBIT or CREDIT */
        fun cardType(cardType: String?) = cardType(JsonField.ofNullable(cardType))

        /**
         * Sets [Builder.cardType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardType(cardType: JsonField<String>) = apply { this.cardType = cardType }

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

        /** An error code if the payment failed */
        fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

        /**
         * Sets [Builder.errorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

        /** An error message if the payment failed */
        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** Checkout URL */
        fun paymentLink(paymentLink: String?) = paymentLink(JsonField.ofNullable(paymentLink))

        /**
         * Sets [Builder.paymentLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentLink] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentLink(paymentLink: JsonField<String>) = apply { this.paymentLink = paymentLink }

        /** Payment method used by customer (e.g. "card", "bank_transfer") */
        fun paymentMethod(paymentMethod: String?) =
            paymentMethod(JsonField.ofNullable(paymentMethod))

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentMethod(paymentMethod: JsonField<String>) = apply {
            this.paymentMethod = paymentMethod
        }

        /** Specific type of payment method (e.g. "visa", "mastercard") */
        fun paymentMethodType(paymentMethodType: String?) =
            paymentMethodType(JsonField.ofNullable(paymentMethodType))

        /**
         * Sets [Builder.paymentMethodType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethodType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentMethodType(paymentMethodType: JsonField<String>) = apply {
            this.paymentMethodType = paymentMethodType
        }

        /** List of products purchased in a one-time payment */
        fun productCart(productCart: List<ProductCart>?) =
            productCart(JsonField.ofNullable(productCart))

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

        /**
         * This represents the portion of settlement_amount that corresponds to taxes collected.
         * Especially relevant for adaptive pricing where the tax component must be tracked
         * separately in your Dodo balance.
         */
        fun settlementTax(settlementTax: Int?) = settlementTax(JsonField.ofNullable(settlementTax))

        /**
         * Alias for [Builder.settlementTax].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun settlementTax(settlementTax: Int) = settlementTax(settlementTax as Int?)

        /**
         * Sets [Builder.settlementTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementTax] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settlementTax(settlementTax: JsonField<Int>) = apply {
            this.settlementTax = settlementTax
        }

        fun status(status: IntentStatus?) = status(JsonField.ofNullable(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [IntentStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<IntentStatus>) = apply { this.status = status }

        /** Identifier of the subscription if payment is part of a subscription */
        fun subscriptionId(subscriptionId: String?) =
            subscriptionId(JsonField.ofNullable(subscriptionId))

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

        /** Amount of tax collected in smallest currency unit (e.g. cents) */
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
         * You should usually call [Builder.tax] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

        /** Timestamp when the payment was last updated */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [Payment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .billing()
         * .brandId()
         * .businessId()
         * .createdAt()
         * .currency()
         * .customer()
         * .disputes()
         * .metadata()
         * .paymentId()
         * .refunds()
         * .settlementAmount()
         * .settlementCurrency()
         * .totalAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Payment =
            Payment(
                checkRequired("billing", billing),
                checkRequired("brandId", brandId),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("disputes", disputes).map { it.toImmutable() },
                checkRequired("metadata", metadata),
                checkRequired("paymentId", paymentId),
                checkRequired("refunds", refunds).map { it.toImmutable() },
                checkRequired("settlementAmount", settlementAmount),
                checkRequired("settlementCurrency", settlementCurrency),
                checkRequired("totalAmount", totalAmount),
                cardIssuingCountry,
                cardLastFour,
                cardNetwork,
                cardType,
                discountId,
                errorCode,
                errorMessage,
                paymentLink,
                paymentMethod,
                paymentMethodType,
                (productCart ?: JsonMissing.of()).map { it.toImmutable() },
                settlementTax,
                status,
                subscriptionId,
                tax,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Payment = apply {
        if (validated) {
            return@apply
        }

        billing().validate()
        brandId()
        businessId()
        createdAt()
        currency().validate()
        customer().validate()
        disputes().forEach { it.validate() }
        metadata().validate()
        paymentId()
        refunds().forEach { it.validate() }
        settlementAmount()
        settlementCurrency().validate()
        totalAmount()
        cardIssuingCountry()?.validate()
        cardLastFour()
        cardNetwork()
        cardType()
        discountId()
        errorCode()
        errorMessage()
        paymentLink()
        paymentMethod()
        paymentMethodType()
        productCart()?.forEach { it.validate() }
        settlementTax()
        status()?.validate()
        subscriptionId()
        tax()
        updatedAt()
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
        (billing.asKnown()?.validity() ?: 0) +
            (if (brandId.asKnown() == null) 0 else 1) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (customer.asKnown()?.validity() ?: 0) +
            (disputes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (refunds.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (settlementAmount.asKnown() == null) 0 else 1) +
            (settlementCurrency.asKnown()?.validity() ?: 0) +
            (if (totalAmount.asKnown() == null) 0 else 1) +
            (cardIssuingCountry.asKnown()?.validity() ?: 0) +
            (if (cardLastFour.asKnown() == null) 0 else 1) +
            (if (cardNetwork.asKnown() == null) 0 else 1) +
            (if (cardType.asKnown() == null) 0 else 1) +
            (if (discountId.asKnown() == null) 0 else 1) +
            (if (errorCode.asKnown() == null) 0 else 1) +
            (if (errorMessage.asKnown() == null) 0 else 1) +
            (if (paymentLink.asKnown() == null) 0 else 1) +
            (if (paymentMethod.asKnown() == null) 0 else 1) +
            (if (paymentMethodType.asKnown() == null) 0 else 1) +
            (productCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (settlementTax.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (subscriptionId.asKnown() == null) 0 else 1) +
            (if (tax.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ProductCart
    private constructor(
        private val productId: JsonField<String>,
        private val quantity: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        ) : this(productId, quantity, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Int = quantity.getRequired("quantity")

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
             * .productId()
             * .quantity()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ProductCart]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Int>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(productCart: ProductCart) = apply {
                productId = productCart.productId
                quantity = productCart.quantity
                additionalProperties = productCart.additionalProperties.toMutableMap()
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

            fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

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
             * .productId()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ProductCart =
                ProductCart(
                    checkRequired("productId", productId),
                    checkRequired("quantity", quantity),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ProductCart = apply {
            if (validated) {
                return@apply
            }

            productId()
            quantity()
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
            (if (productId.asKnown() == null) 0 else 1) + (if (quantity.asKnown() == null) 0 else 1)

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

        return /* spotless:off */ other is Payment && billing == other.billing && brandId == other.brandId && businessId == other.businessId && createdAt == other.createdAt && currency == other.currency && customer == other.customer && disputes == other.disputes && metadata == other.metadata && paymentId == other.paymentId && refunds == other.refunds && settlementAmount == other.settlementAmount && settlementCurrency == other.settlementCurrency && totalAmount == other.totalAmount && cardIssuingCountry == other.cardIssuingCountry && cardLastFour == other.cardLastFour && cardNetwork == other.cardNetwork && cardType == other.cardType && discountId == other.discountId && errorCode == other.errorCode && errorMessage == other.errorMessage && paymentLink == other.paymentLink && paymentMethod == other.paymentMethod && paymentMethodType == other.paymentMethodType && productCart == other.productCart && settlementTax == other.settlementTax && status == other.status && subscriptionId == other.subscriptionId && tax == other.tax && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(billing, brandId, businessId, createdAt, currency, customer, disputes, metadata, paymentId, refunds, settlementAmount, settlementCurrency, totalAmount, cardIssuingCountry, cardLastFour, cardNetwork, cardType, discountId, errorCode, errorMessage, paymentLink, paymentMethod, paymentMethodType, productCart, settlementTax, status, subscriptionId, tax, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{billing=$billing, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, currency=$currency, customer=$customer, disputes=$disputes, metadata=$metadata, paymentId=$paymentId, refunds=$refunds, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, totalAmount=$totalAmount, cardIssuingCountry=$cardIssuingCountry, cardLastFour=$cardLastFour, cardNetwork=$cardNetwork, cardType=$cardType, discountId=$discountId, errorCode=$errorCode, errorMessage=$errorMessage, paymentLink=$paymentLink, paymentMethod=$paymentMethod, paymentMethodType=$paymentMethodType, productCart=$productCart, settlementTax=$settlementTax, status=$status, subscriptionId=$subscriptionId, tax=$tax, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
