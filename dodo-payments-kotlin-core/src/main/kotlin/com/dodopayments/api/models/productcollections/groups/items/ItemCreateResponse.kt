// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups.items

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.products.Price
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class ItemCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val addonsCount: JsonField<Long>,
    private val filesCount: JsonField<Long>,
    private val hasCreditEntitlements: JsonField<Boolean>,
    private val isRecurring: JsonField<Boolean>,
    private val licenseKeyEnabled: JsonField<Boolean>,
    private val metersCount: JsonField<Long>,
    private val productId: JsonField<String>,
    private val status: JsonField<Boolean>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val price: JsonField<Int>,
    private val priceDetail: JsonField<Price>,
    private val taxCategory: JsonField<TaxCategory>,
    private val taxInclusive: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addons_count")
        @ExcludeMissing
        addonsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("files_count") @ExcludeMissing filesCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("has_credit_entitlements")
        @ExcludeMissing
        hasCreditEntitlements: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_recurring")
        @ExcludeMissing
        isRecurring: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("license_key_enabled")
        @ExcludeMissing
        licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("meters_count")
        @ExcludeMissing
        metersCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("price_detail")
        @ExcludeMissing
        priceDetail: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("tax_category")
        @ExcludeMissing
        taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        taxInclusive: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        addonsCount,
        filesCount,
        hasCreditEntitlements,
        isRecurring,
        licenseKeyEnabled,
        metersCount,
        productId,
        status,
        currency,
        description,
        name,
        price,
        priceDetail,
        taxCategory,
        taxInclusive,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addonsCount(): Long = addonsCount.getRequired("addons_count")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filesCount(): Long = filesCount.getRequired("files_count")

    /**
     * Whether this product has any credit entitlements attached
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasCreditEntitlements(): Boolean =
        hasCreditEntitlements.getRequired("has_credit_entitlements")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRecurring(): Boolean = isRecurring.getRequired("is_recurring")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun licenseKeyEnabled(): Boolean = licenseKeyEnabled.getRequired("license_key_enabled")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metersCount(): Long = metersCount.getRequired("meters_count")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Boolean = status.getRequired("status")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = currency.getNullable("currency")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun price(): Int? = price.getNullable("price")

    /**
     * One-time price details.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun priceDetail(): Price? = priceDetail.getNullable("price_detail")

    /**
     * Represents the different categories of taxation applicable to various products and services.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxCategory(): TaxCategory? = taxCategory.getNullable("tax_category")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxInclusive(): Boolean? = taxInclusive.getNullable("tax_inclusive")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [addonsCount].
     *
     * Unlike [addonsCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addons_count") @ExcludeMissing fun _addonsCount(): JsonField<Long> = addonsCount

    /**
     * Returns the raw JSON value of [filesCount].
     *
     * Unlike [filesCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("files_count") @ExcludeMissing fun _filesCount(): JsonField<Long> = filesCount

    /**
     * Returns the raw JSON value of [hasCreditEntitlements].
     *
     * Unlike [hasCreditEntitlements], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("has_credit_entitlements")
    @ExcludeMissing
    fun _hasCreditEntitlements(): JsonField<Boolean> = hasCreditEntitlements

    /**
     * Returns the raw JSON value of [isRecurring].
     *
     * Unlike [isRecurring], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_recurring")
    @ExcludeMissing
    fun _isRecurring(): JsonField<Boolean> = isRecurring

    /**
     * Returns the raw JSON value of [licenseKeyEnabled].
     *
     * Unlike [licenseKeyEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("license_key_enabled")
    @ExcludeMissing
    fun _licenseKeyEnabled(): JsonField<Boolean> = licenseKeyEnabled

    /**
     * Returns the raw JSON value of [metersCount].
     *
     * Unlike [metersCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meters_count") @ExcludeMissing fun _metersCount(): JsonField<Long> = metersCount

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Boolean> = status

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
     * Returns the raw JSON value of [taxCategory].
     *
     * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_category")
    @ExcludeMissing
    fun _taxCategory(): JsonField<TaxCategory> = taxCategory

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
         * Returns a mutable builder for constructing an instance of [ItemCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .addonsCount()
         * .filesCount()
         * .hasCreditEntitlements()
         * .isRecurring()
         * .licenseKeyEnabled()
         * .metersCount()
         * .productId()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ItemCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var addonsCount: JsonField<Long>? = null
        private var filesCount: JsonField<Long>? = null
        private var hasCreditEntitlements: JsonField<Boolean>? = null
        private var isRecurring: JsonField<Boolean>? = null
        private var licenseKeyEnabled: JsonField<Boolean>? = null
        private var metersCount: JsonField<Long>? = null
        private var productId: JsonField<String>? = null
        private var status: JsonField<Boolean>? = null
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var price: JsonField<Int> = JsonMissing.of()
        private var priceDetail: JsonField<Price> = JsonMissing.of()
        private var taxCategory: JsonField<TaxCategory> = JsonMissing.of()
        private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(itemCreateResponse: ItemCreateResponse) = apply {
            id = itemCreateResponse.id
            addonsCount = itemCreateResponse.addonsCount
            filesCount = itemCreateResponse.filesCount
            hasCreditEntitlements = itemCreateResponse.hasCreditEntitlements
            isRecurring = itemCreateResponse.isRecurring
            licenseKeyEnabled = itemCreateResponse.licenseKeyEnabled
            metersCount = itemCreateResponse.metersCount
            productId = itemCreateResponse.productId
            status = itemCreateResponse.status
            currency = itemCreateResponse.currency
            description = itemCreateResponse.description
            name = itemCreateResponse.name
            price = itemCreateResponse.price
            priceDetail = itemCreateResponse.priceDetail
            taxCategory = itemCreateResponse.taxCategory
            taxInclusive = itemCreateResponse.taxInclusive
            additionalProperties = itemCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun addonsCount(addonsCount: Long) = addonsCount(JsonField.of(addonsCount))

        /**
         * Sets [Builder.addonsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addonsCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addonsCount(addonsCount: JsonField<Long>) = apply { this.addonsCount = addonsCount }

        fun filesCount(filesCount: Long) = filesCount(JsonField.of(filesCount))

        /**
         * Sets [Builder.filesCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filesCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filesCount(filesCount: JsonField<Long>) = apply { this.filesCount = filesCount }

        /** Whether this product has any credit entitlements attached */
        fun hasCreditEntitlements(hasCreditEntitlements: Boolean) =
            hasCreditEntitlements(JsonField.of(hasCreditEntitlements))

        /**
         * Sets [Builder.hasCreditEntitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasCreditEntitlements] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasCreditEntitlements(hasCreditEntitlements: JsonField<Boolean>) = apply {
            this.hasCreditEntitlements = hasCreditEntitlements
        }

        fun isRecurring(isRecurring: Boolean) = isRecurring(JsonField.of(isRecurring))

        /**
         * Sets [Builder.isRecurring] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRecurring] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRecurring(isRecurring: JsonField<Boolean>) = apply { this.isRecurring = isRecurring }

        fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
            licenseKeyEnabled(JsonField.of(licenseKeyEnabled))

        /**
         * Sets [Builder.licenseKeyEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: JsonField<Boolean>) = apply {
            this.licenseKeyEnabled = licenseKeyEnabled
        }

        fun metersCount(metersCount: Long) = metersCount(JsonField.of(metersCount))

        /**
         * Sets [Builder.metersCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metersCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metersCount(metersCount: JsonField<Long>) = apply { this.metersCount = metersCount }

        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun status(status: Boolean) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Boolean>) = apply { this.status = status }

        fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** One-time price details. */
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

        /** Alias for calling [priceDetail] with `Price.ofUsageBased(usageBased)`. */
        fun priceDetail(usageBased: Price.UsageBasedPrice) =
            priceDetail(Price.ofUsageBased(usageBased))

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         */
        fun taxCategory(taxCategory: TaxCategory?) = taxCategory(JsonField.ofNullable(taxCategory))

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
         * Returns an immutable instance of [ItemCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .addonsCount()
         * .filesCount()
         * .hasCreditEntitlements()
         * .isRecurring()
         * .licenseKeyEnabled()
         * .metersCount()
         * .productId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ItemCreateResponse =
            ItemCreateResponse(
                checkRequired("id", id),
                checkRequired("addonsCount", addonsCount),
                checkRequired("filesCount", filesCount),
                checkRequired("hasCreditEntitlements", hasCreditEntitlements),
                checkRequired("isRecurring", isRecurring),
                checkRequired("licenseKeyEnabled", licenseKeyEnabled),
                checkRequired("metersCount", metersCount),
                checkRequired("productId", productId),
                checkRequired("status", status),
                currency,
                description,
                name,
                price,
                priceDetail,
                taxCategory,
                taxInclusive,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ItemCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        addonsCount()
        filesCount()
        hasCreditEntitlements()
        isRecurring()
        licenseKeyEnabled()
        metersCount()
        productId()
        status()
        currency()?.validate()
        description()
        name()
        price()
        priceDetail()?.validate()
        taxCategory()?.validate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (addonsCount.asKnown() == null) 0 else 1) +
            (if (filesCount.asKnown() == null) 0 else 1) +
            (if (hasCreditEntitlements.asKnown() == null) 0 else 1) +
            (if (isRecurring.asKnown() == null) 0 else 1) +
            (if (licenseKeyEnabled.asKnown() == null) 0 else 1) +
            (if (metersCount.asKnown() == null) 0 else 1) +
            (if (productId.asKnown() == null) 0 else 1) +
            (if (status.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (price.asKnown() == null) 0 else 1) +
            (priceDetail.asKnown()?.validity() ?: 0) +
            (taxCategory.asKnown()?.validity() ?: 0) +
            (if (taxInclusive.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ItemCreateResponse &&
            id == other.id &&
            addonsCount == other.addonsCount &&
            filesCount == other.filesCount &&
            hasCreditEntitlements == other.hasCreditEntitlements &&
            isRecurring == other.isRecurring &&
            licenseKeyEnabled == other.licenseKeyEnabled &&
            metersCount == other.metersCount &&
            productId == other.productId &&
            status == other.status &&
            currency == other.currency &&
            description == other.description &&
            name == other.name &&
            price == other.price &&
            priceDetail == other.priceDetail &&
            taxCategory == other.taxCategory &&
            taxInclusive == other.taxInclusive &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            addonsCount,
            filesCount,
            hasCreditEntitlements,
            isRecurring,
            licenseKeyEnabled,
            metersCount,
            productId,
            status,
            currency,
            description,
            name,
            price,
            priceDetail,
            taxCategory,
            taxInclusive,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ItemCreateResponse{id=$id, addonsCount=$addonsCount, filesCount=$filesCount, hasCreditEntitlements=$hasCreditEntitlements, isRecurring=$isRecurring, licenseKeyEnabled=$licenseKeyEnabled, metersCount=$metersCount, productId=$productId, status=$status, currency=$currency, description=$description, name=$name, price=$price, priceDetail=$priceDetail, taxCategory=$taxCategory, taxInclusive=$taxInclusive, additionalProperties=$additionalProperties}"
}
