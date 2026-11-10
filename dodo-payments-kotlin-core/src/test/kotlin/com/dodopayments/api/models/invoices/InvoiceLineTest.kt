// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineTest {

    @Test
    fun create() {
        val invoiceLine =
            InvoiceLine.builder()
                .amount(0L)
                .kind(InvoiceLine.Kind.SUBSCRIPTION)
                .quantity(0)
                .tax(0L)
                .taxInclusive(true)
                .unitAmount(0L)
                .addonId("addon_id")
                .description("description")
                .name("name")
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .productId("product_id")
                .subscriptionId("subscription_id")
                .taxRate(0)
                .build()

        assertThat(invoiceLine.amount()).isEqualTo(0L)
        assertThat(invoiceLine.kind()).isEqualTo(InvoiceLine.Kind.SUBSCRIPTION)
        assertThat(invoiceLine.quantity()).isEqualTo(0)
        assertThat(invoiceLine.tax()).isEqualTo(0L)
        assertThat(invoiceLine.taxInclusive()).isEqualTo(true)
        assertThat(invoiceLine.unitAmount()).isEqualTo(0L)
        assertThat(invoiceLine.addonId()).isEqualTo("addon_id")
        assertThat(invoiceLine.description()).isEqualTo("description")
        assertThat(invoiceLine.name()).isEqualTo("name")
        assertThat(invoiceLine.periodEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceLine.periodStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceLine.productId()).isEqualTo("product_id")
        assertThat(invoiceLine.subscriptionId()).isEqualTo("subscription_id")
        assertThat(invoiceLine.taxRate()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceLine =
            InvoiceLine.builder()
                .amount(0L)
                .kind(InvoiceLine.Kind.SUBSCRIPTION)
                .quantity(0)
                .tax(0L)
                .taxInclusive(true)
                .unitAmount(0L)
                .addonId("addon_id")
                .description("description")
                .name("name")
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .productId("product_id")
                .subscriptionId("subscription_id")
                .taxRate(0)
                .build()

        val roundtrippedInvoiceLine =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceLine),
                jacksonTypeRef<InvoiceLine>(),
            )

        assertThat(roundtrippedInvoiceLine).isEqualTo(invoiceLine)
    }
}
