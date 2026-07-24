// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
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
internal class DiscountServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val discount =
            discountServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val discount = discountServiceAsync.retrieve("dsc_qxxEmg5PuM1uNTE0LgkP9")

        discount.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val discount =
            discountServiceAsync.update(
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
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val page = discountServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        discountServiceAsync.delete("dsc_qxxEmg5PuM1uNTE0LgkP9")
    }

    @Test
    suspend fun retrieveByCode() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val discountServiceAsync = client.discounts()

        val discount = discountServiceAsync.retrieveByCode("code")

        discount.validate()
    }
}
