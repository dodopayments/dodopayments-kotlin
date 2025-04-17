// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

class ProductUpdateParams
private constructor(
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /** Available Addons for subscription products */
    fun addons(): List<String>? = body.addons()

    /** Description of the product, optional and must be at most 1000 characters. */
    fun description(): String? = body.description()

    /** Product image id after its uploaded to S3 */
    fun imageId(): String? = body.imageId()

    /**
     * Message sent to the customer upon license key activation.
     *
     * Only applicable if `license_key_enabled` is `true`. This message contains instructions for
     * activating the license key.
     */
    fun licenseKeyActivationMessage(): String? = body.licenseKeyActivationMessage()

    /**
     * Limit for the number of activations for the license key.
     *
     * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of times
     * the license key can be activated.
     */
    fun licenseKeyActivationsLimit(): Long? = body.licenseKeyActivationsLimit()

    fun licenseKeyDuration(): LicenseKeyDuration? = body.licenseKeyDuration()

    /**
     * Whether the product requires a license key.
     *
     * If `true`, additional fields related to license key (duration, activations limit, activation
     * message) become applicable.
     */
    fun licenseKeyEnabled(): Boolean? = body.licenseKeyEnabled()

    /** Name of the product, optional and must be at most 100 characters. */
    fun name(): String? = body.name()

    fun price(): Price? = body.price()

    /**
     * Represents the different categories of taxation applicable to various products and services.
     */
    fun taxCategory(): TaxCategory? = body.taxCategory()

    /** Available Addons for subscription products */
    fun _addons(): JsonField<List<String>> = body._addons()

    /** Description of the product, optional and must be at most 1000 characters. */
    fun _description(): JsonField<String> = body._description()

    /** Product image id after its uploaded to S3 */
    fun _imageId(): JsonField<String> = body._imageId()

    /**
     * Message sent to the customer upon license key activation.
     *
     * Only applicable if `license_key_enabled` is `true`. This message contains instructions for
     * activating the license key.
     */
    fun _licenseKeyActivationMessage(): JsonField<String> = body._licenseKeyActivationMessage()

    /**
     * Limit for the number of activations for the license key.
     *
     * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of times
     * the license key can be activated.
     */
    fun _licenseKeyActivationsLimit(): JsonField<Long> = body._licenseKeyActivationsLimit()

    fun _licenseKeyDuration(): JsonField<LicenseKeyDuration> = body._licenseKeyDuration()

    /**
     * Whether the product requires a license key.
     *
     * If `true`, additional fields related to license key (duration, activations limit, activation
     * message) become applicable.
     */
    fun _licenseKeyEnabled(): JsonField<Boolean> = body._licenseKeyEnabled()

    /** Name of the product, optional and must be at most 100 characters. */
    fun _name(): JsonField<String> = body._name()

    fun _price(): JsonField<Price> = body._price()

    /**
     * Represents the different categories of taxation applicable to various products and services.
     */
    fun _taxCategory(): JsonField<TaxCategory> = body._taxCategory()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("addons")
        @ExcludeMissing
        private val addons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("image_id")
        @ExcludeMissing
        private val imageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("license_key_activation_message")
        @ExcludeMissing
        private val licenseKeyActivationMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("license_key_activations_limit")
        @ExcludeMissing
        private val licenseKeyActivationsLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("license_key_duration")
        @ExcludeMissing
        private val licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of(),
        @JsonProperty("license_key_enabled")
        @ExcludeMissing
        private val licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("tax_category")
        @ExcludeMissing
        private val taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Available Addons for subscription products */
        fun addons(): List<String>? = addons.getNullable("addons")

        /** Description of the product, optional and must be at most 1000 characters. */
        fun description(): String? = description.getNullable("description")

        /** Product image id after its uploaded to S3 */
        fun imageId(): String? = imageId.getNullable("image_id")

        /**
         * Message sent to the customer upon license key activation.
         *
         * Only applicable if `license_key_enabled` is `true`. This message contains instructions
         * for activating the license key.
         */
        fun licenseKeyActivationMessage(): String? =
            licenseKeyActivationMessage.getNullable("license_key_activation_message")

        /**
         * Limit for the number of activations for the license key.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
         * times the license key can be activated.
         */
        fun licenseKeyActivationsLimit(): Long? =
            licenseKeyActivationsLimit.getNullable("license_key_activations_limit")

        fun licenseKeyDuration(): LicenseKeyDuration? =
            licenseKeyDuration.getNullable("license_key_duration")

        /**
         * Whether the product requires a license key.
         *
         * If `true`, additional fields related to license key (duration, activations limit,
         * activation message) become applicable.
         */
        fun licenseKeyEnabled(): Boolean? = licenseKeyEnabled.getNullable("license_key_enabled")

        /** Name of the product, optional and must be at most 100 characters. */
        fun name(): String? = name.getNullable("name")

        fun price(): Price? = price.getNullable("price")

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         */
        fun taxCategory(): TaxCategory? = taxCategory.getNullable("tax_category")

        /** Available Addons for subscription products */
        @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<String>> = addons

        /** Description of the product, optional and must be at most 1000 characters. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Product image id after its uploaded to S3 */
        @JsonProperty("image_id") @ExcludeMissing fun _imageId(): JsonField<String> = imageId

        /**
         * Message sent to the customer upon license key activation.
         *
         * Only applicable if `license_key_enabled` is `true`. This message contains instructions
         * for activating the license key.
         */
        @JsonProperty("license_key_activation_message")
        @ExcludeMissing
        fun _licenseKeyActivationMessage(): JsonField<String> = licenseKeyActivationMessage

        /**
         * Limit for the number of activations for the license key.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
         * times the license key can be activated.
         */
        @JsonProperty("license_key_activations_limit")
        @ExcludeMissing
        fun _licenseKeyActivationsLimit(): JsonField<Long> = licenseKeyActivationsLimit

        @JsonProperty("license_key_duration")
        @ExcludeMissing
        fun _licenseKeyDuration(): JsonField<LicenseKeyDuration> = licenseKeyDuration

        /**
         * Whether the product requires a license key.
         *
         * If `true`, additional fields related to license key (duration, activations limit,
         * activation message) become applicable.
         */
        @JsonProperty("license_key_enabled")
        @ExcludeMissing
        fun _licenseKeyEnabled(): JsonField<Boolean> = licenseKeyEnabled

        /** Name of the product, optional and must be at most 100 characters. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         */
        @JsonProperty("tax_category")
        @ExcludeMissing
        fun _taxCategory(): JsonField<TaxCategory> = taxCategory

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addons()
            description()
            imageId()
            licenseKeyActivationMessage()
            licenseKeyActivationsLimit()
            licenseKeyDuration()?.validate()
            licenseKeyEnabled()
            name()
            price()?.validate()
            taxCategory()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addons: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var imageId: JsonField<String> = JsonMissing.of()
            private var licenseKeyActivationMessage: JsonField<String> = JsonMissing.of()
            private var licenseKeyActivationsLimit: JsonField<Long> = JsonMissing.of()
            private var licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of()
            private var licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var taxCategory: JsonField<TaxCategory> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                addons = body.addons.map { it.toMutableList() }
                description = body.description
                imageId = body.imageId
                licenseKeyActivationMessage = body.licenseKeyActivationMessage
                licenseKeyActivationsLimit = body.licenseKeyActivationsLimit
                licenseKeyDuration = body.licenseKeyDuration
                licenseKeyEnabled = body.licenseKeyEnabled
                name = body.name
                price = body.price
                taxCategory = body.taxCategory
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            /** Description of the product, optional and must be at most 1000 characters. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Description of the product, optional and must be at most 1000 characters. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Product image id after its uploaded to S3 */
            fun imageId(imageId: String?) = imageId(JsonField.ofNullable(imageId))

            /** Product image id after its uploaded to S3 */
            fun imageId(imageId: JsonField<String>) = apply { this.imageId = imageId }

            /**
             * Message sent to the customer upon license key activation.
             *
             * Only applicable if `license_key_enabled` is `true`. This message contains
             * instructions for activating the license key.
             */
            fun licenseKeyActivationMessage(licenseKeyActivationMessage: String?) =
                licenseKeyActivationMessage(JsonField.ofNullable(licenseKeyActivationMessage))

            /**
             * Message sent to the customer upon license key activation.
             *
             * Only applicable if `license_key_enabled` is `true`. This message contains
             * instructions for activating the license key.
             */
            fun licenseKeyActivationMessage(licenseKeyActivationMessage: JsonField<String>) =
                apply {
                    this.licenseKeyActivationMessage = licenseKeyActivationMessage
                }

            /**
             * Limit for the number of activations for the license key.
             *
             * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
             * times the license key can be activated.
             */
            fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long?) =
                licenseKeyActivationsLimit(JsonField.ofNullable(licenseKeyActivationsLimit))

            /**
             * Limit for the number of activations for the license key.
             *
             * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
             * times the license key can be activated.
             */
            fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long) =
                licenseKeyActivationsLimit(licenseKeyActivationsLimit as Long?)

            /**
             * Limit for the number of activations for the license key.
             *
             * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
             * times the license key can be activated.
             */
            fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: JsonField<Long>) = apply {
                this.licenseKeyActivationsLimit = licenseKeyActivationsLimit
            }

            fun licenseKeyDuration(licenseKeyDuration: LicenseKeyDuration?) =
                licenseKeyDuration(JsonField.ofNullable(licenseKeyDuration))

            fun licenseKeyDuration(licenseKeyDuration: JsonField<LicenseKeyDuration>) = apply {
                this.licenseKeyDuration = licenseKeyDuration
            }

            /**
             * Whether the product requires a license key.
             *
             * If `true`, additional fields related to license key (duration, activations limit,
             * activation message) become applicable.
             */
            fun licenseKeyEnabled(licenseKeyEnabled: Boolean?) =
                licenseKeyEnabled(JsonField.ofNullable(licenseKeyEnabled))

            /**
             * Whether the product requires a license key.
             *
             * If `true`, additional fields related to license key (duration, activations limit,
             * activation message) become applicable.
             */
            fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
                licenseKeyEnabled(licenseKeyEnabled as Boolean?)

            /**
             * Whether the product requires a license key.
             *
             * If `true`, additional fields related to license key (duration, activations limit,
             * activation message) become applicable.
             */
            fun licenseKeyEnabled(licenseKeyEnabled: JsonField<Boolean>) = apply {
                this.licenseKeyEnabled = licenseKeyEnabled
            }

            /** Name of the product, optional and must be at most 100 characters. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Name of the product, optional and must be at most 100 characters. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun price(price: Price?) = price(JsonField.ofNullable(price))

            fun price(price: JsonField<Price>) = apply { this.price = price }

            fun price(oneTime: Price.OneTimePrice) = price(Price.ofOneTime(oneTime))

            fun price(recurring: Price.RecurringPrice) = price(Price.ofRecurring(recurring))

            /**
             * Represents the different categories of taxation applicable to various products and
             * services.
             */
            fun taxCategory(taxCategory: TaxCategory?) =
                taxCategory(JsonField.ofNullable(taxCategory))

            /**
             * Represents the different categories of taxation applicable to various products and
             * services.
             */
            fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
                this.taxCategory = taxCategory
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

            fun build(): Body =
                Body(
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    imageId,
                    licenseKeyActivationMessage,
                    licenseKeyActivationsLimit,
                    licenseKeyDuration,
                    licenseKeyEnabled,
                    name,
                    price,
                    taxCategory,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && addons == other.addons && description == other.description && imageId == other.imageId && licenseKeyActivationMessage == other.licenseKeyActivationMessage && licenseKeyActivationsLimit == other.licenseKeyActivationsLimit && licenseKeyDuration == other.licenseKeyDuration && licenseKeyEnabled == other.licenseKeyEnabled && name == other.name && price == other.price && taxCategory == other.taxCategory && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addons, description, imageId, licenseKeyActivationMessage, licenseKeyActivationsLimit, licenseKeyDuration, licenseKeyEnabled, name, price, taxCategory, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addons=$addons, description=$description, imageId=$imageId, licenseKeyActivationMessage=$licenseKeyActivationMessage, licenseKeyActivationsLimit=$licenseKeyActivationsLimit, licenseKeyDuration=$licenseKeyDuration, licenseKeyEnabled=$licenseKeyEnabled, name=$name, price=$price, taxCategory=$taxCategory, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(productUpdateParams: ProductUpdateParams) = apply {
            id = productUpdateParams.id
            body = productUpdateParams.body.toBuilder()
            additionalHeaders = productUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = productUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /** Available Addons for subscription products */
        fun addons(addons: List<String>?) = apply { body.addons(addons) }

        /** Available Addons for subscription products */
        fun addons(addons: JsonField<List<String>>) = apply { body.addons(addons) }

        /** Available Addons for subscription products */
        fun addAddon(addon: String) = apply { body.addAddon(addon) }

        /** Description of the product, optional and must be at most 1000 characters. */
        fun description(description: String?) = apply { body.description(description) }

        /** Description of the product, optional and must be at most 1000 characters. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Product image id after its uploaded to S3 */
        fun imageId(imageId: String?) = apply { body.imageId(imageId) }

        /** Product image id after its uploaded to S3 */
        fun imageId(imageId: JsonField<String>) = apply { body.imageId(imageId) }

        /**
         * Message sent to the customer upon license key activation.
         *
         * Only applicable if `license_key_enabled` is `true`. This message contains instructions
         * for activating the license key.
         */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: String?) = apply {
            body.licenseKeyActivationMessage(licenseKeyActivationMessage)
        }

        /**
         * Message sent to the customer upon license key activation.
         *
         * Only applicable if `license_key_enabled` is `true`. This message contains instructions
         * for activating the license key.
         */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: JsonField<String>) = apply {
            body.licenseKeyActivationMessage(licenseKeyActivationMessage)
        }

        /**
         * Limit for the number of activations for the license key.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
         * times the license key can be activated.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long?) = apply {
            body.licenseKeyActivationsLimit(licenseKeyActivationsLimit)
        }

        /**
         * Limit for the number of activations for the license key.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
         * times the license key can be activated.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long) =
            licenseKeyActivationsLimit(licenseKeyActivationsLimit as Long?)

        /**
         * Limit for the number of activations for the license key.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
         * times the license key can be activated.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: JsonField<Long>) = apply {
            body.licenseKeyActivationsLimit(licenseKeyActivationsLimit)
        }

        fun licenseKeyDuration(licenseKeyDuration: LicenseKeyDuration?) = apply {
            body.licenseKeyDuration(licenseKeyDuration)
        }

        fun licenseKeyDuration(licenseKeyDuration: JsonField<LicenseKeyDuration>) = apply {
            body.licenseKeyDuration(licenseKeyDuration)
        }

        /**
         * Whether the product requires a license key.
         *
         * If `true`, additional fields related to license key (duration, activations limit,
         * activation message) become applicable.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: Boolean?) = apply {
            body.licenseKeyEnabled(licenseKeyEnabled)
        }

        /**
         * Whether the product requires a license key.
         *
         * If `true`, additional fields related to license key (duration, activations limit,
         * activation message) become applicable.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
            licenseKeyEnabled(licenseKeyEnabled as Boolean?)

        /**
         * Whether the product requires a license key.
         *
         * If `true`, additional fields related to license key (duration, activations limit,
         * activation message) become applicable.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: JsonField<Boolean>) = apply {
            body.licenseKeyEnabled(licenseKeyEnabled)
        }

        /** Name of the product, optional and must be at most 100 characters. */
        fun name(name: String?) = apply { body.name(name) }

        /** Name of the product, optional and must be at most 100 characters. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun price(price: Price?) = apply { body.price(price) }

        fun price(price: JsonField<Price>) = apply { body.price(price) }

        fun price(oneTime: Price.OneTimePrice) = apply { body.price(oneTime) }

        fun price(recurring: Price.RecurringPrice) = apply { body.price(recurring) }

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         */
        fun taxCategory(taxCategory: TaxCategory?) = apply { body.taxCategory(taxCategory) }

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         */
        fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
            body.taxCategory(taxCategory)
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

        fun build(): ProductUpdateParams =
            ProductUpdateParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is ProductUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProductUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
