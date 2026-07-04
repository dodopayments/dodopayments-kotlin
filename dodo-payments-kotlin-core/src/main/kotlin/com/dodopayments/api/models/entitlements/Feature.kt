// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

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

/** Capability conferred by a `feature_flag` grant. */
class Feature
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val featureId: JsonField<String>,
    private val featureType: JsonField<FeatureType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("feature_id") @ExcludeMissing featureId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feature_type")
        @ExcludeMissing
        featureType: JsonField<FeatureType> = JsonMissing.of(),
    ) : this(featureId, featureType, mutableMapOf())

    /**
     * Identifier of the capability this grant confers.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun featureId(): String = featureId.getRequired("feature_id")

    /**
     * Type of capability conferred.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun featureType(): FeatureType = featureType.getRequired("feature_type")

    /**
     * Returns the raw JSON value of [featureId].
     *
     * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feature_id") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

    /**
     * Returns the raw JSON value of [featureType].
     *
     * Unlike [featureType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feature_type")
    @ExcludeMissing
    fun _featureType(): JsonField<FeatureType> = featureType

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
         * Returns a mutable builder for constructing an instance of [Feature].
         *
         * The following fields are required:
         * ```kotlin
         * .featureId()
         * .featureType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Feature]. */
    class Builder internal constructor() {

        private var featureId: JsonField<String>? = null
        private var featureType: JsonField<FeatureType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(feature: Feature) = apply {
            featureId = feature.featureId
            featureType = feature.featureType
            additionalProperties = feature.additionalProperties.toMutableMap()
        }

        /** Identifier of the capability this grant confers. */
        fun featureId(featureId: String) = featureId(JsonField.of(featureId))

        /**
         * Sets [Builder.featureId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

        /** Type of capability conferred. */
        fun featureType(featureType: FeatureType) = featureType(JsonField.of(featureType))

        /**
         * Sets [Builder.featureType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureType] with a well-typed [FeatureType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun featureType(featureType: JsonField<FeatureType>) = apply {
            this.featureType = featureType
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
         * Returns an immutable instance of [Feature].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .featureId()
         * .featureType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Feature =
            Feature(
                checkRequired("featureId", featureId),
                checkRequired("featureType", featureType),
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
    fun validate(): Feature = apply {
        if (validated) {
            return@apply
        }

        featureId()
        featureType().validate()
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
        (if (featureId.asKnown() == null) 0 else 1) + (featureType.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Feature &&
            featureId == other.featureId &&
            featureType == other.featureType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(featureId, featureType, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Feature{featureId=$featureId, featureType=$featureType, additionalProperties=$additionalProperties}"
}
