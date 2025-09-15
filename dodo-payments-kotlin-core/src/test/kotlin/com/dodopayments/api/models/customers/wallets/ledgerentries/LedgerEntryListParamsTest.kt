// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets.ledgerentries

import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerEntryListParamsTest {

    @Test
    fun create() {
        LedgerEntryListParams.builder()
            .customerId("customer_id")
            .currency(Currency.AED)
            .pageNumber(0)
            .pageSize(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LedgerEntryListParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LedgerEntryListParams.builder()
                .customerId("customer_id")
                .currency(Currency.AED)
                .pageNumber(0)
                .pageSize(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currency", "AED")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerEntryListParams.builder().customerId("customer_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
