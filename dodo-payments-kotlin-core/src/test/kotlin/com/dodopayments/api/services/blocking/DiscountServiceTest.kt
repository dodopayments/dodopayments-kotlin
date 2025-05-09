// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountType
import com.dodopayments.api.models.discounts.DiscountUpdateParams
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
                    .type(DiscountType.PERCENTAGE)
                    .code("code")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .addRestrictedTo("string")
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

        val discount = discountService.retrieve("discount_id")

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
                    .discountId("discount_id")
                    .amount(0)
                    .code("code")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .addRestrictedTo("string")
                    .type(DiscountType.PERCENTAGE)
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

        discountService.delete("discount_id")
    }
}
