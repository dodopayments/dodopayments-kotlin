// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountListPageResponseTest {

    @Test
    fun create() {
        val discountListPageResponse =
            DiscountListPageResponse.builder()
                .addItem(
                    Discount.builder()
                        .amount(0L)
                        .businessId("business_id")
                        .code("code")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountId("discount_id")
                        .addRestrictedTo("string")
                        .timesUsed(0L)
                        .type(DiscountType.PERCENTAGE)
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .usageLimit(0L)
                        .build()
                )
                .build()

        assertThat(discountListPageResponse.items())
            .containsExactly(
                Discount.builder()
                    .amount(0L)
                    .businessId("business_id")
                    .code("code")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discountId("discount_id")
                    .addRestrictedTo("string")
                    .timesUsed(0L)
                    .type(DiscountType.PERCENTAGE)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .usageLimit(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val discountListPageResponse =
            DiscountListPageResponse.builder()
                .addItem(
                    Discount.builder()
                        .amount(0L)
                        .businessId("business_id")
                        .code("code")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountId("discount_id")
                        .addRestrictedTo("string")
                        .timesUsed(0L)
                        .type(DiscountType.PERCENTAGE)
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .usageLimit(0L)
                        .build()
                )
                .build()

        val roundtrippedDiscountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discountListPageResponse),
                jacksonTypeRef<DiscountListPageResponse>(),
            )

        assertThat(roundtrippedDiscountListPageResponse).isEqualTo(discountListPageResponse)
    }
}
