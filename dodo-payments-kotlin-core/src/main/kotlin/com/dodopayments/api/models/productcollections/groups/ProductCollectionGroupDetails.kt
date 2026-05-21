// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections.groups

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

class ProductCollectionGroupDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val products: JsonField<List<GroupProduct>>,
    private val groupName: JsonField<String>,
    private val status: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("products")
        @ExcludeMissing
        products: JsonField<List<GroupProduct>> = JsonMissing.of(),
        @JsonProperty("group_name") @ExcludeMissing groupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Boolean> = JsonMissing.of(),
    ) : this(products, groupName, status, mutableMapOf())

    /**
     * Products in this group
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun products(): List<GroupProduct> = products.getRequired("products")

    /**
     * Optional group name. Multiple groups can have null names, but named groups must be unique per
     * collection
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun groupName(): String? = groupName.getNullable("group_name")

    /**
     * Status of the group (defaults to true if not provided)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Boolean? = status.getNullable("status")

    /**
     * Returns the raw JSON value of [products].
     *
     * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("products")
    @ExcludeMissing
    fun _products(): JsonField<List<GroupProduct>> = products

    /**
     * Returns the raw JSON value of [groupName].
     *
     * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_name") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Boolean> = status

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
         * [ProductCollectionGroupDetails].
         *
         * The following fields are required:
         * ```kotlin
         * .products()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProductCollectionGroupDetails]. */
    class Builder internal constructor() {

        private var products: JsonField<MutableList<GroupProduct>>? = null
        private var groupName: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(productCollectionGroupDetails: ProductCollectionGroupDetails) = apply {
            products = productCollectionGroupDetails.products.map { it.toMutableList() }
            groupName = productCollectionGroupDetails.groupName
            status = productCollectionGroupDetails.status
            additionalProperties = productCollectionGroupDetails.additionalProperties.toMutableMap()
        }

        /** Products in this group */
        fun products(products: List<GroupProduct>) = products(JsonField.of(products))

        /**
         * Sets [Builder.products] to an arbitrary JSON value.
         *
         * You should usually call [Builder.products] with a well-typed `List<GroupProduct>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun products(products: JsonField<List<GroupProduct>>) = apply {
            this.products = products.map { it.toMutableList() }
        }

        /**
         * Adds a single [GroupProduct] to [products].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProduct(product: GroupProduct) = apply {
            products =
                (products ?: JsonField.of(mutableListOf())).also {
                    checkKnown("products", it).add(product)
                }
        }

        /**
         * Optional group name. Multiple groups can have null names, but named groups must be unique
         * per collection
         */
        fun groupName(groupName: String?) = groupName(JsonField.ofNullable(groupName))

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

        /** Status of the group (defaults to true if not provided) */
        fun status(status: Boolean?) = status(JsonField.ofNullable(status))

        /**
         * Alias for [Builder.status].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun status(status: Boolean) = status(status as Boolean?)

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Boolean>) = apply { this.status = status }

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
         * Returns an immutable instance of [ProductCollectionGroupDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .products()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductCollectionGroupDetails =
            ProductCollectionGroupDetails(
                checkRequired("products", products).map { it.toImmutable() },
                groupName,
                status,
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
    fun validate(): ProductCollectionGroupDetails = apply {
        if (validated) {
            return@apply
        }

        products().forEach { it.validate() }
        groupName()
        status()
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
        (products.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (groupName.asKnown() == null) 0 else 1) +
            (if (status.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductCollectionGroupDetails &&
            products == other.products &&
            groupName == other.groupName &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(products, groupName, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductCollectionGroupDetails{products=$products, groupName=$groupName, status=$status, additionalProperties=$additionalProperties}"
}
