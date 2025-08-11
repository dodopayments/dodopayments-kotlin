// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.discounts.DiscountCreateParams
import com.dodopayments.api.models.discounts.DiscountType
import com.dodopayments.api.models.discounts.DiscountUpdateParams
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
                    .type(DiscountType.PERCENTAGE)
                    .code("code")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .addRestrictedTo("string")
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

        val discount = discountServiceAsync.retrieve("discount_id")

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
                    .discountId("discount_id")
                    .amount(0)
                    .code("code")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .addRestrictedTo("string")
                    .subscriptionCycles(0)
                    .type(DiscountType.PERCENTAGE)
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

        discountServiceAsync.delete("discount_id")
    }
}
