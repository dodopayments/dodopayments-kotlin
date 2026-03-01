// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.creditentitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
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
internal class BalanceServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceServiceAsync = client.creditEntitlements().balances()

        val customerCreditBalance =
            balanceServiceAsync.retrieve(
                BalanceRetrieveParams.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .customerId("customer_id")
                    .build()
            )

        customerCreditBalance.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceServiceAsync = client.creditEntitlements().balances()

        val page = balanceServiceAsync.list("credit_entitlement_id")

        page.response().validate()
    }

    @Test
    suspend fun createLedgerEntry() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceServiceAsync = client.creditEntitlements().balances()

        val response =
            balanceServiceAsync.createLedgerEntry(
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
    suspend fun listGrants() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceServiceAsync = client.creditEntitlements().balances()

        val page =
            balanceServiceAsync.listGrants(
                BalanceListGrantsParams.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .customerId("customer_id")
                    .build()
            )

        page.response().validate()
    }

    @Test
    suspend fun listLedger() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val balanceServiceAsync = client.creditEntitlements().balances()

        val page =
            balanceServiceAsync.listLedger(
                BalanceListLedgerParams.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .customerId("customer_id")
                    .build()
            )

        page.response().validate()
    }
}
