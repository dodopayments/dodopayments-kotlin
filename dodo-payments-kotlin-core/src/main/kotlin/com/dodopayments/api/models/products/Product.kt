// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Product
@JsonCreator
private constructor(
    @JsonProperty("business_id")
    @ExcludeMissing
    private val businessId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("is_recurring")
    @ExcludeMissing
    private val isRecurring: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("license_key_enabled")
    @ExcludeMissing
    private val licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("price") @ExcludeMissing private val price: JsonField<Price> = JsonMissing.of(),
    @JsonProperty("product_id")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tax_category")
    @ExcludeMissing
    private val taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("addons")
    @ExcludeMissing
    private val addons: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("image") @ExcludeMissing private val image: JsonField<String> = JsonMissing.of(),
    @JsonProperty("license_key_activation_message")
    @ExcludeMissing
    private val licenseKeyActivationMessage: JsonField<String> = JsonMissing.of(),
    @JsonProperty("license_key_activations_limit")
    @ExcludeMissing
    private val licenseKeyActivationsLimit: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("license_key_duration")
    @ExcludeMissing
    private val licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the business to which the product belongs. */
    fun businessId(): String = businessId.getRequired("business_id")

    /** Timestamp when the product was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Indicates if the product is recurring (e.g., subscriptions). */
    fun isRecurring(): Boolean = isRecurring.getRequired("is_recurring")

    /** Indicates whether the product requires a license key. */
    fun licenseKeyEnabled(): Boolean = licenseKeyEnabled.getRequired("license_key_enabled")

    fun price(): Price = price.getRequired("price")

    /** Unique identifier for the product. */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Represents the different categories of taxation applicable to various products and services.
     */
    fun taxCategory(): TaxCategory = taxCategory.getRequired("tax_category")

    /** Timestamp when the product was last updated. */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** Available Addons for subscription products */
    fun addons(): List<String>? = addons.getNullable("addons")

    /** Description of the product, optional. */
    fun description(): String? = description.getNullable("description")

    /** URL of the product image, optional. */
    fun image(): String? = image.getNullable("image")

    /** Message sent upon license key activation, if applicable. */
    fun licenseKeyActivationMessage(): String? =
        licenseKeyActivationMessage.getNullable("license_key_activation_message")

    /** Limit on the number of activations for the license key, if enabled. */
    fun licenseKeyActivationsLimit(): Long? =
        licenseKeyActivationsLimit.getNullable("license_key_activations_limit")

    fun licenseKeyDuration(): LicenseKeyDuration? =
        licenseKeyDuration.getNullable("license_key_duration")

    /** Name of the product, optional. */
    fun name(): String? = name.getNullable("name")

    /** Unique identifier for the business to which the product belongs. */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /** Timestamp when the product was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** Indicates if the product is recurring (e.g., subscriptions). */
    @JsonProperty("is_recurring")
    @ExcludeMissing
    fun _isRecurring(): JsonField<Boolean> = isRecurring

    /** Indicates whether the product requires a license key. */
    @JsonProperty("license_key_enabled")
    @ExcludeMissing
    fun _licenseKeyEnabled(): JsonField<Boolean> = licenseKeyEnabled

    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

    /** Unique identifier for the product. */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Represents the different categories of taxation applicable to various products and services.
     */
    @JsonProperty("tax_category")
    @ExcludeMissing
    fun _taxCategory(): JsonField<TaxCategory> = taxCategory

    /** Timestamp when the product was last updated. */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /** Available Addons for subscription products */
    @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<String>> = addons

    /** Description of the product, optional. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** URL of the product image, optional. */
    @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

    /** Message sent upon license key activation, if applicable. */
    @JsonProperty("license_key_activation_message")
    @ExcludeMissing
    fun _licenseKeyActivationMessage(): JsonField<String> = licenseKeyActivationMessage

    /** Limit on the number of activations for the license key, if enabled. */
    @JsonProperty("license_key_activations_limit")
    @ExcludeMissing
    fun _licenseKeyActivationsLimit(): JsonField<Long> = licenseKeyActivationsLimit

    @JsonProperty("license_key_duration")
    @ExcludeMissing
    fun _licenseKeyDuration(): JsonField<LicenseKeyDuration> = licenseKeyDuration

    /** Name of the product, optional. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Product = apply {
        if (validated) {
            return@apply
        }

        businessId()
        createdAt()
        isRecurring()
        licenseKeyEnabled()
        price().validate()
        productId()
        taxCategory()
        updatedAt()
        addons()
        description()
        image()
        licenseKeyActivationMessage()
        licenseKeyActivationsLimit()
        licenseKeyDuration()?.validate()
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Product].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .createdAt()
         * .isRecurring()
         * .licenseKeyEnabled()
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

        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var isRecurring: JsonField<Boolean>? = null
        private var licenseKeyEnabled: JsonField<Boolean>? = null
        private var price: JsonField<Price>? = null
        private var productId: JsonField<String>? = null
        private var taxCategory: JsonField<TaxCategory>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var addons: JsonField<MutableList<String>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var image: JsonField<String> = JsonMissing.of()
        private var licenseKeyActivationMessage: JsonField<String> = JsonMissing.of()
        private var licenseKeyActivationsLimit: JsonField<Long> = JsonMissing.of()
        private var licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(product: Product) = apply {
            businessId = product.businessId
            createdAt = product.createdAt
            isRecurring = product.isRecurring
            licenseKeyEnabled = product.licenseKeyEnabled
            price = product.price
            productId = product.productId
            taxCategory = product.taxCategory
            updatedAt = product.updatedAt
            addons = product.addons.map { it.toMutableList() }
            description = product.description
            image = product.image
            licenseKeyActivationMessage = product.licenseKeyActivationMessage
            licenseKeyActivationsLimit = product.licenseKeyActivationsLimit
            licenseKeyDuration = product.licenseKeyDuration
            name = product.name
            additionalProperties = product.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the business to which the product belongs. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /** Unique identifier for the business to which the product belongs. */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Timestamp when the product was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** Timestamp when the product was created. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Indicates if the product is recurring (e.g., subscriptions). */
        fun isRecurring(isRecurring: Boolean) = isRecurring(JsonField.of(isRecurring))

        /** Indicates if the product is recurring (e.g., subscriptions). */
        fun isRecurring(isRecurring: JsonField<Boolean>) = apply { this.isRecurring = isRecurring }

        /** Indicates whether the product requires a license key. */
        fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
            licenseKeyEnabled(JsonField.of(licenseKeyEnabled))

        /** Indicates whether the product requires a license key. */
        fun licenseKeyEnabled(licenseKeyEnabled: JsonField<Boolean>) = apply {
            this.licenseKeyEnabled = licenseKeyEnabled
        }

        fun price(price: Price) = price(JsonField.of(price))

        fun price(price: JsonField<Price>) = apply { this.price = price }

        fun price(oneTime: Price.OneTimePrice) = price(Price.ofOneTime(oneTime))

        fun price(recurring: Price.RecurringPrice) = price(Price.ofRecurring(recurring))

        /** Unique identifier for the product. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** Unique identifier for the product. */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         */
        fun taxCategory(taxCategory: TaxCategory) = taxCategory(JsonField.of(taxCategory))

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         */
        fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
            this.taxCategory = taxCategory
        }

        /** Timestamp when the product was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /** Timestamp when the product was last updated. */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Available Addons for subscription products */
        fun addons(addons: List<String>?) = addons(JsonField.ofNullable(addons))

        /** Available Addons for subscription products */
        fun addons(addons: JsonField<List<String>>) = apply {
            this.addons = addons.map { it.toMutableList() }
        }

        /** Available Addons for subscription products */
        fun addAddon(addon: String) = apply {
            addons =
                (addons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addons", it).add(addon)
                }
        }

        /** Description of the product, optional. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Description of the product, optional. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** URL of the product image, optional. */
        fun image(image: String?) = image(JsonField.ofNullable(image))

        /** URL of the product image, optional. */
        fun image(image: JsonField<String>) = apply { this.image = image }

        /** Message sent upon license key activation, if applicable. */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: String?) =
            licenseKeyActivationMessage(JsonField.ofNullable(licenseKeyActivationMessage))

        /** Message sent upon license key activation, if applicable. */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: JsonField<String>) = apply {
            this.licenseKeyActivationMessage = licenseKeyActivationMessage
        }

        /** Limit on the number of activations for the license key, if enabled. */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long?) =
            licenseKeyActivationsLimit(JsonField.ofNullable(licenseKeyActivationsLimit))

        /** Limit on the number of activations for the license key, if enabled. */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long) =
            licenseKeyActivationsLimit(licenseKeyActivationsLimit as Long?)

        /** Limit on the number of activations for the license key, if enabled. */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: JsonField<Long>) = apply {
            this.licenseKeyActivationsLimit = licenseKeyActivationsLimit
        }

        fun licenseKeyDuration(licenseKeyDuration: LicenseKeyDuration?) =
            licenseKeyDuration(JsonField.ofNullable(licenseKeyDuration))

        fun licenseKeyDuration(licenseKeyDuration: JsonField<LicenseKeyDuration>) = apply {
            this.licenseKeyDuration = licenseKeyDuration
        }

        /** Name of the product, optional. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Name of the product, optional. */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): Product =
            Product(
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("isRecurring", isRecurring),
                checkRequired("licenseKeyEnabled", licenseKeyEnabled),
                checkRequired("price", price),
                checkRequired("productId", productId),
                checkRequired("taxCategory", taxCategory),
                checkRequired("updatedAt", updatedAt),
                (addons ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                image,
                licenseKeyActivationMessage,
                licenseKeyActivationsLimit,
                licenseKeyDuration,
                name,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Represents the different categories of taxation applicable to various products and services.
     */
    class TaxCategory @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DIGITAL_PRODUCTS = of("digital_products")

            val SAAS = of("saas")

            val E_BOOK = of("e_book")

            val EDTECH = of("edtech")

            fun of(value: String) = TaxCategory(JsonField.of(value))
        }

        /** An enum containing [TaxCategory]'s known values. */
        enum class Known {
            DIGITAL_PRODUCTS,
            SAAS,
            E_BOOK,
            EDTECH,
        }

        /**
         * An enum containing [TaxCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DIGITAL_PRODUCTS,
            SAAS,
            E_BOOK,
            EDTECH,
            /**
             * An enum member indicating that [TaxCategory] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DIGITAL_PRODUCTS -> Value.DIGITAL_PRODUCTS
                SAAS -> Value.SAAS
                E_BOOK -> Value.E_BOOK
                EDTECH -> Value.EDTECH
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DIGITAL_PRODUCTS -> Known.DIGITAL_PRODUCTS
                SAAS -> Known.SAAS
                E_BOOK -> Known.E_BOOK
                EDTECH -> Known.EDTECH
                else -> throw DodoPaymentsInvalidDataException("Unknown TaxCategory: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Product && businessId == other.businessId && createdAt == other.createdAt && isRecurring == other.isRecurring && licenseKeyEnabled == other.licenseKeyEnabled && price == other.price && productId == other.productId && taxCategory == other.taxCategory && updatedAt == other.updatedAt && addons == other.addons && description == other.description && image == other.image && licenseKeyActivationMessage == other.licenseKeyActivationMessage && licenseKeyActivationsLimit == other.licenseKeyActivationsLimit && licenseKeyDuration == other.licenseKeyDuration && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(businessId, createdAt, isRecurring, licenseKeyEnabled, price, productId, taxCategory, updatedAt, addons, description, image, licenseKeyActivationMessage, licenseKeyActivationsLimit, licenseKeyDuration, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Product{businessId=$businessId, createdAt=$createdAt, isRecurring=$isRecurring, licenseKeyEnabled=$licenseKeyEnabled, price=$price, productId=$productId, taxCategory=$taxCategory, updatedAt=$updatedAt, addons=$addons, description=$description, image=$image, licenseKeyActivationMessage=$licenseKeyActivationMessage, licenseKeyActivationsLimit=$licenseKeyActivationsLimit, licenseKeyDuration=$licenseKeyDuration, name=$name, additionalProperties=$additionalProperties}"
}
