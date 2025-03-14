// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licenses

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class LicenseValidateResponse
@JsonCreator
private constructor(
    @JsonProperty("valid") @ExcludeMissing private val valid: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun valid(): Boolean = valid.getRequired("valid")

    @JsonProperty("valid") @ExcludeMissing fun _valid(): JsonField<Boolean> = valid

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LicenseValidateResponse = apply {
        if (validated) {
            return@apply
        }

        valid()
        validated = true
    }

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

        fun build(): LicenseValidateResponse =
            LicenseValidateResponse(
                checkRequired("valid", valid),
                additionalProperties.toImmutable(),
            )
    }

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
