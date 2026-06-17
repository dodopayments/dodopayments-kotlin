// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListLedgerParamsTest {

    @Test
    fun create() {
        BalanceListLedgerParams.builder()
            .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
            .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .pageNumber(0)
            .pageSize(0)
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .transactionType("transaction_type")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceListLedgerParams.builder()
                .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("cde_ztxm5XJsKxWucRWA3rjdM")
        assertThat(params._pathParam(1)).isEqualTo("cus_TV52uJWWXt2yIoBBxpjaa")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BalanceListLedgerParams.builder()
                .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageNumber(0)
                .pageSize(0)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionType("transaction_type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_date", "2019-12-27T18:11:19.117Z")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("start_date", "2019-12-27T18:11:19.117Z")
                    .put("transaction_type", "transaction_type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceListLedgerParams.builder()
                .creditEntitlementId("cde_ztxm5XJsKxWucRWA3rjdM")
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
