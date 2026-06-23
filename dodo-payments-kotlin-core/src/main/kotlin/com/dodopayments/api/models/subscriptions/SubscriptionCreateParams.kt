// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

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
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerRequest
import com.dodopayments.api.models.payments.NewCustomer
import com.dodopayments.api.models.payments.OneTimeProductCartItem
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

@Deprecated("deprecated")
class SubscriptionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Billing address information for the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billing(): BillingAddress = body.billing()

    /**
     * Customer details for the subscription
     *
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
    fun quantity(): Int = body.quantity()

    /**
     * Attach addons to this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addons(): List<AttachAddon>? = body.addons()

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
    fun allowedPaymentMethodTypes(): List<PaymentMethodTypes>? = body.allowedPaymentMethodTypes()

    /**
     * Fix the currency in which the end customer is billed. If Dodo Payments cannot support that
     * currency for this transaction, it will not proceed
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billingCurrency(): Currency? = body.billingCurrency()

    /**
     * Optional business / legal name associated with the tax id. When provided together with a
     * valid tax id for a B2B purchase, this name is rendered on the invoice instead of the
     * customer's personal name.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerBusinessName(): String? = body.customerBusinessName()

    /**
     * DEPRECATED: Use discount_codes instead. Cannot be used together with discount_codes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("Use `discount_id` instead.") fun discountCode(): String? = body.discountCode()

    /**
     * Stacked discount codes to apply, in order of application. Max 20. Cannot be used together
     * with discount_code.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountCodes(): List<String>? = body.discountCodes()

    /**
     * Override merchant default 3DS behaviour for this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun force3ds(): Boolean? = body.force3ds()

    /**
     * Override the merchant-level mandate floor (in INR paise) for INR e-mandates on Indian-card
     * recurring payments. The mandate amount sent to the processor is `max(this_floor,
     * actual_billing_amount)`, so this is effectively the customer-facing authorization ceiling
     * whenever billing is lower. When unset, the merchant setting applies; when that's also unset,
     * the system default of ₹15,000 applies.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mandateMinAmountInrPaise(): Int? = body.mandateMinAmountInrPaise()

    /**
     * Additional metadata for the subscription Defaults to empty if not specified
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun onDemand(): OnDemandSubscription? = body.onDemand()

    /**
     * List of one time products that will be bundled with the first payment for this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun oneTimeProductCart(): List<OneTimeProductCartItem>? = body.oneTimeProductCart()

    /**
     * If true, generates a payment link. Defaults to false if not specified.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentLink(): Boolean? = body.paymentLink()

    /**
     * Optional payment method ID to use for this subscription. If provided, customer_id must also
     * be provided (via AttachExistingCustomer). The payment method will be validated for
     * eligibility with the subscription's currency.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethodId(): String? = body.paymentMethodId()

    /**
     * If true, redirects the customer immediately after payment completion False by default
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun redirectImmediately(): Boolean? = body.redirectImmediately()

    /**
     * If true, the customer's phone number is required to create this subscription. Typically set
     * alongside `payment_link=true` so merchants can enforce phone collection on the hosted payment
     * page. Defaults to false.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun requirePhoneNumber(): Boolean? = body.requirePhoneNumber()

    /**
     * Optional URL to redirect after successful subscription creation
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnUrl(): String? = body.returnUrl()

    /**
     * If true, returns a shortened payment link. Defaults to false if not specified.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun shortLink(): Boolean? = body.shortLink()

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
    fun trialPeriodDays(): Int? = body.trialPeriodDays()

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
    fun _quantity(): JsonField<Int> = body._quantity()

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addons(): JsonField<List<AttachAddon>> = body._addons()

    /**
     * Returns the raw JSON value of [allowedPaymentMethodTypes].
     *
     * Unlike [allowedPaymentMethodTypes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowedPaymentMethodTypes(): JsonField<List<PaymentMethodTypes>> =
        body._allowedPaymentMethodTypes()

    /**
     * Returns the raw JSON value of [billingCurrency].
     *
     * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingCurrency(): JsonField<Currency> = body._billingCurrency()

    /**
     * Returns the raw JSON value of [customerBusinessName].
     *
     * Unlike [customerBusinessName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _customerBusinessName(): JsonField<String> = body._customerBusinessName()

    /**
     * Returns the raw JSON value of [discountCode].
     *
     * Unlike [discountCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("Use `discount_id` instead.")
    fun _discountCode(): JsonField<String> = body._discountCode()

    /**
     * Returns the raw JSON value of [discountCodes].
     *
     * Unlike [discountCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _discountCodes(): JsonField<List<String>> = body._discountCodes()

    /**
     * Returns the raw JSON value of [force3ds].
     *
     * Unlike [force3ds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _force3ds(): JsonField<Boolean> = body._force3ds()

    /**
     * Returns the raw JSON value of [mandateMinAmountInrPaise].
     *
     * Unlike [mandateMinAmountInrPaise], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _mandateMinAmountInrPaise(): JsonField<Int> = body._mandateMinAmountInrPaise()

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
    fun _onDemand(): JsonField<OnDemandSubscription> = body._onDemand()

    /**
     * Returns the raw JSON value of [oneTimeProductCart].
     *
     * Unlike [oneTimeProductCart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _oneTimeProductCart(): JsonField<List<OneTimeProductCartItem>> = body._oneTimeProductCart()

    /**
     * Returns the raw JSON value of [paymentLink].
     *
     * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentLink(): JsonField<Boolean> = body._paymentLink()

    /**
     * Returns the raw JSON value of [paymentMethodId].
     *
     * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentMethodId(): JsonField<String> = body._paymentMethodId()

    /**
     * Returns the raw JSON value of [redirectImmediately].
     *
     * Unlike [redirectImmediately], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _redirectImmediately(): JsonField<Boolean> = body._redirectImmediately()

    /**
     * Returns the raw JSON value of [requirePhoneNumber].
     *
     * Unlike [requirePhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _requirePhoneNumber(): JsonField<Boolean> = body._requirePhoneNumber()

    /**
     * Returns the raw JSON value of [returnUrl].
     *
     * Unlike [returnUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _returnUrl(): JsonField<String> = body._returnUrl()

    /**
     * Returns the raw JSON value of [shortLink].
     *
     * Unlike [shortLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shortLink(): JsonField<Boolean> = body._shortLink()

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
    fun _trialPeriodDays(): JsonField<Int> = body._trialPeriodDays()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
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
         * - [addons]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Billing address information for the subscription */
        fun billing(billing: BillingAddress) = apply { body.billing(billing) }

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billing(billing: JsonField<BillingAddress>) = apply { body.billing(billing) }

        /** Customer details for the subscription */
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

        /** Alias for calling [customer] with `CustomerRequest.ofNewCustomer(newCustomer)`. */
        fun customer(newCustomer: NewCustomer) = apply { body.customer(newCustomer) }

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
        fun quantity(quantity: Int) = apply { body.quantity(quantity) }

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { body.quantity(quantity) }

        /** Attach addons to this subscription */
        fun addons(addons: List<AttachAddon>?) = apply { body.addons(addons) }

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<AttachAddon>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addons(addons: JsonField<List<AttachAddon>>) = apply { body.addons(addons) }

        /**
         * Adds a single [AttachAddon] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: AttachAddon) = apply { body.addAddon(addon) }

        /**
         * List of payment methods allowed during checkout.
         *
         * Customers will **never** see payment methods that are **not** in this list. However,
         * adding a method here **does not guarantee** customers will see it. Availability still
         * depends on other factors (e.g., customer location, merchant settings).
         */
        fun allowedPaymentMethodTypes(allowedPaymentMethodTypes: List<PaymentMethodTypes>?) =
            apply {
                body.allowedPaymentMethodTypes(allowedPaymentMethodTypes)
            }

        /**
         * Sets [Builder.allowedPaymentMethodTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPaymentMethodTypes] with a well-typed
         * `List<PaymentMethodTypes>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun allowedPaymentMethodTypes(
            allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>
        ) = apply { body.allowedPaymentMethodTypes(allowedPaymentMethodTypes) }

        /**
         * Adds a single [PaymentMethodTypes] to [allowedPaymentMethodTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedPaymentMethodType(allowedPaymentMethodType: PaymentMethodTypes) = apply {
            body.addAllowedPaymentMethodType(allowedPaymentMethodType)
        }

        /**
         * Fix the currency in which the end customer is billed. If Dodo Payments cannot support
         * that currency for this transaction, it will not proceed
         */
        fun billingCurrency(billingCurrency: Currency?) = apply {
            body.billingCurrency(billingCurrency)
        }

        /**
         * Sets [Builder.billingCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingCurrency(billingCurrency: JsonField<Currency>) = apply {
            body.billingCurrency(billingCurrency)
        }

        /**
         * Optional business / legal name associated with the tax id. When provided together with a
         * valid tax id for a B2B purchase, this name is rendered on the invoice instead of the
         * customer's personal name.
         */
        fun customerBusinessName(customerBusinessName: String?) = apply {
            body.customerBusinessName(customerBusinessName)
        }

        /**
         * Sets [Builder.customerBusinessName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerBusinessName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerBusinessName(customerBusinessName: JsonField<String>) = apply {
            body.customerBusinessName(customerBusinessName)
        }

        /** DEPRECATED: Use discount_codes instead. Cannot be used together with discount_codes. */
        @Deprecated("Use `discount_id` instead.")
        fun discountCode(discountCode: String?) = apply { body.discountCode(discountCode) }

        /**
         * Sets [Builder.discountCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("Use `discount_id` instead.")
        fun discountCode(discountCode: JsonField<String>) = apply {
            body.discountCode(discountCode)
        }

        /**
         * Stacked discount codes to apply, in order of application. Max 20. Cannot be used together
         * with discount_code.
         */
        fun discountCodes(discountCodes: List<String>?) = apply {
            body.discountCodes(discountCodes)
        }

        /**
         * Sets [Builder.discountCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountCodes(discountCodes: JsonField<List<String>>) = apply {
            body.discountCodes(discountCodes)
        }

        /**
         * Adds a single [String] to [discountCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscountCode(discountCode: String) = apply { body.addDiscountCode(discountCode) }

        /** Override merchant default 3DS behaviour for this subscription */
        fun force3ds(force3ds: Boolean?) = apply { body.force3ds(force3ds) }

        /**
         * Alias for [Builder.force3ds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun force3ds(force3ds: Boolean) = force3ds(force3ds as Boolean?)

        /**
         * Sets [Builder.force3ds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.force3ds] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun force3ds(force3ds: JsonField<Boolean>) = apply { body.force3ds(force3ds) }

        /**
         * Override the merchant-level mandate floor (in INR paise) for INR e-mandates on
         * Indian-card recurring payments. The mandate amount sent to the processor is
         * `max(this_floor, actual_billing_amount)`, so this is effectively the customer-facing
         * authorization ceiling whenever billing is lower. When unset, the merchant setting
         * applies; when that's also unset, the system default of ₹15,000 applies.
         */
        fun mandateMinAmountInrPaise(mandateMinAmountInrPaise: Int?) = apply {
            body.mandateMinAmountInrPaise(mandateMinAmountInrPaise)
        }

        /**
         * Alias for [Builder.mandateMinAmountInrPaise].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun mandateMinAmountInrPaise(mandateMinAmountInrPaise: Int) =
            mandateMinAmountInrPaise(mandateMinAmountInrPaise as Int?)

        /**
         * Sets [Builder.mandateMinAmountInrPaise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mandateMinAmountInrPaise] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mandateMinAmountInrPaise(mandateMinAmountInrPaise: JsonField<Int>) = apply {
            body.mandateMinAmountInrPaise(mandateMinAmountInrPaise)
        }

        /** Additional metadata for the subscription Defaults to empty if not specified */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun onDemand(onDemand: OnDemandSubscription?) = apply { body.onDemand(onDemand) }

        /**
         * Sets [Builder.onDemand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onDemand] with a well-typed [OnDemandSubscription] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onDemand(onDemand: JsonField<OnDemandSubscription>) = apply { body.onDemand(onDemand) }

        /**
         * List of one time products that will be bundled with the first payment for this
         * subscription
         */
        fun oneTimeProductCart(oneTimeProductCart: List<OneTimeProductCartItem>?) = apply {
            body.oneTimeProductCart(oneTimeProductCart)
        }

        /**
         * Sets [Builder.oneTimeProductCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneTimeProductCart] with a well-typed
         * `List<OneTimeProductCartItem>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun oneTimeProductCart(oneTimeProductCart: JsonField<List<OneTimeProductCartItem>>) =
            apply {
                body.oneTimeProductCart(oneTimeProductCart)
            }

        /**
         * Adds a single [OneTimeProductCartItem] to [Builder.oneTimeProductCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOneTimeProductCart(oneTimeProductCart: OneTimeProductCartItem) = apply {
            body.addOneTimeProductCart(oneTimeProductCart)
        }

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

        /**
         * Optional payment method ID to use for this subscription. If provided, customer_id must
         * also be provided (via AttachExistingCustomer). The payment method will be validated for
         * eligibility with the subscription's currency.
         */
        fun paymentMethodId(paymentMethodId: String?) = apply {
            body.paymentMethodId(paymentMethodId)
        }

        /**
         * Sets [Builder.paymentMethodId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethodId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentMethodId(paymentMethodId: JsonField<String>) = apply {
            body.paymentMethodId(paymentMethodId)
        }

        /** If true, redirects the customer immediately after payment completion False by default */
        fun redirectImmediately(redirectImmediately: Boolean) = apply {
            body.redirectImmediately(redirectImmediately)
        }

        /**
         * Sets [Builder.redirectImmediately] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectImmediately] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redirectImmediately(redirectImmediately: JsonField<Boolean>) = apply {
            body.redirectImmediately(redirectImmediately)
        }

        /**
         * If true, the customer's phone number is required to create this subscription. Typically
         * set alongside `payment_link=true` so merchants can enforce phone collection on the hosted
         * payment page. Defaults to false.
         */
        fun requirePhoneNumber(requirePhoneNumber: Boolean) = apply {
            body.requirePhoneNumber(requirePhoneNumber)
        }

        /**
         * Sets [Builder.requirePhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requirePhoneNumber] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requirePhoneNumber(requirePhoneNumber: JsonField<Boolean>) = apply {
            body.requirePhoneNumber(requirePhoneNumber)
        }

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

        /** If true, returns a shortened payment link. Defaults to false if not specified. */
        fun shortLink(shortLink: Boolean?) = apply { body.shortLink(shortLink) }

        /**
         * Alias for [Builder.shortLink].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun shortLink(shortLink: Boolean) = shortLink(shortLink as Boolean?)

        /**
         * Sets [Builder.shortLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortLink] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortLink(shortLink: JsonField<Boolean>) = apply { body.shortLink(shortLink) }

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
        fun trialPeriodDays(trialPeriodDays: Int?) = apply { body.trialPeriodDays(trialPeriodDays) }

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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billing: JsonField<BillingAddress>,
        private val customer: JsonField<CustomerRequest>,
        private val productId: JsonField<String>,
        private val quantity: JsonField<Int>,
        private val addons: JsonField<List<AttachAddon>>,
        private val allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>,
        private val billingCurrency: JsonField<Currency>,
        private val customerBusinessName: JsonField<String>,
        private val discountCode: JsonField<String>,
        private val discountCodes: JsonField<List<String>>,
        private val force3ds: JsonField<Boolean>,
        private val mandateMinAmountInrPaise: JsonField<Int>,
        private val metadata: JsonField<Metadata>,
        private val onDemand: JsonField<OnDemandSubscription>,
        private val oneTimeProductCart: JsonField<List<OneTimeProductCartItem>>,
        private val paymentLink: JsonField<Boolean>,
        private val paymentMethodId: JsonField<String>,
        private val redirectImmediately: JsonField<Boolean>,
        private val requirePhoneNumber: JsonField<Boolean>,
        private val returnUrl: JsonField<String>,
        private val shortLink: JsonField<Boolean>,
        private val showSavedPaymentMethods: JsonField<Boolean>,
        private val taxId: JsonField<String>,
        private val trialPeriodDays: JsonField<Int>,
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
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("addons")
            @ExcludeMissing
            addons: JsonField<List<AttachAddon>> = JsonMissing.of(),
            @JsonProperty("allowed_payment_method_types")
            @ExcludeMissing
            allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>> = JsonMissing.of(),
            @JsonProperty("billing_currency")
            @ExcludeMissing
            billingCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("customer_business_name")
            @ExcludeMissing
            customerBusinessName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_code")
            @ExcludeMissing
            discountCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_codes")
            @ExcludeMissing
            discountCodes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("force_3ds")
            @ExcludeMissing
            force3ds: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("mandate_min_amount_inr_paise")
            @ExcludeMissing
            mandateMinAmountInrPaise: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("on_demand")
            @ExcludeMissing
            onDemand: JsonField<OnDemandSubscription> = JsonMissing.of(),
            @JsonProperty("one_time_product_cart")
            @ExcludeMissing
            oneTimeProductCart: JsonField<List<OneTimeProductCartItem>> = JsonMissing.of(),
            @JsonProperty("payment_link")
            @ExcludeMissing
            paymentLink: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("payment_method_id")
            @ExcludeMissing
            paymentMethodId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("redirect_immediately")
            @ExcludeMissing
            redirectImmediately: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("require_phone_number")
            @ExcludeMissing
            requirePhoneNumber: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("return_url")
            @ExcludeMissing
            returnUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("short_link")
            @ExcludeMissing
            shortLink: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("show_saved_payment_methods")
            @ExcludeMissing
            showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            trialPeriodDays: JsonField<Int> = JsonMissing.of(),
        ) : this(
            billing,
            customer,
            productId,
            quantity,
            addons,
            allowedPaymentMethodTypes,
            billingCurrency,
            customerBusinessName,
            discountCode,
            discountCodes,
            force3ds,
            mandateMinAmountInrPaise,
            metadata,
            onDemand,
            oneTimeProductCart,
            paymentLink,
            paymentMethodId,
            redirectImmediately,
            requirePhoneNumber,
            returnUrl,
            shortLink,
            showSavedPaymentMethods,
            taxId,
            trialPeriodDays,
            mutableMapOf(),
        )

        /**
         * Billing address information for the subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billing(): BillingAddress = billing.getRequired("billing")

        /**
         * Customer details for the subscription
         *
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
        fun quantity(): Int = quantity.getRequired("quantity")

        /**
         * Attach addons to this subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addons(): List<AttachAddon>? = addons.getNullable("addons")

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
        fun allowedPaymentMethodTypes(): List<PaymentMethodTypes>? =
            allowedPaymentMethodTypes.getNullable("allowed_payment_method_types")

        /**
         * Fix the currency in which the end customer is billed. If Dodo Payments cannot support
         * that currency for this transaction, it will not proceed
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun billingCurrency(): Currency? = billingCurrency.getNullable("billing_currency")

        /**
         * Optional business / legal name associated with the tax id. When provided together with a
         * valid tax id for a B2B purchase, this name is rendered on the invoice instead of the
         * customer's personal name.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerBusinessName(): String? =
            customerBusinessName.getNullable("customer_business_name")

        /**
         * DEPRECATED: Use discount_codes instead. Cannot be used together with discount_codes.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("Use `discount_id` instead.")
        fun discountCode(): String? = discountCode.getNullable("discount_code")

        /**
         * Stacked discount codes to apply, in order of application. Max 20. Cannot be used together
         * with discount_code.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountCodes(): List<String>? = discountCodes.getNullable("discount_codes")

        /**
         * Override merchant default 3DS behaviour for this subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun force3ds(): Boolean? = force3ds.getNullable("force_3ds")

        /**
         * Override the merchant-level mandate floor (in INR paise) for INR e-mandates on
         * Indian-card recurring payments. The mandate amount sent to the processor is
         * `max(this_floor, actual_billing_amount)`, so this is effectively the customer-facing
         * authorization ceiling whenever billing is lower. When unset, the merchant setting
         * applies; when that's also unset, the system default of ₹15,000 applies.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mandateMinAmountInrPaise(): Int? =
            mandateMinAmountInrPaise.getNullable("mandate_min_amount_inr_paise")

        /**
         * Additional metadata for the subscription Defaults to empty if not specified
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun onDemand(): OnDemandSubscription? = onDemand.getNullable("on_demand")

        /**
         * List of one time products that will be bundled with the first payment for this
         * subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun oneTimeProductCart(): List<OneTimeProductCartItem>? =
            oneTimeProductCart.getNullable("one_time_product_cart")

        /**
         * If true, generates a payment link. Defaults to false if not specified.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentLink(): Boolean? = paymentLink.getNullable("payment_link")

        /**
         * Optional payment method ID to use for this subscription. If provided, customer_id must
         * also be provided (via AttachExistingCustomer). The payment method will be validated for
         * eligibility with the subscription's currency.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentMethodId(): String? = paymentMethodId.getNullable("payment_method_id")

        /**
         * If true, redirects the customer immediately after payment completion False by default
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun redirectImmediately(): Boolean? =
            redirectImmediately.getNullable("redirect_immediately")

        /**
         * If true, the customer's phone number is required to create this subscription. Typically
         * set alongside `payment_link=true` so merchants can enforce phone collection on the hosted
         * payment page. Defaults to false.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun requirePhoneNumber(): Boolean? = requirePhoneNumber.getNullable("require_phone_number")

        /**
         * Optional URL to redirect after successful subscription creation
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun returnUrl(): String? = returnUrl.getNullable("return_url")

        /**
         * If true, returns a shortened payment link. Defaults to false if not specified.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shortLink(): Boolean? = shortLink.getNullable("short_link")

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
        fun trialPeriodDays(): Int? = trialPeriodDays.getNullable("trial_period_days")

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
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

        /**
         * Returns the raw JSON value of [addons].
         *
         * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<AttachAddon>> = addons

        /**
         * Returns the raw JSON value of [allowedPaymentMethodTypes].
         *
         * Unlike [allowedPaymentMethodTypes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_payment_method_types")
        @ExcludeMissing
        fun _allowedPaymentMethodTypes(): JsonField<List<PaymentMethodTypes>> =
            allowedPaymentMethodTypes

        /**
         * Returns the raw JSON value of [billingCurrency].
         *
         * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_currency")
        @ExcludeMissing
        fun _billingCurrency(): JsonField<Currency> = billingCurrency

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
         * Returns the raw JSON value of [discountCode].
         *
         * Unlike [discountCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("Use `discount_id` instead.")
        @JsonProperty("discount_code")
        @ExcludeMissing
        fun _discountCode(): JsonField<String> = discountCode

        /**
         * Returns the raw JSON value of [discountCodes].
         *
         * Unlike [discountCodes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("discount_codes")
        @ExcludeMissing
        fun _discountCodes(): JsonField<List<String>> = discountCodes

        /**
         * Returns the raw JSON value of [force3ds].
         *
         * Unlike [force3ds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("force_3ds") @ExcludeMissing fun _force3ds(): JsonField<Boolean> = force3ds

        /**
         * Returns the raw JSON value of [mandateMinAmountInrPaise].
         *
         * Unlike [mandateMinAmountInrPaise], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("mandate_min_amount_inr_paise")
        @ExcludeMissing
        fun _mandateMinAmountInrPaise(): JsonField<Int> = mandateMinAmountInrPaise

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
        @JsonProperty("on_demand")
        @ExcludeMissing
        fun _onDemand(): JsonField<OnDemandSubscription> = onDemand

        /**
         * Returns the raw JSON value of [oneTimeProductCart].
         *
         * Unlike [oneTimeProductCart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("one_time_product_cart")
        @ExcludeMissing
        fun _oneTimeProductCart(): JsonField<List<OneTimeProductCartItem>> = oneTimeProductCart

        /**
         * Returns the raw JSON value of [paymentLink].
         *
         * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_link")
        @ExcludeMissing
        fun _paymentLink(): JsonField<Boolean> = paymentLink

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
         * Returns the raw JSON value of [redirectImmediately].
         *
         * Unlike [redirectImmediately], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("redirect_immediately")
        @ExcludeMissing
        fun _redirectImmediately(): JsonField<Boolean> = redirectImmediately

        /**
         * Returns the raw JSON value of [requirePhoneNumber].
         *
         * Unlike [requirePhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("require_phone_number")
        @ExcludeMissing
        fun _requirePhoneNumber(): JsonField<Boolean> = requirePhoneNumber

        /**
         * Returns the raw JSON value of [returnUrl].
         *
         * Unlike [returnUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("return_url") @ExcludeMissing fun _returnUrl(): JsonField<String> = returnUrl

        /**
         * Returns the raw JSON value of [shortLink].
         *
         * Unlike [shortLink], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("short_link") @ExcludeMissing fun _shortLink(): JsonField<Boolean> = shortLink

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
            private var quantity: JsonField<Int>? = null
            private var addons: JsonField<MutableList<AttachAddon>>? = null
            private var allowedPaymentMethodTypes: JsonField<MutableList<PaymentMethodTypes>>? =
                null
            private var billingCurrency: JsonField<Currency> = JsonMissing.of()
            private var customerBusinessName: JsonField<String> = JsonMissing.of()
            private var discountCode: JsonField<String> = JsonMissing.of()
            private var discountCodes: JsonField<MutableList<String>>? = null
            private var force3ds: JsonField<Boolean> = JsonMissing.of()
            private var mandateMinAmountInrPaise: JsonField<Int> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var onDemand: JsonField<OnDemandSubscription> = JsonMissing.of()
            private var oneTimeProductCart: JsonField<MutableList<OneTimeProductCartItem>>? = null
            private var paymentLink: JsonField<Boolean> = JsonMissing.of()
            private var paymentMethodId: JsonField<String> = JsonMissing.of()
            private var redirectImmediately: JsonField<Boolean> = JsonMissing.of()
            private var requirePhoneNumber: JsonField<Boolean> = JsonMissing.of()
            private var returnUrl: JsonField<String> = JsonMissing.of()
            private var shortLink: JsonField<Boolean> = JsonMissing.of()
            private var showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var trialPeriodDays: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                billing = body.billing
                customer = body.customer
                productId = body.productId
                quantity = body.quantity
                addons = body.addons.map { it.toMutableList() }
                allowedPaymentMethodTypes =
                    body.allowedPaymentMethodTypes.map { it.toMutableList() }
                billingCurrency = body.billingCurrency
                customerBusinessName = body.customerBusinessName
                discountCode = body.discountCode
                discountCodes = body.discountCodes.map { it.toMutableList() }
                force3ds = body.force3ds
                mandateMinAmountInrPaise = body.mandateMinAmountInrPaise
                metadata = body.metadata
                onDemand = body.onDemand
                oneTimeProductCart = body.oneTimeProductCart.map { it.toMutableList() }
                paymentLink = body.paymentLink
                paymentMethodId = body.paymentMethodId
                redirectImmediately = body.redirectImmediately
                requirePhoneNumber = body.requirePhoneNumber
                returnUrl = body.returnUrl
                shortLink = body.shortLink
                showSavedPaymentMethods = body.showSavedPaymentMethods
                taxId = body.taxId
                trialPeriodDays = body.trialPeriodDays
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Billing address information for the subscription */
            fun billing(billing: BillingAddress) = billing(JsonField.of(billing))

            /**
             * Sets [Builder.billing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

            /** Customer details for the subscription */
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

            /** Alias for calling [customer] with `CustomerRequest.ofNewCustomer(newCustomer)`. */
            fun customer(newCustomer: NewCustomer) =
                customer(CustomerRequest.ofNewCustomer(newCustomer))

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
            fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

            /** Attach addons to this subscription */
            fun addons(addons: List<AttachAddon>?) = addons(JsonField.ofNullable(addons))

            /**
             * Sets [Builder.addons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addons] with a well-typed `List<AttachAddon>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addons(addons: JsonField<List<AttachAddon>>) = apply {
                this.addons = addons.map { it.toMutableList() }
            }

            /**
             * Adds a single [AttachAddon] to [addons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddon(addon: AttachAddon) = apply {
                addons =
                    (addons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addons", it).add(addon)
                    }
            }

            /**
             * List of payment methods allowed during checkout.
             *
             * Customers will **never** see payment methods that are **not** in this list. However,
             * adding a method here **does not guarantee** customers will see it. Availability still
             * depends on other factors (e.g., customer location, merchant settings).
             */
            fun allowedPaymentMethodTypes(allowedPaymentMethodTypes: List<PaymentMethodTypes>?) =
                allowedPaymentMethodTypes(JsonField.ofNullable(allowedPaymentMethodTypes))

            /**
             * Sets [Builder.allowedPaymentMethodTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedPaymentMethodTypes] with a well-typed
             * `List<PaymentMethodTypes>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun allowedPaymentMethodTypes(
                allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>
            ) = apply {
                this.allowedPaymentMethodTypes = allowedPaymentMethodTypes.map {
                    it.toMutableList()
                }
            }

            /**
             * Adds a single [PaymentMethodTypes] to [allowedPaymentMethodTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedPaymentMethodType(allowedPaymentMethodType: PaymentMethodTypes) = apply {
                allowedPaymentMethodTypes =
                    (allowedPaymentMethodTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedPaymentMethodTypes", it).add(allowedPaymentMethodType)
                    }
            }

            /**
             * Fix the currency in which the end customer is billed. If Dodo Payments cannot support
             * that currency for this transaction, it will not proceed
             */
            fun billingCurrency(billingCurrency: Currency?) =
                billingCurrency(JsonField.ofNullable(billingCurrency))

            /**
             * Sets [Builder.billingCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCurrency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingCurrency(billingCurrency: JsonField<Currency>) = apply {
                this.billingCurrency = billingCurrency
            }

            /**
             * Optional business / legal name associated with the tax id. When provided together
             * with a valid tax id for a B2B purchase, this name is rendered on the invoice instead
             * of the customer's personal name.
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

            /**
             * DEPRECATED: Use discount_codes instead. Cannot be used together with discount_codes.
             */
            @Deprecated("Use `discount_id` instead.")
            fun discountCode(discountCode: String?) =
                discountCode(JsonField.ofNullable(discountCode))

            /**
             * Sets [Builder.discountCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("Use `discount_id` instead.")
            fun discountCode(discountCode: JsonField<String>) = apply {
                this.discountCode = discountCode
            }

            /**
             * Stacked discount codes to apply, in order of application. Max 20. Cannot be used
             * together with discount_code.
             */
            fun discountCodes(discountCodes: List<String>?) =
                discountCodes(JsonField.ofNullable(discountCodes))

            /**
             * Sets [Builder.discountCodes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountCodes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun discountCodes(discountCodes: JsonField<List<String>>) = apply {
                this.discountCodes = discountCodes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [discountCodes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiscountCode(discountCode: String) = apply {
                discountCodes =
                    (discountCodes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discountCodes", it).add(discountCode)
                    }
            }

            /** Override merchant default 3DS behaviour for this subscription */
            fun force3ds(force3ds: Boolean?) = force3ds(JsonField.ofNullable(force3ds))

            /**
             * Alias for [Builder.force3ds].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun force3ds(force3ds: Boolean) = force3ds(force3ds as Boolean?)

            /**
             * Sets [Builder.force3ds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.force3ds] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun force3ds(force3ds: JsonField<Boolean>) = apply { this.force3ds = force3ds }

            /**
             * Override the merchant-level mandate floor (in INR paise) for INR e-mandates on
             * Indian-card recurring payments. The mandate amount sent to the processor is
             * `max(this_floor, actual_billing_amount)`, so this is effectively the customer-facing
             * authorization ceiling whenever billing is lower. When unset, the merchant setting
             * applies; when that's also unset, the system default of ₹15,000 applies.
             */
            fun mandateMinAmountInrPaise(mandateMinAmountInrPaise: Int?) =
                mandateMinAmountInrPaise(JsonField.ofNullable(mandateMinAmountInrPaise))

            /**
             * Alias for [Builder.mandateMinAmountInrPaise].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun mandateMinAmountInrPaise(mandateMinAmountInrPaise: Int) =
                mandateMinAmountInrPaise(mandateMinAmountInrPaise as Int?)

            /**
             * Sets [Builder.mandateMinAmountInrPaise] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mandateMinAmountInrPaise] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mandateMinAmountInrPaise(mandateMinAmountInrPaise: JsonField<Int>) = apply {
                this.mandateMinAmountInrPaise = mandateMinAmountInrPaise
            }

            /** Additional metadata for the subscription Defaults to empty if not specified */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun onDemand(onDemand: OnDemandSubscription?) = onDemand(JsonField.ofNullable(onDemand))

            /**
             * Sets [Builder.onDemand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onDemand] with a well-typed [OnDemandSubscription]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun onDemand(onDemand: JsonField<OnDemandSubscription>) = apply {
                this.onDemand = onDemand
            }

            /**
             * List of one time products that will be bundled with the first payment for this
             * subscription
             */
            fun oneTimeProductCart(oneTimeProductCart: List<OneTimeProductCartItem>?) =
                oneTimeProductCart(JsonField.ofNullable(oneTimeProductCart))

            /**
             * Sets [Builder.oneTimeProductCart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oneTimeProductCart] with a well-typed
             * `List<OneTimeProductCartItem>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun oneTimeProductCart(oneTimeProductCart: JsonField<List<OneTimeProductCartItem>>) =
                apply {
                    this.oneTimeProductCart = oneTimeProductCart.map { it.toMutableList() }
                }

            /**
             * Adds a single [OneTimeProductCartItem] to [Builder.oneTimeProductCart].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOneTimeProductCart(oneTimeProductCart: OneTimeProductCartItem) = apply {
                this.oneTimeProductCart =
                    (this.oneTimeProductCart ?: JsonField.of(mutableListOf())).also {
                        checkKnown("oneTimeProductCart", it).add(oneTimeProductCart)
                    }
            }

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

            /**
             * Optional payment method ID to use for this subscription. If provided, customer_id
             * must also be provided (via AttachExistingCustomer). The payment method will be
             * validated for eligibility with the subscription's currency.
             */
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

            /**
             * If true, redirects the customer immediately after payment completion False by default
             */
            fun redirectImmediately(redirectImmediately: Boolean) =
                redirectImmediately(JsonField.of(redirectImmediately))

            /**
             * Sets [Builder.redirectImmediately] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirectImmediately] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun redirectImmediately(redirectImmediately: JsonField<Boolean>) = apply {
                this.redirectImmediately = redirectImmediately
            }

            /**
             * If true, the customer's phone number is required to create this subscription.
             * Typically set alongside `payment_link=true` so merchants can enforce phone collection
             * on the hosted payment page. Defaults to false.
             */
            fun requirePhoneNumber(requirePhoneNumber: Boolean) =
                requirePhoneNumber(JsonField.of(requirePhoneNumber))

            /**
             * Sets [Builder.requirePhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requirePhoneNumber] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requirePhoneNumber(requirePhoneNumber: JsonField<Boolean>) = apply {
                this.requirePhoneNumber = requirePhoneNumber
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

            /** If true, returns a shortened payment link. Defaults to false if not specified. */
            fun shortLink(shortLink: Boolean?) = shortLink(JsonField.ofNullable(shortLink))

            /**
             * Alias for [Builder.shortLink].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun shortLink(shortLink: Boolean) = shortLink(shortLink as Boolean?)

            /**
             * Sets [Builder.shortLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shortLink] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shortLink(shortLink: JsonField<Boolean>) = apply { this.shortLink = shortLink }

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
             * You should usually call [Builder.trialPeriodDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    (allowedPaymentMethodTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    billingCurrency,
                    customerBusinessName,
                    discountCode,
                    (discountCodes ?: JsonMissing.of()).map { it.toImmutable() },
                    force3ds,
                    mandateMinAmountInrPaise,
                    metadata,
                    onDemand,
                    (oneTimeProductCart ?: JsonMissing.of()).map { it.toImmutable() },
                    paymentLink,
                    paymentMethodId,
                    redirectImmediately,
                    requirePhoneNumber,
                    returnUrl,
                    shortLink,
                    showSavedPaymentMethods,
                    taxId,
                    trialPeriodDays,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billing().validate()
            customer().validate()
            productId()
            quantity()
            addons()?.forEach { it.validate() }
            allowedPaymentMethodTypes()?.forEach { it.validate() }
            billingCurrency()?.validate()
            customerBusinessName()
            discountCode()
            discountCodes()
            force3ds()
            mandateMinAmountInrPaise()
            metadata()?.validate()
            onDemand()?.validate()
            oneTimeProductCart()?.forEach { it.validate() }
            paymentLink()
            paymentMethodId()
            redirectImmediately()
            requirePhoneNumber()
            returnUrl()
            shortLink()
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
                (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (allowedPaymentMethodTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (billingCurrency.asKnown()?.validity() ?: 0) +
                (if (customerBusinessName.asKnown() == null) 0 else 1) +
                (if (discountCode.asKnown() == null) 0 else 1) +
                (discountCodes.asKnown()?.size ?: 0) +
                (if (force3ds.asKnown() == null) 0 else 1) +
                (if (mandateMinAmountInrPaise.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (onDemand.asKnown()?.validity() ?: 0) +
                (oneTimeProductCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (paymentLink.asKnown() == null) 0 else 1) +
                (if (paymentMethodId.asKnown() == null) 0 else 1) +
                (if (redirectImmediately.asKnown() == null) 0 else 1) +
                (if (requirePhoneNumber.asKnown() == null) 0 else 1) +
                (if (returnUrl.asKnown() == null) 0 else 1) +
                (if (shortLink.asKnown() == null) 0 else 1) +
                (if (showSavedPaymentMethods.asKnown() == null) 0 else 1) +
                (if (taxId.asKnown() == null) 0 else 1) +
                (if (trialPeriodDays.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billing == other.billing &&
                customer == other.customer &&
                productId == other.productId &&
                quantity == other.quantity &&
                addons == other.addons &&
                allowedPaymentMethodTypes == other.allowedPaymentMethodTypes &&
                billingCurrency == other.billingCurrency &&
                customerBusinessName == other.customerBusinessName &&
                discountCode == other.discountCode &&
                discountCodes == other.discountCodes &&
                force3ds == other.force3ds &&
                mandateMinAmountInrPaise == other.mandateMinAmountInrPaise &&
                metadata == other.metadata &&
                onDemand == other.onDemand &&
                oneTimeProductCart == other.oneTimeProductCart &&
                paymentLink == other.paymentLink &&
                paymentMethodId == other.paymentMethodId &&
                redirectImmediately == other.redirectImmediately &&
                requirePhoneNumber == other.requirePhoneNumber &&
                returnUrl == other.returnUrl &&
                shortLink == other.shortLink &&
                showSavedPaymentMethods == other.showSavedPaymentMethods &&
                taxId == other.taxId &&
                trialPeriodDays == other.trialPeriodDays &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billing,
                customer,
                productId,
                quantity,
                addons,
                allowedPaymentMethodTypes,
                billingCurrency,
                customerBusinessName,
                discountCode,
                discountCodes,
                force3ds,
                mandateMinAmountInrPaise,
                metadata,
                onDemand,
                oneTimeProductCart,
                paymentLink,
                paymentMethodId,
                redirectImmediately,
                requirePhoneNumber,
                returnUrl,
                shortLink,
                showSavedPaymentMethods,
                taxId,
                trialPeriodDays,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billing=$billing, customer=$customer, productId=$productId, quantity=$quantity, addons=$addons, allowedPaymentMethodTypes=$allowedPaymentMethodTypes, billingCurrency=$billingCurrency, customerBusinessName=$customerBusinessName, discountCode=$discountCode, discountCodes=$discountCodes, force3ds=$force3ds, mandateMinAmountInrPaise=$mandateMinAmountInrPaise, metadata=$metadata, onDemand=$onDemand, oneTimeProductCart=$oneTimeProductCart, paymentLink=$paymentLink, paymentMethodId=$paymentMethodId, redirectImmediately=$redirectImmediately, requirePhoneNumber=$requirePhoneNumber, returnUrl=$returnUrl, shortLink=$shortLink, showSavedPaymentMethods=$showSavedPaymentMethods, taxId=$taxId, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
