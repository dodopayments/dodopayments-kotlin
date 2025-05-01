// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountDeleteParams
import com.dodopayments.api.models.discounts.DiscountRetrieveParams
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
                .apiKey("My API Key")
                .build()
        val discountService = client.discounts()

        val discount =
            discountService.create(
                DiscountCreateParams.builder()
                    .amount(0L)
                    .type(DiscountType.PERCENTAGE)
                    .code("code")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .addRestrictedTo("string")
                    .usageLimit(0L)
                    .build()
            )

        discount.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val discountService = client.discounts()

        val discount =
            discountService.retrieve(
                DiscountRetrieveParams.builder().discountId("discount_id").build()
            )

        discount.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val discountService = client.discounts()

        val discount =
            discountService.update(
                DiscountUpdateParams.builder()
                    .discountId("discount_id")
                    .amount(0L)
                    .code("code")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .addRestrictedTo("string")
                    .type(DiscountType.PERCENTAGE)
                    .usageLimit(0L)
                    .build()
            )

        discount.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
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
                .apiKey("My API Key")
                .build()
        val discountService = client.discounts()

        discountService.delete(DiscountDeleteParams.builder().discountId("discount_id").build())
    }
}
