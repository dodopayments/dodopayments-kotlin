// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListResponseTest {

    @Test
    fun create() {
        val brandListResponse =
            BrandListResponse.builder()
                .addItem(
                    BrandListResponse.Item.builder()
                        .brandId("brand_id")
                        .businessId("business_id")
                        .enabled(true)
                        .statementDescriptor("statement_descriptor")
                        .verificationEnabled(true)
                        .verificationStatus(BrandListResponse.Item.VerificationStatus.SUCCESS)
                        .description("description")
                        .image("image")
                        .name("name")
                        .reasonForHold("reason_for_hold")
                        .supportEmail("support_email")
                        .url("url")
                        .build()
                )
                .build()

        assertThat(brandListResponse.items())
            .containsExactly(
                BrandListResponse.Item.builder()
                    .brandId("brand_id")
                    .businessId("business_id")
                    .enabled(true)
                    .statementDescriptor("statement_descriptor")
                    .verificationEnabled(true)
                    .verificationStatus(BrandListResponse.Item.VerificationStatus.SUCCESS)
                    .description("description")
                    .image("image")
                    .name("name")
                    .reasonForHold("reason_for_hold")
                    .supportEmail("support_email")
                    .url("url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandListResponse =
            BrandListResponse.builder()
                .addItem(
                    BrandListResponse.Item.builder()
                        .brandId("brand_id")
                        .businessId("business_id")
                        .enabled(true)
                        .statementDescriptor("statement_descriptor")
                        .verificationEnabled(true)
                        .verificationStatus(BrandListResponse.Item.VerificationStatus.SUCCESS)
                        .description("description")
                        .image("image")
                        .name("name")
                        .reasonForHold("reason_for_hold")
                        .supportEmail("support_email")
                        .url("url")
                        .build()
                )
                .build()

        val roundtrippedBrandListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandListResponse),
                jacksonTypeRef<BrandListResponse>(),
            )

        assertThat(roundtrippedBrandListResponse).isEqualTo(brandListResponse)
    }
}
