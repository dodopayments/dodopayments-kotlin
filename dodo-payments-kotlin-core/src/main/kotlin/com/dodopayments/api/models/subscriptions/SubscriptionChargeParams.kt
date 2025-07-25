// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class SubscriptionChargeParams
private constructor(
    private val subscriptionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String? = subscriptionId

    /**
     * The product price. Represented in the lowest denomination of the currency (e.g., cents for
     * USD). For example, to charge $1.00, pass `100`.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productPrice(): Int = body.productPrice()

    /**
     * Whether adaptive currency fees should be included in the product_price (true) or added on top
     * (false). This field is ignored if adaptive pricing is not enabled for the business.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun adaptiveCurrencyFeesInclusive(): Boolean? = body.adaptiveCurrencyFeesInclusive()

    /**
     * Metadata for the payment. If not passed, the metadata of the subscription will be taken
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Optional currency of the product price. If not specified, defaults to the currency of the
     * product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productCurrency(): Currency? = body.productCurrency()

    /**
     * Optional product description override for billing and line items. If not specified, the
     * stored description of the product will be used.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productDescription(): String? = body.productDescription()

    /**
     * Returns the raw JSON value of [productPrice].
     *
     * Unlike [productPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productPrice(): JsonField<Int> = body._productPrice()

    /**
     * Returns the raw JSON value of [adaptiveCurrencyFeesInclusive].
     *
     * Unlike [adaptiveCurrencyFeesInclusive], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _adaptiveCurrencyFeesInclusive(): JsonField<Boolean> = body._adaptiveCurrencyFeesInclusive()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [productCurrency].
     *
     * Unlike [productCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productCurrency(): JsonField<Currency> = body._productCurrency()

    /**
     * Returns the raw JSON value of [productDescription].
     *
     * Unlike [productDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _productDescription(): JsonField<String> = body._productDescription()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionChargeParams].
         *
         * The following fields are required:
         * ```kotlin
         * .productPrice()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionChargeParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionChargeParams: SubscriptionChargeParams) = apply {
            subscriptionId = subscriptionChargeParams.subscriptionId
            body = subscriptionChargeParams.body.toBuilder()
            additionalHeaders = subscriptionChargeParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionChargeParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [productPrice]
         * - [adaptiveCurrencyFeesInclusive]
         * - [metadata]
         * - [productCurrency]
         * - [productDescription]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The product price. Represented in the lowest denomination of the currency (e.g., cents
         * for USD). For example, to charge $1.00, pass `100`.
         */
        fun productPrice(productPrice: Int) = apply { body.productPrice(productPrice) }

        /**
         * Sets [Builder.productPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productPrice] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productPrice(productPrice: JsonField<Int>) = apply { body.productPrice(productPrice) }

        /**
         * Whether adaptive currency fees should be included in the product_price (true) or added on
         * top (false). This field is ignored if adaptive pricing is not enabled for the business.
         */
        fun adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive: Boolean?) = apply {
            body.adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive)
        }

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
                body.adaptiveCurrencyFeesInclusive(adaptiveCurrencyFeesInclusive)
            }

        /**
         * Metadata for the payment. If not passed, the metadata of the subscription will be taken
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * Optional currency of the product price. If not specified, defaults to the currency of the
         * product.
         */
        fun productCurrency(productCurrency: Currency?) = apply {
            body.productCurrency(productCurrency)
        }

        /**
         * Sets [Builder.productCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productCurrency(productCurrency: JsonField<Currency>) = apply {
            body.productCurrency(productCurrency)
        }

        /**
         * Optional product description override for billing and line items. If not specified, the
         * stored description of the product will be used.
         */
        fun productDescription(productDescription: String?) = apply {
            body.productDescription(productDescription)
        }

        /**
         * Sets [Builder.productDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productDescription(productDescription: JsonField<String>) = apply {
            body.productDescription(productDescription)
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
         * Returns an immutable instance of [SubscriptionChargeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .productPrice()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionChargeParams =
            SubscriptionChargeParams(
                subscriptionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val productPrice: JsonField<Int>,
        private val adaptiveCurrencyFeesInclusive: JsonField<Boolean>,
        private val metadata: JsonField<Metadata>,
        private val productCurrency: JsonField<Currency>,
        private val productDescription: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_price")
            @ExcludeMissing
            productPrice: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("adaptive_currency_fees_inclusive")
            @ExcludeMissing
            adaptiveCurrencyFeesInclusive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("product_currency")
            @ExcludeMissing
            productCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("product_description")
            @ExcludeMissing
            productDescription: JsonField<String> = JsonMissing.of(),
        ) : this(
            productPrice,
            adaptiveCurrencyFeesInclusive,
            metadata,
            productCurrency,
            productDescription,
            mutableMapOf(),
        )

        /**
         * The product price. Represented in the lowest denomination of the currency (e.g., cents
         * for USD). For example, to charge $1.00, pass `100`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productPrice(): Int = productPrice.getRequired("product_price")

        /**
         * Whether adaptive currency fees should be included in the product_price (true) or added on
         * top (false). This field is ignored if adaptive pricing is not enabled for the business.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun adaptiveCurrencyFeesInclusive(): Boolean? =
            adaptiveCurrencyFeesInclusive.getNullable("adaptive_currency_fees_inclusive")

        /**
         * Metadata for the payment. If not passed, the metadata of the subscription will be taken
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Optional currency of the product price. If not specified, defaults to the currency of the
         * product.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun productCurrency(): Currency? = productCurrency.getNullable("product_currency")

        /**
         * Optional product description override for billing and line items. If not specified, the
         * stored description of the product will be used.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun productDescription(): String? = productDescription.getNullable("product_description")

        /**
         * Returns the raw JSON value of [productPrice].
         *
         * Unlike [productPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_price")
        @ExcludeMissing
        fun _productPrice(): JsonField<Int> = productPrice

        /**
         * Returns the raw JSON value of [adaptiveCurrencyFeesInclusive].
         *
         * Unlike [adaptiveCurrencyFeesInclusive], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("adaptive_currency_fees_inclusive")
        @ExcludeMissing
        fun _adaptiveCurrencyFeesInclusive(): JsonField<Boolean> = adaptiveCurrencyFeesInclusive

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [productCurrency].
         *
         * Unlike [productCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("product_currency")
        @ExcludeMissing
        fun _productCurrency(): JsonField<Currency> = productCurrency

        /**
         * Returns the raw JSON value of [productDescription].
         *
         * Unlike [productDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("product_description")
        @ExcludeMissing
        fun _productDescription(): JsonField<String> = productDescription

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
             * .productPrice()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var productPrice: JsonField<Int>? = null
            private var adaptiveCurrencyFeesInclusive: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var productCurrency: JsonField<Currency> = JsonMissing.of()
            private var productDescription: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                productPrice = body.productPrice
                adaptiveCurrencyFeesInclusive = body.adaptiveCurrencyFeesInclusive
                metadata = body.metadata
                productCurrency = body.productCurrency
                productDescription = body.productDescription
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The product price. Represented in the lowest denomination of the currency (e.g.,
             * cents for USD). For example, to charge $1.00, pass `100`.
             */
            fun productPrice(productPrice: Int) = productPrice(JsonField.of(productPrice))

            /**
             * Sets [Builder.productPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productPrice] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productPrice(productPrice: JsonField<Int>) = apply {
                this.productPrice = productPrice
            }

            /**
             * Whether adaptive currency fees should be included in the product_price (true) or
             * added on top (false). This field is ignored if adaptive pricing is not enabled for
             * the business.
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
             * Metadata for the payment. If not passed, the metadata of the subscription will be
             * taken
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Optional currency of the product price. If not specified, defaults to the currency of
             * the product.
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
             * Optional product description override for billing and line items. If not specified,
             * the stored description of the product will be used.
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
             * .productPrice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("productPrice", productPrice),
                    adaptiveCurrencyFeesInclusive,
                    metadata,
                    productCurrency,
                    productDescription,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            productPrice()
            adaptiveCurrencyFeesInclusive()
            metadata()?.validate()
            productCurrency()?.validate()
            productDescription()
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
            (if (productPrice.asKnown() == null) 0 else 1) +
                (if (adaptiveCurrencyFeesInclusive.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (productCurrency.asKnown()?.validity() ?: 0) +
                (if (productDescription.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && productPrice == other.productPrice && adaptiveCurrencyFeesInclusive == other.adaptiveCurrencyFeesInclusive && metadata == other.metadata && productCurrency == other.productCurrency && productDescription == other.productDescription && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productPrice, adaptiveCurrencyFeesInclusive, metadata, productCurrency, productDescription, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{productPrice=$productPrice, adaptiveCurrencyFeesInclusive=$adaptiveCurrencyFeesInclusive, metadata=$metadata, productCurrency=$productCurrency, productDescription=$productDescription, additionalProperties=$additionalProperties}"
    }

    /** Metadata for the payment. If not passed, the metadata of the subscription will be taken */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionChargeParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionChargeParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
