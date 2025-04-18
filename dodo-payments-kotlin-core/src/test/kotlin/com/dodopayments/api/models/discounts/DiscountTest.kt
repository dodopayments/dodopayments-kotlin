// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountTest {

    @Test
    fun create() {
        val discount =
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

        assertThat(discount.amount()).isEqualTo(0L)
        assertThat(discount.businessId()).isEqualTo("business_id")
        assertThat(discount.code()).isEqualTo("code")
        assertThat(discount.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(discount.discountId()).isEqualTo("discount_id")
        assertThat(discount.restrictedTo()).containsExactly("string")
        assertThat(discount.timesUsed()).isEqualTo(0L)
        assertThat(discount.type()).isEqualTo(DiscountType.PERCENTAGE)
        assertThat(discount.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(discount.name()).isEqualTo("name")
        assertThat(discount.usageLimit()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
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

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }
}
