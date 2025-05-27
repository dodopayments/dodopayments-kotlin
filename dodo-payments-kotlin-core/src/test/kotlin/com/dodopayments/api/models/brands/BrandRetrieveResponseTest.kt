// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveResponseTest {

    @Test
    fun create() {
        val brandRetrieveResponse =
            BrandRetrieveResponse.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .enabled(true)
                .statementDescriptor("statement_descriptor")
                .verificationEnabled(true)
                .verificationStatus(BrandRetrieveResponse.VerificationStatus.SUCCESS)
                .description("description")
                .image("image")
                .name("name")
                .reasonForHold("reason_for_hold")
                .supportEmail("support_email")
                .url("url")
                .build()

        assertThat(brandRetrieveResponse.brandId()).isEqualTo("brand_id")
        assertThat(brandRetrieveResponse.businessId()).isEqualTo("business_id")
        assertThat(brandRetrieveResponse.enabled()).isEqualTo(true)
        assertThat(brandRetrieveResponse.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(brandRetrieveResponse.verificationEnabled()).isEqualTo(true)
        assertThat(brandRetrieveResponse.verificationStatus())
            .isEqualTo(BrandRetrieveResponse.VerificationStatus.SUCCESS)
        assertThat(brandRetrieveResponse.description()).isEqualTo("description")
        assertThat(brandRetrieveResponse.image()).isEqualTo("image")
        assertThat(brandRetrieveResponse.name()).isEqualTo("name")
        assertThat(brandRetrieveResponse.reasonForHold()).isEqualTo("reason_for_hold")
        assertThat(brandRetrieveResponse.supportEmail()).isEqualTo("support_email")
        assertThat(brandRetrieveResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandRetrieveResponse =
            BrandRetrieveResponse.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .enabled(true)
                .statementDescriptor("statement_descriptor")
                .verificationEnabled(true)
                .verificationStatus(BrandRetrieveResponse.VerificationStatus.SUCCESS)
                .description("description")
                .image("image")
                .name("name")
                .reasonForHold("reason_for_hold")
                .supportEmail("support_email")
                .url("url")
                .build()

        val roundtrippedBrandRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandRetrieveResponse),
                jacksonTypeRef<BrandRetrieveResponse>(),
            )

        assertThat(roundtrippedBrandRetrieveResponse).isEqualTo(brandRetrieveResponse)
    }
}
