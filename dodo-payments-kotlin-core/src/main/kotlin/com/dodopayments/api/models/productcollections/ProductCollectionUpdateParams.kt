// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class ProductCollectionUpdateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * Optional brand_id update
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun brandId(): String? = body.brandId()

    /**
     * Optional description update - pass null to remove, omit to keep unchanged
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Effective_at setting for downgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
     * None = no change
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun effectiveAtOnDowngrade(): EffectiveAtOnDowngrade? = body.effectiveAtOnDowngrade()

    /**
     * Effective_at setting for upgrades: Some(Some(val)) = set, Some(None) = clear (inherit), None
     * = no change
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun effectiveAtOnUpgrade(): EffectiveAtOnUpgrade? = body.effectiveAtOnUpgrade()

    /**
     * Optional new order for groups (array of group UUIDs in desired order)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun groupOrder(): List<String>? = body.groupOrder()

    /**
     * Optional image update - pass null to remove, omit to keep unchanged
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun imageId(): String? = body.imageId()

    /**
     * Optional new name for the collection
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * On payment failure behavior: Some(Some(val)) = set, Some(None) = clear (inherit), None = no
     * change
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun onPaymentFailure(): OnPaymentFailure? = body.onPaymentFailure()

    /**
     * Proration billing mode for downgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
     * None = no change
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun prorationBillingModeOnDowngrade(): ProrationBillingModeOnDowngrade? =
        body.prorationBillingModeOnDowngrade()

    /**
     * Proration billing mode for upgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
     * None = no change
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun prorationBillingModeOnUpgrade(): ProrationBillingModeOnUpgrade? =
        body.prorationBillingModeOnUpgrade()

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _brandId(): JsonField<String> = body._brandId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [effectiveAtOnDowngrade].
     *
     * Unlike [effectiveAtOnDowngrade], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _effectiveAtOnDowngrade(): JsonField<EffectiveAtOnDowngrade> =
        body._effectiveAtOnDowngrade()

    /**
     * Returns the raw JSON value of [effectiveAtOnUpgrade].
     *
     * Unlike [effectiveAtOnUpgrade], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _effectiveAtOnUpgrade(): JsonField<EffectiveAtOnUpgrade> = body._effectiveAtOnUpgrade()

    /**
     * Returns the raw JSON value of [groupOrder].
     *
     * Unlike [groupOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupOrder(): JsonField<List<String>> = body._groupOrder()

    /**
     * Returns the raw JSON value of [imageId].
     *
     * Unlike [imageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _imageId(): JsonField<String> = body._imageId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [onPaymentFailure].
     *
     * Unlike [onPaymentFailure], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _onPaymentFailure(): JsonField<OnPaymentFailure> = body._onPaymentFailure()

    /**
     * Returns the raw JSON value of [prorationBillingModeOnDowngrade].
     *
     * Unlike [prorationBillingModeOnDowngrade], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _prorationBillingModeOnDowngrade(): JsonField<ProrationBillingModeOnDowngrade> =
        body._prorationBillingModeOnDowngrade()

    /**
     * Returns the raw JSON value of [prorationBillingModeOnUpgrade].
     *
     * Unlike [prorationBillingModeOnUpgrade], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _prorationBillingModeOnUpgrade(): JsonField<ProrationBillingModeOnUpgrade> =
        body._prorationBillingModeOnUpgrade()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ProductCollectionUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProductCollectionUpdateParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductCollectionUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(productCollectionUpdateParams: ProductCollectionUpdateParams) = apply {
            id = productCollectionUpdateParams.id
            body = productCollectionUpdateParams.body.toBuilder()
            additionalHeaders = productCollectionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = productCollectionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [brandId]
         * - [description]
         * - [effectiveAtOnDowngrade]
         * - [effectiveAtOnUpgrade]
         * - [groupOrder]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Optional brand_id update */
        fun brandId(brandId: String?) = apply { body.brandId(brandId) }

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { body.brandId(brandId) }

        /** Optional description update - pass null to remove, omit to keep unchanged */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Effective_at setting for downgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
         * None = no change
         */
        fun effectiveAtOnDowngrade(effectiveAtOnDowngrade: EffectiveAtOnDowngrade?) = apply {
            body.effectiveAtOnDowngrade(effectiveAtOnDowngrade)
        }

        /**
         * Sets [Builder.effectiveAtOnDowngrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtOnDowngrade] with a well-typed
         * [EffectiveAtOnDowngrade] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun effectiveAtOnDowngrade(effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade>) =
            apply {
                body.effectiveAtOnDowngrade(effectiveAtOnDowngrade)
            }

        /**
         * Effective_at setting for upgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
         * None = no change
         */
        fun effectiveAtOnUpgrade(effectiveAtOnUpgrade: EffectiveAtOnUpgrade?) = apply {
            body.effectiveAtOnUpgrade(effectiveAtOnUpgrade)
        }

        /**
         * Sets [Builder.effectiveAtOnUpgrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtOnUpgrade] with a well-typed
         * [EffectiveAtOnUpgrade] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun effectiveAtOnUpgrade(effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade>) = apply {
            body.effectiveAtOnUpgrade(effectiveAtOnUpgrade)
        }

        /** Optional new order for groups (array of group UUIDs in desired order) */
        fun groupOrder(groupOrder: List<String>?) = apply { body.groupOrder(groupOrder) }

        /**
         * Sets [Builder.groupOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupOrder] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupOrder(groupOrder: JsonField<List<String>>) = apply { body.groupOrder(groupOrder) }

        /**
         * Adds a single [String] to [Builder.groupOrder].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupOrder(groupOrder: String) = apply { body.addGroupOrder(groupOrder) }

        /** Optional image update - pass null to remove, omit to keep unchanged */
        fun imageId(imageId: String?) = apply { body.imageId(imageId) }

        /**
         * Sets [Builder.imageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imageId(imageId: JsonField<String>) = apply { body.imageId(imageId) }

        /** Optional new name for the collection */
        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * On payment failure behavior: Some(Some(val)) = set, Some(None) = clear (inherit), None =
         * no change
         */
        fun onPaymentFailure(onPaymentFailure: OnPaymentFailure?) = apply {
            body.onPaymentFailure(onPaymentFailure)
        }

        /**
         * Sets [Builder.onPaymentFailure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onPaymentFailure] with a well-typed [OnPaymentFailure]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onPaymentFailure(onPaymentFailure: JsonField<OnPaymentFailure>) = apply {
            body.onPaymentFailure(onPaymentFailure)
        }

        /**
         * Proration billing mode for downgrades: Some(Some(val)) = set, Some(None) = clear
         * (inherit), None = no change
         */
        fun prorationBillingModeOnDowngrade(
            prorationBillingModeOnDowngrade: ProrationBillingModeOnDowngrade?
        ) = apply { body.prorationBillingModeOnDowngrade(prorationBillingModeOnDowngrade) }

        /**
         * Sets [Builder.prorationBillingModeOnDowngrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prorationBillingModeOnDowngrade] with a well-typed
         * [ProrationBillingModeOnDowngrade] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun prorationBillingModeOnDowngrade(
            prorationBillingModeOnDowngrade: JsonField<ProrationBillingModeOnDowngrade>
        ) = apply { body.prorationBillingModeOnDowngrade(prorationBillingModeOnDowngrade) }

        /**
         * Proration billing mode for upgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
         * None = no change
         */
        fun prorationBillingModeOnUpgrade(
            prorationBillingModeOnUpgrade: ProrationBillingModeOnUpgrade?
        ) = apply { body.prorationBillingModeOnUpgrade(prorationBillingModeOnUpgrade) }

        /**
         * Sets [Builder.prorationBillingModeOnUpgrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prorationBillingModeOnUpgrade] with a well-typed
         * [ProrationBillingModeOnUpgrade] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun prorationBillingModeOnUpgrade(
            prorationBillingModeOnUpgrade: JsonField<ProrationBillingModeOnUpgrade>
        ) = apply { body.prorationBillingModeOnUpgrade(prorationBillingModeOnUpgrade) }

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
         * Returns an immutable instance of [ProductCollectionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProductCollectionUpdateParams =
            ProductCollectionUpdateParams(
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
        private val brandId: JsonField<String>,
        private val description: JsonField<String>,
        private val effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade>,
        private val effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade>,
        private val groupOrder: JsonField<List<String>>,
        private val imageId: JsonField<String>,
        private val name: JsonField<String>,
        private val onPaymentFailure: JsonField<OnPaymentFailure>,
        private val prorationBillingModeOnDowngrade: JsonField<ProrationBillingModeOnDowngrade>,
        private val prorationBillingModeOnUpgrade: JsonField<ProrationBillingModeOnUpgrade>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("effective_at_on_downgrade")
            @ExcludeMissing
            effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade> = JsonMissing.of(),
            @JsonProperty("effective_at_on_upgrade")
            @ExcludeMissing
            effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade> = JsonMissing.of(),
            @JsonProperty("group_order")
            @ExcludeMissing
            groupOrder: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("image_id") @ExcludeMissing imageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("on_payment_failure")
            @ExcludeMissing
            onPaymentFailure: JsonField<OnPaymentFailure> = JsonMissing.of(),
            @JsonProperty("proration_billing_mode_on_downgrade")
            @ExcludeMissing
            prorationBillingModeOnDowngrade: JsonField<ProrationBillingModeOnDowngrade> =
                JsonMissing.of(),
            @JsonProperty("proration_billing_mode_on_upgrade")
            @ExcludeMissing
            prorationBillingModeOnUpgrade: JsonField<ProrationBillingModeOnUpgrade> =
                JsonMissing.of(),
        ) : this(
            brandId,
            description,
            effectiveAtOnDowngrade,
            effectiveAtOnUpgrade,
            groupOrder,
            imageId,
            name,
            onPaymentFailure,
            prorationBillingModeOnDowngrade,
            prorationBillingModeOnUpgrade,
            mutableMapOf(),
        )

        /**
         * Optional brand_id update
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun brandId(): String? = brandId.getNullable("brand_id")

        /**
         * Optional description update - pass null to remove, omit to keep unchanged
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Effective_at setting for downgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
         * None = no change
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun effectiveAtOnDowngrade(): EffectiveAtOnDowngrade? =
            effectiveAtOnDowngrade.getNullable("effective_at_on_downgrade")

        /**
         * Effective_at setting for upgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
         * None = no change
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun effectiveAtOnUpgrade(): EffectiveAtOnUpgrade? =
            effectiveAtOnUpgrade.getNullable("effective_at_on_upgrade")

        /**
         * Optional new order for groups (array of group UUIDs in desired order)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun groupOrder(): List<String>? = groupOrder.getNullable("group_order")

        /**
         * Optional image update - pass null to remove, omit to keep unchanged
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun imageId(): String? = imageId.getNullable("image_id")

        /**
         * Optional new name for the collection
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * On payment failure behavior: Some(Some(val)) = set, Some(None) = clear (inherit), None =
         * no change
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun onPaymentFailure(): OnPaymentFailure? =
            onPaymentFailure.getNullable("on_payment_failure")

        /**
         * Proration billing mode for downgrades: Some(Some(val)) = set, Some(None) = clear
         * (inherit), None = no change
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun prorationBillingModeOnDowngrade(): ProrationBillingModeOnDowngrade? =
            prorationBillingModeOnDowngrade.getNullable("proration_billing_mode_on_downgrade")

        /**
         * Proration billing mode for upgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
         * None = no change
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun prorationBillingModeOnUpgrade(): ProrationBillingModeOnUpgrade? =
            prorationBillingModeOnUpgrade.getNullable("proration_billing_mode_on_upgrade")

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [effectiveAtOnDowngrade].
         *
         * Unlike [effectiveAtOnDowngrade], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("effective_at_on_downgrade")
        @ExcludeMissing
        fun _effectiveAtOnDowngrade(): JsonField<EffectiveAtOnDowngrade> = effectiveAtOnDowngrade

        /**
         * Returns the raw JSON value of [effectiveAtOnUpgrade].
         *
         * Unlike [effectiveAtOnUpgrade], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("effective_at_on_upgrade")
        @ExcludeMissing
        fun _effectiveAtOnUpgrade(): JsonField<EffectiveAtOnUpgrade> = effectiveAtOnUpgrade

        /**
         * Returns the raw JSON value of [groupOrder].
         *
         * Unlike [groupOrder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_order")
        @ExcludeMissing
        fun _groupOrder(): JsonField<List<String>> = groupOrder

        /**
         * Returns the raw JSON value of [imageId].
         *
         * Unlike [imageId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_id") @ExcludeMissing fun _imageId(): JsonField<String> = imageId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [onPaymentFailure].
         *
         * Unlike [onPaymentFailure], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("on_payment_failure")
        @ExcludeMissing
        fun _onPaymentFailure(): JsonField<OnPaymentFailure> = onPaymentFailure

        /**
         * Returns the raw JSON value of [prorationBillingModeOnDowngrade].
         *
         * Unlike [prorationBillingModeOnDowngrade], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("proration_billing_mode_on_downgrade")
        @ExcludeMissing
        fun _prorationBillingModeOnDowngrade(): JsonField<ProrationBillingModeOnDowngrade> =
            prorationBillingModeOnDowngrade

        /**
         * Returns the raw JSON value of [prorationBillingModeOnUpgrade].
         *
         * Unlike [prorationBillingModeOnUpgrade], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("proration_billing_mode_on_upgrade")
        @ExcludeMissing
        fun _prorationBillingModeOnUpgrade(): JsonField<ProrationBillingModeOnUpgrade> =
            prorationBillingModeOnUpgrade

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

            private var brandId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade> = JsonMissing.of()
            private var effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade> = JsonMissing.of()
            private var groupOrder: JsonField<MutableList<String>>? = null
            private var imageId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var onPaymentFailure: JsonField<OnPaymentFailure> = JsonMissing.of()
            private var prorationBillingModeOnDowngrade:
                JsonField<ProrationBillingModeOnDowngrade> =
                JsonMissing.of()
            private var prorationBillingModeOnUpgrade: JsonField<ProrationBillingModeOnUpgrade> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                brandId = body.brandId
                description = body.description
                effectiveAtOnDowngrade = body.effectiveAtOnDowngrade
                effectiveAtOnUpgrade = body.effectiveAtOnUpgrade
                groupOrder = body.groupOrder.map { it.toMutableList() }
                imageId = body.imageId
                name = body.name
                onPaymentFailure = body.onPaymentFailure
                prorationBillingModeOnDowngrade = body.prorationBillingModeOnDowngrade
                prorationBillingModeOnUpgrade = body.prorationBillingModeOnUpgrade
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Optional brand_id update */
            fun brandId(brandId: String?) = brandId(JsonField.ofNullable(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /** Optional description update - pass null to remove, omit to keep unchanged */
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

            /**
             * Effective_at setting for downgrades: Some(Some(val)) = set, Some(None) = clear
             * (inherit), None = no change
             */
            fun effectiveAtOnDowngrade(effectiveAtOnDowngrade: EffectiveAtOnDowngrade?) =
                effectiveAtOnDowngrade(JsonField.ofNullable(effectiveAtOnDowngrade))

            /**
             * Sets [Builder.effectiveAtOnDowngrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAtOnDowngrade] with a well-typed
             * [EffectiveAtOnDowngrade] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun effectiveAtOnDowngrade(effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade>) =
                apply {
                    this.effectiveAtOnDowngrade = effectiveAtOnDowngrade
                }

            /**
             * Effective_at setting for upgrades: Some(Some(val)) = set, Some(None) = clear
             * (inherit), None = no change
             */
            fun effectiveAtOnUpgrade(effectiveAtOnUpgrade: EffectiveAtOnUpgrade?) =
                effectiveAtOnUpgrade(JsonField.ofNullable(effectiveAtOnUpgrade))

            /**
             * Sets [Builder.effectiveAtOnUpgrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAtOnUpgrade] with a well-typed
             * [EffectiveAtOnUpgrade] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun effectiveAtOnUpgrade(effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade>) =
                apply {
                    this.effectiveAtOnUpgrade = effectiveAtOnUpgrade
                }

            /** Optional new order for groups (array of group UUIDs in desired order) */
            fun groupOrder(groupOrder: List<String>?) = groupOrder(JsonField.ofNullable(groupOrder))

            /**
             * Sets [Builder.groupOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupOrder] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupOrder(groupOrder: JsonField<List<String>>) = apply {
                this.groupOrder = groupOrder.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.groupOrder].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupOrder(groupOrder: String) = apply {
                this.groupOrder =
                    (this.groupOrder ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupOrder", it).add(groupOrder)
                    }
            }

            /** Optional image update - pass null to remove, omit to keep unchanged */
            fun imageId(imageId: String?) = imageId(JsonField.ofNullable(imageId))

            /**
             * Sets [Builder.imageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageId(imageId: JsonField<String>) = apply { this.imageId = imageId }

            /** Optional new name for the collection */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * On payment failure behavior: Some(Some(val)) = set, Some(None) = clear (inherit),
             * None = no change
             */
            fun onPaymentFailure(onPaymentFailure: OnPaymentFailure?) =
                onPaymentFailure(JsonField.ofNullable(onPaymentFailure))

            /**
             * Sets [Builder.onPaymentFailure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onPaymentFailure] with a well-typed
             * [OnPaymentFailure] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun onPaymentFailure(onPaymentFailure: JsonField<OnPaymentFailure>) = apply {
                this.onPaymentFailure = onPaymentFailure
            }

            /**
             * Proration billing mode for downgrades: Some(Some(val)) = set, Some(None) = clear
             * (inherit), None = no change
             */
            fun prorationBillingModeOnDowngrade(
                prorationBillingModeOnDowngrade: ProrationBillingModeOnDowngrade?
            ) =
                prorationBillingModeOnDowngrade(
                    JsonField.ofNullable(prorationBillingModeOnDowngrade)
                )

            /**
             * Sets [Builder.prorationBillingModeOnDowngrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prorationBillingModeOnDowngrade] with a well-typed
             * [ProrationBillingModeOnDowngrade] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun prorationBillingModeOnDowngrade(
                prorationBillingModeOnDowngrade: JsonField<ProrationBillingModeOnDowngrade>
            ) = apply { this.prorationBillingModeOnDowngrade = prorationBillingModeOnDowngrade }

            /**
             * Proration billing mode for upgrades: Some(Some(val)) = set, Some(None) = clear
             * (inherit), None = no change
             */
            fun prorationBillingModeOnUpgrade(
                prorationBillingModeOnUpgrade: ProrationBillingModeOnUpgrade?
            ) = prorationBillingModeOnUpgrade(JsonField.ofNullable(prorationBillingModeOnUpgrade))

            /**
             * Sets [Builder.prorationBillingModeOnUpgrade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prorationBillingModeOnUpgrade] with a well-typed
             * [ProrationBillingModeOnUpgrade] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun prorationBillingModeOnUpgrade(
                prorationBillingModeOnUpgrade: JsonField<ProrationBillingModeOnUpgrade>
            ) = apply { this.prorationBillingModeOnUpgrade = prorationBillingModeOnUpgrade }

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
                    brandId,
                    description,
                    effectiveAtOnDowngrade,
                    effectiveAtOnUpgrade,
                    (groupOrder ?: JsonMissing.of()).map { it.toImmutable() },
                    imageId,
                    name,
                    onPaymentFailure,
                    prorationBillingModeOnDowngrade,
                    prorationBillingModeOnUpgrade,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            brandId()
            description()
            effectiveAtOnDowngrade()?.validate()
            effectiveAtOnUpgrade()?.validate()
            groupOrder()
            imageId()
            name()
            onPaymentFailure()?.validate()
            prorationBillingModeOnDowngrade()?.validate()
            prorationBillingModeOnUpgrade()?.validate()
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
            (if (brandId.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (effectiveAtOnDowngrade.asKnown()?.validity() ?: 0) +
                (effectiveAtOnUpgrade.asKnown()?.validity() ?: 0) +
                (groupOrder.asKnown()?.size ?: 0) +
                (if (imageId.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (onPaymentFailure.asKnown()?.validity() ?: 0) +
                (prorationBillingModeOnDowngrade.asKnown()?.validity() ?: 0) +
                (prorationBillingModeOnUpgrade.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                brandId == other.brandId &&
                description == other.description &&
                effectiveAtOnDowngrade == other.effectiveAtOnDowngrade &&
                effectiveAtOnUpgrade == other.effectiveAtOnUpgrade &&
                groupOrder == other.groupOrder &&
                imageId == other.imageId &&
                name == other.name &&
                onPaymentFailure == other.onPaymentFailure &&
                prorationBillingModeOnDowngrade == other.prorationBillingModeOnDowngrade &&
                prorationBillingModeOnUpgrade == other.prorationBillingModeOnUpgrade &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                brandId,
                description,
                effectiveAtOnDowngrade,
                effectiveAtOnUpgrade,
                groupOrder,
                imageId,
                name,
                onPaymentFailure,
                prorationBillingModeOnDowngrade,
                prorationBillingModeOnUpgrade,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{brandId=$brandId, description=$description, effectiveAtOnDowngrade=$effectiveAtOnDowngrade, effectiveAtOnUpgrade=$effectiveAtOnUpgrade, groupOrder=$groupOrder, imageId=$imageId, name=$name, onPaymentFailure=$onPaymentFailure, prorationBillingModeOnDowngrade=$prorationBillingModeOnDowngrade, prorationBillingModeOnUpgrade=$prorationBillingModeOnUpgrade, additionalProperties=$additionalProperties}"
    }

    /**
     * Effective_at setting for downgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
     * None = no change
     */
    class EffectiveAtOnDowngrade
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val IMMEDIATELY = of("immediately")

            val NEXT_BILLING_DATE = of("next_billing_date")

            fun of(value: String) = EffectiveAtOnDowngrade(JsonField.of(value))
        }

        /** An enum containing [EffectiveAtOnDowngrade]'s known values. */
        enum class Known {
            IMMEDIATELY,
            NEXT_BILLING_DATE,
        }

        /**
         * An enum containing [EffectiveAtOnDowngrade]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [EffectiveAtOnDowngrade] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMMEDIATELY,
            NEXT_BILLING_DATE,
            /**
             * An enum member indicating that [EffectiveAtOnDowngrade] was instantiated with an
             * unknown value.
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
                IMMEDIATELY -> Value.IMMEDIATELY
                NEXT_BILLING_DATE -> Value.NEXT_BILLING_DATE
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
                IMMEDIATELY -> Known.IMMEDIATELY
                NEXT_BILLING_DATE -> Known.NEXT_BILLING_DATE
                else ->
                    throw DodoPaymentsInvalidDataException("Unknown EffectiveAtOnDowngrade: $value")
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
        fun validate(): EffectiveAtOnDowngrade = apply {
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

            return other is EffectiveAtOnDowngrade && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Effective_at setting for upgrades: Some(Some(val)) = set, Some(None) = clear (inherit), None
     * = no change
     */
    class EffectiveAtOnUpgrade
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val IMMEDIATELY = of("immediately")

            val NEXT_BILLING_DATE = of("next_billing_date")

            fun of(value: String) = EffectiveAtOnUpgrade(JsonField.of(value))
        }

        /** An enum containing [EffectiveAtOnUpgrade]'s known values. */
        enum class Known {
            IMMEDIATELY,
            NEXT_BILLING_DATE,
        }

        /**
         * An enum containing [EffectiveAtOnUpgrade]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [EffectiveAtOnUpgrade] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMMEDIATELY,
            NEXT_BILLING_DATE,
            /**
             * An enum member indicating that [EffectiveAtOnUpgrade] was instantiated with an
             * unknown value.
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
                IMMEDIATELY -> Value.IMMEDIATELY
                NEXT_BILLING_DATE -> Value.NEXT_BILLING_DATE
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
                IMMEDIATELY -> Known.IMMEDIATELY
                NEXT_BILLING_DATE -> Known.NEXT_BILLING_DATE
                else ->
                    throw DodoPaymentsInvalidDataException("Unknown EffectiveAtOnUpgrade: $value")
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
        fun validate(): EffectiveAtOnUpgrade = apply {
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

            return other is EffectiveAtOnUpgrade && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * On payment failure behavior: Some(Some(val)) = set, Some(None) = clear (inherit), None = no
     * change
     */
    class OnPaymentFailure @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val PREVENT_CHANGE = of("prevent_change")

            val APPLY_CHANGE = of("apply_change")

            fun of(value: String) = OnPaymentFailure(JsonField.of(value))
        }

        /** An enum containing [OnPaymentFailure]'s known values. */
        enum class Known {
            PREVENT_CHANGE,
            APPLY_CHANGE,
        }

        /**
         * An enum containing [OnPaymentFailure]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OnPaymentFailure] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PREVENT_CHANGE,
            APPLY_CHANGE,
            /**
             * An enum member indicating that [OnPaymentFailure] was instantiated with an unknown
             * value.
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
                PREVENT_CHANGE -> Value.PREVENT_CHANGE
                APPLY_CHANGE -> Value.APPLY_CHANGE
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
                PREVENT_CHANGE -> Known.PREVENT_CHANGE
                APPLY_CHANGE -> Known.APPLY_CHANGE
                else -> throw DodoPaymentsInvalidDataException("Unknown OnPaymentFailure: $value")
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
        fun validate(): OnPaymentFailure = apply {
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

            return other is OnPaymentFailure && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Proration billing mode for downgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
     * None = no change
     */
    class ProrationBillingModeOnDowngrade
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val PRORATED_IMMEDIATELY = of("prorated_immediately")

            val FULL_IMMEDIATELY = of("full_immediately")

            val DIFFERENCE_IMMEDIATELY = of("difference_immediately")

            val DO_NOT_BILL = of("do_not_bill")

            fun of(value: String) = ProrationBillingModeOnDowngrade(JsonField.of(value))
        }

        /** An enum containing [ProrationBillingModeOnDowngrade]'s known values. */
        enum class Known {
            PRORATED_IMMEDIATELY,
            FULL_IMMEDIATELY,
            DIFFERENCE_IMMEDIATELY,
            DO_NOT_BILL,
        }

        /**
         * An enum containing [ProrationBillingModeOnDowngrade]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ProrationBillingModeOnDowngrade] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRORATED_IMMEDIATELY,
            FULL_IMMEDIATELY,
            DIFFERENCE_IMMEDIATELY,
            DO_NOT_BILL,
            /**
             * An enum member indicating that [ProrationBillingModeOnDowngrade] was instantiated
             * with an unknown value.
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
                PRORATED_IMMEDIATELY -> Value.PRORATED_IMMEDIATELY
                FULL_IMMEDIATELY -> Value.FULL_IMMEDIATELY
                DIFFERENCE_IMMEDIATELY -> Value.DIFFERENCE_IMMEDIATELY
                DO_NOT_BILL -> Value.DO_NOT_BILL
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
                PRORATED_IMMEDIATELY -> Known.PRORATED_IMMEDIATELY
                FULL_IMMEDIATELY -> Known.FULL_IMMEDIATELY
                DIFFERENCE_IMMEDIATELY -> Known.DIFFERENCE_IMMEDIATELY
                DO_NOT_BILL -> Known.DO_NOT_BILL
                else ->
                    throw DodoPaymentsInvalidDataException(
                        "Unknown ProrationBillingModeOnDowngrade: $value"
                    )
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
        fun validate(): ProrationBillingModeOnDowngrade = apply {
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

            return other is ProrationBillingModeOnDowngrade && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Proration billing mode for upgrades: Some(Some(val)) = set, Some(None) = clear (inherit),
     * None = no change
     */
    class ProrationBillingModeOnUpgrade
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val PRORATED_IMMEDIATELY = of("prorated_immediately")

            val FULL_IMMEDIATELY = of("full_immediately")

            val DIFFERENCE_IMMEDIATELY = of("difference_immediately")

            val DO_NOT_BILL = of("do_not_bill")

            fun of(value: String) = ProrationBillingModeOnUpgrade(JsonField.of(value))
        }

        /** An enum containing [ProrationBillingModeOnUpgrade]'s known values. */
        enum class Known {
            PRORATED_IMMEDIATELY,
            FULL_IMMEDIATELY,
            DIFFERENCE_IMMEDIATELY,
            DO_NOT_BILL,
        }

        /**
         * An enum containing [ProrationBillingModeOnUpgrade]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [ProrationBillingModeOnUpgrade] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRORATED_IMMEDIATELY,
            FULL_IMMEDIATELY,
            DIFFERENCE_IMMEDIATELY,
            DO_NOT_BILL,
            /**
             * An enum member indicating that [ProrationBillingModeOnUpgrade] was instantiated with
             * an unknown value.
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
                PRORATED_IMMEDIATELY -> Value.PRORATED_IMMEDIATELY
                FULL_IMMEDIATELY -> Value.FULL_IMMEDIATELY
                DIFFERENCE_IMMEDIATELY -> Value.DIFFERENCE_IMMEDIATELY
                DO_NOT_BILL -> Value.DO_NOT_BILL
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
                PRORATED_IMMEDIATELY -> Known.PRORATED_IMMEDIATELY
                FULL_IMMEDIATELY -> Known.FULL_IMMEDIATELY
                DIFFERENCE_IMMEDIATELY -> Known.DIFFERENCE_IMMEDIATELY
                DO_NOT_BILL -> Known.DO_NOT_BILL
                else ->
                    throw DodoPaymentsInvalidDataException(
                        "Unknown ProrationBillingModeOnUpgrade: $value"
                    )
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
        fun validate(): ProrationBillingModeOnUpgrade = apply {
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

            return other is ProrationBillingModeOnUpgrade && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductCollectionUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProductCollectionUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
