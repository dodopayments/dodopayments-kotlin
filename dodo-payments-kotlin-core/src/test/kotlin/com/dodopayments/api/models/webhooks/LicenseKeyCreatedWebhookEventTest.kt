// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyCreatedWebhookEventTest {

    @Test
    fun create() {
        val licenseKeyCreatedWebhookEvent =
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

        assertThat(licenseKeyCreatedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(licenseKeyCreatedWebhookEvent.data())
            .isEqualTo(
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
        assertThat(licenseKeyCreatedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseKeyCreatedWebhookEvent.type())
            .isEqualTo(LicenseKeyCreatedWebhookEvent.Type.LICENSE_KEY_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseKeyCreatedWebhookEvent =
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

        val roundtrippedLicenseKeyCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseKeyCreatedWebhookEvent),
                jacksonTypeRef<LicenseKeyCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedLicenseKeyCreatedWebhookEvent)
            .isEqualTo(licenseKeyCreatedWebhookEvent)
    }
}
