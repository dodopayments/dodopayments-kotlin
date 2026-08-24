// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * License-key delivery payload, present on grants for `license_key` entitlements. The grant's
 * top-level `status` is the source of truth for the grant's lifecycle.
 */
class LicenseKeyGrant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val activationsUsed: JsonField<Int>,
    private val key: JsonField<String>,
    private val status: JsonField<LicenseKeyStatus>,
    private val activationsLimit: JsonField<Int>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("activations_used")
        @ExcludeMissing
        activationsUsed: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<LicenseKeyStatus> = JsonMissing.of(),
        @JsonProperty("activations_limit")
        @ExcludeMissing
        activationsLimit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, activationsUsed, key, status, activationsLimit, expiresAt, mutableMapOf())

    /**
     * Identifier of the issued license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Number of instances currently active. Activation increments it and deactivation decrements
     * it, so it is a live count and not a total.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun activationsUsed(): Int = activationsUsed.getRequired("activations_used")

    /**
     * Issued license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = key.getRequired("key")

    /**
     * Current status of the license key. Activation fails unless it is `active`, so a client can
     * warn before the customer tries.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): LicenseKeyStatus = status.getRequired("status")

    /**
     * Maximum activations allowed by the entitlement, when set.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun activationsLimit(): Int? = activationsLimit.getNullable("activations_limit")

    /**
     * When the license key expires, when applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<LicenseKeyStatus> = status

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
         * .id()
         * .activationsUsed()
         * .key()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseKeyGrant]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var activationsUsed: JsonField<Int>? = null
        private var key: JsonField<String>? = null
        private var status: JsonField<LicenseKeyStatus>? = null
        private var activationsLimit: JsonField<Int> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseKeyGrant: LicenseKeyGrant) = apply {
            id = licenseKeyGrant.id
            activationsUsed = licenseKeyGrant.activationsUsed
            key = licenseKeyGrant.key
            status = licenseKeyGrant.status
            activationsLimit = licenseKeyGrant.activationsLimit
            expiresAt = licenseKeyGrant.expiresAt
            additionalProperties = licenseKeyGrant.additionalProperties.toMutableMap()
        }

        /** Identifier of the issued license key. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Number of instances currently active. Activation increments it and deactivation
         * decrements it, so it is a live count and not a total.
         */
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

        /** Issued license key. */
        fun key(key: String) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { this.key = key }

        /**
         * Current status of the license key. Activation fails unless it is `active`, so a client
         * can warn before the customer tries.
         */
        fun status(status: LicenseKeyStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [LicenseKeyStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<LicenseKeyStatus>) = apply { this.status = status }

        /** Maximum activations allowed by the entitlement, when set. */
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

        /** When the license key expires, when applicable. */
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
         * .id()
         * .activationsUsed()
         * .key()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseKeyGrant =
            LicenseKeyGrant(
                checkRequired("id", id),
                checkRequired("activationsUsed", activationsUsed),
                checkRequired("key", key),
                checkRequired("status", status),
                activationsLimit,
                expiresAt,
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
    fun validate(): LicenseKeyGrant = apply {
        if (validated) {
            return@apply
        }

        id()
        activationsUsed()
        key()
        status().validate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (activationsUsed.asKnown() == null) 0 else 1) +
            (if (key.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (activationsLimit.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseKeyGrant &&
            id == other.id &&
            activationsUsed == other.activationsUsed &&
            key == other.key &&
            status == other.status &&
            activationsLimit == other.activationsLimit &&
            expiresAt == other.expiresAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            activationsUsed,
            key,
            status,
            activationsLimit,
            expiresAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseKeyGrant{id=$id, activationsUsed=$activationsUsed, key=$key, status=$status, activationsLimit=$activationsLimit, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
}
