// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

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
import java.util.Collections
import java.util.Objects

/**
 * Request struct for attaching an entitlement to a product.
 *
 * Mirrors the `credit_entitlements` attach shape — every "attach something to a product" array
 * takes objects, not bare IDs. Uniform shape leaves room for per-attachment settings later without
 * another API break.
 */
class AttachProductEntitlement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val entitlementId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("entitlement_id")
        @ExcludeMissing
        entitlementId: JsonField<String> = JsonMissing.of()
    ) : this(entitlementId, mutableMapOf())

    /**
     * ID of the entitlement to attach to the product
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlementId(): String = entitlementId.getRequired("entitlement_id")

    /**
     * Returns the raw JSON value of [entitlementId].
     *
     * Unlike [entitlementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entitlement_id")
    @ExcludeMissing
    fun _entitlementId(): JsonField<String> = entitlementId

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
         * Returns a mutable builder for constructing an instance of [AttachProductEntitlement].
         *
         * The following fields are required:
         * ```kotlin
         * .entitlementId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AttachProductEntitlement]. */
    class Builder internal constructor() {

        private var entitlementId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(attachProductEntitlement: AttachProductEntitlement) = apply {
            entitlementId = attachProductEntitlement.entitlementId
            additionalProperties = attachProductEntitlement.additionalProperties.toMutableMap()
        }

        /** ID of the entitlement to attach to the product */
        fun entitlementId(entitlementId: String) = entitlementId(JsonField.of(entitlementId))

        /**
         * Sets [Builder.entitlementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entitlementId(entitlementId: JsonField<String>) = apply {
            this.entitlementId = entitlementId
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
         * Returns an immutable instance of [AttachProductEntitlement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .entitlementId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttachProductEntitlement =
            AttachProductEntitlement(
                checkRequired("entitlementId", entitlementId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AttachProductEntitlement = apply {
        if (validated) {
            return@apply
        }

        entitlementId()
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
    internal fun validity(): Int = (if (entitlementId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachProductEntitlement &&
            entitlementId == other.entitlementId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(entitlementId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttachProductEntitlement{entitlementId=$entitlementId, additionalProperties=$additionalProperties}"
}
