// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyTest {

    @Test
    fun create() {
        val licenseKey =
            LicenseKey.builder()
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
                .build()

        assertThat(licenseKey.id()).isEqualTo("lic_123")
        assertThat(licenseKey.businessId()).isEqualTo("business_id")
        assertThat(licenseKey.createdAt()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(licenseKey.customerId()).isEqualTo("cus_123")
        assertThat(licenseKey.instancesCount()).isEqualTo(0)
        assertThat(licenseKey.key()).isEqualTo("key")
        assertThat(licenseKey.paymentId()).isEqualTo("payment_id")
        assertThat(licenseKey.productId()).isEqualTo("product_id")
        assertThat(licenseKey.status()).isEqualTo(LicenseKeyStatus.ACTIVE)
        assertThat(licenseKey.activationsLimit()).isEqualTo(5)
        assertThat(licenseKey.expiresAt()).isEqualTo(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
        assertThat(licenseKey.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseKey =
            LicenseKey.builder()
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
                .build()

        val roundtrippedLicenseKey =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseKey),
                jacksonTypeRef<LicenseKey>(),
            )

        assertThat(roundtrippedLicenseKey).isEqualTo(licenseKey)
    }
}
