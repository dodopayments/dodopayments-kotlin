// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

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

/**
 * Nested representation of license-key grant fields. Present only when the grant's entitlement has
 * `integration_type = 'license_key'` and a row exists in `license_keys`. The grant's top-level
 * `status` is the source of truth for the grant's lifecycle — no per-license-key status is exposed
 * here.
 */
class LicenseKeyGrant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val activationsUsed: JsonField<Int>,
    private val key: JsonField<String>,
    private val activationsLimit: JsonField<Int>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("activations_used")
        @ExcludeMissing
        activationsUsed: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activations_limit")
        @ExcludeMissing
        activationsLimit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(activationsUsed, key, activationsLimit, expiresAt, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun activationsUsed(): Int = activationsUsed.getRequired("activations_used")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = key.getRequired("key")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun activationsLimit(): Int? = activationsLimit.getNullable("activations_limit")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /**
     * Returns the raw JSON value of [activationsUsed].
     *
     * Unlike [activationsUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activations_used")
    @ExcludeMissing
    fun _activationsUsed(): JsonField<Int> = activationsUsed

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

    /**
     * Returns the raw JSON value of [activationsLimit].
     *
     * Unlike [activationsLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("activations_limit")
    @ExcludeMissing
    fun _activationsLimit(): JsonField<Int> = activationsLimit

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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
         * Returns a mutable builder for constructing an instance of [LicenseKeyGrant].
         *
         * The following fields are required:
         * ```kotlin
         * .activationsUsed()
         * .key()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseKeyGrant]. */
    class Builder internal constructor() {

        private var activationsUsed: JsonField<Int>? = null
        private var key: JsonField<String>? = null
        private var activationsLimit: JsonField<Int> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseKeyGrant: LicenseKeyGrant) = apply {
            activationsUsed = licenseKeyGrant.activationsUsed
            key = licenseKeyGrant.key
            activationsLimit = licenseKeyGrant.activationsLimit
            expiresAt = licenseKeyGrant.expiresAt
            additionalProperties = licenseKeyGrant.additionalProperties.toMutableMap()
        }

        fun activationsUsed(activationsUsed: Int) = activationsUsed(JsonField.of(activationsUsed))

        /**
         * Sets [Builder.activationsUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationsUsed] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activationsUsed(activationsUsed: JsonField<Int>) = apply {
            this.activationsUsed = activationsUsed
        }

        fun key(key: String) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { this.key = key }

        fun activationsLimit(activationsLimit: Int?) =
            activationsLimit(JsonField.ofNullable(activationsLimit))

        /**
         * Alias for [Builder.activationsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun activationsLimit(activationsLimit: Int) = activationsLimit(activationsLimit as Int?)

        /**
         * Sets [Builder.activationsLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationsLimit] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activationsLimit(activationsLimit: JsonField<Int>) = apply {
            this.activationsLimit = activationsLimit
        }

        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

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
         * Returns an immutable instance of [LicenseKeyGrant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .activationsUsed()
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseKeyGrant =
            LicenseKeyGrant(
                checkRequired("activationsUsed", activationsUsed),
                checkRequired("key", key),
                activationsLimit,
                expiresAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LicenseKeyGrant = apply {
        if (validated) {
            return@apply
        }

        activationsUsed()
        key()
        activationsLimit()
        expiresAt()
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
        (if (activationsUsed.asKnown() == null) 0 else 1) +
            (if (key.asKnown() == null) 0 else 1) +
            (if (activationsLimit.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseKeyGrant &&
            activationsUsed == other.activationsUsed &&
            key == other.key &&
            activationsLimit == other.activationsLimit &&
            expiresAt == other.expiresAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(activationsUsed, key, activationsLimit, expiresAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseKeyGrant{activationsUsed=$activationsUsed, key=$key, activationsLimit=$activationsLimit, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
}
