// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ProductListResponse
private constructor(
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val isRecurring: JsonField<Boolean>,
    private val productId: JsonField<String>,
    private val taxCategory: JsonField<TaxCategory>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val image: JsonField<String>,
    private val name: JsonField<String>,
    private val price: JsonField<Int>,
    private val priceDetail: JsonField<Price>,
    private val taxInclusive: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("is_recurring")
        @ExcludeMissing
        isRecurring: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_category")
        @ExcludeMissing
        taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("image") @ExcludeMissing image: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("price_detail")
        @ExcludeMissing
        priceDetail: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        taxInclusive: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        businessId,
        createdAt,
        isRecurring,
        productId,
        taxCategory,
        updatedAt,
        currency,
        description,
        image,
        name,
        price,
        priceDetail,
        taxInclusive,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the business to which the product belongs.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Timestamp when the product was created.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Indicates if the product is recurring (e.g., subscriptions).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRecurring(): Boolean = isRecurring.getRequired("is_recurring")

    /**
     * Unique identifier for the product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Tax category associated with the product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxCategory(): TaxCategory = taxCategory.getRequired("tax_category")

    /**
     * Timestamp when the product was last updated.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Currency of the price
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = currency.getNullable("currency")

    /**
     * Description of the product, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * URL of the product image, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun image(): String? = image.getNullable("image")

    /**
     * Name of the product, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Price of the product, optional.
     *
     * The price is represented in the lowest denomination of the currency. For example:
     * - In USD, a price of `$12.34` would be represented as `1234` (cents).
     * - In JPY, a price of `¥1500` would be represented as `1500` (yen).
     * - In INR, a price of `₹1234.56` would be represented as `123456` (paise).
     *
     * This ensures precision and avoids floating-point rounding errors.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun price(): Int? = price.getNullable("price")

    /**
     * Details of the price
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun priceDetail(): Price? = priceDetail.getNullable("price_detail")

    /**
     * Indicates if the price is tax inclusive
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxInclusive(): Boolean? = taxInclusive.getNullable("tax_inclusive")

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
     * Returns the raw JSON value of [isRecurring].
     *
     * Unlike [isRecurring], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_recurring")
    @ExcludeMissing
    fun _isRecurring(): JsonField<Boolean> = isRecurring

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [taxCategory].
     *
     * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_category")
    @ExcludeMissing
    fun _taxCategory(): JsonField<TaxCategory> = taxCategory

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [image].
     *
     * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Int> = price

    /**
     * Returns the raw JSON value of [priceDetail].
     *
     * Unlike [priceDetail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_detail") @ExcludeMissing fun _priceDetail(): JsonField<Price> = priceDetail

    /**
     * Returns the raw JSON value of [taxInclusive].
     *
     * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_inclusive")
    @ExcludeMissing
    fun _taxInclusive(): JsonField<Boolean> = taxInclusive

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
         * Returns a mutable builder for constructing an instance of [ProductListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .createdAt()
         * .isRecurring()
         * .productId()
         * .taxCategory()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductListResponse]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isRecurring: JsonField<Boolean>? = null
        private var productId: JsonField<String>? = null
        private var taxCategory: JsonField<TaxCategory>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var image: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var price: JsonField<Int> = JsonMissing.of()
        private var priceDetail: JsonField<Price> = JsonMissing.of()
        private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(productListResponse: ProductListResponse) = apply {
            businessId = productListResponse.businessId
            createdAt = productListResponse.createdAt
            isRecurring = productListResponse.isRecurring
            productId = productListResponse.productId
            taxCategory = productListResponse.taxCategory
            updatedAt = productListResponse.updatedAt
            currency = productListResponse.currency
            description = productListResponse.description
            image = productListResponse.image
            name = productListResponse.name
            price = productListResponse.price
            priceDetail = productListResponse.priceDetail
            taxInclusive = productListResponse.taxInclusive
            additionalProperties = productListResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the business to which the product belongs. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Timestamp when the product was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Indicates if the product is recurring (e.g., subscriptions). */
        fun isRecurring(isRecurring: Boolean) = isRecurring(JsonField.of(isRecurring))

        /**
         * Sets [Builder.isRecurring] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRecurring] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRecurring(isRecurring: JsonField<Boolean>) = apply { this.isRecurring = isRecurring }

        /** Unique identifier for the product. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Tax category associated with the product. */
        fun taxCategory(taxCategory: TaxCategory) = taxCategory(JsonField.of(taxCategory))

        /**
         * Sets [Builder.taxCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxCategory] with a well-typed [TaxCategory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
            this.taxCategory = taxCategory
        }

        /** Timestamp when the product was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Currency of the price */
        fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Description of the product, optional. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** URL of the product image, optional. */
        fun image(image: String?) = image(JsonField.ofNullable(image))

        /**
         * Sets [Builder.image] to an arbitrary JSON value.
         *
         * You should usually call [Builder.image] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun image(image: JsonField<String>) = apply { this.image = image }

        /** Name of the product, optional. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Price of the product, optional.
         *
         * The price is represented in the lowest denomination of the currency. For example:
         * - In USD, a price of `$12.34` would be represented as `1234` (cents).
         * - In JPY, a price of `¥1500` would be represented as `1500` (yen).
         * - In INR, a price of `₹1234.56` would be represented as `123456` (paise).
         *
         * This ensures precision and avoids floating-point rounding errors.
         */
        fun price(price: Int?) = price(JsonField.ofNullable(price))

        /**
         * Alias for [Builder.price].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun price(price: Int) = price(price as Int?)

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Int>) = apply { this.price = price }

        /** Details of the price */
        fun priceDetail(priceDetail: Price?) = priceDetail(JsonField.ofNullable(priceDetail))

        /**
         * Sets [Builder.priceDetail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceDetail] with a well-typed [Price] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priceDetail(priceDetail: JsonField<Price>) = apply { this.priceDetail = priceDetail }

        /** Alias for calling [priceDetail] with `Price.ofOneTime(oneTime)`. */
        fun priceDetail(oneTime: Price.OneTimePrice) = priceDetail(Price.ofOneTime(oneTime))

        /** Alias for calling [priceDetail] with `Price.ofRecurring(recurring)`. */
        fun priceDetail(recurring: Price.RecurringPrice) = priceDetail(Price.ofRecurring(recurring))

        /** Indicates if the price is tax inclusive */
        fun taxInclusive(taxInclusive: Boolean?) = taxInclusive(JsonField.ofNullable(taxInclusive))

        /**
         * Alias for [Builder.taxInclusive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun taxInclusive(taxInclusive: Boolean) = taxInclusive(taxInclusive as Boolean?)

        /**
         * Sets [Builder.taxInclusive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
            this.taxInclusive = taxInclusive
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
         * Returns an immutable instance of [ProductListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .createdAt()
         * .isRecurring()
         * .productId()
         * .taxCategory()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductListResponse =
            ProductListResponse(
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("isRecurring", isRecurring),
                checkRequired("productId", productId),
                checkRequired("taxCategory", taxCategory),
                checkRequired("updatedAt", updatedAt),
                currency,
                description,
                image,
                name,
                price,
                priceDetail,
                taxInclusive,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProductListResponse = apply {
        if (validated) {
            return@apply
        }

        businessId()
        createdAt()
        isRecurring()
        productId()
        taxCategory().validate()
        updatedAt()
        currency()?.validate()
        description()
        image()
        name()
        price()
        priceDetail()?.validate()
        taxInclusive()
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
        (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (isRecurring.asKnown() == null) 0 else 1) +
            (if (productId.asKnown() == null) 0 else 1) +
            (taxCategory.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (image.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (price.asKnown() == null) 0 else 1) +
            (priceDetail.asKnown()?.validity() ?: 0) +
            (if (taxInclusive.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListResponse && businessId == other.businessId && createdAt == other.createdAt && isRecurring == other.isRecurring && productId == other.productId && taxCategory == other.taxCategory && updatedAt == other.updatedAt && currency == other.currency && description == other.description && image == other.image && name == other.name && price == other.price && priceDetail == other.priceDetail && taxInclusive == other.taxInclusive && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(businessId, createdAt, isRecurring, productId, taxCategory, updatedAt, currency, description, image, name, price, priceDetail, taxInclusive, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductListResponse{businessId=$businessId, createdAt=$createdAt, isRecurring=$isRecurring, productId=$productId, taxCategory=$taxCategory, updatedAt=$updatedAt, currency=$currency, description=$description, image=$image, name=$name, price=$price, priceDetail=$priceDetail, taxInclusive=$taxInclusive, additionalProperties=$additionalProperties}"
}
