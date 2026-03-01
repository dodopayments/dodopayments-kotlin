// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementTest {

    @Test
    fun create() {
        val creditEntitlement =
            CreditEntitlement.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .precision(0)
                .rolloverEnabled(true)
                .unit("unit")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .description("description")
                .expiresAfterDays(0)
                .maxRolloverCount(0)
                .overageLimit(0L)
                .pricePerUnit("price_per_unit")
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .build()

        assertThat(creditEntitlement.id()).isEqualTo("id")
        assertThat(creditEntitlement.businessId()).isEqualTo("business_id")
        assertThat(creditEntitlement.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditEntitlement.name()).isEqualTo("name")
        assertThat(creditEntitlement.overageBehavior())
            .isEqualTo(CbbOverageBehavior.FORGIVE_AT_RESET)
        assertThat(creditEntitlement.overageEnabled()).isEqualTo(true)
        assertThat(creditEntitlement.precision()).isEqualTo(0)
        assertThat(creditEntitlement.rolloverEnabled()).isEqualTo(true)
        assertThat(creditEntitlement.unit()).isEqualTo("unit")
        assertThat(creditEntitlement.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditEntitlement.currency()).isEqualTo(Currency.AED)
        assertThat(creditEntitlement.description()).isEqualTo("description")
        assertThat(creditEntitlement.expiresAfterDays()).isEqualTo(0)
        assertThat(creditEntitlement.maxRolloverCount()).isEqualTo(0)
        assertThat(creditEntitlement.overageLimit()).isEqualTo(0L)
        assertThat(creditEntitlement.pricePerUnit()).isEqualTo("price_per_unit")
        assertThat(creditEntitlement.rolloverPercentage()).isEqualTo(0)
        assertThat(creditEntitlement.rolloverTimeframeCount()).isEqualTo(0)
        assertThat(creditEntitlement.rolloverTimeframeInterval()).isEqualTo(TimeInterval.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditEntitlement =
            CreditEntitlement.builder()
                .id("id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .precision(0)
                .rolloverEnabled(true)
                .unit("unit")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .description("description")
                .expiresAfterDays(0)
                .maxRolloverCount(0)
                .overageLimit(0L)
                .pricePerUnit("price_per_unit")
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .build()

        val roundtrippedCreditEntitlement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditEntitlement),
                jacksonTypeRef<CreditEntitlement>(),
            )

        assertThat(roundtrippedCreditEntitlement).isEqualTo(creditEntitlement)
    }
}
