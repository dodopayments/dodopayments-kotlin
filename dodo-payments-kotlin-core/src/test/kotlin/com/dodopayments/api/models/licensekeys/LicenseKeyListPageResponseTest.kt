// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseKeyListPageResponseTest {

    @Test
    fun create() {
        val licenseKeyListPageResponse =
            LicenseKeyListPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(licenseKeyListPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseKeyListPageResponse =
            LicenseKeyListPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedLicenseKeyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseKeyListPageResponse),
                jacksonTypeRef<LicenseKeyListPageResponse>(),
            )

        assertThat(roundtrippedLicenseKeyListPageResponse).isEqualTo(licenseKeyListPageResponse)
    }
}
