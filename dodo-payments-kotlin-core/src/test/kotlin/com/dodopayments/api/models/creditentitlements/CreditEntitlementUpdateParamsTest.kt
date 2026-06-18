// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementUpdateParamsTest {

    @Test
    fun create() {
        CreditEntitlementUpdateParams.builder()
            .id("cde_ztxm5XJsKxWucRWA3rjdM")
            .currency(Currency.AED)
            .description("description")
            .expiresAfterDays(0)
            .maxRolloverCount(0)
            .name("name")
            .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
            .overageEnabled(true)
            .overageLimit(0L)
            .pricePerUnit("price_per_unit")
            .rolloverEnabled(true)
            .rolloverPercentage(0)
            .rolloverTimeframeCount(0)
            .rolloverTimeframeInterval(TimeInterval.DAY)
            .unit("unit")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CreditEntitlementUpdateParams.builder().id("cde_ztxm5XJsKxWucRWA3rjdM").build()

        assertThat(params._pathParam(0)).isEqualTo("cde_ztxm5XJsKxWucRWA3rjdM")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CreditEntitlementUpdateParams.builder()
                .id("cde_ztxm5XJsKxWucRWA3rjdM")
                .currency(Currency.AED)
                .description("description")
                .expiresAfterDays(0)
                .maxRolloverCount(0)
                .name("name")
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .overageLimit(0L)
                .pricePerUnit("price_per_unit")
                .rolloverEnabled(true)
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .unit("unit")
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.expiresAfterDays()).isEqualTo(0)
        assertThat(body.maxRolloverCount()).isEqualTo(0)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.overageBehavior()).isEqualTo(CbbOverageBehavior.FORGIVE_AT_RESET)
        assertThat(body.overageEnabled()).isEqualTo(true)
        assertThat(body.overageLimit()).isEqualTo(0L)
        assertThat(body.pricePerUnit()).isEqualTo("price_per_unit")
        assertThat(body.rolloverEnabled()).isEqualTo(true)
        assertThat(body.rolloverPercentage()).isEqualTo(0)
        assertThat(body.rolloverTimeframeCount()).isEqualTo(0)
        assertThat(body.rolloverTimeframeInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(body.unit()).isEqualTo("unit")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CreditEntitlementUpdateParams.builder().id("cde_ztxm5XJsKxWucRWA3rjdM").build()

        val body = params._body()
    }
}
