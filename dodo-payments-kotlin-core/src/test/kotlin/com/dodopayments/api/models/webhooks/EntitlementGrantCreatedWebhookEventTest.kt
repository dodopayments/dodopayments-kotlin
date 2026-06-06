// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.models.entitlements.grants.LicenseKeyGrant
import com.dodopayments.api.models.products.DigitalProductDelivery
import com.dodopayments.api.models.products.DigitalProductDeliveryFile
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementGrantCreatedWebhookEventTest {

    @Test
    fun create() {
        val entitlementGrantCreatedWebhookEvent =
            EntitlementGrantCreatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    EntitlementGrant.builder()
                        .id("id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .entitlementId("entitlement_id")
                        .integrationType(EntitlementIntegrationType.DISCORD)
                        .metadata(
                            EntitlementGrant.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .status(EntitlementGrant.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .digitalProductDelivery(
                            DigitalProductDelivery.builder()
                                .addFile(
                                    DigitalProductDeliveryFile.builder()
                                        .downloadUrl("download_url")
                                        .expiresIn(0L)
                                        .fileId("file_id")
                                        .filename("filename")
                                        .contentType("content_type")
                                        .fileSize(0L)
                                        .build()
                                )
                                .externalUrl("external_url")
                                .instructions("instructions")
                                .build()
                        )
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .licenseKey(
                            LicenseKeyGrant.builder()
                                .activationsUsed(0)
                                .key("key")
                                .activationsLimit(0)
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .oauthUrl("oauth_url")
                        .paymentId("payment_id")
                        .revocationReason("revocation_reason")
                        .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subscriptionId("subscription_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(entitlementGrantCreatedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(entitlementGrantCreatedWebhookEvent.data())
            .isEqualTo(
                EntitlementGrant.builder()
                    .id("id")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .entitlementId("entitlement_id")
                    .integrationType(EntitlementIntegrationType.DISCORD)
                    .metadata(
                        EntitlementGrant.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .status(EntitlementGrant.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .digitalProductDelivery(
                        DigitalProductDelivery.builder()
                            .addFile(
                                DigitalProductDeliveryFile.builder()
                                    .downloadUrl("download_url")
                                    .expiresIn(0L)
                                    .fileId("file_id")
                                    .filename("filename")
                                    .contentType("content_type")
                                    .fileSize(0L)
                                    .build()
                            )
                            .externalUrl("external_url")
                            .instructions("instructions")
                            .build()
                    )
                    .errorCode("error_code")
                    .errorMessage("error_message")
                    .licenseKey(
                        LicenseKeyGrant.builder()
                            .activationsUsed(0)
                            .key("key")
                            .activationsLimit(0)
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .oauthUrl("oauth_url")
                    .paymentId("payment_id")
                    .revocationReason("revocation_reason")
                    .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .subscriptionId("subscription_id")
                    .build()
            )
        assertThat(entitlementGrantCreatedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementGrantCreatedWebhookEvent =
            EntitlementGrantCreatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    EntitlementGrant.builder()
                        .id("id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .entitlementId("entitlement_id")
                        .integrationType(EntitlementIntegrationType.DISCORD)
                        .metadata(
                            EntitlementGrant.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .status(EntitlementGrant.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .digitalProductDelivery(
                            DigitalProductDelivery.builder()
                                .addFile(
                                    DigitalProductDeliveryFile.builder()
                                        .downloadUrl("download_url")
                                        .expiresIn(0L)
                                        .fileId("file_id")
                                        .filename("filename")
                                        .contentType("content_type")
                                        .fileSize(0L)
                                        .build()
                                )
                                .externalUrl("external_url")
                                .instructions("instructions")
                                .build()
                        )
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .licenseKey(
                            LicenseKeyGrant.builder()
                                .activationsUsed(0)
                                .key("key")
                                .activationsLimit(0)
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .oauthUrl("oauth_url")
                        .paymentId("payment_id")
                        .revocationReason("revocation_reason")
                        .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subscriptionId("subscription_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEntitlementGrantCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementGrantCreatedWebhookEvent),
                jacksonTypeRef<EntitlementGrantCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedEntitlementGrantCreatedWebhookEvent)
            .isEqualTo(entitlementGrantCreatedWebhookEvent)
    }
}
