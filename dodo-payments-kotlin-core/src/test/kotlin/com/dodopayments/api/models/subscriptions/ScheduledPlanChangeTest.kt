// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledPlanChangeTest {

    @Test
    fun create() {
        val scheduledPlanChange =
            ScheduledPlanChange.builder()
                .id("id")
                .addAddon(
                    ScheduledPlanChange.Addon.builder()
                        .addonId("addon_id")
                        .name("name")
                        .quantity(0)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .productId("product_id")
                .quantity(0)
                .productDescription("product_description")
                .productName("product_name")
                .build()

        assertThat(scheduledPlanChange.id()).isEqualTo("id")
        assertThat(scheduledPlanChange.addons())
            .containsExactly(
                ScheduledPlanChange.Addon.builder()
                    .addonId("addon_id")
                    .name("name")
                    .quantity(0)
                    .build()
            )
        assertThat(scheduledPlanChange.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledPlanChange.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledPlanChange.productId()).isEqualTo("product_id")
        assertThat(scheduledPlanChange.quantity()).isEqualTo(0)
        assertThat(scheduledPlanChange.productDescription()).isEqualTo("product_description")
        assertThat(scheduledPlanChange.productName()).isEqualTo("product_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledPlanChange =
            ScheduledPlanChange.builder()
                .id("id")
                .addAddon(
                    ScheduledPlanChange.Addon.builder()
                        .addonId("addon_id")
                        .name("name")
                        .quantity(0)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .productId("product_id")
                .quantity(0)
                .productDescription("product_description")
                .productName("product_name")
                .build()

        val roundtrippedScheduledPlanChange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledPlanChange),
                jacksonTypeRef<ScheduledPlanChange>(),
            )

        assertThat(roundtrippedScheduledPlanChange).isEqualTo(scheduledPlanChange)
    }
}
