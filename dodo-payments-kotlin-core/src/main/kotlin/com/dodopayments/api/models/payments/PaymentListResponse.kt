// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.disputes.DisputeStatus
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PaymentListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val customer: JsonField<CustomerLimitedDetails>,
    private val digitalProductsDelivered: JsonField<Boolean>,
    private val hasLicenseKey: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val paymentId: JsonField<String>,
    private val paymentProvider: JsonField<PaymentProvider>,
    private val totalAmount: JsonField<Int>,
    private val cardLastFour: JsonField<String>,
    private val cardNetwork: JsonField<String>,
    private val disputeStatus: JsonField<DisputeStatus>,
    private val invoiceId: JsonField<String>,
    private val invoiceUrl: JsonField<String>,
    private val paymentMethod: JsonField<String>,
    private val paymentMethodType: JsonField<String>,
    private val refundStatus: JsonField<PaymentRefundStatus>,
    private val status: JsonField<IntentStatus>,
    private val subscriptionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("has_license_key")
        @ExcludeMissing
        hasLicenseKey: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_provider")
        @ExcludeMissing
        paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        totalAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("card_last_four")
        @ExcludeMissing
        cardLastFour: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_network")
        @ExcludeMissing
        cardNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dispute_status")
        @ExcludeMissing
        disputeStatus: JsonField<DisputeStatus> = JsonMissing.of(),
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_url")
        @ExcludeMissing
        invoiceUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_method_type")
        @ExcludeMissing
        paymentMethodType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refund_status")
        @ExcludeMissing
        refundStatus: JsonField<PaymentRefundStatus> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<IntentStatus> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        brandId,
        createdAt,
        currency,
        customer,
        digitalProductsDelivered,
        hasLicenseKey,
        metadata,
        paymentId,
        paymentProvider,
        totalAmount,
        cardLastFour,
        cardNetwork,
        disputeStatus,
        invoiceId,
        invoiceUrl,
        paymentMethod,
        paymentMethodType,
        refundStatus,
        status,
        subscriptionId,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
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
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun digitalProductsDelivered(): Boolean =
        digitalProductsDelivered.getRequired("digital_products_delivered")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasLicenseKey(): Boolean = hasLicenseKey.getRequired("has_license_key")

    /**
     * Arbitrary key-value metadata. Values can be string, integer, number, or boolean.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * Which processor handled this payment. `stripe` / `adyen` for BYOP routes (the merchant's own
     * payment connector); `dodo` for everything Dodo processed itself.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentProvider(): PaymentProvider = paymentProvider.getRequired("payment_provider")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalAmount(): Int = totalAmount.getRequired("total_amount")

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
     * The most recent dispute status for this payment. None if no disputes exist.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun disputeStatus(): DisputeStatus? = disputeStatus.getNullable("dispute_status")

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
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethod(): String? = paymentMethod.getNullable("payment_method")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethodType(): String? = paymentMethodType.getNullable("payment_method_type")

    /**
     * Summary of the refund status for this payment. None if no succeeded refunds exist.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun refundStatus(): PaymentRefundStatus? = refundStatus.getNullable("refund_status")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): IntentStatus? = status.getNullable("status")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionId(): String? = subscriptionId.getNullable("subscription_id")

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

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
     * Returns the raw JSON value of [hasLicenseKey].
     *
     * Unlike [hasLicenseKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_license_key")
    @ExcludeMissing
    fun _hasLicenseKey(): JsonField<Boolean> = hasLicenseKey

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
     * Returns the raw JSON value of [paymentProvider].
     *
     * Unlike [paymentProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_provider")
    @ExcludeMissing
    fun _paymentProvider(): JsonField<PaymentProvider> = paymentProvider

    /**
     * Returns the raw JSON value of [totalAmount].
     *
     * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Int> = totalAmount

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
     * Returns the raw JSON value of [disputeStatus].
     *
     * Unlike [disputeStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dispute_status")
    @ExcludeMissing
    fun _disputeStatus(): JsonField<DisputeStatus> = disputeStatus

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
     * Returns the raw JSON value of [refundStatus].
     *
     * Unlike [refundStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refund_status")
    @ExcludeMissing
    fun _refundStatus(): JsonField<PaymentRefundStatus> = refundStatus

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
         * Returns a mutable builder for constructing an instance of [PaymentListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .brandId()
         * .createdAt()
         * .currency()
         * .customer()
         * .digitalProductsDelivered()
         * .hasLicenseKey()
         * .metadata()
         * .paymentId()
         * .paymentProvider()
         * .totalAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentListResponse]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var digitalProductsDelivered: JsonField<Boolean>? = null
        private var hasLicenseKey: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var paymentProvider: JsonField<PaymentProvider>? = null
        private var totalAmount: JsonField<Int>? = null
        private var cardLastFour: JsonField<String> = JsonMissing.of()
        private var cardNetwork: JsonField<String> = JsonMissing.of()
        private var disputeStatus: JsonField<DisputeStatus> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var invoiceUrl: JsonField<String> = JsonMissing.of()
        private var paymentMethod: JsonField<String> = JsonMissing.of()
        private var paymentMethodType: JsonField<String> = JsonMissing.of()
        private var refundStatus: JsonField<PaymentRefundStatus> = JsonMissing.of()
        private var status: JsonField<IntentStatus> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentListResponse: PaymentListResponse) = apply {
            brandId = paymentListResponse.brandId
            createdAt = paymentListResponse.createdAt
            currency = paymentListResponse.currency
            customer = paymentListResponse.customer
            digitalProductsDelivered = paymentListResponse.digitalProductsDelivered
            hasLicenseKey = paymentListResponse.hasLicenseKey
            metadata = paymentListResponse.metadata
            paymentId = paymentListResponse.paymentId
            paymentProvider = paymentListResponse.paymentProvider
            totalAmount = paymentListResponse.totalAmount
            cardLastFour = paymentListResponse.cardLastFour
            cardNetwork = paymentListResponse.cardNetwork
            disputeStatus = paymentListResponse.disputeStatus
            invoiceId = paymentListResponse.invoiceId
            invoiceUrl = paymentListResponse.invoiceUrl
            paymentMethod = paymentListResponse.paymentMethod
            paymentMethodType = paymentListResponse.paymentMethodType
            refundStatus = paymentListResponse.refundStatus
            status = paymentListResponse.status
            subscriptionId = paymentListResponse.subscriptionId
            additionalProperties = paymentListResponse.additionalProperties.toMutableMap()
        }

        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

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

        fun hasLicenseKey(hasLicenseKey: Boolean) = hasLicenseKey(JsonField.of(hasLicenseKey))

        /**
         * Sets [Builder.hasLicenseKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasLicenseKey] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasLicenseKey(hasLicenseKey: JsonField<Boolean>) = apply {
            this.hasLicenseKey = hasLicenseKey
        }

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

        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /**
         * Which processor handled this payment. `stripe` / `adyen` for BYOP routes (the merchant's
         * own payment connector); `dodo` for everything Dodo processed itself.
         */
        fun paymentProvider(paymentProvider: PaymentProvider) =
            paymentProvider(JsonField.of(paymentProvider))

        /**
         * Sets [Builder.paymentProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentProvider] with a well-typed [PaymentProvider]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
            this.paymentProvider = paymentProvider
        }

        fun totalAmount(totalAmount: Int) = totalAmount(JsonField.of(totalAmount))

        /**
         * Sets [Builder.totalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalAmount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalAmount(totalAmount: JsonField<Int>) = apply { this.totalAmount = totalAmount }

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

        /** The most recent dispute status for this payment. None if no disputes exist. */
        fun disputeStatus(disputeStatus: DisputeStatus?) =
            disputeStatus(JsonField.ofNullable(disputeStatus))

        /**
         * Sets [Builder.disputeStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputeStatus] with a well-typed [DisputeStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disputeStatus(disputeStatus: JsonField<DisputeStatus>) = apply {
            this.disputeStatus = disputeStatus
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

        fun status(status: IntentStatus?) = status(JsonField.ofNullable(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [IntentStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<IntentStatus>) = apply { this.status = status }

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
         * Returns an immutable instance of [PaymentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .brandId()
         * .createdAt()
         * .currency()
         * .customer()
         * .digitalProductsDelivered()
         * .hasLicenseKey()
         * .metadata()
         * .paymentId()
         * .paymentProvider()
         * .totalAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentListResponse =
            PaymentListResponse(
                checkRequired("brandId", brandId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("digitalProductsDelivered", digitalProductsDelivered),
                checkRequired("hasLicenseKey", hasLicenseKey),
                checkRequired("metadata", metadata),
                checkRequired("paymentId", paymentId),
                checkRequired("paymentProvider", paymentProvider),
                checkRequired("totalAmount", totalAmount),
                cardLastFour,
                cardNetwork,
                disputeStatus,
                invoiceId,
                invoiceUrl,
                paymentMethod,
                paymentMethodType,
                refundStatus,
                status,
                subscriptionId,
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
    fun validate(): PaymentListResponse = apply {
        if (validated) {
            return@apply
        }

        brandId()
        createdAt()
        currency().validate()
        customer().validate()
        digitalProductsDelivered()
        hasLicenseKey()
        metadata().validate()
        paymentId()
        paymentProvider().validate()
        totalAmount()
        cardLastFour()
        cardNetwork()
        disputeStatus()?.validate()
        invoiceId()
        invoiceUrl()
        paymentMethod()
        paymentMethodType()
        refundStatus()?.validate()
        status()?.validate()
        subscriptionId()
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
        (if (brandId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (customer.asKnown()?.validity() ?: 0) +
            (if (digitalProductsDelivered.asKnown() == null) 0 else 1) +
            (if (hasLicenseKey.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (paymentProvider.asKnown()?.validity() ?: 0) +
            (if (totalAmount.asKnown() == null) 0 else 1) +
            (if (cardLastFour.asKnown() == null) 0 else 1) +
            (if (cardNetwork.asKnown() == null) 0 else 1) +
            (disputeStatus.asKnown()?.validity() ?: 0) +
            (if (invoiceId.asKnown() == null) 0 else 1) +
            (if (invoiceUrl.asKnown() == null) 0 else 1) +
            (if (paymentMethod.asKnown() == null) 0 else 1) +
            (if (paymentMethodType.asKnown() == null) 0 else 1) +
            (refundStatus.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (if (subscriptionId.asKnown() == null) 0 else 1)

    /**
     * Which processor handled this payment. `stripe` / `adyen` for BYOP routes (the merchant's own
     * payment connector); `dodo` for everything Dodo processed itself.
     */
    class PaymentProvider @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val STRIPE = of("stripe")

            val ADYEN = of("adyen")

            val DODO = of("dodo")

            fun of(value: String) = PaymentProvider(JsonField.of(value))
        }

        /** An enum containing [PaymentProvider]'s known values. */
        enum class Known {
            STRIPE,
            ADYEN,
            DODO,
        }

        /**
         * An enum containing [PaymentProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STRIPE,
            ADYEN,
            DODO,
            /**
             * An enum member indicating that [PaymentProvider] was instantiated with an unknown
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
                STRIPE -> Value.STRIPE
                ADYEN -> Value.ADYEN
                DODO -> Value.DODO
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
                STRIPE -> Known.STRIPE
                ADYEN -> Known.ADYEN
                DODO -> Known.DODO
                else -> throw DodoPaymentsInvalidDataException("Unknown PaymentProvider: $value")
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
        fun validate(): PaymentProvider = apply {
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

            return other is PaymentProvider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentListResponse &&
            brandId == other.brandId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            customer == other.customer &&
            digitalProductsDelivered == other.digitalProductsDelivered &&
            hasLicenseKey == other.hasLicenseKey &&
            metadata == other.metadata &&
            paymentId == other.paymentId &&
            paymentProvider == other.paymentProvider &&
            totalAmount == other.totalAmount &&
            cardLastFour == other.cardLastFour &&
            cardNetwork == other.cardNetwork &&
            disputeStatus == other.disputeStatus &&
            invoiceId == other.invoiceId &&
            invoiceUrl == other.invoiceUrl &&
            paymentMethod == other.paymentMethod &&
            paymentMethodType == other.paymentMethodType &&
            refundStatus == other.refundStatus &&
            status == other.status &&
            subscriptionId == other.subscriptionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandId,
            createdAt,
            currency,
            customer,
            digitalProductsDelivered,
            hasLicenseKey,
            metadata,
            paymentId,
            paymentProvider,
            totalAmount,
            cardLastFour,
            cardNetwork,
            disputeStatus,
            invoiceId,
            invoiceUrl,
            paymentMethod,
            paymentMethodType,
            refundStatus,
            status,
            subscriptionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentListResponse{brandId=$brandId, createdAt=$createdAt, currency=$currency, customer=$customer, digitalProductsDelivered=$digitalProductsDelivered, hasLicenseKey=$hasLicenseKey, metadata=$metadata, paymentId=$paymentId, paymentProvider=$paymentProvider, totalAmount=$totalAmount, cardLastFour=$cardLastFour, cardNetwork=$cardNetwork, disputeStatus=$disputeStatus, invoiceId=$invoiceId, invoiceUrl=$invoiceUrl, paymentMethod=$paymentMethod, paymentMethodType=$paymentMethodType, refundStatus=$refundStatus, status=$status, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
