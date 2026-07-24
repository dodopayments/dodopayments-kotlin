// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountUpdateParamsTest {

    @Test
    fun create() {
        DiscountUpdateParams.builder()
            .discountId("dsc_qxxEmg5PuM1uNTE0LgkP9")
            .amount(0)
            .code("code")
            .addCurrencyOption(
                DiscountUpdateParams.CurrencyOption.builder()
                    .currency(Currency.AED)
                    .isDefault(true)
                    .maxAmountPossible(0)
                    .minimumSubtotal(0)
                    .build()
            )
            .customerEligibility(DiscountUpdateParams.CustomerEligibility.ANY)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .metadata(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
            .name("name")
            .perCustomerUsageLimit(0)
            .preserveOnPlanChange(true)
            .addRestrictedTo("string")
            .startsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .subscriptionCycles(0)
            .type(DiscountType.FLAT)
            .usageLimit(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = DiscountUpdateParams.builder().discountId("dsc_qxxEmg5PuM1uNTE0LgkP9").build()

        assertThat(params._pathParam(0)).isEqualTo("dsc_qxxEmg5PuM1uNTE0LgkP9")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DiscountUpdateParams.builder()
                .discountId("dsc_qxxEmg5PuM1uNTE0LgkP9")
                .amount(0)
                .code("code")
                .addCurrencyOption(
                    DiscountUpdateParams.CurrencyOption.builder()
                        .currency(Currency.AED)
                        .isDefault(true)
                        .maxAmountPossible(0)
                        .minimumSubtotal(0)
                        .build()
                )
                .customerEligibility(DiscountUpdateParams.CustomerEligibility.ANY)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .perCustomerUsageLimit(0)
                .preserveOnPlanChange(true)
                .addRestrictedTo("string")
                .startsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subscriptionCycles(0)
                .type(DiscountType.FLAT)
                .usageLimit(0)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0)
        assertThat(body.code()).isEqualTo("code")
        assertThat(body.currencyOptions())
            .containsExactly(
                DiscountUpdateParams.CurrencyOption.builder()
                    .currency(Currency.AED)
                    .isDefault(true)
                    .maxAmountPossible(0)
                    .minimumSubtotal(0)
                    .build()
            )
        assertThat(body.customerEligibility())
            .isEqualTo(DiscountUpdateParams.CustomerEligibility.ANY)
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.perCustomerUsageLimit()).isEqualTo(0)
        assertThat(body.preserveOnPlanChange()).isEqualTo(true)
        assertThat(body.restrictedTo()).containsExactly("string")
        assertThat(body.startsAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.subscriptionCycles()).isEqualTo(0)
        assertThat(body.type()).isEqualTo(DiscountType.FLAT)
        assertThat(body.usageLimit()).isEqualTo(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DiscountUpdateParams.builder().discountId("dsc_qxxEmg5PuM1uNTE0LgkP9").build()

        val body = params._body()
    }
}
