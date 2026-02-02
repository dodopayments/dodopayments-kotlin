// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.CustomerRequest
import com.dodopayments.api.models.payments.NewCustomer
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class CheckoutSessionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val productCart: JsonField<List<ProductCart>>,
    private val allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>,
    private val billingAddress: JsonField<BillingAddress>,
    private val billingCurrency: JsonField<Currency>,
    private val confirm: JsonField<Boolean>,
    private val customFields: JsonField<List<CustomField>>,
    private val customer: JsonField<CustomerRequest>,
    private val customization: JsonField<Customization>,
    private val discountCode: JsonField<String>,
    private val featureFlags: JsonField<FeatureFlags>,
    private val force3ds: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val minimalAddress: JsonField<Boolean>,
    private val paymentMethodId: JsonField<String>,
    private val productCollectionId: JsonField<String>,
    private val returnUrl: JsonField<String>,
    private val shortLink: JsonField<Boolean>,
    private val showSavedPaymentMethods: JsonField<Boolean>,
    private val subscriptionData: JsonField<SubscriptionData>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("product_cart")
        @ExcludeMissing
        productCart: JsonField<List<ProductCart>> = JsonMissing.of(),
        @JsonProperty("allowed_payment_method_types")
        @ExcludeMissing
        allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
        @JsonProperty("billing_currency")
        @ExcludeMissing
        billingCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("confirm") @ExcludeMissing confirm: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<List<CustomField>> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerRequest> = JsonMissing.of(),
        @JsonProperty("customization")
        @ExcludeMissing
        customization: JsonField<Customization> = JsonMissing.of(),
        @JsonProperty("discount_code")
        @ExcludeMissing
        discountCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feature_flags")
        @ExcludeMissing
        featureFlags: JsonField<FeatureFlags> = JsonMissing.of(),
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
    ) : this(
        productCart,
        allowedPaymentMethodTypes,
        billingAddress,
        billingCurrency,
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
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productCart(): List<ProductCart> = productCart.getRequired("product_cart")

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
    fun billingAddress(): BillingAddress? = billingAddress.getNullable("billing_address")

    /**
     * This field is ingored if adaptive pricing is disabled
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billingCurrency(): Currency? = billingCurrency.getNullable("billing_currency")

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
    fun customization(): Customization? = customization.getNullable("customization")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountCode(): String? = discountCode.getNullable("discount_code")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun featureFlags(): FeatureFlags? = featureFlags.getNullable("feature_flags")

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
     * Returns the raw JSON value of [productCart].
     *
     * Unlike [productCart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_cart")
    @ExcludeMissing
    fun _productCart(): JsonField<List<ProductCart>> = productCart

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
    fun _billingAddress(): JsonField<BillingAddress> = billingAddress

    /**
     * Returns the raw JSON value of [billingCurrency].
     *
     * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_currency")
    @ExcludeMissing
    fun _billingCurrency(): JsonField<Currency> = billingCurrency

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
    fun _customization(): JsonField<Customization> = customization

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
    fun _featureFlags(): JsonField<FeatureFlags> = featureFlags

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

        private var productCart: JsonField<MutableList<ProductCart>>? = null
        private var allowedPaymentMethodTypes: JsonField<MutableList<PaymentMethodTypes>>? = null
        private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
        private var billingCurrency: JsonField<Currency> = JsonMissing.of()
        private var confirm: JsonField<Boolean> = JsonMissing.of()
        private var customFields: JsonField<MutableList<CustomField>>? = null
        private var customer: JsonField<CustomerRequest> = JsonMissing.of()
        private var customization: JsonField<Customization> = JsonMissing.of()
        private var discountCode: JsonField<String> = JsonMissing.of()
        private var featureFlags: JsonField<FeatureFlags> = JsonMissing.of()
        private var force3ds: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var minimalAddress: JsonField<Boolean> = JsonMissing.of()
        private var paymentMethodId: JsonField<String> = JsonMissing.of()
        private var productCollectionId: JsonField<String> = JsonMissing.of()
        private var returnUrl: JsonField<String> = JsonMissing.of()
        private var shortLink: JsonField<Boolean> = JsonMissing.of()
        private var showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of()
        private var subscriptionData: JsonField<SubscriptionData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkoutSessionRequest: CheckoutSessionRequest) = apply {
            productCart = checkoutSessionRequest.productCart.map { it.toMutableList() }
            allowedPaymentMethodTypes =
                checkoutSessionRequest.allowedPaymentMethodTypes.map { it.toMutableList() }
            billingAddress = checkoutSessionRequest.billingAddress
            billingCurrency = checkoutSessionRequest.billingCurrency
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
            additionalProperties = checkoutSessionRequest.additionalProperties.toMutableMap()
        }

        fun productCart(productCart: List<ProductCart>) = productCart(JsonField.of(productCart))

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
        fun billingAddress(billingAddress: BillingAddress?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
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
        fun customization(customization: Customization) = customization(JsonField.of(customization))

        /**
         * Sets [Builder.customization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customization] with a well-typed [Customization] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customization(customization: JsonField<Customization>) = apply {
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

        fun featureFlags(featureFlags: FeatureFlags) = featureFlags(JsonField.of(featureFlags))

        /**
         * Sets [Builder.featureFlags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureFlags] with a well-typed [FeatureFlags] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun featureFlags(featureFlags: JsonField<FeatureFlags>) = apply {
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
            (subscriptionData.asKnown()?.validity() ?: 0)

    class ProductCart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val productId: JsonField<String>,
        private val quantity: JsonField<Int>,
        private val addons: JsonField<List<AttachAddon>>,
        private val amount: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("addons")
            @ExcludeMissing
            addons: JsonField<List<AttachAddon>> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
        ) : this(productId, quantity, addons, amount, mutableMapOf())

        /**
         * unique id of the product
         *
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
         * only valid if product is a subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addons(): List<AttachAddon>? = addons.getNullable("addons")

        /**
         * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
         * ignored Represented in the lowest denomination of the currency (e.g., cents for USD). For
         * example, to charge $1.00, pass `100`. Only applicable for one time payments
         *
         * If amount is not set for pay_what_you_want product, customer is allowed to select the
         * amount.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun amount(): Int? = amount.getNullable("amount")

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
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Int> = amount

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
            private var addons: JsonField<MutableList<AttachAddon>>? = null
            private var amount: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(productCart: ProductCart) = apply {
                productId = productCart.productId
                quantity = productCart.quantity
                addons = productCart.addons.map { it.toMutableList() }
                amount = productCart.amount
                additionalProperties = productCart.additionalProperties.toMutableMap()
            }

            /** unique id of the product */
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

            /** only valid if product is a subscription */
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
             * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount
             * will be ignored Represented in the lowest denomination of the currency (e.g., cents
             * for USD). For example, to charge $1.00, pass `100`. Only applicable for one time
             * payments
             *
             * If amount is not set for pay_what_you_want product, customer is allowed to select the
             * amount.
             */
            fun amount(amount: Int?) = amount(JsonField.ofNullable(amount))

            /**
             * Alias for [Builder.amount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amount(amount: Int) = amount(amount as Int?)

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

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
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    amount,
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
            addons()?.forEach { it.validate() }
            amount()
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
            (if (productId.asKnown() == null) 0 else 1) +
                (if (quantity.asKnown() == null) 0 else 1) +
                (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (amount.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProductCart &&
                productId == other.productId &&
                quantity == other.quantity &&
                addons == other.addons &&
                amount == other.amount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(productId, quantity, addons, amount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductCart{productId=$productId, quantity=$quantity, addons=$addons, amount=$amount, additionalProperties=$additionalProperties}"
    }

    /** Billing address information for the session */
    class BillingAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val country: JsonField<CountryCode>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val street: JsonField<String>,
        private val zipcode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country")
            @ExcludeMissing
            country: JsonField<CountryCode> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zipcode") @ExcludeMissing zipcode: JsonField<String> = JsonMissing.of(),
        ) : this(country, city, state, street, zipcode, mutableMapOf())

        /**
         * Two-letter ISO country code (ISO 3166-1 alpha-2)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): CountryCode = country.getRequired("country")

        /**
         * City name
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun city(): String? = city.getNullable("city")

        /**
         * State or province name
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun state(): String? = state.getNullable("state")

        /**
         * Street address including house number and unit/apartment if applicable
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun street(): String? = street.getNullable("street")

        /**
         * Postal code or ZIP code
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun zipcode(): String? = zipcode.getNullable("zipcode")

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<CountryCode> = country

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [street].
         *
         * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

        /**
         * Returns the raw JSON value of [zipcode].
         *
         * Unlike [zipcode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

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
             * Returns a mutable builder for constructing an instance of [BillingAddress].
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BillingAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<CountryCode>? = null
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var street: JsonField<String> = JsonMissing.of()
            private var zipcode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billingAddress: BillingAddress) = apply {
                country = billingAddress.country
                city = billingAddress.city
                state = billingAddress.state
                street = billingAddress.street
                zipcode = billingAddress.zipcode
                additionalProperties = billingAddress.additionalProperties.toMutableMap()
            }

            /** Two-letter ISO country code (ISO 3166-1 alpha-2) */
            fun country(country: CountryCode) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [CountryCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<CountryCode>) = apply { this.country = country }

            /** City name */
            fun city(city: String?) = city(JsonField.ofNullable(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** State or province name */
            fun state(state: String?) = state(JsonField.ofNullable(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** Street address including house number and unit/apartment if applicable */
            fun street(street: String?) = street(JsonField.ofNullable(street))

            /**
             * Sets [Builder.street] to an arbitrary JSON value.
             *
             * You should usually call [Builder.street] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun street(street: JsonField<String>) = apply { this.street = street }

            /** Postal code or ZIP code */
            fun zipcode(zipcode: String?) = zipcode(JsonField.ofNullable(zipcode))

            /**
             * Sets [Builder.zipcode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zipcode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zipcode(zipcode: JsonField<String>) = apply { this.zipcode = zipcode }

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
             * Returns an immutable instance of [BillingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .country()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillingAddress =
                BillingAddress(
                    checkRequired("country", country),
                    city,
                    state,
                    street,
                    zipcode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BillingAddress = apply {
            if (validated) {
                return@apply
            }

            country().validate()
            city()
            state()
            street()
            zipcode()
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
            (country.asKnown()?.validity() ?: 0) +
                (if (city.asKnown() == null) 0 else 1) +
                (if (state.asKnown() == null) 0 else 1) +
                (if (street.asKnown() == null) 0 else 1) +
                (if (zipcode.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingAddress &&
                country == other.country &&
                city == other.city &&
                state == other.state &&
                street == other.street &&
                zipcode == other.zipcode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(country, city, state, street, zipcode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingAddress{country=$country, city=$city, state=$state, street=$street, zipcode=$zipcode, additionalProperties=$additionalProperties}"
    }

    /** Definition of a custom field for checkout */
    class CustomField
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fieldType: JsonField<FieldType>,
        private val key: JsonField<String>,
        private val label: JsonField<String>,
        private val options: JsonField<List<String>>,
        private val placeholder: JsonField<String>,
        private val required: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("field_type")
            @ExcludeMissing
            fieldType: JsonField<FieldType> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("options")
            @ExcludeMissing
            options: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("placeholder")
            @ExcludeMissing
            placeholder: JsonField<String> = JsonMissing.of(),
            @JsonProperty("required")
            @ExcludeMissing
            required: JsonField<Boolean> = JsonMissing.of(),
        ) : this(fieldType, key, label, options, placeholder, required, mutableMapOf())

        /**
         * Type of field determining validation rules
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldType(): FieldType = fieldType.getRequired("field_type")

        /**
         * Unique identifier for this field (used as key in responses)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * Display label shown to customer
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun label(): String = label.getRequired("label")

        /**
         * Options for dropdown type (required for dropdown, ignored for others)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun options(): List<String>? = options.getNullable("options")

        /**
         * Placeholder text for the input
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun placeholder(): String? = placeholder.getNullable("placeholder")

        /**
         * Whether this field is required
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun required(): Boolean? = required.getNullable("required")

        /**
         * Returns the raw JSON value of [fieldType].
         *
         * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field_type")
        @ExcludeMissing
        fun _fieldType(): JsonField<FieldType> = fieldType

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<String>> = options

        /**
         * Returns the raw JSON value of [placeholder].
         *
         * Unlike [placeholder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("placeholder")
        @ExcludeMissing
        fun _placeholder(): JsonField<String> = placeholder

        /**
         * Returns the raw JSON value of [required].
         *
         * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

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
             * Returns a mutable builder for constructing an instance of [CustomField].
             *
             * The following fields are required:
             * ```kotlin
             * .fieldType()
             * .key()
             * .label()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CustomField]. */
        class Builder internal constructor() {

            private var fieldType: JsonField<FieldType>? = null
            private var key: JsonField<String>? = null
            private var label: JsonField<String>? = null
            private var options: JsonField<MutableList<String>>? = null
            private var placeholder: JsonField<String> = JsonMissing.of()
            private var required: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customField: CustomField) = apply {
                fieldType = customField.fieldType
                key = customField.key
                label = customField.label
                options = customField.options.map { it.toMutableList() }
                placeholder = customField.placeholder
                required = customField.required
                additionalProperties = customField.additionalProperties.toMutableMap()
            }

            /** Type of field determining validation rules */
            fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

            /**
             * Sets [Builder.fieldType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldType] with a well-typed [FieldType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

            /** Unique identifier for this field (used as key in responses) */
            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /** Display label shown to customer */
            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            /** Options for dropdown type (required for dropdown, ignored for others) */
            fun options(options: List<String>?) = options(JsonField.ofNullable(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<List<String>>) = apply {
                this.options = options.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [options].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOption(option: String) = apply {
                options =
                    (options ?: JsonField.of(mutableListOf())).also {
                        checkKnown("options", it).add(option)
                    }
            }

            /** Placeholder text for the input */
            fun placeholder(placeholder: String?) = placeholder(JsonField.ofNullable(placeholder))

            /**
             * Sets [Builder.placeholder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.placeholder] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun placeholder(placeholder: JsonField<String>) = apply {
                this.placeholder = placeholder
            }

            /** Whether this field is required */
            fun required(required: Boolean) = required(JsonField.of(required))

            /**
             * Sets [Builder.required] to an arbitrary JSON value.
             *
             * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun required(required: JsonField<Boolean>) = apply { this.required = required }

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
             * Returns an immutable instance of [CustomField].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .fieldType()
             * .key()
             * .label()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomField =
                CustomField(
                    checkRequired("fieldType", fieldType),
                    checkRequired("key", key),
                    checkRequired("label", label),
                    (options ?: JsonMissing.of()).map { it.toImmutable() },
                    placeholder,
                    required,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CustomField = apply {
            if (validated) {
                return@apply
            }

            fieldType().validate()
            key()
            label()
            options()
            placeholder()
            required()
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
            (fieldType.asKnown()?.validity() ?: 0) +
                (if (key.asKnown() == null) 0 else 1) +
                (if (label.asKnown() == null) 0 else 1) +
                (options.asKnown()?.size ?: 0) +
                (if (placeholder.asKnown() == null) 0 else 1) +
                (if (required.asKnown() == null) 0 else 1)

        /** Type of field determining validation rules */
        class FieldType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val TEXT = of("text")

                val NUMBER = of("number")

                val EMAIL = of("email")

                val URL = of("url")

                val DATE = of("date")

                val DROPDOWN = of("dropdown")

                val BOOLEAN = of("boolean")

                fun of(value: String) = FieldType(JsonField.of(value))
            }

            /** An enum containing [FieldType]'s known values. */
            enum class Known {
                TEXT,
                NUMBER,
                EMAIL,
                URL,
                DATE,
                DROPDOWN,
                BOOLEAN,
            }

            /**
             * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FieldType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                NUMBER,
                EMAIL,
                URL,
                DATE,
                DROPDOWN,
                BOOLEAN,
                /**
                 * An enum member indicating that [FieldType] was instantiated with an unknown
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
                    TEXT -> Value.TEXT
                    NUMBER -> Value.NUMBER
                    EMAIL -> Value.EMAIL
                    URL -> Value.URL
                    DATE -> Value.DATE
                    DROPDOWN -> Value.DROPDOWN
                    BOOLEAN -> Value.BOOLEAN
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
                    TEXT -> Known.TEXT
                    NUMBER -> Known.NUMBER
                    EMAIL -> Known.EMAIL
                    URL -> Known.URL
                    DATE -> Known.DATE
                    DROPDOWN -> Known.DROPDOWN
                    BOOLEAN -> Known.BOOLEAN
                    else -> throw DodoPaymentsInvalidDataException("Unknown FieldType: $value")
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

            fun validate(): FieldType = apply {
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

                return other is FieldType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomField &&
                fieldType == other.fieldType &&
                key == other.key &&
                label == other.label &&
                options == other.options &&
                placeholder == other.placeholder &&
                required == other.required &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fieldType,
                key,
                label,
                options,
                placeholder,
                required,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomField{fieldType=$fieldType, key=$key, label=$label, options=$options, placeholder=$placeholder, required=$required, additionalProperties=$additionalProperties}"
    }

    /** Customization for the checkout session page */
    class Customization
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val forceLanguage: JsonField<String>,
        private val showOnDemandTag: JsonField<Boolean>,
        private val showOrderDetails: JsonField<Boolean>,
        private val theme: JsonField<Theme>,
        private val themeConfig: JsonField<ThemeConfig>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("force_language")
            @ExcludeMissing
            forceLanguage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("show_on_demand_tag")
            @ExcludeMissing
            showOnDemandTag: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("show_order_details")
            @ExcludeMissing
            showOrderDetails: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("theme") @ExcludeMissing theme: JsonField<Theme> = JsonMissing.of(),
            @JsonProperty("theme_config")
            @ExcludeMissing
            themeConfig: JsonField<ThemeConfig> = JsonMissing.of(),
        ) : this(
            forceLanguage,
            showOnDemandTag,
            showOrderDetails,
            theme,
            themeConfig,
            mutableMapOf(),
        )

        /**
         * Force the checkout interface to render in a specific language (e.g. `en`, `es`)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun forceLanguage(): String? = forceLanguage.getNullable("force_language")

        /**
         * Show on demand tag
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun showOnDemandTag(): Boolean? = showOnDemandTag.getNullable("show_on_demand_tag")

        /**
         * Show order details by default
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun showOrderDetails(): Boolean? = showOrderDetails.getNullable("show_order_details")

        /**
         * Theme of the page (determines which mode - light/dark/system - to use)
         *
         * Default is `System`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun theme(): Theme? = theme.getNullable("theme")

        /**
         * Optional custom theme configuration with colors for light and dark modes
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun themeConfig(): ThemeConfig? = themeConfig.getNullable("theme_config")

        /**
         * Returns the raw JSON value of [forceLanguage].
         *
         * Unlike [forceLanguage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("force_language")
        @ExcludeMissing
        fun _forceLanguage(): JsonField<String> = forceLanguage

        /**
         * Returns the raw JSON value of [showOnDemandTag].
         *
         * Unlike [showOnDemandTag], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("show_on_demand_tag")
        @ExcludeMissing
        fun _showOnDemandTag(): JsonField<Boolean> = showOnDemandTag

        /**
         * Returns the raw JSON value of [showOrderDetails].
         *
         * Unlike [showOrderDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("show_order_details")
        @ExcludeMissing
        fun _showOrderDetails(): JsonField<Boolean> = showOrderDetails

        /**
         * Returns the raw JSON value of [theme].
         *
         * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("theme") @ExcludeMissing fun _theme(): JsonField<Theme> = theme

        /**
         * Returns the raw JSON value of [themeConfig].
         *
         * Unlike [themeConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("theme_config")
        @ExcludeMissing
        fun _themeConfig(): JsonField<ThemeConfig> = themeConfig

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

            /** Returns a mutable builder for constructing an instance of [Customization]. */
            fun builder() = Builder()
        }

        /** A builder for [Customization]. */
        class Builder internal constructor() {

            private var forceLanguage: JsonField<String> = JsonMissing.of()
            private var showOnDemandTag: JsonField<Boolean> = JsonMissing.of()
            private var showOrderDetails: JsonField<Boolean> = JsonMissing.of()
            private var theme: JsonField<Theme> = JsonMissing.of()
            private var themeConfig: JsonField<ThemeConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customization: Customization) = apply {
                forceLanguage = customization.forceLanguage
                showOnDemandTag = customization.showOnDemandTag
                showOrderDetails = customization.showOrderDetails
                theme = customization.theme
                themeConfig = customization.themeConfig
                additionalProperties = customization.additionalProperties.toMutableMap()
            }

            /** Force the checkout interface to render in a specific language (e.g. `en`, `es`) */
            fun forceLanguage(forceLanguage: String?) =
                forceLanguage(JsonField.ofNullable(forceLanguage))

            /**
             * Sets [Builder.forceLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.forceLanguage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun forceLanguage(forceLanguage: JsonField<String>) = apply {
                this.forceLanguage = forceLanguage
            }

            /**
             * Show on demand tag
             *
             * Default is true
             */
            fun showOnDemandTag(showOnDemandTag: Boolean) =
                showOnDemandTag(JsonField.of(showOnDemandTag))

            /**
             * Sets [Builder.showOnDemandTag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.showOnDemandTag] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun showOnDemandTag(showOnDemandTag: JsonField<Boolean>) = apply {
                this.showOnDemandTag = showOnDemandTag
            }

            /**
             * Show order details by default
             *
             * Default is true
             */
            fun showOrderDetails(showOrderDetails: Boolean) =
                showOrderDetails(JsonField.of(showOrderDetails))

            /**
             * Sets [Builder.showOrderDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.showOrderDetails] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun showOrderDetails(showOrderDetails: JsonField<Boolean>) = apply {
                this.showOrderDetails = showOrderDetails
            }

            /**
             * Theme of the page (determines which mode - light/dark/system - to use)
             *
             * Default is `System`.
             */
            fun theme(theme: Theme) = theme(JsonField.of(theme))

            /**
             * Sets [Builder.theme] to an arbitrary JSON value.
             *
             * You should usually call [Builder.theme] with a well-typed [Theme] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun theme(theme: JsonField<Theme>) = apply { this.theme = theme }

            /** Optional custom theme configuration with colors for light and dark modes */
            fun themeConfig(themeConfig: ThemeConfig?) =
                themeConfig(JsonField.ofNullable(themeConfig))

            /**
             * Sets [Builder.themeConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.themeConfig] with a well-typed [ThemeConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun themeConfig(themeConfig: JsonField<ThemeConfig>) = apply {
                this.themeConfig = themeConfig
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
             * Returns an immutable instance of [Customization].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Customization =
                Customization(
                    forceLanguage,
                    showOnDemandTag,
                    showOrderDetails,
                    theme,
                    themeConfig,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Customization = apply {
            if (validated) {
                return@apply
            }

            forceLanguage()
            showOnDemandTag()
            showOrderDetails()
            theme()?.validate()
            themeConfig()?.validate()
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
            (if (forceLanguage.asKnown() == null) 0 else 1) +
                (if (showOnDemandTag.asKnown() == null) 0 else 1) +
                (if (showOrderDetails.asKnown() == null) 0 else 1) +
                (theme.asKnown()?.validity() ?: 0) +
                (themeConfig.asKnown()?.validity() ?: 0)

        /**
         * Theme of the page (determines which mode - light/dark/system - to use)
         *
         * Default is `System`.
         */
        class Theme @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val DARK = of("dark")

                val LIGHT = of("light")

                val SYSTEM = of("system")

                fun of(value: String) = Theme(JsonField.of(value))
            }

            /** An enum containing [Theme]'s known values. */
            enum class Known {
                DARK,
                LIGHT,
                SYSTEM,
            }

            /**
             * An enum containing [Theme]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Theme] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DARK,
                LIGHT,
                SYSTEM,
                /**
                 * An enum member indicating that [Theme] was instantiated with an unknown value.
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
                    DARK -> Value.DARK
                    LIGHT -> Value.LIGHT
                    SYSTEM -> Value.SYSTEM
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
                    DARK -> Known.DARK
                    LIGHT -> Known.LIGHT
                    SYSTEM -> Known.SYSTEM
                    else -> throw DodoPaymentsInvalidDataException("Unknown Theme: $value")
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

            fun validate(): Theme = apply {
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

                return other is Theme && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Optional custom theme configuration with colors for light and dark modes */
        class ThemeConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val dark: JsonField<Dark>,
            private val fontSize: JsonField<FontSize>,
            private val fontWeight: JsonField<FontWeight>,
            private val light: JsonField<Light>,
            private val payButtonText: JsonField<String>,
            private val radius: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("dark") @ExcludeMissing dark: JsonField<Dark> = JsonMissing.of(),
                @JsonProperty("font_size")
                @ExcludeMissing
                fontSize: JsonField<FontSize> = JsonMissing.of(),
                @JsonProperty("font_weight")
                @ExcludeMissing
                fontWeight: JsonField<FontWeight> = JsonMissing.of(),
                @JsonProperty("light") @ExcludeMissing light: JsonField<Light> = JsonMissing.of(),
                @JsonProperty("pay_button_text")
                @ExcludeMissing
                payButtonText: JsonField<String> = JsonMissing.of(),
                @JsonProperty("radius") @ExcludeMissing radius: JsonField<String> = JsonMissing.of(),
            ) : this(dark, fontSize, fontWeight, light, payButtonText, radius, mutableMapOf())

            /**
             * Dark mode color configuration
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun dark(): Dark? = dark.getNullable("dark")

            /**
             * Font size for the checkout UI
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fontSize(): FontSize? = fontSize.getNullable("font_size")

            /**
             * Font weight for the checkout UI
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fontWeight(): FontWeight? = fontWeight.getNullable("font_weight")

            /**
             * Light mode color configuration
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun light(): Light? = light.getNullable("light")

            /**
             * Custom text for the pay button (e.g., "Complete Purchase", "Subscribe Now")
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun payButtonText(): String? = payButtonText.getNullable("pay_button_text")

            /**
             * Border radius for UI elements (e.g., "4px", "0.5rem", "8px")
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun radius(): String? = radius.getNullable("radius")

            /**
             * Returns the raw JSON value of [dark].
             *
             * Unlike [dark], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dark") @ExcludeMissing fun _dark(): JsonField<Dark> = dark

            /**
             * Returns the raw JSON value of [fontSize].
             *
             * Unlike [fontSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("font_size")
            @ExcludeMissing
            fun _fontSize(): JsonField<FontSize> = fontSize

            /**
             * Returns the raw JSON value of [fontWeight].
             *
             * Unlike [fontWeight], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("font_weight")
            @ExcludeMissing
            fun _fontWeight(): JsonField<FontWeight> = fontWeight

            /**
             * Returns the raw JSON value of [light].
             *
             * Unlike [light], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("light") @ExcludeMissing fun _light(): JsonField<Light> = light

            /**
             * Returns the raw JSON value of [payButtonText].
             *
             * Unlike [payButtonText], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pay_button_text")
            @ExcludeMissing
            fun _payButtonText(): JsonField<String> = payButtonText

            /**
             * Returns the raw JSON value of [radius].
             *
             * Unlike [radius], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("radius") @ExcludeMissing fun _radius(): JsonField<String> = radius

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

                /** Returns a mutable builder for constructing an instance of [ThemeConfig]. */
                fun builder() = Builder()
            }

            /** A builder for [ThemeConfig]. */
            class Builder internal constructor() {

                private var dark: JsonField<Dark> = JsonMissing.of()
                private var fontSize: JsonField<FontSize> = JsonMissing.of()
                private var fontWeight: JsonField<FontWeight> = JsonMissing.of()
                private var light: JsonField<Light> = JsonMissing.of()
                private var payButtonText: JsonField<String> = JsonMissing.of()
                private var radius: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(themeConfig: ThemeConfig) = apply {
                    dark = themeConfig.dark
                    fontSize = themeConfig.fontSize
                    fontWeight = themeConfig.fontWeight
                    light = themeConfig.light
                    payButtonText = themeConfig.payButtonText
                    radius = themeConfig.radius
                    additionalProperties = themeConfig.additionalProperties.toMutableMap()
                }

                /** Dark mode color configuration */
                fun dark(dark: Dark?) = dark(JsonField.ofNullable(dark))

                /**
                 * Sets [Builder.dark] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dark] with a well-typed [Dark] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun dark(dark: JsonField<Dark>) = apply { this.dark = dark }

                /** Font size for the checkout UI */
                fun fontSize(fontSize: FontSize?) = fontSize(JsonField.ofNullable(fontSize))

                /**
                 * Sets [Builder.fontSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fontSize] with a well-typed [FontSize] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fontSize(fontSize: JsonField<FontSize>) = apply { this.fontSize = fontSize }

                /** Font weight for the checkout UI */
                fun fontWeight(fontWeight: FontWeight?) =
                    fontWeight(JsonField.ofNullable(fontWeight))

                /**
                 * Sets [Builder.fontWeight] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fontWeight] with a well-typed [FontWeight] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fontWeight(fontWeight: JsonField<FontWeight>) = apply {
                    this.fontWeight = fontWeight
                }

                /** Light mode color configuration */
                fun light(light: Light?) = light(JsonField.ofNullable(light))

                /**
                 * Sets [Builder.light] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.light] with a well-typed [Light] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun light(light: JsonField<Light>) = apply { this.light = light }

                /** Custom text for the pay button (e.g., "Complete Purchase", "Subscribe Now") */
                fun payButtonText(payButtonText: String?) =
                    payButtonText(JsonField.ofNullable(payButtonText))

                /**
                 * Sets [Builder.payButtonText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payButtonText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payButtonText(payButtonText: JsonField<String>) = apply {
                    this.payButtonText = payButtonText
                }

                /** Border radius for UI elements (e.g., "4px", "0.5rem", "8px") */
                fun radius(radius: String?) = radius(JsonField.ofNullable(radius))

                /**
                 * Sets [Builder.radius] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.radius] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun radius(radius: JsonField<String>) = apply { this.radius = radius }

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
                 * Returns an immutable instance of [ThemeConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ThemeConfig =
                    ThemeConfig(
                        dark,
                        fontSize,
                        fontWeight,
                        light,
                        payButtonText,
                        radius,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ThemeConfig = apply {
                if (validated) {
                    return@apply
                }

                dark()?.validate()
                fontSize()?.validate()
                fontWeight()?.validate()
                light()?.validate()
                payButtonText()
                radius()
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
                (dark.asKnown()?.validity() ?: 0) +
                    (fontSize.asKnown()?.validity() ?: 0) +
                    (fontWeight.asKnown()?.validity() ?: 0) +
                    (light.asKnown()?.validity() ?: 0) +
                    (if (payButtonText.asKnown() == null) 0 else 1) +
                    (if (radius.asKnown() == null) 0 else 1)

            /** Dark mode color configuration */
            class Dark
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bgPrimary: JsonField<String>,
                private val bgSecondary: JsonField<String>,
                private val borderPrimary: JsonField<String>,
                private val borderSecondary: JsonField<String>,
                private val buttonPrimary: JsonField<String>,
                private val buttonPrimaryHover: JsonField<String>,
                private val buttonSecondary: JsonField<String>,
                private val buttonSecondaryHover: JsonField<String>,
                private val buttonTextPrimary: JsonField<String>,
                private val buttonTextSecondary: JsonField<String>,
                private val inputFocusBorder: JsonField<String>,
                private val textError: JsonField<String>,
                private val textPlaceholder: JsonField<String>,
                private val textPrimary: JsonField<String>,
                private val textSecondary: JsonField<String>,
                private val textSuccess: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bg_primary")
                    @ExcludeMissing
                    bgPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("bg_secondary")
                    @ExcludeMissing
                    bgSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("border_primary")
                    @ExcludeMissing
                    borderPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("border_secondary")
                    @ExcludeMissing
                    borderSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_primary")
                    @ExcludeMissing
                    buttonPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_primary_hover")
                    @ExcludeMissing
                    buttonPrimaryHover: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_secondary")
                    @ExcludeMissing
                    buttonSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_secondary_hover")
                    @ExcludeMissing
                    buttonSecondaryHover: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_text_primary")
                    @ExcludeMissing
                    buttonTextPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_text_secondary")
                    @ExcludeMissing
                    buttonTextSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("input_focus_border")
                    @ExcludeMissing
                    inputFocusBorder: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_error")
                    @ExcludeMissing
                    textError: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_placeholder")
                    @ExcludeMissing
                    textPlaceholder: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_primary")
                    @ExcludeMissing
                    textPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_secondary")
                    @ExcludeMissing
                    textSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_success")
                    @ExcludeMissing
                    textSuccess: JsonField<String> = JsonMissing.of(),
                ) : this(
                    bgPrimary,
                    bgSecondary,
                    borderPrimary,
                    borderSecondary,
                    buttonPrimary,
                    buttonPrimaryHover,
                    buttonSecondary,
                    buttonSecondaryHover,
                    buttonTextPrimary,
                    buttonTextSecondary,
                    inputFocusBorder,
                    textError,
                    textPlaceholder,
                    textPrimary,
                    textSecondary,
                    textSuccess,
                    mutableMapOf(),
                )

                /**
                 * Background primary color
                 *
                 * Examples: `"#ffffff"`, `"rgb(255, 255, 255)"`, `"white"`
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bgPrimary(): String? = bgPrimary.getNullable("bg_primary")

                /**
                 * Background secondary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bgSecondary(): String? = bgSecondary.getNullable("bg_secondary")

                /**
                 * Border primary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun borderPrimary(): String? = borderPrimary.getNullable("border_primary")

                /**
                 * Border secondary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun borderSecondary(): String? = borderSecondary.getNullable("border_secondary")

                /**
                 * Primary button background color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonPrimary(): String? = buttonPrimary.getNullable("button_primary")

                /**
                 * Primary button hover color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonPrimaryHover(): String? =
                    buttonPrimaryHover.getNullable("button_primary_hover")

                /**
                 * Secondary button background color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonSecondary(): String? = buttonSecondary.getNullable("button_secondary")

                /**
                 * Secondary button hover color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonSecondaryHover(): String? =
                    buttonSecondaryHover.getNullable("button_secondary_hover")

                /**
                 * Primary button text color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonTextPrimary(): String? =
                    buttonTextPrimary.getNullable("button_text_primary")

                /**
                 * Secondary button text color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonTextSecondary(): String? =
                    buttonTextSecondary.getNullable("button_text_secondary")

                /**
                 * Input focus border color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inputFocusBorder(): String? = inputFocusBorder.getNullable("input_focus_border")

                /**
                 * Text error color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textError(): String? = textError.getNullable("text_error")

                /**
                 * Text placeholder color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textPlaceholder(): String? = textPlaceholder.getNullable("text_placeholder")

                /**
                 * Text primary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textPrimary(): String? = textPrimary.getNullable("text_primary")

                /**
                 * Text secondary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textSecondary(): String? = textSecondary.getNullable("text_secondary")

                /**
                 * Text success color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textSuccess(): String? = textSuccess.getNullable("text_success")

                /**
                 * Returns the raw JSON value of [bgPrimary].
                 *
                 * Unlike [bgPrimary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bg_primary")
                @ExcludeMissing
                fun _bgPrimary(): JsonField<String> = bgPrimary

                /**
                 * Returns the raw JSON value of [bgSecondary].
                 *
                 * Unlike [bgSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("bg_secondary")
                @ExcludeMissing
                fun _bgSecondary(): JsonField<String> = bgSecondary

                /**
                 * Returns the raw JSON value of [borderPrimary].
                 *
                 * Unlike [borderPrimary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("border_primary")
                @ExcludeMissing
                fun _borderPrimary(): JsonField<String> = borderPrimary

                /**
                 * Returns the raw JSON value of [borderSecondary].
                 *
                 * Unlike [borderSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("border_secondary")
                @ExcludeMissing
                fun _borderSecondary(): JsonField<String> = borderSecondary

                /**
                 * Returns the raw JSON value of [buttonPrimary].
                 *
                 * Unlike [buttonPrimary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_primary")
                @ExcludeMissing
                fun _buttonPrimary(): JsonField<String> = buttonPrimary

                /**
                 * Returns the raw JSON value of [buttonPrimaryHover].
                 *
                 * Unlike [buttonPrimaryHover], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_primary_hover")
                @ExcludeMissing
                fun _buttonPrimaryHover(): JsonField<String> = buttonPrimaryHover

                /**
                 * Returns the raw JSON value of [buttonSecondary].
                 *
                 * Unlike [buttonSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_secondary")
                @ExcludeMissing
                fun _buttonSecondary(): JsonField<String> = buttonSecondary

                /**
                 * Returns the raw JSON value of [buttonSecondaryHover].
                 *
                 * Unlike [buttonSecondaryHover], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_secondary_hover")
                @ExcludeMissing
                fun _buttonSecondaryHover(): JsonField<String> = buttonSecondaryHover

                /**
                 * Returns the raw JSON value of [buttonTextPrimary].
                 *
                 * Unlike [buttonTextPrimary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_text_primary")
                @ExcludeMissing
                fun _buttonTextPrimary(): JsonField<String> = buttonTextPrimary

                /**
                 * Returns the raw JSON value of [buttonTextSecondary].
                 *
                 * Unlike [buttonTextSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_text_secondary")
                @ExcludeMissing
                fun _buttonTextSecondary(): JsonField<String> = buttonTextSecondary

                /**
                 * Returns the raw JSON value of [inputFocusBorder].
                 *
                 * Unlike [inputFocusBorder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("input_focus_border")
                @ExcludeMissing
                fun _inputFocusBorder(): JsonField<String> = inputFocusBorder

                /**
                 * Returns the raw JSON value of [textError].
                 *
                 * Unlike [textError], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text_error")
                @ExcludeMissing
                fun _textError(): JsonField<String> = textError

                /**
                 * Returns the raw JSON value of [textPlaceholder].
                 *
                 * Unlike [textPlaceholder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("text_placeholder")
                @ExcludeMissing
                fun _textPlaceholder(): JsonField<String> = textPlaceholder

                /**
                 * Returns the raw JSON value of [textPrimary].
                 *
                 * Unlike [textPrimary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("text_primary")
                @ExcludeMissing
                fun _textPrimary(): JsonField<String> = textPrimary

                /**
                 * Returns the raw JSON value of [textSecondary].
                 *
                 * Unlike [textSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("text_secondary")
                @ExcludeMissing
                fun _textSecondary(): JsonField<String> = textSecondary

                /**
                 * Returns the raw JSON value of [textSuccess].
                 *
                 * Unlike [textSuccess], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("text_success")
                @ExcludeMissing
                fun _textSuccess(): JsonField<String> = textSuccess

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

                    /** Returns a mutable builder for constructing an instance of [Dark]. */
                    fun builder() = Builder()
                }

                /** A builder for [Dark]. */
                class Builder internal constructor() {

                    private var bgPrimary: JsonField<String> = JsonMissing.of()
                    private var bgSecondary: JsonField<String> = JsonMissing.of()
                    private var borderPrimary: JsonField<String> = JsonMissing.of()
                    private var borderSecondary: JsonField<String> = JsonMissing.of()
                    private var buttonPrimary: JsonField<String> = JsonMissing.of()
                    private var buttonPrimaryHover: JsonField<String> = JsonMissing.of()
                    private var buttonSecondary: JsonField<String> = JsonMissing.of()
                    private var buttonSecondaryHover: JsonField<String> = JsonMissing.of()
                    private var buttonTextPrimary: JsonField<String> = JsonMissing.of()
                    private var buttonTextSecondary: JsonField<String> = JsonMissing.of()
                    private var inputFocusBorder: JsonField<String> = JsonMissing.of()
                    private var textError: JsonField<String> = JsonMissing.of()
                    private var textPlaceholder: JsonField<String> = JsonMissing.of()
                    private var textPrimary: JsonField<String> = JsonMissing.of()
                    private var textSecondary: JsonField<String> = JsonMissing.of()
                    private var textSuccess: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(dark: Dark) = apply {
                        bgPrimary = dark.bgPrimary
                        bgSecondary = dark.bgSecondary
                        borderPrimary = dark.borderPrimary
                        borderSecondary = dark.borderSecondary
                        buttonPrimary = dark.buttonPrimary
                        buttonPrimaryHover = dark.buttonPrimaryHover
                        buttonSecondary = dark.buttonSecondary
                        buttonSecondaryHover = dark.buttonSecondaryHover
                        buttonTextPrimary = dark.buttonTextPrimary
                        buttonTextSecondary = dark.buttonTextSecondary
                        inputFocusBorder = dark.inputFocusBorder
                        textError = dark.textError
                        textPlaceholder = dark.textPlaceholder
                        textPrimary = dark.textPrimary
                        textSecondary = dark.textSecondary
                        textSuccess = dark.textSuccess
                        additionalProperties = dark.additionalProperties.toMutableMap()
                    }

                    /**
                     * Background primary color
                     *
                     * Examples: `"#ffffff"`, `"rgb(255, 255, 255)"`, `"white"`
                     */
                    fun bgPrimary(bgPrimary: String?) = bgPrimary(JsonField.ofNullable(bgPrimary))

                    /**
                     * Sets [Builder.bgPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bgPrimary] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bgPrimary(bgPrimary: JsonField<String>) = apply {
                        this.bgPrimary = bgPrimary
                    }

                    /** Background secondary color */
                    fun bgSecondary(bgSecondary: String?) =
                        bgSecondary(JsonField.ofNullable(bgSecondary))

                    /**
                     * Sets [Builder.bgSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bgSecondary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun bgSecondary(bgSecondary: JsonField<String>) = apply {
                        this.bgSecondary = bgSecondary
                    }

                    /** Border primary color */
                    fun borderPrimary(borderPrimary: String?) =
                        borderPrimary(JsonField.ofNullable(borderPrimary))

                    /**
                     * Sets [Builder.borderPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.borderPrimary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun borderPrimary(borderPrimary: JsonField<String>) = apply {
                        this.borderPrimary = borderPrimary
                    }

                    /** Border secondary color */
                    fun borderSecondary(borderSecondary: String?) =
                        borderSecondary(JsonField.ofNullable(borderSecondary))

                    /**
                     * Sets [Builder.borderSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.borderSecondary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun borderSecondary(borderSecondary: JsonField<String>) = apply {
                        this.borderSecondary = borderSecondary
                    }

                    /** Primary button background color */
                    fun buttonPrimary(buttonPrimary: String?) =
                        buttonPrimary(JsonField.ofNullable(buttonPrimary))

                    /**
                     * Sets [Builder.buttonPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonPrimary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonPrimary(buttonPrimary: JsonField<String>) = apply {
                        this.buttonPrimary = buttonPrimary
                    }

                    /** Primary button hover color */
                    fun buttonPrimaryHover(buttonPrimaryHover: String?) =
                        buttonPrimaryHover(JsonField.ofNullable(buttonPrimaryHover))

                    /**
                     * Sets [Builder.buttonPrimaryHover] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonPrimaryHover] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonPrimaryHover(buttonPrimaryHover: JsonField<String>) = apply {
                        this.buttonPrimaryHover = buttonPrimaryHover
                    }

                    /** Secondary button background color */
                    fun buttonSecondary(buttonSecondary: String?) =
                        buttonSecondary(JsonField.ofNullable(buttonSecondary))

                    /**
                     * Sets [Builder.buttonSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonSecondary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonSecondary(buttonSecondary: JsonField<String>) = apply {
                        this.buttonSecondary = buttonSecondary
                    }

                    /** Secondary button hover color */
                    fun buttonSecondaryHover(buttonSecondaryHover: String?) =
                        buttonSecondaryHover(JsonField.ofNullable(buttonSecondaryHover))

                    /**
                     * Sets [Builder.buttonSecondaryHover] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonSecondaryHover] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonSecondaryHover(buttonSecondaryHover: JsonField<String>) = apply {
                        this.buttonSecondaryHover = buttonSecondaryHover
                    }

                    /** Primary button text color */
                    fun buttonTextPrimary(buttonTextPrimary: String?) =
                        buttonTextPrimary(JsonField.ofNullable(buttonTextPrimary))

                    /**
                     * Sets [Builder.buttonTextPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonTextPrimary] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonTextPrimary(buttonTextPrimary: JsonField<String>) = apply {
                        this.buttonTextPrimary = buttonTextPrimary
                    }

                    /** Secondary button text color */
                    fun buttonTextSecondary(buttonTextSecondary: String?) =
                        buttonTextSecondary(JsonField.ofNullable(buttonTextSecondary))

                    /**
                     * Sets [Builder.buttonTextSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonTextSecondary] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonTextSecondary(buttonTextSecondary: JsonField<String>) = apply {
                        this.buttonTextSecondary = buttonTextSecondary
                    }

                    /** Input focus border color */
                    fun inputFocusBorder(inputFocusBorder: String?) =
                        inputFocusBorder(JsonField.ofNullable(inputFocusBorder))

                    /**
                     * Sets [Builder.inputFocusBorder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputFocusBorder] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inputFocusBorder(inputFocusBorder: JsonField<String>) = apply {
                        this.inputFocusBorder = inputFocusBorder
                    }

                    /** Text error color */
                    fun textError(textError: String?) = textError(JsonField.ofNullable(textError))

                    /**
                     * Sets [Builder.textError] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textError] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun textError(textError: JsonField<String>) = apply {
                        this.textError = textError
                    }

                    /** Text placeholder color */
                    fun textPlaceholder(textPlaceholder: String?) =
                        textPlaceholder(JsonField.ofNullable(textPlaceholder))

                    /**
                     * Sets [Builder.textPlaceholder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textPlaceholder] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun textPlaceholder(textPlaceholder: JsonField<String>) = apply {
                        this.textPlaceholder = textPlaceholder
                    }

                    /** Text primary color */
                    fun textPrimary(textPrimary: String?) =
                        textPrimary(JsonField.ofNullable(textPrimary))

                    /**
                     * Sets [Builder.textPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textPrimary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun textPrimary(textPrimary: JsonField<String>) = apply {
                        this.textPrimary = textPrimary
                    }

                    /** Text secondary color */
                    fun textSecondary(textSecondary: String?) =
                        textSecondary(JsonField.ofNullable(textSecondary))

                    /**
                     * Sets [Builder.textSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textSecondary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun textSecondary(textSecondary: JsonField<String>) = apply {
                        this.textSecondary = textSecondary
                    }

                    /** Text success color */
                    fun textSuccess(textSuccess: String?) =
                        textSuccess(JsonField.ofNullable(textSuccess))

                    /**
                     * Sets [Builder.textSuccess] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textSuccess] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun textSuccess(textSuccess: JsonField<String>) = apply {
                        this.textSuccess = textSuccess
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
                     * Returns an immutable instance of [Dark].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Dark =
                        Dark(
                            bgPrimary,
                            bgSecondary,
                            borderPrimary,
                            borderSecondary,
                            buttonPrimary,
                            buttonPrimaryHover,
                            buttonSecondary,
                            buttonSecondaryHover,
                            buttonTextPrimary,
                            buttonTextSecondary,
                            inputFocusBorder,
                            textError,
                            textPlaceholder,
                            textPrimary,
                            textSecondary,
                            textSuccess,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Dark = apply {
                    if (validated) {
                        return@apply
                    }

                    bgPrimary()
                    bgSecondary()
                    borderPrimary()
                    borderSecondary()
                    buttonPrimary()
                    buttonPrimaryHover()
                    buttonSecondary()
                    buttonSecondaryHover()
                    buttonTextPrimary()
                    buttonTextSecondary()
                    inputFocusBorder()
                    textError()
                    textPlaceholder()
                    textPrimary()
                    textSecondary()
                    textSuccess()
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
                    (if (bgPrimary.asKnown() == null) 0 else 1) +
                        (if (bgSecondary.asKnown() == null) 0 else 1) +
                        (if (borderPrimary.asKnown() == null) 0 else 1) +
                        (if (borderSecondary.asKnown() == null) 0 else 1) +
                        (if (buttonPrimary.asKnown() == null) 0 else 1) +
                        (if (buttonPrimaryHover.asKnown() == null) 0 else 1) +
                        (if (buttonSecondary.asKnown() == null) 0 else 1) +
                        (if (buttonSecondaryHover.asKnown() == null) 0 else 1) +
                        (if (buttonTextPrimary.asKnown() == null) 0 else 1) +
                        (if (buttonTextSecondary.asKnown() == null) 0 else 1) +
                        (if (inputFocusBorder.asKnown() == null) 0 else 1) +
                        (if (textError.asKnown() == null) 0 else 1) +
                        (if (textPlaceholder.asKnown() == null) 0 else 1) +
                        (if (textPrimary.asKnown() == null) 0 else 1) +
                        (if (textSecondary.asKnown() == null) 0 else 1) +
                        (if (textSuccess.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Dark &&
                        bgPrimary == other.bgPrimary &&
                        bgSecondary == other.bgSecondary &&
                        borderPrimary == other.borderPrimary &&
                        borderSecondary == other.borderSecondary &&
                        buttonPrimary == other.buttonPrimary &&
                        buttonPrimaryHover == other.buttonPrimaryHover &&
                        buttonSecondary == other.buttonSecondary &&
                        buttonSecondaryHover == other.buttonSecondaryHover &&
                        buttonTextPrimary == other.buttonTextPrimary &&
                        buttonTextSecondary == other.buttonTextSecondary &&
                        inputFocusBorder == other.inputFocusBorder &&
                        textError == other.textError &&
                        textPlaceholder == other.textPlaceholder &&
                        textPrimary == other.textPrimary &&
                        textSecondary == other.textSecondary &&
                        textSuccess == other.textSuccess &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bgPrimary,
                        bgSecondary,
                        borderPrimary,
                        borderSecondary,
                        buttonPrimary,
                        buttonPrimaryHover,
                        buttonSecondary,
                        buttonSecondaryHover,
                        buttonTextPrimary,
                        buttonTextSecondary,
                        inputFocusBorder,
                        textError,
                        textPlaceholder,
                        textPrimary,
                        textSecondary,
                        textSuccess,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Dark{bgPrimary=$bgPrimary, bgSecondary=$bgSecondary, borderPrimary=$borderPrimary, borderSecondary=$borderSecondary, buttonPrimary=$buttonPrimary, buttonPrimaryHover=$buttonPrimaryHover, buttonSecondary=$buttonSecondary, buttonSecondaryHover=$buttonSecondaryHover, buttonTextPrimary=$buttonTextPrimary, buttonTextSecondary=$buttonTextSecondary, inputFocusBorder=$inputFocusBorder, textError=$textError, textPlaceholder=$textPlaceholder, textPrimary=$textPrimary, textSecondary=$textSecondary, textSuccess=$textSuccess, additionalProperties=$additionalProperties}"
            }

            /** Font size for the checkout UI */
            class FontSize @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val XS = of("xs")

                    val SM = of("sm")

                    val MD = of("md")

                    val LG = of("lg")

                    val XL = of("xl")

                    val _2XL = of("2xl")

                    fun of(value: String) = FontSize(JsonField.of(value))
                }

                /** An enum containing [FontSize]'s known values. */
                enum class Known {
                    XS,
                    SM,
                    MD,
                    LG,
                    XL,
                    _2XL,
                }

                /**
                 * An enum containing [FontSize]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [FontSize] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    XS,
                    SM,
                    MD,
                    LG,
                    XL,
                    _2XL,
                    /**
                     * An enum member indicating that [FontSize] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        XS -> Value.XS
                        SM -> Value.SM
                        MD -> Value.MD
                        LG -> Value.LG
                        XL -> Value.XL
                        _2XL -> Value._2XL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        XS -> Known.XS
                        SM -> Known.SM
                        MD -> Known.MD
                        LG -> Known.LG
                        XL -> Known.XL
                        _2XL -> Known._2XL
                        else -> throw DodoPaymentsInvalidDataException("Unknown FontSize: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): FontSize = apply {
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

                    return other is FontSize && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Font weight for the checkout UI */
            class FontWeight
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val NORMAL = of("normal")

                    val MEDIUM = of("medium")

                    val BOLD = of("bold")

                    val EXTRA_BOLD = of("extraBold")

                    fun of(value: String) = FontWeight(JsonField.of(value))
                }

                /** An enum containing [FontWeight]'s known values. */
                enum class Known {
                    NORMAL,
                    MEDIUM,
                    BOLD,
                    EXTRA_BOLD,
                }

                /**
                 * An enum containing [FontWeight]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [FontWeight] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NORMAL,
                    MEDIUM,
                    BOLD,
                    EXTRA_BOLD,
                    /**
                     * An enum member indicating that [FontWeight] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NORMAL -> Value.NORMAL
                        MEDIUM -> Value.MEDIUM
                        BOLD -> Value.BOLD
                        EXTRA_BOLD -> Value.EXTRA_BOLD
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        NORMAL -> Known.NORMAL
                        MEDIUM -> Known.MEDIUM
                        BOLD -> Known.BOLD
                        EXTRA_BOLD -> Known.EXTRA_BOLD
                        else -> throw DodoPaymentsInvalidDataException("Unknown FontWeight: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): FontWeight = apply {
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

                    return other is FontWeight && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Light mode color configuration */
            class Light
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bgPrimary: JsonField<String>,
                private val bgSecondary: JsonField<String>,
                private val borderPrimary: JsonField<String>,
                private val borderSecondary: JsonField<String>,
                private val buttonPrimary: JsonField<String>,
                private val buttonPrimaryHover: JsonField<String>,
                private val buttonSecondary: JsonField<String>,
                private val buttonSecondaryHover: JsonField<String>,
                private val buttonTextPrimary: JsonField<String>,
                private val buttonTextSecondary: JsonField<String>,
                private val inputFocusBorder: JsonField<String>,
                private val textError: JsonField<String>,
                private val textPlaceholder: JsonField<String>,
                private val textPrimary: JsonField<String>,
                private val textSecondary: JsonField<String>,
                private val textSuccess: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bg_primary")
                    @ExcludeMissing
                    bgPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("bg_secondary")
                    @ExcludeMissing
                    bgSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("border_primary")
                    @ExcludeMissing
                    borderPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("border_secondary")
                    @ExcludeMissing
                    borderSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_primary")
                    @ExcludeMissing
                    buttonPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_primary_hover")
                    @ExcludeMissing
                    buttonPrimaryHover: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_secondary")
                    @ExcludeMissing
                    buttonSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_secondary_hover")
                    @ExcludeMissing
                    buttonSecondaryHover: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_text_primary")
                    @ExcludeMissing
                    buttonTextPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("button_text_secondary")
                    @ExcludeMissing
                    buttonTextSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("input_focus_border")
                    @ExcludeMissing
                    inputFocusBorder: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_error")
                    @ExcludeMissing
                    textError: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_placeholder")
                    @ExcludeMissing
                    textPlaceholder: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_primary")
                    @ExcludeMissing
                    textPrimary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_secondary")
                    @ExcludeMissing
                    textSecondary: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("text_success")
                    @ExcludeMissing
                    textSuccess: JsonField<String> = JsonMissing.of(),
                ) : this(
                    bgPrimary,
                    bgSecondary,
                    borderPrimary,
                    borderSecondary,
                    buttonPrimary,
                    buttonPrimaryHover,
                    buttonSecondary,
                    buttonSecondaryHover,
                    buttonTextPrimary,
                    buttonTextSecondary,
                    inputFocusBorder,
                    textError,
                    textPlaceholder,
                    textPrimary,
                    textSecondary,
                    textSuccess,
                    mutableMapOf(),
                )

                /**
                 * Background primary color
                 *
                 * Examples: `"#ffffff"`, `"rgb(255, 255, 255)"`, `"white"`
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bgPrimary(): String? = bgPrimary.getNullable("bg_primary")

                /**
                 * Background secondary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bgSecondary(): String? = bgSecondary.getNullable("bg_secondary")

                /**
                 * Border primary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun borderPrimary(): String? = borderPrimary.getNullable("border_primary")

                /**
                 * Border secondary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun borderSecondary(): String? = borderSecondary.getNullable("border_secondary")

                /**
                 * Primary button background color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonPrimary(): String? = buttonPrimary.getNullable("button_primary")

                /**
                 * Primary button hover color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonPrimaryHover(): String? =
                    buttonPrimaryHover.getNullable("button_primary_hover")

                /**
                 * Secondary button background color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonSecondary(): String? = buttonSecondary.getNullable("button_secondary")

                /**
                 * Secondary button hover color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonSecondaryHover(): String? =
                    buttonSecondaryHover.getNullable("button_secondary_hover")

                /**
                 * Primary button text color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonTextPrimary(): String? =
                    buttonTextPrimary.getNullable("button_text_primary")

                /**
                 * Secondary button text color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun buttonTextSecondary(): String? =
                    buttonTextSecondary.getNullable("button_text_secondary")

                /**
                 * Input focus border color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inputFocusBorder(): String? = inputFocusBorder.getNullable("input_focus_border")

                /**
                 * Text error color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textError(): String? = textError.getNullable("text_error")

                /**
                 * Text placeholder color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textPlaceholder(): String? = textPlaceholder.getNullable("text_placeholder")

                /**
                 * Text primary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textPrimary(): String? = textPrimary.getNullable("text_primary")

                /**
                 * Text secondary color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textSecondary(): String? = textSecondary.getNullable("text_secondary")

                /**
                 * Text success color
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun textSuccess(): String? = textSuccess.getNullable("text_success")

                /**
                 * Returns the raw JSON value of [bgPrimary].
                 *
                 * Unlike [bgPrimary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bg_primary")
                @ExcludeMissing
                fun _bgPrimary(): JsonField<String> = bgPrimary

                /**
                 * Returns the raw JSON value of [bgSecondary].
                 *
                 * Unlike [bgSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("bg_secondary")
                @ExcludeMissing
                fun _bgSecondary(): JsonField<String> = bgSecondary

                /**
                 * Returns the raw JSON value of [borderPrimary].
                 *
                 * Unlike [borderPrimary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("border_primary")
                @ExcludeMissing
                fun _borderPrimary(): JsonField<String> = borderPrimary

                /**
                 * Returns the raw JSON value of [borderSecondary].
                 *
                 * Unlike [borderSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("border_secondary")
                @ExcludeMissing
                fun _borderSecondary(): JsonField<String> = borderSecondary

                /**
                 * Returns the raw JSON value of [buttonPrimary].
                 *
                 * Unlike [buttonPrimary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_primary")
                @ExcludeMissing
                fun _buttonPrimary(): JsonField<String> = buttonPrimary

                /**
                 * Returns the raw JSON value of [buttonPrimaryHover].
                 *
                 * Unlike [buttonPrimaryHover], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_primary_hover")
                @ExcludeMissing
                fun _buttonPrimaryHover(): JsonField<String> = buttonPrimaryHover

                /**
                 * Returns the raw JSON value of [buttonSecondary].
                 *
                 * Unlike [buttonSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_secondary")
                @ExcludeMissing
                fun _buttonSecondary(): JsonField<String> = buttonSecondary

                /**
                 * Returns the raw JSON value of [buttonSecondaryHover].
                 *
                 * Unlike [buttonSecondaryHover], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_secondary_hover")
                @ExcludeMissing
                fun _buttonSecondaryHover(): JsonField<String> = buttonSecondaryHover

                /**
                 * Returns the raw JSON value of [buttonTextPrimary].
                 *
                 * Unlike [buttonTextPrimary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_text_primary")
                @ExcludeMissing
                fun _buttonTextPrimary(): JsonField<String> = buttonTextPrimary

                /**
                 * Returns the raw JSON value of [buttonTextSecondary].
                 *
                 * Unlike [buttonTextSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("button_text_secondary")
                @ExcludeMissing
                fun _buttonTextSecondary(): JsonField<String> = buttonTextSecondary

                /**
                 * Returns the raw JSON value of [inputFocusBorder].
                 *
                 * Unlike [inputFocusBorder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("input_focus_border")
                @ExcludeMissing
                fun _inputFocusBorder(): JsonField<String> = inputFocusBorder

                /**
                 * Returns the raw JSON value of [textError].
                 *
                 * Unlike [textError], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text_error")
                @ExcludeMissing
                fun _textError(): JsonField<String> = textError

                /**
                 * Returns the raw JSON value of [textPlaceholder].
                 *
                 * Unlike [textPlaceholder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("text_placeholder")
                @ExcludeMissing
                fun _textPlaceholder(): JsonField<String> = textPlaceholder

                /**
                 * Returns the raw JSON value of [textPrimary].
                 *
                 * Unlike [textPrimary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("text_primary")
                @ExcludeMissing
                fun _textPrimary(): JsonField<String> = textPrimary

                /**
                 * Returns the raw JSON value of [textSecondary].
                 *
                 * Unlike [textSecondary], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("text_secondary")
                @ExcludeMissing
                fun _textSecondary(): JsonField<String> = textSecondary

                /**
                 * Returns the raw JSON value of [textSuccess].
                 *
                 * Unlike [textSuccess], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("text_success")
                @ExcludeMissing
                fun _textSuccess(): JsonField<String> = textSuccess

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

                    /** Returns a mutable builder for constructing an instance of [Light]. */
                    fun builder() = Builder()
                }

                /** A builder for [Light]. */
                class Builder internal constructor() {

                    private var bgPrimary: JsonField<String> = JsonMissing.of()
                    private var bgSecondary: JsonField<String> = JsonMissing.of()
                    private var borderPrimary: JsonField<String> = JsonMissing.of()
                    private var borderSecondary: JsonField<String> = JsonMissing.of()
                    private var buttonPrimary: JsonField<String> = JsonMissing.of()
                    private var buttonPrimaryHover: JsonField<String> = JsonMissing.of()
                    private var buttonSecondary: JsonField<String> = JsonMissing.of()
                    private var buttonSecondaryHover: JsonField<String> = JsonMissing.of()
                    private var buttonTextPrimary: JsonField<String> = JsonMissing.of()
                    private var buttonTextSecondary: JsonField<String> = JsonMissing.of()
                    private var inputFocusBorder: JsonField<String> = JsonMissing.of()
                    private var textError: JsonField<String> = JsonMissing.of()
                    private var textPlaceholder: JsonField<String> = JsonMissing.of()
                    private var textPrimary: JsonField<String> = JsonMissing.of()
                    private var textSecondary: JsonField<String> = JsonMissing.of()
                    private var textSuccess: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(light: Light) = apply {
                        bgPrimary = light.bgPrimary
                        bgSecondary = light.bgSecondary
                        borderPrimary = light.borderPrimary
                        borderSecondary = light.borderSecondary
                        buttonPrimary = light.buttonPrimary
                        buttonPrimaryHover = light.buttonPrimaryHover
                        buttonSecondary = light.buttonSecondary
                        buttonSecondaryHover = light.buttonSecondaryHover
                        buttonTextPrimary = light.buttonTextPrimary
                        buttonTextSecondary = light.buttonTextSecondary
                        inputFocusBorder = light.inputFocusBorder
                        textError = light.textError
                        textPlaceholder = light.textPlaceholder
                        textPrimary = light.textPrimary
                        textSecondary = light.textSecondary
                        textSuccess = light.textSuccess
                        additionalProperties = light.additionalProperties.toMutableMap()
                    }

                    /**
                     * Background primary color
                     *
                     * Examples: `"#ffffff"`, `"rgb(255, 255, 255)"`, `"white"`
                     */
                    fun bgPrimary(bgPrimary: String?) = bgPrimary(JsonField.ofNullable(bgPrimary))

                    /**
                     * Sets [Builder.bgPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bgPrimary] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bgPrimary(bgPrimary: JsonField<String>) = apply {
                        this.bgPrimary = bgPrimary
                    }

                    /** Background secondary color */
                    fun bgSecondary(bgSecondary: String?) =
                        bgSecondary(JsonField.ofNullable(bgSecondary))

                    /**
                     * Sets [Builder.bgSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bgSecondary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun bgSecondary(bgSecondary: JsonField<String>) = apply {
                        this.bgSecondary = bgSecondary
                    }

                    /** Border primary color */
                    fun borderPrimary(borderPrimary: String?) =
                        borderPrimary(JsonField.ofNullable(borderPrimary))

                    /**
                     * Sets [Builder.borderPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.borderPrimary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun borderPrimary(borderPrimary: JsonField<String>) = apply {
                        this.borderPrimary = borderPrimary
                    }

                    /** Border secondary color */
                    fun borderSecondary(borderSecondary: String?) =
                        borderSecondary(JsonField.ofNullable(borderSecondary))

                    /**
                     * Sets [Builder.borderSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.borderSecondary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun borderSecondary(borderSecondary: JsonField<String>) = apply {
                        this.borderSecondary = borderSecondary
                    }

                    /** Primary button background color */
                    fun buttonPrimary(buttonPrimary: String?) =
                        buttonPrimary(JsonField.ofNullable(buttonPrimary))

                    /**
                     * Sets [Builder.buttonPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonPrimary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonPrimary(buttonPrimary: JsonField<String>) = apply {
                        this.buttonPrimary = buttonPrimary
                    }

                    /** Primary button hover color */
                    fun buttonPrimaryHover(buttonPrimaryHover: String?) =
                        buttonPrimaryHover(JsonField.ofNullable(buttonPrimaryHover))

                    /**
                     * Sets [Builder.buttonPrimaryHover] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonPrimaryHover] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonPrimaryHover(buttonPrimaryHover: JsonField<String>) = apply {
                        this.buttonPrimaryHover = buttonPrimaryHover
                    }

                    /** Secondary button background color */
                    fun buttonSecondary(buttonSecondary: String?) =
                        buttonSecondary(JsonField.ofNullable(buttonSecondary))

                    /**
                     * Sets [Builder.buttonSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonSecondary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonSecondary(buttonSecondary: JsonField<String>) = apply {
                        this.buttonSecondary = buttonSecondary
                    }

                    /** Secondary button hover color */
                    fun buttonSecondaryHover(buttonSecondaryHover: String?) =
                        buttonSecondaryHover(JsonField.ofNullable(buttonSecondaryHover))

                    /**
                     * Sets [Builder.buttonSecondaryHover] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonSecondaryHover] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonSecondaryHover(buttonSecondaryHover: JsonField<String>) = apply {
                        this.buttonSecondaryHover = buttonSecondaryHover
                    }

                    /** Primary button text color */
                    fun buttonTextPrimary(buttonTextPrimary: String?) =
                        buttonTextPrimary(JsonField.ofNullable(buttonTextPrimary))

                    /**
                     * Sets [Builder.buttonTextPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonTextPrimary] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonTextPrimary(buttonTextPrimary: JsonField<String>) = apply {
                        this.buttonTextPrimary = buttonTextPrimary
                    }

                    /** Secondary button text color */
                    fun buttonTextSecondary(buttonTextSecondary: String?) =
                        buttonTextSecondary(JsonField.ofNullable(buttonTextSecondary))

                    /**
                     * Sets [Builder.buttonTextSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.buttonTextSecondary] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun buttonTextSecondary(buttonTextSecondary: JsonField<String>) = apply {
                        this.buttonTextSecondary = buttonTextSecondary
                    }

                    /** Input focus border color */
                    fun inputFocusBorder(inputFocusBorder: String?) =
                        inputFocusBorder(JsonField.ofNullable(inputFocusBorder))

                    /**
                     * Sets [Builder.inputFocusBorder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputFocusBorder] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inputFocusBorder(inputFocusBorder: JsonField<String>) = apply {
                        this.inputFocusBorder = inputFocusBorder
                    }

                    /** Text error color */
                    fun textError(textError: String?) = textError(JsonField.ofNullable(textError))

                    /**
                     * Sets [Builder.textError] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textError] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun textError(textError: JsonField<String>) = apply {
                        this.textError = textError
                    }

                    /** Text placeholder color */
                    fun textPlaceholder(textPlaceholder: String?) =
                        textPlaceholder(JsonField.ofNullable(textPlaceholder))

                    /**
                     * Sets [Builder.textPlaceholder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textPlaceholder] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun textPlaceholder(textPlaceholder: JsonField<String>) = apply {
                        this.textPlaceholder = textPlaceholder
                    }

                    /** Text primary color */
                    fun textPrimary(textPrimary: String?) =
                        textPrimary(JsonField.ofNullable(textPrimary))

                    /**
                     * Sets [Builder.textPrimary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textPrimary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun textPrimary(textPrimary: JsonField<String>) = apply {
                        this.textPrimary = textPrimary
                    }

                    /** Text secondary color */
                    fun textSecondary(textSecondary: String?) =
                        textSecondary(JsonField.ofNullable(textSecondary))

                    /**
                     * Sets [Builder.textSecondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textSecondary] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun textSecondary(textSecondary: JsonField<String>) = apply {
                        this.textSecondary = textSecondary
                    }

                    /** Text success color */
                    fun textSuccess(textSuccess: String?) =
                        textSuccess(JsonField.ofNullable(textSuccess))

                    /**
                     * Sets [Builder.textSuccess] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.textSuccess] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun textSuccess(textSuccess: JsonField<String>) = apply {
                        this.textSuccess = textSuccess
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
                     * Returns an immutable instance of [Light].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Light =
                        Light(
                            bgPrimary,
                            bgSecondary,
                            borderPrimary,
                            borderSecondary,
                            buttonPrimary,
                            buttonPrimaryHover,
                            buttonSecondary,
                            buttonSecondaryHover,
                            buttonTextPrimary,
                            buttonTextSecondary,
                            inputFocusBorder,
                            textError,
                            textPlaceholder,
                            textPrimary,
                            textSecondary,
                            textSuccess,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Light = apply {
                    if (validated) {
                        return@apply
                    }

                    bgPrimary()
                    bgSecondary()
                    borderPrimary()
                    borderSecondary()
                    buttonPrimary()
                    buttonPrimaryHover()
                    buttonSecondary()
                    buttonSecondaryHover()
                    buttonTextPrimary()
                    buttonTextSecondary()
                    inputFocusBorder()
                    textError()
                    textPlaceholder()
                    textPrimary()
                    textSecondary()
                    textSuccess()
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
                    (if (bgPrimary.asKnown() == null) 0 else 1) +
                        (if (bgSecondary.asKnown() == null) 0 else 1) +
                        (if (borderPrimary.asKnown() == null) 0 else 1) +
                        (if (borderSecondary.asKnown() == null) 0 else 1) +
                        (if (buttonPrimary.asKnown() == null) 0 else 1) +
                        (if (buttonPrimaryHover.asKnown() == null) 0 else 1) +
                        (if (buttonSecondary.asKnown() == null) 0 else 1) +
                        (if (buttonSecondaryHover.asKnown() == null) 0 else 1) +
                        (if (buttonTextPrimary.asKnown() == null) 0 else 1) +
                        (if (buttonTextSecondary.asKnown() == null) 0 else 1) +
                        (if (inputFocusBorder.asKnown() == null) 0 else 1) +
                        (if (textError.asKnown() == null) 0 else 1) +
                        (if (textPlaceholder.asKnown() == null) 0 else 1) +
                        (if (textPrimary.asKnown() == null) 0 else 1) +
                        (if (textSecondary.asKnown() == null) 0 else 1) +
                        (if (textSuccess.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Light &&
                        bgPrimary == other.bgPrimary &&
                        bgSecondary == other.bgSecondary &&
                        borderPrimary == other.borderPrimary &&
                        borderSecondary == other.borderSecondary &&
                        buttonPrimary == other.buttonPrimary &&
                        buttonPrimaryHover == other.buttonPrimaryHover &&
                        buttonSecondary == other.buttonSecondary &&
                        buttonSecondaryHover == other.buttonSecondaryHover &&
                        buttonTextPrimary == other.buttonTextPrimary &&
                        buttonTextSecondary == other.buttonTextSecondary &&
                        inputFocusBorder == other.inputFocusBorder &&
                        textError == other.textError &&
                        textPlaceholder == other.textPlaceholder &&
                        textPrimary == other.textPrimary &&
                        textSecondary == other.textSecondary &&
                        textSuccess == other.textSuccess &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bgPrimary,
                        bgSecondary,
                        borderPrimary,
                        borderSecondary,
                        buttonPrimary,
                        buttonPrimaryHover,
                        buttonSecondary,
                        buttonSecondaryHover,
                        buttonTextPrimary,
                        buttonTextSecondary,
                        inputFocusBorder,
                        textError,
                        textPlaceholder,
                        textPrimary,
                        textSecondary,
                        textSuccess,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Light{bgPrimary=$bgPrimary, bgSecondary=$bgSecondary, borderPrimary=$borderPrimary, borderSecondary=$borderSecondary, buttonPrimary=$buttonPrimary, buttonPrimaryHover=$buttonPrimaryHover, buttonSecondary=$buttonSecondary, buttonSecondaryHover=$buttonSecondaryHover, buttonTextPrimary=$buttonTextPrimary, buttonTextSecondary=$buttonTextSecondary, inputFocusBorder=$inputFocusBorder, textError=$textError, textPlaceholder=$textPlaceholder, textPrimary=$textPrimary, textSecondary=$textSecondary, textSuccess=$textSuccess, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ThemeConfig &&
                    dark == other.dark &&
                    fontSize == other.fontSize &&
                    fontWeight == other.fontWeight &&
                    light == other.light &&
                    payButtonText == other.payButtonText &&
                    radius == other.radius &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    dark,
                    fontSize,
                    fontWeight,
                    light,
                    payButtonText,
                    radius,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ThemeConfig{dark=$dark, fontSize=$fontSize, fontWeight=$fontWeight, light=$light, payButtonText=$payButtonText, radius=$radius, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Customization &&
                forceLanguage == other.forceLanguage &&
                showOnDemandTag == other.showOnDemandTag &&
                showOrderDetails == other.showOrderDetails &&
                theme == other.theme &&
                themeConfig == other.themeConfig &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                forceLanguage,
                showOnDemandTag,
                showOrderDetails,
                theme,
                themeConfig,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customization{forceLanguage=$forceLanguage, showOnDemandTag=$showOnDemandTag, showOrderDetails=$showOrderDetails, theme=$theme, themeConfig=$themeConfig, additionalProperties=$additionalProperties}"
    }

    class FeatureFlags
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowCurrencySelection: JsonField<Boolean>,
        private val allowCustomerEditingCity: JsonField<Boolean>,
        private val allowCustomerEditingCountry: JsonField<Boolean>,
        private val allowCustomerEditingEmail: JsonField<Boolean>,
        private val allowCustomerEditingName: JsonField<Boolean>,
        private val allowCustomerEditingState: JsonField<Boolean>,
        private val allowCustomerEditingStreet: JsonField<Boolean>,
        private val allowCustomerEditingZipcode: JsonField<Boolean>,
        private val allowDiscountCode: JsonField<Boolean>,
        private val allowPhoneNumberCollection: JsonField<Boolean>,
        private val allowTaxId: JsonField<Boolean>,
        private val alwaysCreateNewCustomer: JsonField<Boolean>,
        private val redirectImmediately: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allow_currency_selection")
            @ExcludeMissing
            allowCurrencySelection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_customer_editing_city")
            @ExcludeMissing
            allowCustomerEditingCity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_customer_editing_country")
            @ExcludeMissing
            allowCustomerEditingCountry: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_customer_editing_email")
            @ExcludeMissing
            allowCustomerEditingEmail: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_customer_editing_name")
            @ExcludeMissing
            allowCustomerEditingName: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_customer_editing_state")
            @ExcludeMissing
            allowCustomerEditingState: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_customer_editing_street")
            @ExcludeMissing
            allowCustomerEditingStreet: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_customer_editing_zipcode")
            @ExcludeMissing
            allowCustomerEditingZipcode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_discount_code")
            @ExcludeMissing
            allowDiscountCode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_phone_number_collection")
            @ExcludeMissing
            allowPhoneNumberCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_tax_id")
            @ExcludeMissing
            allowTaxId: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("always_create_new_customer")
            @ExcludeMissing
            alwaysCreateNewCustomer: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("redirect_immediately")
            @ExcludeMissing
            redirectImmediately: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            allowCurrencySelection,
            allowCustomerEditingCity,
            allowCustomerEditingCountry,
            allowCustomerEditingEmail,
            allowCustomerEditingName,
            allowCustomerEditingState,
            allowCustomerEditingStreet,
            allowCustomerEditingZipcode,
            allowDiscountCode,
            allowPhoneNumberCollection,
            allowTaxId,
            alwaysCreateNewCustomer,
            redirectImmediately,
            mutableMapOf(),
        )

        /**
         * if customer is allowed to change currency, set it to true
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCurrencySelection(): Boolean? =
            allowCurrencySelection.getNullable("allow_currency_selection")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCustomerEditingCity(): Boolean? =
            allowCustomerEditingCity.getNullable("allow_customer_editing_city")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCustomerEditingCountry(): Boolean? =
            allowCustomerEditingCountry.getNullable("allow_customer_editing_country")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCustomerEditingEmail(): Boolean? =
            allowCustomerEditingEmail.getNullable("allow_customer_editing_email")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCustomerEditingName(): Boolean? =
            allowCustomerEditingName.getNullable("allow_customer_editing_name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCustomerEditingState(): Boolean? =
            allowCustomerEditingState.getNullable("allow_customer_editing_state")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCustomerEditingStreet(): Boolean? =
            allowCustomerEditingStreet.getNullable("allow_customer_editing_street")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCustomerEditingZipcode(): Boolean? =
            allowCustomerEditingZipcode.getNullable("allow_customer_editing_zipcode")

        /**
         * If the customer is allowed to apply discount code, set it to true.
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowDiscountCode(): Boolean? = allowDiscountCode.getNullable("allow_discount_code")

        /**
         * If phone number is collected from customer, set it to rue
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowPhoneNumberCollection(): Boolean? =
            allowPhoneNumberCollection.getNullable("allow_phone_number_collection")

        /**
         * If the customer is allowed to add tax id, set it to true
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowTaxId(): Boolean? = allowTaxId.getNullable("allow_tax_id")

        /**
         * Set to true if a new customer object should be created. By default email is used to find
         * an existing customer to attach the session to
         *
         * Default is false
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun alwaysCreateNewCustomer(): Boolean? =
            alwaysCreateNewCustomer.getNullable("always_create_new_customer")

        /**
         * If true, redirects the customer immediately after payment completion
         *
         * Default is false
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun redirectImmediately(): Boolean? =
            redirectImmediately.getNullable("redirect_immediately")

        /**
         * Returns the raw JSON value of [allowCurrencySelection].
         *
         * Unlike [allowCurrencySelection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_currency_selection")
        @ExcludeMissing
        fun _allowCurrencySelection(): JsonField<Boolean> = allowCurrencySelection

        /**
         * Returns the raw JSON value of [allowCustomerEditingCity].
         *
         * Unlike [allowCustomerEditingCity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_customer_editing_city")
        @ExcludeMissing
        fun _allowCustomerEditingCity(): JsonField<Boolean> = allowCustomerEditingCity

        /**
         * Returns the raw JSON value of [allowCustomerEditingCountry].
         *
         * Unlike [allowCustomerEditingCountry], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_customer_editing_country")
        @ExcludeMissing
        fun _allowCustomerEditingCountry(): JsonField<Boolean> = allowCustomerEditingCountry

        /**
         * Returns the raw JSON value of [allowCustomerEditingEmail].
         *
         * Unlike [allowCustomerEditingEmail], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_customer_editing_email")
        @ExcludeMissing
        fun _allowCustomerEditingEmail(): JsonField<Boolean> = allowCustomerEditingEmail

        /**
         * Returns the raw JSON value of [allowCustomerEditingName].
         *
         * Unlike [allowCustomerEditingName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_customer_editing_name")
        @ExcludeMissing
        fun _allowCustomerEditingName(): JsonField<Boolean> = allowCustomerEditingName

        /**
         * Returns the raw JSON value of [allowCustomerEditingState].
         *
         * Unlike [allowCustomerEditingState], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_customer_editing_state")
        @ExcludeMissing
        fun _allowCustomerEditingState(): JsonField<Boolean> = allowCustomerEditingState

        /**
         * Returns the raw JSON value of [allowCustomerEditingStreet].
         *
         * Unlike [allowCustomerEditingStreet], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_customer_editing_street")
        @ExcludeMissing
        fun _allowCustomerEditingStreet(): JsonField<Boolean> = allowCustomerEditingStreet

        /**
         * Returns the raw JSON value of [allowCustomerEditingZipcode].
         *
         * Unlike [allowCustomerEditingZipcode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_customer_editing_zipcode")
        @ExcludeMissing
        fun _allowCustomerEditingZipcode(): JsonField<Boolean> = allowCustomerEditingZipcode

        /**
         * Returns the raw JSON value of [allowDiscountCode].
         *
         * Unlike [allowDiscountCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allow_discount_code")
        @ExcludeMissing
        fun _allowDiscountCode(): JsonField<Boolean> = allowDiscountCode

        /**
         * Returns the raw JSON value of [allowPhoneNumberCollection].
         *
         * Unlike [allowPhoneNumberCollection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_phone_number_collection")
        @ExcludeMissing
        fun _allowPhoneNumberCollection(): JsonField<Boolean> = allowPhoneNumberCollection

        /**
         * Returns the raw JSON value of [allowTaxId].
         *
         * Unlike [allowTaxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allow_tax_id")
        @ExcludeMissing
        fun _allowTaxId(): JsonField<Boolean> = allowTaxId

        /**
         * Returns the raw JSON value of [alwaysCreateNewCustomer].
         *
         * Unlike [alwaysCreateNewCustomer], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("always_create_new_customer")
        @ExcludeMissing
        fun _alwaysCreateNewCustomer(): JsonField<Boolean> = alwaysCreateNewCustomer

        /**
         * Returns the raw JSON value of [redirectImmediately].
         *
         * Unlike [redirectImmediately], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("redirect_immediately")
        @ExcludeMissing
        fun _redirectImmediately(): JsonField<Boolean> = redirectImmediately

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

            /** Returns a mutable builder for constructing an instance of [FeatureFlags]. */
            fun builder() = Builder()
        }

        /** A builder for [FeatureFlags]. */
        class Builder internal constructor() {

            private var allowCurrencySelection: JsonField<Boolean> = JsonMissing.of()
            private var allowCustomerEditingCity: JsonField<Boolean> = JsonMissing.of()
            private var allowCustomerEditingCountry: JsonField<Boolean> = JsonMissing.of()
            private var allowCustomerEditingEmail: JsonField<Boolean> = JsonMissing.of()
            private var allowCustomerEditingName: JsonField<Boolean> = JsonMissing.of()
            private var allowCustomerEditingState: JsonField<Boolean> = JsonMissing.of()
            private var allowCustomerEditingStreet: JsonField<Boolean> = JsonMissing.of()
            private var allowCustomerEditingZipcode: JsonField<Boolean> = JsonMissing.of()
            private var allowDiscountCode: JsonField<Boolean> = JsonMissing.of()
            private var allowPhoneNumberCollection: JsonField<Boolean> = JsonMissing.of()
            private var allowTaxId: JsonField<Boolean> = JsonMissing.of()
            private var alwaysCreateNewCustomer: JsonField<Boolean> = JsonMissing.of()
            private var redirectImmediately: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(featureFlags: FeatureFlags) = apply {
                allowCurrencySelection = featureFlags.allowCurrencySelection
                allowCustomerEditingCity = featureFlags.allowCustomerEditingCity
                allowCustomerEditingCountry = featureFlags.allowCustomerEditingCountry
                allowCustomerEditingEmail = featureFlags.allowCustomerEditingEmail
                allowCustomerEditingName = featureFlags.allowCustomerEditingName
                allowCustomerEditingState = featureFlags.allowCustomerEditingState
                allowCustomerEditingStreet = featureFlags.allowCustomerEditingStreet
                allowCustomerEditingZipcode = featureFlags.allowCustomerEditingZipcode
                allowDiscountCode = featureFlags.allowDiscountCode
                allowPhoneNumberCollection = featureFlags.allowPhoneNumberCollection
                allowTaxId = featureFlags.allowTaxId
                alwaysCreateNewCustomer = featureFlags.alwaysCreateNewCustomer
                redirectImmediately = featureFlags.redirectImmediately
                additionalProperties = featureFlags.additionalProperties.toMutableMap()
            }

            /**
             * if customer is allowed to change currency, set it to true
             *
             * Default is true
             */
            fun allowCurrencySelection(allowCurrencySelection: Boolean) =
                allowCurrencySelection(JsonField.of(allowCurrencySelection))

            /**
             * Sets [Builder.allowCurrencySelection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCurrencySelection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowCurrencySelection(allowCurrencySelection: JsonField<Boolean>) = apply {
                this.allowCurrencySelection = allowCurrencySelection
            }

            fun allowCustomerEditingCity(allowCustomerEditingCity: Boolean) =
                allowCustomerEditingCity(JsonField.of(allowCustomerEditingCity))

            /**
             * Sets [Builder.allowCustomerEditingCity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCustomerEditingCity] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowCustomerEditingCity(allowCustomerEditingCity: JsonField<Boolean>) = apply {
                this.allowCustomerEditingCity = allowCustomerEditingCity
            }

            fun allowCustomerEditingCountry(allowCustomerEditingCountry: Boolean) =
                allowCustomerEditingCountry(JsonField.of(allowCustomerEditingCountry))

            /**
             * Sets [Builder.allowCustomerEditingCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCustomerEditingCountry] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowCustomerEditingCountry(allowCustomerEditingCountry: JsonField<Boolean>) =
                apply {
                    this.allowCustomerEditingCountry = allowCustomerEditingCountry
                }

            fun allowCustomerEditingEmail(allowCustomerEditingEmail: Boolean) =
                allowCustomerEditingEmail(JsonField.of(allowCustomerEditingEmail))

            /**
             * Sets [Builder.allowCustomerEditingEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCustomerEditingEmail] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowCustomerEditingEmail(allowCustomerEditingEmail: JsonField<Boolean>) = apply {
                this.allowCustomerEditingEmail = allowCustomerEditingEmail
            }

            fun allowCustomerEditingName(allowCustomerEditingName: Boolean) =
                allowCustomerEditingName(JsonField.of(allowCustomerEditingName))

            /**
             * Sets [Builder.allowCustomerEditingName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCustomerEditingName] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowCustomerEditingName(allowCustomerEditingName: JsonField<Boolean>) = apply {
                this.allowCustomerEditingName = allowCustomerEditingName
            }

            fun allowCustomerEditingState(allowCustomerEditingState: Boolean) =
                allowCustomerEditingState(JsonField.of(allowCustomerEditingState))

            /**
             * Sets [Builder.allowCustomerEditingState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCustomerEditingState] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowCustomerEditingState(allowCustomerEditingState: JsonField<Boolean>) = apply {
                this.allowCustomerEditingState = allowCustomerEditingState
            }

            fun allowCustomerEditingStreet(allowCustomerEditingStreet: Boolean) =
                allowCustomerEditingStreet(JsonField.of(allowCustomerEditingStreet))

            /**
             * Sets [Builder.allowCustomerEditingStreet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCustomerEditingStreet] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowCustomerEditingStreet(allowCustomerEditingStreet: JsonField<Boolean>) = apply {
                this.allowCustomerEditingStreet = allowCustomerEditingStreet
            }

            fun allowCustomerEditingZipcode(allowCustomerEditingZipcode: Boolean) =
                allowCustomerEditingZipcode(JsonField.of(allowCustomerEditingZipcode))

            /**
             * Sets [Builder.allowCustomerEditingZipcode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCustomerEditingZipcode] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowCustomerEditingZipcode(allowCustomerEditingZipcode: JsonField<Boolean>) =
                apply {
                    this.allowCustomerEditingZipcode = allowCustomerEditingZipcode
                }

            /**
             * If the customer is allowed to apply discount code, set it to true.
             *
             * Default is true
             */
            fun allowDiscountCode(allowDiscountCode: Boolean) =
                allowDiscountCode(JsonField.of(allowDiscountCode))

            /**
             * Sets [Builder.allowDiscountCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowDiscountCode] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowDiscountCode(allowDiscountCode: JsonField<Boolean>) = apply {
                this.allowDiscountCode = allowDiscountCode
            }

            /**
             * If phone number is collected from customer, set it to rue
             *
             * Default is true
             */
            fun allowPhoneNumberCollection(allowPhoneNumberCollection: Boolean) =
                allowPhoneNumberCollection(JsonField.of(allowPhoneNumberCollection))

            /**
             * Sets [Builder.allowPhoneNumberCollection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowPhoneNumberCollection] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowPhoneNumberCollection(allowPhoneNumberCollection: JsonField<Boolean>) = apply {
                this.allowPhoneNumberCollection = allowPhoneNumberCollection
            }

            /**
             * If the customer is allowed to add tax id, set it to true
             *
             * Default is true
             */
            fun allowTaxId(allowTaxId: Boolean) = allowTaxId(JsonField.of(allowTaxId))

            /**
             * Sets [Builder.allowTaxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowTaxId] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowTaxId(allowTaxId: JsonField<Boolean>) = apply { this.allowTaxId = allowTaxId }

            /**
             * Set to true if a new customer object should be created. By default email is used to
             * find an existing customer to attach the session to
             *
             * Default is false
             */
            fun alwaysCreateNewCustomer(alwaysCreateNewCustomer: Boolean) =
                alwaysCreateNewCustomer(JsonField.of(alwaysCreateNewCustomer))

            /**
             * Sets [Builder.alwaysCreateNewCustomer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alwaysCreateNewCustomer] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun alwaysCreateNewCustomer(alwaysCreateNewCustomer: JsonField<Boolean>) = apply {
                this.alwaysCreateNewCustomer = alwaysCreateNewCustomer
            }

            /**
             * If true, redirects the customer immediately after payment completion
             *
             * Default is false
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
             * Returns an immutable instance of [FeatureFlags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FeatureFlags =
                FeatureFlags(
                    allowCurrencySelection,
                    allowCustomerEditingCity,
                    allowCustomerEditingCountry,
                    allowCustomerEditingEmail,
                    allowCustomerEditingName,
                    allowCustomerEditingState,
                    allowCustomerEditingStreet,
                    allowCustomerEditingZipcode,
                    allowDiscountCode,
                    allowPhoneNumberCollection,
                    allowTaxId,
                    alwaysCreateNewCustomer,
                    redirectImmediately,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FeatureFlags = apply {
            if (validated) {
                return@apply
            }

            allowCurrencySelection()
            allowCustomerEditingCity()
            allowCustomerEditingCountry()
            allowCustomerEditingEmail()
            allowCustomerEditingName()
            allowCustomerEditingState()
            allowCustomerEditingStreet()
            allowCustomerEditingZipcode()
            allowDiscountCode()
            allowPhoneNumberCollection()
            allowTaxId()
            alwaysCreateNewCustomer()
            redirectImmediately()
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
            (if (allowCurrencySelection.asKnown() == null) 0 else 1) +
                (if (allowCustomerEditingCity.asKnown() == null) 0 else 1) +
                (if (allowCustomerEditingCountry.asKnown() == null) 0 else 1) +
                (if (allowCustomerEditingEmail.asKnown() == null) 0 else 1) +
                (if (allowCustomerEditingName.asKnown() == null) 0 else 1) +
                (if (allowCustomerEditingState.asKnown() == null) 0 else 1) +
                (if (allowCustomerEditingStreet.asKnown() == null) 0 else 1) +
                (if (allowCustomerEditingZipcode.asKnown() == null) 0 else 1) +
                (if (allowDiscountCode.asKnown() == null) 0 else 1) +
                (if (allowPhoneNumberCollection.asKnown() == null) 0 else 1) +
                (if (allowTaxId.asKnown() == null) 0 else 1) +
                (if (alwaysCreateNewCustomer.asKnown() == null) 0 else 1) +
                (if (redirectImmediately.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeatureFlags &&
                allowCurrencySelection == other.allowCurrencySelection &&
                allowCustomerEditingCity == other.allowCustomerEditingCity &&
                allowCustomerEditingCountry == other.allowCustomerEditingCountry &&
                allowCustomerEditingEmail == other.allowCustomerEditingEmail &&
                allowCustomerEditingName == other.allowCustomerEditingName &&
                allowCustomerEditingState == other.allowCustomerEditingState &&
                allowCustomerEditingStreet == other.allowCustomerEditingStreet &&
                allowCustomerEditingZipcode == other.allowCustomerEditingZipcode &&
                allowDiscountCode == other.allowDiscountCode &&
                allowPhoneNumberCollection == other.allowPhoneNumberCollection &&
                allowTaxId == other.allowTaxId &&
                alwaysCreateNewCustomer == other.alwaysCreateNewCustomer &&
                redirectImmediately == other.redirectImmediately &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowCurrencySelection,
                allowCustomerEditingCity,
                allowCustomerEditingCountry,
                allowCustomerEditingEmail,
                allowCustomerEditingName,
                allowCustomerEditingState,
                allowCustomerEditingStreet,
                allowCustomerEditingZipcode,
                allowDiscountCode,
                allowPhoneNumberCollection,
                allowTaxId,
                alwaysCreateNewCustomer,
                redirectImmediately,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FeatureFlags{allowCurrencySelection=$allowCurrencySelection, allowCustomerEditingCity=$allowCustomerEditingCity, allowCustomerEditingCountry=$allowCustomerEditingCountry, allowCustomerEditingEmail=$allowCustomerEditingEmail, allowCustomerEditingName=$allowCustomerEditingName, allowCustomerEditingState=$allowCustomerEditingState, allowCustomerEditingStreet=$allowCustomerEditingStreet, allowCustomerEditingZipcode=$allowCustomerEditingZipcode, allowDiscountCode=$allowDiscountCode, allowPhoneNumberCollection=$allowPhoneNumberCollection, allowTaxId=$allowTaxId, alwaysCreateNewCustomer=$alwaysCreateNewCustomer, redirectImmediately=$redirectImmediately, additionalProperties=$additionalProperties}"
    }

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

    class SubscriptionData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val onDemand: JsonField<OnDemandSubscription>,
        private val trialPeriodDays: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("on_demand")
            @ExcludeMissing
            onDemand: JsonField<OnDemandSubscription> = JsonMissing.of(),
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            trialPeriodDays: JsonField<Int> = JsonMissing.of(),
        ) : this(onDemand, trialPeriodDays, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun onDemand(): OnDemandSubscription? = onDemand.getNullable("on_demand")

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialPeriodDays(): Int? = trialPeriodDays.getNullable("trial_period_days")

        /**
         * Returns the raw JSON value of [onDemand].
         *
         * Unlike [onDemand], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_demand")
        @ExcludeMissing
        fun _onDemand(): JsonField<OnDemandSubscription> = onDemand

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

            /** Returns a mutable builder for constructing an instance of [SubscriptionData]. */
            fun builder() = Builder()
        }

        /** A builder for [SubscriptionData]. */
        class Builder internal constructor() {

            private var onDemand: JsonField<OnDemandSubscription> = JsonMissing.of()
            private var trialPeriodDays: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscriptionData: SubscriptionData) = apply {
                onDemand = subscriptionData.onDemand
                trialPeriodDays = subscriptionData.trialPeriodDays
                additionalProperties = subscriptionData.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [SubscriptionData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SubscriptionData =
                SubscriptionData(onDemand, trialPeriodDays, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SubscriptionData = apply {
            if (validated) {
                return@apply
            }

            onDemand()?.validate()
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
            (onDemand.asKnown()?.validity() ?: 0) +
                (if (trialPeriodDays.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubscriptionData &&
                onDemand == other.onDemand &&
                trialPeriodDays == other.trialPeriodDays &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(onDemand, trialPeriodDays, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionData{onDemand=$onDemand, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
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
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            productCart,
            allowedPaymentMethodTypes,
            billingAddress,
            billingCurrency,
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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckoutSessionRequest{productCart=$productCart, allowedPaymentMethodTypes=$allowedPaymentMethodTypes, billingAddress=$billingAddress, billingCurrency=$billingCurrency, confirm=$confirm, customFields=$customFields, customer=$customer, customization=$customization, discountCode=$discountCode, featureFlags=$featureFlags, force3ds=$force3ds, metadata=$metadata, minimalAddress=$minimalAddress, paymentMethodId=$paymentMethodId, productCollectionId=$productCollectionId, returnUrl=$returnUrl, shortLink=$shortLink, showSavedPaymentMethods=$showSavedPaymentMethods, subscriptionData=$subscriptionData, additionalProperties=$additionalProperties}"
}
