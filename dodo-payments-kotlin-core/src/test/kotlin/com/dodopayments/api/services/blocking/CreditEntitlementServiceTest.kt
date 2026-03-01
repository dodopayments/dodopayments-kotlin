// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.creditentitlements.CreditEntitlementCreateParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUpdateParams
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditEntitlementServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementService = client.creditEntitlements()

        val creditEntitlement =
            creditEntitlementService.create(
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
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementService = client.creditEntitlements()

        val creditEntitlement = creditEntitlementService.retrieve("id")

        creditEntitlement.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementService = client.creditEntitlements()

        creditEntitlementService.update(
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
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementService = client.creditEntitlements()

        val page = creditEntitlementService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementService = client.creditEntitlements()

        creditEntitlementService.delete("id")
    }

    @Test
    fun undelete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val creditEntitlementService = client.creditEntitlements()

        creditEntitlementService.undelete("id")
    }
}
