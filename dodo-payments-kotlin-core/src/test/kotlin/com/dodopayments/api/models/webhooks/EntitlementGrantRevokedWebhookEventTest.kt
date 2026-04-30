// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.products.DigitalProductDelivery
import com.dodopayments.api.models.products.DigitalProductDeliveryFile
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementGrantRevokedWebhookEventTest {

    @Test
    fun create() {
        val entitlementGrantRevokedWebhookEvent =
            EntitlementGrantRevokedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    EntitlementGrantRevokedWebhookEvent.Data.builder()
                        .id("id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .entitlementId("entitlement_id")
                        .externalId("external_id")
                        .status(EntitlementGrantRevokedWebhookEvent.Data.Status.PENDING)
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
                            EntitlementGrantRevokedWebhookEvent.Data.LicenseKey.builder()
                                .activationsUsed(0)
                                .key("key")
                                .activationsLimit(0)
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .oauthUrl("oauth_url")
                        .paymentId("payment_id")
                        .revocationReason("revocation_reason")
                        .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subscriptionId("subscription_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(EntitlementGrantRevokedWebhookEvent.Type.ENTITLEMENT_GRANT_REVOKED)
                .build()

        assertThat(entitlementGrantRevokedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(entitlementGrantRevokedWebhookEvent.data())
            .isEqualTo(
                EntitlementGrantRevokedWebhookEvent.Data.builder()
                    .id("id")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .entitlementId("entitlement_id")
                    .externalId("external_id")
                    .status(EntitlementGrantRevokedWebhookEvent.Data.Status.PENDING)
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
                        EntitlementGrantRevokedWebhookEvent.Data.LicenseKey.builder()
                            .activationsUsed(0)
                            .key("key")
                            .activationsLimit(0)
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .oauthUrl("oauth_url")
                    .paymentId("payment_id")
                    .revocationReason("revocation_reason")
                    .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .subscriptionId("subscription_id")
                    .build()
            )
        assertThat(entitlementGrantRevokedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementGrantRevokedWebhookEvent.type())
            .isEqualTo(EntitlementGrantRevokedWebhookEvent.Type.ENTITLEMENT_GRANT_REVOKED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementGrantRevokedWebhookEvent =
            EntitlementGrantRevokedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    EntitlementGrantRevokedWebhookEvent.Data.builder()
                        .id("id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .entitlementId("entitlement_id")
                        .externalId("external_id")
                        .status(EntitlementGrantRevokedWebhookEvent.Data.Status.PENDING)
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
                            EntitlementGrantRevokedWebhookEvent.Data.LicenseKey.builder()
                                .activationsUsed(0)
                                .key("key")
                                .activationsLimit(0)
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .oauthUrl("oauth_url")
                        .paymentId("payment_id")
                        .revocationReason("revocation_reason")
                        .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subscriptionId("subscription_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(EntitlementGrantRevokedWebhookEvent.Type.ENTITLEMENT_GRANT_REVOKED)
                .build()

        val roundtrippedEntitlementGrantRevokedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementGrantRevokedWebhookEvent),
                jacksonTypeRef<EntitlementGrantRevokedWebhookEvent>(),
            )

        assertThat(roundtrippedEntitlementGrantRevokedWebhookEvent)
            .isEqualTo(entitlementGrantRevokedWebhookEvent)
    }
}
