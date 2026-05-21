// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class ProductCollectionUnarchiveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val collectionId: JsonField<String>,
    private val excludedProductIds: JsonField<List<String>>,
    private val message: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("collection_id")
        @ExcludeMissing
        collectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("excluded_product_ids")
        @ExcludeMissing
        excludedProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
    ) : this(collectionId, excludedProductIds, message, mutableMapOf())

    /**
     * Collection ID that was unarchived
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectionId(): String = collectionId.getRequired("collection_id")

    /**
     * Product IDs that were excluded because they are archived
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun excludedProductIds(): List<String> = excludedProductIds.getRequired("excluded_product_ids")

    /**
     * Success message
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Returns the raw JSON value of [collectionId].
     *
     * Unlike [collectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collection_id")
    @ExcludeMissing
    fun _collectionId(): JsonField<String> = collectionId

    /**
     * Returns the raw JSON value of [excludedProductIds].
     *
     * Unlike [excludedProductIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("excluded_product_ids")
    @ExcludeMissing
    fun _excludedProductIds(): JsonField<List<String>> = excludedProductIds

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
         * [ProductCollectionUnarchiveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .collectionId()
         * .excludedProductIds()
         * .message()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductCollectionUnarchiveResponse]. */
    class Builder internal constructor() {

        private var collectionId: JsonField<String>? = null
        private var excludedProductIds: JsonField<MutableList<String>>? = null
        private var message: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(productCollectionUnarchiveResponse: ProductCollectionUnarchiveResponse) =
            apply {
                collectionId = productCollectionUnarchiveResponse.collectionId
                excludedProductIds =
                    productCollectionUnarchiveResponse.excludedProductIds.map { it.toMutableList() }
                message = productCollectionUnarchiveResponse.message
                additionalProperties =
                    productCollectionUnarchiveResponse.additionalProperties.toMutableMap()
            }

        /** Collection ID that was unarchived */
        fun collectionId(collectionId: String) = collectionId(JsonField.of(collectionId))

        /**
         * Sets [Builder.collectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun collectionId(collectionId: JsonField<String>) = apply {
            this.collectionId = collectionId
        }

        /** Product IDs that were excluded because they are archived */
        fun excludedProductIds(excludedProductIds: List<String>) =
            excludedProductIds(JsonField.of(excludedProductIds))

        /**
         * Sets [Builder.excludedProductIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludedProductIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun excludedProductIds(excludedProductIds: JsonField<List<String>>) = apply {
            this.excludedProductIds = excludedProductIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [excludedProductIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludedProductId(excludedProductId: String) = apply {
            excludedProductIds =
                (excludedProductIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("excludedProductIds", it).add(excludedProductId)
                }
        }

        /** Success message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

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
         * Returns an immutable instance of [ProductCollectionUnarchiveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .collectionId()
         * .excludedProductIds()
         * .message()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductCollectionUnarchiveResponse =
            ProductCollectionUnarchiveResponse(
                checkRequired("collectionId", collectionId),
                checkRequired("excludedProductIds", excludedProductIds).map { it.toImmutable() },
                checkRequired("message", message),
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
    fun validate(): ProductCollectionUnarchiveResponse = apply {
        if (validated) {
            return@apply
        }

        collectionId()
        excludedProductIds()
        message()
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
        (if (collectionId.asKnown() == null) 0 else 1) +
            (excludedProductIds.asKnown()?.size ?: 0) +
            (if (message.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductCollectionUnarchiveResponse &&
            collectionId == other.collectionId &&
            excludedProductIds == other.excludedProductIds &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(collectionId, excludedProductIds, message, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductCollectionUnarchiveResponse{collectionId=$collectionId, excludedProductIds=$excludedProductIds, message=$message, additionalProperties=$additionalProperties}"
}
