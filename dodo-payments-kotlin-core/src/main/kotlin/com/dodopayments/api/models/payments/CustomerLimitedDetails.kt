// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class CustomerLimitedDetails
@JsonCreator
private constructor(
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the customer */
    fun customerId(): String = customerId.getRequired("customer_id")

    /** Email address of the customer */
    fun email(): String = email.getRequired("email")

    /** Full name of the customer */
    fun name(): String = name.getRequired("name")

    /** Unique identifier for the customer */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /** Email address of the customer */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /** Full name of the customer */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerLimitedDetails = apply {
        if (validated) {
            return@apply
        }

        customerId()
        email()
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerLimitedDetails].
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * .email()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerLimitedDetails]. */
    class Builder internal constructor() {

        private var customerId: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerLimitedDetails: CustomerLimitedDetails) = apply {
            customerId = customerLimitedDetails.customerId
            email = customerLimitedDetails.email
            name = customerLimitedDetails.name
            additionalProperties = customerLimitedDetails.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the customer */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /** Unique identifier for the customer */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** Email address of the customer */
        fun email(email: String) = email(JsonField.of(email))

        /** Email address of the customer */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Full name of the customer */
        fun name(name: String) = name(JsonField.of(name))

        /** Full name of the customer */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): CustomerLimitedDetails =
            CustomerLimitedDetails(
                checkRequired("customerId", customerId),
                checkRequired("email", email),
                checkRequired("name", name),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerLimitedDetails && customerId == other.customerId && email == other.email && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(customerId, email, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerLimitedDetails{customerId=$customerId, email=$email, name=$name, additionalProperties=$additionalProperties}"
}
