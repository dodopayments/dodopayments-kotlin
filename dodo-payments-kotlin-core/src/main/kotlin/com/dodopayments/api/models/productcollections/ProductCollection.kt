// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.productcollections.groups.ProductCollectionGroupResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ProductCollection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val brandId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val groups: JsonField<List<ProductCollectionGroupResponse>>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade>,
    private val effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade>,
    private val image: JsonField<String>,
    private val onPaymentFailure: JsonField<OnPaymentFailure>,
    private val prorationBillingModeOnDowngrade: JsonField<ProrationBillingModeOnDowngrade>,
    private val prorationBillingModeOnUpgrade: JsonField<ProrationBillingModeOnUpgrade>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("groups")
        @ExcludeMissing
        groups: JsonField<List<ProductCollectionGroupResponse>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at_on_downgrade")
        @ExcludeMissing
        effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade> = JsonMissing.of(),
        @JsonProperty("effective_at_on_upgrade")
        @ExcludeMissing
        effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade> = JsonMissing.of(),
        @JsonProperty("image") @ExcludeMissing image: JsonField<String> = JsonMissing.of(),
        @JsonProperty("on_payment_failure")
        @ExcludeMissing
        onPaymentFailure: JsonField<OnPaymentFailure> = JsonMissing.of(),
        @JsonProperty("proration_billing_mode_on_downgrade")
        @ExcludeMissing
        prorationBillingModeOnDowngrade: JsonField<ProrationBillingModeOnDowngrade> =
            JsonMissing.of(),
        @JsonProperty("proration_billing_mode_on_upgrade")
        @ExcludeMissing
        prorationBillingModeOnUpgrade: JsonField<ProrationBillingModeOnUpgrade> = JsonMissing.of(),
    ) : this(
        id,
        brandId,
        createdAt,
        groups,
        name,
        updatedAt,
        description,
        effectiveAtOnDowngrade,
        effectiveAtOnUpgrade,
        image,
        onPaymentFailure,
        prorationBillingModeOnDowngrade,
        prorationBillingModeOnUpgrade,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the product collection
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Brand ID for the collection
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
     * Timestamp when the collection was created
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Groups in this collection
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groups(): List<ProductCollectionGroupResponse> = groups.getRequired("groups")

    /**
     * Name of the collection
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Timestamp when the collection was last updated
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Description of the collection
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * Default effective_at setting for subscription plan downgrades (null = inherit from business)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun effectiveAtOnDowngrade(): EffectiveAtOnDowngrade? =
        effectiveAtOnDowngrade.getNullable("effective_at_on_downgrade")

    /**
     * Default effective_at setting for subscription plan upgrades (null = inherit from business)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun effectiveAtOnUpgrade(): EffectiveAtOnUpgrade? =
        effectiveAtOnUpgrade.getNullable("effective_at_on_upgrade")

    /**
     * URL of the collection image
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun image(): String? = image.getNullable("image")

    /**
     * Default behavior for subscription plan changes on payment failure (null = inherit from
     * business)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun onPaymentFailure(): OnPaymentFailure? = onPaymentFailure.getNullable("on_payment_failure")

    /**
     * Default proration billing mode for subscription plan downgrades (null = inherit from
     * business)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun prorationBillingModeOnDowngrade(): ProrationBillingModeOnDowngrade? =
        prorationBillingModeOnDowngrade.getNullable("proration_billing_mode_on_downgrade")

    /**
     * Default proration billing mode for subscription plan upgrades (null = inherit from business)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun prorationBillingModeOnUpgrade(): ProrationBillingModeOnUpgrade? =
        prorationBillingModeOnUpgrade.getNullable("proration_billing_mode_on_upgrade")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups")
    @ExcludeMissing
    fun _groups(): JsonField<List<ProductCollectionGroupResponse>> = groups

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Unlike [effectiveAtOnUpgrade], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_at_on_upgrade")
    @ExcludeMissing
    fun _effectiveAtOnUpgrade(): JsonField<EffectiveAtOnUpgrade> = effectiveAtOnUpgrade

    /**
     * Returns the raw JSON value of [image].
     *
     * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

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
     * Unlike [prorationBillingModeOnDowngrade], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("proration_billing_mode_on_downgrade")
    @ExcludeMissing
    fun _prorationBillingModeOnDowngrade(): JsonField<ProrationBillingModeOnDowngrade> =
        prorationBillingModeOnDowngrade

    /**
     * Returns the raw JSON value of [prorationBillingModeOnUpgrade].
     *
     * Unlike [prorationBillingModeOnUpgrade], this method doesn't throw if the JSON field has an
     * unexpected type.
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

        /**
         * Returns a mutable builder for constructing an instance of [ProductCollection].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .brandId()
         * .createdAt()
         * .groups()
         * .name()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductCollection]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var brandId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var groups: JsonField<MutableList<ProductCollectionGroupResponse>>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade> = JsonMissing.of()
        private var effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade> = JsonMissing.of()
        private var image: JsonField<String> = JsonMissing.of()
        private var onPaymentFailure: JsonField<OnPaymentFailure> = JsonMissing.of()
        private var prorationBillingModeOnDowngrade: JsonField<ProrationBillingModeOnDowngrade> =
            JsonMissing.of()
        private var prorationBillingModeOnUpgrade: JsonField<ProrationBillingModeOnUpgrade> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(productCollection: ProductCollection) = apply {
            id = productCollection.id
            brandId = productCollection.brandId
            createdAt = productCollection.createdAt
            groups = productCollection.groups.map { it.toMutableList() }
            name = productCollection.name
            updatedAt = productCollection.updatedAt
            description = productCollection.description
            effectiveAtOnDowngrade = productCollection.effectiveAtOnDowngrade
            effectiveAtOnUpgrade = productCollection.effectiveAtOnUpgrade
            image = productCollection.image
            onPaymentFailure = productCollection.onPaymentFailure
            prorationBillingModeOnDowngrade = productCollection.prorationBillingModeOnDowngrade
            prorationBillingModeOnUpgrade = productCollection.prorationBillingModeOnUpgrade
            additionalProperties = productCollection.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the product collection */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Brand ID for the collection */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /** Timestamp when the collection was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Groups in this collection */
        fun groups(groups: List<ProductCollectionGroupResponse>) = groups(JsonField.of(groups))

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed
         * `List<ProductCollectionGroupResponse>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun groups(groups: JsonField<List<ProductCollectionGroupResponse>>) = apply {
            this.groups = groups.map { it.toMutableList() }
        }

        /**
         * Adds a single [ProductCollectionGroupResponse] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: ProductCollectionGroupResponse) = apply {
            groups =
                (groups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groups", it).add(group)
                }
        }

        /** Name of the collection */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Timestamp when the collection was last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Description of the collection */
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
         * Default effective_at setting for subscription plan downgrades (null = inherit from
         * business)
         */
        fun effectiveAtOnDowngrade(effectiveAtOnDowngrade: EffectiveAtOnDowngrade?) =
            effectiveAtOnDowngrade(JsonField.ofNullable(effectiveAtOnDowngrade))

        /**
         * Sets [Builder.effectiveAtOnDowngrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtOnDowngrade] with a well-typed
         * [EffectiveAtOnDowngrade] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun effectiveAtOnDowngrade(effectiveAtOnDowngrade: JsonField<EffectiveAtOnDowngrade>) =
            apply {
                this.effectiveAtOnDowngrade = effectiveAtOnDowngrade
            }

        /**
         * Default effective_at setting for subscription plan upgrades (null = inherit from
         * business)
         */
        fun effectiveAtOnUpgrade(effectiveAtOnUpgrade: EffectiveAtOnUpgrade?) =
            effectiveAtOnUpgrade(JsonField.ofNullable(effectiveAtOnUpgrade))

        /**
         * Sets [Builder.effectiveAtOnUpgrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtOnUpgrade] with a well-typed
         * [EffectiveAtOnUpgrade] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun effectiveAtOnUpgrade(effectiveAtOnUpgrade: JsonField<EffectiveAtOnUpgrade>) = apply {
            this.effectiveAtOnUpgrade = effectiveAtOnUpgrade
        }

        /** URL of the collection image */
        fun image(image: String?) = image(JsonField.ofNullable(image))

        /**
         * Sets [Builder.image] to an arbitrary JSON value.
         *
         * You should usually call [Builder.image] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun image(image: JsonField<String>) = apply { this.image = image }

        /**
         * Default behavior for subscription plan changes on payment failure (null = inherit from
         * business)
         */
        fun onPaymentFailure(onPaymentFailure: OnPaymentFailure?) =
            onPaymentFailure(JsonField.ofNullable(onPaymentFailure))

        /**
         * Sets [Builder.onPaymentFailure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onPaymentFailure] with a well-typed [OnPaymentFailure]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun onPaymentFailure(onPaymentFailure: JsonField<OnPaymentFailure>) = apply {
            this.onPaymentFailure = onPaymentFailure
        }

        /**
         * Default proration billing mode for subscription plan downgrades (null = inherit from
         * business)
         */
        fun prorationBillingModeOnDowngrade(
            prorationBillingModeOnDowngrade: ProrationBillingModeOnDowngrade?
        ) = prorationBillingModeOnDowngrade(JsonField.ofNullable(prorationBillingModeOnDowngrade))

        /**
         * Sets [Builder.prorationBillingModeOnDowngrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prorationBillingModeOnDowngrade] with a well-typed
         * [ProrationBillingModeOnDowngrade] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun prorationBillingModeOnDowngrade(
            prorationBillingModeOnDowngrade: JsonField<ProrationBillingModeOnDowngrade>
        ) = apply { this.prorationBillingModeOnDowngrade = prorationBillingModeOnDowngrade }

        /**
         * Default proration billing mode for subscription plan upgrades (null = inherit from
         * business)
         */
        fun prorationBillingModeOnUpgrade(
            prorationBillingModeOnUpgrade: ProrationBillingModeOnUpgrade?
        ) = prorationBillingModeOnUpgrade(JsonField.ofNullable(prorationBillingModeOnUpgrade))

        /**
         * Sets [Builder.prorationBillingModeOnUpgrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prorationBillingModeOnUpgrade] with a well-typed
         * [ProrationBillingModeOnUpgrade] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [ProductCollection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .brandId()
         * .createdAt()
         * .groups()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductCollection =
            ProductCollection(
                checkRequired("id", id),
                checkRequired("brandId", brandId),
                checkRequired("createdAt", createdAt),
                checkRequired("groups", groups).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                description,
                effectiveAtOnDowngrade,
                effectiveAtOnUpgrade,
                image,
                onPaymentFailure,
                prorationBillingModeOnDowngrade,
                prorationBillingModeOnUpgrade,
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
    fun validate(): ProductCollection = apply {
        if (validated) {
            return@apply
        }

        id()
        brandId()
        createdAt()
        groups().forEach { it.validate() }
        name()
        updatedAt()
        description()
        effectiveAtOnDowngrade()?.validate()
        effectiveAtOnUpgrade()?.validate()
        image()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (brandId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (groups.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (effectiveAtOnDowngrade.asKnown()?.validity() ?: 0) +
            (effectiveAtOnUpgrade.asKnown()?.validity() ?: 0) +
            (if (image.asKnown() == null) 0 else 1) +
            (onPaymentFailure.asKnown()?.validity() ?: 0) +
            (prorationBillingModeOnDowngrade.asKnown()?.validity() ?: 0) +
            (prorationBillingModeOnUpgrade.asKnown()?.validity() ?: 0)

    /**
     * Default effective_at setting for subscription plan downgrades (null = inherit from business)
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
     * Default effective_at setting for subscription plan upgrades (null = inherit from business)
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
     * Default behavior for subscription plan changes on payment failure (null = inherit from
     * business)
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
     * Default proration billing mode for subscription plan downgrades (null = inherit from
     * business)
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
     * Default proration billing mode for subscription plan upgrades (null = inherit from business)
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

        return other is ProductCollection &&
            id == other.id &&
            brandId == other.brandId &&
            createdAt == other.createdAt &&
            groups == other.groups &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            description == other.description &&
            effectiveAtOnDowngrade == other.effectiveAtOnDowngrade &&
            effectiveAtOnUpgrade == other.effectiveAtOnUpgrade &&
            image == other.image &&
            onPaymentFailure == other.onPaymentFailure &&
            prorationBillingModeOnDowngrade == other.prorationBillingModeOnDowngrade &&
            prorationBillingModeOnUpgrade == other.prorationBillingModeOnUpgrade &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            brandId,
            createdAt,
            groups,
            name,
            updatedAt,
            description,
            effectiveAtOnDowngrade,
            effectiveAtOnUpgrade,
            image,
            onPaymentFailure,
            prorationBillingModeOnDowngrade,
            prorationBillingModeOnUpgrade,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductCollection{id=$id, brandId=$brandId, createdAt=$createdAt, groups=$groups, name=$name, updatedAt=$updatedAt, description=$description, effectiveAtOnDowngrade=$effectiveAtOnDowngrade, effectiveAtOnUpgrade=$effectiveAtOnUpgrade, image=$image, onPaymentFailure=$onPaymentFailure, prorationBillingModeOnDowngrade=$prorationBillingModeOnDowngrade, prorationBillingModeOnUpgrade=$prorationBillingModeOnUpgrade, additionalProperties=$additionalProperties}"
}
