// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandUpdateResponseTest {

    @Test
    fun create() {
        val brandUpdateResponse =
            BrandUpdateResponse.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .enabled(true)
                .statementDescriptor("statement_descriptor")
                .verificationEnabled(true)
                .verificationStatus(BrandUpdateResponse.VerificationStatus.SUCCESS)
                .description("description")
                .image("image")
                .name("name")
                .reasonForHold("reason_for_hold")
                .supportEmail("support_email")
                .url("url")
                .build()

        assertThat(brandUpdateResponse.brandId()).isEqualTo("brand_id")
        assertThat(brandUpdateResponse.businessId()).isEqualTo("business_id")
        assertThat(brandUpdateResponse.enabled()).isEqualTo(true)
        assertThat(brandUpdateResponse.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(brandUpdateResponse.verificationEnabled()).isEqualTo(true)
        assertThat(brandUpdateResponse.verificationStatus())
            .isEqualTo(BrandUpdateResponse.VerificationStatus.SUCCESS)
        assertThat(brandUpdateResponse.description()).isEqualTo("description")
        assertThat(brandUpdateResponse.image()).isEqualTo("image")
        assertThat(brandUpdateResponse.name()).isEqualTo("name")
        assertThat(brandUpdateResponse.reasonForHold()).isEqualTo("reason_for_hold")
        assertThat(brandUpdateResponse.supportEmail()).isEqualTo("support_email")
        assertThat(brandUpdateResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandUpdateResponse =
            BrandUpdateResponse.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .enabled(true)
                .statementDescriptor("statement_descriptor")
                .verificationEnabled(true)
                .verificationStatus(BrandUpdateResponse.VerificationStatus.SUCCESS)
                .description("description")
                .image("image")
                .name("name")
                .reasonForHold("reason_for_hold")
                .supportEmail("support_email")
                .url("url")
                .build()

        val roundtrippedBrandUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandUpdateResponse),
                jacksonTypeRef<BrandUpdateResponse>(),
            )

        assertThat(roundtrippedBrandUpdateResponse).isEqualTo(brandUpdateResponse)
    }
}
