// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.Enum
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

/** The caller that cancelled a subscription or scheduled its cancel. */
class SubscriptionCancelledBy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actorType: JsonField<ActorType>,
    private val email: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actor_type")
        @ExcludeMissing
        actorType: JsonField<ActorType> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(actorType, email, name, mutableMapOf())

    /**
     * The kind of caller.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actorType(): ActorType = actorType.getRequired("actor_type")

    /**
     * Email of the customer or of the dashboard user. `null` for an API key or the Dodo Payments
     * team.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * Name of the customer or of the dashboard user. `null` for an API key or the Dodo Payments
     * team.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * Returns the raw JSON value of [actorType].
     *
     * Unlike [actorType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actor_type") @ExcludeMissing fun _actorType(): JsonField<ActorType> = actorType

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [SubscriptionCancelledBy].
         *
         * The following fields are required:
         * ```kotlin
         * .actorType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionCancelledBy]. */
    class Builder internal constructor() {

        private var actorType: JsonField<ActorType>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionCancelledBy: SubscriptionCancelledBy) = apply {
            actorType = subscriptionCancelledBy.actorType
            email = subscriptionCancelledBy.email
            name = subscriptionCancelledBy.name
            additionalProperties = subscriptionCancelledBy.additionalProperties.toMutableMap()
        }

        /** The kind of caller. */
        fun actorType(actorType: ActorType) = actorType(JsonField.of(actorType))

        /**
         * Sets [Builder.actorType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorType] with a well-typed [ActorType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actorType(actorType: JsonField<ActorType>) = apply { this.actorType = actorType }

        /**
         * Email of the customer or of the dashboard user. `null` for an API key or the Dodo
         * Payments team.
         */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * Name of the customer or of the dashboard user. `null` for an API key or the Dodo Payments
         * team.
         */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [SubscriptionCancelledBy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .actorType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionCancelledBy =
            SubscriptionCancelledBy(
                checkRequired("actorType", actorType),
                email,
                name,
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
    fun validate(): SubscriptionCancelledBy = apply {
        if (validated) {
            return@apply
        }

        actorType().validate()
        email()
        name()
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
        (actorType.asKnown()?.validity() ?: 0) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1)

    /** The kind of caller. */
    class ActorType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CUSTOMER = of("customer")

            val MERCHANT_USER = of("merchant_user")

            val API_KEY = of("api_key")

            val DODO_TEAM = of("dodo_team")

            fun of(value: String) = ActorType(JsonField.of(value))
        }

        /** An enum containing [ActorType]'s known values. */
        enum class Known {
            CUSTOMER,
            MERCHANT_USER,
            API_KEY,
            DODO_TEAM,
        }

        /**
         * An enum containing [ActorType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ActorType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER,
            MERCHANT_USER,
            API_KEY,
            DODO_TEAM,
            /**
             * An enum member indicating that [ActorType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CUSTOMER -> Value.CUSTOMER
                MERCHANT_USER -> Value.MERCHANT_USER
                API_KEY -> Value.API_KEY
                DODO_TEAM -> Value.DODO_TEAM
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CUSTOMER -> Known.CUSTOMER
                MERCHANT_USER -> Known.MERCHANT_USER
                API_KEY -> Known.API_KEY
                DODO_TEAM -> Known.DODO_TEAM
                else -> throw DodoPaymentsInvalidDataException("Unknown ActorType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ActorType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ActorType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCancelledBy &&
            actorType == other.actorType &&
            email == other.email &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(actorType, email, name, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionCancelledBy{actorType=$actorType, email=$email, name=$name, additionalProperties=$additionalProperties}"
}
