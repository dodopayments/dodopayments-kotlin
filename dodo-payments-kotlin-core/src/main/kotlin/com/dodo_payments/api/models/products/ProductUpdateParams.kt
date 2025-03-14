// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.products

import com.dodo_payments.api.core.BaseDeserializer
import com.dodo_payments.api.core.BaseSerializer
import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.Params
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.getOrThrow
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.http.QueryParams
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
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
import java.util.Objects

class ProductUpdateParams
private constructor(
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

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

            return /* spotless:off */ other is Body && description == other.description && imageId == other.imageId && licenseKeyActivationMessage == other.licenseKeyActivationMessage && licenseKeyActivationsLimit == other.licenseKeyActivationsLimit && licenseKeyDuration == other.licenseKeyDuration && licenseKeyEnabled == other.licenseKeyEnabled && name == other.name && price == other.price && taxCategory == other.taxCategory && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, imageId, licenseKeyActivationMessage, licenseKeyActivationsLimit, licenseKeyDuration, licenseKeyEnabled, name, price, taxCategory, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, imageId=$imageId, licenseKeyActivationMessage=$licenseKeyActivationMessage, licenseKeyActivationsLimit=$licenseKeyActivationsLimit, licenseKeyDuration=$licenseKeyDuration, licenseKeyEnabled=$licenseKeyEnabled, name=$name, price=$price, taxCategory=$taxCategory, additionalProperties=$additionalProperties}"
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

    @NoAutoDetect
    class LicenseKeyDuration
    @JsonCreator
    private constructor(
        @JsonProperty("count")
        @ExcludeMissing
        private val count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("interval")
        @ExcludeMissing
        private val interval: JsonField<Interval> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun count(): Long = count.getRequired("count")

        fun interval(): Interval = interval.getRequired("interval")

        @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

        @JsonProperty("interval") @ExcludeMissing fun _interval(): JsonField<Interval> = interval

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LicenseKeyDuration = apply {
            if (validated) {
                return@apply
            }

            count()
            interval()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LicenseKeyDuration].
             *
             * The following fields are required:
             * ```kotlin
             * .count()
             * .interval()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LicenseKeyDuration]. */
        class Builder internal constructor() {

            private var count: JsonField<Long>? = null
            private var interval: JsonField<Interval>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(licenseKeyDuration: LicenseKeyDuration) = apply {
                count = licenseKeyDuration.count
                interval = licenseKeyDuration.interval
                additionalProperties = licenseKeyDuration.additionalProperties.toMutableMap()
            }

            fun count(count: Long) = count(JsonField.of(count))

            fun count(count: JsonField<Long>) = apply { this.count = count }

            fun interval(interval: Interval) = interval(JsonField.of(interval))

            fun interval(interval: JsonField<Interval>) = apply { this.interval = interval }

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

            fun build(): LicenseKeyDuration =
                LicenseKeyDuration(
                    checkRequired("count", count),
                    checkRequired("interval", interval),
                    additionalProperties.toImmutable(),
                )
        }

        class Interval @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val DAY = of("Day")

                val WEEK = of("Week")

                val MONTH = of("Month")

                val YEAR = of("Year")

                fun of(value: String) = Interval(JsonField.of(value))
            }

            /** An enum containing [Interval]'s known values. */
            enum class Known {
                DAY,
                WEEK,
                MONTH,
                YEAR,
            }

            /**
             * An enum containing [Interval]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Interval] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAY,
                WEEK,
                MONTH,
                YEAR,
                /**
                 * An enum member indicating that [Interval] was instantiated with an unknown value.
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
                    DAY -> Value.DAY
                    WEEK -> Value.WEEK
                    MONTH -> Value.MONTH
                    YEAR -> Value.YEAR
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
                    DAY -> Known.DAY
                    WEEK -> Known.WEEK
                    MONTH -> Known.MONTH
                    YEAR -> Known.YEAR
                    else -> throw DodoPaymentsInvalidDataException("Unknown Interval: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Interval && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LicenseKeyDuration && count == other.count && interval == other.interval && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(count, interval, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LicenseKeyDuration{count=$count, interval=$interval, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Price.Deserializer::class)
    @JsonSerialize(using = Price.Serializer::class)
    class Price
    private constructor(
        private val oneTime: OneTimePrice? = null,
        private val recurring: RecurringPrice? = null,
        private val _json: JsonValue? = null,
    ) {

        fun oneTime(): OneTimePrice? = oneTime

        fun recurring(): RecurringPrice? = recurring

        fun isOneTime(): Boolean = oneTime != null

        fun isRecurring(): Boolean = recurring != null

        fun asOneTime(): OneTimePrice = oneTime.getOrThrow("oneTime")

        fun asRecurring(): RecurringPrice = recurring.getOrThrow("recurring")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                oneTime != null -> visitor.visitOneTime(oneTime)
                recurring != null -> visitor.visitRecurring(recurring)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Price = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOneTime(oneTime: OneTimePrice) {
                        oneTime.validate()
                    }

                    override fun visitRecurring(recurring: RecurringPrice) {
                        recurring.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Price && oneTime == other.oneTime && recurring == other.recurring /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(oneTime, recurring) /* spotless:on */

        override fun toString(): String =
            when {
                oneTime != null -> "Price{oneTime=$oneTime}"
                recurring != null -> "Price{recurring=$recurring}"
                _json != null -> "Price{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Price")
            }

        companion object {

            fun ofOneTime(oneTime: OneTimePrice) = Price(oneTime = oneTime)

            fun ofRecurring(recurring: RecurringPrice) = Price(recurring = recurring)
        }

        /** An interface that defines how to map each variant of [Price] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitOneTime(oneTime: OneTimePrice): T

            fun visitRecurring(recurring: RecurringPrice): T

            /**
             * Maps an unknown variant of [Price] to a value of type [T].
             *
             * An instance of [Price] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown Price: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Price>(Price::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Price {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "one_time_price" -> {
                        tryDeserialize(node, jacksonTypeRef<OneTimePrice>()) { it.validate() }
                            ?.let {
                                return Price(oneTime = it, _json = json)
                            }
                    }
                    "recurring_price" -> {
                        tryDeserialize(node, jacksonTypeRef<RecurringPrice>()) { it.validate() }
                            ?.let {
                                return Price(recurring = it, _json = json)
                            }
                    }
                }

                return Price(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Price>(Price::class) {

            override fun serialize(
                value: Price,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.oneTime != null -> generator.writeObject(value.oneTime)
                    value.recurring != null -> generator.writeObject(value.recurring)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Price")
                }
            }
        }

        @NoAutoDetect
        class OneTimePrice
        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount")
            @ExcludeMissing
            private val discount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("price")
            @ExcludeMissing
            private val price: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            private val purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("pay_what_you_want")
            @ExcludeMissing
            private val payWhatYouWant: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("suggested_price")
            @ExcludeMissing
            private val suggestedPrice: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            private val taxInclusive: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun currency(): Currency = currency.getRequired("currency")

            /** Discount applied to the price, represented as a percentage (0 to 100). */
            fun discount(): Double = discount.getRequired("discount")

            /**
             * The payment amount, in the smallest denomination of the currency (e.g., cents for
             * USD). For example, to charge $1.00, pass `100`.
             *
             * If [`pay_what_you_want`](Self::pay_what_you_want) is set to `true`, this field
             * represents the **minimum** amount the customer must pay.
             */
            fun price(): Long = price.getRequired("price")

            /**
             * Indicates if purchasing power parity adjustments are applied to the price. Purchasing
             * power parity feature is not available as of now.
             */
            fun purchasingPowerParity(): Boolean =
                purchasingPowerParity.getRequired("purchasing_power_parity")

            fun type(): Type = type.getRequired("type")

            /**
             * Indicates whether the customer can pay any amount they choose. If set to `true`, the
             * [`price`](Self::price) field is the minimum amount.
             */
            fun payWhatYouWant(): Boolean? = payWhatYouWant.getNullable("pay_what_you_want")

            /**
             * A suggested price for the user to pay. This value is only considered if
             * [`pay_what_you_want`](Self::pay_what_you_want) is `true`. Otherwise, it is ignored.
             */
            fun suggestedPrice(): Long? = suggestedPrice.getNullable("suggested_price")

            /** Indicates if the price is tax inclusive. */
            fun taxInclusive(): Boolean? = taxInclusive.getNullable("tax_inclusive")

            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** Discount applied to the price, represented as a percentage (0 to 100). */
            @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Double> = discount

            /**
             * The payment amount, in the smallest denomination of the currency (e.g., cents for
             * USD). For example, to charge $1.00, pass `100`.
             *
             * If [`pay_what_you_want`](Self::pay_what_you_want) is set to `true`, this field
             * represents the **minimum** amount the customer must pay.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Long> = price

            /**
             * Indicates if purchasing power parity adjustments are applied to the price. Purchasing
             * power parity feature is not available as of now.
             */
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            fun _purchasingPowerParity(): JsonField<Boolean> = purchasingPowerParity

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Indicates whether the customer can pay any amount they choose. If set to `true`, the
             * [`price`](Self::price) field is the minimum amount.
             */
            @JsonProperty("pay_what_you_want")
            @ExcludeMissing
            fun _payWhatYouWant(): JsonField<Boolean> = payWhatYouWant

            /**
             * A suggested price for the user to pay. This value is only considered if
             * [`pay_what_you_want`](Self::pay_what_you_want) is `true`. Otherwise, it is ignored.
             */
            @JsonProperty("suggested_price")
            @ExcludeMissing
            fun _suggestedPrice(): JsonField<Long> = suggestedPrice

            /** Indicates if the price is tax inclusive. */
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            fun _taxInclusive(): JsonField<Boolean> = taxInclusive

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OneTimePrice = apply {
                if (validated) {
                    return@apply
                }

                currency()
                discount()
                price()
                purchasingPowerParity()
                type()
                payWhatYouWant()
                suggestedPrice()
                taxInclusive()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [OneTimePrice].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * .discount()
                 * .price()
                 * .purchasingPowerParity()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [OneTimePrice]. */
            class Builder internal constructor() {

                private var currency: JsonField<Currency>? = null
                private var discount: JsonField<Double>? = null
                private var price: JsonField<Long>? = null
                private var purchasingPowerParity: JsonField<Boolean>? = null
                private var type: JsonField<Type>? = null
                private var payWhatYouWant: JsonField<Boolean> = JsonMissing.of()
                private var suggestedPrice: JsonField<Long> = JsonMissing.of()
                private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(oneTimePrice: OneTimePrice) = apply {
                    currency = oneTimePrice.currency
                    discount = oneTimePrice.discount
                    price = oneTimePrice.price
                    purchasingPowerParity = oneTimePrice.purchasingPowerParity
                    type = oneTimePrice.type
                    payWhatYouWant = oneTimePrice.payWhatYouWant
                    suggestedPrice = oneTimePrice.suggestedPrice
                    taxInclusive = oneTimePrice.taxInclusive
                    additionalProperties = oneTimePrice.additionalProperties.toMutableMap()
                }

                fun currency(currency: Currency) = currency(JsonField.of(currency))

                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** Discount applied to the price, represented as a percentage (0 to 100). */
                fun discount(discount: Double) = discount(JsonField.of(discount))

                /** Discount applied to the price, represented as a percentage (0 to 100). */
                fun discount(discount: JsonField<Double>) = apply { this.discount = discount }

                /**
                 * The payment amount, in the smallest denomination of the currency (e.g., cents for
                 * USD). For example, to charge $1.00, pass `100`.
                 *
                 * If [`pay_what_you_want`](Self::pay_what_you_want) is set to `true`, this field
                 * represents the **minimum** amount the customer must pay.
                 */
                fun price(price: Long) = price(JsonField.of(price))

                /**
                 * The payment amount, in the smallest denomination of the currency (e.g., cents for
                 * USD). For example, to charge $1.00, pass `100`.
                 *
                 * If [`pay_what_you_want`](Self::pay_what_you_want) is set to `true`, this field
                 * represents the **minimum** amount the customer must pay.
                 */
                fun price(price: JsonField<Long>) = apply { this.price = price }

                /**
                 * Indicates if purchasing power parity adjustments are applied to the price.
                 * Purchasing power parity feature is not available as of now.
                 */
                fun purchasingPowerParity(purchasingPowerParity: Boolean) =
                    purchasingPowerParity(JsonField.of(purchasingPowerParity))

                /**
                 * Indicates if purchasing power parity adjustments are applied to the price.
                 * Purchasing power parity feature is not available as of now.
                 */
                fun purchasingPowerParity(purchasingPowerParity: JsonField<Boolean>) = apply {
                    this.purchasingPowerParity = purchasingPowerParity
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Indicates whether the customer can pay any amount they choose. If set to `true`,
                 * the [`price`](Self::price) field is the minimum amount.
                 */
                fun payWhatYouWant(payWhatYouWant: Boolean) =
                    payWhatYouWant(JsonField.of(payWhatYouWant))

                /**
                 * Indicates whether the customer can pay any amount they choose. If set to `true`,
                 * the [`price`](Self::price) field is the minimum amount.
                 */
                fun payWhatYouWant(payWhatYouWant: JsonField<Boolean>) = apply {
                    this.payWhatYouWant = payWhatYouWant
                }

                /**
                 * A suggested price for the user to pay. This value is only considered if
                 * [`pay_what_you_want`](Self::pay_what_you_want) is `true`. Otherwise, it is
                 * ignored.
                 */
                fun suggestedPrice(suggestedPrice: Long?) =
                    suggestedPrice(JsonField.ofNullable(suggestedPrice))

                /**
                 * A suggested price for the user to pay. This value is only considered if
                 * [`pay_what_you_want`](Self::pay_what_you_want) is `true`. Otherwise, it is
                 * ignored.
                 */
                fun suggestedPrice(suggestedPrice: Long) = suggestedPrice(suggestedPrice as Long?)

                /**
                 * A suggested price for the user to pay. This value is only considered if
                 * [`pay_what_you_want`](Self::pay_what_you_want) is `true`. Otherwise, it is
                 * ignored.
                 */
                fun suggestedPrice(suggestedPrice: JsonField<Long>) = apply {
                    this.suggestedPrice = suggestedPrice
                }

                /** Indicates if the price is tax inclusive. */
                fun taxInclusive(taxInclusive: Boolean?) =
                    taxInclusive(JsonField.ofNullable(taxInclusive))

                /** Indicates if the price is tax inclusive. */
                fun taxInclusive(taxInclusive: Boolean) = taxInclusive(taxInclusive as Boolean?)

                /** Indicates if the price is tax inclusive. */
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

                fun build(): OneTimePrice =
                    OneTimePrice(
                        checkRequired("currency", currency),
                        checkRequired("discount", discount),
                        checkRequired("price", price),
                        checkRequired("purchasingPowerParity", purchasingPowerParity),
                        checkRequired("type", type),
                        payWhatYouWant,
                        suggestedPrice,
                        taxInclusive,
                        additionalProperties.toImmutable(),
                    )
            }

            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AED = of("AED")

                    val ALL = of("ALL")

                    val AMD = of("AMD")

                    val ANG = of("ANG")

                    val AOA = of("AOA")

                    val ARS = of("ARS")

                    val AUD = of("AUD")

                    val AWG = of("AWG")

                    val AZN = of("AZN")

                    val BAM = of("BAM")

                    val BBD = of("BBD")

                    val BDT = of("BDT")

                    val BGN = of("BGN")

                    val BHD = of("BHD")

                    val BIF = of("BIF")

                    val BMD = of("BMD")

                    val BND = of("BND")

                    val BOB = of("BOB")

                    val BRL = of("BRL")

                    val BSD = of("BSD")

                    val BWP = of("BWP")

                    val BYN = of("BYN")

                    val BZD = of("BZD")

                    val CAD = of("CAD")

                    val CHF = of("CHF")

                    val CLP = of("CLP")

                    val CNY = of("CNY")

                    val COP = of("COP")

                    val CRC = of("CRC")

                    val CUP = of("CUP")

                    val CVE = of("CVE")

                    val CZK = of("CZK")

                    val DJF = of("DJF")

                    val DKK = of("DKK")

                    val DOP = of("DOP")

                    val DZD = of("DZD")

                    val EGP = of("EGP")

                    val ETB = of("ETB")

                    val EUR = of("EUR")

                    val FJD = of("FJD")

                    val FKP = of("FKP")

                    val GBP = of("GBP")

                    val GEL = of("GEL")

                    val GHS = of("GHS")

                    val GIP = of("GIP")

                    val GMD = of("GMD")

                    val GNF = of("GNF")

                    val GTQ = of("GTQ")

                    val GYD = of("GYD")

                    val HKD = of("HKD")

                    val HNL = of("HNL")

                    val HRK = of("HRK")

                    val HTG = of("HTG")

                    val HUF = of("HUF")

                    val IDR = of("IDR")

                    val ILS = of("ILS")

                    val INR = of("INR")

                    val IQD = of("IQD")

                    val JMD = of("JMD")

                    val JOD = of("JOD")

                    val JPY = of("JPY")

                    val KES = of("KES")

                    val KGS = of("KGS")

                    val KHR = of("KHR")

                    val KMF = of("KMF")

                    val KRW = of("KRW")

                    val KWD = of("KWD")

                    val KYD = of("KYD")

                    val KZT = of("KZT")

                    val LAK = of("LAK")

                    val LBP = of("LBP")

                    val LKR = of("LKR")

                    val LRD = of("LRD")

                    val LSL = of("LSL")

                    val LYD = of("LYD")

                    val MAD = of("MAD")

                    val MDL = of("MDL")

                    val MGA = of("MGA")

                    val MKD = of("MKD")

                    val MMK = of("MMK")

                    val MNT = of("MNT")

                    val MOP = of("MOP")

                    val MRU = of("MRU")

                    val MUR = of("MUR")

                    val MVR = of("MVR")

                    val MWK = of("MWK")

                    val MXN = of("MXN")

                    val MYR = of("MYR")

                    val MZN = of("MZN")

                    val NAD = of("NAD")

                    val NGN = of("NGN")

                    val NIO = of("NIO")

                    val NOK = of("NOK")

                    val NPR = of("NPR")

                    val NZD = of("NZD")

                    val OMR = of("OMR")

                    val PAB = of("PAB")

                    val PEN = of("PEN")

                    val PGK = of("PGK")

                    val PHP = of("PHP")

                    val PKR = of("PKR")

                    val PLN = of("PLN")

                    val PYG = of("PYG")

                    val QAR = of("QAR")

                    val RON = of("RON")

                    val RSD = of("RSD")

                    val RUB = of("RUB")

                    val RWF = of("RWF")

                    val SAR = of("SAR")

                    val SBD = of("SBD")

                    val SCR = of("SCR")

                    val SEK = of("SEK")

                    val SGD = of("SGD")

                    val SHP = of("SHP")

                    val SLE = of("SLE")

                    val SLL = of("SLL")

                    val SOS = of("SOS")

                    val SRD = of("SRD")

                    val SSP = of("SSP")

                    val STN = of("STN")

                    val SVC = of("SVC")

                    val SZL = of("SZL")

                    val THB = of("THB")

                    val TND = of("TND")

                    val TOP = of("TOP")

                    val TRY = of("TRY")

                    val TTD = of("TTD")

                    val TWD = of("TWD")

                    val TZS = of("TZS")

                    val UAH = of("UAH")

                    val UGX = of("UGX")

                    val USD = of("USD")

                    val UYU = of("UYU")

                    val UZS = of("UZS")

                    val VES = of("VES")

                    val VND = of("VND")

                    val VUV = of("VUV")

                    val WST = of("WST")

                    val XAF = of("XAF")

                    val XCD = of("XCD")

                    val XOF = of("XOF")

                    val XPF = of("XPF")

                    val YER = of("YER")

                    val ZAR = of("ZAR")

                    val ZMW = of("ZMW")

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                /** An enum containing [Currency]'s known values. */
                enum class Known {
                    AED,
                    ALL,
                    AMD,
                    ANG,
                    AOA,
                    ARS,
                    AUD,
                    AWG,
                    AZN,
                    BAM,
                    BBD,
                    BDT,
                    BGN,
                    BHD,
                    BIF,
                    BMD,
                    BND,
                    BOB,
                    BRL,
                    BSD,
                    BWP,
                    BYN,
                    BZD,
                    CAD,
                    CHF,
                    CLP,
                    CNY,
                    COP,
                    CRC,
                    CUP,
                    CVE,
                    CZK,
                    DJF,
                    DKK,
                    DOP,
                    DZD,
                    EGP,
                    ETB,
                    EUR,
                    FJD,
                    FKP,
                    GBP,
                    GEL,
                    GHS,
                    GIP,
                    GMD,
                    GNF,
                    GTQ,
                    GYD,
                    HKD,
                    HNL,
                    HRK,
                    HTG,
                    HUF,
                    IDR,
                    ILS,
                    INR,
                    IQD,
                    JMD,
                    JOD,
                    JPY,
                    KES,
                    KGS,
                    KHR,
                    KMF,
                    KRW,
                    KWD,
                    KYD,
                    KZT,
                    LAK,
                    LBP,
                    LKR,
                    LRD,
                    LSL,
                    LYD,
                    MAD,
                    MDL,
                    MGA,
                    MKD,
                    MMK,
                    MNT,
                    MOP,
                    MRU,
                    MUR,
                    MVR,
                    MWK,
                    MXN,
                    MYR,
                    MZN,
                    NAD,
                    NGN,
                    NIO,
                    NOK,
                    NPR,
                    NZD,
                    OMR,
                    PAB,
                    PEN,
                    PGK,
                    PHP,
                    PKR,
                    PLN,
                    PYG,
                    QAR,
                    RON,
                    RSD,
                    RUB,
                    RWF,
                    SAR,
                    SBD,
                    SCR,
                    SEK,
                    SGD,
                    SHP,
                    SLE,
                    SLL,
                    SOS,
                    SRD,
                    SSP,
                    STN,
                    SVC,
                    SZL,
                    THB,
                    TND,
                    TOP,
                    TRY,
                    TTD,
                    TWD,
                    TZS,
                    UAH,
                    UGX,
                    USD,
                    UYU,
                    UZS,
                    VES,
                    VND,
                    VUV,
                    WST,
                    XAF,
                    XCD,
                    XOF,
                    XPF,
                    YER,
                    ZAR,
                    ZMW,
                }

                /**
                 * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Currency] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AED,
                    ALL,
                    AMD,
                    ANG,
                    AOA,
                    ARS,
                    AUD,
                    AWG,
                    AZN,
                    BAM,
                    BBD,
                    BDT,
                    BGN,
                    BHD,
                    BIF,
                    BMD,
                    BND,
                    BOB,
                    BRL,
                    BSD,
                    BWP,
                    BYN,
                    BZD,
                    CAD,
                    CHF,
                    CLP,
                    CNY,
                    COP,
                    CRC,
                    CUP,
                    CVE,
                    CZK,
                    DJF,
                    DKK,
                    DOP,
                    DZD,
                    EGP,
                    ETB,
                    EUR,
                    FJD,
                    FKP,
                    GBP,
                    GEL,
                    GHS,
                    GIP,
                    GMD,
                    GNF,
                    GTQ,
                    GYD,
                    HKD,
                    HNL,
                    HRK,
                    HTG,
                    HUF,
                    IDR,
                    ILS,
                    INR,
                    IQD,
                    JMD,
                    JOD,
                    JPY,
                    KES,
                    KGS,
                    KHR,
                    KMF,
                    KRW,
                    KWD,
                    KYD,
                    KZT,
                    LAK,
                    LBP,
                    LKR,
                    LRD,
                    LSL,
                    LYD,
                    MAD,
                    MDL,
                    MGA,
                    MKD,
                    MMK,
                    MNT,
                    MOP,
                    MRU,
                    MUR,
                    MVR,
                    MWK,
                    MXN,
                    MYR,
                    MZN,
                    NAD,
                    NGN,
                    NIO,
                    NOK,
                    NPR,
                    NZD,
                    OMR,
                    PAB,
                    PEN,
                    PGK,
                    PHP,
                    PKR,
                    PLN,
                    PYG,
                    QAR,
                    RON,
                    RSD,
                    RUB,
                    RWF,
                    SAR,
                    SBD,
                    SCR,
                    SEK,
                    SGD,
                    SHP,
                    SLE,
                    SLL,
                    SOS,
                    SRD,
                    SSP,
                    STN,
                    SVC,
                    SZL,
                    THB,
                    TND,
                    TOP,
                    TRY,
                    TTD,
                    TWD,
                    TZS,
                    UAH,
                    UGX,
                    USD,
                    UYU,
                    UZS,
                    VES,
                    VND,
                    VUV,
                    WST,
                    XAF,
                    XCD,
                    XOF,
                    XPF,
                    YER,
                    ZAR,
                    ZMW,
                    /**
                     * An enum member indicating that [Currency] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AED -> Value.AED
                        ALL -> Value.ALL
                        AMD -> Value.AMD
                        ANG -> Value.ANG
                        AOA -> Value.AOA
                        ARS -> Value.ARS
                        AUD -> Value.AUD
                        AWG -> Value.AWG
                        AZN -> Value.AZN
                        BAM -> Value.BAM
                        BBD -> Value.BBD
                        BDT -> Value.BDT
                        BGN -> Value.BGN
                        BHD -> Value.BHD
                        BIF -> Value.BIF
                        BMD -> Value.BMD
                        BND -> Value.BND
                        BOB -> Value.BOB
                        BRL -> Value.BRL
                        BSD -> Value.BSD
                        BWP -> Value.BWP
                        BYN -> Value.BYN
                        BZD -> Value.BZD
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        CLP -> Value.CLP
                        CNY -> Value.CNY
                        COP -> Value.COP
                        CRC -> Value.CRC
                        CUP -> Value.CUP
                        CVE -> Value.CVE
                        CZK -> Value.CZK
                        DJF -> Value.DJF
                        DKK -> Value.DKK
                        DOP -> Value.DOP
                        DZD -> Value.DZD
                        EGP -> Value.EGP
                        ETB -> Value.ETB
                        EUR -> Value.EUR
                        FJD -> Value.FJD
                        FKP -> Value.FKP
                        GBP -> Value.GBP
                        GEL -> Value.GEL
                        GHS -> Value.GHS
                        GIP -> Value.GIP
                        GMD -> Value.GMD
                        GNF -> Value.GNF
                        GTQ -> Value.GTQ
                        GYD -> Value.GYD
                        HKD -> Value.HKD
                        HNL -> Value.HNL
                        HRK -> Value.HRK
                        HTG -> Value.HTG
                        HUF -> Value.HUF
                        IDR -> Value.IDR
                        ILS -> Value.ILS
                        INR -> Value.INR
                        IQD -> Value.IQD
                        JMD -> Value.JMD
                        JOD -> Value.JOD
                        JPY -> Value.JPY
                        KES -> Value.KES
                        KGS -> Value.KGS
                        KHR -> Value.KHR
                        KMF -> Value.KMF
                        KRW -> Value.KRW
                        KWD -> Value.KWD
                        KYD -> Value.KYD
                        KZT -> Value.KZT
                        LAK -> Value.LAK
                        LBP -> Value.LBP
                        LKR -> Value.LKR
                        LRD -> Value.LRD
                        LSL -> Value.LSL
                        LYD -> Value.LYD
                        MAD -> Value.MAD
                        MDL -> Value.MDL
                        MGA -> Value.MGA
                        MKD -> Value.MKD
                        MMK -> Value.MMK
                        MNT -> Value.MNT
                        MOP -> Value.MOP
                        MRU -> Value.MRU
                        MUR -> Value.MUR
                        MVR -> Value.MVR
                        MWK -> Value.MWK
                        MXN -> Value.MXN
                        MYR -> Value.MYR
                        MZN -> Value.MZN
                        NAD -> Value.NAD
                        NGN -> Value.NGN
                        NIO -> Value.NIO
                        NOK -> Value.NOK
                        NPR -> Value.NPR
                        NZD -> Value.NZD
                        OMR -> Value.OMR
                        PAB -> Value.PAB
                        PEN -> Value.PEN
                        PGK -> Value.PGK
                        PHP -> Value.PHP
                        PKR -> Value.PKR
                        PLN -> Value.PLN
                        PYG -> Value.PYG
                        QAR -> Value.QAR
                        RON -> Value.RON
                        RSD -> Value.RSD
                        RUB -> Value.RUB
                        RWF -> Value.RWF
                        SAR -> Value.SAR
                        SBD -> Value.SBD
                        SCR -> Value.SCR
                        SEK -> Value.SEK
                        SGD -> Value.SGD
                        SHP -> Value.SHP
                        SLE -> Value.SLE
                        SLL -> Value.SLL
                        SOS -> Value.SOS
                        SRD -> Value.SRD
                        SSP -> Value.SSP
                        STN -> Value.STN
                        SVC -> Value.SVC
                        SZL -> Value.SZL
                        THB -> Value.THB
                        TND -> Value.TND
                        TOP -> Value.TOP
                        TRY -> Value.TRY
                        TTD -> Value.TTD
                        TWD -> Value.TWD
                        TZS -> Value.TZS
                        UAH -> Value.UAH
                        UGX -> Value.UGX
                        USD -> Value.USD
                        UYU -> Value.UYU
                        UZS -> Value.UZS
                        VES -> Value.VES
                        VND -> Value.VND
                        VUV -> Value.VUV
                        WST -> Value.WST
                        XAF -> Value.XAF
                        XCD -> Value.XCD
                        XOF -> Value.XOF
                        XPF -> Value.XPF
                        YER -> Value.YER
                        ZAR -> Value.ZAR
                        ZMW -> Value.ZMW
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AED -> Known.AED
                        ALL -> Known.ALL
                        AMD -> Known.AMD
                        ANG -> Known.ANG
                        AOA -> Known.AOA
                        ARS -> Known.ARS
                        AUD -> Known.AUD
                        AWG -> Known.AWG
                        AZN -> Known.AZN
                        BAM -> Known.BAM
                        BBD -> Known.BBD
                        BDT -> Known.BDT
                        BGN -> Known.BGN
                        BHD -> Known.BHD
                        BIF -> Known.BIF
                        BMD -> Known.BMD
                        BND -> Known.BND
                        BOB -> Known.BOB
                        BRL -> Known.BRL
                        BSD -> Known.BSD
                        BWP -> Known.BWP
                        BYN -> Known.BYN
                        BZD -> Known.BZD
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        CLP -> Known.CLP
                        CNY -> Known.CNY
                        COP -> Known.COP
                        CRC -> Known.CRC
                        CUP -> Known.CUP
                        CVE -> Known.CVE
                        CZK -> Known.CZK
                        DJF -> Known.DJF
                        DKK -> Known.DKK
                        DOP -> Known.DOP
                        DZD -> Known.DZD
                        EGP -> Known.EGP
                        ETB -> Known.ETB
                        EUR -> Known.EUR
                        FJD -> Known.FJD
                        FKP -> Known.FKP
                        GBP -> Known.GBP
                        GEL -> Known.GEL
                        GHS -> Known.GHS
                        GIP -> Known.GIP
                        GMD -> Known.GMD
                        GNF -> Known.GNF
                        GTQ -> Known.GTQ
                        GYD -> Known.GYD
                        HKD -> Known.HKD
                        HNL -> Known.HNL
                        HRK -> Known.HRK
                        HTG -> Known.HTG
                        HUF -> Known.HUF
                        IDR -> Known.IDR
                        ILS -> Known.ILS
                        INR -> Known.INR
                        IQD -> Known.IQD
                        JMD -> Known.JMD
                        JOD -> Known.JOD
                        JPY -> Known.JPY
                        KES -> Known.KES
                        KGS -> Known.KGS
                        KHR -> Known.KHR
                        KMF -> Known.KMF
                        KRW -> Known.KRW
                        KWD -> Known.KWD
                        KYD -> Known.KYD
                        KZT -> Known.KZT
                        LAK -> Known.LAK
                        LBP -> Known.LBP
                        LKR -> Known.LKR
                        LRD -> Known.LRD
                        LSL -> Known.LSL
                        LYD -> Known.LYD
                        MAD -> Known.MAD
                        MDL -> Known.MDL
                        MGA -> Known.MGA
                        MKD -> Known.MKD
                        MMK -> Known.MMK
                        MNT -> Known.MNT
                        MOP -> Known.MOP
                        MRU -> Known.MRU
                        MUR -> Known.MUR
                        MVR -> Known.MVR
                        MWK -> Known.MWK
                        MXN -> Known.MXN
                        MYR -> Known.MYR
                        MZN -> Known.MZN
                        NAD -> Known.NAD
                        NGN -> Known.NGN
                        NIO -> Known.NIO
                        NOK -> Known.NOK
                        NPR -> Known.NPR
                        NZD -> Known.NZD
                        OMR -> Known.OMR
                        PAB -> Known.PAB
                        PEN -> Known.PEN
                        PGK -> Known.PGK
                        PHP -> Known.PHP
                        PKR -> Known.PKR
                        PLN -> Known.PLN
                        PYG -> Known.PYG
                        QAR -> Known.QAR
                        RON -> Known.RON
                        RSD -> Known.RSD
                        RUB -> Known.RUB
                        RWF -> Known.RWF
                        SAR -> Known.SAR
                        SBD -> Known.SBD
                        SCR -> Known.SCR
                        SEK -> Known.SEK
                        SGD -> Known.SGD
                        SHP -> Known.SHP
                        SLE -> Known.SLE
                        SLL -> Known.SLL
                        SOS -> Known.SOS
                        SRD -> Known.SRD
                        SSP -> Known.SSP
                        STN -> Known.STN
                        SVC -> Known.SVC
                        SZL -> Known.SZL
                        THB -> Known.THB
                        TND -> Known.TND
                        TOP -> Known.TOP
                        TRY -> Known.TRY
                        TTD -> Known.TTD
                        TWD -> Known.TWD
                        TZS -> Known.TZS
                        UAH -> Known.UAH
                        UGX -> Known.UGX
                        USD -> Known.USD
                        UYU -> Known.UYU
                        UZS -> Known.UZS
                        VES -> Known.VES
                        VND -> Known.VND
                        VUV -> Known.VUV
                        WST -> Known.WST
                        XAF -> Known.XAF
                        XCD -> Known.XCD
                        XOF -> Known.XOF
                        XPF -> Known.XPF
                        YER -> Known.YER
                        ZAR -> Known.ZAR
                        ZMW -> Known.ZMW
                        else -> throw DodoPaymentsInvalidDataException("Unknown Currency: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ONE_TIME_PRICE = of("one_time_price")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ONE_TIME_PRICE
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ONE_TIME_PRICE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ONE_TIME_PRICE -> Value.ONE_TIME_PRICE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ONE_TIME_PRICE -> Known.ONE_TIME_PRICE
                        else -> throw DodoPaymentsInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OneTimePrice && currency == other.currency && discount == other.discount && price == other.price && purchasingPowerParity == other.purchasingPowerParity && type == other.type && payWhatYouWant == other.payWhatYouWant && suggestedPrice == other.suggestedPrice && taxInclusive == other.taxInclusive && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(currency, discount, price, purchasingPowerParity, type, payWhatYouWant, suggestedPrice, taxInclusive, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OneTimePrice{currency=$currency, discount=$discount, price=$price, purchasingPowerParity=$purchasingPowerParity, type=$type, payWhatYouWant=$payWhatYouWant, suggestedPrice=$suggestedPrice, taxInclusive=$taxInclusive, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class RecurringPrice
        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("discount")
            @ExcludeMissing
            private val discount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("payment_frequency_count")
            @ExcludeMissing
            private val paymentFrequencyCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("payment_frequency_interval")
            @ExcludeMissing
            private val paymentFrequencyInterval: JsonField<PaymentFrequencyInterval> =
                JsonMissing.of(),
            @JsonProperty("price")
            @ExcludeMissing
            private val price: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            private val purchasingPowerParity: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subscription_period_count")
            @ExcludeMissing
            private val subscriptionPeriodCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("subscription_period_interval")
            @ExcludeMissing
            private val subscriptionPeriodInterval: JsonField<SubscriptionPeriodInterval> =
                JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            private val taxInclusive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            private val trialPeriodDays: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun currency(): Currency = currency.getRequired("currency")

            /** Discount applied to the price, represented as a percentage (0 to 100). */
            fun discount(): Double = discount.getRequired("discount")

            /**
             * Number of units for the payment frequency. For example, a value of `1` with a
             * `payment_frequency_interval` of `month` represents monthly payments.
             */
            fun paymentFrequencyCount(): Long =
                paymentFrequencyCount.getRequired("payment_frequency_count")

            fun paymentFrequencyInterval(): PaymentFrequencyInterval =
                paymentFrequencyInterval.getRequired("payment_frequency_interval")

            /**
             * The payment amount. Represented in the lowest denomination of the currency (e.g.,
             * cents for USD). For example, to charge $1.00, pass `100`.
             */
            fun price(): Long = price.getRequired("price")

            /**
             * Indicates if purchasing power parity adjustments are applied to the price. Purchasing
             * power parity feature is not available as of now
             */
            fun purchasingPowerParity(): Boolean =
                purchasingPowerParity.getRequired("purchasing_power_parity")

            /**
             * Number of units for the subscription period. For example, a value of `12` with a
             * `subscription_period_interval` of `month` represents a one-year subscription.
             */
            fun subscriptionPeriodCount(): Long =
                subscriptionPeriodCount.getRequired("subscription_period_count")

            fun subscriptionPeriodInterval(): SubscriptionPeriodInterval =
                subscriptionPeriodInterval.getRequired("subscription_period_interval")

            fun type(): Type = type.getRequired("type")

            /** Indicates if the price is tax inclusive */
            fun taxInclusive(): Boolean? = taxInclusive.getNullable("tax_inclusive")

            /** Number of days for the trial period. A value of `0` indicates no trial period. */
            fun trialPeriodDays(): Long? = trialPeriodDays.getNullable("trial_period_days")

            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** Discount applied to the price, represented as a percentage (0 to 100). */
            @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Double> = discount

            /**
             * Number of units for the payment frequency. For example, a value of `1` with a
             * `payment_frequency_interval` of `month` represents monthly payments.
             */
            @JsonProperty("payment_frequency_count")
            @ExcludeMissing
            fun _paymentFrequencyCount(): JsonField<Long> = paymentFrequencyCount

            @JsonProperty("payment_frequency_interval")
            @ExcludeMissing
            fun _paymentFrequencyInterval(): JsonField<PaymentFrequencyInterval> =
                paymentFrequencyInterval

            /**
             * The payment amount. Represented in the lowest denomination of the currency (e.g.,
             * cents for USD). For example, to charge $1.00, pass `100`.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Long> = price

            /**
             * Indicates if purchasing power parity adjustments are applied to the price. Purchasing
             * power parity feature is not available as of now
             */
            @JsonProperty("purchasing_power_parity")
            @ExcludeMissing
            fun _purchasingPowerParity(): JsonField<Boolean> = purchasingPowerParity

            /**
             * Number of units for the subscription period. For example, a value of `12` with a
             * `subscription_period_interval` of `month` represents a one-year subscription.
             */
            @JsonProperty("subscription_period_count")
            @ExcludeMissing
            fun _subscriptionPeriodCount(): JsonField<Long> = subscriptionPeriodCount

            @JsonProperty("subscription_period_interval")
            @ExcludeMissing
            fun _subscriptionPeriodInterval(): JsonField<SubscriptionPeriodInterval> =
                subscriptionPeriodInterval

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /** Indicates if the price is tax inclusive */
            @JsonProperty("tax_inclusive")
            @ExcludeMissing
            fun _taxInclusive(): JsonField<Boolean> = taxInclusive

            /** Number of days for the trial period. A value of `0` indicates no trial period. */
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            fun _trialPeriodDays(): JsonField<Long> = trialPeriodDays

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RecurringPrice = apply {
                if (validated) {
                    return@apply
                }

                currency()
                discount()
                paymentFrequencyCount()
                paymentFrequencyInterval()
                price()
                purchasingPowerParity()
                subscriptionPeriodCount()
                subscriptionPeriodInterval()
                type()
                taxInclusive()
                trialPeriodDays()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [RecurringPrice].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * .discount()
                 * .paymentFrequencyCount()
                 * .paymentFrequencyInterval()
                 * .price()
                 * .purchasingPowerParity()
                 * .subscriptionPeriodCount()
                 * .subscriptionPeriodInterval()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [RecurringPrice]. */
            class Builder internal constructor() {

                private var currency: JsonField<Currency>? = null
                private var discount: JsonField<Double>? = null
                private var paymentFrequencyCount: JsonField<Long>? = null
                private var paymentFrequencyInterval: JsonField<PaymentFrequencyInterval>? = null
                private var price: JsonField<Long>? = null
                private var purchasingPowerParity: JsonField<Boolean>? = null
                private var subscriptionPeriodCount: JsonField<Long>? = null
                private var subscriptionPeriodInterval: JsonField<SubscriptionPeriodInterval>? =
                    null
                private var type: JsonField<Type>? = null
                private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
                private var trialPeriodDays: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(recurringPrice: RecurringPrice) = apply {
                    currency = recurringPrice.currency
                    discount = recurringPrice.discount
                    paymentFrequencyCount = recurringPrice.paymentFrequencyCount
                    paymentFrequencyInterval = recurringPrice.paymentFrequencyInterval
                    price = recurringPrice.price
                    purchasingPowerParity = recurringPrice.purchasingPowerParity
                    subscriptionPeriodCount = recurringPrice.subscriptionPeriodCount
                    subscriptionPeriodInterval = recurringPrice.subscriptionPeriodInterval
                    type = recurringPrice.type
                    taxInclusive = recurringPrice.taxInclusive
                    trialPeriodDays = recurringPrice.trialPeriodDays
                    additionalProperties = recurringPrice.additionalProperties.toMutableMap()
                }

                fun currency(currency: Currency) = currency(JsonField.of(currency))

                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** Discount applied to the price, represented as a percentage (0 to 100). */
                fun discount(discount: Double) = discount(JsonField.of(discount))

                /** Discount applied to the price, represented as a percentage (0 to 100). */
                fun discount(discount: JsonField<Double>) = apply { this.discount = discount }

                /**
                 * Number of units for the payment frequency. For example, a value of `1` with a
                 * `payment_frequency_interval` of `month` represents monthly payments.
                 */
                fun paymentFrequencyCount(paymentFrequencyCount: Long) =
                    paymentFrequencyCount(JsonField.of(paymentFrequencyCount))

                /**
                 * Number of units for the payment frequency. For example, a value of `1` with a
                 * `payment_frequency_interval` of `month` represents monthly payments.
                 */
                fun paymentFrequencyCount(paymentFrequencyCount: JsonField<Long>) = apply {
                    this.paymentFrequencyCount = paymentFrequencyCount
                }

                fun paymentFrequencyInterval(paymentFrequencyInterval: PaymentFrequencyInterval) =
                    paymentFrequencyInterval(JsonField.of(paymentFrequencyInterval))

                fun paymentFrequencyInterval(
                    paymentFrequencyInterval: JsonField<PaymentFrequencyInterval>
                ) = apply { this.paymentFrequencyInterval = paymentFrequencyInterval }

                /**
                 * The payment amount. Represented in the lowest denomination of the currency (e.g.,
                 * cents for USD). For example, to charge $1.00, pass `100`.
                 */
                fun price(price: Long) = price(JsonField.of(price))

                /**
                 * The payment amount. Represented in the lowest denomination of the currency (e.g.,
                 * cents for USD). For example, to charge $1.00, pass `100`.
                 */
                fun price(price: JsonField<Long>) = apply { this.price = price }

                /**
                 * Indicates if purchasing power parity adjustments are applied to the price.
                 * Purchasing power parity feature is not available as of now
                 */
                fun purchasingPowerParity(purchasingPowerParity: Boolean) =
                    purchasingPowerParity(JsonField.of(purchasingPowerParity))

                /**
                 * Indicates if purchasing power parity adjustments are applied to the price.
                 * Purchasing power parity feature is not available as of now
                 */
                fun purchasingPowerParity(purchasingPowerParity: JsonField<Boolean>) = apply {
                    this.purchasingPowerParity = purchasingPowerParity
                }

                /**
                 * Number of units for the subscription period. For example, a value of `12` with a
                 * `subscription_period_interval` of `month` represents a one-year subscription.
                 */
                fun subscriptionPeriodCount(subscriptionPeriodCount: Long) =
                    subscriptionPeriodCount(JsonField.of(subscriptionPeriodCount))

                /**
                 * Number of units for the subscription period. For example, a value of `12` with a
                 * `subscription_period_interval` of `month` represents a one-year subscription.
                 */
                fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Long>) = apply {
                    this.subscriptionPeriodCount = subscriptionPeriodCount
                }

                fun subscriptionPeriodInterval(
                    subscriptionPeriodInterval: SubscriptionPeriodInterval
                ) = subscriptionPeriodInterval(JsonField.of(subscriptionPeriodInterval))

                fun subscriptionPeriodInterval(
                    subscriptionPeriodInterval: JsonField<SubscriptionPeriodInterval>
                ) = apply { this.subscriptionPeriodInterval = subscriptionPeriodInterval }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Indicates if the price is tax inclusive */
                fun taxInclusive(taxInclusive: Boolean?) =
                    taxInclusive(JsonField.ofNullable(taxInclusive))

                /** Indicates if the price is tax inclusive */
                fun taxInclusive(taxInclusive: Boolean) = taxInclusive(taxInclusive as Boolean?)

                /** Indicates if the price is tax inclusive */
                fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
                    this.taxInclusive = taxInclusive
                }

                /**
                 * Number of days for the trial period. A value of `0` indicates no trial period.
                 */
                fun trialPeriodDays(trialPeriodDays: Long) =
                    trialPeriodDays(JsonField.of(trialPeriodDays))

                /**
                 * Number of days for the trial period. A value of `0` indicates no trial period.
                 */
                fun trialPeriodDays(trialPeriodDays: JsonField<Long>) = apply {
                    this.trialPeriodDays = trialPeriodDays
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

                fun build(): RecurringPrice =
                    RecurringPrice(
                        checkRequired("currency", currency),
                        checkRequired("discount", discount),
                        checkRequired("paymentFrequencyCount", paymentFrequencyCount),
                        checkRequired("paymentFrequencyInterval", paymentFrequencyInterval),
                        checkRequired("price", price),
                        checkRequired("purchasingPowerParity", purchasingPowerParity),
                        checkRequired("subscriptionPeriodCount", subscriptionPeriodCount),
                        checkRequired("subscriptionPeriodInterval", subscriptionPeriodInterval),
                        checkRequired("type", type),
                        taxInclusive,
                        trialPeriodDays,
                        additionalProperties.toImmutable(),
                    )
            }

            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AED = of("AED")

                    val ALL = of("ALL")

                    val AMD = of("AMD")

                    val ANG = of("ANG")

                    val AOA = of("AOA")

                    val ARS = of("ARS")

                    val AUD = of("AUD")

                    val AWG = of("AWG")

                    val AZN = of("AZN")

                    val BAM = of("BAM")

                    val BBD = of("BBD")

                    val BDT = of("BDT")

                    val BGN = of("BGN")

                    val BHD = of("BHD")

                    val BIF = of("BIF")

                    val BMD = of("BMD")

                    val BND = of("BND")

                    val BOB = of("BOB")

                    val BRL = of("BRL")

                    val BSD = of("BSD")

                    val BWP = of("BWP")

                    val BYN = of("BYN")

                    val BZD = of("BZD")

                    val CAD = of("CAD")

                    val CHF = of("CHF")

                    val CLP = of("CLP")

                    val CNY = of("CNY")

                    val COP = of("COP")

                    val CRC = of("CRC")

                    val CUP = of("CUP")

                    val CVE = of("CVE")

                    val CZK = of("CZK")

                    val DJF = of("DJF")

                    val DKK = of("DKK")

                    val DOP = of("DOP")

                    val DZD = of("DZD")

                    val EGP = of("EGP")

                    val ETB = of("ETB")

                    val EUR = of("EUR")

                    val FJD = of("FJD")

                    val FKP = of("FKP")

                    val GBP = of("GBP")

                    val GEL = of("GEL")

                    val GHS = of("GHS")

                    val GIP = of("GIP")

                    val GMD = of("GMD")

                    val GNF = of("GNF")

                    val GTQ = of("GTQ")

                    val GYD = of("GYD")

                    val HKD = of("HKD")

                    val HNL = of("HNL")

                    val HRK = of("HRK")

                    val HTG = of("HTG")

                    val HUF = of("HUF")

                    val IDR = of("IDR")

                    val ILS = of("ILS")

                    val INR = of("INR")

                    val IQD = of("IQD")

                    val JMD = of("JMD")

                    val JOD = of("JOD")

                    val JPY = of("JPY")

                    val KES = of("KES")

                    val KGS = of("KGS")

                    val KHR = of("KHR")

                    val KMF = of("KMF")

                    val KRW = of("KRW")

                    val KWD = of("KWD")

                    val KYD = of("KYD")

                    val KZT = of("KZT")

                    val LAK = of("LAK")

                    val LBP = of("LBP")

                    val LKR = of("LKR")

                    val LRD = of("LRD")

                    val LSL = of("LSL")

                    val LYD = of("LYD")

                    val MAD = of("MAD")

                    val MDL = of("MDL")

                    val MGA = of("MGA")

                    val MKD = of("MKD")

                    val MMK = of("MMK")

                    val MNT = of("MNT")

                    val MOP = of("MOP")

                    val MRU = of("MRU")

                    val MUR = of("MUR")

                    val MVR = of("MVR")

                    val MWK = of("MWK")

                    val MXN = of("MXN")

                    val MYR = of("MYR")

                    val MZN = of("MZN")

                    val NAD = of("NAD")

                    val NGN = of("NGN")

                    val NIO = of("NIO")

                    val NOK = of("NOK")

                    val NPR = of("NPR")

                    val NZD = of("NZD")

                    val OMR = of("OMR")

                    val PAB = of("PAB")

                    val PEN = of("PEN")

                    val PGK = of("PGK")

                    val PHP = of("PHP")

                    val PKR = of("PKR")

                    val PLN = of("PLN")

                    val PYG = of("PYG")

                    val QAR = of("QAR")

                    val RON = of("RON")

                    val RSD = of("RSD")

                    val RUB = of("RUB")

                    val RWF = of("RWF")

                    val SAR = of("SAR")

                    val SBD = of("SBD")

                    val SCR = of("SCR")

                    val SEK = of("SEK")

                    val SGD = of("SGD")

                    val SHP = of("SHP")

                    val SLE = of("SLE")

                    val SLL = of("SLL")

                    val SOS = of("SOS")

                    val SRD = of("SRD")

                    val SSP = of("SSP")

                    val STN = of("STN")

                    val SVC = of("SVC")

                    val SZL = of("SZL")

                    val THB = of("THB")

                    val TND = of("TND")

                    val TOP = of("TOP")

                    val TRY = of("TRY")

                    val TTD = of("TTD")

                    val TWD = of("TWD")

                    val TZS = of("TZS")

                    val UAH = of("UAH")

                    val UGX = of("UGX")

                    val USD = of("USD")

                    val UYU = of("UYU")

                    val UZS = of("UZS")

                    val VES = of("VES")

                    val VND = of("VND")

                    val VUV = of("VUV")

                    val WST = of("WST")

                    val XAF = of("XAF")

                    val XCD = of("XCD")

                    val XOF = of("XOF")

                    val XPF = of("XPF")

                    val YER = of("YER")

                    val ZAR = of("ZAR")

                    val ZMW = of("ZMW")

                    fun of(value: String) = Currency(JsonField.of(value))
                }

                /** An enum containing [Currency]'s known values. */
                enum class Known {
                    AED,
                    ALL,
                    AMD,
                    ANG,
                    AOA,
                    ARS,
                    AUD,
                    AWG,
                    AZN,
                    BAM,
                    BBD,
                    BDT,
                    BGN,
                    BHD,
                    BIF,
                    BMD,
                    BND,
                    BOB,
                    BRL,
                    BSD,
                    BWP,
                    BYN,
                    BZD,
                    CAD,
                    CHF,
                    CLP,
                    CNY,
                    COP,
                    CRC,
                    CUP,
                    CVE,
                    CZK,
                    DJF,
                    DKK,
                    DOP,
                    DZD,
                    EGP,
                    ETB,
                    EUR,
                    FJD,
                    FKP,
                    GBP,
                    GEL,
                    GHS,
                    GIP,
                    GMD,
                    GNF,
                    GTQ,
                    GYD,
                    HKD,
                    HNL,
                    HRK,
                    HTG,
                    HUF,
                    IDR,
                    ILS,
                    INR,
                    IQD,
                    JMD,
                    JOD,
                    JPY,
                    KES,
                    KGS,
                    KHR,
                    KMF,
                    KRW,
                    KWD,
                    KYD,
                    KZT,
                    LAK,
                    LBP,
                    LKR,
                    LRD,
                    LSL,
                    LYD,
                    MAD,
                    MDL,
                    MGA,
                    MKD,
                    MMK,
                    MNT,
                    MOP,
                    MRU,
                    MUR,
                    MVR,
                    MWK,
                    MXN,
                    MYR,
                    MZN,
                    NAD,
                    NGN,
                    NIO,
                    NOK,
                    NPR,
                    NZD,
                    OMR,
                    PAB,
                    PEN,
                    PGK,
                    PHP,
                    PKR,
                    PLN,
                    PYG,
                    QAR,
                    RON,
                    RSD,
                    RUB,
                    RWF,
                    SAR,
                    SBD,
                    SCR,
                    SEK,
                    SGD,
                    SHP,
                    SLE,
                    SLL,
                    SOS,
                    SRD,
                    SSP,
                    STN,
                    SVC,
                    SZL,
                    THB,
                    TND,
                    TOP,
                    TRY,
                    TTD,
                    TWD,
                    TZS,
                    UAH,
                    UGX,
                    USD,
                    UYU,
                    UZS,
                    VES,
                    VND,
                    VUV,
                    WST,
                    XAF,
                    XCD,
                    XOF,
                    XPF,
                    YER,
                    ZAR,
                    ZMW,
                }

                /**
                 * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Currency] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AED,
                    ALL,
                    AMD,
                    ANG,
                    AOA,
                    ARS,
                    AUD,
                    AWG,
                    AZN,
                    BAM,
                    BBD,
                    BDT,
                    BGN,
                    BHD,
                    BIF,
                    BMD,
                    BND,
                    BOB,
                    BRL,
                    BSD,
                    BWP,
                    BYN,
                    BZD,
                    CAD,
                    CHF,
                    CLP,
                    CNY,
                    COP,
                    CRC,
                    CUP,
                    CVE,
                    CZK,
                    DJF,
                    DKK,
                    DOP,
                    DZD,
                    EGP,
                    ETB,
                    EUR,
                    FJD,
                    FKP,
                    GBP,
                    GEL,
                    GHS,
                    GIP,
                    GMD,
                    GNF,
                    GTQ,
                    GYD,
                    HKD,
                    HNL,
                    HRK,
                    HTG,
                    HUF,
                    IDR,
                    ILS,
                    INR,
                    IQD,
                    JMD,
                    JOD,
                    JPY,
                    KES,
                    KGS,
                    KHR,
                    KMF,
                    KRW,
                    KWD,
                    KYD,
                    KZT,
                    LAK,
                    LBP,
                    LKR,
                    LRD,
                    LSL,
                    LYD,
                    MAD,
                    MDL,
                    MGA,
                    MKD,
                    MMK,
                    MNT,
                    MOP,
                    MRU,
                    MUR,
                    MVR,
                    MWK,
                    MXN,
                    MYR,
                    MZN,
                    NAD,
                    NGN,
                    NIO,
                    NOK,
                    NPR,
                    NZD,
                    OMR,
                    PAB,
                    PEN,
                    PGK,
                    PHP,
                    PKR,
                    PLN,
                    PYG,
                    QAR,
                    RON,
                    RSD,
                    RUB,
                    RWF,
                    SAR,
                    SBD,
                    SCR,
                    SEK,
                    SGD,
                    SHP,
                    SLE,
                    SLL,
                    SOS,
                    SRD,
                    SSP,
                    STN,
                    SVC,
                    SZL,
                    THB,
                    TND,
                    TOP,
                    TRY,
                    TTD,
                    TWD,
                    TZS,
                    UAH,
                    UGX,
                    USD,
                    UYU,
                    UZS,
                    VES,
                    VND,
                    VUV,
                    WST,
                    XAF,
                    XCD,
                    XOF,
                    XPF,
                    YER,
                    ZAR,
                    ZMW,
                    /**
                     * An enum member indicating that [Currency] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AED -> Value.AED
                        ALL -> Value.ALL
                        AMD -> Value.AMD
                        ANG -> Value.ANG
                        AOA -> Value.AOA
                        ARS -> Value.ARS
                        AUD -> Value.AUD
                        AWG -> Value.AWG
                        AZN -> Value.AZN
                        BAM -> Value.BAM
                        BBD -> Value.BBD
                        BDT -> Value.BDT
                        BGN -> Value.BGN
                        BHD -> Value.BHD
                        BIF -> Value.BIF
                        BMD -> Value.BMD
                        BND -> Value.BND
                        BOB -> Value.BOB
                        BRL -> Value.BRL
                        BSD -> Value.BSD
                        BWP -> Value.BWP
                        BYN -> Value.BYN
                        BZD -> Value.BZD
                        CAD -> Value.CAD
                        CHF -> Value.CHF
                        CLP -> Value.CLP
                        CNY -> Value.CNY
                        COP -> Value.COP
                        CRC -> Value.CRC
                        CUP -> Value.CUP
                        CVE -> Value.CVE
                        CZK -> Value.CZK
                        DJF -> Value.DJF
                        DKK -> Value.DKK
                        DOP -> Value.DOP
                        DZD -> Value.DZD
                        EGP -> Value.EGP
                        ETB -> Value.ETB
                        EUR -> Value.EUR
                        FJD -> Value.FJD
                        FKP -> Value.FKP
                        GBP -> Value.GBP
                        GEL -> Value.GEL
                        GHS -> Value.GHS
                        GIP -> Value.GIP
                        GMD -> Value.GMD
                        GNF -> Value.GNF
                        GTQ -> Value.GTQ
                        GYD -> Value.GYD
                        HKD -> Value.HKD
                        HNL -> Value.HNL
                        HRK -> Value.HRK
                        HTG -> Value.HTG
                        HUF -> Value.HUF
                        IDR -> Value.IDR
                        ILS -> Value.ILS
                        INR -> Value.INR
                        IQD -> Value.IQD
                        JMD -> Value.JMD
                        JOD -> Value.JOD
                        JPY -> Value.JPY
                        KES -> Value.KES
                        KGS -> Value.KGS
                        KHR -> Value.KHR
                        KMF -> Value.KMF
                        KRW -> Value.KRW
                        KWD -> Value.KWD
                        KYD -> Value.KYD
                        KZT -> Value.KZT
                        LAK -> Value.LAK
                        LBP -> Value.LBP
                        LKR -> Value.LKR
                        LRD -> Value.LRD
                        LSL -> Value.LSL
                        LYD -> Value.LYD
                        MAD -> Value.MAD
                        MDL -> Value.MDL
                        MGA -> Value.MGA
                        MKD -> Value.MKD
                        MMK -> Value.MMK
                        MNT -> Value.MNT
                        MOP -> Value.MOP
                        MRU -> Value.MRU
                        MUR -> Value.MUR
                        MVR -> Value.MVR
                        MWK -> Value.MWK
                        MXN -> Value.MXN
                        MYR -> Value.MYR
                        MZN -> Value.MZN
                        NAD -> Value.NAD
                        NGN -> Value.NGN
                        NIO -> Value.NIO
                        NOK -> Value.NOK
                        NPR -> Value.NPR
                        NZD -> Value.NZD
                        OMR -> Value.OMR
                        PAB -> Value.PAB
                        PEN -> Value.PEN
                        PGK -> Value.PGK
                        PHP -> Value.PHP
                        PKR -> Value.PKR
                        PLN -> Value.PLN
                        PYG -> Value.PYG
                        QAR -> Value.QAR
                        RON -> Value.RON
                        RSD -> Value.RSD
                        RUB -> Value.RUB
                        RWF -> Value.RWF
                        SAR -> Value.SAR
                        SBD -> Value.SBD
                        SCR -> Value.SCR
                        SEK -> Value.SEK
                        SGD -> Value.SGD
                        SHP -> Value.SHP
                        SLE -> Value.SLE
                        SLL -> Value.SLL
                        SOS -> Value.SOS
                        SRD -> Value.SRD
                        SSP -> Value.SSP
                        STN -> Value.STN
                        SVC -> Value.SVC
                        SZL -> Value.SZL
                        THB -> Value.THB
                        TND -> Value.TND
                        TOP -> Value.TOP
                        TRY -> Value.TRY
                        TTD -> Value.TTD
                        TWD -> Value.TWD
                        TZS -> Value.TZS
                        UAH -> Value.UAH
                        UGX -> Value.UGX
                        USD -> Value.USD
                        UYU -> Value.UYU
                        UZS -> Value.UZS
                        VES -> Value.VES
                        VND -> Value.VND
                        VUV -> Value.VUV
                        WST -> Value.WST
                        XAF -> Value.XAF
                        XCD -> Value.XCD
                        XOF -> Value.XOF
                        XPF -> Value.XPF
                        YER -> Value.YER
                        ZAR -> Value.ZAR
                        ZMW -> Value.ZMW
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AED -> Known.AED
                        ALL -> Known.ALL
                        AMD -> Known.AMD
                        ANG -> Known.ANG
                        AOA -> Known.AOA
                        ARS -> Known.ARS
                        AUD -> Known.AUD
                        AWG -> Known.AWG
                        AZN -> Known.AZN
                        BAM -> Known.BAM
                        BBD -> Known.BBD
                        BDT -> Known.BDT
                        BGN -> Known.BGN
                        BHD -> Known.BHD
                        BIF -> Known.BIF
                        BMD -> Known.BMD
                        BND -> Known.BND
                        BOB -> Known.BOB
                        BRL -> Known.BRL
                        BSD -> Known.BSD
                        BWP -> Known.BWP
                        BYN -> Known.BYN
                        BZD -> Known.BZD
                        CAD -> Known.CAD
                        CHF -> Known.CHF
                        CLP -> Known.CLP
                        CNY -> Known.CNY
                        COP -> Known.COP
                        CRC -> Known.CRC
                        CUP -> Known.CUP
                        CVE -> Known.CVE
                        CZK -> Known.CZK
                        DJF -> Known.DJF
                        DKK -> Known.DKK
                        DOP -> Known.DOP
                        DZD -> Known.DZD
                        EGP -> Known.EGP
                        ETB -> Known.ETB
                        EUR -> Known.EUR
                        FJD -> Known.FJD
                        FKP -> Known.FKP
                        GBP -> Known.GBP
                        GEL -> Known.GEL
                        GHS -> Known.GHS
                        GIP -> Known.GIP
                        GMD -> Known.GMD
                        GNF -> Known.GNF
                        GTQ -> Known.GTQ
                        GYD -> Known.GYD
                        HKD -> Known.HKD
                        HNL -> Known.HNL
                        HRK -> Known.HRK
                        HTG -> Known.HTG
                        HUF -> Known.HUF
                        IDR -> Known.IDR
                        ILS -> Known.ILS
                        INR -> Known.INR
                        IQD -> Known.IQD
                        JMD -> Known.JMD
                        JOD -> Known.JOD
                        JPY -> Known.JPY
                        KES -> Known.KES
                        KGS -> Known.KGS
                        KHR -> Known.KHR
                        KMF -> Known.KMF
                        KRW -> Known.KRW
                        KWD -> Known.KWD
                        KYD -> Known.KYD
                        KZT -> Known.KZT
                        LAK -> Known.LAK
                        LBP -> Known.LBP
                        LKR -> Known.LKR
                        LRD -> Known.LRD
                        LSL -> Known.LSL
                        LYD -> Known.LYD
                        MAD -> Known.MAD
                        MDL -> Known.MDL
                        MGA -> Known.MGA
                        MKD -> Known.MKD
                        MMK -> Known.MMK
                        MNT -> Known.MNT
                        MOP -> Known.MOP
                        MRU -> Known.MRU
                        MUR -> Known.MUR
                        MVR -> Known.MVR
                        MWK -> Known.MWK
                        MXN -> Known.MXN
                        MYR -> Known.MYR
                        MZN -> Known.MZN
                        NAD -> Known.NAD
                        NGN -> Known.NGN
                        NIO -> Known.NIO
                        NOK -> Known.NOK
                        NPR -> Known.NPR
                        NZD -> Known.NZD
                        OMR -> Known.OMR
                        PAB -> Known.PAB
                        PEN -> Known.PEN
                        PGK -> Known.PGK
                        PHP -> Known.PHP
                        PKR -> Known.PKR
                        PLN -> Known.PLN
                        PYG -> Known.PYG
                        QAR -> Known.QAR
                        RON -> Known.RON
                        RSD -> Known.RSD
                        RUB -> Known.RUB
                        RWF -> Known.RWF
                        SAR -> Known.SAR
                        SBD -> Known.SBD
                        SCR -> Known.SCR
                        SEK -> Known.SEK
                        SGD -> Known.SGD
                        SHP -> Known.SHP
                        SLE -> Known.SLE
                        SLL -> Known.SLL
                        SOS -> Known.SOS
                        SRD -> Known.SRD
                        SSP -> Known.SSP
                        STN -> Known.STN
                        SVC -> Known.SVC
                        SZL -> Known.SZL
                        THB -> Known.THB
                        TND -> Known.TND
                        TOP -> Known.TOP
                        TRY -> Known.TRY
                        TTD -> Known.TTD
                        TWD -> Known.TWD
                        TZS -> Known.TZS
                        UAH -> Known.UAH
                        UGX -> Known.UGX
                        USD -> Known.USD
                        UYU -> Known.UYU
                        UZS -> Known.UZS
                        VES -> Known.VES
                        VND -> Known.VND
                        VUV -> Known.VUV
                        WST -> Known.WST
                        XAF -> Known.XAF
                        XCD -> Known.XCD
                        XOF -> Known.XOF
                        XPF -> Known.XPF
                        YER -> Known.YER
                        ZAR -> Known.ZAR
                        ZMW -> Known.ZMW
                        else -> throw DodoPaymentsInvalidDataException("Unknown Currency: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class PaymentFrequencyInterval
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("Day")

                    val WEEK = of("Week")

                    val MONTH = of("Month")

                    val YEAR = of("Year")

                    fun of(value: String) = PaymentFrequencyInterval(JsonField.of(value))
                }

                /** An enum containing [PaymentFrequencyInterval]'s known values. */
                enum class Known {
                    DAY,
                    WEEK,
                    MONTH,
                    YEAR,
                }

                /**
                 * An enum containing [PaymentFrequencyInterval]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [PaymentFrequencyInterval] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DAY,
                    WEEK,
                    MONTH,
                    YEAR,
                    /**
                     * An enum member indicating that [PaymentFrequencyInterval] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        WEEK -> Value.WEEK
                        MONTH -> Value.MONTH
                        YEAR -> Value.YEAR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        WEEK -> Known.WEEK
                        MONTH -> Known.MONTH
                        YEAR -> Known.YEAR
                        else ->
                            throw DodoPaymentsInvalidDataException(
                                "Unknown PaymentFrequencyInterval: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PaymentFrequencyInterval && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class SubscriptionPeriodInterval
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("Day")

                    val WEEK = of("Week")

                    val MONTH = of("Month")

                    val YEAR = of("Year")

                    fun of(value: String) = SubscriptionPeriodInterval(JsonField.of(value))
                }

                /** An enum containing [SubscriptionPeriodInterval]'s known values. */
                enum class Known {
                    DAY,
                    WEEK,
                    MONTH,
                    YEAR,
                }

                /**
                 * An enum containing [SubscriptionPeriodInterval]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [SubscriptionPeriodInterval] can contain an unknown value in a
                 * couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DAY,
                    WEEK,
                    MONTH,
                    YEAR,
                    /**
                     * An enum member indicating that [SubscriptionPeriodInterval] was instantiated
                     * with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        WEEK -> Value.WEEK
                        MONTH -> Value.MONTH
                        YEAR -> Value.YEAR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        WEEK -> Known.WEEK
                        MONTH -> Known.MONTH
                        YEAR -> Known.YEAR
                        else ->
                            throw DodoPaymentsInvalidDataException(
                                "Unknown SubscriptionPeriodInterval: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SubscriptionPeriodInterval && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val RECURRING_PRICE = of("recurring_price")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    RECURRING_PRICE
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RECURRING_PRICE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        RECURRING_PRICE -> Value.RECURRING_PRICE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        RECURRING_PRICE -> Known.RECURRING_PRICE
                        else -> throw DodoPaymentsInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws DodoPaymentsInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw DodoPaymentsInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RecurringPrice && currency == other.currency && discount == other.discount && paymentFrequencyCount == other.paymentFrequencyCount && paymentFrequencyInterval == other.paymentFrequencyInterval && price == other.price && purchasingPowerParity == other.purchasingPowerParity && subscriptionPeriodCount == other.subscriptionPeriodCount && subscriptionPeriodInterval == other.subscriptionPeriodInterval && type == other.type && taxInclusive == other.taxInclusive && trialPeriodDays == other.trialPeriodDays && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(currency, discount, paymentFrequencyCount, paymentFrequencyInterval, price, purchasingPowerParity, subscriptionPeriodCount, subscriptionPeriodInterval, type, taxInclusive, trialPeriodDays, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RecurringPrice{currency=$currency, discount=$discount, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, price=$price, purchasingPowerParity=$purchasingPowerParity, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, type=$type, taxInclusive=$taxInclusive, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
        }
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
