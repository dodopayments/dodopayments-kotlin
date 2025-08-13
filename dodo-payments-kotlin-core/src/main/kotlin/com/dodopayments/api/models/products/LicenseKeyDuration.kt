// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class LicenseKeyDuration
private constructor(
    private val count: JsonField<Int>,
    private val interval: JsonField<TimeInterval>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("interval")
        @ExcludeMissing
        interval: JsonField<TimeInterval> = JsonMissing.of(),
    ) : this(count, interval, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Int = count.getRequired("count")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interval(): TimeInterval = interval.getRequired("interval")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Int> = count

    /**
     * Returns the raw JSON value of [interval].
     *
     * Unlike [interval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interval") @ExcludeMissing fun _interval(): JsonField<TimeInterval> = interval

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

        private var count: JsonField<Int>? = null
        private var interval: JsonField<TimeInterval>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseKeyDuration: LicenseKeyDuration) = apply {
            count = licenseKeyDuration.count
            interval = licenseKeyDuration.interval
            additionalProperties = licenseKeyDuration.additionalProperties.toMutableMap()
        }

        fun count(count: Int) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Int>) = apply { this.count = count }

        fun interval(interval: TimeInterval) = interval(JsonField.of(interval))

        /**
         * Sets [Builder.interval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interval] with a well-typed [TimeInterval] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interval(interval: JsonField<TimeInterval>) = apply { this.interval = interval }

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
         * Returns an immutable instance of [LicenseKeyDuration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .count()
         * .interval()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseKeyDuration =
            LicenseKeyDuration(
                checkRequired("count", count),
                checkRequired("interval", interval),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LicenseKeyDuration = apply {
        if (validated) {
            return@apply
        }

        count()
        interval().validate()
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
        (if (count.asKnown() == null) 0 else 1) + (interval.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseKeyDuration &&
            count == other.count &&
            interval == other.interval &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(count, interval, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseKeyDuration{count=$count, interval=$interval, additionalProperties=$additionalProperties}"
}
