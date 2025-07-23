// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandTest {

    @Test
    fun create() {
        val brand =
            Brand.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .enabled(true)
                .statementDescriptor("statement_descriptor")
                .verificationEnabled(true)
                .verificationStatus(Brand.VerificationStatus.SUCCESS)
                .description("description")
                .image("image")
                .name("name")
                .reasonForHold("reason_for_hold")
                .supportEmail("support_email")
                .url("url")
                .build()

        assertThat(brand.brandId()).isEqualTo("brand_id")
        assertThat(brand.businessId()).isEqualTo("business_id")
        assertThat(brand.enabled()).isEqualTo(true)
        assertThat(brand.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(brand.verificationEnabled()).isEqualTo(true)
        assertThat(brand.verificationStatus()).isEqualTo(Brand.VerificationStatus.SUCCESS)
        assertThat(brand.description()).isEqualTo("description")
        assertThat(brand.image()).isEqualTo("image")
        assertThat(brand.name()).isEqualTo("name")
        assertThat(brand.reasonForHold()).isEqualTo("reason_for_hold")
        assertThat(brand.supportEmail()).isEqualTo("support_email")
        assertThat(brand.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brand =
            Brand.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .enabled(true)
                .statementDescriptor("statement_descriptor")
                .verificationEnabled(true)
                .verificationStatus(Brand.VerificationStatus.SUCCESS)
                .description("description")
                .image("image")
                .name("name")
                .reasonForHold("reason_for_hold")
                .supportEmail("support_email")
                .url("url")
                .build()

        val roundtrippedBrand =
            jsonMapper.readValue(jsonMapper.writeValueAsString(brand), jacksonTypeRef<Brand>())

        assertThat(roundtrippedBrand).isEqualTo(brand)
    }
}
