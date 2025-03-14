// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.discounts.DiscountCreateParams
import com.dodo_payments.api.models.discounts.DiscountDeleteParams
import com.dodo_payments.api.models.discounts.DiscountRetrieveParams
import com.dodo_payments.api.models.discounts.DiscountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DiscountServiceTest {

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
                    .amount(0L)
                    .type(DiscountCreateParams.Type.PERCENTAGE)
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
                .bearerToken("My Bearer Token")
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
                .bearerToken("My Bearer Token")
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
                    .type(DiscountUpdateParams.Type.PERCENTAGE)
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

        discountService.delete(DiscountDeleteParams.builder().discountId("discount_id").build())
    }
}
