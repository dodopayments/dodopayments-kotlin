// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class OnDemandSubscription
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mandateOnly: JsonField<Boolean>,
    private val adaptiveCurrencyFeesInclusive: JsonField<Boolean>,
    private val productCurrency: JsonField<Currency>,
    private val productDescription: JsonField<String>,
    private val productPrice: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mandate_only")
        @ExcludeMissing
        mandateOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("adaptive_currency_fees_inclusive")
        @ExcludeMissing
        adaptiveCurrencyFeesInclusive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("product_currency")
        @ExcludeMissing
        productCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("product_description")
        @ExcludeMissing
        productDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_price")
        @ExcludeMissing
        productPrice: JsonField<Int> = JsonMissing.of(),
    ) : this(
        mandateOnly,
        adaptiveCurrencyFeesInclusive,
        productCurrency,
        productDescription,
        productPrice,
        mutableMapOf(),
    )

    /**
     * If set as True, does not perform any charge and only authorizes payment method details for
     * future use.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mandateOnly(): Boolean = mandateOnly.getRequired("mandate_only")

    /**
     * Whether adaptive currency fees should be included in the product_price (true) or added on top
     * (false). This field is ignored if adaptive pricing is not enabled for the business.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun adaptiveCurrencyFeesInclusive(): Boolean? =
        adaptiveCurrencyFeesInclusive.getNullable("adaptive_currency_fees_inclusive")

    /**
     * Optional currency of the product price. If not specified, defaults to the currency of the
     * product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productCurrency(): Currency? = productCurrency.getNullable("product_currency")

    /**
     * Optional product description override for billing and line items. If not specified, the
     * stored description of the product will be used.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productDescription(): String? = productDescription.getNullable("product_description")

    /**
     * Product price for the initial charge to customer If not specified the stored price of the
     * product will be used Represented in the lowest denomination of the currency (e.g., cents for
     * USD). For example, to charge $1.00, pass `100`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productPrice(): Int? = productPrice.getNullable("product_price")

    /**
     * Returns the raw JSON value of [mandateOnly].
     *
     * Unlike [mandateOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mandate_only")
    @ExcludeMissing
    fun _mandateOnly(): JsonField<Boolean> = mandateOnly

    /**
     * Returns the raw JSON value of [adaptiveCurrencyFeesInclusive].
     *
     * Unlike [adaptiveCurrencyFeesInclusive], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("adaptive_currency_fees_inclusive")
    @ExcludeMissing
    fun _adaptiveCurrencyFeesInclusive(): JsonField<Boolean> = adaptiveCurrencyFeesInclusive

    /**
     * Returns the raw JSON value of [productCurrency].
     *
     * Unlike [productCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_currency")
    @ExcludeMissing
    fun _productCurrency(): JsonField<Currency> = productCurrency

    /**
     * Returns the raw JSON value of [productDescription].
     *
     * Unlike [productDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("product_description")
    @ExcludeMissing
    fun _productDescription(): JsonField<String> = productDescription

    /**
     * Returns the raw JSON value of [productPrice].
     *
     * Unlike [productPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_price")
    @ExcludeMissing
    fun _productPrice(): JsonField<Int> = productPrice

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
         * Returns a mutable builder for constructing an instance of [OnDemandSubscription].
         *
         * The following fields are required:
         * ```kotlin
         * .mandateOnly()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OnDemandSubscription]. */
    class Builder internal constructor() {

        private var mandateOnly: JsonField<Boolean>? = null
        private var adaptiveCurrencyFeesInclusive: JsonField<Boolean> = JsonMissing.of()
        private var productCurrency: JsonField<Currency> = JsonMissing.of()
        private var productDescription: JsonField<String> = JsonMissing.of()
        private var productPrice: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(onDemandSubscription: OnDemandSubscription) = apply {
            mandateOnly = onDemandSubscription.mandateOnly
            adaptiveCurrencyFeesInclusive = onDemandSubscription.adaptiveCurrencyFeesInclusive
            productCurrency = onDemandSubscription.productCurrency
            productDescription = onDemandSubscription.productDescription
            productPrice = onDemandSubscription.productPrice
            additionalProperties = onDemandSubscription.additionalProperties.toMutableMap()
        }

        /**
         * If set as True, does not perform any charge and only authorizes payment method details
         * for future use.
         */
        fun mandateOnly(mandateOnly: Boolean) = mandateOnly(JsonField.of(mandateOnly))

        /**
         * Sets [Builder.mandateOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mandateOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mandateOnly(mandateOnly: JsonField<Boolean>) = apply { this.mandateOnly = mandateOnly }

        /**
         * Whether adaptive currency fees should be included in the product_price (true) or added on
         * top (false). This field is ignored if adaptive pricing is not enabled for the business.
         */
        fun adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive: Boolean?) =
            adaptiveCurrencyFeesInclusive(JsonField.ofNullable(adaptiveCurrencyFeesInclusive))

        /**
         * Alias for [Builder.adaptiveCurrencyFeesInclusive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive: Boolean) =
            adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive as Boolean?)

        /**
         * Sets [Builder.adaptiveCurrencyFeesInclusive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adaptiveCurrencyFeesInclusive] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive: JsonField<Boolean>) =
            apply {
                this.adaptiveCurrencyFeesInclusive = adaptiveCurrencyFeesInclusive
            }

        /**
         * Optional currency of the product price. If not specified, defaults to the currency of the
         * product.
         */
        fun productCurrency(productCurrency: Currency?) =
            productCurrency(JsonField.ofNullable(productCurrency))

        /**
         * Sets [Builder.productCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productCurrency(productCurrency: JsonField<Currency>) = apply {
            this.productCurrency = productCurrency
        }

        /**
         * Optional product description override for billing and line items. If not specified, the
         * stored description of the product will be used.
         */
        fun productDescription(productDescription: String?) =
            productDescription(JsonField.ofNullable(productDescription))

        /**
         * Sets [Builder.productDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productDescription(productDescription: JsonField<String>) = apply {
            this.productDescription = productDescription
        }

        /**
         * Product price for the initial charge to customer If not specified the stored price of the
         * product will be used Represented in the lowest denomination of the currency (e.g., cents
         * for USD). For example, to charge $1.00, pass `100`.
         */
        fun productPrice(productPrice: Int?) = productPrice(JsonField.ofNullable(productPrice))

        /**
         * Alias for [Builder.productPrice].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun productPrice(productPrice: Int) = productPrice(productPrice as Int?)

        /**
         * Sets [Builder.productPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productPrice] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productPrice(productPrice: JsonField<Int>) = apply { this.productPrice = productPrice }

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
         * Returns an immutable instance of [OnDemandSubscription].
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
        fun build(): OnDemandSubscription =
            OnDemandSubscription(
                checkRequired("mandateOnly", mandateOnly),
                adaptiveCurrencyFeesInclusive,
                productCurrency,
                productDescription,
                productPrice,
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
    fun validate(): OnDemandSubscription = apply {
        if (validated) {
            return@apply
        }

        mandateOnly()
        adaptiveCurrencyFeesInclusive()
        productCurrency()?.validate()
        productDescription()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (mandateOnly.asKnown() == null) 0 else 1) +
            (if (adaptiveCurrencyFeesInclusive.asKnown() == null) 0 else 1) +
            (productCurrency.asKnown()?.validity() ?: 0) +
            (if (productDescription.asKnown() == null) 0 else 1) +
            (if (productPrice.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnDemandSubscription &&
            mandateOnly == other.mandateOnly &&
            adaptiveCurrencyFeesInclusive == other.adaptiveCurrencyFeesInclusive &&
            productCurrency == other.productCurrency &&
            productDescription == other.productDescription &&
            productPrice == other.productPrice &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            mandateOnly,
            adaptiveCurrencyFeesInclusive,
            productCurrency,
            productDescription,
            productPrice,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnDemandSubscription{mandateOnly=$mandateOnly, adaptiveCurrencyFeesInclusive=$adaptiveCurrencyFeesInclusive, productCurrency=$productCurrency, productDescription=$productDescription, productPrice=$productPrice, additionalProperties=$additionalProperties}"
}
