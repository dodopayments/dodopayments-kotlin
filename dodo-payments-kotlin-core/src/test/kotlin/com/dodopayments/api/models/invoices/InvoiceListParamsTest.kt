// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceListParamsTest {

    @Test
    fun create() {
        InvoiceListParams.builder()
            .collectionMethod(InvoiceListParams.CollectionMethod.AUTO_CHARGE)
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerId("customer_id")
            .dueAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dueAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .pageNumber(0)
            .pageSize(0)
            .addStatus(InvoiceListParams.Status.OPEN)
            .subscriptionId("subscription_id")
            .addTag(InvoiceListParams.Tag.REFUNDED)
            .totalAmountGte(0L)
            .totalAmountLte(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceListParams.builder()
                .collectionMethod(InvoiceListParams.CollectionMethod.AUTO_CHARGE)
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .dueAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dueAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageNumber(0)
                .pageSize(0)
                .addStatus(InvoiceListParams.Status.OPEN)
                .subscriptionId("subscription_id")
                .addTag(InvoiceListParams.Tag.REFUNDED)
                .totalAmountGte(0L)
                .totalAmountLte(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("collection_method", "auto_charge")
                    .put("created_at_gte", "2019-12-27T18:11:19.117Z")
                    .put("created_at_lte", "2019-12-27T18:11:19.117Z")
                    .put("customer_id", "customer_id")
                    .put("due_at_gte", "2019-12-27T18:11:19.117Z")
                    .put("due_at_lte", "2019-12-27T18:11:19.117Z")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("status", listOf("open").joinToString(","))
                    .put("subscription_id", "subscription_id")
                    .put("tags", listOf("refunded").joinToString(","))
                    .put("total_amount_gte", "0")
                    .put("total_amount_lte", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
