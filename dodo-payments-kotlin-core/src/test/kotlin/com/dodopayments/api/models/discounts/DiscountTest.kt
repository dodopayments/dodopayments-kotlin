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
                .amount(0)
                .businessId("business_id")
                .code("code")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountId("discount_id")
                .addRestrictedTo("string")
                .timesUsed(0)
                .type(DiscountType.PERCENTAGE)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .subscriptionCycles(0)
                .usageLimit(0)
                .build()

        assertThat(discount.amount()).isEqualTo(0)
        assertThat(discount.businessId()).isEqualTo("business_id")
        assertThat(discount.code()).isEqualTo("code")
        assertThat(discount.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(discount.discountId()).isEqualTo("discount_id")
        assertThat(discount.restrictedTo()).containsExactly("string")
        assertThat(discount.timesUsed()).isEqualTo(0)
        assertThat(discount.type()).isEqualTo(DiscountType.PERCENTAGE)
        assertThat(discount.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(discount.name()).isEqualTo("name")
        assertThat(discount.subscriptionCycles()).isEqualTo(0)
        assertThat(discount.usageLimit()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.builder()
                .amount(0)
                .businessId("business_id")
                .code("code")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountId("discount_id")
                .addRestrictedTo("string")
                .timesUsed(0)
                .type(DiscountType.PERCENTAGE)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .subscriptionCycles(0)
                .usageLimit(0)
                .build()

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }
}
