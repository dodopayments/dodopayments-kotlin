// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandCreateResponseTest {

    @Test
    fun create() {
        val brandCreateResponse =
            BrandCreateResponse.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .enabled(true)
                .statementDescriptor("statement_descriptor")
                .verificationEnabled(true)
                .verificationStatus(BrandCreateResponse.VerificationStatus.SUCCESS)
                .description("description")
                .image("image")
                .name("name")
                .reasonForHold("reason_for_hold")
                .supportEmail("support_email")
                .url("url")
                .build()

        assertThat(brandCreateResponse.brandId()).isEqualTo("brand_id")
        assertThat(brandCreateResponse.businessId()).isEqualTo("business_id")
        assertThat(brandCreateResponse.enabled()).isEqualTo(true)
        assertThat(brandCreateResponse.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(brandCreateResponse.verificationEnabled()).isEqualTo(true)
        assertThat(brandCreateResponse.verificationStatus())
            .isEqualTo(BrandCreateResponse.VerificationStatus.SUCCESS)
        assertThat(brandCreateResponse.description()).isEqualTo("description")
        assertThat(brandCreateResponse.image()).isEqualTo("image")
        assertThat(brandCreateResponse.name()).isEqualTo("name")
        assertThat(brandCreateResponse.reasonForHold()).isEqualTo("reason_for_hold")
        assertThat(brandCreateResponse.supportEmail()).isEqualTo("support_email")
        assertThat(brandCreateResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandCreateResponse =
            BrandCreateResponse.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .enabled(true)
                .statementDescriptor("statement_descriptor")
                .verificationEnabled(true)
                .verificationStatus(BrandCreateResponse.VerificationStatus.SUCCESS)
                .description("description")
                .image("image")
                .name("name")
                .reasonForHold("reason_for_hold")
                .supportEmail("support_email")
                .url("url")
                .build()

        val roundtrippedBrandCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandCreateResponse),
                jacksonTypeRef<BrandCreateResponse>(),
            )

        assertThat(roundtrippedBrandCreateResponse).isEqualTo(brandCreateResponse)
    }
}
