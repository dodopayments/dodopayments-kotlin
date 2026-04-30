// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
    private val entitlements: JsonField<List<Entitlement>>,
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
        entitlements: JsonField<List<Entitlement>> = JsonMissing.of(),
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
    fun entitlements(): List<Entitlement> = entitlements.getRequired("entitlements")

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
    @Deprecated("deprecated")
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
     * Digital-product-delivery payload for a grant. Populated for grants whose entitlement has
     * `integration_type = 'digital_files'`. `files` carries presigned download URLs; the source (EE
     * service or legacy in-process S3 presigning) is opaque to the caller.
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
    @Deprecated("deprecated")
    fun licenseKeyActivationMessage(): String? =
        licenseKeyActivationMessage.getNullable("license_key_activation_message")

    /**
     * Limit on the number of activations for the license key, if enabled.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
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
    fun _entitlements(): JsonField<List<Entitlement>> = entitlements

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
    @Deprecated("deprecated")
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
    @Deprecated("deprecated")
    @JsonProperty("license_key_activation_message")
    @ExcludeMissing
    fun _licenseKeyActivationMessage(): JsonField<String> = licenseKeyActivationMessage

    /**
     * Returns the raw JSON value of [licenseKeyActivationsLimit].
     *
     * Unlike [licenseKeyActivationsLimit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
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
        private var entitlements: JsonField<MutableList<Entitlement>>? = null
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
        fun entitlements(entitlements: List<Entitlement>) = entitlements(JsonField.of(entitlements))

        /**
         * Sets [Builder.entitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlements] with a well-typed `List<Entitlement>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun entitlements(entitlements: JsonField<List<Entitlement>>) = apply {
            this.entitlements = entitlements.map { it.toMutableList() }
        }

        /**
         * Adds a single [Entitlement] to [entitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntitlement(entitlement: Entitlement) = apply {
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
        @Deprecated("deprecated")
        fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
            licenseKeyEnabled(JsonField.of(licenseKeyEnabled))

        /**
         * Sets [Builder.licenseKeyEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
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
         * Digital-product-delivery payload for a grant. Populated for grants whose entitlement has
         * `integration_type = 'digital_files'`. `files` carries presigned download URLs; the source
         * (EE service or legacy in-process S3 presigning) is opaque to the caller.
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
        @Deprecated("deprecated")
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: String?) =
            licenseKeyActivationMessage(JsonField.ofNullable(licenseKeyActivationMessage))

        /**
         * Sets [Builder.licenseKeyActivationMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationMessage] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: JsonField<String>) = apply {
            this.licenseKeyActivationMessage = licenseKeyActivationMessage
        }

        /** Limit on the number of activations for the license key, if enabled. */
        @Deprecated("deprecated")
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Int?) =
            licenseKeyActivationsLimit(JsonField.ofNullable(licenseKeyActivationsLimit))

        /**
         * Alias for [Builder.licenseKeyActivationsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Int) =
            licenseKeyActivationsLimit(licenseKeyActivationsLimit as Int?)

        /**
         * Sets [Builder.licenseKeyActivationsLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationsLimit] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
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

    /**
     * Summary of an entitlement attached to a product.
     *
     * `integration_config` uses [`IntegrationConfigResponse`] (NOT the persisted
     * [`IntegrationConfig`]) so digital_files entitlements embed the resolved `digital_files`
     * object — matching what `GET /entitlements/{id}` returns. All other variants pass through
     * unchanged via `#[serde(untagged)]`.
     */
    class Entitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val integrationConfig: JsonField<IntegrationConfig>,
        private val integrationType: JsonField<IntegrationType>,
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integration_config")
            @ExcludeMissing
            integrationConfig: JsonField<IntegrationConfig> = JsonMissing.of(),
            @JsonProperty("integration_type")
            @ExcludeMissing
            integrationType: JsonField<IntegrationType> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(id, integrationConfig, integrationType, name, description, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Public-facing variant of [`IntegrationConfig`]. Mirrors every variant shape on the wire
         * EXCEPT `DigitalFiles`, which is replaced with a hydrated `digital_files` object (resolved
         * download URLs etc.). The persisted JSONB stays ID-only via [`IntegrationConfig`]; this
         * enum is response-only.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationConfig(): IntegrationConfig =
            integrationConfig.getRequired("integration_config")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationType(): IntegrationType = integrationType.getRequired("integration_type")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [integrationConfig].
         *
         * Unlike [integrationConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integration_config")
        @ExcludeMissing
        fun _integrationConfig(): JsonField<IntegrationConfig> = integrationConfig

        /**
         * Returns the raw JSON value of [integrationType].
         *
         * Unlike [integrationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integration_type")
        @ExcludeMissing
        fun _integrationType(): JsonField<IntegrationType> = integrationType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
             * Returns a mutable builder for constructing an instance of [Entitlement].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .integrationConfig()
             * .integrationType()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Entitlement]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var integrationConfig: JsonField<IntegrationConfig>? = null
            private var integrationType: JsonField<IntegrationType>? = null
            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(entitlement: Entitlement) = apply {
                id = entitlement.id
                integrationConfig = entitlement.integrationConfig
                integrationType = entitlement.integrationType
                name = entitlement.name
                description = entitlement.description
                additionalProperties = entitlement.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Public-facing variant of [`IntegrationConfig`]. Mirrors every variant shape on the
             * wire EXCEPT `DigitalFiles`, which is replaced with a hydrated `digital_files` object
             * (resolved download URLs etc.). The persisted JSONB stays ID-only via
             * [`IntegrationConfig`]; this enum is response-only.
             */
            fun integrationConfig(integrationConfig: IntegrationConfig) =
                integrationConfig(JsonField.of(integrationConfig))

            /**
             * Sets [Builder.integrationConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationConfig] with a well-typed
             * [IntegrationConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun integrationConfig(integrationConfig: JsonField<IntegrationConfig>) = apply {
                this.integrationConfig = integrationConfig
            }

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofGitHub(github)`. */
            fun integrationConfig(github: IntegrationConfig.GitHubConfig) =
                integrationConfig(IntegrationConfig.ofGitHub(github))

            /**
             * Alias for calling [integrationConfig] with `IntegrationConfig.ofDiscord(discord)`.
             */
            fun integrationConfig(discord: IntegrationConfig.DiscordConfig) =
                integrationConfig(IntegrationConfig.ofDiscord(discord))

            /**
             * Alias for calling [integrationConfig] with `IntegrationConfig.ofTelegram(telegram)`.
             */
            fun integrationConfig(telegram: IntegrationConfig.TelegramConfig) =
                integrationConfig(IntegrationConfig.ofTelegram(telegram))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofFigma(figma)`. */
            fun integrationConfig(figma: IntegrationConfig.FigmaConfig) =
                integrationConfig(IntegrationConfig.ofFigma(figma))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofFramer(framer)`. */
            fun integrationConfig(framer: IntegrationConfig.FramerConfig) =
                integrationConfig(IntegrationConfig.ofFramer(framer))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofNotion(notion)`. */
            fun integrationConfig(notion: IntegrationConfig.NotionConfig) =
                integrationConfig(IntegrationConfig.ofNotion(notion))

            /**
             * Alias for calling [integrationConfig] with
             * `IntegrationConfig.ofDigitalFiles(digitalFiles)`.
             */
            fun integrationConfig(digitalFiles: IntegrationConfig.DigitalFilesConfig) =
                integrationConfig(IntegrationConfig.ofDigitalFiles(digitalFiles))

            /**
             * Alias for calling [integrationConfig] with
             * `IntegrationConfig.ofLicenseKey(licenseKey)`.
             */
            fun integrationConfig(licenseKey: IntegrationConfig.LicenseKeyConfig) =
                integrationConfig(IntegrationConfig.ofLicenseKey(licenseKey))

            fun integrationType(integrationType: IntegrationType) =
                integrationType(JsonField.of(integrationType))

            /**
             * Sets [Builder.integrationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationType] with a well-typed [IntegrationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun integrationType(integrationType: JsonField<IntegrationType>) = apply {
                this.integrationType = integrationType
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
             * Returns an immutable instance of [Entitlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .integrationConfig()
             * .integrationType()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Entitlement =
                Entitlement(
                    checkRequired("id", id),
                    checkRequired("integrationConfig", integrationConfig),
                    checkRequired("integrationType", integrationType),
                    checkRequired("name", name),
                    description,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Entitlement = apply {
            if (validated) {
                return@apply
            }

            id()
            integrationConfig().validate()
            integrationType().validate()
            name()
            description()
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
                (integrationConfig.asKnown()?.validity() ?: 0) +
                (integrationType.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1)

        /**
         * Public-facing variant of [`IntegrationConfig`]. Mirrors every variant shape on the wire
         * EXCEPT `DigitalFiles`, which is replaced with a hydrated `digital_files` object (resolved
         * download URLs etc.). The persisted JSONB stays ID-only via [`IntegrationConfig`]; this
         * enum is response-only.
         */
        @JsonDeserialize(using = IntegrationConfig.Deserializer::class)
        @JsonSerialize(using = IntegrationConfig.Serializer::class)
        class IntegrationConfig
        private constructor(
            private val github: GitHubConfig? = null,
            private val discord: DiscordConfig? = null,
            private val telegram: TelegramConfig? = null,
            private val figma: FigmaConfig? = null,
            private val framer: FramerConfig? = null,
            private val notion: NotionConfig? = null,
            private val digitalFiles: DigitalFilesConfig? = null,
            private val licenseKey: LicenseKeyConfig? = null,
            private val _json: JsonValue? = null,
        ) {

            fun github(): GitHubConfig? = github

            fun discord(): DiscordConfig? = discord

            fun telegram(): TelegramConfig? = telegram

            fun figma(): FigmaConfig? = figma

            fun framer(): FramerConfig? = framer

            fun notion(): NotionConfig? = notion

            fun digitalFiles(): DigitalFilesConfig? = digitalFiles

            fun licenseKey(): LicenseKeyConfig? = licenseKey

            fun isGitHub(): Boolean = github != null

            fun isDiscord(): Boolean = discord != null

            fun isTelegram(): Boolean = telegram != null

            fun isFigma(): Boolean = figma != null

            fun isFramer(): Boolean = framer != null

            fun isNotion(): Boolean = notion != null

            fun isDigitalFiles(): Boolean = digitalFiles != null

            fun isLicenseKey(): Boolean = licenseKey != null

            fun asGitHub(): GitHubConfig = github.getOrThrow("github")

            fun asDiscord(): DiscordConfig = discord.getOrThrow("discord")

            fun asTelegram(): TelegramConfig = telegram.getOrThrow("telegram")

            fun asFigma(): FigmaConfig = figma.getOrThrow("figma")

            fun asFramer(): FramerConfig = framer.getOrThrow("framer")

            fun asNotion(): NotionConfig = notion.getOrThrow("notion")

            fun asDigitalFiles(): DigitalFilesConfig = digitalFiles.getOrThrow("digitalFiles")

            fun asLicenseKey(): LicenseKeyConfig = licenseKey.getOrThrow("licenseKey")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    github != null -> visitor.visitGitHub(github)
                    discord != null -> visitor.visitDiscord(discord)
                    telegram != null -> visitor.visitTelegram(telegram)
                    figma != null -> visitor.visitFigma(figma)
                    framer != null -> visitor.visitFramer(framer)
                    notion != null -> visitor.visitNotion(notion)
                    digitalFiles != null -> visitor.visitDigitalFiles(digitalFiles)
                    licenseKey != null -> visitor.visitLicenseKey(licenseKey)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): IntegrationConfig = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitGitHub(github: GitHubConfig) {
                            github.validate()
                        }

                        override fun visitDiscord(discord: DiscordConfig) {
                            discord.validate()
                        }

                        override fun visitTelegram(telegram: TelegramConfig) {
                            telegram.validate()
                        }

                        override fun visitFigma(figma: FigmaConfig) {
                            figma.validate()
                        }

                        override fun visitFramer(framer: FramerConfig) {
                            framer.validate()
                        }

                        override fun visitNotion(notion: NotionConfig) {
                            notion.validate()
                        }

                        override fun visitDigitalFiles(digitalFiles: DigitalFilesConfig) {
                            digitalFiles.validate()
                        }

                        override fun visitLicenseKey(licenseKey: LicenseKeyConfig) {
                            licenseKey.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitGitHub(github: GitHubConfig) = github.validity()

                        override fun visitDiscord(discord: DiscordConfig) = discord.validity()

                        override fun visitTelegram(telegram: TelegramConfig) = telegram.validity()

                        override fun visitFigma(figma: FigmaConfig) = figma.validity()

                        override fun visitFramer(framer: FramerConfig) = framer.validity()

                        override fun visitNotion(notion: NotionConfig) = notion.validity()

                        override fun visitDigitalFiles(digitalFiles: DigitalFilesConfig) =
                            digitalFiles.validity()

                        override fun visitLicenseKey(licenseKey: LicenseKeyConfig) =
                            licenseKey.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is IntegrationConfig &&
                    github == other.github &&
                    discord == other.discord &&
                    telegram == other.telegram &&
                    figma == other.figma &&
                    framer == other.framer &&
                    notion == other.notion &&
                    digitalFiles == other.digitalFiles &&
                    licenseKey == other.licenseKey
            }

            override fun hashCode(): Int =
                Objects.hash(
                    github,
                    discord,
                    telegram,
                    figma,
                    framer,
                    notion,
                    digitalFiles,
                    licenseKey,
                )

            override fun toString(): String =
                when {
                    github != null -> "IntegrationConfig{github=$github}"
                    discord != null -> "IntegrationConfig{discord=$discord}"
                    telegram != null -> "IntegrationConfig{telegram=$telegram}"
                    figma != null -> "IntegrationConfig{figma=$figma}"
                    framer != null -> "IntegrationConfig{framer=$framer}"
                    notion != null -> "IntegrationConfig{notion=$notion}"
                    digitalFiles != null -> "IntegrationConfig{digitalFiles=$digitalFiles}"
                    licenseKey != null -> "IntegrationConfig{licenseKey=$licenseKey}"
                    _json != null -> "IntegrationConfig{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid IntegrationConfig")
                }

            companion object {

                fun ofGitHub(github: GitHubConfig) = IntegrationConfig(github = github)

                fun ofDiscord(discord: DiscordConfig) = IntegrationConfig(discord = discord)

                fun ofTelegram(telegram: TelegramConfig) = IntegrationConfig(telegram = telegram)

                fun ofFigma(figma: FigmaConfig) = IntegrationConfig(figma = figma)

                fun ofFramer(framer: FramerConfig) = IntegrationConfig(framer = framer)

                fun ofNotion(notion: NotionConfig) = IntegrationConfig(notion = notion)

                fun ofDigitalFiles(digitalFiles: DigitalFilesConfig) =
                    IntegrationConfig(digitalFiles = digitalFiles)

                fun ofLicenseKey(licenseKey: LicenseKeyConfig) =
                    IntegrationConfig(licenseKey = licenseKey)
            }

            /**
             * An interface that defines how to map each variant of [IntegrationConfig] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitGitHub(github: GitHubConfig): T

                fun visitDiscord(discord: DiscordConfig): T

                fun visitTelegram(telegram: TelegramConfig): T

                fun visitFigma(figma: FigmaConfig): T

                fun visitFramer(framer: FramerConfig): T

                fun visitNotion(notion: NotionConfig): T

                fun visitDigitalFiles(digitalFiles: DigitalFilesConfig): T

                fun visitLicenseKey(licenseKey: LicenseKeyConfig): T

                /**
                 * Maps an unknown variant of [IntegrationConfig] to a value of type [T].
                 *
                 * An instance of [IntegrationConfig] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws DodoPaymentsInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw DodoPaymentsInvalidDataException("Unknown IntegrationConfig: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<IntegrationConfig>(IntegrationConfig::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): IntegrationConfig {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<GitHubConfig>())?.let {
                                    IntegrationConfig(github = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<DiscordConfig>())?.let {
                                    IntegrationConfig(discord = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<TelegramConfig>())?.let {
                                    IntegrationConfig(telegram = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<FigmaConfig>())?.let {
                                    IntegrationConfig(figma = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<FramerConfig>())?.let {
                                    IntegrationConfig(framer = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<NotionConfig>())?.let {
                                    IntegrationConfig(notion = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<DigitalFilesConfig>())?.let {
                                    IntegrationConfig(digitalFiles = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<LicenseKeyConfig>())?.let {
                                    IntegrationConfig(licenseKey = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> IntegrationConfig(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<IntegrationConfig>(IntegrationConfig::class) {

                override fun serialize(
                    value: IntegrationConfig,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.github != null -> generator.writeObject(value.github)
                        value.discord != null -> generator.writeObject(value.discord)
                        value.telegram != null -> generator.writeObject(value.telegram)
                        value.figma != null -> generator.writeObject(value.figma)
                        value.framer != null -> generator.writeObject(value.framer)
                        value.notion != null -> generator.writeObject(value.notion)
                        value.digitalFiles != null -> generator.writeObject(value.digitalFiles)
                        value.licenseKey != null -> generator.writeObject(value.licenseKey)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid IntegrationConfig")
                    }
                }
            }

            class GitHubConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val permission: JsonField<String>,
                private val targetId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("permission")
                    @ExcludeMissing
                    permission: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("target_id")
                    @ExcludeMissing
                    targetId: JsonField<String> = JsonMissing.of(),
                ) : this(permission, targetId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun permission(): String = permission.getRequired("permission")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun targetId(): String = targetId.getRequired("target_id")

                /**
                 * Returns the raw JSON value of [permission].
                 *
                 * Unlike [permission], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("permission")
                @ExcludeMissing
                fun _permission(): JsonField<String> = permission

                /**
                 * Returns the raw JSON value of [targetId].
                 *
                 * Unlike [targetId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("target_id")
                @ExcludeMissing
                fun _targetId(): JsonField<String> = targetId

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
                     * Returns a mutable builder for constructing an instance of [GitHubConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .permission()
                     * .targetId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [GitHubConfig]. */
                class Builder internal constructor() {

                    private var permission: JsonField<String>? = null
                    private var targetId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(githubConfig: GitHubConfig) = apply {
                        permission = githubConfig.permission
                        targetId = githubConfig.targetId
                        additionalProperties = githubConfig.additionalProperties.toMutableMap()
                    }

                    fun permission(permission: String) = permission(JsonField.of(permission))

                    /**
                     * Sets [Builder.permission] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.permission] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun permission(permission: JsonField<String>) = apply {
                        this.permission = permission
                    }

                    fun targetId(targetId: String) = targetId(JsonField.of(targetId))

                    /**
                     * Sets [Builder.targetId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.targetId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun targetId(targetId: JsonField<String>) = apply { this.targetId = targetId }

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
                     * Returns an immutable instance of [GitHubConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .permission()
                     * .targetId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GitHubConfig =
                        GitHubConfig(
                            checkRequired("permission", permission),
                            checkRequired("targetId", targetId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): GitHubConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    permission()
                    targetId()
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
                    (if (permission.asKnown() == null) 0 else 1) +
                        (if (targetId.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GitHubConfig &&
                        permission == other.permission &&
                        targetId == other.targetId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(permission, targetId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GitHubConfig{permission=$permission, targetId=$targetId, additionalProperties=$additionalProperties}"
            }

            class DiscordConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val guildId: JsonField<String>,
                private val roleId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("guild_id")
                    @ExcludeMissing
                    guildId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("role_id")
                    @ExcludeMissing
                    roleId: JsonField<String> = JsonMissing.of(),
                ) : this(guildId, roleId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun guildId(): String = guildId.getRequired("guild_id")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun roleId(): String? = roleId.getNullable("role_id")

                /**
                 * Returns the raw JSON value of [guildId].
                 *
                 * Unlike [guildId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("guild_id")
                @ExcludeMissing
                fun _guildId(): JsonField<String> = guildId

                /**
                 * Returns the raw JSON value of [roleId].
                 *
                 * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

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
                     * Returns a mutable builder for constructing an instance of [DiscordConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .guildId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [DiscordConfig]. */
                class Builder internal constructor() {

                    private var guildId: JsonField<String>? = null
                    private var roleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discordConfig: DiscordConfig) = apply {
                        guildId = discordConfig.guildId
                        roleId = discordConfig.roleId
                        additionalProperties = discordConfig.additionalProperties.toMutableMap()
                    }

                    fun guildId(guildId: String) = guildId(JsonField.of(guildId))

                    /**
                     * Sets [Builder.guildId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.guildId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun guildId(guildId: JsonField<String>) = apply { this.guildId = guildId }

                    fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

                    /**
                     * Sets [Builder.roleId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roleId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

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
                     * Returns an immutable instance of [DiscordConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .guildId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): DiscordConfig =
                        DiscordConfig(
                            checkRequired("guildId", guildId),
                            roleId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): DiscordConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    guildId()
                    roleId()
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
                    (if (guildId.asKnown() == null) 0 else 1) +
                        (if (roleId.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DiscordConfig &&
                        guildId == other.guildId &&
                        roleId == other.roleId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(guildId, roleId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DiscordConfig{guildId=$guildId, roleId=$roleId, additionalProperties=$additionalProperties}"
            }

            class TelegramConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val chatId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("chat_id")
                    @ExcludeMissing
                    chatId: JsonField<String> = JsonMissing.of()
                ) : this(chatId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun chatId(): String = chatId.getRequired("chat_id")

                /**
                 * Returns the raw JSON value of [chatId].
                 *
                 * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

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
                     * Returns a mutable builder for constructing an instance of [TelegramConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .chatId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [TelegramConfig]. */
                class Builder internal constructor() {

                    private var chatId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(telegramConfig: TelegramConfig) = apply {
                        chatId = telegramConfig.chatId
                        additionalProperties = telegramConfig.additionalProperties.toMutableMap()
                    }

                    fun chatId(chatId: String) = chatId(JsonField.of(chatId))

                    /**
                     * Sets [Builder.chatId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.chatId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

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
                     * Returns an immutable instance of [TelegramConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .chatId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TelegramConfig =
                        TelegramConfig(
                            checkRequired("chatId", chatId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TelegramConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    chatId()
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
                internal fun validity(): Int = (if (chatId.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TelegramConfig &&
                        chatId == other.chatId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(chatId, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TelegramConfig{chatId=$chatId, additionalProperties=$additionalProperties}"
            }

            class FigmaConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val figmaFileId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("figma_file_id")
                    @ExcludeMissing
                    figmaFileId: JsonField<String> = JsonMissing.of()
                ) : this(figmaFileId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun figmaFileId(): String = figmaFileId.getRequired("figma_file_id")

                /**
                 * Returns the raw JSON value of [figmaFileId].
                 *
                 * Unlike [figmaFileId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("figma_file_id")
                @ExcludeMissing
                fun _figmaFileId(): JsonField<String> = figmaFileId

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
                     * Returns a mutable builder for constructing an instance of [FigmaConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .figmaFileId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [FigmaConfig]. */
                class Builder internal constructor() {

                    private var figmaFileId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(figmaConfig: FigmaConfig) = apply {
                        figmaFileId = figmaConfig.figmaFileId
                        additionalProperties = figmaConfig.additionalProperties.toMutableMap()
                    }

                    fun figmaFileId(figmaFileId: String) = figmaFileId(JsonField.of(figmaFileId))

                    /**
                     * Sets [Builder.figmaFileId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.figmaFileId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun figmaFileId(figmaFileId: JsonField<String>) = apply {
                        this.figmaFileId = figmaFileId
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
                     * Returns an immutable instance of [FigmaConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .figmaFileId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FigmaConfig =
                        FigmaConfig(
                            checkRequired("figmaFileId", figmaFileId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FigmaConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    figmaFileId()
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
                internal fun validity(): Int = (if (figmaFileId.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FigmaConfig &&
                        figmaFileId == other.figmaFileId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(figmaFileId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FigmaConfig{figmaFileId=$figmaFileId, additionalProperties=$additionalProperties}"
            }

            class FramerConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val framerTemplateId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("framer_template_id")
                    @ExcludeMissing
                    framerTemplateId: JsonField<String> = JsonMissing.of()
                ) : this(framerTemplateId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun framerTemplateId(): String = framerTemplateId.getRequired("framer_template_id")

                /**
                 * Returns the raw JSON value of [framerTemplateId].
                 *
                 * Unlike [framerTemplateId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("framer_template_id")
                @ExcludeMissing
                fun _framerTemplateId(): JsonField<String> = framerTemplateId

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
                     * Returns a mutable builder for constructing an instance of [FramerConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .framerTemplateId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [FramerConfig]. */
                class Builder internal constructor() {

                    private var framerTemplateId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(framerConfig: FramerConfig) = apply {
                        framerTemplateId = framerConfig.framerTemplateId
                        additionalProperties = framerConfig.additionalProperties.toMutableMap()
                    }

                    fun framerTemplateId(framerTemplateId: String) =
                        framerTemplateId(JsonField.of(framerTemplateId))

                    /**
                     * Sets [Builder.framerTemplateId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.framerTemplateId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun framerTemplateId(framerTemplateId: JsonField<String>) = apply {
                        this.framerTemplateId = framerTemplateId
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
                     * Returns an immutable instance of [FramerConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .framerTemplateId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FramerConfig =
                        FramerConfig(
                            checkRequired("framerTemplateId", framerTemplateId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FramerConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    framerTemplateId()
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
                internal fun validity(): Int = (if (framerTemplateId.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FramerConfig &&
                        framerTemplateId == other.framerTemplateId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(framerTemplateId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FramerConfig{framerTemplateId=$framerTemplateId, additionalProperties=$additionalProperties}"
            }

            class NotionConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val notionTemplateId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("notion_template_id")
                    @ExcludeMissing
                    notionTemplateId: JsonField<String> = JsonMissing.of()
                ) : this(notionTemplateId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun notionTemplateId(): String = notionTemplateId.getRequired("notion_template_id")

                /**
                 * Returns the raw JSON value of [notionTemplateId].
                 *
                 * Unlike [notionTemplateId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("notion_template_id")
                @ExcludeMissing
                fun _notionTemplateId(): JsonField<String> = notionTemplateId

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
                     * Returns a mutable builder for constructing an instance of [NotionConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .notionTemplateId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [NotionConfig]. */
                class Builder internal constructor() {

                    private var notionTemplateId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(notionConfig: NotionConfig) = apply {
                        notionTemplateId = notionConfig.notionTemplateId
                        additionalProperties = notionConfig.additionalProperties.toMutableMap()
                    }

                    fun notionTemplateId(notionTemplateId: String) =
                        notionTemplateId(JsonField.of(notionTemplateId))

                    /**
                     * Sets [Builder.notionTemplateId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.notionTemplateId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun notionTemplateId(notionTemplateId: JsonField<String>) = apply {
                        this.notionTemplateId = notionTemplateId
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
                     * Returns an immutable instance of [NotionConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .notionTemplateId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): NotionConfig =
                        NotionConfig(
                            checkRequired("notionTemplateId", notionTemplateId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): NotionConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    notionTemplateId()
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
                internal fun validity(): Int = (if (notionTemplateId.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NotionConfig &&
                        notionTemplateId == other.notionTemplateId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(notionTemplateId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NotionConfig{notionTemplateId=$notionTemplateId, additionalProperties=$additionalProperties}"
            }

            class DigitalFilesConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val digitalFiles: JsonField<DigitalFiles>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("digital_files")
                    @ExcludeMissing
                    digitalFiles: JsonField<DigitalFiles> = JsonMissing.of()
                ) : this(digitalFiles, mutableMapOf())

                /**
                 * Populated digital-files payload for entitlement read surfaces. Mirrors
                 * `DigitalProductDelivery` but is sourced from an entitlement's
                 * `integration_config` (not a grant) and tags each file with its origin (`legacy`
                 * vs `ee`).
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun digitalFiles(): DigitalFiles = digitalFiles.getRequired("digital_files")

                /**
                 * Returns the raw JSON value of [digitalFiles].
                 *
                 * Unlike [digitalFiles], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("digital_files")
                @ExcludeMissing
                fun _digitalFiles(): JsonField<DigitalFiles> = digitalFiles

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
                     * Returns a mutable builder for constructing an instance of
                     * [DigitalFilesConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .digitalFiles()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [DigitalFilesConfig]. */
                class Builder internal constructor() {

                    private var digitalFiles: JsonField<DigitalFiles>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(digitalFilesConfig: DigitalFilesConfig) = apply {
                        digitalFiles = digitalFilesConfig.digitalFiles
                        additionalProperties =
                            digitalFilesConfig.additionalProperties.toMutableMap()
                    }

                    /**
                     * Populated digital-files payload for entitlement read surfaces. Mirrors
                     * `DigitalProductDelivery` but is sourced from an entitlement's
                     * `integration_config` (not a grant) and tags each file with its origin
                     * (`legacy` vs `ee`).
                     */
                    fun digitalFiles(digitalFiles: DigitalFiles) =
                        digitalFiles(JsonField.of(digitalFiles))

                    /**
                     * Sets [Builder.digitalFiles] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.digitalFiles] with a well-typed
                     * [DigitalFiles] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun digitalFiles(digitalFiles: JsonField<DigitalFiles>) = apply {
                        this.digitalFiles = digitalFiles
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
                     * Returns an immutable instance of [DigitalFilesConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .digitalFiles()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): DigitalFilesConfig =
                        DigitalFilesConfig(
                            checkRequired("digitalFiles", digitalFiles),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): DigitalFilesConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    digitalFiles().validate()
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
                internal fun validity(): Int = (digitalFiles.asKnown()?.validity() ?: 0)

                /**
                 * Populated digital-files payload for entitlement read surfaces. Mirrors
                 * `DigitalProductDelivery` but is sourced from an entitlement's
                 * `integration_config` (not a grant) and tags each file with its origin (`legacy`
                 * vs `ee`).
                 */
                class DigitalFiles
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val files: JsonField<List<File>>,
                    private val externalUrl: JsonField<String>,
                    private val instructions: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("files")
                        @ExcludeMissing
                        files: JsonField<List<File>> = JsonMissing.of(),
                        @JsonProperty("external_url")
                        @ExcludeMissing
                        externalUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("instructions")
                        @ExcludeMissing
                        instructions: JsonField<String> = JsonMissing.of(),
                    ) : this(files, externalUrl, instructions, mutableMapOf())

                    /**
                     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun files(): List<File> = files.getRequired("files")

                    /**
                     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun externalUrl(): String? = externalUrl.getNullable("external_url")

                    /**
                     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun instructions(): String? = instructions.getNullable("instructions")

                    /**
                     * Returns the raw JSON value of [files].
                     *
                     * Unlike [files], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("files")
                    @ExcludeMissing
                    fun _files(): JsonField<List<File>> = files

                    /**
                     * Returns the raw JSON value of [externalUrl].
                     *
                     * Unlike [externalUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("external_url")
                    @ExcludeMissing
                    fun _externalUrl(): JsonField<String> = externalUrl

                    /**
                     * Returns the raw JSON value of [instructions].
                     *
                     * Unlike [instructions], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                         * Returns a mutable builder for constructing an instance of [DigitalFiles].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .files()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [DigitalFiles]. */
                    class Builder internal constructor() {

                        private var files: JsonField<MutableList<File>>? = null
                        private var externalUrl: JsonField<String> = JsonMissing.of()
                        private var instructions: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(digitalFiles: DigitalFiles) = apply {
                            files = digitalFiles.files.map { it.toMutableList() }
                            externalUrl = digitalFiles.externalUrl
                            instructions = digitalFiles.instructions
                            additionalProperties = digitalFiles.additionalProperties.toMutableMap()
                        }

                        fun files(files: List<File>) = files(JsonField.of(files))

                        /**
                         * Sets [Builder.files] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.files] with a well-typed `List<File>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun files(files: JsonField<List<File>>) = apply {
                            this.files = files.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [File] to [files].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addFile(file: File) = apply {
                            files =
                                (files ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("files", it).add(file)
                                }
                        }

                        fun externalUrl(externalUrl: String?) =
                            externalUrl(JsonField.ofNullable(externalUrl))

                        /**
                         * Sets [Builder.externalUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.externalUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun externalUrl(externalUrl: JsonField<String>) = apply {
                            this.externalUrl = externalUrl
                        }

                        fun instructions(instructions: String?) =
                            instructions(JsonField.ofNullable(instructions))

                        /**
                         * Sets [Builder.instructions] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.instructions] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun instructions(instructions: JsonField<String>) = apply {
                            this.instructions = instructions
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [DigitalFiles].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .files()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): DigitalFiles =
                            DigitalFiles(
                                checkRequired("files", files).map { it.toImmutable() },
                                externalUrl,
                                instructions,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): DigitalFiles = apply {
                        if (validated) {
                            return@apply
                        }

                        files().forEach { it.validate() }
                        externalUrl()
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
                        (files.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                            (if (externalUrl.asKnown() == null) 0 else 1) +
                            (if (instructions.asKnown() == null) 0 else 1)

                    class File
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val downloadUrl: JsonField<String>,
                        private val expiresIn: JsonField<Long>,
                        private val fileId: JsonField<String>,
                        private val filename: JsonField<String>,
                        private val source: JsonField<String>,
                        private val contentType: JsonField<String>,
                        private val fileSize: JsonField<Long>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("download_url")
                            @ExcludeMissing
                            downloadUrl: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("expires_in")
                            @ExcludeMissing
                            expiresIn: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("file_id")
                            @ExcludeMissing
                            fileId: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("filename")
                            @ExcludeMissing
                            filename: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("source")
                            @ExcludeMissing
                            source: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("content_type")
                            @ExcludeMissing
                            contentType: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("file_size")
                            @ExcludeMissing
                            fileSize: JsonField<Long> = JsonMissing.of(),
                        ) : this(
                            downloadUrl,
                            expiresIn,
                            fileId,
                            filename,
                            source,
                            contentType,
                            fileSize,
                            mutableMapOf(),
                        )

                        /**
                         * @throws DodoPaymentsInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun downloadUrl(): String = downloadUrl.getRequired("download_url")

                        /**
                         * Seconds until `download_url` expires.
                         *
                         * @throws DodoPaymentsInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun expiresIn(): Long = expiresIn.getRequired("expires_in")

                        /**
                         * @throws DodoPaymentsInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun fileId(): String = fileId.getRequired("file_id")

                        /**
                         * @throws DodoPaymentsInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun filename(): String = filename.getRequired("filename")

                        /**
                         * `"legacy"` for files in `product_files`, `"ee"` for files managed by the
                         * Entitlements Engine.
                         *
                         * @throws DodoPaymentsInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun source(): String = source.getRequired("source")

                        /**
                         * @throws DodoPaymentsInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun contentType(): String? = contentType.getNullable("content_type")

                        /**
                         * @throws DodoPaymentsInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun fileSize(): Long? = fileSize.getNullable("file_size")

                        /**
                         * Returns the raw JSON value of [downloadUrl].
                         *
                         * Unlike [downloadUrl], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("download_url")
                        @ExcludeMissing
                        fun _downloadUrl(): JsonField<String> = downloadUrl

                        /**
                         * Returns the raw JSON value of [expiresIn].
                         *
                         * Unlike [expiresIn], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("expires_in")
                        @ExcludeMissing
                        fun _expiresIn(): JsonField<Long> = expiresIn

                        /**
                         * Returns the raw JSON value of [fileId].
                         *
                         * Unlike [fileId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file_id")
                        @ExcludeMissing
                        fun _fileId(): JsonField<String> = fileId

                        /**
                         * Returns the raw JSON value of [filename].
                         *
                         * Unlike [filename], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("filename")
                        @ExcludeMissing
                        fun _filename(): JsonField<String> = filename

                        /**
                         * Returns the raw JSON value of [source].
                         *
                         * Unlike [source], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("source")
                        @ExcludeMissing
                        fun _source(): JsonField<String> = source

                        /**
                         * Returns the raw JSON value of [contentType].
                         *
                         * Unlike [contentType], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("content_type")
                        @ExcludeMissing
                        fun _contentType(): JsonField<String> = contentType

                        /**
                         * Returns the raw JSON value of [fileSize].
                         *
                         * Unlike [fileSize], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("file_size")
                        @ExcludeMissing
                        fun _fileSize(): JsonField<Long> = fileSize

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
                             * .downloadUrl()
                             * .expiresIn()
                             * .fileId()
                             * .filename()
                             * .source()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [File]. */
                        class Builder internal constructor() {

                            private var downloadUrl: JsonField<String>? = null
                            private var expiresIn: JsonField<Long>? = null
                            private var fileId: JsonField<String>? = null
                            private var filename: JsonField<String>? = null
                            private var source: JsonField<String>? = null
                            private var contentType: JsonField<String> = JsonMissing.of()
                            private var fileSize: JsonField<Long> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(file: File) = apply {
                                downloadUrl = file.downloadUrl
                                expiresIn = file.expiresIn
                                fileId = file.fileId
                                filename = file.filename
                                source = file.source
                                contentType = file.contentType
                                fileSize = file.fileSize
                                additionalProperties = file.additionalProperties.toMutableMap()
                            }

                            fun downloadUrl(downloadUrl: String) =
                                downloadUrl(JsonField.of(downloadUrl))

                            /**
                             * Sets [Builder.downloadUrl] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.downloadUrl] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun downloadUrl(downloadUrl: JsonField<String>) = apply {
                                this.downloadUrl = downloadUrl
                            }

                            /** Seconds until `download_url` expires. */
                            fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

                            /**
                             * Sets [Builder.expiresIn] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.expiresIn] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun expiresIn(expiresIn: JsonField<Long>) = apply {
                                this.expiresIn = expiresIn
                            }

                            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                            /**
                             * Sets [Builder.fileId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fileId] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                            fun filename(filename: String) = filename(JsonField.of(filename))

                            /**
                             * Sets [Builder.filename] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.filename] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun filename(filename: JsonField<String>) = apply {
                                this.filename = filename
                            }

                            /**
                             * `"legacy"` for files in `product_files`, `"ee"` for files managed by
                             * the Entitlements Engine.
                             */
                            fun source(source: String) = source(JsonField.of(source))

                            /**
                             * Sets [Builder.source] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.source] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun source(source: JsonField<String>) = apply { this.source = source }

                            fun contentType(contentType: String?) =
                                contentType(JsonField.ofNullable(contentType))

                            /**
                             * Sets [Builder.contentType] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.contentType] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun contentType(contentType: JsonField<String>) = apply {
                                this.contentType = contentType
                            }

                            fun fileSize(fileSize: Long?) = fileSize(JsonField.ofNullable(fileSize))

                            /**
                             * Alias for [Builder.fileSize].
                             *
                             * This unboxed primitive overload exists for backwards compatibility.
                             */
                            fun fileSize(fileSize: Long) = fileSize(fileSize as Long?)

                            /**
                             * Sets [Builder.fileSize] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.fileSize] with a well-typed [Long]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun fileSize(fileSize: JsonField<Long>) = apply {
                                this.fileSize = fileSize
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [File].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .downloadUrl()
                             * .expiresIn()
                             * .fileId()
                             * .filename()
                             * .source()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): File =
                                File(
                                    checkRequired("downloadUrl", downloadUrl),
                                    checkRequired("expiresIn", expiresIn),
                                    checkRequired("fileId", fileId),
                                    checkRequired("filename", filename),
                                    checkRequired("source", source),
                                    contentType,
                                    fileSize,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): File = apply {
                            if (validated) {
                                return@apply
                            }

                            downloadUrl()
                            expiresIn()
                            fileId()
                            filename()
                            source()
                            contentType()
                            fileSize()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (downloadUrl.asKnown() == null) 0 else 1) +
                                (if (expiresIn.asKnown() == null) 0 else 1) +
                                (if (fileId.asKnown() == null) 0 else 1) +
                                (if (filename.asKnown() == null) 0 else 1) +
                                (if (source.asKnown() == null) 0 else 1) +
                                (if (contentType.asKnown() == null) 0 else 1) +
                                (if (fileSize.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is File &&
                                downloadUrl == other.downloadUrl &&
                                expiresIn == other.expiresIn &&
                                fileId == other.fileId &&
                                filename == other.filename &&
                                source == other.source &&
                                contentType == other.contentType &&
                                fileSize == other.fileSize &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                downloadUrl,
                                expiresIn,
                                fileId,
                                filename,
                                source,
                                contentType,
                                fileSize,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "File{downloadUrl=$downloadUrl, expiresIn=$expiresIn, fileId=$fileId, filename=$filename, source=$source, contentType=$contentType, fileSize=$fileSize, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DigitalFiles &&
                            files == other.files &&
                            externalUrl == other.externalUrl &&
                            instructions == other.instructions &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(files, externalUrl, instructions, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DigitalFiles{files=$files, externalUrl=$externalUrl, instructions=$instructions, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DigitalFilesConfig &&
                        digitalFiles == other.digitalFiles &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(digitalFiles, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DigitalFilesConfig{digitalFiles=$digitalFiles, additionalProperties=$additionalProperties}"
            }

            class LicenseKeyConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val activationMessage: JsonField<String>,
                private val activationsLimit: JsonField<Int>,
                private val durationCount: JsonField<Int>,
                private val durationInterval: JsonField<TimeInterval>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("activation_message")
                    @ExcludeMissing
                    activationMessage: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("activations_limit")
                    @ExcludeMissing
                    activationsLimit: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("duration_count")
                    @ExcludeMissing
                    durationCount: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("duration_interval")
                    @ExcludeMissing
                    durationInterval: JsonField<TimeInterval> = JsonMissing.of(),
                ) : this(
                    activationMessage,
                    activationsLimit,
                    durationCount,
                    durationInterval,
                    mutableMapOf(),
                )

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun activationMessage(): String? =
                    activationMessage.getNullable("activation_message")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun activationsLimit(): Int? = activationsLimit.getNullable("activations_limit")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun durationCount(): Int? = durationCount.getNullable("duration_count")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun durationInterval(): TimeInterval? =
                    durationInterval.getNullable("duration_interval")

                /**
                 * Returns the raw JSON value of [activationMessage].
                 *
                 * Unlike [activationMessage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("activation_message")
                @ExcludeMissing
                fun _activationMessage(): JsonField<String> = activationMessage

                /**
                 * Returns the raw JSON value of [activationsLimit].
                 *
                 * Unlike [activationsLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("activations_limit")
                @ExcludeMissing
                fun _activationsLimit(): JsonField<Int> = activationsLimit

                /**
                 * Returns the raw JSON value of [durationCount].
                 *
                 * Unlike [durationCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("duration_count")
                @ExcludeMissing
                fun _durationCount(): JsonField<Int> = durationCount

                /**
                 * Returns the raw JSON value of [durationInterval].
                 *
                 * Unlike [durationInterval], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("duration_interval")
                @ExcludeMissing
                fun _durationInterval(): JsonField<TimeInterval> = durationInterval

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
                     * Returns a mutable builder for constructing an instance of [LicenseKeyConfig].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LicenseKeyConfig]. */
                class Builder internal constructor() {

                    private var activationMessage: JsonField<String> = JsonMissing.of()
                    private var activationsLimit: JsonField<Int> = JsonMissing.of()
                    private var durationCount: JsonField<Int> = JsonMissing.of()
                    private var durationInterval: JsonField<TimeInterval> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(licenseKeyConfig: LicenseKeyConfig) = apply {
                        activationMessage = licenseKeyConfig.activationMessage
                        activationsLimit = licenseKeyConfig.activationsLimit
                        durationCount = licenseKeyConfig.durationCount
                        durationInterval = licenseKeyConfig.durationInterval
                        additionalProperties = licenseKeyConfig.additionalProperties.toMutableMap()
                    }

                    fun activationMessage(activationMessage: String?) =
                        activationMessage(JsonField.ofNullable(activationMessage))

                    /**
                     * Sets [Builder.activationMessage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.activationMessage] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun activationMessage(activationMessage: JsonField<String>) = apply {
                        this.activationMessage = activationMessage
                    }

                    fun activationsLimit(activationsLimit: Int?) =
                        activationsLimit(JsonField.ofNullable(activationsLimit))

                    /**
                     * Alias for [Builder.activationsLimit].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun activationsLimit(activationsLimit: Int) =
                        activationsLimit(activationsLimit as Int?)

                    /**
                     * Sets [Builder.activationsLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.activationsLimit] with a well-typed [Int]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun activationsLimit(activationsLimit: JsonField<Int>) = apply {
                        this.activationsLimit = activationsLimit
                    }

                    fun durationCount(durationCount: Int?) =
                        durationCount(JsonField.ofNullable(durationCount))

                    /**
                     * Alias for [Builder.durationCount].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun durationCount(durationCount: Int) = durationCount(durationCount as Int?)

                    /**
                     * Sets [Builder.durationCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.durationCount] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun durationCount(durationCount: JsonField<Int>) = apply {
                        this.durationCount = durationCount
                    }

                    fun durationInterval(durationInterval: TimeInterval?) =
                        durationInterval(JsonField.ofNullable(durationInterval))

                    /**
                     * Sets [Builder.durationInterval] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.durationInterval] with a well-typed
                     * [TimeInterval] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun durationInterval(durationInterval: JsonField<TimeInterval>) = apply {
                        this.durationInterval = durationInterval
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
                     * Returns an immutable instance of [LicenseKeyConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LicenseKeyConfig =
                        LicenseKeyConfig(
                            activationMessage,
                            activationsLimit,
                            durationCount,
                            durationInterval,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LicenseKeyConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    activationMessage()
                    activationsLimit()
                    durationCount()
                    durationInterval()?.validate()
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
                    (if (activationMessage.asKnown() == null) 0 else 1) +
                        (if (activationsLimit.asKnown() == null) 0 else 1) +
                        (if (durationCount.asKnown() == null) 0 else 1) +
                        (durationInterval.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LicenseKeyConfig &&
                        activationMessage == other.activationMessage &&
                        activationsLimit == other.activationsLimit &&
                        durationCount == other.durationCount &&
                        durationInterval == other.durationInterval &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        activationMessage,
                        activationsLimit,
                        durationCount,
                        durationInterval,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LicenseKeyConfig{activationMessage=$activationMessage, activationsLimit=$activationsLimit, durationCount=$durationCount, durationInterval=$durationInterval, additionalProperties=$additionalProperties}"
            }
        }

        class IntegrationType
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

                val DISCORD = of("discord")

                val TELEGRAM = of("telegram")

                val GITHUB = of("github")

                val FIGMA = of("figma")

                val FRAMER = of("framer")

                val NOTION = of("notion")

                val DIGITAL_FILES = of("digital_files")

                val LICENSE_KEY = of("license_key")

                fun of(value: String) = IntegrationType(JsonField.of(value))
            }

            /** An enum containing [IntegrationType]'s known values. */
            enum class Known {
                DISCORD,
                TELEGRAM,
                GITHUB,
                FIGMA,
                FRAMER,
                NOTION,
                DIGITAL_FILES,
                LICENSE_KEY,
            }

            /**
             * An enum containing [IntegrationType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IntegrationType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DISCORD,
                TELEGRAM,
                GITHUB,
                FIGMA,
                FRAMER,
                NOTION,
                DIGITAL_FILES,
                LICENSE_KEY,
                /**
                 * An enum member indicating that [IntegrationType] was instantiated with an unknown
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
                    DISCORD -> Value.DISCORD
                    TELEGRAM -> Value.TELEGRAM
                    GITHUB -> Value.GITHUB
                    FIGMA -> Value.FIGMA
                    FRAMER -> Value.FRAMER
                    NOTION -> Value.NOTION
                    DIGITAL_FILES -> Value.DIGITAL_FILES
                    LICENSE_KEY -> Value.LICENSE_KEY
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
                    DISCORD -> Known.DISCORD
                    TELEGRAM -> Known.TELEGRAM
                    GITHUB -> Known.GITHUB
                    FIGMA -> Known.FIGMA
                    FRAMER -> Known.FRAMER
                    NOTION -> Known.NOTION
                    DIGITAL_FILES -> Known.DIGITAL_FILES
                    LICENSE_KEY -> Known.LICENSE_KEY
                    else ->
                        throw DodoPaymentsInvalidDataException("Unknown IntegrationType: $value")
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

            fun validate(): IntegrationType = apply {
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

                return other is IntegrationType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entitlement &&
                id == other.id &&
                integrationConfig == other.integrationConfig &&
                integrationType == other.integrationType &&
                name == other.name &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                integrationConfig,
                integrationType,
                name,
                description,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entitlement{id=$id, integrationConfig=$integrationConfig, integrationType=$integrationType, name=$name, description=$description, additionalProperties=$additionalProperties}"
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
