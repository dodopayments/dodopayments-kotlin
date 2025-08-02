// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Event types for Dodo events */
class WebhookEventType @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val PAYMENT_SUCCEEDED = of("payment.succeeded")

        val PAYMENT_FAILED = of("payment.failed")

        val PAYMENT_PROCESSING = of("payment.processing")

        val PAYMENT_CANCELLED = of("payment.cancelled")

        val REFUND_SUCCEEDED = of("refund.succeeded")

        val REFUND_FAILED = of("refund.failed")

        val DISPUTE_OPENED = of("dispute.opened")

        val DISPUTE_EXPIRED = of("dispute.expired")

        val DISPUTE_ACCEPTED = of("dispute.accepted")

        val DISPUTE_CANCELLED = of("dispute.cancelled")

        val DISPUTE_CHALLENGED = of("dispute.challenged")

        val DISPUTE_WON = of("dispute.won")

        val DISPUTE_LOST = of("dispute.lost")

        val SUBSCRIPTION_ACTIVE = of("subscription.active")

        val SUBSCRIPTION_RENEWED = of("subscription.renewed")

        val SUBSCRIPTION_ON_HOLD = of("subscription.on_hold")

        val SUBSCRIPTION_CANCELLED = of("subscription.cancelled")

        val SUBSCRIPTION_FAILED = of("subscription.failed")

        val SUBSCRIPTION_EXPIRED = of("subscription.expired")

        val SUBSCRIPTION_PLAN_CHANGED = of("subscription.plan_changed")

        val LICENSE_KEY_CREATED = of("license_key.created")

        fun of(value: String) = WebhookEventType(JsonField.of(value))
    }

    /** An enum containing [WebhookEventType]'s known values. */
    enum class Known {
        PAYMENT_SUCCEEDED,
        PAYMENT_FAILED,
        PAYMENT_PROCESSING,
        PAYMENT_CANCELLED,
        REFUND_SUCCEEDED,
        REFUND_FAILED,
        DISPUTE_OPENED,
        DISPUTE_EXPIRED,
        DISPUTE_ACCEPTED,
        DISPUTE_CANCELLED,
        DISPUTE_CHALLENGED,
        DISPUTE_WON,
        DISPUTE_LOST,
        SUBSCRIPTION_ACTIVE,
        SUBSCRIPTION_RENEWED,
        SUBSCRIPTION_ON_HOLD,
        SUBSCRIPTION_CANCELLED,
        SUBSCRIPTION_FAILED,
        SUBSCRIPTION_EXPIRED,
        SUBSCRIPTION_PLAN_CHANGED,
        LICENSE_KEY_CREATED,
    }

    /**
     * An enum containing [WebhookEventType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [WebhookEventType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PAYMENT_SUCCEEDED,
        PAYMENT_FAILED,
        PAYMENT_PROCESSING,
        PAYMENT_CANCELLED,
        REFUND_SUCCEEDED,
        REFUND_FAILED,
        DISPUTE_OPENED,
        DISPUTE_EXPIRED,
        DISPUTE_ACCEPTED,
        DISPUTE_CANCELLED,
        DISPUTE_CHALLENGED,
        DISPUTE_WON,
        DISPUTE_LOST,
        SUBSCRIPTION_ACTIVE,
        SUBSCRIPTION_RENEWED,
        SUBSCRIPTION_ON_HOLD,
        SUBSCRIPTION_CANCELLED,
        SUBSCRIPTION_FAILED,
        SUBSCRIPTION_EXPIRED,
        SUBSCRIPTION_PLAN_CHANGED,
        LICENSE_KEY_CREATED,
        /**
         * An enum member indicating that [WebhookEventType] was instantiated with an unknown value.
         */
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
            PAYMENT_SUCCEEDED -> Value.PAYMENT_SUCCEEDED
            PAYMENT_FAILED -> Value.PAYMENT_FAILED
            PAYMENT_PROCESSING -> Value.PAYMENT_PROCESSING
            PAYMENT_CANCELLED -> Value.PAYMENT_CANCELLED
            REFUND_SUCCEEDED -> Value.REFUND_SUCCEEDED
            REFUND_FAILED -> Value.REFUND_FAILED
            DISPUTE_OPENED -> Value.DISPUTE_OPENED
            DISPUTE_EXPIRED -> Value.DISPUTE_EXPIRED
            DISPUTE_ACCEPTED -> Value.DISPUTE_ACCEPTED
            DISPUTE_CANCELLED -> Value.DISPUTE_CANCELLED
            DISPUTE_CHALLENGED -> Value.DISPUTE_CHALLENGED
            DISPUTE_WON -> Value.DISPUTE_WON
            DISPUTE_LOST -> Value.DISPUTE_LOST
            SUBSCRIPTION_ACTIVE -> Value.SUBSCRIPTION_ACTIVE
            SUBSCRIPTION_RENEWED -> Value.SUBSCRIPTION_RENEWED
            SUBSCRIPTION_ON_HOLD -> Value.SUBSCRIPTION_ON_HOLD
            SUBSCRIPTION_CANCELLED -> Value.SUBSCRIPTION_CANCELLED
            SUBSCRIPTION_FAILED -> Value.SUBSCRIPTION_FAILED
            SUBSCRIPTION_EXPIRED -> Value.SUBSCRIPTION_EXPIRED
            SUBSCRIPTION_PLAN_CHANGED -> Value.SUBSCRIPTION_PLAN_CHANGED
            LICENSE_KEY_CREATED -> Value.LICENSE_KEY_CREATED
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
            PAYMENT_SUCCEEDED -> Known.PAYMENT_SUCCEEDED
            PAYMENT_FAILED -> Known.PAYMENT_FAILED
            PAYMENT_PROCESSING -> Known.PAYMENT_PROCESSING
            PAYMENT_CANCELLED -> Known.PAYMENT_CANCELLED
            REFUND_SUCCEEDED -> Known.REFUND_SUCCEEDED
            REFUND_FAILED -> Known.REFUND_FAILED
            DISPUTE_OPENED -> Known.DISPUTE_OPENED
            DISPUTE_EXPIRED -> Known.DISPUTE_EXPIRED
            DISPUTE_ACCEPTED -> Known.DISPUTE_ACCEPTED
            DISPUTE_CANCELLED -> Known.DISPUTE_CANCELLED
            DISPUTE_CHALLENGED -> Known.DISPUTE_CHALLENGED
            DISPUTE_WON -> Known.DISPUTE_WON
            DISPUTE_LOST -> Known.DISPUTE_LOST
            SUBSCRIPTION_ACTIVE -> Known.SUBSCRIPTION_ACTIVE
            SUBSCRIPTION_RENEWED -> Known.SUBSCRIPTION_RENEWED
            SUBSCRIPTION_ON_HOLD -> Known.SUBSCRIPTION_ON_HOLD
            SUBSCRIPTION_CANCELLED -> Known.SUBSCRIPTION_CANCELLED
            SUBSCRIPTION_FAILED -> Known.SUBSCRIPTION_FAILED
            SUBSCRIPTION_EXPIRED -> Known.SUBSCRIPTION_EXPIRED
            SUBSCRIPTION_PLAN_CHANGED -> Known.SUBSCRIPTION_PLAN_CHANGED
            LICENSE_KEY_CREATED -> Known.LICENSE_KEY_CREATED
            else -> throw DodoPaymentsInvalidDataException("Unknown WebhookEventType: $value")
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

    fun validate(): WebhookEventType = apply {
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

        return /* spotless:off */ other is WebhookEventType && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
