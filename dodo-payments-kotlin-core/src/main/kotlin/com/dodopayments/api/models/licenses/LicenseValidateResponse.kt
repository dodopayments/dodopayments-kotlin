// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licenses

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

class LicenseValidateResponse
private constructor(
    private val valid: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("valid") @ExcludeMissing valid: JsonField<Boolean> = JsonMissing.of()
    ) : this(valid, mutableMapOf())

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun valid(): Boolean = valid.getRequired("valid")

    /**
     * Returns the raw JSON value of [valid].
     *
     * Unlike [valid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid") @ExcludeMissing fun _valid(): JsonField<Boolean> = valid

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
         * Returns a mutable builder for constructing an instance of [LicenseValidateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .valid()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseValidateResponse]. */
    class Builder internal constructor() {

        private var valid: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseValidateResponse: LicenseValidateResponse) = apply {
            valid = licenseValidateResponse.valid
            additionalProperties = licenseValidateResponse.additionalProperties.toMutableMap()
        }

        fun valid(valid: Boolean) = valid(JsonField.of(valid))

        /**
         * Sets [Builder.valid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valid] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun valid(valid: JsonField<Boolean>) = apply { this.valid = valid }

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
         * Returns an immutable instance of [LicenseValidateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .valid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseValidateResponse =
            LicenseValidateResponse(
                checkRequired("valid", valid),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LicenseValidateResponse = apply {
        if (validated) {
            return@apply
        }

        valid()
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
    internal fun validity(): Int = (if (valid.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseValidateResponse && valid == other.valid && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(valid, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseValidateResponse{valid=$valid, additionalProperties=$additionalProperties}"
}
