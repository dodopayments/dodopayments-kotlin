// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementListPageResponseTest {

    @Test
    fun create() {
        val creditEntitlementListPageResponse =
            CreditEntitlementListPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(creditEntitlementListPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditEntitlementListPageResponse =
            CreditEntitlementListPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedCreditEntitlementListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditEntitlementListPageResponse),
                jacksonTypeRef<CreditEntitlementListPageResponse>(),
            )

        assertThat(roundtrippedCreditEntitlementListPageResponse)
            .isEqualTo(creditEntitlementListPageResponse)
    }
}
