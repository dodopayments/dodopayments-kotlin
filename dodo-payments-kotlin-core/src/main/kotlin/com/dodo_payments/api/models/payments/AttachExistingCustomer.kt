// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

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
class AttachExistingCustomer
@JsonCreator
private constructor(
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun customerId(): String = customerId.getRequired("customer_id")

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AttachExistingCustomer = apply {
        if (validated) {
            return@apply
        }

        customerId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AttachExistingCustomer].
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AttachExistingCustomer]. */
    class Builder internal constructor() {

        private var customerId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(attachExistingCustomer: AttachExistingCustomer) = apply {
            customerId = attachExistingCustomer.customerId
            additionalProperties = attachExistingCustomer.additionalProperties.toMutableMap()
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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

        fun build(): AttachExistingCustomer =
            AttachExistingCustomer(
                checkRequired("customerId", customerId),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AttachExistingCustomer && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(customerId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttachExistingCustomer{customerId=$customerId, additionalProperties=$additionalProperties}"
}
