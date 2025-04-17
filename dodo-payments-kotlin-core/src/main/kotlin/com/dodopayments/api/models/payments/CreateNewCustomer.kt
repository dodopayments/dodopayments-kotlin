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
class CreateNewCustomer
@JsonCreator
private constructor(
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("create_new_customer")
    @ExcludeMissing
    private val createNewCustomer: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("phone_number")
    @ExcludeMissing
    private val phoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun email(): String = email.getRequired("email")

    fun name(): String = name.getRequired("name")

    /**
     * When false, the most recently created customer object with the given email is used if exists.
     * When true, a new customer object is always created False by default
     */
    fun createNewCustomer(): Boolean? = createNewCustomer.getNullable("create_new_customer")

    fun phoneNumber(): String? = phoneNumber.getNullable("phone_number")

    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * When false, the most recently created customer object with the given email is used if exists.
     * When true, a new customer object is always created False by default
     */
    @JsonProperty("create_new_customer")
    @ExcludeMissing
    fun _createNewCustomer(): JsonField<Boolean> = createNewCustomer

    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreateNewCustomer = apply {
        if (validated) {
            return@apply
        }

        email()
        name()
        createNewCustomer()
        phoneNumber()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreateNewCustomer].
         *
         * The following fields are required:
         * ```kotlin
         * .email()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreateNewCustomer]. */
    class Builder internal constructor() {

        private var email: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var createNewCustomer: JsonField<Boolean> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(createNewCustomer: CreateNewCustomer) = apply {
            email = createNewCustomer.email
            name = createNewCustomer.name
            this.createNewCustomer = createNewCustomer.createNewCustomer
            phoneNumber = createNewCustomer.phoneNumber
            additionalProperties = createNewCustomer.additionalProperties.toMutableMap()
        }

        fun email(email: String) = email(JsonField.of(email))

        fun email(email: JsonField<String>) = apply { this.email = email }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * When false, the most recently created customer object with the given email is used if
         * exists. When true, a new customer object is always created False by default
         */
        fun createNewCustomer(createNewCustomer: Boolean) =
            createNewCustomer(JsonField.of(createNewCustomer))

        /**
         * When false, the most recently created customer object with the given email is used if
         * exists. When true, a new customer object is always created False by default
         */
        fun createNewCustomer(createNewCustomer: JsonField<Boolean>) = apply {
            this.createNewCustomer = createNewCustomer
        }

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

        fun build(): CreateNewCustomer =
            CreateNewCustomer(
                checkRequired("email", email),
                checkRequired("name", name),
                createNewCustomer,
                phoneNumber,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreateNewCustomer && email == other.email && name == other.name && createNewCustomer == other.createNewCustomer && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(email, name, createNewCustomer, phoneNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateNewCustomer{email=$email, name=$name, createNewCustomer=$createNewCustomer, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}
