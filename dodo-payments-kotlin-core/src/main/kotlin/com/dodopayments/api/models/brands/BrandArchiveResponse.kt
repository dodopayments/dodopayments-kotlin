// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class BrandArchiveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val archivedAt: JsonField<OffsetDateTime>,
    private val brandId: JsonField<String>,
    private val collectionsMoved: JsonField<Long>,
    private val productsMoved: JsonField<Long>,
    private val subscriptionsMoved: JsonField<Long>,
    private val movedToBrandId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("archived_at")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("collections_moved")
        @ExcludeMissing
        collectionsMoved: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("products_moved")
        @ExcludeMissing
        productsMoved: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("subscriptions_moved")
        @ExcludeMissing
        subscriptionsMoved: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("moved_to_brand_id")
        @ExcludeMissing
        movedToBrandId: JsonField<String> = JsonMissing.of(),
    ) : this(
        archivedAt,
        brandId,
        collectionsMoved,
        productsMoved,
        subscriptionsMoved,
        movedToBrandId,
        mutableMapOf(),
    )

    /**
     * Time the brand was archived.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archivedAt(): OffsetDateTime = archivedAt.getRequired("archived_at")

    /**
     * The archived brand.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun brandId(): String = brandId.getRequired("brand_id")

    /**
     * Count of product collections moved to the target brand.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionsMoved(): Long = collectionsMoved.getRequired("collections_moved")

    /**
     * Count of products moved to the target brand.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productsMoved(): Long = productsMoved.getRequired("products_moved")

    /**
     * Count of live subscriptions moved to the target brand.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionsMoved(): Long = subscriptionsMoved.getRequired("subscriptions_moved")

    /**
     * Brand that received the moved records. Null when no target was given.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun movedToBrandId(): String? = movedToBrandId.getNullable("moved_to_brand_id")

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

    /**
     * Returns the raw JSON value of [collectionsMoved].
     *
     * Unlike [collectionsMoved], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collections_moved")
    @ExcludeMissing
    fun _collectionsMoved(): JsonField<Long> = collectionsMoved

    /**
     * Returns the raw JSON value of [productsMoved].
     *
     * Unlike [productsMoved], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("products_moved")
    @ExcludeMissing
    fun _productsMoved(): JsonField<Long> = productsMoved

    /**
     * Returns the raw JSON value of [subscriptionsMoved].
     *
     * Unlike [subscriptionsMoved], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriptions_moved")
    @ExcludeMissing
    fun _subscriptionsMoved(): JsonField<Long> = subscriptionsMoved

    /**
     * Returns the raw JSON value of [movedToBrandId].
     *
     * Unlike [movedToBrandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("moved_to_brand_id")
    @ExcludeMissing
    fun _movedToBrandId(): JsonField<String> = movedToBrandId

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
         * Returns a mutable builder for constructing an instance of [BrandArchiveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .archivedAt()
         * .brandId()
         * .collectionsMoved()
         * .productsMoved()
         * .subscriptionsMoved()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BrandArchiveResponse]. */
    class Builder internal constructor() {

        private var archivedAt: JsonField<OffsetDateTime>? = null
        private var brandId: JsonField<String>? = null
        private var collectionsMoved: JsonField<Long>? = null
        private var productsMoved: JsonField<Long>? = null
        private var subscriptionsMoved: JsonField<Long>? = null
        private var movedToBrandId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(brandArchiveResponse: BrandArchiveResponse) = apply {
            archivedAt = brandArchiveResponse.archivedAt
            brandId = brandArchiveResponse.brandId
            collectionsMoved = brandArchiveResponse.collectionsMoved
            productsMoved = brandArchiveResponse.productsMoved
            subscriptionsMoved = brandArchiveResponse.subscriptionsMoved
            movedToBrandId = brandArchiveResponse.movedToBrandId
            additionalProperties = brandArchiveResponse.additionalProperties.toMutableMap()
        }

        /** Time the brand was archived. */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        /** The archived brand. */
        fun brandId(brandId: String) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

        /** Count of product collections moved to the target brand. */
        fun collectionsMoved(collectionsMoved: Long) =
            collectionsMoved(JsonField.of(collectionsMoved))

        /**
         * Sets [Builder.collectionsMoved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionsMoved] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectionsMoved(collectionsMoved: JsonField<Long>) = apply {
            this.collectionsMoved = collectionsMoved
        }

        /** Count of products moved to the target brand. */
        fun productsMoved(productsMoved: Long) = productsMoved(JsonField.of(productsMoved))

        /**
         * Sets [Builder.productsMoved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productsMoved] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productsMoved(productsMoved: JsonField<Long>) = apply {
            this.productsMoved = productsMoved
        }

        /** Count of live subscriptions moved to the target brand. */
        fun subscriptionsMoved(subscriptionsMoved: Long) =
            subscriptionsMoved(JsonField.of(subscriptionsMoved))

        /**
         * Sets [Builder.subscriptionsMoved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionsMoved] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionsMoved(subscriptionsMoved: JsonField<Long>) = apply {
            this.subscriptionsMoved = subscriptionsMoved
        }

        /** Brand that received the moved records. Null when no target was given. */
        fun movedToBrandId(movedToBrandId: String?) =
            movedToBrandId(JsonField.ofNullable(movedToBrandId))

        /**
         * Sets [Builder.movedToBrandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.movedToBrandId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun movedToBrandId(movedToBrandId: JsonField<String>) = apply {
            this.movedToBrandId = movedToBrandId
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
         * Returns an immutable instance of [BrandArchiveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .archivedAt()
         * .brandId()
         * .collectionsMoved()
         * .productsMoved()
         * .subscriptionsMoved()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandArchiveResponse =
            BrandArchiveResponse(
                checkRequired("archivedAt", archivedAt),
                checkRequired("brandId", brandId),
                checkRequired("collectionsMoved", collectionsMoved),
                checkRequired("productsMoved", productsMoved),
                checkRequired("subscriptionsMoved", subscriptionsMoved),
                movedToBrandId,
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
    fun validate(): BrandArchiveResponse = apply {
        if (validated) {
            return@apply
        }

        archivedAt()
        brandId()
        collectionsMoved()
        productsMoved()
        subscriptionsMoved()
        movedToBrandId()
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
        (if (archivedAt.asKnown() == null) 0 else 1) +
            (if (brandId.asKnown() == null) 0 else 1) +
            (if (collectionsMoved.asKnown() == null) 0 else 1) +
            (if (productsMoved.asKnown() == null) 0 else 1) +
            (if (subscriptionsMoved.asKnown() == null) 0 else 1) +
            (if (movedToBrandId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandArchiveResponse &&
            archivedAt == other.archivedAt &&
            brandId == other.brandId &&
            collectionsMoved == other.collectionsMoved &&
            productsMoved == other.productsMoved &&
            subscriptionsMoved == other.subscriptionsMoved &&
            movedToBrandId == other.movedToBrandId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            archivedAt,
            brandId,
            collectionsMoved,
            productsMoved,
            subscriptionsMoved,
            movedToBrandId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandArchiveResponse{archivedAt=$archivedAt, brandId=$brandId, collectionsMoved=$collectionsMoved, productsMoved=$productsMoved, subscriptionsMoved=$subscriptionsMoved, movedToBrandId=$movedToBrandId, additionalProperties=$additionalProperties}"
}
