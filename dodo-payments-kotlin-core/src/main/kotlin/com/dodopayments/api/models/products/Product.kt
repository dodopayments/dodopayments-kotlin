// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Product
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brandId: JsonField<String>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditEntitlements: JsonField<List<CreditEntitlement>>,
    private val isRecurring: JsonField<Boolean>,
    private val licenseKeyEnabled: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val price: JsonField<Price>,
    private val productId: JsonField<String>,
    private val taxCategory: JsonField<TaxCategory>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val addons: JsonField<List<String>>,
    private val description: JsonField<String>,
    private val digitalProductDelivery: JsonField<DigitalProductDelivery>,
    private val image: JsonField<String>,
    private val licenseKeyActivationMessage: JsonField<String>,
    private val licenseKeyActivationsLimit: JsonField<Int>,
    private val licenseKeyDuration: JsonField<LicenseKeyDuration>,
    private val name: JsonField<String>,
    private val productCollectionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_entitlements")
        @ExcludeMissing
        creditEntitlements: JsonField<List<CreditEntitlement>> = JsonMissing.of(),
        @JsonProperty("is_recurring")
        @ExcludeMissing
        isRecurring: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("license_key_enabled")
        @ExcludeMissing
        licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_category")
        @ExcludeMissing
        taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("addons") @ExcludeMissing addons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("digital_product_delivery")
        @ExcludeMissing
        digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of(),
        @JsonProperty("image") @ExcludeMissing image: JsonField<String> = JsonMissing.of(),
        @JsonProperty("license_key_activation_message")
        @ExcludeMissing
        licenseKeyActivationMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("license_key_activations_limit")
        @ExcludeMissing
        licenseKeyActivationsLimit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("license_key_duration")
        @ExcludeMissing
        licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_collection_id")
        @ExcludeMissing
        productCollectionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        brandId,
        businessId,
        createdAt,
        creditEntitlements,
        isRecurring,
        licenseKeyEnabled,
        metadata,
        price,
        productId,
        taxCategory,
        updatedAt,
        addons,
        description,
        digitalProductDelivery,
        image,
        licenseKeyActivationMessage,
        licenseKeyActivationsLimit,
        licenseKeyDuration,
        name,
        productCollectionId,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

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
     * Attached credit entitlements with settings
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditEntitlements(): List<CreditEntitlement> =
        creditEntitlements.getRequired("credit_entitlements")

    /**
     * Indicates if the product is recurring (e.g., subscriptions).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRecurring(): Boolean = isRecurring.getRequired("is_recurring")

    /**
     * Indicates whether the product requires a license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun licenseKeyEnabled(): Boolean = licenseKeyEnabled.getRequired("license_key_enabled")

    /**
     * Additional custom data associated with the product
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Pricing information for the product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): Price = price.getRequired("price")

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
     * Available Addons for subscription products
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addons(): List<String>? = addons.getNullable("addons")

    /**
     * Description of the product, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun digitalProductDelivery(): DigitalProductDelivery? =
        digitalProductDelivery.getNullable("digital_product_delivery")

    /**
     * URL of the product image, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun image(): String? = image.getNullable("image")

    /**
     * Message sent upon license key activation, if applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyActivationMessage(): String? =
        licenseKeyActivationMessage.getNullable("license_key_activation_message")

    /**
     * Limit on the number of activations for the license key, if enabled.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyActivationsLimit(): Int? =
        licenseKeyActivationsLimit.getNullable("license_key_activations_limit")

    /**
     * Duration of the license key validity, if enabled.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyDuration(): LicenseKeyDuration? =
        licenseKeyDuration.getNullable("license_key_duration")

    /**
     * Name of the product, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * The product collection ID this product belongs to, if any
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productCollectionId(): String? = productCollectionId.getNullable("product_collection_id")

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

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
     * Returns the raw JSON value of [creditEntitlements].
     *
     * Unlike [creditEntitlements], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_entitlements")
    @ExcludeMissing
    fun _creditEntitlements(): JsonField<List<CreditEntitlement>> = creditEntitlements

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
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

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
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<String>> = addons

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [digitalProductDelivery].
     *
     * Unlike [digitalProductDelivery], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("digital_product_delivery")
    @ExcludeMissing
    fun _digitalProductDelivery(): JsonField<DigitalProductDelivery> = digitalProductDelivery

    /**
     * Returns the raw JSON value of [image].
     *
     * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

    /**
     * Returns the raw JSON value of [licenseKeyActivationMessage].
     *
     * Unlike [licenseKeyActivationMessage], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("license_key_activation_message")
    @ExcludeMissing
    fun _licenseKeyActivationMessage(): JsonField<String> = licenseKeyActivationMessage

    /**
     * Returns the raw JSON value of [licenseKeyActivationsLimit].
     *
     * Unlike [licenseKeyActivationsLimit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("license_key_activations_limit")
    @ExcludeMissing
    fun _licenseKeyActivationsLimit(): JsonField<Int> = licenseKeyActivationsLimit

    /**
     * Returns the raw JSON value of [licenseKeyDuration].
     *
     * Unlike [licenseKeyDuration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("license_key_duration")
    @ExcludeMissing
    fun _licenseKeyDuration(): JsonField<LicenseKeyDuration> = licenseKeyDuration

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [productCollectionId].
     *
     * Unlike [productCollectionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("product_collection_id")
    @ExcludeMissing
    fun _productCollectionId(): JsonField<String> = productCollectionId

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
         * Returns a mutable builder for constructing an instance of [Product].
         *
         * The following fields are required:
         * ```kotlin
         * .brandId()
         * .businessId()
         * .createdAt()
         * .creditEntitlements()
         * .isRecurring()
         * .licenseKeyEnabled()
         * .metadata()
         * .price()
         * .productId()
         * .taxCategory()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Product]. */
    class Builder internal constructor() {

        private var brandId: JsonField<String>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditEntitlements: JsonField<MutableList<CreditEntitlement>>? = null
        private var isRecurring: JsonField<Boolean>? = null
        private var licenseKeyEnabled: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var price: JsonField<Price>? = null
        private var productId: JsonField<String>? = null
        private var taxCategory: JsonField<TaxCategory>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var addons: JsonField<MutableList<String>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of()
        private var image: JsonField<String> = JsonMissing.of()
        private var licenseKeyActivationMessage: JsonField<String> = JsonMissing.of()
        private var licenseKeyActivationsLimit: JsonField<Int> = JsonMissing.of()
        private var licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var productCollectionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(product: Product) = apply {
            brandId = product.brandId
            businessId = product.businessId
            createdAt = product.createdAt
            creditEntitlements = product.creditEntitlements.map { it.toMutableList() }
            isRecurring = product.isRecurring
            licenseKeyEnabled = product.licenseKeyEnabled
            metadata = product.metadata
            price = product.price
            productId = product.productId
            taxCategory = product.taxCategory
            updatedAt = product.updatedAt
            addons = product.addons.map { it.toMutableList() }
            description = product.description
            digitalProductDelivery = product.digitalProductDelivery
            image = product.image
            licenseKeyActivationMessage = product.licenseKeyActivationMessage
            licenseKeyActivationsLimit = product.licenseKeyActivationsLimit
            licenseKeyDuration = product.licenseKeyDuration
            name = product.name
            productCollectionId = product.productCollectionId
            additionalProperties = product.additionalProperties.toMutableMap()
        }

        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

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

        /** Attached credit entitlements with settings */
        fun creditEntitlements(creditEntitlements: List<CreditEntitlement>) =
            creditEntitlements(JsonField.of(creditEntitlements))

        /**
         * Sets [Builder.creditEntitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlements] with a well-typed
         * `List<CreditEntitlement>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun creditEntitlements(creditEntitlements: JsonField<List<CreditEntitlement>>) = apply {
            this.creditEntitlements = creditEntitlements.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditEntitlement] to [creditEntitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditEntitlement(creditEntitlement: CreditEntitlement) = apply {
            creditEntitlements =
                (creditEntitlements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditEntitlements", it).add(creditEntitlement)
                }
        }

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

        /** Indicates whether the product requires a license key. */
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

        /** Additional custom data associated with the product */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Pricing information for the product. */
        fun price(price: Price) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Price] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Price>) = apply { this.price = price }

        /** Alias for calling [price] with `Price.ofOneTime(oneTime)`. */
        fun price(oneTime: Price.OneTimePrice) = price(Price.ofOneTime(oneTime))

        /** Alias for calling [price] with `Price.ofRecurring(recurring)`. */
        fun price(recurring: Price.RecurringPrice) = price(Price.ofRecurring(recurring))

        /** Alias for calling [price] with `Price.ofUsageBased(usageBased)`. */
        fun price(usageBased: Price.UsageBasedPrice) = price(Price.ofUsageBased(usageBased))

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

        /** Available Addons for subscription products */
        fun addons(addons: List<String>?) = addons(JsonField.ofNullable(addons))

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addons(addons: JsonField<List<String>>) = apply {
            this.addons = addons.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: String) = apply {
            addons =
                (addons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addons", it).add(addon)
                }
        }

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

        fun digitalProductDelivery(digitalProductDelivery: DigitalProductDelivery?) =
            digitalProductDelivery(JsonField.ofNullable(digitalProductDelivery))

        /**
         * Sets [Builder.digitalProductDelivery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalProductDelivery] with a well-typed
         * [DigitalProductDelivery] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun digitalProductDelivery(digitalProductDelivery: JsonField<DigitalProductDelivery>) =
            apply {
                this.digitalProductDelivery = digitalProductDelivery
            }

        /** URL of the product image, optional. */
        fun image(image: String?) = image(JsonField.ofNullable(image))

        /**
         * Sets [Builder.image] to an arbitrary JSON value.
         *
         * You should usually call [Builder.image] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun image(image: JsonField<String>) = apply { this.image = image }

        /** Message sent upon license key activation, if applicable. */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: String?) =
            licenseKeyActivationMessage(JsonField.ofNullable(licenseKeyActivationMessage))

        /**
         * Sets [Builder.licenseKeyActivationMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationMessage] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: JsonField<String>) = apply {
            this.licenseKeyActivationMessage = licenseKeyActivationMessage
        }

        /** Limit on the number of activations for the license key, if enabled. */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Int?) =
            licenseKeyActivationsLimit(JsonField.ofNullable(licenseKeyActivationsLimit))

        /**
         * Alias for [Builder.licenseKeyActivationsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Int) =
            licenseKeyActivationsLimit(licenseKeyActivationsLimit as Int?)

        /**
         * Sets [Builder.licenseKeyActivationsLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationsLimit] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: JsonField<Int>) = apply {
            this.licenseKeyActivationsLimit = licenseKeyActivationsLimit
        }

        /** Duration of the license key validity, if enabled. */
        fun licenseKeyDuration(licenseKeyDuration: LicenseKeyDuration?) =
            licenseKeyDuration(JsonField.ofNullable(licenseKeyDuration))

        /**
         * Sets [Builder.licenseKeyDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyDuration] with a well-typed
         * [LicenseKeyDuration] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun licenseKeyDuration(licenseKeyDuration: JsonField<LicenseKeyDuration>) = apply {
            this.licenseKeyDuration = licenseKeyDuration
        }

        /** Name of the product, optional. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The product collection ID this product belongs to, if any */
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
         * Returns an immutable instance of [Product].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .brandId()
         * .businessId()
         * .createdAt()
         * .creditEntitlements()
         * .isRecurring()
         * .licenseKeyEnabled()
         * .metadata()
         * .price()
         * .productId()
         * .taxCategory()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Product =
            Product(
                checkRequired("brandId", brandId),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("creditEntitlements", creditEntitlements).map { it.toImmutable() },
                checkRequired("isRecurring", isRecurring),
                checkRequired("licenseKeyEnabled", licenseKeyEnabled),
                checkRequired("metadata", metadata),
                checkRequired("price", price),
                checkRequired("productId", productId),
                checkRequired("taxCategory", taxCategory),
                checkRequired("updatedAt", updatedAt),
                (addons ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                digitalProductDelivery,
                image,
                licenseKeyActivationMessage,
                licenseKeyActivationsLimit,
                licenseKeyDuration,
                name,
                productCollectionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Product = apply {
        if (validated) {
            return@apply
        }

        brandId()
        businessId()
        createdAt()
        creditEntitlements().forEach { it.validate() }
        isRecurring()
        licenseKeyEnabled()
        metadata().validate()
        price().validate()
        productId()
        taxCategory().validate()
        updatedAt()
        addons()
        description()
        digitalProductDelivery()?.validate()
        image()
        licenseKeyActivationMessage()
        licenseKeyActivationsLimit()
        licenseKeyDuration()?.validate()
        name()
        productCollectionId()
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
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (creditEntitlements.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isRecurring.asKnown() == null) 0 else 1) +
            (if (licenseKeyEnabled.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (price.asKnown()?.validity() ?: 0) +
            (if (productId.asKnown() == null) 0 else 1) +
            (taxCategory.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (addons.asKnown()?.size ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (digitalProductDelivery.asKnown()?.validity() ?: 0) +
            (if (image.asKnown() == null) 0 else 1) +
            (if (licenseKeyActivationMessage.asKnown() == null) 0 else 1) +
            (if (licenseKeyActivationsLimit.asKnown() == null) 0 else 1) +
            (licenseKeyDuration.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (productCollectionId.asKnown() == null) 0 else 1)

    /** Response struct for credit entitlement mapping */
    class CreditEntitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val creditEntitlementId: JsonField<String>,
        private val creditEntitlementName: JsonField<String>,
        private val creditEntitlementUnit: JsonField<String>,
        private val creditsAmount: JsonField<String>,
        private val creditsReduceOverage: JsonField<Boolean>,
        private val overageChargeAtBilling: JsonField<Boolean>,
        private val overageEnabled: JsonField<Boolean>,
        private val preserveOverageAtReset: JsonField<Boolean>,
        private val prorationBehavior: JsonField<ProrationBehavior>,
        private val rolloverEnabled: JsonField<Boolean>,
        private val trialCreditsExpireAfterTrial: JsonField<Boolean>,
        private val currency: JsonField<Currency>,
        private val expiresAfterDays: JsonField<Int>,
        private val lowBalanceThresholdPercent: JsonField<Int>,
        private val maxRolloverCount: JsonField<Int>,
        private val overageLimit: JsonField<String>,
        private val pricePerUnit: JsonField<String>,
        private val rolloverPercentage: JsonField<Int>,
        private val rolloverTimeframeCount: JsonField<Int>,
        private val rolloverTimeframeInterval: JsonField<TimeInterval>,
        private val trialCredits: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            creditEntitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_name")
            @ExcludeMissing
            creditEntitlementName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_unit")
            @ExcludeMissing
            creditEntitlementUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_amount")
            @ExcludeMissing
            creditsAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_reduce_overage")
            @ExcludeMissing
            creditsReduceOverage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("overage_charge_at_billing")
            @ExcludeMissing
            overageChargeAtBilling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("overage_enabled")
            @ExcludeMissing
            overageEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("preserve_overage_at_reset")
            @ExcludeMissing
            preserveOverageAtReset: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("proration_behavior")
            @ExcludeMissing
            prorationBehavior: JsonField<ProrationBehavior> = JsonMissing.of(),
            @JsonProperty("rollover_enabled")
            @ExcludeMissing
            rolloverEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("trial_credits_expire_after_trial")
            @ExcludeMissing
            trialCreditsExpireAfterTrial: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("expires_after_days")
            @ExcludeMissing
            expiresAfterDays: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("low_balance_threshold_percent")
            @ExcludeMissing
            lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("max_rollover_count")
            @ExcludeMissing
            maxRolloverCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("overage_limit")
            @ExcludeMissing
            overageLimit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_per_unit")
            @ExcludeMissing
            pricePerUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rollover_percentage")
            @ExcludeMissing
            rolloverPercentage: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("rollover_timeframe_count")
            @ExcludeMissing
            rolloverTimeframeCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("rollover_timeframe_interval")
            @ExcludeMissing
            rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of(),
            @JsonProperty("trial_credits")
            @ExcludeMissing
            trialCredits: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            creditEntitlementId,
            creditEntitlementName,
            creditEntitlementUnit,
            creditsAmount,
            creditsReduceOverage,
            overageChargeAtBilling,
            overageEnabled,
            preserveOverageAtReset,
            prorationBehavior,
            rolloverEnabled,
            trialCreditsExpireAfterTrial,
            currency,
            expiresAfterDays,
            lowBalanceThresholdPercent,
            maxRolloverCount,
            overageLimit,
            pricePerUnit,
            rolloverPercentage,
            rolloverTimeframeCount,
            rolloverTimeframeInterval,
            trialCredits,
            mutableMapOf(),
        )

        /**
         * Unique ID of this mapping
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * ID of the credit entitlement
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

        /**
         * Name of the credit entitlement
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementName(): String =
            creditEntitlementName.getRequired("credit_entitlement_name")

        /**
         * Unit label for the credit entitlement
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementUnit(): String =
            creditEntitlementUnit.getRequired("credit_entitlement_unit")

        /**
         * Number of credits granted
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditsAmount(): String = creditsAmount.getRequired("credits_amount")

        /**
         * Whether new credit grants reduce existing overage
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditsReduceOverage(): Boolean =
            creditsReduceOverage.getRequired("credits_reduce_overage")

        /**
         * Whether overage is charged at billing
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overageChargeAtBilling(): Boolean =
            overageChargeAtBilling.getRequired("overage_charge_at_billing")

        /**
         * Whether overage is enabled
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overageEnabled(): Boolean = overageEnabled.getRequired("overage_enabled")

        /**
         * Whether to preserve overage balance when credits reset
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun preserveOverageAtReset(): Boolean =
            preserveOverageAtReset.getRequired("preserve_overage_at_reset")

        /**
         * Proration behavior for credit grants during plan changes
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prorationBehavior(): ProrationBehavior =
            prorationBehavior.getRequired("proration_behavior")

        /**
         * Whether rollover is enabled
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rolloverEnabled(): Boolean = rolloverEnabled.getRequired("rollover_enabled")

        /**
         * Whether trial credits expire after trial
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trialCreditsExpireAfterTrial(): Boolean =
            trialCreditsExpireAfterTrial.getRequired("trial_credits_expire_after_trial")

        /**
         * Currency
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): Currency? = currency.getNullable("currency")

        /**
         * Days until credits expire
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAfterDays(): Int? = expiresAfterDays.getNullable("expires_after_days")

        /**
         * Low balance threshold percentage
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lowBalanceThresholdPercent(): Int? =
            lowBalanceThresholdPercent.getNullable("low_balance_threshold_percent")

        /**
         * Maximum rollover cycles
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxRolloverCount(): Int? = maxRolloverCount.getNullable("max_rollover_count")

        /**
         * Overage limit
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageLimit(): String? = overageLimit.getNullable("overage_limit")

        /**
         * Price per unit
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pricePerUnit(): String? = pricePerUnit.getNullable("price_per_unit")

        /**
         * Rollover percentage
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverPercentage(): Int? = rolloverPercentage.getNullable("rollover_percentage")

        /**
         * Rollover timeframe count
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeCount(): Int? =
            rolloverTimeframeCount.getNullable("rollover_timeframe_count")

        /**
         * Rollover timeframe interval
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeInterval(): TimeInterval? =
            rolloverTimeframeInterval.getNullable("rollover_timeframe_interval")

        /**
         * Trial credits
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialCredits(): String? = trialCredits.getNullable("trial_credits")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [creditEntitlementId].
         *
         * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

        /**
         * Returns the raw JSON value of [creditEntitlementName].
         *
         * Unlike [creditEntitlementName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlement_name")
        @ExcludeMissing
        fun _creditEntitlementName(): JsonField<String> = creditEntitlementName

        /**
         * Returns the raw JSON value of [creditEntitlementUnit].
         *
         * Unlike [creditEntitlementUnit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlement_unit")
        @ExcludeMissing
        fun _creditEntitlementUnit(): JsonField<String> = creditEntitlementUnit

        /**
         * Returns the raw JSON value of [creditsAmount].
         *
         * Unlike [creditsAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credits_amount")
        @ExcludeMissing
        fun _creditsAmount(): JsonField<String> = creditsAmount

        /**
         * Returns the raw JSON value of [creditsReduceOverage].
         *
         * Unlike [creditsReduceOverage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credits_reduce_overage")
        @ExcludeMissing
        fun _creditsReduceOverage(): JsonField<Boolean> = creditsReduceOverage

        /**
         * Returns the raw JSON value of [overageChargeAtBilling].
         *
         * Unlike [overageChargeAtBilling], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("overage_charge_at_billing")
        @ExcludeMissing
        fun _overageChargeAtBilling(): JsonField<Boolean> = overageChargeAtBilling

        /**
         * Returns the raw JSON value of [overageEnabled].
         *
         * Unlike [overageEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_enabled")
        @ExcludeMissing
        fun _overageEnabled(): JsonField<Boolean> = overageEnabled

        /**
         * Returns the raw JSON value of [preserveOverageAtReset].
         *
         * Unlike [preserveOverageAtReset], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preserve_overage_at_reset")
        @ExcludeMissing
        fun _preserveOverageAtReset(): JsonField<Boolean> = preserveOverageAtReset

        /**
         * Returns the raw JSON value of [prorationBehavior].
         *
         * Unlike [prorationBehavior], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("proration_behavior")
        @ExcludeMissing
        fun _prorationBehavior(): JsonField<ProrationBehavior> = prorationBehavior

        /**
         * Returns the raw JSON value of [rolloverEnabled].
         *
         * Unlike [rolloverEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_enabled")
        @ExcludeMissing
        fun _rolloverEnabled(): JsonField<Boolean> = rolloverEnabled

        /**
         * Returns the raw JSON value of [trialCreditsExpireAfterTrial].
         *
         * Unlike [trialCreditsExpireAfterTrial], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("trial_credits_expire_after_trial")
        @ExcludeMissing
        fun _trialCreditsExpireAfterTrial(): JsonField<Boolean> = trialCreditsExpireAfterTrial

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [expiresAfterDays].
         *
         * Unlike [expiresAfterDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expires_after_days")
        @ExcludeMissing
        fun _expiresAfterDays(): JsonField<Int> = expiresAfterDays

        /**
         * Returns the raw JSON value of [lowBalanceThresholdPercent].
         *
         * Unlike [lowBalanceThresholdPercent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("low_balance_threshold_percent")
        @ExcludeMissing
        fun _lowBalanceThresholdPercent(): JsonField<Int> = lowBalanceThresholdPercent

        /**
         * Returns the raw JSON value of [maxRolloverCount].
         *
         * Unlike [maxRolloverCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_rollover_count")
        @ExcludeMissing
        fun _maxRolloverCount(): JsonField<Int> = maxRolloverCount

        /**
         * Returns the raw JSON value of [overageLimit].
         *
         * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_limit")
        @ExcludeMissing
        fun _overageLimit(): JsonField<String> = overageLimit

        /**
         * Returns the raw JSON value of [pricePerUnit].
         *
         * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        fun _pricePerUnit(): JsonField<String> = pricePerUnit

        /**
         * Returns the raw JSON value of [rolloverPercentage].
         *
         * Unlike [rolloverPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_percentage")
        @ExcludeMissing
        fun _rolloverPercentage(): JsonField<Int> = rolloverPercentage

        /**
         * Returns the raw JSON value of [rolloverTimeframeCount].
         *
         * Unlike [rolloverTimeframeCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_timeframe_count")
        @ExcludeMissing
        fun _rolloverTimeframeCount(): JsonField<Int> = rolloverTimeframeCount

        /**
         * Returns the raw JSON value of [rolloverTimeframeInterval].
         *
         * Unlike [rolloverTimeframeInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_timeframe_interval")
        @ExcludeMissing
        fun _rolloverTimeframeInterval(): JsonField<TimeInterval> = rolloverTimeframeInterval

        /**
         * Returns the raw JSON value of [trialCredits].
         *
         * Unlike [trialCredits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_credits")
        @ExcludeMissing
        fun _trialCredits(): JsonField<String> = trialCredits

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
             * Returns a mutable builder for constructing an instance of [CreditEntitlement].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .creditEntitlementId()
             * .creditEntitlementName()
             * .creditEntitlementUnit()
             * .creditsAmount()
             * .creditsReduceOverage()
             * .overageChargeAtBilling()
             * .overageEnabled()
             * .preserveOverageAtReset()
             * .prorationBehavior()
             * .rolloverEnabled()
             * .trialCreditsExpireAfterTrial()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreditEntitlement]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var creditEntitlementId: JsonField<String>? = null
            private var creditEntitlementName: JsonField<String>? = null
            private var creditEntitlementUnit: JsonField<String>? = null
            private var creditsAmount: JsonField<String>? = null
            private var creditsReduceOverage: JsonField<Boolean>? = null
            private var overageChargeAtBilling: JsonField<Boolean>? = null
            private var overageEnabled: JsonField<Boolean>? = null
            private var preserveOverageAtReset: JsonField<Boolean>? = null
            private var prorationBehavior: JsonField<ProrationBehavior>? = null
            private var rolloverEnabled: JsonField<Boolean>? = null
            private var trialCreditsExpireAfterTrial: JsonField<Boolean>? = null
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var expiresAfterDays: JsonField<Int> = JsonMissing.of()
            private var lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of()
            private var maxRolloverCount: JsonField<Int> = JsonMissing.of()
            private var overageLimit: JsonField<String> = JsonMissing.of()
            private var pricePerUnit: JsonField<String> = JsonMissing.of()
            private var rolloverPercentage: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeCount: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of()
            private var trialCredits: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditEntitlement: CreditEntitlement) = apply {
                id = creditEntitlement.id
                creditEntitlementId = creditEntitlement.creditEntitlementId
                creditEntitlementName = creditEntitlement.creditEntitlementName
                creditEntitlementUnit = creditEntitlement.creditEntitlementUnit
                creditsAmount = creditEntitlement.creditsAmount
                creditsReduceOverage = creditEntitlement.creditsReduceOverage
                overageChargeAtBilling = creditEntitlement.overageChargeAtBilling
                overageEnabled = creditEntitlement.overageEnabled
                preserveOverageAtReset = creditEntitlement.preserveOverageAtReset
                prorationBehavior = creditEntitlement.prorationBehavior
                rolloverEnabled = creditEntitlement.rolloverEnabled
                trialCreditsExpireAfterTrial = creditEntitlement.trialCreditsExpireAfterTrial
                currency = creditEntitlement.currency
                expiresAfterDays = creditEntitlement.expiresAfterDays
                lowBalanceThresholdPercent = creditEntitlement.lowBalanceThresholdPercent
                maxRolloverCount = creditEntitlement.maxRolloverCount
                overageLimit = creditEntitlement.overageLimit
                pricePerUnit = creditEntitlement.pricePerUnit
                rolloverPercentage = creditEntitlement.rolloverPercentage
                rolloverTimeframeCount = creditEntitlement.rolloverTimeframeCount
                rolloverTimeframeInterval = creditEntitlement.rolloverTimeframeInterval
                trialCredits = creditEntitlement.trialCredits
                additionalProperties = creditEntitlement.additionalProperties.toMutableMap()
            }

            /** Unique ID of this mapping */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ID of the credit entitlement */
            fun creditEntitlementId(creditEntitlementId: String) =
                creditEntitlementId(JsonField.of(creditEntitlementId))

            /**
             * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                this.creditEntitlementId = creditEntitlementId
            }

            /** Name of the credit entitlement */
            fun creditEntitlementName(creditEntitlementName: String) =
                creditEntitlementName(JsonField.of(creditEntitlementName))

            /**
             * Sets [Builder.creditEntitlementName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementName(creditEntitlementName: JsonField<String>) = apply {
                this.creditEntitlementName = creditEntitlementName
            }

            /** Unit label for the credit entitlement */
            fun creditEntitlementUnit(creditEntitlementUnit: String) =
                creditEntitlementUnit(JsonField.of(creditEntitlementUnit))

            /**
             * Sets [Builder.creditEntitlementUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementUnit] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementUnit(creditEntitlementUnit: JsonField<String>) = apply {
                this.creditEntitlementUnit = creditEntitlementUnit
            }

            /** Number of credits granted */
            fun creditsAmount(creditsAmount: String) = creditsAmount(JsonField.of(creditsAmount))

            /**
             * Sets [Builder.creditsAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditsAmount(creditsAmount: JsonField<String>) = apply {
                this.creditsAmount = creditsAmount
            }

            /** Whether new credit grants reduce existing overage */
            fun creditsReduceOverage(creditsReduceOverage: Boolean) =
                creditsReduceOverage(JsonField.of(creditsReduceOverage))

            /**
             * Sets [Builder.creditsReduceOverage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsReduceOverage] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditsReduceOverage(creditsReduceOverage: JsonField<Boolean>) = apply {
                this.creditsReduceOverage = creditsReduceOverage
            }

            /** Whether overage is charged at billing */
            fun overageChargeAtBilling(overageChargeAtBilling: Boolean) =
                overageChargeAtBilling(JsonField.of(overageChargeAtBilling))

            /**
             * Sets [Builder.overageChargeAtBilling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageChargeAtBilling] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun overageChargeAtBilling(overageChargeAtBilling: JsonField<Boolean>) = apply {
                this.overageChargeAtBilling = overageChargeAtBilling
            }

            /** Whether overage is enabled */
            fun overageEnabled(overageEnabled: Boolean) =
                overageEnabled(JsonField.of(overageEnabled))

            /**
             * Sets [Builder.overageEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageEnabled(overageEnabled: JsonField<Boolean>) = apply {
                this.overageEnabled = overageEnabled
            }

            /** Whether to preserve overage balance when credits reset */
            fun preserveOverageAtReset(preserveOverageAtReset: Boolean) =
                preserveOverageAtReset(JsonField.of(preserveOverageAtReset))

            /**
             * Sets [Builder.preserveOverageAtReset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preserveOverageAtReset] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun preserveOverageAtReset(preserveOverageAtReset: JsonField<Boolean>) = apply {
                this.preserveOverageAtReset = preserveOverageAtReset
            }

            /** Proration behavior for credit grants during plan changes */
            fun prorationBehavior(prorationBehavior: ProrationBehavior) =
                prorationBehavior(JsonField.of(prorationBehavior))

            /**
             * Sets [Builder.prorationBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prorationBehavior] with a well-typed
             * [ProrationBehavior] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun prorationBehavior(prorationBehavior: JsonField<ProrationBehavior>) = apply {
                this.prorationBehavior = prorationBehavior
            }

            /** Whether rollover is enabled */
            fun rolloverEnabled(rolloverEnabled: Boolean) =
                rolloverEnabled(JsonField.of(rolloverEnabled))

            /**
             * Sets [Builder.rolloverEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverEnabled(rolloverEnabled: JsonField<Boolean>) = apply {
                this.rolloverEnabled = rolloverEnabled
            }

            /** Whether trial credits expire after trial */
            fun trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial: Boolean) =
                trialCreditsExpireAfterTrial(JsonField.of(trialCreditsExpireAfterTrial))

            /**
             * Sets [Builder.trialCreditsExpireAfterTrial] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialCreditsExpireAfterTrial] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial: JsonField<Boolean>) =
                apply {
                    this.trialCreditsExpireAfterTrial = trialCreditsExpireAfterTrial
                }

            /** Currency */
            fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Days until credits expire */
            fun expiresAfterDays(expiresAfterDays: Int?) =
                expiresAfterDays(JsonField.ofNullable(expiresAfterDays))

            /**
             * Alias for [Builder.expiresAfterDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun expiresAfterDays(expiresAfterDays: Int) = expiresAfterDays(expiresAfterDays as Int?)

            /**
             * Sets [Builder.expiresAfterDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAfterDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAfterDays(expiresAfterDays: JsonField<Int>) = apply {
                this.expiresAfterDays = expiresAfterDays
            }

            /** Low balance threshold percentage */
            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Int?) =
                lowBalanceThresholdPercent(JsonField.ofNullable(lowBalanceThresholdPercent))

            /**
             * Alias for [Builder.lowBalanceThresholdPercent].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Int) =
                lowBalanceThresholdPercent(lowBalanceThresholdPercent as Int?)

            /**
             * Sets [Builder.lowBalanceThresholdPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lowBalanceThresholdPercent] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: JsonField<Int>) = apply {
                this.lowBalanceThresholdPercent = lowBalanceThresholdPercent
            }

            /** Maximum rollover cycles */
            fun maxRolloverCount(maxRolloverCount: Int?) =
                maxRolloverCount(JsonField.ofNullable(maxRolloverCount))

            /**
             * Alias for [Builder.maxRolloverCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxRolloverCount(maxRolloverCount: Int) = maxRolloverCount(maxRolloverCount as Int?)

            /**
             * Sets [Builder.maxRolloverCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRolloverCount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRolloverCount(maxRolloverCount: JsonField<Int>) = apply {
                this.maxRolloverCount = maxRolloverCount
            }

            /** Overage limit */
            fun overageLimit(overageLimit: String?) =
                overageLimit(JsonField.ofNullable(overageLimit))

            /**
             * Sets [Builder.overageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageLimit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageLimit(overageLimit: JsonField<String>) = apply {
                this.overageLimit = overageLimit
            }

            /** Price per unit */
            fun pricePerUnit(pricePerUnit: String?) =
                pricePerUnit(JsonField.ofNullable(pricePerUnit))

            /**
             * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricePerUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
                this.pricePerUnit = pricePerUnit
            }

            /** Rollover percentage */
            fun rolloverPercentage(rolloverPercentage: Int?) =
                rolloverPercentage(JsonField.ofNullable(rolloverPercentage))

            /**
             * Alias for [Builder.rolloverPercentage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverPercentage(rolloverPercentage: Int) =
                rolloverPercentage(rolloverPercentage as Int?)

            /**
             * Sets [Builder.rolloverPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverPercentage] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverPercentage(rolloverPercentage: JsonField<Int>) = apply {
                this.rolloverPercentage = rolloverPercentage
            }

            /** Rollover timeframe count */
            fun rolloverTimeframeCount(rolloverTimeframeCount: Int?) =
                rolloverTimeframeCount(JsonField.ofNullable(rolloverTimeframeCount))

            /**
             * Alias for [Builder.rolloverTimeframeCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverTimeframeCount(rolloverTimeframeCount: Int) =
                rolloverTimeframeCount(rolloverTimeframeCount as Int?)

            /**
             * Sets [Builder.rolloverTimeframeCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverTimeframeCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rolloverTimeframeCount(rolloverTimeframeCount: JsonField<Int>) = apply {
                this.rolloverTimeframeCount = rolloverTimeframeCount
            }

            /** Rollover timeframe interval */
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: TimeInterval?) =
                rolloverTimeframeInterval(JsonField.ofNullable(rolloverTimeframeInterval))

            /**
             * Sets [Builder.rolloverTimeframeInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverTimeframeInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: JsonField<TimeInterval>) =
                apply {
                    this.rolloverTimeframeInterval = rolloverTimeframeInterval
                }

            /** Trial credits */
            fun trialCredits(trialCredits: String?) =
                trialCredits(JsonField.ofNullable(trialCredits))

            /**
             * Sets [Builder.trialCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialCredits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialCredits(trialCredits: JsonField<String>) = apply {
                this.trialCredits = trialCredits
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
             * Returns an immutable instance of [CreditEntitlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .creditEntitlementId()
             * .creditEntitlementName()
             * .creditEntitlementUnit()
             * .creditsAmount()
             * .creditsReduceOverage()
             * .overageChargeAtBilling()
             * .overageEnabled()
             * .preserveOverageAtReset()
             * .prorationBehavior()
             * .rolloverEnabled()
             * .trialCreditsExpireAfterTrial()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditEntitlement =
                CreditEntitlement(
                    checkRequired("id", id),
                    checkRequired("creditEntitlementId", creditEntitlementId),
                    checkRequired("creditEntitlementName", creditEntitlementName),
                    checkRequired("creditEntitlementUnit", creditEntitlementUnit),
                    checkRequired("creditsAmount", creditsAmount),
                    checkRequired("creditsReduceOverage", creditsReduceOverage),
                    checkRequired("overageChargeAtBilling", overageChargeAtBilling),
                    checkRequired("overageEnabled", overageEnabled),
                    checkRequired("preserveOverageAtReset", preserveOverageAtReset),
                    checkRequired("prorationBehavior", prorationBehavior),
                    checkRequired("rolloverEnabled", rolloverEnabled),
                    checkRequired("trialCreditsExpireAfterTrial", trialCreditsExpireAfterTrial),
                    currency,
                    expiresAfterDays,
                    lowBalanceThresholdPercent,
                    maxRolloverCount,
                    overageLimit,
                    pricePerUnit,
                    rolloverPercentage,
                    rolloverTimeframeCount,
                    rolloverTimeframeInterval,
                    trialCredits,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditEntitlement = apply {
            if (validated) {
                return@apply
            }

            id()
            creditEntitlementId()
            creditEntitlementName()
            creditEntitlementUnit()
            creditsAmount()
            creditsReduceOverage()
            overageChargeAtBilling()
            overageEnabled()
            preserveOverageAtReset()
            prorationBehavior().validate()
            rolloverEnabled()
            trialCreditsExpireAfterTrial()
            currency()?.validate()
            expiresAfterDays()
            lowBalanceThresholdPercent()
            maxRolloverCount()
            overageLimit()
            pricePerUnit()
            rolloverPercentage()
            rolloverTimeframeCount()
            rolloverTimeframeInterval()?.validate()
            trialCredits()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (creditEntitlementId.asKnown() == null) 0 else 1) +
                (if (creditEntitlementName.asKnown() == null) 0 else 1) +
                (if (creditEntitlementUnit.asKnown() == null) 0 else 1) +
                (if (creditsAmount.asKnown() == null) 0 else 1) +
                (if (creditsReduceOverage.asKnown() == null) 0 else 1) +
                (if (overageChargeAtBilling.asKnown() == null) 0 else 1) +
                (if (overageEnabled.asKnown() == null) 0 else 1) +
                (if (preserveOverageAtReset.asKnown() == null) 0 else 1) +
                (prorationBehavior.asKnown()?.validity() ?: 0) +
                (if (rolloverEnabled.asKnown() == null) 0 else 1) +
                (if (trialCreditsExpireAfterTrial.asKnown() == null) 0 else 1) +
                (currency.asKnown()?.validity() ?: 0) +
                (if (expiresAfterDays.asKnown() == null) 0 else 1) +
                (if (lowBalanceThresholdPercent.asKnown() == null) 0 else 1) +
                (if (maxRolloverCount.asKnown() == null) 0 else 1) +
                (if (overageLimit.asKnown() == null) 0 else 1) +
                (if (pricePerUnit.asKnown() == null) 0 else 1) +
                (if (rolloverPercentage.asKnown() == null) 0 else 1) +
                (if (rolloverTimeframeCount.asKnown() == null) 0 else 1) +
                (rolloverTimeframeInterval.asKnown()?.validity() ?: 0) +
                (if (trialCredits.asKnown() == null) 0 else 1)

        /** Proration behavior for credit grants during plan changes */
        class ProrationBehavior
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val PRORATE = of("prorate")

                val NO_PRORATE = of("no_prorate")

                fun of(value: String) = ProrationBehavior(JsonField.of(value))
            }

            /** An enum containing [ProrationBehavior]'s known values. */
            enum class Known {
                PRORATE,
                NO_PRORATE,
            }

            /**
             * An enum containing [ProrationBehavior]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ProrationBehavior] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PRORATE,
                NO_PRORATE,
                /**
                 * An enum member indicating that [ProrationBehavior] was instantiated with an
                 * unknown value.
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
                    PRORATE -> Value.PRORATE
                    NO_PRORATE -> Value.NO_PRORATE
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
                    PRORATE -> Known.PRORATE
                    NO_PRORATE -> Known.NO_PRORATE
                    else ->
                        throw DodoPaymentsInvalidDataException("Unknown ProrationBehavior: $value")
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

            fun validate(): ProrationBehavior = apply {
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

                return other is ProrationBehavior && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditEntitlement &&
                id == other.id &&
                creditEntitlementId == other.creditEntitlementId &&
                creditEntitlementName == other.creditEntitlementName &&
                creditEntitlementUnit == other.creditEntitlementUnit &&
                creditsAmount == other.creditsAmount &&
                creditsReduceOverage == other.creditsReduceOverage &&
                overageChargeAtBilling == other.overageChargeAtBilling &&
                overageEnabled == other.overageEnabled &&
                preserveOverageAtReset == other.preserveOverageAtReset &&
                prorationBehavior == other.prorationBehavior &&
                rolloverEnabled == other.rolloverEnabled &&
                trialCreditsExpireAfterTrial == other.trialCreditsExpireAfterTrial &&
                currency == other.currency &&
                expiresAfterDays == other.expiresAfterDays &&
                lowBalanceThresholdPercent == other.lowBalanceThresholdPercent &&
                maxRolloverCount == other.maxRolloverCount &&
                overageLimit == other.overageLimit &&
                pricePerUnit == other.pricePerUnit &&
                rolloverPercentage == other.rolloverPercentage &&
                rolloverTimeframeCount == other.rolloverTimeframeCount &&
                rolloverTimeframeInterval == other.rolloverTimeframeInterval &&
                trialCredits == other.trialCredits &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                creditEntitlementId,
                creditEntitlementName,
                creditEntitlementUnit,
                creditsAmount,
                creditsReduceOverage,
                overageChargeAtBilling,
                overageEnabled,
                preserveOverageAtReset,
                prorationBehavior,
                rolloverEnabled,
                trialCreditsExpireAfterTrial,
                currency,
                expiresAfterDays,
                lowBalanceThresholdPercent,
                maxRolloverCount,
                overageLimit,
                pricePerUnit,
                rolloverPercentage,
                rolloverTimeframeCount,
                rolloverTimeframeInterval,
                trialCredits,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditEntitlement{id=$id, creditEntitlementId=$creditEntitlementId, creditEntitlementName=$creditEntitlementName, creditEntitlementUnit=$creditEntitlementUnit, creditsAmount=$creditsAmount, creditsReduceOverage=$creditsReduceOverage, overageChargeAtBilling=$overageChargeAtBilling, overageEnabled=$overageEnabled, preserveOverageAtReset=$preserveOverageAtReset, prorationBehavior=$prorationBehavior, rolloverEnabled=$rolloverEnabled, trialCreditsExpireAfterTrial=$trialCreditsExpireAfterTrial, currency=$currency, expiresAfterDays=$expiresAfterDays, lowBalanceThresholdPercent=$lowBalanceThresholdPercent, maxRolloverCount=$maxRolloverCount, overageLimit=$overageLimit, pricePerUnit=$pricePerUnit, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, trialCredits=$trialCredits, additionalProperties=$additionalProperties}"
    }

    /** Additional custom data associated with the product */
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

    class DigitalProductDelivery
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val externalUrl: JsonField<String>,
        private val files: JsonField<List<File>>,
        private val instructions: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_url")
            @ExcludeMissing
            externalUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("files") @ExcludeMissing files: JsonField<List<File>> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
        ) : this(externalUrl, files, instructions, mutableMapOf())

        /**
         * External URL to digital product
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun externalUrl(): String? = externalUrl.getNullable("external_url")

        /**
         * Uploaded files ids of digital product
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun files(): List<File>? = files.getNullable("files")

        /**
         * Instructions to download and use the digital product
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun instructions(): String? = instructions.getNullable("instructions")

        /**
         * Returns the raw JSON value of [externalUrl].
         *
         * Unlike [externalUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_url")
        @ExcludeMissing
        fun _externalUrl(): JsonField<String> = externalUrl

        /**
         * Returns the raw JSON value of [files].
         *
         * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<List<File>> = files

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

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
             * Returns a mutable builder for constructing an instance of [DigitalProductDelivery].
             */
            fun builder() = Builder()
        }

        /** A builder for [DigitalProductDelivery]. */
        class Builder internal constructor() {

            private var externalUrl: JsonField<String> = JsonMissing.of()
            private var files: JsonField<MutableList<File>>? = null
            private var instructions: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(digitalProductDelivery: DigitalProductDelivery) = apply {
                externalUrl = digitalProductDelivery.externalUrl
                files = digitalProductDelivery.files.map { it.toMutableList() }
                instructions = digitalProductDelivery.instructions
                additionalProperties = digitalProductDelivery.additionalProperties.toMutableMap()
            }

            /** External URL to digital product */
            fun externalUrl(externalUrl: String?) = externalUrl(JsonField.ofNullable(externalUrl))

            /**
             * Sets [Builder.externalUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalUrl(externalUrl: JsonField<String>) = apply {
                this.externalUrl = externalUrl
            }

            /** Uploaded files ids of digital product */
            fun files(files: List<File>?) = files(JsonField.ofNullable(files))

            /**
             * Sets [Builder.files] to an arbitrary JSON value.
             *
             * You should usually call [Builder.files] with a well-typed `List<File>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun files(files: JsonField<List<File>>) = apply {
                this.files = files.map { it.toMutableList() }
            }

            /**
             * Adds a single [File] to [files].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFile(file: File) = apply {
                files =
                    (files ?: JsonField.of(mutableListOf())).also {
                        checkKnown("files", it).add(file)
                    }
            }

            /** Instructions to download and use the digital product */
            fun instructions(instructions: String?) =
                instructions(JsonField.ofNullable(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
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
             * Returns an immutable instance of [DigitalProductDelivery].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DigitalProductDelivery =
                DigitalProductDelivery(
                    externalUrl,
                    (files ?: JsonMissing.of()).map { it.toImmutable() },
                    instructions,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DigitalProductDelivery = apply {
            if (validated) {
                return@apply
            }

            externalUrl()
            files()?.forEach { it.validate() }
            instructions()
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
            (if (externalUrl.asKnown() == null) 0 else 1) +
                (files.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (instructions.asKnown() == null) 0 else 1)

        class File
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val fileId: JsonField<String>,
            private val fileName: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("file_id")
                @ExcludeMissing
                fileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("file_name")
                @ExcludeMissing
                fileName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(fileId, fileName, url, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fileId(): String = fileId.getRequired("file_id")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fileName(): String = fileName.getRequired("file_name")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Returns the raw JSON value of [fileId].
             *
             * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

            /**
             * Returns the raw JSON value of [fileName].
             *
             * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("file_name") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
                 * Returns a mutable builder for constructing an instance of [File].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .fileId()
                 * .fileName()
                 * .url()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [File]. */
            class Builder internal constructor() {

                private var fileId: JsonField<String>? = null
                private var fileName: JsonField<String>? = null
                private var url: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(file: File) = apply {
                    fileId = file.fileId
                    fileName = file.fileName
                    url = file.url
                    additionalProperties = file.additionalProperties.toMutableMap()
                }

                fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                /**
                 * Sets [Builder.fileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fileId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                fun fileName(fileName: String) = fileName(JsonField.of(fileName))

                /**
                 * Sets [Builder.fileName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fileName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [File].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .fileId()
                 * .fileName()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): File =
                    File(
                        checkRequired("fileId", fileId),
                        checkRequired("fileName", fileName),
                        checkRequired("url", url),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): File = apply {
                if (validated) {
                    return@apply
                }

                fileId()
                fileName()
                url()
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
                (if (fileId.asKnown() == null) 0 else 1) +
                    (if (fileName.asKnown() == null) 0 else 1) +
                    (if (url.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is File &&
                    fileId == other.fileId &&
                    fileName == other.fileName &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(fileId, fileName, url, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "File{fileId=$fileId, fileName=$fileName, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalProductDelivery &&
                externalUrl == other.externalUrl &&
                files == other.files &&
                instructions == other.instructions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(externalUrl, files, instructions, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalProductDelivery{externalUrl=$externalUrl, files=$files, instructions=$instructions, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Product &&
            brandId == other.brandId &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            creditEntitlements == other.creditEntitlements &&
            isRecurring == other.isRecurring &&
            licenseKeyEnabled == other.licenseKeyEnabled &&
            metadata == other.metadata &&
            price == other.price &&
            productId == other.productId &&
            taxCategory == other.taxCategory &&
            updatedAt == other.updatedAt &&
            addons == other.addons &&
            description == other.description &&
            digitalProductDelivery == other.digitalProductDelivery &&
            image == other.image &&
            licenseKeyActivationMessage == other.licenseKeyActivationMessage &&
            licenseKeyActivationsLimit == other.licenseKeyActivationsLimit &&
            licenseKeyDuration == other.licenseKeyDuration &&
            name == other.name &&
            productCollectionId == other.productCollectionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            brandId,
            businessId,
            createdAt,
            creditEntitlements,
            isRecurring,
            licenseKeyEnabled,
            metadata,
            price,
            productId,
            taxCategory,
            updatedAt,
            addons,
            description,
            digitalProductDelivery,
            image,
            licenseKeyActivationMessage,
            licenseKeyActivationsLimit,
            licenseKeyDuration,
            name,
            productCollectionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Product{brandId=$brandId, businessId=$businessId, createdAt=$createdAt, creditEntitlements=$creditEntitlements, isRecurring=$isRecurring, licenseKeyEnabled=$licenseKeyEnabled, metadata=$metadata, price=$price, productId=$productId, taxCategory=$taxCategory, updatedAt=$updatedAt, addons=$addons, description=$description, digitalProductDelivery=$digitalProductDelivery, image=$image, licenseKeyActivationMessage=$licenseKeyActivationMessage, licenseKeyActivationsLimit=$licenseKeyActivationsLimit, licenseKeyDuration=$licenseKeyDuration, name=$name, productCollectionId=$productCollectionId, additionalProperties=$additionalProperties}"
}
