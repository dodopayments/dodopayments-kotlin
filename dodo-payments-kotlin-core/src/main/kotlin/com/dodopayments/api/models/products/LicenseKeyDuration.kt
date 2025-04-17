// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class LicenseKeyDuration
@JsonCreator
private constructor(
    @JsonProperty("count") @ExcludeMissing private val count: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("interval")
    @ExcludeMissing
    private val interval: JsonField<TimeInterval> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun count(): Long = count.getRequired("count")

    fun interval(): TimeInterval = interval.getRequired("interval")

    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    @JsonProperty("interval") @ExcludeMissing fun _interval(): JsonField<TimeInterval> = interval

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LicenseKeyDuration = apply {
        if (validated) {
            return@apply
        }

        count()
        interval()
        validated = true
    }

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

        private var count: JsonField<Long>? = null
        private var interval: JsonField<TimeInterval>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseKeyDuration: LicenseKeyDuration) = apply {
            count = licenseKeyDuration.count
            interval = licenseKeyDuration.interval
            additionalProperties = licenseKeyDuration.additionalProperties.toMutableMap()
        }

        fun count(count: Long) = count(JsonField.of(count))

        fun count(count: JsonField<Long>) = apply { this.count = count }

        fun interval(interval: TimeInterval) = interval(JsonField.of(interval))

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

        fun build(): LicenseKeyDuration =
            LicenseKeyDuration(
                checkRequired("count", count),
                checkRequired("interval", interval),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyDuration && count == other.count && interval == other.interval && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(count, interval, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseKeyDuration{count=$count, interval=$interval, additionalProperties=$additionalProperties}"
}
