// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.creditentitlements.CreditEntitlementCreateParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUpdateParams
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditEntitlementServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val creditEntitlement =
            creditEntitlementServiceAsync.create(
                CreditEntitlementCreateParams.builder()
                    .name("name")
                    .overageEnabled(true)
                    .precision(0)
                    .rolloverEnabled(true)
                    .unit("unit")
                    .currency(Currency.AED)
                    .description("description")
                    .expiresAfterDays(0)
                    .maxRolloverCount(0)
                    .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                    .overageLimit(0L)
                    .pricePerUnit("price_per_unit")
                    .rolloverPercentage(0)
                    .rolloverTimeframeCount(0)
                    .rolloverTimeframeInterval(TimeInterval.DAY)
                    .build()
            )

        creditEntitlement.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val creditEntitlement = creditEntitlementServiceAsync.retrieve("id")

        creditEntitlement.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        creditEntitlementServiceAsync.update(
            CreditEntitlementUpdateParams.builder()
                .id("id")
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
        )
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        val page = creditEntitlementServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        creditEntitlementServiceAsync.delete("id")
    }

    @Test
    suspend fun undelete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementServiceAsync = client.creditEntitlements()

        creditEntitlementServiceAsync.undelete("id")
    }
}
