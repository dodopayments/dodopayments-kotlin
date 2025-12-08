// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.payments.IntentStatus
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundStatus
import com.dodopayments.api.models.subscriptions.AddonCartResponseItem
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnsafeUnwrapWebhookEventTest {

    @Test
    fun ofDisputeAccepted() {
        val disputeAccepted =
            DisputeAcceptedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeAcceptedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeAcceptedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeAcceptedWebhookEvent.Type.DISPUTE_ACCEPTED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeAccepted(disputeAccepted)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEqualTo(disputeAccepted)
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofDisputeAcceptedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofDisputeAccepted(
                DisputeAcceptedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeAcceptedWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeAcceptedWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeAcceptedWebhookEvent.Type.DISPUTE_ACCEPTED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeCancelled() {
        val disputeCancelled =
            DisputeCancelledWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeCancelledWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeCancelledWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeCancelledWebhookEvent.Type.DISPUTE_CANCELLED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeCancelled(disputeCancelled)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEqualTo(disputeCancelled)
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofDisputeCancelledRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofDisputeCancelled(
                DisputeCancelledWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeCancelledWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeCancelledWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeCancelledWebhookEvent.Type.DISPUTE_CANCELLED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeChallenged() {
        val disputeChallenged =
            DisputeChallengedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeChallengedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeChallengedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeChallengedWebhookEvent.Type.DISPUTE_CHALLENGED)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofDisputeChallenged(disputeChallenged)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEqualTo(disputeChallenged)
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofDisputeChallengedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofDisputeChallenged(
                DisputeChallengedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeChallengedWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeChallengedWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeChallengedWebhookEvent.Type.DISPUTE_CHALLENGED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeExpired() {
        val disputeExpired =
            DisputeExpiredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeExpiredWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeExpiredWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeExpiredWebhookEvent.Type.DISPUTE_EXPIRED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeExpired(disputeExpired)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEqualTo(disputeExpired)
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofDisputeExpiredRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofDisputeExpired(
                DisputeExpiredWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeExpiredWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeExpiredWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeExpiredWebhookEvent.Type.DISPUTE_EXPIRED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeLost() {
        val disputeLost =
            DisputeLostWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeLostWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeLostWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeLostWebhookEvent.Type.DISPUTE_LOST)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeLost(disputeLost)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEqualTo(disputeLost)
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofDisputeLostRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofDisputeLost(
                DisputeLostWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeLostWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeLostWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeLostWebhookEvent.Type.DISPUTE_LOST)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeOpened() {
        val disputeOpened =
            DisputeOpenedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeOpenedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeOpenedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeOpenedWebhookEvent.Type.DISPUTE_OPENED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeOpened(disputeOpened)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEqualTo(disputeOpened)
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofDisputeOpenedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofDisputeOpened(
                DisputeOpenedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeOpenedWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeOpenedWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeOpenedWebhookEvent.Type.DISPUTE_OPENED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeWon() {
        val disputeWon =
            DisputeWonWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeWonWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeWonWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeWonWebhookEvent.Type.DISPUTE_WON)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeWon(disputeWon)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEqualTo(disputeWon)
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofDisputeWonRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofDisputeWon(
                DisputeWonWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeWonWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeWonWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeWonWebhookEvent.Type.DISPUTE_WON)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofLicenseKeyCreated() {
        val licenseKeyCreated =
            LicenseKeyCreatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    LicenseKeyCreatedWebhookEvent.Data.builder()
                        .id("lic_123")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .customerId("cus_123")
                        .instancesCount(0)
                        .key("key")
                        .paymentId("payment_id")
                        .productId("product_id")
                        .status(LicenseKeyStatus.ACTIVE)
                        .activationsLimit(5)
                        .expiresAt(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                        .subscriptionId("subscription_id")
                        .payloadType(LicenseKeyCreatedWebhookEvent.Data.PayloadType.LICENSE_KEY)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(LicenseKeyCreatedWebhookEvent.Type.LICENSE_KEY_CREATED)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofLicenseKeyCreated(licenseKeyCreated)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEqualTo(licenseKeyCreated)
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofLicenseKeyCreatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofLicenseKeyCreated(
                LicenseKeyCreatedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        LicenseKeyCreatedWebhookEvent.Data.builder()
                            .id("lic_123")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                            .customerId("cus_123")
                            .instancesCount(0)
                            .key("key")
                            .paymentId("payment_id")
                            .productId("product_id")
                            .status(LicenseKeyStatus.ACTIVE)
                            .activationsLimit(5)
                            .expiresAt(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                            .subscriptionId("subscription_id")
                            .payloadType(LicenseKeyCreatedWebhookEvent.Data.PayloadType.LICENSE_KEY)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(LicenseKeyCreatedWebhookEvent.Type.LICENSE_KEY_CREATED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofPaymentCancelled() {
        val paymentCancelled =
            PaymentCancelledWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PaymentCancelledWebhookEvent.Data.builder()
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .digitalProductsDelivered(true)
                        .addDispute(
                            Dispute.builder()
                                .amount("amount")
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .disputeId("dispute_id")
                                .disputeStage(DisputeStage.PRE_DISPUTE)
                                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                .paymentId("payment_id")
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Payment.Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .checkoutSessionId("checkout_session_id")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(PaymentCancelledWebhookEvent.Data.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PaymentCancelledWebhookEvent.Type.PAYMENT_CANCELLED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentCancelled(paymentCancelled)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEqualTo(paymentCancelled)
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofPaymentCancelledRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofPaymentCancelled(
                PaymentCancelledWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        PaymentCancelledWebhookEvent.Data.builder()
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .brandId("brand_id")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .digitalProductsDelivered(true)
                            .addDispute(
                                Dispute.builder()
                                    .amount("amount")
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .currency("currency")
                                    .disputeId("dispute_id")
                                    .disputeStage(DisputeStage.PRE_DISPUTE)
                                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                    .paymentId("payment_id")
                                    .remarks("remarks")
                                    .build()
                            )
                            .metadata(
                                Payment.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .addRefund(
                                Payment.Refund.builder()
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPartial(true)
                                    .paymentId("payment_id")
                                    .refundId("refund_id")
                                    .status(RefundStatus.SUCCEEDED)
                                    .amount(0)
                                    .currency(Currency.AED)
                                    .reason("reason")
                                    .build()
                            )
                            .settlementAmount(0)
                            .settlementCurrency(Currency.AED)
                            .totalAmount(0)
                            .cardIssuingCountry(CountryCode.AF)
                            .cardLastFour("card_last_four")
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .checkoutSessionId("checkout_session_id")
                            .discountId("discount_id")
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .paymentLink("payment_link")
                            .paymentMethod("payment_method")
                            .paymentMethodType("payment_method_type")
                            .addProductCart(
                                Payment.ProductCart.builder()
                                    .productId("product_id")
                                    .quantity(0)
                                    .build()
                            )
                            .settlementTax(0)
                            .status(IntentStatus.SUCCEEDED)
                            .subscriptionId("subscription_id")
                            .tax(0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .payloadType(PaymentCancelledWebhookEvent.Data.PayloadType.PAYMENT)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PaymentCancelledWebhookEvent.Type.PAYMENT_CANCELLED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofPaymentFailed() {
        val paymentFailed =
            PaymentFailedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PaymentFailedWebhookEvent.Data.builder()
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .digitalProductsDelivered(true)
                        .addDispute(
                            Dispute.builder()
                                .amount("amount")
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .disputeId("dispute_id")
                                .disputeStage(DisputeStage.PRE_DISPUTE)
                                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                .paymentId("payment_id")
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Payment.Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .checkoutSessionId("checkout_session_id")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(PaymentFailedWebhookEvent.Data.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PaymentFailedWebhookEvent.Type.PAYMENT_FAILED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentFailed(paymentFailed)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEqualTo(paymentFailed)
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofPaymentFailedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofPaymentFailed(
                PaymentFailedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        PaymentFailedWebhookEvent.Data.builder()
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .brandId("brand_id")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .digitalProductsDelivered(true)
                            .addDispute(
                                Dispute.builder()
                                    .amount("amount")
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .currency("currency")
                                    .disputeId("dispute_id")
                                    .disputeStage(DisputeStage.PRE_DISPUTE)
                                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                    .paymentId("payment_id")
                                    .remarks("remarks")
                                    .build()
                            )
                            .metadata(
                                Payment.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .addRefund(
                                Payment.Refund.builder()
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPartial(true)
                                    .paymentId("payment_id")
                                    .refundId("refund_id")
                                    .status(RefundStatus.SUCCEEDED)
                                    .amount(0)
                                    .currency(Currency.AED)
                                    .reason("reason")
                                    .build()
                            )
                            .settlementAmount(0)
                            .settlementCurrency(Currency.AED)
                            .totalAmount(0)
                            .cardIssuingCountry(CountryCode.AF)
                            .cardLastFour("card_last_four")
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .checkoutSessionId("checkout_session_id")
                            .discountId("discount_id")
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .paymentLink("payment_link")
                            .paymentMethod("payment_method")
                            .paymentMethodType("payment_method_type")
                            .addProductCart(
                                Payment.ProductCart.builder()
                                    .productId("product_id")
                                    .quantity(0)
                                    .build()
                            )
                            .settlementTax(0)
                            .status(IntentStatus.SUCCEEDED)
                            .subscriptionId("subscription_id")
                            .tax(0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .payloadType(PaymentFailedWebhookEvent.Data.PayloadType.PAYMENT)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PaymentFailedWebhookEvent.Type.PAYMENT_FAILED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofPaymentProcessing() {
        val paymentProcessing =
            PaymentProcessingWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PaymentProcessingWebhookEvent.Data.builder()
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .digitalProductsDelivered(true)
                        .addDispute(
                            Dispute.builder()
                                .amount("amount")
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .disputeId("dispute_id")
                                .disputeStage(DisputeStage.PRE_DISPUTE)
                                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                .paymentId("payment_id")
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Payment.Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .checkoutSessionId("checkout_session_id")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(PaymentProcessingWebhookEvent.Data.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PaymentProcessingWebhookEvent.Type.PAYMENT_PROCESSING)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofPaymentProcessing(paymentProcessing)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEqualTo(paymentProcessing)
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofPaymentProcessingRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofPaymentProcessing(
                PaymentProcessingWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        PaymentProcessingWebhookEvent.Data.builder()
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .brandId("brand_id")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .digitalProductsDelivered(true)
                            .addDispute(
                                Dispute.builder()
                                    .amount("amount")
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .currency("currency")
                                    .disputeId("dispute_id")
                                    .disputeStage(DisputeStage.PRE_DISPUTE)
                                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                    .paymentId("payment_id")
                                    .remarks("remarks")
                                    .build()
                            )
                            .metadata(
                                Payment.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .addRefund(
                                Payment.Refund.builder()
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPartial(true)
                                    .paymentId("payment_id")
                                    .refundId("refund_id")
                                    .status(RefundStatus.SUCCEEDED)
                                    .amount(0)
                                    .currency(Currency.AED)
                                    .reason("reason")
                                    .build()
                            )
                            .settlementAmount(0)
                            .settlementCurrency(Currency.AED)
                            .totalAmount(0)
                            .cardIssuingCountry(CountryCode.AF)
                            .cardLastFour("card_last_four")
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .checkoutSessionId("checkout_session_id")
                            .discountId("discount_id")
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .paymentLink("payment_link")
                            .paymentMethod("payment_method")
                            .paymentMethodType("payment_method_type")
                            .addProductCart(
                                Payment.ProductCart.builder()
                                    .productId("product_id")
                                    .quantity(0)
                                    .build()
                            )
                            .settlementTax(0)
                            .status(IntentStatus.SUCCEEDED)
                            .subscriptionId("subscription_id")
                            .tax(0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .payloadType(PaymentProcessingWebhookEvent.Data.PayloadType.PAYMENT)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PaymentProcessingWebhookEvent.Type.PAYMENT_PROCESSING)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofPaymentSucceeded() {
        val paymentSucceeded =
            PaymentSucceededWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PaymentSucceededWebhookEvent.Data.builder()
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .digitalProductsDelivered(true)
                        .addDispute(
                            Dispute.builder()
                                .amount("amount")
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .disputeId("dispute_id")
                                .disputeStage(DisputeStage.PRE_DISPUTE)
                                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                .paymentId("payment_id")
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Payment.Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .checkoutSessionId("checkout_session_id")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(PaymentSucceededWebhookEvent.Data.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PaymentSucceededWebhookEvent.Type.PAYMENT_SUCCEEDED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentSucceeded(paymentSucceeded)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEqualTo(paymentSucceeded)
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofPaymentSucceededRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofPaymentSucceeded(
                PaymentSucceededWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        PaymentSucceededWebhookEvent.Data.builder()
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .brandId("brand_id")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .digitalProductsDelivered(true)
                            .addDispute(
                                Dispute.builder()
                                    .amount("amount")
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .currency("currency")
                                    .disputeId("dispute_id")
                                    .disputeStage(DisputeStage.PRE_DISPUTE)
                                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                    .paymentId("payment_id")
                                    .remarks("remarks")
                                    .build()
                            )
                            .metadata(
                                Payment.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .addRefund(
                                Payment.Refund.builder()
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPartial(true)
                                    .paymentId("payment_id")
                                    .refundId("refund_id")
                                    .status(RefundStatus.SUCCEEDED)
                                    .amount(0)
                                    .currency(Currency.AED)
                                    .reason("reason")
                                    .build()
                            )
                            .settlementAmount(0)
                            .settlementCurrency(Currency.AED)
                            .totalAmount(0)
                            .cardIssuingCountry(CountryCode.AF)
                            .cardLastFour("card_last_four")
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .checkoutSessionId("checkout_session_id")
                            .discountId("discount_id")
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .paymentLink("payment_link")
                            .paymentMethod("payment_method")
                            .paymentMethodType("payment_method_type")
                            .addProductCart(
                                Payment.ProductCart.builder()
                                    .productId("product_id")
                                    .quantity(0)
                                    .build()
                            )
                            .settlementTax(0)
                            .status(IntentStatus.SUCCEEDED)
                            .subscriptionId("subscription_id")
                            .tax(0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .payloadType(PaymentSucceededWebhookEvent.Data.PayloadType.PAYMENT)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PaymentSucceededWebhookEvent.Type.PAYMENT_SUCCEEDED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofRefundFailed() {
        val refundFailed =
            RefundFailedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    RefundFailedWebhookEvent.Data.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .isPartial(true)
                        .metadata(
                            Refund.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .refundId("refund_id")
                        .status(RefundStatus.SUCCEEDED)
                        .amount(0)
                        .currency(Currency.AED)
                        .reason("reason")
                        .payloadType(RefundFailedWebhookEvent.Data.PayloadType.REFUND)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RefundFailedWebhookEvent.Type.REFUND_FAILED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofRefundFailed(refundFailed)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEqualTo(refundFailed)
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofRefundFailedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofRefundFailed(
                RefundFailedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        RefundFailedWebhookEvent.Data.builder()
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .isPartial(true)
                            .metadata(
                                Refund.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .refundId("refund_id")
                            .status(RefundStatus.SUCCEEDED)
                            .amount(0)
                            .currency(Currency.AED)
                            .reason("reason")
                            .payloadType(RefundFailedWebhookEvent.Data.PayloadType.REFUND)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(RefundFailedWebhookEvent.Type.REFUND_FAILED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofRefundSucceeded() {
        val refundSucceeded =
            RefundSucceededWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    RefundSucceededWebhookEvent.Data.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .isPartial(true)
                        .metadata(
                            Refund.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .refundId("refund_id")
                        .status(RefundStatus.SUCCEEDED)
                        .amount(0)
                        .currency(Currency.AED)
                        .reason("reason")
                        .payloadType(RefundSucceededWebhookEvent.Data.PayloadType.REFUND)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RefundSucceededWebhookEvent.Type.REFUND_SUCCEEDED)
                .build()

        val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofRefundSucceeded(refundSucceeded)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEqualTo(refundSucceeded)
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofRefundSucceededRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofRefundSucceeded(
                RefundSucceededWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        RefundSucceededWebhookEvent.Data.builder()
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .isPartial(true)
                            .metadata(
                                Refund.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .refundId("refund_id")
                            .status(RefundStatus.SUCCEEDED)
                            .amount(0)
                            .currency(Currency.AED)
                            .reason("reason")
                            .payloadType(RefundSucceededWebhookEvent.Data.PayloadType.REFUND)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(RefundSucceededWebhookEvent.Type.REFUND_SUCCEEDED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionActive() {
        val subscriptionActive =
            SubscriptionActiveWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionActiveWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .cancelAtNextBillingDate(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .payloadType(SubscriptionActiveWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionActiveWebhookEvent.Type.SUBSCRIPTION_ACTIVE)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionActive(subscriptionActive)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEqualTo(subscriptionActive)
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofSubscriptionActiveRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionActive(
                SubscriptionActiveWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionActiveWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .cancelAtNextBillingDate(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .paymentMethodId("payment_method_id")
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionActiveWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionActiveWebhookEvent.Type.SUBSCRIPTION_ACTIVE)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionCancelled() {
        val subscriptionCancelled =
            SubscriptionCancelledWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionCancelledWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .cancelAtNextBillingDate(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .payloadType(
                            SubscriptionCancelledWebhookEvent.Data.PayloadType.SUBSCRIPTION
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionCancelledWebhookEvent.Type.SUBSCRIPTION_CANCELLED)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionCancelled(subscriptionCancelled)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled())
            .isEqualTo(subscriptionCancelled)
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofSubscriptionCancelledRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionCancelled(
                SubscriptionCancelledWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionCancelledWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .cancelAtNextBillingDate(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .paymentMethodId("payment_method_id")
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionCancelledWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionCancelledWebhookEvent.Type.SUBSCRIPTION_CANCELLED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionExpired() {
        val subscriptionExpired =
            SubscriptionExpiredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionExpiredWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .cancelAtNextBillingDate(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .payloadType(SubscriptionExpiredWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionExpiredWebhookEvent.Type.SUBSCRIPTION_EXPIRED)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionExpired(subscriptionExpired)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEqualTo(subscriptionExpired)
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofSubscriptionExpiredRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionExpired(
                SubscriptionExpiredWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionExpiredWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .cancelAtNextBillingDate(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .paymentMethodId("payment_method_id")
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionExpiredWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionExpiredWebhookEvent.Type.SUBSCRIPTION_EXPIRED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionFailed() {
        val subscriptionFailed =
            SubscriptionFailedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionFailedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .cancelAtNextBillingDate(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .payloadType(SubscriptionFailedWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionFailedWebhookEvent.Type.SUBSCRIPTION_FAILED)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionFailed(subscriptionFailed)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEqualTo(subscriptionFailed)
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofSubscriptionFailedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionFailed(
                SubscriptionFailedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionFailedWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .cancelAtNextBillingDate(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .paymentMethodId("payment_method_id")
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionFailedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionFailedWebhookEvent.Type.SUBSCRIPTION_FAILED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionOnHold() {
        val subscriptionOnHold =
            SubscriptionOnHoldWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionOnHoldWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .cancelAtNextBillingDate(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .payloadType(SubscriptionOnHoldWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionOnHoldWebhookEvent.Type.SUBSCRIPTION_ON_HOLD)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionOnHold(subscriptionOnHold)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEqualTo(subscriptionOnHold)
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofSubscriptionOnHoldRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionOnHold(
                SubscriptionOnHoldWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionOnHoldWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .cancelAtNextBillingDate(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .paymentMethodId("payment_method_id")
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionOnHoldWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionOnHoldWebhookEvent.Type.SUBSCRIPTION_ON_HOLD)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionPlanChanged() {
        val subscriptionPlanChanged =
            SubscriptionPlanChangedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionPlanChangedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .cancelAtNextBillingDate(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .payloadType(
                            SubscriptionPlanChangedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionPlanChangedWebhookEvent.Type.SUBSCRIPTION_PLAN_CHANGED)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionPlanChanged(subscriptionPlanChanged)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged())
            .isEqualTo(subscriptionPlanChanged)
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofSubscriptionPlanChangedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionPlanChanged(
                SubscriptionPlanChangedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionPlanChangedWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .cancelAtNextBillingDate(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .paymentMethodId("payment_method_id")
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionPlanChangedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionPlanChangedWebhookEvent.Type.SUBSCRIPTION_PLAN_CHANGED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionRenewed() {
        val subscriptionRenewed =
            SubscriptionRenewedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionRenewedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .cancelAtNextBillingDate(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .payloadType(SubscriptionRenewedWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionRenewedWebhookEvent.Type.SUBSCRIPTION_RENEWED)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionRenewed(subscriptionRenewed)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEqualTo(subscriptionRenewed)
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isNull()
    }

    @Test
    fun ofSubscriptionRenewedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionRenewed(
                SubscriptionRenewedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionRenewedWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .cancelAtNextBillingDate(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .paymentMethodId("payment_method_id")
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionRenewedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionRenewedWebhookEvent.Type.SUBSCRIPTION_RENEWED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionUpdated() {
        val subscriptionUpdated =
            SubscriptionUpdatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionUpdatedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
                        .billing(
                            BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .cancelAtNextBillingDate(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .payloadType(SubscriptionUpdatedWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionUpdatedWebhookEvent.Type.SUBSCRIPTION_UPDATED)
                .build()

        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionUpdated(subscriptionUpdated)

        assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isNull()
        assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEqualTo(subscriptionUpdated)
    }

    @Test
    fun ofSubscriptionUpdatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unsafeUnwrapWebhookEvent =
            UnsafeUnwrapWebhookEvent.ofSubscriptionUpdated(
                SubscriptionUpdatedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionUpdatedWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
                            .billing(
                                BillingAddress.builder()
                                    .country(CountryCode.AF)
                                    .city("city")
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .cancelAtNextBillingDate(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .metadata(
                                        CustomerLimitedDetails.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .paymentMethodId("payment_method_id")
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionUpdatedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionUpdatedWebhookEvent.Type.SUBSCRIPTION_UPDATED)
                    .build()
            )

        val roundtrippedUnsafeUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent),
                jacksonTypeRef<UnsafeUnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val unsafeUnwrapWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

        val e =
            assertThrows<DodoPaymentsInvalidDataException> { unsafeUnwrapWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
