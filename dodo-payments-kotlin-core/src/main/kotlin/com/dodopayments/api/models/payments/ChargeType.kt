// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * The type of subscription charge that a payment is for.
 *
 * A payment has one invoice, and the invoice has one type. Thus each payment has one charge type. A
 * payment that charges no subscription has no charge type.
 * - `new`: the first payment of one or more subscriptions. A retry of that payment is also `new`. A
 *   cart with new subscriptions and one-time products is `new`. Read the one-time products from
 *   `product_cart`.
 * - `renewal`: a charge at the billing date. A dunning retry and a manual retry of that charge are
 *   also `renewal`. A `renewal` does not always extend the service period. For example, the usage
 *   settlement of a paused subscription is a `renewal` with `includes_usage` true and no entry in
 *   `service_periods`. Examine `service_periods` before you extend access.
 * - `plan_change`: a charge for a plan change. The change applies now or at the next billing date.
 * - `on_demand`: an on-demand charge of an on-demand subscription.
 */
class ChargeType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val NEW = of("new")

        val RENEWAL = of("renewal")

        val PLAN_CHANGE = of("plan_change")

        val ON_DEMAND = of("on_demand")

        fun of(value: String) = ChargeType(JsonField.of(value))
    }

    /** An enum containing [ChargeType]'s known values. */
    enum class Known {
        NEW,
        RENEWAL,
        PLAN_CHANGE,
        ON_DEMAND,
    }

    /**
     * An enum containing [ChargeType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ChargeType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        NEW,
        RENEWAL,
        PLAN_CHANGE,
        ON_DEMAND,
        /** An enum member indicating that [ChargeType] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            NEW -> Value.NEW
            RENEWAL -> Value.RENEWAL
            PLAN_CHANGE -> Value.PLAN_CHANGE
            ON_DEMAND -> Value.ON_DEMAND
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            NEW -> Known.NEW
            RENEWAL -> Known.RENEWAL
            PLAN_CHANGE -> Known.PLAN_CHANGE
            ON_DEMAND -> Known.ON_DEMAND
            else -> throw DodoPaymentsInvalidDataException("Unknown ChargeType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ChargeType = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChargeType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
