// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.TaxCategory
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
    private val creditEntitlements: JsonField<List<CreditEntitlementMappingResponse>>,
    private val entitlements: JsonField<List<ProductEntitlementSummary>>,
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
        creditEntitlements: JsonField<List<CreditEntitlementMappingResponse>> = JsonMissing.of(),
        @JsonProperty("entitlements")
        @ExcludeMissing
        entitlements: JsonField<List<ProductEntitlementSummary>> = JsonMissing.of(),
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
        entitlements,
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
    fun creditEntitlements(): List<CreditEntitlementMappingResponse> =
        creditEntitlements.getRequired("credit_entitlements")

    /**
     * Attached entitlements (integration-based access grants)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlements(): List<ProductEntitlementSummary> = entitlements.getRequired("entitlements")

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
    @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
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
     * Digital-product-delivery payload, present on grants for `digital_files` entitlements. Each
     * file carries a short-lived presigned download URL.
     *
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
    @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
    fun licenseKeyActivationMessage(): String? =
        licenseKeyActivationMessage.getNullable("license_key_activation_message")

    /**
     * Limit on the number of activations for the license key, if enabled.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
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
    fun _creditEntitlements(): JsonField<List<CreditEntitlementMappingResponse>> =
        creditEntitlements

    /**
     * Returns the raw JSON value of [entitlements].
     *
     * Unlike [entitlements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entitlements")
    @ExcludeMissing
    fun _entitlements(): JsonField<List<ProductEntitlementSummary>> = entitlements

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
    @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
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
    @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
    @JsonProperty("license_key_activation_message")
    @ExcludeMissing
    fun _licenseKeyActivationMessage(): JsonField<String> = licenseKeyActivationMessage

    /**
     * Returns the raw JSON value of [licenseKeyActivationsLimit].
     *
     * Unlike [licenseKeyActivationsLimit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
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
         * .entitlements()
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
        private var creditEntitlements: JsonField<MutableList<CreditEntitlementMappingResponse>>? =
            null
        private var entitlements: JsonField<MutableList<ProductEntitlementSummary>>? = null
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
            entitlements = product.entitlements.map { it.toMutableList() }
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
        fun creditEntitlements(creditEntitlements: List<CreditEntitlementMappingResponse>) =
            creditEntitlements(JsonField.of(creditEntitlements))

        /**
         * Sets [Builder.creditEntitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlements] with a well-typed
         * `List<CreditEntitlementMappingResponse>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun creditEntitlements(
            creditEntitlements: JsonField<List<CreditEntitlementMappingResponse>>
        ) = apply { this.creditEntitlements = creditEntitlements.map { it.toMutableList() } }

        /**
         * Adds a single [CreditEntitlementMappingResponse] to [creditEntitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditEntitlement(creditEntitlement: CreditEntitlementMappingResponse) = apply {
            creditEntitlements =
                (creditEntitlements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditEntitlements", it).add(creditEntitlement)
                }
        }

        /** Attached entitlements (integration-based access grants) */
        fun entitlements(entitlements: List<ProductEntitlementSummary>) =
            entitlements(JsonField.of(entitlements))

        /**
         * Sets [Builder.entitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlements] with a well-typed
         * `List<ProductEntitlementSummary>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun entitlements(entitlements: JsonField<List<ProductEntitlementSummary>>) = apply {
            this.entitlements = entitlements.map { it.toMutableList() }
        }

        /**
         * Adds a single [ProductEntitlementSummary] to [entitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntitlement(entitlement: ProductEntitlementSummary) = apply {
            entitlements =
                (entitlements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entitlements", it).add(entitlement)
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
        @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
        fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
            licenseKeyEnabled(JsonField.of(licenseKeyEnabled))

        /**
         * Sets [Builder.licenseKeyEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
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

        /**
         * Digital-product-delivery payload, present on grants for `digital_files` entitlements.
         * Each file carries a short-lived presigned download URL.
         */
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
        @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: String?) =
            licenseKeyActivationMessage(JsonField.ofNullable(licenseKeyActivationMessage))

        /**
         * Sets [Builder.licenseKeyActivationMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationMessage] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: JsonField<String>) = apply {
            this.licenseKeyActivationMessage = licenseKeyActivationMessage
        }

        /** Limit on the number of activations for the license key, if enabled. */
        @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Int?) =
            licenseKeyActivationsLimit(JsonField.ofNullable(licenseKeyActivationsLimit))

        /**
         * Alias for [Builder.licenseKeyActivationsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Int) =
            licenseKeyActivationsLimit(licenseKeyActivationsLimit as Int?)

        /**
         * Sets [Builder.licenseKeyActivationsLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationsLimit] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("Use the dedicated entitlements API to configure license-key delivery.")
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
         * .entitlements()
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
                checkRequired("entitlements", entitlements).map { it.toImmutable() },
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Product = apply {
        if (validated) {
            return@apply
        }

        brandId()
        businessId()
        createdAt()
        creditEntitlements().forEach { it.validate() }
        entitlements().forEach { it.validate() }
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
            (entitlements.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

        return other is Product &&
            brandId == other.brandId &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            creditEntitlements == other.creditEntitlements &&
            entitlements == other.entitlements &&
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
            entitlements,
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
        "Product{brandId=$brandId, businessId=$businessId, createdAt=$createdAt, creditEntitlements=$creditEntitlements, entitlements=$entitlements, isRecurring=$isRecurring, licenseKeyEnabled=$licenseKeyEnabled, metadata=$metadata, price=$price, productId=$productId, taxCategory=$taxCategory, updatedAt=$updatedAt, addons=$addons, description=$description, digitalProductDelivery=$digitalProductDelivery, image=$image, licenseKeyActivationMessage=$licenseKeyActivationMessage, licenseKeyActivationsLimit=$licenseKeyActivationsLimit, licenseKeyDuration=$licenseKeyDuration, name=$name, productCollectionId=$productCollectionId, additionalProperties=$additionalProperties}"
}
