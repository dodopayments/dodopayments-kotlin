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
import com.dodopayments.api.models.discounts.DiscountType
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Payment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val billing: JsonField<BillingAddress>,
    private val brandId: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val customer: JsonField<CustomerLimitedDetails>,
    private val digitalProductsDelivered: JsonField<Boolean>,
    private val disputes: JsonField<List<Dispute>>,
    private val metadata: JsonField<Metadata>,
    private val paymentId: JsonField<String>,
    private val refunds: JsonField<List<RefundListItem>>,
    private val settlementAmount: JsonField<Int>,
    private val settlementCurrency: JsonField<Currency>,
    private val totalAmount: JsonField<Int>,
    private val cardHolderName: JsonField<String>,
    private val cardIssuingCountry: JsonField<CountryCode>,
    private val cardLastFour: JsonField<String>,
    private val cardNetwork: JsonField<String>,
    private val cardType: JsonField<String>,
    private val checkoutSessionId: JsonField<String>,
    private val customFieldResponses: JsonField<List<CustomFieldResponse>>,
    private val discountId: JsonField<String>,
    private val discounts: JsonField<List<Discount>>,
    private val errorCode: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val invoiceId: JsonField<String>,
    private val invoiceUrl: JsonField<String>,
    private val paymentLink: JsonField<String>,
    private val paymentMethod: JsonField<String>,
    private val paymentMethodType: JsonField<String>,
    private val productCart: JsonField<List<ProductCart>>,
    private val refundStatus: JsonField<PaymentRefundStatus>,
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
        @JsonProperty("digital_products_delivered")
        @ExcludeMissing
        digitalProductsDelivered: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("disputes")
        @ExcludeMissing
        disputes: JsonField<List<Dispute>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refunds")
        @ExcludeMissing
        refunds: JsonField<List<RefundListItem>> = JsonMissing.of(),
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        settlementAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        settlementCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        totalAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("card_holder_name")
        @ExcludeMissing
        cardHolderName: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("checkout_session_id")
        @ExcludeMissing
        checkoutSessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_field_responses")
        @ExcludeMissing
        customFieldResponses: JsonField<List<CustomFieldResponse>> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discounts")
        @ExcludeMissing
        discounts: JsonField<List<Discount>> = JsonMissing.of(),
        @JsonProperty("error_code") @ExcludeMissing errorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_url")
        @ExcludeMissing
        invoiceUrl: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("refund_status")
        @ExcludeMissing
        refundStatus: JsonField<PaymentRefundStatus> = JsonMissing.of(),
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
        digitalProductsDelivered,
        disputes,
        metadata,
        paymentId,
        refunds,
        settlementAmount,
        settlementCurrency,
        totalAmount,
        cardHolderName,
        cardIssuingCountry,
        cardLastFour,
        cardNetwork,
        cardType,
        checkoutSessionId,
        customFieldResponses,
        discountId,
        discounts,
        errorCode,
        errorMessage,
        invoiceId,
        invoiceUrl,
        paymentLink,
        paymentMethod,
        paymentMethodType,
        productCart,
        refundStatus,
        settlementTax,
        status,
        subscriptionId,
        tax,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Billing address details for payments
     *
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
     * Currency used for the payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Details about the customer who made the payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    /**
     * brand id this payment belongs to
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun digitalProductsDelivered(): Boolean =
        digitalProductsDelivered.getRequired("digital_products_delivered")

    /**
     * List of disputes associated with this payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputes(): List<Dispute> = disputes.getRequired("disputes")

    /**
     * Additional custom data associated with the payment
     *
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
    fun refunds(): List<RefundListItem> = refunds.getRequired("refunds")

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
     * The currency in which the settlement_amount will be credited to your Dodo balance. This may
     * differ from the customer's payment currency in adaptive pricing scenarios.
     *
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
     * Cardholder name
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardHolderName(): String? = cardHolderName.getNullable("card_holder_name")

    /**
     * ISO2 country code of the card
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
     * If payment is made using a checkout session, this field is set to the id of the session.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun checkoutSessionId(): String? = checkoutSessionId.getNullable("checkout_session_id")

    /**
     * Customer's responses to custom fields collected during checkout
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customFieldResponses(): List<CustomFieldResponse>? =
        customFieldResponses.getNullable("custom_field_responses")

    /**
     * DEPRECATED: Use discounts instead. Returns the first discount's ID if present.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("Use `discounts` instead.")
    fun discountId(): String? = discountId.getNullable("discount_id")

    /**
     * All stacked discounts applied, ordered by position
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discounts(): List<Discount>? = discounts.getNullable("discounts")

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
     * Invoice ID for this payment. Uses India-specific invoice ID if available.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun invoiceId(): String? = invoiceId.getNullable("invoice_id")

    /**
     * URL to download the invoice PDF for this payment.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun invoiceUrl(): String? = invoiceUrl.getNullable("invoice_url")

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
     * Summary of the refund status for this payment. None if no succeeded refunds exist.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun refundStatus(): PaymentRefundStatus? = refundStatus.getNullable("refund_status")

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
     * Current status of the payment intent
     *
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
     * Returns the raw JSON value of [digitalProductsDelivered].
     *
     * Unlike [digitalProductsDelivered], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("digital_products_delivered")
    @ExcludeMissing
    fun _digitalProductsDelivered(): JsonField<Boolean> = digitalProductsDelivered

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
    @JsonProperty("refunds")
    @ExcludeMissing
    fun _refunds(): JsonField<List<RefundListItem>> = refunds

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
     * Returns the raw JSON value of [cardHolderName].
     *
     * Unlike [cardHolderName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_holder_name")
    @ExcludeMissing
    fun _cardHolderName(): JsonField<String> = cardHolderName

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
     * Returns the raw JSON value of [checkoutSessionId].
     *
     * Unlike [checkoutSessionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("checkout_session_id")
    @ExcludeMissing
    fun _checkoutSessionId(): JsonField<String> = checkoutSessionId

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
     * Returns the raw JSON value of [discountId].
     *
     * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("Use `discounts` instead.")
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
    fun _discounts(): JsonField<List<Discount>> = discounts

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
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [invoiceUrl].
     *
     * Unlike [invoiceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_url") @ExcludeMissing fun _invoiceUrl(): JsonField<String> = invoiceUrl

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
     * Returns the raw JSON value of [refundStatus].
     *
     * Unlike [refundStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refund_status")
    @ExcludeMissing
    fun _refundStatus(): JsonField<PaymentRefundStatus> = refundStatus

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
         * .digitalProductsDelivered()
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
        private var digitalProductsDelivered: JsonField<Boolean>? = null
        private var disputes: JsonField<MutableList<Dispute>>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var refunds: JsonField<MutableList<RefundListItem>>? = null
        private var settlementAmount: JsonField<Int>? = null
        private var settlementCurrency: JsonField<Currency>? = null
        private var totalAmount: JsonField<Int>? = null
        private var cardHolderName: JsonField<String> = JsonMissing.of()
        private var cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of()
        private var cardLastFour: JsonField<String> = JsonMissing.of()
        private var cardNetwork: JsonField<String> = JsonMissing.of()
        private var cardType: JsonField<String> = JsonMissing.of()
        private var checkoutSessionId: JsonField<String> = JsonMissing.of()
        private var customFieldResponses: JsonField<MutableList<CustomFieldResponse>>? = null
        private var discountId: JsonField<String> = JsonMissing.of()
        private var discounts: JsonField<MutableList<Discount>>? = null
        private var errorCode: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var invoiceUrl: JsonField<String> = JsonMissing.of()
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var paymentMethod: JsonField<String> = JsonMissing.of()
        private var paymentMethodType: JsonField<String> = JsonMissing.of()
        private var productCart: JsonField<MutableList<ProductCart>>? = null
        private var refundStatus: JsonField<PaymentRefundStatus> = JsonMissing.of()
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
            digitalProductsDelivered = payment.digitalProductsDelivered
            disputes = payment.disputes.map { it.toMutableList() }
            metadata = payment.metadata
            paymentId = payment.paymentId
            refunds = payment.refunds.map { it.toMutableList() }
            settlementAmount = payment.settlementAmount
            settlementCurrency = payment.settlementCurrency
            totalAmount = payment.totalAmount
            cardHolderName = payment.cardHolderName
            cardIssuingCountry = payment.cardIssuingCountry
            cardLastFour = payment.cardLastFour
            cardNetwork = payment.cardNetwork
            cardType = payment.cardType
            checkoutSessionId = payment.checkoutSessionId
            customFieldResponses = payment.customFieldResponses.map { it.toMutableList() }
            discountId = payment.discountId
            discounts = payment.discounts.map { it.toMutableList() }
            errorCode = payment.errorCode
            errorMessage = payment.errorMessage
            invoiceId = payment.invoiceId
            invoiceUrl = payment.invoiceUrl
            paymentLink = payment.paymentLink
            paymentMethod = payment.paymentMethod
            paymentMethodType = payment.paymentMethodType
            productCart = payment.productCart.map { it.toMutableList() }
            refundStatus = payment.refundStatus
            settlementTax = payment.settlementTax
            status = payment.status
            subscriptionId = payment.subscriptionId
            tax = payment.tax
            updatedAt = payment.updatedAt
            additionalProperties = payment.additionalProperties.toMutableMap()
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

        /** Currency used for the payment */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Details about the customer who made the payment */
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

        /** brand id this payment belongs to */
        fun digitalProductsDelivered(digitalProductsDelivered: Boolean) =
            digitalProductsDelivered(JsonField.of(digitalProductsDelivered))

        /**
         * Sets [Builder.digitalProductsDelivered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalProductsDelivered] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun digitalProductsDelivered(digitalProductsDelivered: JsonField<Boolean>) = apply {
            this.digitalProductsDelivered = digitalProductsDelivered
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

        /** Additional custom data associated with the payment */
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
        fun refunds(refunds: List<RefundListItem>) = refunds(JsonField.of(refunds))

        /**
         * Sets [Builder.refunds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refunds] with a well-typed `List<RefundListItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun refunds(refunds: JsonField<List<RefundListItem>>) = apply {
            this.refunds = refunds.map { it.toMutableList() }
        }

        /**
         * Adds a single [RefundListItem] to [refunds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRefund(refund: RefundListItem) = apply {
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

        /**
         * The currency in which the settlement_amount will be credited to your Dodo balance. This
         * may differ from the customer's payment currency in adaptive pricing scenarios.
         */
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

        /** Cardholder name */
        fun cardHolderName(cardHolderName: String?) =
            cardHolderName(JsonField.ofNullable(cardHolderName))

        /**
         * Sets [Builder.cardHolderName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardHolderName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardHolderName(cardHolderName: JsonField<String>) = apply {
            this.cardHolderName = cardHolderName
        }

        /** ISO2 country code of the card */
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

        /**
         * If payment is made using a checkout session, this field is set to the id of the session.
         */
        fun checkoutSessionId(checkoutSessionId: String?) =
            checkoutSessionId(JsonField.ofNullable(checkoutSessionId))

        /**
         * Sets [Builder.checkoutSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkoutSessionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun checkoutSessionId(checkoutSessionId: JsonField<String>) = apply {
            this.checkoutSessionId = checkoutSessionId
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

        /** DEPRECATED: Use discounts instead. Returns the first discount's ID if present. */
        @Deprecated("Use `discounts` instead.")
        fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

        /**
         * Sets [Builder.discountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("Use `discounts` instead.")
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** All stacked discounts applied, ordered by position */
        fun discounts(discounts: List<Discount>?) = discounts(JsonField.ofNullable(discounts))

        /**
         * Sets [Builder.discounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discounts] with a well-typed `List<Discount>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discounts(discounts: JsonField<List<Discount>>) = apply {
            this.discounts = discounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Discount] to [discounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscount(discount: Discount) = apply {
            discounts =
                (discounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discounts", it).add(discount)
                }
        }

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

        /** Invoice ID for this payment. Uses India-specific invoice ID if available. */
        fun invoiceId(invoiceId: String?) = invoiceId(JsonField.ofNullable(invoiceId))

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /** URL to download the invoice PDF for this payment. */
        fun invoiceUrl(invoiceUrl: String?) = invoiceUrl(JsonField.ofNullable(invoiceUrl))

        /**
         * Sets [Builder.invoiceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceUrl(invoiceUrl: JsonField<String>) = apply { this.invoiceUrl = invoiceUrl }

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

        /** Summary of the refund status for this payment. None if no succeeded refunds exist. */
        fun refundStatus(refundStatus: PaymentRefundStatus?) =
            refundStatus(JsonField.ofNullable(refundStatus))

        /**
         * Sets [Builder.refundStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundStatus] with a well-typed [PaymentRefundStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun refundStatus(refundStatus: JsonField<PaymentRefundStatus>) = apply {
            this.refundStatus = refundStatus
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

        /** Current status of the payment intent */
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
         * .digitalProductsDelivered()
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
                checkRequired("digitalProductsDelivered", digitalProductsDelivered),
                checkRequired("disputes", disputes).map { it.toImmutable() },
                checkRequired("metadata", metadata),
                checkRequired("paymentId", paymentId),
                checkRequired("refunds", refunds).map { it.toImmutable() },
                checkRequired("settlementAmount", settlementAmount),
                checkRequired("settlementCurrency", settlementCurrency),
                checkRequired("totalAmount", totalAmount),
                cardHolderName,
                cardIssuingCountry,
                cardLastFour,
                cardNetwork,
                cardType,
                checkoutSessionId,
                (customFieldResponses ?: JsonMissing.of()).map { it.toImmutable() },
                discountId,
                (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                errorCode,
                errorMessage,
                invoiceId,
                invoiceUrl,
                paymentLink,
                paymentMethod,
                paymentMethodType,
                (productCart ?: JsonMissing.of()).map { it.toImmutable() },
                refundStatus,
                settlementTax,
                status,
                subscriptionId,
                tax,
                updatedAt,
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
        digitalProductsDelivered()
        disputes().forEach { it.validate() }
        metadata().validate()
        paymentId()
        refunds().forEach { it.validate() }
        settlementAmount()
        settlementCurrency().validate()
        totalAmount()
        cardHolderName()
        cardIssuingCountry()?.validate()
        cardLastFour()
        cardNetwork()
        cardType()
        checkoutSessionId()
        customFieldResponses()?.forEach { it.validate() }
        discountId()
        discounts()?.forEach { it.validate() }
        errorCode()
        errorMessage()
        invoiceId()
        invoiceUrl()
        paymentLink()
        paymentMethod()
        paymentMethodType()
        productCart()?.forEach { it.validate() }
        refundStatus()?.validate()
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
            (if (digitalProductsDelivered.asKnown() == null) 0 else 1) +
            (disputes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (refunds.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (settlementAmount.asKnown() == null) 0 else 1) +
            (settlementCurrency.asKnown()?.validity() ?: 0) +
            (if (totalAmount.asKnown() == null) 0 else 1) +
            (if (cardHolderName.asKnown() == null) 0 else 1) +
            (cardIssuingCountry.asKnown()?.validity() ?: 0) +
            (if (cardLastFour.asKnown() == null) 0 else 1) +
            (if (cardNetwork.asKnown() == null) 0 else 1) +
            (if (cardType.asKnown() == null) 0 else 1) +
            (if (checkoutSessionId.asKnown() == null) 0 else 1) +
            (customFieldResponses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (discountId.asKnown() == null) 0 else 1) +
            (discounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (errorCode.asKnown() == null) 0 else 1) +
            (if (errorMessage.asKnown() == null) 0 else 1) +
            (if (invoiceId.asKnown() == null) 0 else 1) +
            (if (invoiceUrl.asKnown() == null) 0 else 1) +
            (if (paymentLink.asKnown() == null) 0 else 1) +
            (if (paymentMethod.asKnown() == null) 0 else 1) +
            (if (paymentMethodType.asKnown() == null) 0 else 1) +
            (productCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (refundStatus.asKnown()?.validity() ?: 0) +
            (if (settlementTax.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (subscriptionId.asKnown() == null) 0 else 1) +
            (if (tax.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /** Additional custom data associated with the payment */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
     * Response struct for a discount with its position in a stack and optional cycle-tracking
     * information (for subscriptions).
     */
    class Discount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Int>,
        private val businessId: JsonField<String>,
        private val code: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val discountId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val position: JsonField<Int>,
        private val preserveOnPlanChange: JsonField<Boolean>,
        private val restrictedTo: JsonField<List<String>>,
        private val timesUsed: JsonField<Int>,
        private val type: JsonField<DiscountType>,
        private val cyclesRemaining: JsonField<Int>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
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
            @JsonProperty("discount_id")
            @ExcludeMissing
            discountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("position") @ExcludeMissing position: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("preserve_on_plan_change")
            @ExcludeMissing
            preserveOnPlanChange: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("restricted_to")
            @ExcludeMissing
            restrictedTo: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("times_used")
            @ExcludeMissing
            timesUsed: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("cycles_remaining")
            @ExcludeMissing
            cyclesRemaining: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscription_cycles")
            @ExcludeMissing
            subscriptionCycles: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("usage_limit")
            @ExcludeMissing
            usageLimit: JsonField<Int> = JsonMissing.of(),
        ) : this(
            amount,
            businessId,
            code,
            createdAt,
            discountId,
            metadata,
            position,
            preserveOnPlanChange,
            restrictedTo,
            timesUsed,
            type,
            cyclesRemaining,
            expiresAt,
            name,
            subscriptionCycles,
            usageLimit,
            mutableMapOf(),
        )

        /**
         * The discount amount (basis points for percentage, USD cents for flat)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Int = amount.getRequired("amount")

        /**
         * The business this discount belongs to
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessId(): String = businessId.getRequired("business_id")

        /**
         * The discount code
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Timestamp when the discount was created
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The unique discount ID
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun discountId(): String = discountId.getRequired("discount_id")

        /**
         * Additional metadata
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * Position of this discount in the stack (0-based)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun position(): Int = position.getRequired("position")

        /**
         * Whether this discount should be preserved when a subscription changes plans
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun preserveOnPlanChange(): Boolean =
            preserveOnPlanChange.getRequired("preserve_on_plan_change")

        /**
         * List of product IDs to which this discount is restricted
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun restrictedTo(): List<String> = restrictedTo.getRequired("restricted_to")

        /**
         * How many times this discount has been used
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timesUsed(): Int = timesUsed.getRequired("times_used")

        /**
         * The type of discount
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): DiscountType = type.getRequired("type")

        /**
         * Remaining billing cycles for this discount on this subscription (None for one-time
         * payments)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cyclesRemaining(): Int? = cyclesRemaining.getNullable("cycles_remaining")

        /**
         * Optional date/time after which discount is expired
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        /**
         * Name for the Discount
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Number of subscription billing cycles this discount is valid for
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subscriptionCycles(): Int? = subscriptionCycles.getNullable("subscription_cycles")

        /**
         * Usage limit for this discount, if any
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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
        @JsonProperty("business_id")
        @ExcludeMissing
        fun _businessId(): JsonField<String> = businessId

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
         * Returns the raw JSON value of [discountId].
         *
         * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount_id")
        @ExcludeMissing
        fun _discountId(): JsonField<String> = discountId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [position].
         *
         * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Int> = position

        /**
         * Returns the raw JSON value of [preserveOnPlanChange].
         *
         * Unlike [preserveOnPlanChange], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preserve_on_plan_change")
        @ExcludeMissing
        fun _preserveOnPlanChange(): JsonField<Boolean> = preserveOnPlanChange

        /**
         * Returns the raw JSON value of [restrictedTo].
         *
         * Unlike [restrictedTo], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [cyclesRemaining].
         *
         * Unlike [cyclesRemaining], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cycles_remaining")
        @ExcludeMissing
        fun _cyclesRemaining(): JsonField<Int> = cyclesRemaining

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
         * Returns the raw JSON value of [subscriptionCycles].
         *
         * Unlike [subscriptionCycles], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * .discountId()
             * .metadata()
             * .position()
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
            private var discountId: JsonField<String>? = null
            private var metadata: JsonField<Metadata>? = null
            private var position: JsonField<Int>? = null
            private var preserveOnPlanChange: JsonField<Boolean>? = null
            private var restrictedTo: JsonField<MutableList<String>>? = null
            private var timesUsed: JsonField<Int>? = null
            private var type: JsonField<DiscountType>? = null
            private var cyclesRemaining: JsonField<Int> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var subscriptionCycles: JsonField<Int> = JsonMissing.of()
            private var usageLimit: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(discount: Discount) = apply {
                amount = discount.amount
                businessId = discount.businessId
                code = discount.code
                createdAt = discount.createdAt
                discountId = discount.discountId
                metadata = discount.metadata
                position = discount.position
                preserveOnPlanChange = discount.preserveOnPlanChange
                restrictedTo = discount.restrictedTo.map { it.toMutableList() }
                timesUsed = discount.timesUsed
                type = discount.type
                cyclesRemaining = discount.cyclesRemaining
                expiresAt = discount.expiresAt
                name = discount.name
                subscriptionCycles = discount.subscriptionCycles
                usageLimit = discount.usageLimit
                additionalProperties = discount.additionalProperties.toMutableMap()
            }

            /** The discount amount (basis points for percentage, USD cents for flat) */
            fun amount(amount: Int) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

            /** The business this discount belongs to */
            fun businessId(businessId: String) = businessId(JsonField.of(businessId))

            /**
             * Sets [Builder.businessId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

            /** The discount code */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Timestamp when the discount was created */
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

            /** The unique discount ID */
            fun discountId(discountId: String) = discountId(JsonField.of(discountId))

            /**
             * Sets [Builder.discountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

            /** Additional metadata */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Position of this discount in the stack (0-based) */
            fun position(position: Int) = position(JsonField.of(position))

            /**
             * Sets [Builder.position] to an arbitrary JSON value.
             *
             * You should usually call [Builder.position] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun position(position: JsonField<Int>) = apply { this.position = position }

            /** Whether this discount should be preserved when a subscription changes plans */
            fun preserveOnPlanChange(preserveOnPlanChange: Boolean) =
                preserveOnPlanChange(JsonField.of(preserveOnPlanChange))

            /**
             * Sets [Builder.preserveOnPlanChange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preserveOnPlanChange] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun preserveOnPlanChange(preserveOnPlanChange: JsonField<Boolean>) = apply {
                this.preserveOnPlanChange = preserveOnPlanChange
            }

            /** List of product IDs to which this discount is restricted */
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

            /** How many times this discount has been used */
            fun timesUsed(timesUsed: Int) = timesUsed(JsonField.of(timesUsed))

            /**
             * Sets [Builder.timesUsed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timesUsed] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timesUsed(timesUsed: JsonField<Int>) = apply { this.timesUsed = timesUsed }

            /** The type of discount */
            fun type(type: DiscountType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [DiscountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<DiscountType>) = apply { this.type = type }

            /**
             * Remaining billing cycles for this discount on this subscription (None for one-time
             * payments)
             */
            fun cyclesRemaining(cyclesRemaining: Int?) =
                cyclesRemaining(JsonField.ofNullable(cyclesRemaining))

            /**
             * Alias for [Builder.cyclesRemaining].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cyclesRemaining(cyclesRemaining: Int) = cyclesRemaining(cyclesRemaining as Int?)

            /**
             * Sets [Builder.cyclesRemaining] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cyclesRemaining] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cyclesRemaining(cyclesRemaining: JsonField<Int>) = apply {
                this.cyclesRemaining = cyclesRemaining
            }

            /** Optional date/time after which discount is expired */
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

            /** Name for the Discount */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Number of subscription billing cycles this discount is valid for */
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

            /** Usage limit for this discount, if any */
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
             * You should usually call [Builder.usageLimit] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * .discountId()
             * .metadata()
             * .position()
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
                    checkRequired("discountId", discountId),
                    checkRequired("metadata", metadata),
                    checkRequired("position", position),
                    checkRequired("preserveOnPlanChange", preserveOnPlanChange),
                    checkRequired("restrictedTo", restrictedTo).map { it.toImmutable() },
                    checkRequired("timesUsed", timesUsed),
                    checkRequired("type", type),
                    cyclesRemaining,
                    expiresAt,
                    name,
                    subscriptionCycles,
                    usageLimit,
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
        fun validate(): Discount = apply {
            if (validated) {
                return@apply
            }

            amount()
            businessId()
            code()
            createdAt()
            discountId()
            metadata().validate()
            position()
            preserveOnPlanChange()
            restrictedTo()
            timesUsed()
            type().validate()
            cyclesRemaining()
            expiresAt()
            name()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (amount.asKnown() == null) 0 else 1) +
                (if (businessId.asKnown() == null) 0 else 1) +
                (if (code.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (discountId.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (position.asKnown() == null) 0 else 1) +
                (if (preserveOnPlanChange.asKnown() == null) 0 else 1) +
                (restrictedTo.asKnown()?.size ?: 0) +
                (if (timesUsed.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (cyclesRemaining.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (subscriptionCycles.asKnown() == null) 0 else 1) +
                (if (usageLimit.asKnown() == null) 0 else 1)

        /** Additional metadata */
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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Discount &&
                amount == other.amount &&
                businessId == other.businessId &&
                code == other.code &&
                createdAt == other.createdAt &&
                discountId == other.discountId &&
                metadata == other.metadata &&
                position == other.position &&
                preserveOnPlanChange == other.preserveOnPlanChange &&
                restrictedTo == other.restrictedTo &&
                timesUsed == other.timesUsed &&
                type == other.type &&
                cyclesRemaining == other.cyclesRemaining &&
                expiresAt == other.expiresAt &&
                name == other.name &&
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
                discountId,
                metadata,
                position,
                preserveOnPlanChange,
                restrictedTo,
                timesUsed,
                type,
                cyclesRemaining,
                expiresAt,
                name,
                subscriptionCycles,
                usageLimit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Discount{amount=$amount, businessId=$businessId, code=$code, createdAt=$createdAt, discountId=$discountId, metadata=$metadata, position=$position, preserveOnPlanChange=$preserveOnPlanChange, restrictedTo=$restrictedTo, timesUsed=$timesUsed, type=$type, cyclesRemaining=$cyclesRemaining, expiresAt=$expiresAt, name=$name, subscriptionCycles=$subscriptionCycles, usageLimit=$usageLimit, additionalProperties=$additionalProperties}"
    }

    class ProductCart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

            return other is ProductCart &&
                productId == other.productId &&
                quantity == other.quantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(productId, quantity, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductCart{productId=$productId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Payment &&
            billing == other.billing &&
            brandId == other.brandId &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            customer == other.customer &&
            digitalProductsDelivered == other.digitalProductsDelivered &&
            disputes == other.disputes &&
            metadata == other.metadata &&
            paymentId == other.paymentId &&
            refunds == other.refunds &&
            settlementAmount == other.settlementAmount &&
            settlementCurrency == other.settlementCurrency &&
            totalAmount == other.totalAmount &&
            cardHolderName == other.cardHolderName &&
            cardIssuingCountry == other.cardIssuingCountry &&
            cardLastFour == other.cardLastFour &&
            cardNetwork == other.cardNetwork &&
            cardType == other.cardType &&
            checkoutSessionId == other.checkoutSessionId &&
            customFieldResponses == other.customFieldResponses &&
            discountId == other.discountId &&
            discounts == other.discounts &&
            errorCode == other.errorCode &&
            errorMessage == other.errorMessage &&
            invoiceId == other.invoiceId &&
            invoiceUrl == other.invoiceUrl &&
            paymentLink == other.paymentLink &&
            paymentMethod == other.paymentMethod &&
            paymentMethodType == other.paymentMethodType &&
            productCart == other.productCart &&
            refundStatus == other.refundStatus &&
            settlementTax == other.settlementTax &&
            status == other.status &&
            subscriptionId == other.subscriptionId &&
            tax == other.tax &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            billing,
            brandId,
            businessId,
            createdAt,
            currency,
            customer,
            digitalProductsDelivered,
            disputes,
            metadata,
            paymentId,
            refunds,
            settlementAmount,
            settlementCurrency,
            totalAmount,
            cardHolderName,
            cardIssuingCountry,
            cardLastFour,
            cardNetwork,
            cardType,
            checkoutSessionId,
            customFieldResponses,
            discountId,
            discounts,
            errorCode,
            errorMessage,
            invoiceId,
            invoiceUrl,
            paymentLink,
            paymentMethod,
            paymentMethodType,
            productCart,
            refundStatus,
            settlementTax,
            status,
            subscriptionId,
            tax,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{billing=$billing, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, currency=$currency, customer=$customer, digitalProductsDelivered=$digitalProductsDelivered, disputes=$disputes, metadata=$metadata, paymentId=$paymentId, refunds=$refunds, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, totalAmount=$totalAmount, cardHolderName=$cardHolderName, cardIssuingCountry=$cardIssuingCountry, cardLastFour=$cardLastFour, cardNetwork=$cardNetwork, cardType=$cardType, checkoutSessionId=$checkoutSessionId, customFieldResponses=$customFieldResponses, discountId=$discountId, discounts=$discounts, errorCode=$errorCode, errorMessage=$errorMessage, invoiceId=$invoiceId, invoiceUrl=$invoiceUrl, paymentLink=$paymentLink, paymentMethod=$paymentMethod, paymentMethodType=$paymentMethodType, productCart=$productCart, refundStatus=$refundStatus, settlementTax=$settlementTax, status=$status, subscriptionId=$subscriptionId, tax=$tax, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
