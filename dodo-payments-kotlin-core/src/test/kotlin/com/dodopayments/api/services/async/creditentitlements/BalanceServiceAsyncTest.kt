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
import com.dodopayments.api.models.misc.Metadata
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
                    .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
                    .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
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

        val page = balanceServiceAsync.list("cde_ztxm5XJsKxWucRWA3rjdM")

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
                    .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
                    .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                    .amount("amount")
                    .entryType(LedgerEntryType.CREDIT)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .idempotencyKey("idempotency_key")
                    .metadata(
                        Metadata.builder()
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
                    .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
                    .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
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
                    .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
                    .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                    .build()
            )

        page.response().validate()
    }
}
