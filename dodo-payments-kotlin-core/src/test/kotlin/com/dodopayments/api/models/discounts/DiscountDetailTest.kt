// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Metadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountDetailTest {

    @Test
    fun create() {
        val discountDetail =
            DiscountDetail.builder()
                .amount(0)
                .businessId("business_id")
                .code("code")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountId("discount_id")
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .position(0)
                .preserveOnPlanChange(true)
                .addRestrictedTo("string")
                .timesUsed(0)
                .type(DiscountType.FLAT)
                .cyclesRemaining(0)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .subscriptionCycles(0)
                .usageLimit(0)
                .build()

        assertThat(discountDetail.amount()).isEqualTo(0)
        assertThat(discountDetail.businessId()).isEqualTo("business_id")
        assertThat(discountDetail.code()).isEqualTo("code")
        assertThat(discountDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(discountDetail.discountId()).isEqualTo("discount_id")
        assertThat(discountDetail.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(discountDetail.position()).isEqualTo(0)
        assertThat(discountDetail.preserveOnPlanChange()).isEqualTo(true)
        assertThat(discountDetail.restrictedTo()).containsExactly("string")
        assertThat(discountDetail.timesUsed()).isEqualTo(0)
        assertThat(discountDetail.type()).isEqualTo(DiscountType.FLAT)
        assertThat(discountDetail.cyclesRemaining()).isEqualTo(0)
        assertThat(discountDetail.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(discountDetail.name()).isEqualTo("name")
        assertThat(discountDetail.subscriptionCycles()).isEqualTo(0)
        assertThat(discountDetail.usageLimit()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val discountDetail =
            DiscountDetail.builder()
                .amount(0)
                .businessId("business_id")
                .code("code")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountId("discount_id")
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .position(0)
                .preserveOnPlanChange(true)
                .addRestrictedTo("string")
                .timesUsed(0)
                .type(DiscountType.FLAT)
                .cyclesRemaining(0)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .subscriptionCycles(0)
                .usageLimit(0)
                .build()

        val roundtrippedDiscountDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discountDetail),
                jacksonTypeRef<DiscountDetail>(),
            )

        assertThat(roundtrippedDiscountDetail).isEqualTo(discountDetail)
    }
}
