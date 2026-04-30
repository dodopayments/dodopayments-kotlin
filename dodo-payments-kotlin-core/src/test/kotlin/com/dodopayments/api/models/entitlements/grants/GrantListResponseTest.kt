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

internal class GrantListResponseTest {

    @Test
    fun create() {
        val grantListResponse =
            GrantListResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .entitlementId("entitlement_id")
                .externalId("external_id")
                .status(GrantListResponse.Status.PENDING)
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
                    GrantListResponse.LicenseKey.builder()
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

        assertThat(grantListResponse.id()).isEqualTo("id")
        assertThat(grantListResponse.businessId()).isEqualTo("business_id")
        assertThat(grantListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.customerId()).isEqualTo("customer_id")
        assertThat(grantListResponse.entitlementId()).isEqualTo("entitlement_id")
        assertThat(grantListResponse.externalId()).isEqualTo("external_id")
        assertThat(grantListResponse.status()).isEqualTo(GrantListResponse.Status.PENDING)
        assertThat(grantListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.deliveredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.digitalProductDelivery())
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
        assertThat(grantListResponse.errorCode()).isEqualTo("error_code")
        assertThat(grantListResponse.errorMessage()).isEqualTo("error_message")
        assertThat(grantListResponse.licenseKey())
            .isEqualTo(
                GrantListResponse.LicenseKey.builder()
                    .activationsUsed(0)
                    .key("key")
                    .activationsLimit(0)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(grantListResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(grantListResponse.oauthExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.oauthUrl()).isEqualTo("oauth_url")
        assertThat(grantListResponse.paymentId()).isEqualTo("payment_id")
        assertThat(grantListResponse.revocationReason()).isEqualTo("revocation_reason")
        assertThat(grantListResponse.revokedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(grantListResponse.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val grantListResponse =
            GrantListResponse.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .entitlementId("entitlement_id")
                .externalId("external_id")
                .status(GrantListResponse.Status.PENDING)
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
                    GrantListResponse.LicenseKey.builder()
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

        val roundtrippedGrantListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(grantListResponse),
                jacksonTypeRef<GrantListResponse>(),
            )

        assertThat(roundtrippedGrantListResponse).isEqualTo(grantListResponse)
    }
}
