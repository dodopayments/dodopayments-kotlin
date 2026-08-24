// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.entitlements.EntitlementIntegrationType
import com.dodopayments.api.models.entitlements.Feature
import com.dodopayments.api.models.entitlements.FeatureType
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.products.DigitalProductDelivery
import com.dodopayments.api.models.products.DigitalProductDeliveryFile
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementGrantTest {

    @Test
    fun create() {
        val entitlementGrant =
            EntitlementGrant.builder()
                .id("id")
                .brandId("brand_id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .entitlementId("entitlement_id")
                .integrationType(EntitlementIntegrationType.DISCORD)
                .metadata(
                    Metadata.builder()
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
                .feature(
                    Feature.builder()
                        .featureId("feature_id")
                        .featureType(FeatureType.BOOLEAN)
                        .build()
                )
                .licenseKey(
                    LicenseKeyGrant.builder()
                        .id("id")
                        .activationsUsed(0)
                        .key("key")
                        .status(LicenseKeyStatus.ACTIVE)
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

        assertThat(entitlementGrant.id()).isEqualTo("id")
        assertThat(entitlementGrant.brandId()).isEqualTo("brand_id")
        assertThat(entitlementGrant.businessId()).isEqualTo("business_id")
        assertThat(entitlementGrant.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementGrant.customerId()).isEqualTo("customer_id")
        assertThat(entitlementGrant.entitlementId()).isEqualTo("entitlement_id")
        assertThat(entitlementGrant.integrationType()).isEqualTo(EntitlementIntegrationType.DISCORD)
        assertThat(entitlementGrant.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(entitlementGrant.status()).isEqualTo(EntitlementGrant.Status.PENDING)
        assertThat(entitlementGrant.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementGrant.deliveredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementGrant.digitalProductDelivery())
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
        assertThat(entitlementGrant.errorCode()).isEqualTo("error_code")
        assertThat(entitlementGrant.errorMessage()).isEqualTo("error_message")
        assertThat(entitlementGrant.feature())
            .isEqualTo(
                Feature.builder().featureId("feature_id").featureType(FeatureType.BOOLEAN).build()
            )
        assertThat(entitlementGrant.licenseKey())
            .isEqualTo(
                LicenseKeyGrant.builder()
                    .id("id")
                    .activationsUsed(0)
                    .key("key")
                    .status(LicenseKeyStatus.ACTIVE)
                    .activationsLimit(0)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(entitlementGrant.oauthExpiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementGrant.oauthUrl()).isEqualTo("oauth_url")
        assertThat(entitlementGrant.paymentId()).isEqualTo("payment_id")
        assertThat(entitlementGrant.revocationReason()).isEqualTo("revocation_reason")
        assertThat(entitlementGrant.revokedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(entitlementGrant.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementGrant =
            EntitlementGrant.builder()
                .id("id")
                .brandId("brand_id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .entitlementId("entitlement_id")
                .integrationType(EntitlementIntegrationType.DISCORD)
                .metadata(
                    Metadata.builder()
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
                .feature(
                    Feature.builder()
                        .featureId("feature_id")
                        .featureType(FeatureType.BOOLEAN)
                        .build()
                )
                .licenseKey(
                    LicenseKeyGrant.builder()
                        .id("id")
                        .activationsUsed(0)
                        .key("key")
                        .status(LicenseKeyStatus.ACTIVE)
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

        val roundtrippedEntitlementGrant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementGrant),
                jacksonTypeRef<EntitlementGrant>(),
            )

        assertThat(roundtrippedEntitlementGrant).isEqualTo(entitlementGrant)
    }
}
