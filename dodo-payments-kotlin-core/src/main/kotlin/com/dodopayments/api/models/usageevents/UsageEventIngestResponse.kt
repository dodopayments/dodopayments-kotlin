// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

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

class UsageEventIngestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ingestedCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ingested_count")
        @ExcludeMissing
        ingestedCount: JsonField<Long> = JsonMissing.of()
    ) : this(ingestedCount, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ingestedCount(): Long = ingestedCount.getRequired("ingested_count")

    /**
     * Returns the raw JSON value of [ingestedCount].
     *
     * Unlike [ingestedCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ingested_count")
    @ExcludeMissing
    fun _ingestedCount(): JsonField<Long> = ingestedCount

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
         * Returns a mutable builder for constructing an instance of [UsageEventIngestResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .ingestedCount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UsageEventIngestResponse]. */
    class Builder internal constructor() {

        private var ingestedCount: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(usageEventIngestResponse: UsageEventIngestResponse) = apply {
            ingestedCount = usageEventIngestResponse.ingestedCount
            additionalProperties = usageEventIngestResponse.additionalProperties.toMutableMap()
        }

        fun ingestedCount(ingestedCount: Long) = ingestedCount(JsonField.of(ingestedCount))

        /**
         * Sets [Builder.ingestedCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ingestedCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ingestedCount(ingestedCount: JsonField<Long>) = apply {
            this.ingestedCount = ingestedCount
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
         * Returns an immutable instance of [UsageEventIngestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .ingestedCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageEventIngestResponse =
            UsageEventIngestResponse(
                checkRequired("ingestedCount", ingestedCount),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageEventIngestResponse = apply {
        if (validated) {
            return@apply
        }

        ingestedCount()
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
    internal fun validity(): Int = (if (ingestedCount.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageEventIngestResponse &&
            ingestedCount == other.ingestedCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(ingestedCount, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageEventIngestResponse{ingestedCount=$ingestedCount, additionalProperties=$additionalProperties}"
}
