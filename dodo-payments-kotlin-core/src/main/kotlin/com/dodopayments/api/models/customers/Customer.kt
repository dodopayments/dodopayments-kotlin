// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

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
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Customer
@JsonCreator
private constructor(
    @JsonProperty("business_id")
    @ExcludeMissing
    private val businessId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_number")
    @ExcludeMissing
    private val phoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun businessId(): String = businessId.getRequired("business_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun customerId(): String = customerId.getRequired("customer_id")

    fun email(): String = email.getRequired("email")

    fun name(): String = name.getRequired("name")

    fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Customer = apply {
        if (validated) {
            return@apply
        }

        businessId()
        createdAt()
        customerId()
        email()
        name()
        phoneNumber()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Customer].
         *
         * The following fields are required:
         * ```kotlin
         * .businessId()
         * .createdAt()
         * .customerId()
         * .email()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Customer]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customer: Customer) = apply {
            businessId = customer.businessId
            createdAt = customer.createdAt
            customerId = customer.customerId
            email = customer.email
            name = customer.name
            phoneNumber = customer.phoneNumber
            additionalProperties = customer.additionalProperties.toMutableMap()
        }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun email(email: String) = email(JsonField.of(email))

        fun email(email: JsonField<String>) = apply { this.email = email }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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

        fun build(): Customer =
            Customer(
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("email", email),
                checkRequired("name", name),
                phoneNumber,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Customer && businessId == other.businessId && createdAt == other.createdAt && customerId == other.customerId && email == other.email && name == other.name && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(businessId, createdAt, customerId, email, name, phoneNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Customer{businessId=$businessId, createdAt=$createdAt, customerId=$customerId, email=$email, name=$name, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
