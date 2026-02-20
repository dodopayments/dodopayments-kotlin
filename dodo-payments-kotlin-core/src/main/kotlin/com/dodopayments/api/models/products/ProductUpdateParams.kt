// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class ProductUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Available Addons for subscription products
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addons(): List<String>? = body.addons()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun brandId(): String? = body.brandId()

    /**
     * Credit entitlements to update (replaces all existing when present) Send empty array to remove
     * all, omit field to leave unchanged
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun creditEntitlements(): List<CreditEntitlement>? = body.creditEntitlements()

    /**
     * Description of the product, optional and must be at most 1000 characters.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Choose how you would like you digital product delivered
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun digitalProductDelivery(): DigitalProductDelivery? = body.digitalProductDelivery()

    /**
     * Product image id after its uploaded to S3
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun imageId(): String? = body.imageId()

    /**
     * Message sent to the customer upon license key activation.
     *
     * Only applicable if `license_key_enabled` is `true`. This message contains instructions for
     * activating the license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyActivationMessage(): String? = body.licenseKeyActivationMessage()

    /**
     * Limit for the number of activations for the license key.
     *
     * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of times
     * the license key can be activated.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyActivationsLimit(): Int? = body.licenseKeyActivationsLimit()

    /**
     * Duration of the license key if enabled.
     *
     * Only applicable if `license_key_enabled` is `true`. Represents the duration in days for which
     * the license key is valid.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyDuration(): LicenseKeyDuration? = body.licenseKeyDuration()

    /**
     * Whether the product requires a license key.
     *
     * If `true`, additional fields related to license key (duration, activations limit, activation
     * message) become applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyEnabled(): Boolean? = body.licenseKeyEnabled()

    /**
     * Additional metadata for the product
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Name of the product, optional and must be at most 100 characters.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * Price details of the product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun price(): Price? = body.price()

    /**
     * Tax category of the product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxCategory(): TaxCategory? = body.taxCategory()

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addons(): JsonField<List<String>> = body._addons()

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _brandId(): JsonField<String> = body._brandId()

    /**
     * Returns the raw JSON value of [creditEntitlements].
     *
     * Unlike [creditEntitlements], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditEntitlements(): JsonField<List<CreditEntitlement>> = body._creditEntitlements()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [digitalProductDelivery].
     *
     * Unlike [digitalProductDelivery], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _digitalProductDelivery(): JsonField<DigitalProductDelivery> =
        body._digitalProductDelivery()

    /**
     * Returns the raw JSON value of [imageId].
     *
     * Unlike [imageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _imageId(): JsonField<String> = body._imageId()

    /**
     * Returns the raw JSON value of [licenseKeyActivationMessage].
     *
     * Unlike [licenseKeyActivationMessage], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _licenseKeyActivationMessage(): JsonField<String> = body._licenseKeyActivationMessage()

    /**
     * Returns the raw JSON value of [licenseKeyActivationsLimit].
     *
     * Unlike [licenseKeyActivationsLimit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _licenseKeyActivationsLimit(): JsonField<Int> = body._licenseKeyActivationsLimit()

    /**
     * Returns the raw JSON value of [licenseKeyDuration].
     *
     * Unlike [licenseKeyDuration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _licenseKeyDuration(): JsonField<LicenseKeyDuration> = body._licenseKeyDuration()

    /**
     * Returns the raw JSON value of [licenseKeyEnabled].
     *
     * Unlike [licenseKeyEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _licenseKeyEnabled(): JsonField<Boolean> = body._licenseKeyEnabled()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _price(): JsonField<Price> = body._price()

    /**
     * Returns the raw JSON value of [taxCategory].
     *
     * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxCategory(): JsonField<TaxCategory> = body._taxCategory()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ProductUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ProductUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ProductUpdateParams]. */
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

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addons]
         * - [brandId]
         * - [creditEntitlements]
         * - [description]
         * - [digitalProductDelivery]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Available Addons for subscription products */
        fun addons(addons: List<String>?) = apply { body.addons(addons) }

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addons(addons: JsonField<List<String>>) = apply { body.addons(addons) }

        /**
         * Adds a single [String] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: String) = apply { body.addAddon(addon) }

        fun brandId(brandId: String?) = apply { body.brandId(brandId) }

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { body.brandId(brandId) }

        /**
         * Credit entitlements to update (replaces all existing when present) Send empty array to
         * remove all, omit field to leave unchanged
         */
        fun creditEntitlements(creditEntitlements: List<CreditEntitlement>?) = apply {
            body.creditEntitlements(creditEntitlements)
        }

        /**
         * Sets [Builder.creditEntitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlements] with a well-typed
         * `List<CreditEntitlement>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun creditEntitlements(creditEntitlements: JsonField<List<CreditEntitlement>>) = apply {
            body.creditEntitlements(creditEntitlements)
        }

        /**
         * Adds a single [CreditEntitlement] to [creditEntitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditEntitlement(creditEntitlement: CreditEntitlement) = apply {
            body.addCreditEntitlement(creditEntitlement)
        }

        /** Description of the product, optional and must be at most 1000 characters. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Choose how you would like you digital product delivered */
        fun digitalProductDelivery(digitalProductDelivery: DigitalProductDelivery?) = apply {
            body.digitalProductDelivery(digitalProductDelivery)
        }

        /**
         * Sets [Builder.digitalProductDelivery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalProductDelivery] with a well-typed
         * [DigitalProductDelivery] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun digitalProductDelivery(digitalProductDelivery: JsonField<DigitalProductDelivery>) =
            apply {
                body.digitalProductDelivery(digitalProductDelivery)
            }

        /** Product image id after its uploaded to S3 */
        fun imageId(imageId: String?) = apply { body.imageId(imageId) }

        /**
         * Sets [Builder.imageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
         * Sets [Builder.licenseKeyActivationMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationMessage] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Int?) = apply {
            body.licenseKeyActivationsLimit(licenseKeyActivationsLimit)
        }

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
            body.licenseKeyActivationsLimit(licenseKeyActivationsLimit)
        }

        /**
         * Duration of the license key if enabled.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the duration in days for
         * which the license key is valid.
         */
        fun licenseKeyDuration(licenseKeyDuration: LicenseKeyDuration?) = apply {
            body.licenseKeyDuration(licenseKeyDuration)
        }

        /**
         * Sets [Builder.licenseKeyDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyDuration] with a well-typed
         * [LicenseKeyDuration] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
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
         * Alias for [Builder.licenseKeyEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
            licenseKeyEnabled(licenseKeyEnabled as Boolean?)

        /**
         * Sets [Builder.licenseKeyEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: JsonField<Boolean>) = apply {
            body.licenseKeyEnabled(licenseKeyEnabled)
        }

        /** Additional metadata for the product */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Name of the product, optional and must be at most 100 characters. */
        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Price details of the product. */
        fun price(price: Price?) = apply { body.price(price) }

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Price] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Price>) = apply { body.price(price) }

        /** Alias for calling [price] with `Price.ofOneTime(oneTime)`. */
        fun price(oneTime: Price.OneTimePrice) = apply { body.price(oneTime) }

        /** Alias for calling [price] with `Price.ofRecurring(recurring)`. */
        fun price(recurring: Price.RecurringPrice) = apply { body.price(recurring) }

        /** Alias for calling [price] with `Price.ofUsageBased(usageBased)`. */
        fun price(usageBased: Price.UsageBasedPrice) = apply { body.price(usageBased) }

        /** Tax category of the product. */
        fun taxCategory(taxCategory: TaxCategory?) = apply { body.taxCategory(taxCategory) }

        /**
         * Sets [Builder.taxCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxCategory] with a well-typed [TaxCategory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [ProductUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProductUpdateParams =
            ProductUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addons: JsonField<List<String>>,
        private val brandId: JsonField<String>,
        private val creditEntitlements: JsonField<List<CreditEntitlement>>,
        private val description: JsonField<String>,
        private val digitalProductDelivery: JsonField<DigitalProductDelivery>,
        private val imageId: JsonField<String>,
        private val licenseKeyActivationMessage: JsonField<String>,
        private val licenseKeyActivationsLimit: JsonField<Int>,
        private val licenseKeyDuration: JsonField<LicenseKeyDuration>,
        private val licenseKeyEnabled: JsonField<Boolean>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val price: JsonField<Price>,
        private val taxCategory: JsonField<TaxCategory>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addons")
            @ExcludeMissing
            addons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_entitlements")
            @ExcludeMissing
            creditEntitlements: JsonField<List<CreditEntitlement>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("digital_product_delivery")
            @ExcludeMissing
            digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of(),
            @JsonProperty("image_id") @ExcludeMissing imageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("license_key_activation_message")
            @ExcludeMissing
            licenseKeyActivationMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("license_key_activations_limit")
            @ExcludeMissing
            licenseKeyActivationsLimit: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("license_key_duration")
            @ExcludeMissing
            licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of(),
            @JsonProperty("license_key_enabled")
            @ExcludeMissing
            licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("tax_category")
            @ExcludeMissing
            taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
        ) : this(
            addons,
            brandId,
            creditEntitlements,
            description,
            digitalProductDelivery,
            imageId,
            licenseKeyActivationMessage,
            licenseKeyActivationsLimit,
            licenseKeyDuration,
            licenseKeyEnabled,
            metadata,
            name,
            price,
            taxCategory,
            mutableMapOf(),
        )

        /**
         * Available Addons for subscription products
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addons(): List<String>? = addons.getNullable("addons")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun brandId(): String? = brandId.getNullable("brand_id")

        /**
         * Credit entitlements to update (replaces all existing when present) Send empty array to
         * remove all, omit field to leave unchanged
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun creditEntitlements(): List<CreditEntitlement>? =
            creditEntitlements.getNullable("credit_entitlements")

        /**
         * Description of the product, optional and must be at most 1000 characters.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Choose how you would like you digital product delivered
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun digitalProductDelivery(): DigitalProductDelivery? =
            digitalProductDelivery.getNullable("digital_product_delivery")

        /**
         * Product image id after its uploaded to S3
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun imageId(): String? = imageId.getNullable("image_id")

        /**
         * Message sent to the customer upon license key activation.
         *
         * Only applicable if `license_key_enabled` is `true`. This message contains instructions
         * for activating the license key.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKeyActivationMessage(): String? =
            licenseKeyActivationMessage.getNullable("license_key_activation_message")

        /**
         * Limit for the number of activations for the license key.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
         * times the license key can be activated.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKeyActivationsLimit(): Int? =
            licenseKeyActivationsLimit.getNullable("license_key_activations_limit")

        /**
         * Duration of the license key if enabled.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the duration in days for
         * which the license key is valid.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKeyDuration(): LicenseKeyDuration? =
            licenseKeyDuration.getNullable("license_key_duration")

        /**
         * Whether the product requires a license key.
         *
         * If `true`, additional fields related to license key (duration, activations limit,
         * activation message) become applicable.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKeyEnabled(): Boolean? = licenseKeyEnabled.getNullable("license_key_enabled")

        /**
         * Additional metadata for the product
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Name of the product, optional and must be at most 100 characters.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Price details of the product.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun price(): Price? = price.getNullable("price")

        /**
         * Tax category of the product.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxCategory(): TaxCategory? = taxCategory.getNullable("tax_category")

        /**
         * Returns the raw JSON value of [addons].
         *
         * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<String>> = addons

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [creditEntitlements].
         *
         * Unlike [creditEntitlements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlements")
        @ExcludeMissing
        fun _creditEntitlements(): JsonField<List<CreditEntitlement>> = creditEntitlements

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [imageId].
         *
         * Unlike [imageId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_id") @ExcludeMissing fun _imageId(): JsonField<String> = imageId

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
         * Unlike [licenseKeyDuration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("license_key_duration")
        @ExcludeMissing
        fun _licenseKeyDuration(): JsonField<LicenseKeyDuration> = licenseKeyDuration

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
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [taxCategory].
         *
         * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_category")
        @ExcludeMissing
        fun _taxCategory(): JsonField<TaxCategory> = taxCategory

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addons: JsonField<MutableList<String>>? = null
            private var brandId: JsonField<String> = JsonMissing.of()
            private var creditEntitlements: JsonField<MutableList<CreditEntitlement>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var digitalProductDelivery: JsonField<DigitalProductDelivery> = JsonMissing.of()
            private var imageId: JsonField<String> = JsonMissing.of()
            private var licenseKeyActivationMessage: JsonField<String> = JsonMissing.of()
            private var licenseKeyActivationsLimit: JsonField<Int> = JsonMissing.of()
            private var licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of()
            private var licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var taxCategory: JsonField<TaxCategory> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                addons = body.addons.map { it.toMutableList() }
                brandId = body.brandId
                creditEntitlements = body.creditEntitlements.map { it.toMutableList() }
                description = body.description
                digitalProductDelivery = body.digitalProductDelivery
                imageId = body.imageId
                licenseKeyActivationMessage = body.licenseKeyActivationMessage
                licenseKeyActivationsLimit = body.licenseKeyActivationsLimit
                licenseKeyDuration = body.licenseKeyDuration
                licenseKeyEnabled = body.licenseKeyEnabled
                metadata = body.metadata
                name = body.name
                price = body.price
                taxCategory = body.taxCategory
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Available Addons for subscription products */
            fun addons(addons: List<String>?) = addons(JsonField.ofNullable(addons))

            /**
             * Sets [Builder.addons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addons] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /**
             * Credit entitlements to update (replaces all existing when present) Send empty array
             * to remove all, omit field to leave unchanged
             */
            fun creditEntitlements(creditEntitlements: List<CreditEntitlement>?) =
                creditEntitlements(JsonField.ofNullable(creditEntitlements))

            /**
             * Sets [Builder.creditEntitlements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlements] with a well-typed
             * `List<CreditEntitlement>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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

            /** Description of the product, optional and must be at most 1000 characters. */
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

            /** Choose how you would like you digital product delivered */
            fun digitalProductDelivery(digitalProductDelivery: DigitalProductDelivery?) =
                digitalProductDelivery(JsonField.ofNullable(digitalProductDelivery))

            /**
             * Sets [Builder.digitalProductDelivery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalProductDelivery] with a well-typed
             * [DigitalProductDelivery] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun digitalProductDelivery(digitalProductDelivery: JsonField<DigitalProductDelivery>) =
                apply {
                    this.digitalProductDelivery = digitalProductDelivery
                }

            /** Product image id after its uploaded to S3 */
            fun imageId(imageId: String?) = imageId(JsonField.ofNullable(imageId))

            /**
             * Sets [Builder.imageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.licenseKeyActivationMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKeyActivationMessage] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: JsonField<Int>) = apply {
                this.licenseKeyActivationsLimit = licenseKeyActivationsLimit
            }

            /**
             * Duration of the license key if enabled.
             *
             * Only applicable if `license_key_enabled` is `true`. Represents the duration in days
             * for which the license key is valid.
             */
            fun licenseKeyDuration(licenseKeyDuration: LicenseKeyDuration?) =
                licenseKeyDuration(JsonField.ofNullable(licenseKeyDuration))

            /**
             * Sets [Builder.licenseKeyDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKeyDuration] with a well-typed
             * [LicenseKeyDuration] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
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
             * Alias for [Builder.licenseKeyEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
                licenseKeyEnabled(licenseKeyEnabled as Boolean?)

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

            /** Additional metadata for the product */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Name of the product, optional and must be at most 100 characters. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Price details of the product. */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofOneTime(oneTime)`. */
            fun price(oneTime: Price.OneTimePrice) = price(Price.ofOneTime(oneTime))

            /** Alias for calling [price] with `Price.ofRecurring(recurring)`. */
            fun price(recurring: Price.RecurringPrice) = price(Price.ofRecurring(recurring))

            /** Alias for calling [price] with `Price.ofUsageBased(usageBased)`. */
            fun price(usageBased: Price.UsageBasedPrice) = price(Price.ofUsageBased(usageBased))

            /** Tax category of the product. */
            fun taxCategory(taxCategory: TaxCategory?) =
                taxCategory(JsonField.ofNullable(taxCategory))

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
             */
            fun build(): Body =
                Body(
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    brandId,
                    (creditEntitlements ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    digitalProductDelivery,
                    imageId,
                    licenseKeyActivationMessage,
                    licenseKeyActivationsLimit,
                    licenseKeyDuration,
                    licenseKeyEnabled,
                    metadata,
                    name,
                    price,
                    taxCategory,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addons()
            brandId()
            creditEntitlements()?.forEach { it.validate() }
            description()
            digitalProductDelivery()?.validate()
            imageId()
            licenseKeyActivationMessage()
            licenseKeyActivationsLimit()
            licenseKeyDuration()?.validate()
            licenseKeyEnabled()
            metadata()?.validate()
            name()
            price()?.validate()
            taxCategory()?.validate()
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
            (addons.asKnown()?.size ?: 0) +
                (if (brandId.asKnown() == null) 0 else 1) +
                (creditEntitlements.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (digitalProductDelivery.asKnown()?.validity() ?: 0) +
                (if (imageId.asKnown() == null) 0 else 1) +
                (if (licenseKeyActivationMessage.asKnown() == null) 0 else 1) +
                (if (licenseKeyActivationsLimit.asKnown() == null) 0 else 1) +
                (licenseKeyDuration.asKnown()?.validity() ?: 0) +
                (if (licenseKeyEnabled.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (price.asKnown()?.validity() ?: 0) +
                (taxCategory.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                addons == other.addons &&
                brandId == other.brandId &&
                creditEntitlements == other.creditEntitlements &&
                description == other.description &&
                digitalProductDelivery == other.digitalProductDelivery &&
                imageId == other.imageId &&
                licenseKeyActivationMessage == other.licenseKeyActivationMessage &&
                licenseKeyActivationsLimit == other.licenseKeyActivationsLimit &&
                licenseKeyDuration == other.licenseKeyDuration &&
                licenseKeyEnabled == other.licenseKeyEnabled &&
                metadata == other.metadata &&
                name == other.name &&
                price == other.price &&
                taxCategory == other.taxCategory &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addons,
                brandId,
                creditEntitlements,
                description,
                digitalProductDelivery,
                imageId,
                licenseKeyActivationMessage,
                licenseKeyActivationsLimit,
                licenseKeyDuration,
                licenseKeyEnabled,
                metadata,
                name,
                price,
                taxCategory,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addons=$addons, brandId=$brandId, creditEntitlements=$creditEntitlements, description=$description, digitalProductDelivery=$digitalProductDelivery, imageId=$imageId, licenseKeyActivationMessage=$licenseKeyActivationMessage, licenseKeyActivationsLimit=$licenseKeyActivationsLimit, licenseKeyDuration=$licenseKeyDuration, licenseKeyEnabled=$licenseKeyEnabled, metadata=$metadata, name=$name, price=$price, taxCategory=$taxCategory, additionalProperties=$additionalProperties}"
    }

    /** Request struct for attaching a credit entitlement to a product */
    class CreditEntitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditEntitlementId: JsonField<String>,
        private val creditsAmount: JsonField<String>,
        private val creditsReduceOverage: JsonField<Boolean>,
        private val currency: JsonField<Currency>,
        private val expiresAfterDays: JsonField<Int>,
        private val lowBalanceThresholdPercent: JsonField<Int>,
        private val maxRolloverCount: JsonField<Int>,
        private val overageChargeAtBilling: JsonField<Boolean>,
        private val overageEnabled: JsonField<Boolean>,
        private val overageLimit: JsonField<String>,
        private val preserveOverageAtReset: JsonField<Boolean>,
        private val pricePerUnit: JsonField<String>,
        private val prorationBehavior: JsonField<ProrationBehavior>,
        private val rolloverEnabled: JsonField<Boolean>,
        private val rolloverPercentage: JsonField<Int>,
        private val rolloverTimeframeCount: JsonField<Int>,
        private val rolloverTimeframeInterval: JsonField<TimeInterval>,
        private val trialCredits: JsonField<String>,
        private val trialCreditsExpireAfterTrial: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            creditEntitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_amount")
            @ExcludeMissing
            creditsAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_reduce_overage")
            @ExcludeMissing
            creditsReduceOverage: JsonField<Boolean> = JsonMissing.of(),
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
            @JsonProperty("overage_charge_at_billing")
            @ExcludeMissing
            overageChargeAtBilling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("overage_enabled")
            @ExcludeMissing
            overageEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("overage_limit")
            @ExcludeMissing
            overageLimit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preserve_overage_at_reset")
            @ExcludeMissing
            preserveOverageAtReset: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("price_per_unit")
            @ExcludeMissing
            pricePerUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proration_behavior")
            @ExcludeMissing
            prorationBehavior: JsonField<ProrationBehavior> = JsonMissing.of(),
            @JsonProperty("rollover_enabled")
            @ExcludeMissing
            rolloverEnabled: JsonField<Boolean> = JsonMissing.of(),
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
            @JsonProperty("trial_credits_expire_after_trial")
            @ExcludeMissing
            trialCreditsExpireAfterTrial: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            creditEntitlementId,
            creditsAmount,
            creditsReduceOverage,
            currency,
            expiresAfterDays,
            lowBalanceThresholdPercent,
            maxRolloverCount,
            overageChargeAtBilling,
            overageEnabled,
            overageLimit,
            preserveOverageAtReset,
            pricePerUnit,
            prorationBehavior,
            rolloverEnabled,
            rolloverPercentage,
            rolloverTimeframeCount,
            rolloverTimeframeInterval,
            trialCredits,
            trialCreditsExpireAfterTrial,
            mutableMapOf(),
        )

        /**
         * ID of the credit entitlement to attach
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

        /**
         * Number of credits to grant when this product is purchased
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditsAmount(): String = creditsAmount.getRequired("credits_amount")

        /**
         * Whether new credit grants reduce existing overage
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun creditsReduceOverage(): Boolean? =
            creditsReduceOverage.getNullable("credits_reduce_overage")

        /**
         * Currency for credit-related pricing
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): Currency? = currency.getNullable("currency")

        /**
         * Number of days after which credits expire
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAfterDays(): Int? = expiresAfterDays.getNullable("expires_after_days")

        /**
         * Balance threshold percentage for low balance notifications (0-100)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lowBalanceThresholdPercent(): Int? =
            lowBalanceThresholdPercent.getNullable("low_balance_threshold_percent")

        /**
         * Maximum number of rollover cycles allowed
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxRolloverCount(): Int? = maxRolloverCount.getNullable("max_rollover_count")

        /**
         * Whether overage charges are applied at billing time
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageChargeAtBilling(): Boolean? =
            overageChargeAtBilling.getNullable("overage_charge_at_billing")

        /**
         * Whether overage usage is allowed beyond credit balance
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageEnabled(): Boolean? = overageEnabled.getNullable("overage_enabled")

        /**
         * Maximum amount of overage allowed
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageLimit(): String? = overageLimit.getNullable("overage_limit")

        /**
         * Whether to preserve overage balance when credits reset
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun preserveOverageAtReset(): Boolean? =
            preserveOverageAtReset.getNullable("preserve_overage_at_reset")

        /**
         * Price per credit unit for purchasing additional credits
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pricePerUnit(): String? = pricePerUnit.getNullable("price_per_unit")

        /**
         * Proration behavior for credit grants during plan changes
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun prorationBehavior(): ProrationBehavior? =
            prorationBehavior.getNullable("proration_behavior")

        /**
         * Whether unused credits can roll over to the next billing period
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverEnabled(): Boolean? = rolloverEnabled.getNullable("rollover_enabled")

        /**
         * Percentage of unused credits that can roll over (0-100)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverPercentage(): Int? = rolloverPercentage.getNullable("rollover_percentage")

        /**
         * Number of timeframe units for rollover window
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeCount(): Int? =
            rolloverTimeframeCount.getNullable("rollover_timeframe_count")

        /**
         * Time interval for rollover window (day, week, month, year)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeInterval(): TimeInterval? =
            rolloverTimeframeInterval.getNullable("rollover_timeframe_interval")

        /**
         * Credits granted during trial period
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialCredits(): String? = trialCredits.getNullable("trial_credits")

        /**
         * Whether trial credits expire when trial ends
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialCreditsExpireAfterTrial(): Boolean? =
            trialCreditsExpireAfterTrial.getNullable("trial_credits_expire_after_trial")

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
         * Returns the raw JSON value of [overageLimit].
         *
         * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_limit")
        @ExcludeMissing
        fun _overageLimit(): JsonField<String> = overageLimit

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
         * Returns the raw JSON value of [pricePerUnit].
         *
         * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        fun _pricePerUnit(): JsonField<String> = pricePerUnit

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

        /**
         * Returns the raw JSON value of [trialCreditsExpireAfterTrial].
         *
         * Unlike [trialCreditsExpireAfterTrial], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("trial_credits_expire_after_trial")
        @ExcludeMissing
        fun _trialCreditsExpireAfterTrial(): JsonField<Boolean> = trialCreditsExpireAfterTrial

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
             * .creditEntitlementId()
             * .creditsAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreditEntitlement]. */
        class Builder internal constructor() {

            private var creditEntitlementId: JsonField<String>? = null
            private var creditsAmount: JsonField<String>? = null
            private var creditsReduceOverage: JsonField<Boolean> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var expiresAfterDays: JsonField<Int> = JsonMissing.of()
            private var lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of()
            private var maxRolloverCount: JsonField<Int> = JsonMissing.of()
            private var overageChargeAtBilling: JsonField<Boolean> = JsonMissing.of()
            private var overageEnabled: JsonField<Boolean> = JsonMissing.of()
            private var overageLimit: JsonField<String> = JsonMissing.of()
            private var preserveOverageAtReset: JsonField<Boolean> = JsonMissing.of()
            private var pricePerUnit: JsonField<String> = JsonMissing.of()
            private var prorationBehavior: JsonField<ProrationBehavior> = JsonMissing.of()
            private var rolloverEnabled: JsonField<Boolean> = JsonMissing.of()
            private var rolloverPercentage: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeCount: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of()
            private var trialCredits: JsonField<String> = JsonMissing.of()
            private var trialCreditsExpireAfterTrial: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditEntitlement: CreditEntitlement) = apply {
                creditEntitlementId = creditEntitlement.creditEntitlementId
                creditsAmount = creditEntitlement.creditsAmount
                creditsReduceOverage = creditEntitlement.creditsReduceOverage
                currency = creditEntitlement.currency
                expiresAfterDays = creditEntitlement.expiresAfterDays
                lowBalanceThresholdPercent = creditEntitlement.lowBalanceThresholdPercent
                maxRolloverCount = creditEntitlement.maxRolloverCount
                overageChargeAtBilling = creditEntitlement.overageChargeAtBilling
                overageEnabled = creditEntitlement.overageEnabled
                overageLimit = creditEntitlement.overageLimit
                preserveOverageAtReset = creditEntitlement.preserveOverageAtReset
                pricePerUnit = creditEntitlement.pricePerUnit
                prorationBehavior = creditEntitlement.prorationBehavior
                rolloverEnabled = creditEntitlement.rolloverEnabled
                rolloverPercentage = creditEntitlement.rolloverPercentage
                rolloverTimeframeCount = creditEntitlement.rolloverTimeframeCount
                rolloverTimeframeInterval = creditEntitlement.rolloverTimeframeInterval
                trialCredits = creditEntitlement.trialCredits
                trialCreditsExpireAfterTrial = creditEntitlement.trialCreditsExpireAfterTrial
                additionalProperties = creditEntitlement.additionalProperties.toMutableMap()
            }

            /** ID of the credit entitlement to attach */
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

            /** Number of credits to grant when this product is purchased */
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
            fun creditsReduceOverage(creditsReduceOverage: Boolean?) =
                creditsReduceOverage(JsonField.ofNullable(creditsReduceOverage))

            /**
             * Alias for [Builder.creditsReduceOverage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun creditsReduceOverage(creditsReduceOverage: Boolean) =
                creditsReduceOverage(creditsReduceOverage as Boolean?)

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

            /** Currency for credit-related pricing */
            fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Number of days after which credits expire */
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

            /** Balance threshold percentage for low balance notifications (0-100) */
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

            /** Maximum number of rollover cycles allowed */
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

            /** Whether overage charges are applied at billing time */
            fun overageChargeAtBilling(overageChargeAtBilling: Boolean?) =
                overageChargeAtBilling(JsonField.ofNullable(overageChargeAtBilling))

            /**
             * Alias for [Builder.overageChargeAtBilling].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun overageChargeAtBilling(overageChargeAtBilling: Boolean) =
                overageChargeAtBilling(overageChargeAtBilling as Boolean?)

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

            /** Whether overage usage is allowed beyond credit balance */
            fun overageEnabled(overageEnabled: Boolean?) =
                overageEnabled(JsonField.ofNullable(overageEnabled))

            /**
             * Alias for [Builder.overageEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun overageEnabled(overageEnabled: Boolean) = overageEnabled(overageEnabled as Boolean?)

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

            /** Maximum amount of overage allowed */
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

            /** Whether to preserve overage balance when credits reset */
            fun preserveOverageAtReset(preserveOverageAtReset: Boolean?) =
                preserveOverageAtReset(JsonField.ofNullable(preserveOverageAtReset))

            /**
             * Alias for [Builder.preserveOverageAtReset].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun preserveOverageAtReset(preserveOverageAtReset: Boolean) =
                preserveOverageAtReset(preserveOverageAtReset as Boolean?)

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

            /** Price per credit unit for purchasing additional credits */
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

            /** Proration behavior for credit grants during plan changes */
            fun prorationBehavior(prorationBehavior: ProrationBehavior?) =
                prorationBehavior(JsonField.ofNullable(prorationBehavior))

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

            /** Whether unused credits can roll over to the next billing period */
            fun rolloverEnabled(rolloverEnabled: Boolean?) =
                rolloverEnabled(JsonField.ofNullable(rolloverEnabled))

            /**
             * Alias for [Builder.rolloverEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverEnabled(rolloverEnabled: Boolean) =
                rolloverEnabled(rolloverEnabled as Boolean?)

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

            /** Percentage of unused credits that can roll over (0-100) */
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

            /** Number of timeframe units for rollover window */
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

            /** Time interval for rollover window (day, week, month, year) */
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

            /** Credits granted during trial period */
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

            /** Whether trial credits expire when trial ends */
            fun trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial: Boolean?) =
                trialCreditsExpireAfterTrial(JsonField.ofNullable(trialCreditsExpireAfterTrial))

            /**
             * Alias for [Builder.trialCreditsExpireAfterTrial].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial: Boolean) =
                trialCreditsExpireAfterTrial(trialCreditsExpireAfterTrial as Boolean?)

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
             * .creditEntitlementId()
             * .creditsAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditEntitlement =
                CreditEntitlement(
                    checkRequired("creditEntitlementId", creditEntitlementId),
                    checkRequired("creditsAmount", creditsAmount),
                    creditsReduceOverage,
                    currency,
                    expiresAfterDays,
                    lowBalanceThresholdPercent,
                    maxRolloverCount,
                    overageChargeAtBilling,
                    overageEnabled,
                    overageLimit,
                    preserveOverageAtReset,
                    pricePerUnit,
                    prorationBehavior,
                    rolloverEnabled,
                    rolloverPercentage,
                    rolloverTimeframeCount,
                    rolloverTimeframeInterval,
                    trialCredits,
                    trialCreditsExpireAfterTrial,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditEntitlement = apply {
            if (validated) {
                return@apply
            }

            creditEntitlementId()
            creditsAmount()
            creditsReduceOverage()
            currency()?.validate()
            expiresAfterDays()
            lowBalanceThresholdPercent()
            maxRolloverCount()
            overageChargeAtBilling()
            overageEnabled()
            overageLimit()
            preserveOverageAtReset()
            pricePerUnit()
            prorationBehavior()?.validate()
            rolloverEnabled()
            rolloverPercentage()
            rolloverTimeframeCount()
            rolloverTimeframeInterval()?.validate()
            trialCredits()
            trialCreditsExpireAfterTrial()
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
            (if (creditEntitlementId.asKnown() == null) 0 else 1) +
                (if (creditsAmount.asKnown() == null) 0 else 1) +
                (if (creditsReduceOverage.asKnown() == null) 0 else 1) +
                (currency.asKnown()?.validity() ?: 0) +
                (if (expiresAfterDays.asKnown() == null) 0 else 1) +
                (if (lowBalanceThresholdPercent.asKnown() == null) 0 else 1) +
                (if (maxRolloverCount.asKnown() == null) 0 else 1) +
                (if (overageChargeAtBilling.asKnown() == null) 0 else 1) +
                (if (overageEnabled.asKnown() == null) 0 else 1) +
                (if (overageLimit.asKnown() == null) 0 else 1) +
                (if (preserveOverageAtReset.asKnown() == null) 0 else 1) +
                (if (pricePerUnit.asKnown() == null) 0 else 1) +
                (prorationBehavior.asKnown()?.validity() ?: 0) +
                (if (rolloverEnabled.asKnown() == null) 0 else 1) +
                (if (rolloverPercentage.asKnown() == null) 0 else 1) +
                (if (rolloverTimeframeCount.asKnown() == null) 0 else 1) +
                (rolloverTimeframeInterval.asKnown()?.validity() ?: 0) +
                (if (trialCredits.asKnown() == null) 0 else 1) +
                (if (trialCreditsExpireAfterTrial.asKnown() == null) 0 else 1)

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
                creditEntitlementId == other.creditEntitlementId &&
                creditsAmount == other.creditsAmount &&
                creditsReduceOverage == other.creditsReduceOverage &&
                currency == other.currency &&
                expiresAfterDays == other.expiresAfterDays &&
                lowBalanceThresholdPercent == other.lowBalanceThresholdPercent &&
                maxRolloverCount == other.maxRolloverCount &&
                overageChargeAtBilling == other.overageChargeAtBilling &&
                overageEnabled == other.overageEnabled &&
                overageLimit == other.overageLimit &&
                preserveOverageAtReset == other.preserveOverageAtReset &&
                pricePerUnit == other.pricePerUnit &&
                prorationBehavior == other.prorationBehavior &&
                rolloverEnabled == other.rolloverEnabled &&
                rolloverPercentage == other.rolloverPercentage &&
                rolloverTimeframeCount == other.rolloverTimeframeCount &&
                rolloverTimeframeInterval == other.rolloverTimeframeInterval &&
                trialCredits == other.trialCredits &&
                trialCreditsExpireAfterTrial == other.trialCreditsExpireAfterTrial &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditEntitlementId,
                creditsAmount,
                creditsReduceOverage,
                currency,
                expiresAfterDays,
                lowBalanceThresholdPercent,
                maxRolloverCount,
                overageChargeAtBilling,
                overageEnabled,
                overageLimit,
                preserveOverageAtReset,
                pricePerUnit,
                prorationBehavior,
                rolloverEnabled,
                rolloverPercentage,
                rolloverTimeframeCount,
                rolloverTimeframeInterval,
                trialCredits,
                trialCreditsExpireAfterTrial,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditEntitlement{creditEntitlementId=$creditEntitlementId, creditsAmount=$creditsAmount, creditsReduceOverage=$creditsReduceOverage, currency=$currency, expiresAfterDays=$expiresAfterDays, lowBalanceThresholdPercent=$lowBalanceThresholdPercent, maxRolloverCount=$maxRolloverCount, overageChargeAtBilling=$overageChargeAtBilling, overageEnabled=$overageEnabled, overageLimit=$overageLimit, preserveOverageAtReset=$preserveOverageAtReset, pricePerUnit=$pricePerUnit, prorationBehavior=$prorationBehavior, rolloverEnabled=$rolloverEnabled, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, trialCredits=$trialCredits, trialCreditsExpireAfterTrial=$trialCreditsExpireAfterTrial, additionalProperties=$additionalProperties}"
    }

    /** Choose how you would like you digital product delivered */
    class DigitalProductDelivery
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val externalUrl: JsonField<String>,
        private val files: JsonField<List<String>>,
        private val instructions: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_url")
            @ExcludeMissing
            externalUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("files")
            @ExcludeMissing
            files: JsonField<List<String>> = JsonMissing.of(),
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
        fun files(): List<String>? = files.getNullable("files")

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
        @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<List<String>> = files

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
            private var files: JsonField<MutableList<String>>? = null
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
            fun files(files: List<String>?) = files(JsonField.ofNullable(files))

            /**
             * Sets [Builder.files] to an arbitrary JSON value.
             *
             * You should usually call [Builder.files] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun files(files: JsonField<List<String>>) = apply {
                this.files = files.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [files].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFile(file: String) = apply {
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
            files()
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
                (files.asKnown()?.size ?: 0) +
                (if (instructions.asKnown() == null) 0 else 1)

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

    /** Additional metadata for the product */
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

        return other is ProductUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProductUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
