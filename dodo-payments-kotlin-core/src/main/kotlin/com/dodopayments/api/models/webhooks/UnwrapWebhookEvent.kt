// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects

@JsonDeserialize(using = UnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnwrapWebhookEvent.Serializer::class)
class UnwrapWebhookEvent
private constructor(
    private val disputeAccepted: DisputeAcceptedWebhookEvent? = null,
    private val disputeCancelled: DisputeCancelledWebhookEvent? = null,
    private val disputeChallenged: DisputeChallengedWebhookEvent? = null,
    private val disputeExpired: DisputeExpiredWebhookEvent? = null,
    private val disputeLost: DisputeLostWebhookEvent? = null,
    private val disputeOpened: DisputeOpenedWebhookEvent? = null,
    private val disputeWon: DisputeWonWebhookEvent? = null,
    private val licenseKeyCreated: LicenseKeyCreatedWebhookEvent? = null,
    private val paymentCancelled: PaymentCancelledWebhookEvent? = null,
    private val paymentFailed: PaymentFailedWebhookEvent? = null,
    private val paymentProcessing: PaymentProcessingWebhookEvent? = null,
    private val paymentSucceeded: PaymentSucceededWebhookEvent? = null,
    private val refundFailed: RefundFailedWebhookEvent? = null,
    private val refundSucceeded: RefundSucceededWebhookEvent? = null,
    private val subscriptionActive: SubscriptionActiveWebhookEvent? = null,
    private val subscriptionCancelled: SubscriptionCancelledWebhookEvent? = null,
    private val subscriptionExpired: SubscriptionExpiredWebhookEvent? = null,
    private val subscriptionFailed: SubscriptionFailedWebhookEvent? = null,
    private val subscriptionOnHold: SubscriptionOnHoldWebhookEvent? = null,
    private val subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent? = null,
    private val subscriptionRenewed: SubscriptionRenewedWebhookEvent? = null,
    private val subscriptionUpdated: SubscriptionUpdatedWebhookEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun disputeAccepted(): DisputeAcceptedWebhookEvent? = disputeAccepted

    fun disputeCancelled(): DisputeCancelledWebhookEvent? = disputeCancelled

    fun disputeChallenged(): DisputeChallengedWebhookEvent? = disputeChallenged

    fun disputeExpired(): DisputeExpiredWebhookEvent? = disputeExpired

    fun disputeLost(): DisputeLostWebhookEvent? = disputeLost

    fun disputeOpened(): DisputeOpenedWebhookEvent? = disputeOpened

    fun disputeWon(): DisputeWonWebhookEvent? = disputeWon

    fun licenseKeyCreated(): LicenseKeyCreatedWebhookEvent? = licenseKeyCreated

    fun paymentCancelled(): PaymentCancelledWebhookEvent? = paymentCancelled

    fun paymentFailed(): PaymentFailedWebhookEvent? = paymentFailed

    fun paymentProcessing(): PaymentProcessingWebhookEvent? = paymentProcessing

    fun paymentSucceeded(): PaymentSucceededWebhookEvent? = paymentSucceeded

    fun refundFailed(): RefundFailedWebhookEvent? = refundFailed

    fun refundSucceeded(): RefundSucceededWebhookEvent? = refundSucceeded

    fun subscriptionActive(): SubscriptionActiveWebhookEvent? = subscriptionActive

    fun subscriptionCancelled(): SubscriptionCancelledWebhookEvent? = subscriptionCancelled

    fun subscriptionExpired(): SubscriptionExpiredWebhookEvent? = subscriptionExpired

    fun subscriptionFailed(): SubscriptionFailedWebhookEvent? = subscriptionFailed

    fun subscriptionOnHold(): SubscriptionOnHoldWebhookEvent? = subscriptionOnHold

    fun subscriptionPlanChanged(): SubscriptionPlanChangedWebhookEvent? = subscriptionPlanChanged

    fun subscriptionRenewed(): SubscriptionRenewedWebhookEvent? = subscriptionRenewed

    fun subscriptionUpdated(): SubscriptionUpdatedWebhookEvent? = subscriptionUpdated

    fun isDisputeAccepted(): Boolean = disputeAccepted != null

    fun isDisputeCancelled(): Boolean = disputeCancelled != null

    fun isDisputeChallenged(): Boolean = disputeChallenged != null

    fun isDisputeExpired(): Boolean = disputeExpired != null

    fun isDisputeLost(): Boolean = disputeLost != null

    fun isDisputeOpened(): Boolean = disputeOpened != null

    fun isDisputeWon(): Boolean = disputeWon != null

    fun isLicenseKeyCreated(): Boolean = licenseKeyCreated != null

    fun isPaymentCancelled(): Boolean = paymentCancelled != null

    fun isPaymentFailed(): Boolean = paymentFailed != null

    fun isPaymentProcessing(): Boolean = paymentProcessing != null

    fun isPaymentSucceeded(): Boolean = paymentSucceeded != null

    fun isRefundFailed(): Boolean = refundFailed != null

    fun isRefundSucceeded(): Boolean = refundSucceeded != null

    fun isSubscriptionActive(): Boolean = subscriptionActive != null

    fun isSubscriptionCancelled(): Boolean = subscriptionCancelled != null

    fun isSubscriptionExpired(): Boolean = subscriptionExpired != null

    fun isSubscriptionFailed(): Boolean = subscriptionFailed != null

    fun isSubscriptionOnHold(): Boolean = subscriptionOnHold != null

    fun isSubscriptionPlanChanged(): Boolean = subscriptionPlanChanged != null

    fun isSubscriptionRenewed(): Boolean = subscriptionRenewed != null

    fun isSubscriptionUpdated(): Boolean = subscriptionUpdated != null

    fun asDisputeAccepted(): DisputeAcceptedWebhookEvent =
        disputeAccepted.getOrThrow("disputeAccepted")

    fun asDisputeCancelled(): DisputeCancelledWebhookEvent =
        disputeCancelled.getOrThrow("disputeCancelled")

    fun asDisputeChallenged(): DisputeChallengedWebhookEvent =
        disputeChallenged.getOrThrow("disputeChallenged")

    fun asDisputeExpired(): DisputeExpiredWebhookEvent = disputeExpired.getOrThrow("disputeExpired")

    fun asDisputeLost(): DisputeLostWebhookEvent = disputeLost.getOrThrow("disputeLost")

    fun asDisputeOpened(): DisputeOpenedWebhookEvent = disputeOpened.getOrThrow("disputeOpened")

    fun asDisputeWon(): DisputeWonWebhookEvent = disputeWon.getOrThrow("disputeWon")

    fun asLicenseKeyCreated(): LicenseKeyCreatedWebhookEvent =
        licenseKeyCreated.getOrThrow("licenseKeyCreated")

    fun asPaymentCancelled(): PaymentCancelledWebhookEvent =
        paymentCancelled.getOrThrow("paymentCancelled")

    fun asPaymentFailed(): PaymentFailedWebhookEvent = paymentFailed.getOrThrow("paymentFailed")

    fun asPaymentProcessing(): PaymentProcessingWebhookEvent =
        paymentProcessing.getOrThrow("paymentProcessing")

    fun asPaymentSucceeded(): PaymentSucceededWebhookEvent =
        paymentSucceeded.getOrThrow("paymentSucceeded")

    fun asRefundFailed(): RefundFailedWebhookEvent = refundFailed.getOrThrow("refundFailed")

    fun asRefundSucceeded(): RefundSucceededWebhookEvent =
        refundSucceeded.getOrThrow("refundSucceeded")

    fun asSubscriptionActive(): SubscriptionActiveWebhookEvent =
        subscriptionActive.getOrThrow("subscriptionActive")

    fun asSubscriptionCancelled(): SubscriptionCancelledWebhookEvent =
        subscriptionCancelled.getOrThrow("subscriptionCancelled")

    fun asSubscriptionExpired(): SubscriptionExpiredWebhookEvent =
        subscriptionExpired.getOrThrow("subscriptionExpired")

    fun asSubscriptionFailed(): SubscriptionFailedWebhookEvent =
        subscriptionFailed.getOrThrow("subscriptionFailed")

    fun asSubscriptionOnHold(): SubscriptionOnHoldWebhookEvent =
        subscriptionOnHold.getOrThrow("subscriptionOnHold")

    fun asSubscriptionPlanChanged(): SubscriptionPlanChangedWebhookEvent =
        subscriptionPlanChanged.getOrThrow("subscriptionPlanChanged")

    fun asSubscriptionRenewed(): SubscriptionRenewedWebhookEvent =
        subscriptionRenewed.getOrThrow("subscriptionRenewed")

    fun asSubscriptionUpdated(): SubscriptionUpdatedWebhookEvent =
        subscriptionUpdated.getOrThrow("subscriptionUpdated")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            disputeAccepted != null -> visitor.visitDisputeAccepted(disputeAccepted)
            disputeCancelled != null -> visitor.visitDisputeCancelled(disputeCancelled)
            disputeChallenged != null -> visitor.visitDisputeChallenged(disputeChallenged)
            disputeExpired != null -> visitor.visitDisputeExpired(disputeExpired)
            disputeLost != null -> visitor.visitDisputeLost(disputeLost)
            disputeOpened != null -> visitor.visitDisputeOpened(disputeOpened)
            disputeWon != null -> visitor.visitDisputeWon(disputeWon)
            licenseKeyCreated != null -> visitor.visitLicenseKeyCreated(licenseKeyCreated)
            paymentCancelled != null -> visitor.visitPaymentCancelled(paymentCancelled)
            paymentFailed != null -> visitor.visitPaymentFailed(paymentFailed)
            paymentProcessing != null -> visitor.visitPaymentProcessing(paymentProcessing)
            paymentSucceeded != null -> visitor.visitPaymentSucceeded(paymentSucceeded)
            refundFailed != null -> visitor.visitRefundFailed(refundFailed)
            refundSucceeded != null -> visitor.visitRefundSucceeded(refundSucceeded)
            subscriptionActive != null -> visitor.visitSubscriptionActive(subscriptionActive)
            subscriptionCancelled != null ->
                visitor.visitSubscriptionCancelled(subscriptionCancelled)
            subscriptionExpired != null -> visitor.visitSubscriptionExpired(subscriptionExpired)
            subscriptionFailed != null -> visitor.visitSubscriptionFailed(subscriptionFailed)
            subscriptionOnHold != null -> visitor.visitSubscriptionOnHold(subscriptionOnHold)
            subscriptionPlanChanged != null ->
                visitor.visitSubscriptionPlanChanged(subscriptionPlanChanged)
            subscriptionRenewed != null -> visitor.visitSubscriptionRenewed(subscriptionRenewed)
            subscriptionUpdated != null -> visitor.visitSubscriptionUpdated(subscriptionUpdated)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): UnwrapWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) {
                    disputeAccepted.validate()
                }

                override fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) {
                    disputeCancelled.validate()
                }

                override fun visitDisputeChallenged(
                    disputeChallenged: DisputeChallengedWebhookEvent
                ) {
                    disputeChallenged.validate()
                }

                override fun visitDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent) {
                    disputeExpired.validate()
                }

                override fun visitDisputeLost(disputeLost: DisputeLostWebhookEvent) {
                    disputeLost.validate()
                }

                override fun visitDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent) {
                    disputeOpened.validate()
                }

                override fun visitDisputeWon(disputeWon: DisputeWonWebhookEvent) {
                    disputeWon.validate()
                }

                override fun visitLicenseKeyCreated(
                    licenseKeyCreated: LicenseKeyCreatedWebhookEvent
                ) {
                    licenseKeyCreated.validate()
                }

                override fun visitPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) {
                    paymentCancelled.validate()
                }

                override fun visitPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) {
                    paymentFailed.validate()
                }

                override fun visitPaymentProcessing(
                    paymentProcessing: PaymentProcessingWebhookEvent
                ) {
                    paymentProcessing.validate()
                }

                override fun visitPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent) {
                    paymentSucceeded.validate()
                }

                override fun visitRefundFailed(refundFailed: RefundFailedWebhookEvent) {
                    refundFailed.validate()
                }

                override fun visitRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent) {
                    refundSucceeded.validate()
                }

                override fun visitSubscriptionActive(
                    subscriptionActive: SubscriptionActiveWebhookEvent
                ) {
                    subscriptionActive.validate()
                }

                override fun visitSubscriptionCancelled(
                    subscriptionCancelled: SubscriptionCancelledWebhookEvent
                ) {
                    subscriptionCancelled.validate()
                }

                override fun visitSubscriptionExpired(
                    subscriptionExpired: SubscriptionExpiredWebhookEvent
                ) {
                    subscriptionExpired.validate()
                }

                override fun visitSubscriptionFailed(
                    subscriptionFailed: SubscriptionFailedWebhookEvent
                ) {
                    subscriptionFailed.validate()
                }

                override fun visitSubscriptionOnHold(
                    subscriptionOnHold: SubscriptionOnHoldWebhookEvent
                ) {
                    subscriptionOnHold.validate()
                }

                override fun visitSubscriptionPlanChanged(
                    subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
                ) {
                    subscriptionPlanChanged.validate()
                }

                override fun visitSubscriptionRenewed(
                    subscriptionRenewed: SubscriptionRenewedWebhookEvent
                ) {
                    subscriptionRenewed.validate()
                }

                override fun visitSubscriptionUpdated(
                    subscriptionUpdated: SubscriptionUpdatedWebhookEvent
                ) {
                    subscriptionUpdated.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) =
                    disputeAccepted.validity()

                override fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) =
                    disputeCancelled.validity()

                override fun visitDisputeChallenged(
                    disputeChallenged: DisputeChallengedWebhookEvent
                ) = disputeChallenged.validity()

                override fun visitDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent) =
                    disputeExpired.validity()

                override fun visitDisputeLost(disputeLost: DisputeLostWebhookEvent) =
                    disputeLost.validity()

                override fun visitDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent) =
                    disputeOpened.validity()

                override fun visitDisputeWon(disputeWon: DisputeWonWebhookEvent) =
                    disputeWon.validity()

                override fun visitLicenseKeyCreated(
                    licenseKeyCreated: LicenseKeyCreatedWebhookEvent
                ) = licenseKeyCreated.validity()

                override fun visitPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) =
                    paymentCancelled.validity()

                override fun visitPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) =
                    paymentFailed.validity()

                override fun visitPaymentProcessing(
                    paymentProcessing: PaymentProcessingWebhookEvent
                ) = paymentProcessing.validity()

                override fun visitPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent) =
                    paymentSucceeded.validity()

                override fun visitRefundFailed(refundFailed: RefundFailedWebhookEvent) =
                    refundFailed.validity()

                override fun visitRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent) =
                    refundSucceeded.validity()

                override fun visitSubscriptionActive(
                    subscriptionActive: SubscriptionActiveWebhookEvent
                ) = subscriptionActive.validity()

                override fun visitSubscriptionCancelled(
                    subscriptionCancelled: SubscriptionCancelledWebhookEvent
                ) = subscriptionCancelled.validity()

                override fun visitSubscriptionExpired(
                    subscriptionExpired: SubscriptionExpiredWebhookEvent
                ) = subscriptionExpired.validity()

                override fun visitSubscriptionFailed(
                    subscriptionFailed: SubscriptionFailedWebhookEvent
                ) = subscriptionFailed.validity()

                override fun visitSubscriptionOnHold(
                    subscriptionOnHold: SubscriptionOnHoldWebhookEvent
                ) = subscriptionOnHold.validity()

                override fun visitSubscriptionPlanChanged(
                    subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
                ) = subscriptionPlanChanged.validity()

                override fun visitSubscriptionRenewed(
                    subscriptionRenewed: SubscriptionRenewedWebhookEvent
                ) = subscriptionRenewed.validity()

                override fun visitSubscriptionUpdated(
                    subscriptionUpdated: SubscriptionUpdatedWebhookEvent
                ) = subscriptionUpdated.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnwrapWebhookEvent &&
            disputeAccepted == other.disputeAccepted &&
            disputeCancelled == other.disputeCancelled &&
            disputeChallenged == other.disputeChallenged &&
            disputeExpired == other.disputeExpired &&
            disputeLost == other.disputeLost &&
            disputeOpened == other.disputeOpened &&
            disputeWon == other.disputeWon &&
            licenseKeyCreated == other.licenseKeyCreated &&
            paymentCancelled == other.paymentCancelled &&
            paymentFailed == other.paymentFailed &&
            paymentProcessing == other.paymentProcessing &&
            paymentSucceeded == other.paymentSucceeded &&
            refundFailed == other.refundFailed &&
            refundSucceeded == other.refundSucceeded &&
            subscriptionActive == other.subscriptionActive &&
            subscriptionCancelled == other.subscriptionCancelled &&
            subscriptionExpired == other.subscriptionExpired &&
            subscriptionFailed == other.subscriptionFailed &&
            subscriptionOnHold == other.subscriptionOnHold &&
            subscriptionPlanChanged == other.subscriptionPlanChanged &&
            subscriptionRenewed == other.subscriptionRenewed &&
            subscriptionUpdated == other.subscriptionUpdated
    }

    override fun hashCode(): Int =
        Objects.hash(
            disputeAccepted,
            disputeCancelled,
            disputeChallenged,
            disputeExpired,
            disputeLost,
            disputeOpened,
            disputeWon,
            licenseKeyCreated,
            paymentCancelled,
            paymentFailed,
            paymentProcessing,
            paymentSucceeded,
            refundFailed,
            refundSucceeded,
            subscriptionActive,
            subscriptionCancelled,
            subscriptionExpired,
            subscriptionFailed,
            subscriptionOnHold,
            subscriptionPlanChanged,
            subscriptionRenewed,
            subscriptionUpdated,
        )

    override fun toString(): String =
        when {
            disputeAccepted != null -> "UnwrapWebhookEvent{disputeAccepted=$disputeAccepted}"
            disputeCancelled != null -> "UnwrapWebhookEvent{disputeCancelled=$disputeCancelled}"
            disputeChallenged != null -> "UnwrapWebhookEvent{disputeChallenged=$disputeChallenged}"
            disputeExpired != null -> "UnwrapWebhookEvent{disputeExpired=$disputeExpired}"
            disputeLost != null -> "UnwrapWebhookEvent{disputeLost=$disputeLost}"
            disputeOpened != null -> "UnwrapWebhookEvent{disputeOpened=$disputeOpened}"
            disputeWon != null -> "UnwrapWebhookEvent{disputeWon=$disputeWon}"
            licenseKeyCreated != null -> "UnwrapWebhookEvent{licenseKeyCreated=$licenseKeyCreated}"
            paymentCancelled != null -> "UnwrapWebhookEvent{paymentCancelled=$paymentCancelled}"
            paymentFailed != null -> "UnwrapWebhookEvent{paymentFailed=$paymentFailed}"
            paymentProcessing != null -> "UnwrapWebhookEvent{paymentProcessing=$paymentProcessing}"
            paymentSucceeded != null -> "UnwrapWebhookEvent{paymentSucceeded=$paymentSucceeded}"
            refundFailed != null -> "UnwrapWebhookEvent{refundFailed=$refundFailed}"
            refundSucceeded != null -> "UnwrapWebhookEvent{refundSucceeded=$refundSucceeded}"
            subscriptionActive != null ->
                "UnwrapWebhookEvent{subscriptionActive=$subscriptionActive}"
            subscriptionCancelled != null ->
                "UnwrapWebhookEvent{subscriptionCancelled=$subscriptionCancelled}"
            subscriptionExpired != null ->
                "UnwrapWebhookEvent{subscriptionExpired=$subscriptionExpired}"
            subscriptionFailed != null ->
                "UnwrapWebhookEvent{subscriptionFailed=$subscriptionFailed}"
            subscriptionOnHold != null ->
                "UnwrapWebhookEvent{subscriptionOnHold=$subscriptionOnHold}"
            subscriptionPlanChanged != null ->
                "UnwrapWebhookEvent{subscriptionPlanChanged=$subscriptionPlanChanged}"
            subscriptionRenewed != null ->
                "UnwrapWebhookEvent{subscriptionRenewed=$subscriptionRenewed}"
            subscriptionUpdated != null ->
                "UnwrapWebhookEvent{subscriptionUpdated=$subscriptionUpdated}"
            _json != null -> "UnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
        }

    companion object {

        fun ofDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) =
            UnwrapWebhookEvent(disputeAccepted = disputeAccepted)

        fun ofDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) =
            UnwrapWebhookEvent(disputeCancelled = disputeCancelled)

        fun ofDisputeChallenged(disputeChallenged: DisputeChallengedWebhookEvent) =
            UnwrapWebhookEvent(disputeChallenged = disputeChallenged)

        fun ofDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent) =
            UnwrapWebhookEvent(disputeExpired = disputeExpired)

        fun ofDisputeLost(disputeLost: DisputeLostWebhookEvent) =
            UnwrapWebhookEvent(disputeLost = disputeLost)

        fun ofDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent) =
            UnwrapWebhookEvent(disputeOpened = disputeOpened)

        fun ofDisputeWon(disputeWon: DisputeWonWebhookEvent) =
            UnwrapWebhookEvent(disputeWon = disputeWon)

        fun ofLicenseKeyCreated(licenseKeyCreated: LicenseKeyCreatedWebhookEvent) =
            UnwrapWebhookEvent(licenseKeyCreated = licenseKeyCreated)

        fun ofPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) =
            UnwrapWebhookEvent(paymentCancelled = paymentCancelled)

        fun ofPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) =
            UnwrapWebhookEvent(paymentFailed = paymentFailed)

        fun ofPaymentProcessing(paymentProcessing: PaymentProcessingWebhookEvent) =
            UnwrapWebhookEvent(paymentProcessing = paymentProcessing)

        fun ofPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent) =
            UnwrapWebhookEvent(paymentSucceeded = paymentSucceeded)

        fun ofRefundFailed(refundFailed: RefundFailedWebhookEvent) =
            UnwrapWebhookEvent(refundFailed = refundFailed)

        fun ofRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent) =
            UnwrapWebhookEvent(refundSucceeded = refundSucceeded)

        fun ofSubscriptionActive(subscriptionActive: SubscriptionActiveWebhookEvent) =
            UnwrapWebhookEvent(subscriptionActive = subscriptionActive)

        fun ofSubscriptionCancelled(subscriptionCancelled: SubscriptionCancelledWebhookEvent) =
            UnwrapWebhookEvent(subscriptionCancelled = subscriptionCancelled)

        fun ofSubscriptionExpired(subscriptionExpired: SubscriptionExpiredWebhookEvent) =
            UnwrapWebhookEvent(subscriptionExpired = subscriptionExpired)

        fun ofSubscriptionFailed(subscriptionFailed: SubscriptionFailedWebhookEvent) =
            UnwrapWebhookEvent(subscriptionFailed = subscriptionFailed)

        fun ofSubscriptionOnHold(subscriptionOnHold: SubscriptionOnHoldWebhookEvent) =
            UnwrapWebhookEvent(subscriptionOnHold = subscriptionOnHold)

        fun ofSubscriptionPlanChanged(
            subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionPlanChanged = subscriptionPlanChanged)

        fun ofSubscriptionRenewed(subscriptionRenewed: SubscriptionRenewedWebhookEvent) =
            UnwrapWebhookEvent(subscriptionRenewed = subscriptionRenewed)

        fun ofSubscriptionUpdated(subscriptionUpdated: SubscriptionUpdatedWebhookEvent) =
            UnwrapWebhookEvent(subscriptionUpdated = subscriptionUpdated)
    }

    /**
     * An interface that defines how to map each variant of [UnwrapWebhookEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent): T

        fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent): T

        fun visitDisputeChallenged(disputeChallenged: DisputeChallengedWebhookEvent): T

        fun visitDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent): T

        fun visitDisputeLost(disputeLost: DisputeLostWebhookEvent): T

        fun visitDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent): T

        fun visitDisputeWon(disputeWon: DisputeWonWebhookEvent): T

        fun visitLicenseKeyCreated(licenseKeyCreated: LicenseKeyCreatedWebhookEvent): T

        fun visitPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent): T

        fun visitPaymentFailed(paymentFailed: PaymentFailedWebhookEvent): T

        fun visitPaymentProcessing(paymentProcessing: PaymentProcessingWebhookEvent): T

        fun visitPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent): T

        fun visitRefundFailed(refundFailed: RefundFailedWebhookEvent): T

        fun visitRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent): T

        fun visitSubscriptionActive(subscriptionActive: SubscriptionActiveWebhookEvent): T

        fun visitSubscriptionCancelled(subscriptionCancelled: SubscriptionCancelledWebhookEvent): T

        fun visitSubscriptionExpired(subscriptionExpired: SubscriptionExpiredWebhookEvent): T

        fun visitSubscriptionFailed(subscriptionFailed: SubscriptionFailedWebhookEvent): T

        fun visitSubscriptionOnHold(subscriptionOnHold: SubscriptionOnHoldWebhookEvent): T

        fun visitSubscriptionPlanChanged(
            subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
        ): T

        fun visitSubscriptionRenewed(subscriptionRenewed: SubscriptionRenewedWebhookEvent): T

        fun visitSubscriptionUpdated(subscriptionUpdated: SubscriptionUpdatedWebhookEvent): T

        /**
         * Maps an unknown variant of [UnwrapWebhookEvent] to a value of type [T].
         *
         * An instance of [UnwrapWebhookEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown UnwrapWebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnwrapWebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<DisputeAcceptedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(disputeAccepted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeCancelledWebhookEvent>())?.let {
                            UnwrapWebhookEvent(disputeCancelled = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeChallengedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(disputeChallenged = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeExpiredWebhookEvent>())?.let {
                            UnwrapWebhookEvent(disputeExpired = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeLostWebhookEvent>())?.let {
                            UnwrapWebhookEvent(disputeLost = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeOpenedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(disputeOpened = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeWonWebhookEvent>())?.let {
                            UnwrapWebhookEvent(disputeWon = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LicenseKeyCreatedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(licenseKeyCreated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentCancelledWebhookEvent>())?.let {
                            UnwrapWebhookEvent(paymentCancelled = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentFailedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(paymentFailed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentProcessingWebhookEvent>())?.let {
                            UnwrapWebhookEvent(paymentProcessing = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentSucceededWebhookEvent>())?.let {
                            UnwrapWebhookEvent(paymentSucceeded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RefundFailedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(refundFailed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RefundSucceededWebhookEvent>())?.let {
                            UnwrapWebhookEvent(refundSucceeded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionActiveWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionActive = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionCancelledWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionCancelled = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionExpiredWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionExpired = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionFailedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionFailed = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionOnHoldWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionOnHold = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionPlanChangedWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(subscriptionPlanChanged = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionRenewedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionRenewed = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionUpdatedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionUpdated = it, _json = json) },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UnwrapWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun serialize(
            value: UnwrapWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.disputeAccepted != null -> generator.writeObject(value.disputeAccepted)
                value.disputeCancelled != null -> generator.writeObject(value.disputeCancelled)
                value.disputeChallenged != null -> generator.writeObject(value.disputeChallenged)
                value.disputeExpired != null -> generator.writeObject(value.disputeExpired)
                value.disputeLost != null -> generator.writeObject(value.disputeLost)
                value.disputeOpened != null -> generator.writeObject(value.disputeOpened)
                value.disputeWon != null -> generator.writeObject(value.disputeWon)
                value.licenseKeyCreated != null -> generator.writeObject(value.licenseKeyCreated)
                value.paymentCancelled != null -> generator.writeObject(value.paymentCancelled)
                value.paymentFailed != null -> generator.writeObject(value.paymentFailed)
                value.paymentProcessing != null -> generator.writeObject(value.paymentProcessing)
                value.paymentSucceeded != null -> generator.writeObject(value.paymentSucceeded)
                value.refundFailed != null -> generator.writeObject(value.refundFailed)
                value.refundSucceeded != null -> generator.writeObject(value.refundSucceeded)
                value.subscriptionActive != null -> generator.writeObject(value.subscriptionActive)
                value.subscriptionCancelled != null ->
                    generator.writeObject(value.subscriptionCancelled)
                value.subscriptionExpired != null ->
                    generator.writeObject(value.subscriptionExpired)
                value.subscriptionFailed != null -> generator.writeObject(value.subscriptionFailed)
                value.subscriptionOnHold != null -> generator.writeObject(value.subscriptionOnHold)
                value.subscriptionPlanChanged != null ->
                    generator.writeObject(value.subscriptionPlanChanged)
                value.subscriptionRenewed != null ->
                    generator.writeObject(value.subscriptionRenewed)
                value.subscriptionUpdated != null ->
                    generator.writeObject(value.subscriptionUpdated)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
            }
        }
    }
}
