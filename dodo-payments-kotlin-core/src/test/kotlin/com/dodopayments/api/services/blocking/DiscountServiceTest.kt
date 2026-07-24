// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountType
import com.dodopayments.api.models.discounts.DiscountUpdateParams
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DiscountServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountService = client.discounts()

        val discount =
            discountService.create(
                DiscountCreateParams.builder()
                    .amount(0)
                    .type(DiscountType.FLAT)
                    .code("code")
                    .addCurrencyOption(
                        DiscountCreateParams.CurrencyOption.builder()
                            .currency(Currency.AED)
                            .isDefault(true)
                            .maxAmountPossible(0)
                            .minimumSubtotal(0)
                            .build()
                    )
                    .customerEligibility(DiscountCreateParams.CustomerEligibility.ANY)
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
                    .usageLimit(0)
                    .build()
            )

        discount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountService = client.discounts()

        val discount = discountService.retrieve("dsc_qxxEmg5PuM1uNTE0LgkP9")

        discount.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountService = client.discounts()

        val discount =
            discountService.update(
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
            )

        discount.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountService = client.discounts()

        val page = discountService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountService = client.discounts()

        discountService.delete("dsc_qxxEmg5PuM1uNTE0LgkP9")
    }

    @Test
    fun retrieveByCode() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountService = client.discounts()

        val discount = discountService.retrieveByCode("code")

        discount.validate()
    }
}
