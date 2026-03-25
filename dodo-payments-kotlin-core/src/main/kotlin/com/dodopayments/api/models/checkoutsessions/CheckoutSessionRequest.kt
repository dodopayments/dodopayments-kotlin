// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.CustomerRequest
import com.dodopayments.api.models.payments.NewCustomer
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class CheckoutSessionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val productCart: JsonField<List<ProductItemReq>>,
    private val allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>,
    private val billingAddress: JsonField<CheckoutSessionBillingAddress>,
    private val billingCurrency: JsonField<Currency>,
    private val cancelUrl: JsonField<String>,
    private val confirm: JsonField<Boolean>,
    private val customFields: JsonField<List<CustomField>>,
    private val customer: JsonField<CustomerRequest>,
    private val customization: JsonField<CheckoutSessionCustomization>,
    private val discountCode: JsonField<String>,
    private val featureFlags: JsonField<CheckoutSessionFlags>,
    private val force3ds: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val minimalAddress: JsonField<Boolean>,
    private val paymentMethodId: JsonField<String>,
    private val productCollectionId: JsonField<String>,
    private val returnUrl: JsonField<String>,
    private val shortLink: JsonField<Boolean>,
    private val showSavedPaymentMethods: JsonField<Boolean>,
    private val subscriptionData: JsonField<SubscriptionData>,
    private val taxId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("product_cart")
        @ExcludeMissing
        productCart: JsonField<List<ProductItemReq>> = JsonMissing.of(),
        @JsonProperty("allowed_payment_method_types")
        @ExcludeMissing
        allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        billingAddress: JsonField<CheckoutSessionBillingAddress> = JsonMissing.of(),
        @JsonProperty("billing_currency")
        @ExcludeMissing
        billingCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("cancel_url") @ExcludeMissing cancelUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("confirm") @ExcludeMissing confirm: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<List<CustomField>> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerRequest> = JsonMissing.of(),
        @JsonProperty("customization")
        @ExcludeMissing
        customization: JsonField<CheckoutSessionCustomization> = JsonMissing.of(),
        @JsonProperty("discount_code")
        @ExcludeMissing
        discountCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feature_flags")
        @ExcludeMissing
        featureFlags: JsonField<CheckoutSessionFlags> = JsonMissing.of(),
        @JsonProperty("force_3ds") @ExcludeMissing force3ds: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("minimal_address")
        @ExcludeMissing
        minimalAddress: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_method_id")
        @ExcludeMissing
        paymentMethodId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_collection_id")
        @ExcludeMissing
        productCollectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("return_url") @ExcludeMissing returnUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_link")
        @ExcludeMissing
        shortLink: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("show_saved_payment_methods")
        @ExcludeMissing
        showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("subscription_data")
        @ExcludeMissing
        subscriptionData: JsonField<SubscriptionData> = JsonMissing.of(),
        @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
    ) : this(
        productCart,
        allowedPaymentMethodTypes,
        billingAddress,
        billingCurrency,
        cancelUrl,
        confirm,
        customFields,
        customer,
        customization,
        discountCode,
        featureFlags,
        force3ds,
        metadata,
        minimalAddress,
        paymentMethodId,
        productCollectionId,
        returnUrl,
        shortLink,
        showSavedPaymentMethods,
        subscriptionData,
        taxId,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productCart(): List<ProductItemReq> = productCart.getRequired("product_cart")

    /**
     * Customers will never see payment methods that are not in this list. However, adding a method
     * here does not guarantee customers will see it. Availability still depends on other factors
     * (e.g., customer location, merchant settings).
     *
     * Disclaimar: Always provide 'credit' and 'debit' as a fallback. If all payment methods are
     * unavailable, checkout session will fail.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowedPaymentMethodTypes(): List<PaymentMethodTypes>? =
        allowedPaymentMethodTypes.getNullable("allowed_payment_method_types")

    /**
     * Billing address information for the session
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billingAddress(): CheckoutSessionBillingAddress? =
        billingAddress.getNullable("billing_address")

    /**
     * This field is ingored if adaptive pricing is disabled
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billingCurrency(): Currency? = billingCurrency.getNullable("billing_currency")

    /**
     * The URL to redirect the customer if they cancel or go back from the checkout. If not
     * provided, the back button will not be displayed.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelUrl(): String? = cancelUrl.getNullable("cancel_url")

    /**
     * If confirm is true, all the details will be finalized. If required data is missing, an API
     * error is thrown.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun confirm(): Boolean? = confirm.getNullable("confirm")

    /**
     * Custom fields to collect from customer during checkout (max 5 fields)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customFields(): List<CustomField>? = customFields.getNullable("custom_fields")

    /**
     * Customer details for the session
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customer(): CustomerRequest? = customer.getNullable("customer")

    /**
     * Customization for the checkout session page
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customization(): CheckoutSessionCustomization? = customization.getNullable("customization")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountCode(): String? = discountCode.getNullable("discount_code")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun featureFlags(): CheckoutSessionFlags? = featureFlags.getNullable("feature_flags")

    /**
     * Override merchant default 3DS behaviour for this session
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun force3ds(): Boolean? = force3ds.getNullable("force_3ds")

    /**
     * Additional metadata associated with the payment. Defaults to empty if not provided.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * If true, only zipcode is required when confirm is true; other address fields remain optional
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun minimalAddress(): Boolean? = minimalAddress.getNullable("minimal_address")

    /**
     * Optional payment method ID to use for this checkout session. Only allowed when `confirm` is
     * true. If provided, existing customer id must also be provided.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethodId(): String? = paymentMethodId.getNullable("payment_method_id")

    /**
     * Product collection ID for collection-based checkout flow
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productCollectionId(): String? = productCollectionId.getNullable("product_collection_id")

    /**
     * The url to redirect after payment failure or success.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnUrl(): String? = returnUrl.getNullable("return_url")

    /**
     * If true, returns a shortened checkout URL. Defaults to false if not specified.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun shortLink(): Boolean? = shortLink.getNullable("short_link")

    /**
     * Display saved payment methods of a returning customer False by default
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun showSavedPaymentMethods(): Boolean? =
        showSavedPaymentMethods.getNullable("show_saved_payment_methods")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionData(): SubscriptionData? = subscriptionData.getNullable("subscription_data")

    /**
     * Tax ID for the customer (e.g. VAT number). Requires billing_address with country.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxId(): String? = taxId.getNullable("tax_id")

    /**
     * Returns the raw JSON value of [productCart].
     *
     * Unlike [productCart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_cart")
    @ExcludeMissing
    fun _productCart(): JsonField<List<ProductItemReq>> = productCart

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
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<CheckoutSessionBillingAddress> = billingAddress

    /**
     * Returns the raw JSON value of [billingCurrency].
     *
     * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_currency")
    @ExcludeMissing
    fun _billingCurrency(): JsonField<Currency> = billingCurrency

    /**
     * Returns the raw JSON value of [cancelUrl].
     *
     * Unlike [cancelUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancel_url") @ExcludeMissing fun _cancelUrl(): JsonField<String> = cancelUrl

    /**
     * Returns the raw JSON value of [confirm].
     *
     * Unlike [confirm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confirm") @ExcludeMissing fun _confirm(): JsonField<Boolean> = confirm

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<List<CustomField>> = customFields

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<CustomerRequest> = customer

    /**
     * Returns the raw JSON value of [customization].
     *
     * Unlike [customization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customization")
    @ExcludeMissing
    fun _customization(): JsonField<CheckoutSessionCustomization> = customization

    /**
     * Returns the raw JSON value of [discountCode].
     *
     * Unlike [discountCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_code")
    @ExcludeMissing
    fun _discountCode(): JsonField<String> = discountCode

    /**
     * Returns the raw JSON value of [featureFlags].
     *
     * Unlike [featureFlags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feature_flags")
    @ExcludeMissing
    fun _featureFlags(): JsonField<CheckoutSessionFlags> = featureFlags

    /**
     * Returns the raw JSON value of [force3ds].
     *
     * Unlike [force3ds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("force_3ds") @ExcludeMissing fun _force3ds(): JsonField<Boolean> = force3ds

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [minimalAddress].
     *
     * Unlike [minimalAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimal_address")
    @ExcludeMissing
    fun _minimalAddress(): JsonField<Boolean> = minimalAddress

    /**
     * Returns the raw JSON value of [paymentMethodId].
     *
     * Unlike [paymentMethodId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method_id")
    @ExcludeMissing
    fun _paymentMethodId(): JsonField<String> = paymentMethodId

    /**
     * Returns the raw JSON value of [productCollectionId].
     *
     * Unlike [productCollectionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("product_collection_id")
    @ExcludeMissing
    fun _productCollectionId(): JsonField<String> = productCollectionId

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
     * Returns the raw JSON value of [subscriptionData].
     *
     * Unlike [subscriptionData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscription_data")
    @ExcludeMissing
    fun _subscriptionData(): JsonField<SubscriptionData> = subscriptionData

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
         * Returns a mutable builder for constructing an instance of [CheckoutSessionRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .productCart()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CheckoutSessionRequest]. */
    class Builder internal constructor() {

        private var productCart: JsonField<MutableList<ProductItemReq>>? = null
        private var allowedPaymentMethodTypes: JsonField<MutableList<PaymentMethodTypes>>? = null
        private var billingAddress: JsonField<CheckoutSessionBillingAddress> = JsonMissing.of()
        private var billingCurrency: JsonField<Currency> = JsonMissing.of()
        private var cancelUrl: JsonField<String> = JsonMissing.of()
        private var confirm: JsonField<Boolean> = JsonMissing.of()
        private var customFields: JsonField<MutableList<CustomField>>? = null
        private var customer: JsonField<CustomerRequest> = JsonMissing.of()
        private var customization: JsonField<CheckoutSessionCustomization> = JsonMissing.of()
        private var discountCode: JsonField<String> = JsonMissing.of()
        private var featureFlags: JsonField<CheckoutSessionFlags> = JsonMissing.of()
        private var force3ds: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var minimalAddress: JsonField<Boolean> = JsonMissing.of()
        private var paymentMethodId: JsonField<String> = JsonMissing.of()
        private var productCollectionId: JsonField<String> = JsonMissing.of()
        private var returnUrl: JsonField<String> = JsonMissing.of()
        private var shortLink: JsonField<Boolean> = JsonMissing.of()
        private var showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of()
        private var subscriptionData: JsonField<SubscriptionData> = JsonMissing.of()
        private var taxId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkoutSessionRequest: CheckoutSessionRequest) = apply {
            productCart = checkoutSessionRequest.productCart.map { it.toMutableList() }
            allowedPaymentMethodTypes =
                checkoutSessionRequest.allowedPaymentMethodTypes.map { it.toMutableList() }
            billingAddress = checkoutSessionRequest.billingAddress
            billingCurrency = checkoutSessionRequest.billingCurrency
            cancelUrl = checkoutSessionRequest.cancelUrl
            confirm = checkoutSessionRequest.confirm
            customFields = checkoutSessionRequest.customFields.map { it.toMutableList() }
            customer = checkoutSessionRequest.customer
            customization = checkoutSessionRequest.customization
            discountCode = checkoutSessionRequest.discountCode
            featureFlags = checkoutSessionRequest.featureFlags
            force3ds = checkoutSessionRequest.force3ds
            metadata = checkoutSessionRequest.metadata
            minimalAddress = checkoutSessionRequest.minimalAddress
            paymentMethodId = checkoutSessionRequest.paymentMethodId
            productCollectionId = checkoutSessionRequest.productCollectionId
            returnUrl = checkoutSessionRequest.returnUrl
            shortLink = checkoutSessionRequest.shortLink
            showSavedPaymentMethods = checkoutSessionRequest.showSavedPaymentMethods
            subscriptionData = checkoutSessionRequest.subscriptionData
            taxId = checkoutSessionRequest.taxId
            additionalProperties = checkoutSessionRequest.additionalProperties.toMutableMap()
        }

        fun productCart(productCart: List<ProductItemReq>) = productCart(JsonField.of(productCart))

        /**
         * Sets [Builder.productCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productCart] with a well-typed `List<ProductItemReq>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun productCart(productCart: JsonField<List<ProductItemReq>>) = apply {
            this.productCart = productCart.map { it.toMutableList() }
        }

        /**
         * Adds a single [ProductItemReq] to [Builder.productCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductCart(productCart: ProductItemReq) = apply {
            this.productCart =
                (this.productCart ?: JsonField.of(mutableListOf())).also {
                    checkKnown("productCart", it).add(productCart)
                }
        }

        /**
         * Customers will never see payment methods that are not in this list. However, adding a
         * method here does not guarantee customers will see it. Availability still depends on other
         * factors (e.g., customer location, merchant settings).
         *
         * Disclaimar: Always provide 'credit' and 'debit' as a fallback. If all payment methods are
         * unavailable, checkout session will fail.
         */
        fun allowedPaymentMethodTypes(allowedPaymentMethodTypes: List<PaymentMethodTypes>?) =
            allowedPaymentMethodTypes(JsonField.ofNullable(allowedPaymentMethodTypes))

        /**
         * Sets [Builder.allowedPaymentMethodTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPaymentMethodTypes] with a well-typed
         * `List<PaymentMethodTypes>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun allowedPaymentMethodTypes(
            allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>
        ) = apply {
            this.allowedPaymentMethodTypes = allowedPaymentMethodTypes.map { it.toMutableList() }
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

        /** Billing address information for the session */
        fun billingAddress(billingAddress: CheckoutSessionBillingAddress?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed
         * [CheckoutSessionBillingAddress] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun billingAddress(billingAddress: JsonField<CheckoutSessionBillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        /** This field is ingored if adaptive pricing is disabled */
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
         * The URL to redirect the customer if they cancel or go back from the checkout. If not
         * provided, the back button will not be displayed.
         */
        fun cancelUrl(cancelUrl: String?) = cancelUrl(JsonField.ofNullable(cancelUrl))

        /**
         * Sets [Builder.cancelUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cancelUrl(cancelUrl: JsonField<String>) = apply { this.cancelUrl = cancelUrl }

        /**
         * If confirm is true, all the details will be finalized. If required data is missing, an
         * API error is thrown.
         */
        fun confirm(confirm: Boolean) = confirm(JsonField.of(confirm))

        /**
         * Sets [Builder.confirm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confirm] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun confirm(confirm: JsonField<Boolean>) = apply { this.confirm = confirm }

        /** Custom fields to collect from customer during checkout (max 5 fields) */
        fun customFields(customFields: List<CustomField>?) =
            customFields(JsonField.ofNullable(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed `List<CustomField>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customFields(customFields: JsonField<List<CustomField>>) = apply {
            this.customFields = customFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomField] to [customFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomField(customField: CustomField) = apply {
            customFields =
                (customFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customFields", it).add(customField)
                }
        }

        /** Customer details for the session */
        fun customer(customer: CustomerRequest?) = customer(JsonField.ofNullable(customer))

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

        /** Customization for the checkout session page */
        fun customization(customization: CheckoutSessionCustomization) =
            customization(JsonField.of(customization))

        /**
         * Sets [Builder.customization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customization] with a well-typed
         * [CheckoutSessionCustomization] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customization(customization: JsonField<CheckoutSessionCustomization>) = apply {
            this.customization = customization
        }

        fun discountCode(discountCode: String?) = discountCode(JsonField.ofNullable(discountCode))

        /**
         * Sets [Builder.discountCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discountCode(discountCode: JsonField<String>) = apply {
            this.discountCode = discountCode
        }

        fun featureFlags(featureFlags: CheckoutSessionFlags) =
            featureFlags(JsonField.of(featureFlags))

        /**
         * Sets [Builder.featureFlags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureFlags] with a well-typed [CheckoutSessionFlags]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun featureFlags(featureFlags: JsonField<CheckoutSessionFlags>) = apply {
            this.featureFlags = featureFlags
        }

        /** Override merchant default 3DS behaviour for this session */
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun force3ds(force3ds: JsonField<Boolean>) = apply { this.force3ds = force3ds }

        /** Additional metadata associated with the payment. Defaults to empty if not provided. */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * If true, only zipcode is required when confirm is true; other address fields remain
         * optional
         */
        fun minimalAddress(minimalAddress: Boolean) = minimalAddress(JsonField.of(minimalAddress))

        /**
         * Sets [Builder.minimalAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimalAddress] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minimalAddress(minimalAddress: JsonField<Boolean>) = apply {
            this.minimalAddress = minimalAddress
        }

        /**
         * Optional payment method ID to use for this checkout session. Only allowed when `confirm`
         * is true. If provided, existing customer id must also be provided.
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

        /** Product collection ID for collection-based checkout flow */
        fun productCollectionId(productCollectionId: String?) =
            productCollectionId(JsonField.ofNullable(productCollectionId))

        /**
         * Sets [Builder.productCollectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productCollectionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productCollectionId(productCollectionId: JsonField<String>) = apply {
            this.productCollectionId = productCollectionId
        }

        /** The url to redirect after payment failure or success. */
        fun returnUrl(returnUrl: String?) = returnUrl(JsonField.ofNullable(returnUrl))

        /**
         * Sets [Builder.returnUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun returnUrl(returnUrl: JsonField<String>) = apply { this.returnUrl = returnUrl }

        /** If true, returns a shortened checkout URL. Defaults to false if not specified. */
        fun shortLink(shortLink: Boolean) = shortLink(JsonField.of(shortLink))

        /**
         * Sets [Builder.shortLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortLink] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortLink(shortLink: JsonField<Boolean>) = apply { this.shortLink = shortLink }

        /** Display saved payment methods of a returning customer False by default */
        fun showSavedPaymentMethods(showSavedPaymentMethods: Boolean) =
            showSavedPaymentMethods(JsonField.of(showSavedPaymentMethods))

        /**
         * Sets [Builder.showSavedPaymentMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showSavedPaymentMethods] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun showSavedPaymentMethods(showSavedPaymentMethods: JsonField<Boolean>) = apply {
            this.showSavedPaymentMethods = showSavedPaymentMethods
        }

        fun subscriptionData(subscriptionData: SubscriptionData?) =
            subscriptionData(JsonField.ofNullable(subscriptionData))

        /**
         * Sets [Builder.subscriptionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionData] with a well-typed [SubscriptionData]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subscriptionData(subscriptionData: JsonField<SubscriptionData>) = apply {
            this.subscriptionData = subscriptionData
        }

        /** Tax ID for the customer (e.g. VAT number). Requires billing_address with country. */
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
         * Returns an immutable instance of [CheckoutSessionRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .productCart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CheckoutSessionRequest =
            CheckoutSessionRequest(
                checkRequired("productCart", productCart).map { it.toImmutable() },
                (allowedPaymentMethodTypes ?: JsonMissing.of()).map { it.toImmutable() },
                billingAddress,
                billingCurrency,
                cancelUrl,
                confirm,
                (customFields ?: JsonMissing.of()).map { it.toImmutable() },
                customer,
                customization,
                discountCode,
                featureFlags,
                force3ds,
                metadata,
                minimalAddress,
                paymentMethodId,
                productCollectionId,
                returnUrl,
                shortLink,
                showSavedPaymentMethods,
                subscriptionData,
                taxId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CheckoutSessionRequest = apply {
        if (validated) {
            return@apply
        }

        productCart().forEach { it.validate() }
        allowedPaymentMethodTypes()?.forEach { it.validate() }
        billingAddress()?.validate()
        billingCurrency()?.validate()
        cancelUrl()
        confirm()
        customFields()?.forEach { it.validate() }
        customer()?.validate()
        customization()?.validate()
        discountCode()
        featureFlags()?.validate()
        force3ds()
        metadata()?.validate()
        minimalAddress()
        paymentMethodId()
        productCollectionId()
        returnUrl()
        shortLink()
        showSavedPaymentMethods()
        subscriptionData()?.validate()
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
        (productCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (allowedPaymentMethodTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (billingAddress.asKnown()?.validity() ?: 0) +
            (billingCurrency.asKnown()?.validity() ?: 0) +
            (if (cancelUrl.asKnown() == null) 0 else 1) +
            (if (confirm.asKnown() == null) 0 else 1) +
            (customFields.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (customer.asKnown()?.validity() ?: 0) +
            (customization.asKnown()?.validity() ?: 0) +
            (if (discountCode.asKnown() == null) 0 else 1) +
            (featureFlags.asKnown()?.validity() ?: 0) +
            (if (force3ds.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (minimalAddress.asKnown() == null) 0 else 1) +
            (if (paymentMethodId.asKnown() == null) 0 else 1) +
            (if (productCollectionId.asKnown() == null) 0 else 1) +
            (if (returnUrl.asKnown() == null) 0 else 1) +
            (if (shortLink.asKnown() == null) 0 else 1) +
            (if (showSavedPaymentMethods.asKnown() == null) 0 else 1) +
            (subscriptionData.asKnown()?.validity() ?: 0) +
            (if (taxId.asKnown() == null) 0 else 1)

    /** Additional metadata associated with the payment. Defaults to empty if not provided. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckoutSessionRequest &&
            productCart == other.productCart &&
            allowedPaymentMethodTypes == other.allowedPaymentMethodTypes &&
            billingAddress == other.billingAddress &&
            billingCurrency == other.billingCurrency &&
            cancelUrl == other.cancelUrl &&
            confirm == other.confirm &&
            customFields == other.customFields &&
            customer == other.customer &&
            customization == other.customization &&
            discountCode == other.discountCode &&
            featureFlags == other.featureFlags &&
            force3ds == other.force3ds &&
            metadata == other.metadata &&
            minimalAddress == other.minimalAddress &&
            paymentMethodId == other.paymentMethodId &&
            productCollectionId == other.productCollectionId &&
            returnUrl == other.returnUrl &&
            shortLink == other.shortLink &&
            showSavedPaymentMethods == other.showSavedPaymentMethods &&
            subscriptionData == other.subscriptionData &&
            taxId == other.taxId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            productCart,
            allowedPaymentMethodTypes,
            billingAddress,
            billingCurrency,
            cancelUrl,
            confirm,
            customFields,
            customer,
            customization,
            discountCode,
            featureFlags,
            force3ds,
            metadata,
            minimalAddress,
            paymentMethodId,
            productCollectionId,
            returnUrl,
            shortLink,
            showSavedPaymentMethods,
            subscriptionData,
            taxId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckoutSessionRequest{productCart=$productCart, allowedPaymentMethodTypes=$allowedPaymentMethodTypes, billingAddress=$billingAddress, billingCurrency=$billingCurrency, cancelUrl=$cancelUrl, confirm=$confirm, customFields=$customFields, customer=$customer, customization=$customization, discountCode=$discountCode, featureFlags=$featureFlags, force3ds=$force3ds, metadata=$metadata, minimalAddress=$minimalAddress, paymentMethodId=$paymentMethodId, productCollectionId=$productCollectionId, returnUrl=$returnUrl, shortLink=$shortLink, showSavedPaymentMethods=$showSavedPaymentMethods, subscriptionData=$subscriptionData, taxId=$taxId, additionalProperties=$additionalProperties}"
}
