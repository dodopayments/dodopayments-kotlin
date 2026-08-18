// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.brands

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListResponseTest {

    @Test
    fun create() {
        val brandListResponse =
            BrandListResponse.builder()
                .addItem(
                    Brand.builder()
                        .brandId("brand_id")
                        .businessId("business_id")
                        .enabled(true)
                        .statementDescriptor("statement_descriptor")
                        .verificationEnabled(true)
                        .verificationStatus(Brand.VerificationStatus.SUCCESS)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                Brand.builder()
                    .brandId("brand_id")
                    .businessId("business_id")
                    .enabled(true)
                    .statementDescriptor("statement_descriptor")
                    .verificationEnabled(true)
                    .verificationStatus(Brand.VerificationStatus.SUCCESS)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    Brand.builder()
                        .brandId("brand_id")
                        .businessId("business_id")
                        .enabled(true)
                        .statementDescriptor("statement_descriptor")
                        .verificationEnabled(true)
                        .verificationStatus(Brand.VerificationStatus.SUCCESS)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
