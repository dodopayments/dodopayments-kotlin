// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licenses

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseActivateResponseTest {

    @Test
    fun create() {
        val licenseActivateResponse =
            LicenseActivateResponse.builder()
                .id("lki_123")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .phoneNumber("phone_number")
                        .build()
                )
                .licenseKeyId("lic_123")
                .name("Production Server 1")
                .product(
                    LicenseActivateResponse.Product.builder()
                        .productId("product_id")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(licenseActivateResponse.id()).isEqualTo("lki_123")
        assertThat(licenseActivateResponse.businessId()).isEqualTo("business_id")
        assertThat(licenseActivateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(licenseActivateResponse.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .phoneNumber("phone_number")
                    .build()
            )
        assertThat(licenseActivateResponse.licenseKeyId()).isEqualTo("lic_123")
        assertThat(licenseActivateResponse.name()).isEqualTo("Production Server 1")
        assertThat(licenseActivateResponse.product())
            .isEqualTo(
                LicenseActivateResponse.Product.builder()
                    .productId("product_id")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseActivateResponse =
            LicenseActivateResponse.builder()
                .id("lki_123")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .phoneNumber("phone_number")
                        .build()
                )
                .licenseKeyId("lic_123")
                .name("Production Server 1")
                .product(
                    LicenseActivateResponse.Product.builder()
                        .productId("product_id")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedLicenseActivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseActivateResponse),
                jacksonTypeRef<LicenseActivateResponse>(),
            )

        assertThat(roundtrippedLicenseActivateResponse).isEqualTo(licenseActivateResponse)
    }
}
