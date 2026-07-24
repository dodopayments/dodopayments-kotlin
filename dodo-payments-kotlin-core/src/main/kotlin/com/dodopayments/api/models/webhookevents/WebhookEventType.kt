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

        val SUBSCRIPTION_PAUSED = of("subscription.paused")

        val SUBSCRIPTION_CANCELLED = of("subscription.cancelled")

        val SUBSCRIPTION_FAILED = of("subscription.failed")

        val SUBSCRIPTION_EXPIRED = of("subscription.expired")

        val SUBSCRIPTION_PLAN_CHANGED = of("subscription.plan_changed")

        val SUBSCRIPTION_UPDATED = of("subscription.updated")

        val SUBSCRIPTION_UPDATE_PAYMENT_METHOD = of("subscription.update_payment_method")

        val LICENSE_KEY_CREATED = of("license_key.created")

        val PAYOUT_NOT_INITIATED = of("payout.not_initiated")

        val PAYOUT_ON_HOLD = of("payout.on_hold")

        val PAYOUT_IN_PROGRESS = of("payout.in_progress")

        val PAYOUT_FAILED = of("payout.failed")

        val PAYOUT_SUCCESS = of("payout.success")

        val CREDIT_ADDED = of("credit.added")

        val CREDIT_DEDUCTED = of("credit.deducted")

        val CREDIT_EXPIRED = of("credit.expired")

        val CREDIT_ROLLED_OVER = of("credit.rolled_over")

        val CREDIT_ROLLOVER_FORFEITED = of("credit.rollover_forfeited")

        val CREDIT_OVERAGE_CHARGED = of("credit.overage_charged")

        val CREDIT_OVERAGE_RESET = of("credit.overage_reset")

        val CREDIT_MANUAL_ADJUSTMENT = of("credit.manual_adjustment")

        val CREDIT_BALANCE_LOW = of("credit.balance_low")

        val ABANDONED_CHECKOUT_DETECTED = of("abandoned_checkout.detected")

        val ABANDONED_CHECKOUT_RECOVERED = of("abandoned_checkout.recovered")

        val DUNNING_STARTED = of("dunning.started")

        val DUNNING_RECOVERED = of("dunning.recovered")

        val ENTITLEMENT_GRANT_CREATED = of("entitlement_grant.created")

        val ENTITLEMENT_GRANT_DELIVERED = of("entitlement_grant.delivered")

        val ENTITLEMENT_GRANT_FAILED = of("entitlement_grant.failed")

        val ENTITLEMENT_GRANT_REVOKED = of("entitlement_grant.revoked")

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
        SUBSCRIPTION_PAUSED,
        SUBSCRIPTION_CANCELLED,
        SUBSCRIPTION_FAILED,
        SUBSCRIPTION_EXPIRED,
        SUBSCRIPTION_PLAN_CHANGED,
        SUBSCRIPTION_UPDATED,
        SUBSCRIPTION_UPDATE_PAYMENT_METHOD,
        LICENSE_KEY_CREATED,
        PAYOUT_NOT_INITIATED,
        PAYOUT_ON_HOLD,
        PAYOUT_IN_PROGRESS,
        PAYOUT_FAILED,
        PAYOUT_SUCCESS,
        CREDIT_ADDED,
        CREDIT_DEDUCTED,
        CREDIT_EXPIRED,
        CREDIT_ROLLED_OVER,
        CREDIT_ROLLOVER_FORFEITED,
        CREDIT_OVERAGE_CHARGED,
        CREDIT_OVERAGE_RESET,
        CREDIT_MANUAL_ADJUSTMENT,
        CREDIT_BALANCE_LOW,
        ABANDONED_CHECKOUT_DETECTED,
        ABANDONED_CHECKOUT_RECOVERED,
        DUNNING_STARTED,
        DUNNING_RECOVERED,
        ENTITLEMENT_GRANT_CREATED,
        ENTITLEMENT_GRANT_DELIVERED,
        ENTITLEMENT_GRANT_FAILED,
        ENTITLEMENT_GRANT_REVOKED,
    }

    /**
     * An enum containing [WebhookEventType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [WebhookEventType] can contain an unknown value in a couple of cases:
     *
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     *
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
        SUBSCRIPTION_PAUSED,
        SUBSCRIPTION_CANCELLED,
        SUBSCRIPTION_FAILED,
        SUBSCRIPTION_EXPIRED,
        SUBSCRIPTION_PLAN_CHANGED,
        SUBSCRIPTION_UPDATED,
        SUBSCRIPTION_UPDATE_PAYMENT_METHOD,
        LICENSE_KEY_CREATED,
        PAYOUT_NOT_INITIATED,
        PAYOUT_ON_HOLD,
        PAYOUT_IN_PROGRESS,
        PAYOUT_FAILED,
        PAYOUT_SUCCESS,
        CREDIT_ADDED,
        CREDIT_DEDUCTED,
        CREDIT_EXPIRED,
        CREDIT_ROLLED_OVER,
        CREDIT_ROLLOVER_FORFEITED,
        CREDIT_OVERAGE_CHARGED,
        CREDIT_OVERAGE_RESET,
        CREDIT_MANUAL_ADJUSTMENT,
        CREDIT_BALANCE_LOW,
        ABANDONED_CHECKOUT_DETECTED,
        ABANDONED_CHECKOUT_RECOVERED,
        DUNNING_STARTED,
        DUNNING_RECOVERED,
        ENTITLEMENT_GRANT_CREATED,
        ENTITLEMENT_GRANT_DELIVERED,
        ENTITLEMENT_GRANT_FAILED,
        ENTITLEMENT_GRANT_REVOKED,
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
            SUBSCRIPTION_PAUSED -> Value.SUBSCRIPTION_PAUSED
            SUBSCRIPTION_CANCELLED -> Value.SUBSCRIPTION_CANCELLED
            SUBSCRIPTION_FAILED -> Value.SUBSCRIPTION_FAILED
            SUBSCRIPTION_EXPIRED -> Value.SUBSCRIPTION_EXPIRED
            SUBSCRIPTION_PLAN_CHANGED -> Value.SUBSCRIPTION_PLAN_CHANGED
            SUBSCRIPTION_UPDATED -> Value.SUBSCRIPTION_UPDATED
            SUBSCRIPTION_UPDATE_PAYMENT_METHOD -> Value.SUBSCRIPTION_UPDATE_PAYMENT_METHOD
            LICENSE_KEY_CREATED -> Value.LICENSE_KEY_CREATED
            PAYOUT_NOT_INITIATED -> Value.PAYOUT_NOT_INITIATED
            PAYOUT_ON_HOLD -> Value.PAYOUT_ON_HOLD
            PAYOUT_IN_PROGRESS -> Value.PAYOUT_IN_PROGRESS
            PAYOUT_FAILED -> Value.PAYOUT_FAILED
            PAYOUT_SUCCESS -> Value.PAYOUT_SUCCESS
            CREDIT_ADDED -> Value.CREDIT_ADDED
            CREDIT_DEDUCTED -> Value.CREDIT_DEDUCTED
            CREDIT_EXPIRED -> Value.CREDIT_EXPIRED
            CREDIT_ROLLED_OVER -> Value.CREDIT_ROLLED_OVER
            CREDIT_ROLLOVER_FORFEITED -> Value.CREDIT_ROLLOVER_FORFEITED
            CREDIT_OVERAGE_CHARGED -> Value.CREDIT_OVERAGE_CHARGED
            CREDIT_OVERAGE_RESET -> Value.CREDIT_OVERAGE_RESET
            CREDIT_MANUAL_ADJUSTMENT -> Value.CREDIT_MANUAL_ADJUSTMENT
            CREDIT_BALANCE_LOW -> Value.CREDIT_BALANCE_LOW
            ABANDONED_CHECKOUT_DETECTED -> Value.ABANDONED_CHECKOUT_DETECTED
            ABANDONED_CHECKOUT_RECOVERED -> Value.ABANDONED_CHECKOUT_RECOVERED
            DUNNING_STARTED -> Value.DUNNING_STARTED
            DUNNING_RECOVERED -> Value.DUNNING_RECOVERED
            ENTITLEMENT_GRANT_CREATED -> Value.ENTITLEMENT_GRANT_CREATED
            ENTITLEMENT_GRANT_DELIVERED -> Value.ENTITLEMENT_GRANT_DELIVERED
            ENTITLEMENT_GRANT_FAILED -> Value.ENTITLEMENT_GRANT_FAILED
            ENTITLEMENT_GRANT_REVOKED -> Value.ENTITLEMENT_GRANT_REVOKED
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
            SUBSCRIPTION_PAUSED -> Known.SUBSCRIPTION_PAUSED
            SUBSCRIPTION_CANCELLED -> Known.SUBSCRIPTION_CANCELLED
            SUBSCRIPTION_FAILED -> Known.SUBSCRIPTION_FAILED
            SUBSCRIPTION_EXPIRED -> Known.SUBSCRIPTION_EXPIRED
            SUBSCRIPTION_PLAN_CHANGED -> Known.SUBSCRIPTION_PLAN_CHANGED
            SUBSCRIPTION_UPDATED -> Known.SUBSCRIPTION_UPDATED
            SUBSCRIPTION_UPDATE_PAYMENT_METHOD -> Known.SUBSCRIPTION_UPDATE_PAYMENT_METHOD
            LICENSE_KEY_CREATED -> Known.LICENSE_KEY_CREATED
            PAYOUT_NOT_INITIATED -> Known.PAYOUT_NOT_INITIATED
            PAYOUT_ON_HOLD -> Known.PAYOUT_ON_HOLD
            PAYOUT_IN_PROGRESS -> Known.PAYOUT_IN_PROGRESS
            PAYOUT_FAILED -> Known.PAYOUT_FAILED
            PAYOUT_SUCCESS -> Known.PAYOUT_SUCCESS
            CREDIT_ADDED -> Known.CREDIT_ADDED
            CREDIT_DEDUCTED -> Known.CREDIT_DEDUCTED
            CREDIT_EXPIRED -> Known.CREDIT_EXPIRED
            CREDIT_ROLLED_OVER -> Known.CREDIT_ROLLED_OVER
            CREDIT_ROLLOVER_FORFEITED -> Known.CREDIT_ROLLOVER_FORFEITED
            CREDIT_OVERAGE_CHARGED -> Known.CREDIT_OVERAGE_CHARGED
            CREDIT_OVERAGE_RESET -> Known.CREDIT_OVERAGE_RESET
            CREDIT_MANUAL_ADJUSTMENT -> Known.CREDIT_MANUAL_ADJUSTMENT
            CREDIT_BALANCE_LOW -> Known.CREDIT_BALANCE_LOW
            ABANDONED_CHECKOUT_DETECTED -> Known.ABANDONED_CHECKOUT_DETECTED
            ABANDONED_CHECKOUT_RECOVERED -> Known.ABANDONED_CHECKOUT_RECOVERED
            DUNNING_STARTED -> Known.DUNNING_STARTED
            DUNNING_RECOVERED -> Known.DUNNING_RECOVERED
            ENTITLEMENT_GRANT_CREATED -> Known.ENTITLEMENT_GRANT_CREATED
            ENTITLEMENT_GRANT_DELIVERED -> Known.ENTITLEMENT_GRANT_DELIVERED
            ENTITLEMENT_GRANT_FAILED -> Known.ENTITLEMENT_GRANT_FAILED
            ENTITLEMENT_GRANT_REVOKED -> Known.ENTITLEMENT_GRANT_REVOKED
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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

        return other is WebhookEventType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
