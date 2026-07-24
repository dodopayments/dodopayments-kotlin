// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SubscriptionCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addons: JsonField<List<AddonCartResponseItem>>,
    private val customer: JsonField<CustomerLimitedDetails>,
    private val metadata: JsonField<Metadata>,
    private val paymentId: JsonField<String>,
    private val recurringPreTaxAmount: JsonField<Int>,
    private val subscriptionId: JsonField<String>,
    private val clientSecret: JsonField<String>,
    private val discountId: JsonField<String>,
    private val discountIds: JsonField<List<String>>,
    private val expiresOn: JsonField<OffsetDateTime>,
    private val oneTimeProductCart: JsonField<List<OneTimeProductCart>>,
    private val paymentLink: JsonField<String>,
    private val trialAmount: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("addons")
        @ExcludeMissing
        addons: JsonField<List<AddonCartResponseItem>> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recurring_pre_tax_amount")
        @ExcludeMissing
        recurringPreTaxAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client_secret")
        @ExcludeMissing
        clientSecret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_ids")
        @ExcludeMissing
        discountIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("expires_on")
        @ExcludeMissing
        expiresOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("one_time_product_cart")
        @ExcludeMissing
        oneTimeProductCart: JsonField<List<OneTimeProductCart>> = JsonMissing.of(),
        @JsonProperty("payment_link")
        @ExcludeMissing
        paymentLink: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trial_amount") @ExcludeMissing trialAmount: JsonField<Int> = JsonMissing.of(),
    ) : this(
        addons,
        customer,
        metadata,
        paymentId,
        recurringPreTaxAmount,
        subscriptionId,
        clientSecret,
        discountId,
        discountIds,
        expiresOn,
        oneTimeProductCart,
        paymentLink,
        trialAmount,
        mutableMapOf(),
    )

    /**
     * Addons associated with this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addons(): List<AddonCartResponseItem> = addons.getRequired("addons")

    /**
     * Customer details associated with this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    /**
     * Additional metadata associated with the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * First payment id for the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * Tax will be added to the amount and charged to the customer on each billing cycle
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recurringPreTaxAmount(): Int = recurringPreTaxAmount.getRequired("recurring_pre_tax_amount")

    /**
     * Unique identifier for the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /**
     * Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun clientSecret(): String? = clientSecret.getNullable("client_secret")

    /**
     * DEPRECATED: Use discount_ids instead. Returns the first discount's ID if present.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("Use `discounts` instead.")
    fun discountId(): String? = discountId.getNullable("discount_id")

    /**
     * All stacked discount IDs applied, in order of application
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountIds(): List<String>? = discountIds.getNullable("discount_ids")

    /**
     * Expiry timestamp of the payment link
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresOn(): OffsetDateTime? = expiresOn.getNullable("expires_on")

    /**
     * One time products associated with the purchase of subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun oneTimeProductCart(): List<OneTimeProductCart>? =
        oneTimeProductCart.getNullable("one_time_product_cart")

    /**
     * URL to checkout page
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentLink(): String? = paymentLink.getNullable("payment_link")

    /**
     * Per-unit trial amount after discounts, in the price currency's minor units (pre-quantity,
     * pre-tax). Null for a free trial or no trial.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trialAmount(): Int? = trialAmount.getNullable("trial_amount")

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addons")
    @ExcludeMissing
    fun _addons(): JsonField<List<AddonCartResponseItem>> = addons

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
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [recurringPreTaxAmount].
     *
     * Unlike [recurringPreTaxAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recurring_pre_tax_amount")
    @ExcludeMissing
    fun _recurringPreTaxAmount(): JsonField<Int> = recurringPreTaxAmount

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_secret")
    @ExcludeMissing
    fun _clientSecret(): JsonField<String> = clientSecret

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
     * Returns the raw JSON value of [discountIds].
     *
     * Unlike [discountIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_ids")
    @ExcludeMissing
    fun _discountIds(): JsonField<List<String>> = discountIds

    /**
     * Returns the raw JSON value of [expiresOn].
     *
     * Unlike [expiresOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_on")
    @ExcludeMissing
    fun _expiresOn(): JsonField<OffsetDateTime> = expiresOn

    /**
     * Returns the raw JSON value of [oneTimeProductCart].
     *
     * Unlike [oneTimeProductCart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("one_time_product_cart")
    @ExcludeMissing
    fun _oneTimeProductCart(): JsonField<List<OneTimeProductCart>> = oneTimeProductCart

    /**
     * Returns the raw JSON value of [paymentLink].
     *
     * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_link")
    @ExcludeMissing
    fun _paymentLink(): JsonField<String> = paymentLink

    /**
     * Returns the raw JSON value of [trialAmount].
     *
     * Unlike [trialAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_amount") @ExcludeMissing fun _trialAmount(): JsonField<Int> = trialAmount

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
         * Returns a mutable builder for constructing an instance of [SubscriptionCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .addons()
         * .customer()
         * .metadata()
         * .paymentId()
         * .recurringPreTaxAmount()
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateResponse]. */
    class Builder internal constructor() {

        private var addons: JsonField<MutableList<AddonCartResponseItem>>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var recurringPreTaxAmount: JsonField<Int>? = null
        private var subscriptionId: JsonField<String>? = null
        private var clientSecret: JsonField<String> = JsonMissing.of()
        private var discountId: JsonField<String> = JsonMissing.of()
        private var discountIds: JsonField<MutableList<String>>? = null
        private var expiresOn: JsonField<OffsetDateTime> = JsonMissing.of()
        private var oneTimeProductCart: JsonField<MutableList<OneTimeProductCart>>? = null
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var trialAmount: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionCreateResponse: SubscriptionCreateResponse) = apply {
            addons = subscriptionCreateResponse.addons.map { it.toMutableList() }
            customer = subscriptionCreateResponse.customer
            metadata = subscriptionCreateResponse.metadata
            paymentId = subscriptionCreateResponse.paymentId
            recurringPreTaxAmount = subscriptionCreateResponse.recurringPreTaxAmount
            subscriptionId = subscriptionCreateResponse.subscriptionId
            clientSecret = subscriptionCreateResponse.clientSecret
            discountId = subscriptionCreateResponse.discountId
            discountIds = subscriptionCreateResponse.discountIds.map { it.toMutableList() }
            expiresOn = subscriptionCreateResponse.expiresOn
            oneTimeProductCart =
                subscriptionCreateResponse.oneTimeProductCart.map { it.toMutableList() }
            paymentLink = subscriptionCreateResponse.paymentLink
            trialAmount = subscriptionCreateResponse.trialAmount
            additionalProperties = subscriptionCreateResponse.additionalProperties.toMutableMap()
        }

        /** Addons associated with this subscription */
        fun addons(addons: List<AddonCartResponseItem>) = addons(JsonField.of(addons))

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<AddonCartResponseItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        /** Customer details associated with this subscription */
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

        /** Additional metadata associated with the subscription */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** First payment id for the subscription */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** Tax will be added to the amount and charged to the customer on each billing cycle */
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

        /** Unique identifier for the subscription */
        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

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

        /**
         * Client secret used to load Dodo checkout SDK NOTE : Dodo checkout SDK will be coming soon
         */
        fun clientSecret(clientSecret: String?) = clientSecret(JsonField.ofNullable(clientSecret))

        /**
         * Sets [Builder.clientSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            this.clientSecret = clientSecret
        }

        /** DEPRECATED: Use discount_ids instead. Returns the first discount's ID if present. */
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

        /** All stacked discount IDs applied, in order of application */
        fun discountIds(discountIds: List<String>?) = discountIds(JsonField.ofNullable(discountIds))

        /**
         * Sets [Builder.discountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountIds(discountIds: JsonField<List<String>>) = apply {
            this.discountIds = discountIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [discountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscountId(discountId: String) = apply {
            discountIds =
                (discountIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discountIds", it).add(discountId)
                }
        }

        /** Expiry timestamp of the payment link */
        fun expiresOn(expiresOn: OffsetDateTime?) = expiresOn(JsonField.ofNullable(expiresOn))

        /**
         * Sets [Builder.expiresOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresOn(expiresOn: JsonField<OffsetDateTime>) = apply { this.expiresOn = expiresOn }

        /** One time products associated with the purchase of subscription */
        fun oneTimeProductCart(oneTimeProductCart: List<OneTimeProductCart>?) =
            oneTimeProductCart(JsonField.ofNullable(oneTimeProductCart))

        /**
         * Sets [Builder.oneTimeProductCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oneTimeProductCart] with a well-typed
         * `List<OneTimeProductCart>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun oneTimeProductCart(oneTimeProductCart: JsonField<List<OneTimeProductCart>>) = apply {
            this.oneTimeProductCart = oneTimeProductCart.map { it.toMutableList() }
        }

        /**
         * Adds a single [OneTimeProductCart] to [Builder.oneTimeProductCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOneTimeProductCart(oneTimeProductCart: OneTimeProductCart) = apply {
            this.oneTimeProductCart =
                (this.oneTimeProductCart ?: JsonField.of(mutableListOf())).also {
                    checkKnown("oneTimeProductCart", it).add(oneTimeProductCart)
                }
        }

        /** URL to checkout page */
        fun paymentLink(paymentLink: String?) = paymentLink(JsonField.ofNullable(paymentLink))

        /**
         * Sets [Builder.paymentLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentLink] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentLink(paymentLink: JsonField<String>) = apply { this.paymentLink = paymentLink }

        /**
         * Per-unit trial amount after discounts, in the price currency's minor units (pre-quantity,
         * pre-tax). Null for a free trial or no trial.
         */
        fun trialAmount(trialAmount: Int?) = trialAmount(JsonField.ofNullable(trialAmount))

        /**
         * Alias for [Builder.trialAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialAmount(trialAmount: Int) = trialAmount(trialAmount as Int?)

        /**
         * Sets [Builder.trialAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialAmount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trialAmount(trialAmount: JsonField<Int>) = apply { this.trialAmount = trialAmount }

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
         * Returns an immutable instance of [SubscriptionCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .addons()
         * .customer()
         * .metadata()
         * .paymentId()
         * .recurringPreTaxAmount()
         * .subscriptionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionCreateResponse =
            SubscriptionCreateResponse(
                checkRequired("addons", addons).map { it.toImmutable() },
                checkRequired("customer", customer),
                checkRequired("metadata", metadata),
                checkRequired("paymentId", paymentId),
                checkRequired("recurringPreTaxAmount", recurringPreTaxAmount),
                checkRequired("subscriptionId", subscriptionId),
                clientSecret,
                discountId,
                (discountIds ?: JsonMissing.of()).map { it.toImmutable() },
                expiresOn,
                (oneTimeProductCart ?: JsonMissing.of()).map { it.toImmutable() },
                paymentLink,
                trialAmount,
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
    fun validate(): SubscriptionCreateResponse = apply {
        if (validated) {
            return@apply
        }

        addons().forEach { it.validate() }
        customer().validate()
        metadata().validate()
        paymentId()
        recurringPreTaxAmount()
        subscriptionId()
        clientSecret()
        discountId()
        discountIds()
        expiresOn()
        oneTimeProductCart()?.forEach { it.validate() }
        paymentLink()
        trialAmount()
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
        (addons.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (customer.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (paymentId.asKnown() == null) 0 else 1) +
            (if (recurringPreTaxAmount.asKnown() == null) 0 else 1) +
            (if (subscriptionId.asKnown() == null) 0 else 1) +
            (if (clientSecret.asKnown() == null) 0 else 1) +
            (if (discountId.asKnown() == null) 0 else 1) +
            (discountIds.asKnown()?.size ?: 0) +
            (if (expiresOn.asKnown() == null) 0 else 1) +
            (oneTimeProductCart.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (paymentLink.asKnown() == null) 0 else 1) +
            (if (trialAmount.asKnown() == null) 0 else 1)

    class OneTimeProductCart
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
             * Returns a mutable builder for constructing an instance of [OneTimeProductCart].
             *
             * The following fields are required:
             * ```kotlin
             * .productId()
             * .quantity()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [OneTimeProductCart]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Int>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(oneTimeProductCart: OneTimeProductCart) = apply {
                productId = oneTimeProductCart.productId
                quantity = oneTimeProductCart.quantity
                additionalProperties = oneTimeProductCart.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OneTimeProductCart].
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
            fun build(): OneTimeProductCart =
                OneTimeProductCart(
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
        fun validate(): OneTimeProductCart = apply {
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

            return other is OneTimeProductCart &&
                productId == other.productId &&
                quantity == other.quantity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(productId, quantity, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OneTimeProductCart{productId=$productId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCreateResponse &&
            addons == other.addons &&
            customer == other.customer &&
            metadata == other.metadata &&
            paymentId == other.paymentId &&
            recurringPreTaxAmount == other.recurringPreTaxAmount &&
            subscriptionId == other.subscriptionId &&
            clientSecret == other.clientSecret &&
            discountId == other.discountId &&
            discountIds == other.discountIds &&
            expiresOn == other.expiresOn &&
            oneTimeProductCart == other.oneTimeProductCart &&
            paymentLink == other.paymentLink &&
            trialAmount == other.trialAmount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            addons,
            customer,
            metadata,
            paymentId,
            recurringPreTaxAmount,
            subscriptionId,
            clientSecret,
            discountId,
            discountIds,
            expiresOn,
            oneTimeProductCart,
            paymentLink,
            trialAmount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionCreateResponse{addons=$addons, customer=$customer, metadata=$metadata, paymentId=$paymentId, recurringPreTaxAmount=$recurringPreTaxAmount, subscriptionId=$subscriptionId, clientSecret=$clientSecret, discountId=$discountId, discountIds=$discountIds, expiresOn=$expiresOn, oneTimeProductCart=$oneTimeProductCart, paymentLink=$paymentLink, trialAmount=$trialAmount, additionalProperties=$additionalProperties}"
}
