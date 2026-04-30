// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.products.DigitalProductDelivery
import com.dodopayments.api.models.products.DigitalProductDeliveryFile
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrantRevokeResponseTest {

    @Test
    fun create() {
        val grantRevokeResponse =
            GrantRevokeResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .entitlementId("entitlement_id")
                .externalId("external_id")
                .status(GrantRevokeResponse.Status.PENDING)
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
                    GrantRevokeResponse.LicenseKey.builder()
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

        assertThat(grantRevokeResponse.id()).isEqualTo("id")
        assertThat(grantRevokeResponse.businessId()).isEqualTo("business_id")
        assertThat(grantRevokeResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantRevokeResponse.customerId()).isEqualTo("customer_id")
        assertThat(grantRevokeResponse.entitlementId()).isEqualTo("entitlement_id")
        assertThat(grantRevokeResponse.externalId()).isEqualTo("external_id")
        assertThat(grantRevokeResponse.status()).isEqualTo(GrantRevokeResponse.Status.PENDING)
        assertThat(grantRevokeResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantRevokeResponse.deliveredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantRevokeResponse.digitalProductDelivery())
            .isEqualTo(
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
        assertThat(grantRevokeResponse.errorCode()).isEqualTo("error_code")
        assertThat(grantRevokeResponse.errorMessage()).isEqualTo("error_message")
        assertThat(grantRevokeResponse.licenseKey())
            .isEqualTo(
                GrantRevokeResponse.LicenseKey.builder()
                    .activationsUsed(0)
                    .key("key")
                    .activationsLimit(0)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(grantRevokeResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(grantRevokeResponse.oauthExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantRevokeResponse.oauthUrl()).isEqualTo("oauth_url")
        assertThat(grantRevokeResponse.paymentId()).isEqualTo("payment_id")
        assertThat(grantRevokeResponse.revocationReason()).isEqualTo("revocation_reason")
        assertThat(grantRevokeResponse.revokedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantRevokeResponse.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val grantRevokeResponse =
            GrantRevokeResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .entitlementId("entitlement_id")
                .externalId("external_id")
                .status(GrantRevokeResponse.Status.PENDING)
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
                    GrantRevokeResponse.LicenseKey.builder()
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

        val roundtrippedGrantRevokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(grantRevokeResponse),
                jacksonTypeRef<GrantRevokeResponse>(),
            )

        assertThat(roundtrippedGrantRevokeResponse).isEqualTo(grantRevokeResponse)
    }
}
