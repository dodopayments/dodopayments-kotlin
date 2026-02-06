// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.balances

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceRetrieveLedgerParamsTest {

    @Test
    fun create() {
        BalanceRetrieveLedgerParams.builder()
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .currency(BalanceRetrieveLedgerParams.Currency.AED)
            .eventType(BalanceRetrieveLedgerParams.EventType.PAYMENT)
            .limit(0L)
            .pageNumber(0)
            .pageSize(0)
            .referenceObjectId("reference_object_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BalanceRetrieveLedgerParams.builder()
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(BalanceRetrieveLedgerParams.Currency.AED)
                .eventType(BalanceRetrieveLedgerParams.EventType.PAYMENT)
                .limit(0L)
                .pageNumber(0)
                .pageSize(0)
                .referenceObjectId("reference_object_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("created_at_gte", "2019-12-27T18:11:19.117Z")
                    .put("created_at_lte", "2019-12-27T18:11:19.117Z")
                    .put("currency", "AED")
                    .put("event_type", "payment")
                    .put("limit", "0")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("reference_object_id", "reference_object_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BalanceRetrieveLedgerParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
