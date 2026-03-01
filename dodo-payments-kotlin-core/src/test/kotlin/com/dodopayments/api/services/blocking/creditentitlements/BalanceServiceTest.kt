// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.creditentitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceRetrieveParams
import com.dodopayments.api.models.creditentitlements.balances.LedgerEntryType
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BalanceServiceTest {

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceService = client.creditEntitlements().balances()

        val customerCreditBalance =
            balanceService.retrieve(
                BalanceRetrieveParams.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .customerId("customer_id")
                    .build()
            )

        customerCreditBalance.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceService = client.creditEntitlements().balances()

        val page = balanceService.list("credit_entitlement_id")

        page.response().validate()
    }

    @Test
    fun createLedgerEntry() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceService = client.creditEntitlements().balances()

        val response =
            balanceService.createLedgerEntry(
                BalanceCreateLedgerEntryParams.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .customerId("customer_id")
                    .amount("amount")
                    .entryType(LedgerEntryType.CREDIT)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .idempotencyKey("idempotency_key")
                    .metadata(
                        BalanceCreateLedgerEntryParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .reason("reason")
                    .build()
            )

        response.validate()
    }

    @Test
    fun listGrants() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceService = client.creditEntitlements().balances()

        val page =
            balanceService.listGrants(
                BalanceListGrantsParams.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .customerId("customer_id")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun listLedger() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceService = client.creditEntitlements().balances()

        val page =
            balanceService.listLedger(
                BalanceListLedgerParams.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .customerId("customer_id")
                    .build()
            )

        page.response().validate()
    }
}
