// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CreateNewCustomer
import com.dodopayments.api.models.payments.CustomerRequest
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class SubscriptionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billing(): BillingAddress = body.billing()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerRequest = body.customer()

    /**
     * Unique identifier of the product to subscribe to
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = body.productId()

    /**
     * Number of units to subscribe for. Must be at least 1.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Long = body.quantity()

    /**
     * List of payment methods allowed during checkout.
     *
     * Customers will **never** see payment methods that are **not** in this list. However, adding a
     * method here **does not guarantee** customers will see it. Availability still depends on other
     * factors (e.g., customer location, merchant settings).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowedPaymentMethodTypes(): List<AllowedPaymentMethodType>? =
        body.allowedPaymentMethodTypes()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billingCurrency(): BillingCurrency? = body.billingCurrency()

    /**
     * Discount Code to apply to the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountCode(): String? = body.discountCode()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun onDemand(): OnDemand? = body.onDemand()

    /**
     * If true, generates a payment link. Defaults to false if not specified.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentLink(): Boolean? = body.paymentLink()

    /**
     * Optional URL to redirect after successful subscription creation
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnUrl(): String? = body.returnUrl()

    /**
     * Display saved payment methods of a returning customer False by default
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun showSavedPaymentMethods(): Boolean? = body.showSavedPaymentMethods()

    /**
     * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will fail
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxId(): String? = body.taxId()

    /**
     * Optional trial period in days If specified, this value overrides the trial period set in the
     * product's price Must be between 0 and 10000 days
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trialPeriodDays(): Long? = body.trialPeriodDays()

    /**
     * Returns the raw JSON value of [billing].
     *
     * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billing(): JsonField<BillingAddress> = body._billing()

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customer(): JsonField<CustomerRequest> = body._customer()

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _quantity(): JsonField<Long> = body._quantity()

    /**
     * Returns the raw JSON value of [allowedPaymentMethodTypes].
     *
     * Unlike [allowedPaymentMethodTypes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowedPaymentMethodTypes(): JsonField<List<AllowedPaymentMethodType>> =
        body._allowedPaymentMethodTypes()

    /**
     * Returns the raw JSON value of [billingCurrency].
     *
     * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingCurrency(): JsonField<BillingCurrency> = body._billingCurrency()

    /**
     * Returns the raw JSON value of [discountCode].
     *
     * Unlike [discountCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _discountCode(): JsonField<String> = body._discountCode()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [onDemand].
     *
     * Unlike [onDemand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _onDemand(): JsonField<OnDemand> = body._onDemand()

    /**
     * Returns the raw JSON value of [paymentLink].
     *
     * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentLink(): JsonField<Boolean> = body._paymentLink()

    /**
     * Returns the raw JSON value of [returnUrl].
     *
     * Unlike [returnUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _returnUrl(): JsonField<String> = body._returnUrl()

    /**
     * Returns the raw JSON value of [showSavedPaymentMethods].
     *
     * Unlike [showSavedPaymentMethods], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _showSavedPaymentMethods(): JsonField<Boolean> = body._showSavedPaymentMethods()

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxId(): JsonField<String> = body._taxId()

    /**
     * Returns the raw JSON value of [trialPeriodDays].
     *
     * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trialPeriodDays(): JsonField<Long> = body._trialPeriodDays()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .billing()
         * .customer()
         * .productId()
         * .quantity()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionCreateParams: SubscriptionCreateParams) = apply {
            body = subscriptionCreateParams.body.toBuilder()
            additionalHeaders = subscriptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billing]
         * - [customer]
         * - [productId]
         * - [quantity]
         * - [allowedPaymentMethodTypes]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun billing(billing: BillingAddress) = apply { body.billing(billing) }

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billing(billing: JsonField<BillingAddress>) = apply { body.billing(billing) }

        fun customer(customer: CustomerRequest) = apply { body.customer(customer) }

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [CustomerRequest] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customer(customer: JsonField<CustomerRequest>) = apply { body.customer(customer) }

        /**
         * Alias for calling [customer] with
         * `CustomerRequest.ofAttachExistingCustomer(attachExistingCustomer)`.
         */
        fun customer(attachExistingCustomer: AttachExistingCustomer) = apply {
            body.customer(attachExistingCustomer)
        }

        /**
         * Alias for calling [customer] with
         * `CustomerRequest.ofCreateNewCustomer(createNewCustomer)`.
         */
        fun customer(createNewCustomer: CreateNewCustomer) = apply {
            body.customer(createNewCustomer)
        }

        /** Unique identifier of the product to subscribe to */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /** Number of units to subscribe for. Must be at least 1. */
        fun quantity(quantity: Long) = apply { body.quantity(quantity) }

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Long>) = apply { body.quantity(quantity) }

        /**
         * List of payment methods allowed during checkout.
         *
         * Customers will **never** see payment methods that are **not** in this list. However,
         * adding a method here **does not guarantee** customers will see it. Availability still
         * depends on other factors (e.g., customer location, merchant settings).
         */
        fun allowedPaymentMethodTypes(allowedPaymentMethodTypes: List<AllowedPaymentMethodType>?) =
            apply {
                body.allowedPaymentMethodTypes(allowedPaymentMethodTypes)
            }

        /**
         * Sets [Builder.allowedPaymentMethodTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPaymentMethodTypes] with a well-typed
         * `List<AllowedPaymentMethodType>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun allowedPaymentMethodTypes(
            allowedPaymentMethodTypes: JsonField<List<AllowedPaymentMethodType>>
        ) = apply { body.allowedPaymentMethodTypes(allowedPaymentMethodTypes) }

        /**
         * Adds a single [AllowedPaymentMethodType] to [allowedPaymentMethodTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedPaymentMethodType(allowedPaymentMethodType: AllowedPaymentMethodType) =
            apply {
                body.addAllowedPaymentMethodType(allowedPaymentMethodType)
            }

        fun billingCurrency(billingCurrency: BillingCurrency?) = apply {
            body.billingCurrency(billingCurrency)
        }

        /**
         * Sets [Builder.billingCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCurrency] with a well-typed [BillingCurrency]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun billingCurrency(billingCurrency: JsonField<BillingCurrency>) = apply {
            body.billingCurrency(billingCurrency)
        }

        /** Discount Code to apply to the subscription */
        fun discountCode(discountCode: String?) = apply { body.discountCode(discountCode) }

        /**
         * Sets [Builder.discountCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discountCode(discountCode: JsonField<String>) = apply {
            body.discountCode(discountCode)
        }

        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun onDemand(onDemand: OnDemand?) = apply { body.onDemand(onDemand) }

        /**
         * Sets [Builder.onDemand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onDemand] with a well-typed [OnDemand] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onDemand(onDemand: JsonField<OnDemand>) = apply { body.onDemand(onDemand) }

        /** If true, generates a payment link. Defaults to false if not specified. */
        fun paymentLink(paymentLink: Boolean?) = apply { body.paymentLink(paymentLink) }

        /**
         * Alias for [Builder.paymentLink].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun paymentLink(paymentLink: Boolean) = paymentLink(paymentLink as Boolean?)

        /**
         * Sets [Builder.paymentLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentLink] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentLink(paymentLink: JsonField<Boolean>) = apply { body.paymentLink(paymentLink) }

        /** Optional URL to redirect after successful subscription creation */
        fun returnUrl(returnUrl: String?) = apply { body.returnUrl(returnUrl) }

        /**
         * Sets [Builder.returnUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun returnUrl(returnUrl: JsonField<String>) = apply { body.returnUrl(returnUrl) }

        /** Display saved payment methods of a returning customer False by default */
        fun showSavedPaymentMethods(showSavedPaymentMethods: Boolean) = apply {
            body.showSavedPaymentMethods(showSavedPaymentMethods)
        }

        /**
         * Sets [Builder.showSavedPaymentMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showSavedPaymentMethods] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun showSavedPaymentMethods(showSavedPaymentMethods: JsonField<Boolean>) = apply {
            body.showSavedPaymentMethods(showSavedPaymentMethods)
        }

        /**
         * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will
         * fail
         */
        fun taxId(taxId: String?) = apply { body.taxId(taxId) }

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxId(taxId: JsonField<String>) = apply { body.taxId(taxId) }

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         */
        fun trialPeriodDays(trialPeriodDays: Long?) = apply {
            body.trialPeriodDays(trialPeriodDays)
        }

        /**
         * Alias for [Builder.trialPeriodDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialPeriodDays(trialPeriodDays: Long) = trialPeriodDays(trialPeriodDays as Long?)

        /**
         * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialPeriodDays] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trialPeriodDays(trialPeriodDays: JsonField<Long>) = apply {
            body.trialPeriodDays(trialPeriodDays)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SubscriptionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .billing()
         * .customer()
         * .productId()
         * .quantity()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionCreateParams =
            SubscriptionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request payload for creating a new subscription
     *
     * This struct represents the data required to create a new subscription in the system. It
     * includes details about the product, quantity, customer information, and billing details.
     */
    class Body
    private constructor(
        private val billing: JsonField<BillingAddress>,
        private val customer: JsonField<CustomerRequest>,
        private val productId: JsonField<String>,
        private val quantity: JsonField<Long>,
        private val allowedPaymentMethodTypes: JsonField<List<AllowedPaymentMethodType>>,
        private val billingCurrency: JsonField<BillingCurrency>,
        private val discountCode: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val onDemand: JsonField<OnDemand>,
        private val paymentLink: JsonField<Boolean>,
        private val returnUrl: JsonField<String>,
        private val showSavedPaymentMethods: JsonField<Boolean>,
        private val taxId: JsonField<String>,
        private val trialPeriodDays: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing")
            @ExcludeMissing
            billing: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<CustomerRequest> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("allowed_payment_method_types")
            @ExcludeMissing
            allowedPaymentMethodTypes: JsonField<List<AllowedPaymentMethodType>> = JsonMissing.of(),
            @JsonProperty("billing_currency")
            @ExcludeMissing
            billingCurrency: JsonField<BillingCurrency> = JsonMissing.of(),
            @JsonProperty("discount_code")
            @ExcludeMissing
            discountCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("on_demand")
            @ExcludeMissing
            onDemand: JsonField<OnDemand> = JsonMissing.of(),
            @JsonProperty("payment_link")
            @ExcludeMissing
            paymentLink: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("return_url")
            @ExcludeMissing
            returnUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("show_saved_payment_methods")
            @ExcludeMissing
            showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            trialPeriodDays: JsonField<Long> = JsonMissing.of(),
        ) : this(
            billing,
            customer,
            productId,
            quantity,
            allowedPaymentMethodTypes,
            billingCurrency,
            discountCode,
            metadata,
            onDemand,
            paymentLink,
            returnUrl,
            showSavedPaymentMethods,
            taxId,
            trialPeriodDays,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billing(): BillingAddress = billing.getRequired("billing")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): CustomerRequest = customer.getRequired("customer")

        /**
         * Unique identifier of the product to subscribe to
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Number of units to subscribe for. Must be at least 1.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Long = quantity.getRequired("quantity")

        /**
         * List of payment methods allowed during checkout.
         *
         * Customers will **never** see payment methods that are **not** in this list. However,
         * adding a method here **does not guarantee** customers will see it. Availability still
         * depends on other factors (e.g., customer location, merchant settings).
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowedPaymentMethodTypes(): List<AllowedPaymentMethodType>? =
            allowedPaymentMethodTypes.getNullable("allowed_payment_method_types")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun billingCurrency(): BillingCurrency? = billingCurrency.getNullable("billing_currency")

        /**
         * Discount Code to apply to the subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountCode(): String? = discountCode.getNullable("discount_code")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun onDemand(): OnDemand? = onDemand.getNullable("on_demand")

        /**
         * If true, generates a payment link. Defaults to false if not specified.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentLink(): Boolean? = paymentLink.getNullable("payment_link")

        /**
         * Optional URL to redirect after successful subscription creation
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun returnUrl(): String? = returnUrl.getNullable("return_url")

        /**
         * Display saved payment methods of a returning customer False by default
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun showSavedPaymentMethods(): Boolean? =
            showSavedPaymentMethods.getNullable("show_saved_payment_methods")

        /**
         * Tax ID in case the payment is B2B. If tax id validation fails the payment creation will
         * fail
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): String? = taxId.getNullable("tax_id")

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialPeriodDays(): Long? = trialPeriodDays.getNullable("trial_period_days")

        /**
         * Returns the raw JSON value of [billing].
         *
         * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<BillingAddress> = billing

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer")
        @ExcludeMissing
        fun _customer(): JsonField<CustomerRequest> = customer

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
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        /**
         * Returns the raw JSON value of [allowedPaymentMethodTypes].
         *
         * Unlike [allowedPaymentMethodTypes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_payment_method_types")
        @ExcludeMissing
        fun _allowedPaymentMethodTypes(): JsonField<List<AllowedPaymentMethodType>> =
            allowedPaymentMethodTypes

        /**
         * Returns the raw JSON value of [billingCurrency].
         *
         * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_currency")
        @ExcludeMissing
        fun _billingCurrency(): JsonField<BillingCurrency> = billingCurrency

        /**
         * Returns the raw JSON value of [discountCode].
         *
         * Unlike [discountCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_code")
        @ExcludeMissing
        fun _discountCode(): JsonField<String> = discountCode

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [onDemand].
         *
         * Unlike [onDemand], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_demand") @ExcludeMissing fun _onDemand(): JsonField<OnDemand> = onDemand

        /**
         * Returns the raw JSON value of [paymentLink].
         *
         * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_link")
        @ExcludeMissing
        fun _paymentLink(): JsonField<Boolean> = paymentLink

        /**
         * Returns the raw JSON value of [returnUrl].
         *
         * Unlike [returnUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("return_url") @ExcludeMissing fun _returnUrl(): JsonField<String> = returnUrl

        /**
         * Returns the raw JSON value of [showSavedPaymentMethods].
         *
         * Unlike [showSavedPaymentMethods], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("show_saved_payment_methods")
        @ExcludeMissing
        fun _showSavedPaymentMethods(): JsonField<Boolean> = showSavedPaymentMethods

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

        /**
         * Returns the raw JSON value of [trialPeriodDays].
         *
         * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        fun _trialPeriodDays(): JsonField<Long> = trialPeriodDays

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .billing()
             * .customer()
             * .productId()
             * .quantity()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billing: JsonField<BillingAddress>? = null
            private var customer: JsonField<CustomerRequest>? = null
            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var allowedPaymentMethodTypes:
                JsonField<MutableList<AllowedPaymentMethodType>>? =
                null
            private var billingCurrency: JsonField<BillingCurrency> = JsonMissing.of()
            private var discountCode: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var onDemand: JsonField<OnDemand> = JsonMissing.of()
            private var paymentLink: JsonField<Boolean> = JsonMissing.of()
            private var returnUrl: JsonField<String> = JsonMissing.of()
            private var showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var trialPeriodDays: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                billing = body.billing
                customer = body.customer
                productId = body.productId
                quantity = body.quantity
                allowedPaymentMethodTypes =
                    body.allowedPaymentMethodTypes.map { it.toMutableList() }
                billingCurrency = body.billingCurrency
                discountCode = body.discountCode
                metadata = body.metadata
                onDemand = body.onDemand
                paymentLink = body.paymentLink
                returnUrl = body.returnUrl
                showSavedPaymentMethods = body.showSavedPaymentMethods
                taxId = body.taxId
                trialPeriodDays = body.trialPeriodDays
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun customer(customer: CustomerRequest) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [CustomerRequest] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<CustomerRequest>) = apply { this.customer = customer }

            /**
             * Alias for calling [customer] with
             * `CustomerRequest.ofAttachExistingCustomer(attachExistingCustomer)`.
             */
            fun customer(attachExistingCustomer: AttachExistingCustomer) =
                customer(CustomerRequest.ofAttachExistingCustomer(attachExistingCustomer))

            /**
             * Alias for calling [customer] with
             * `CustomerRequest.ofCreateNewCustomer(createNewCustomer)`.
             */
            fun customer(createNewCustomer: CreateNewCustomer) =
                customer(CustomerRequest.ofCreateNewCustomer(createNewCustomer))

            /** Unique identifier of the product to subscribe to */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Number of units to subscribe for. Must be at least 1. */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /**
             * List of payment methods allowed during checkout.
             *
             * Customers will **never** see payment methods that are **not** in this list. However,
             * adding a method here **does not guarantee** customers will see it. Availability still
             * depends on other factors (e.g., customer location, merchant settings).
             */
            fun allowedPaymentMethodTypes(
                allowedPaymentMethodTypes: List<AllowedPaymentMethodType>?
            ) = allowedPaymentMethodTypes(JsonField.ofNullable(allowedPaymentMethodTypes))

            /**
             * Sets [Builder.allowedPaymentMethodTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedPaymentMethodTypes] with a well-typed
             * `List<AllowedPaymentMethodType>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun allowedPaymentMethodTypes(
                allowedPaymentMethodTypes: JsonField<List<AllowedPaymentMethodType>>
            ) = apply {
                this.allowedPaymentMethodTypes =
                    allowedPaymentMethodTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [AllowedPaymentMethodType] to [allowedPaymentMethodTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedPaymentMethodType(allowedPaymentMethodType: AllowedPaymentMethodType) =
                apply {
                    allowedPaymentMethodTypes =
                        (allowedPaymentMethodTypes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowedPaymentMethodTypes", it)
                                .add(allowedPaymentMethodType)
                        }
                }

            fun billingCurrency(billingCurrency: BillingCurrency?) =
                billingCurrency(JsonField.ofNullable(billingCurrency))

            /**
             * Sets [Builder.billingCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCurrency] with a well-typed [BillingCurrency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingCurrency(billingCurrency: JsonField<BillingCurrency>) = apply {
                this.billingCurrency = billingCurrency
            }

            /** Discount Code to apply to the subscription */
            fun discountCode(discountCode: String?) =
                discountCode(JsonField.ofNullable(discountCode))

            /**
             * Sets [Builder.discountCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountCode(discountCode: JsonField<String>) = apply {
                this.discountCode = discountCode
            }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun onDemand(onDemand: OnDemand?) = onDemand(JsonField.ofNullable(onDemand))

            /**
             * Sets [Builder.onDemand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onDemand] with a well-typed [OnDemand] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun onDemand(onDemand: JsonField<OnDemand>) = apply { this.onDemand = onDemand }

            /** If true, generates a payment link. Defaults to false if not specified. */
            fun paymentLink(paymentLink: Boolean?) = paymentLink(JsonField.ofNullable(paymentLink))

            /**
             * Alias for [Builder.paymentLink].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun paymentLink(paymentLink: Boolean) = paymentLink(paymentLink as Boolean?)

            /**
             * Sets [Builder.paymentLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentLink] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentLink(paymentLink: JsonField<Boolean>) = apply {
                this.paymentLink = paymentLink
            }

            /** Optional URL to redirect after successful subscription creation */
            fun returnUrl(returnUrl: String?) = returnUrl(JsonField.ofNullable(returnUrl))

            /**
             * Sets [Builder.returnUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnUrl(returnUrl: JsonField<String>) = apply { this.returnUrl = returnUrl }

            /** Display saved payment methods of a returning customer False by default */
            fun showSavedPaymentMethods(showSavedPaymentMethods: Boolean) =
                showSavedPaymentMethods(JsonField.of(showSavedPaymentMethods))

            /**
             * Sets [Builder.showSavedPaymentMethods] to an arbitrary JSON value.
             *
             * You should usually call [Builder.showSavedPaymentMethods] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun showSavedPaymentMethods(showSavedPaymentMethods: JsonField<Boolean>) = apply {
                this.showSavedPaymentMethods = showSavedPaymentMethods
            }

            /**
             * Tax ID in case the payment is B2B. If tax id validation fails the payment creation
             * will fail
             */
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
             * Optional trial period in days If specified, this value overrides the trial period set
             * in the product's price Must be between 0 and 10000 days
             */
            fun trialPeriodDays(trialPeriodDays: Long?) =
                trialPeriodDays(JsonField.ofNullable(trialPeriodDays))

            /**
             * Alias for [Builder.trialPeriodDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialPeriodDays(trialPeriodDays: Long) = trialPeriodDays(trialPeriodDays as Long?)

            /**
             * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialPeriodDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialPeriodDays(trialPeriodDays: JsonField<Long>) = apply {
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .billing()
             * .customer()
             * .productId()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("billing", billing),
                    checkRequired("customer", customer),
                    checkRequired("productId", productId),
                    checkRequired("quantity", quantity),
                    (allowedPaymentMethodTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    billingCurrency,
                    discountCode,
                    metadata,
                    onDemand,
                    paymentLink,
                    returnUrl,
                    showSavedPaymentMethods,
                    taxId,
                    trialPeriodDays,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billing().validate()
            customer().validate()
            productId()
            quantity()
            allowedPaymentMethodTypes()?.forEach { it.validate() }
            billingCurrency()?.validate()
            discountCode()
            metadata()?.validate()
            onDemand()?.validate()
            paymentLink()
            returnUrl()
            showSavedPaymentMethods()
            taxId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (billing.asKnown()?.validity() ?: 0) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (productId.asKnown() == null) 0 else 1) +
                (if (quantity.asKnown() == null) 0 else 1) +
                (allowedPaymentMethodTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (billingCurrency.asKnown()?.validity() ?: 0) +
                (if (discountCode.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (onDemand.asKnown()?.validity() ?: 0) +
                (if (paymentLink.asKnown() == null) 0 else 1) +
                (if (returnUrl.asKnown() == null) 0 else 1) +
                (if (showSavedPaymentMethods.asKnown() == null) 0 else 1) +
                (if (taxId.asKnown() == null) 0 else 1) +
                (if (trialPeriodDays.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && billing == other.billing && customer == other.customer && productId == other.productId && quantity == other.quantity && allowedPaymentMethodTypes == other.allowedPaymentMethodTypes && billingCurrency == other.billingCurrency && discountCode == other.discountCode && metadata == other.metadata && onDemand == other.onDemand && paymentLink == other.paymentLink && returnUrl == other.returnUrl && showSavedPaymentMethods == other.showSavedPaymentMethods && taxId == other.taxId && trialPeriodDays == other.trialPeriodDays && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billing, customer, productId, quantity, allowedPaymentMethodTypes, billingCurrency, discountCode, metadata, onDemand, paymentLink, returnUrl, showSavedPaymentMethods, taxId, trialPeriodDays, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billing=$billing, customer=$customer, productId=$productId, quantity=$quantity, allowedPaymentMethodTypes=$allowedPaymentMethodTypes, billingCurrency=$billingCurrency, discountCode=$discountCode, metadata=$metadata, onDemand=$onDemand, paymentLink=$paymentLink, returnUrl=$returnUrl, showSavedPaymentMethods=$showSavedPaymentMethods, taxId=$taxId, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
    }

    class AllowedPaymentMethodType
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

            val CREDIT = of("credit")

            val DEBIT = of("debit")

            val UPI_COLLECT = of("upi_collect")

            val UPI_INTENT = of("upi_intent")

            val APPLE_PAY = of("apple_pay")

            val CASHAPP = of("cashapp")

            val GOOGLE_PAY = of("google_pay")

            val MULTIBANCO = of("multibanco")

            val BANCONTACT_CARD = of("bancontact_card")

            val EPS = of("eps")

            val IDEAL = of("ideal")

            val PRZELEWY24 = of("przelewy24")

            val AFFIRM = of("affirm")

            val KLARNA = of("klarna")

            val SEPA = of("sepa")

            val ACH = of("ach")

            val AMAZON_PAY = of("amazon_pay")

            val AFTERPAY_CLEARPAY = of("afterpay_clearpay")

            fun of(value: String) = AllowedPaymentMethodType(JsonField.of(value))
        }

        /** An enum containing [AllowedPaymentMethodType]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
            UPI_COLLECT,
            UPI_INTENT,
            APPLE_PAY,
            CASHAPP,
            GOOGLE_PAY,
            MULTIBANCO,
            BANCONTACT_CARD,
            EPS,
            IDEAL,
            PRZELEWY24,
            AFFIRM,
            KLARNA,
            SEPA,
            ACH,
            AMAZON_PAY,
            AFTERPAY_CLEARPAY,
        }

        /**
         * An enum containing [AllowedPaymentMethodType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AllowedPaymentMethodType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            UPI_COLLECT,
            UPI_INTENT,
            APPLE_PAY,
            CASHAPP,
            GOOGLE_PAY,
            MULTIBANCO,
            BANCONTACT_CARD,
            EPS,
            IDEAL,
            PRZELEWY24,
            AFFIRM,
            KLARNA,
            SEPA,
            ACH,
            AMAZON_PAY,
            AFTERPAY_CLEARPAY,
            /**
             * An enum member indicating that [AllowedPaymentMethodType] was instantiated with an
             * unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                UPI_COLLECT -> Value.UPI_COLLECT
                UPI_INTENT -> Value.UPI_INTENT
                APPLE_PAY -> Value.APPLE_PAY
                CASHAPP -> Value.CASHAPP
                GOOGLE_PAY -> Value.GOOGLE_PAY
                MULTIBANCO -> Value.MULTIBANCO
                BANCONTACT_CARD -> Value.BANCONTACT_CARD
                EPS -> Value.EPS
                IDEAL -> Value.IDEAL
                PRZELEWY24 -> Value.PRZELEWY24
                AFFIRM -> Value.AFFIRM
                KLARNA -> Value.KLARNA
                SEPA -> Value.SEPA
                ACH -> Value.ACH
                AMAZON_PAY -> Value.AMAZON_PAY
                AFTERPAY_CLEARPAY -> Value.AFTERPAY_CLEARPAY
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                UPI_COLLECT -> Known.UPI_COLLECT
                UPI_INTENT -> Known.UPI_INTENT
                APPLE_PAY -> Known.APPLE_PAY
                CASHAPP -> Known.CASHAPP
                GOOGLE_PAY -> Known.GOOGLE_PAY
                MULTIBANCO -> Known.MULTIBANCO
                BANCONTACT_CARD -> Known.BANCONTACT_CARD
                EPS -> Known.EPS
                IDEAL -> Known.IDEAL
                PRZELEWY24 -> Known.PRZELEWY24
                AFFIRM -> Known.AFFIRM
                KLARNA -> Known.KLARNA
                SEPA -> Known.SEPA
                ACH -> Known.ACH
                AMAZON_PAY -> Known.AMAZON_PAY
                AFTERPAY_CLEARPAY -> Known.AFTERPAY_CLEARPAY
                else ->
                    throw DodoPaymentsInvalidDataException(
                        "Unknown AllowedPaymentMethodType: $value"
                    )
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

        fun validate(): AllowedPaymentMethodType = apply {
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

            return /* spotless:off */ other is AllowedPaymentMethodType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class BillingCurrency @JsonCreator private constructor(private val value: JsonField<String>) :
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

            fun of(value: String) = BillingCurrency(JsonField.of(value))
        }

        /** An enum containing [BillingCurrency]'s known values. */
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
         * An enum containing [BillingCurrency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingCurrency] can contain an unknown value in a couple of cases:
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
            /**
             * An enum member indicating that [BillingCurrency] was instantiated with an unknown
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
                else -> throw DodoPaymentsInvalidDataException("Unknown BillingCurrency: $value")
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

        fun validate(): BillingCurrency = apply {
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

            return /* spotless:off */ other is BillingCurrency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

    class OnDemand
    private constructor(
        private val mandateOnly: JsonField<Boolean>,
        private val productPrice: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mandate_only")
            @ExcludeMissing
            mandateOnly: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("product_price")
            @ExcludeMissing
            productPrice: JsonField<Long> = JsonMissing.of(),
        ) : this(mandateOnly, productPrice, mutableMapOf())

        /**
         * If set as True, does not perform any charge and only authorizes payment method details
         * for future use.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mandateOnly(): Boolean = mandateOnly.getRequired("mandate_only")

        /**
         * Product price for the initial charge to customer If not specified the stored price of the
         * product will be used Represented in the lowest denomination of the currency (e.g., cents
         * for USD). For example, to charge $1.00, pass `100`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun productPrice(): Long? = productPrice.getNullable("product_price")

        /**
         * Returns the raw JSON value of [mandateOnly].
         *
         * Unlike [mandateOnly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mandate_only")
        @ExcludeMissing
        fun _mandateOnly(): JsonField<Boolean> = mandateOnly

        /**
         * Returns the raw JSON value of [productPrice].
         *
         * Unlike [productPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_price")
        @ExcludeMissing
        fun _productPrice(): JsonField<Long> = productPrice

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
             * Returns a mutable builder for constructing an instance of [OnDemand].
             *
             * The following fields are required:
             * ```kotlin
             * .mandateOnly()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [OnDemand]. */
        class Builder internal constructor() {

            private var mandateOnly: JsonField<Boolean>? = null
            private var productPrice: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(onDemand: OnDemand) = apply {
                mandateOnly = onDemand.mandateOnly
                productPrice = onDemand.productPrice
                additionalProperties = onDemand.additionalProperties.toMutableMap()
            }

            /**
             * If set as True, does not perform any charge and only authorizes payment method
             * details for future use.
             */
            fun mandateOnly(mandateOnly: Boolean) = mandateOnly(JsonField.of(mandateOnly))

            /**
             * Sets [Builder.mandateOnly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mandateOnly] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mandateOnly(mandateOnly: JsonField<Boolean>) = apply {
                this.mandateOnly = mandateOnly
            }

            /**
             * Product price for the initial charge to customer If not specified the stored price of
             * the product will be used Represented in the lowest denomination of the currency
             * (e.g., cents for USD). For example, to charge $1.00, pass `100`.
             */
            fun productPrice(productPrice: Long?) = productPrice(JsonField.ofNullable(productPrice))

            /**
             * Alias for [Builder.productPrice].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun productPrice(productPrice: Long) = productPrice(productPrice as Long?)

            /**
             * Sets [Builder.productPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productPrice] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productPrice(productPrice: JsonField<Long>) = apply {
                this.productPrice = productPrice
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
             * Returns an immutable instance of [OnDemand].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .mandateOnly()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OnDemand =
                OnDemand(
                    checkRequired("mandateOnly", mandateOnly),
                    productPrice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OnDemand = apply {
            if (validated) {
                return@apply
            }

            mandateOnly()
            productPrice()
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
            (if (mandateOnly.asKnown() == null) 0 else 1) +
                (if (productPrice.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OnDemand && mandateOnly == other.mandateOnly && productPrice == other.productPrice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(mandateOnly, productPrice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OnDemand{mandateOnly=$mandateOnly, productPrice=$productPrice, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
