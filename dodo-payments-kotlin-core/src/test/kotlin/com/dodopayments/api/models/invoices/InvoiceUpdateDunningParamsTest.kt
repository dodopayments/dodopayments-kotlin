// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceUpdateDunningParamsTest {

    @Test
    fun create() {
        InvoiceUpdateDunningParams.builder()
            .invoiceId("invoice_id")
            .ifMatch("If-Match")
            .action(InvoiceUpdateDunningParams.Action.PAUSE)
            .addOffsetsDay(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceUpdateDunningParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .action(InvoiceUpdateDunningParams.Action.PAUSE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            InvoiceUpdateDunningParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .action(InvoiceUpdateDunningParams.Action.PAUSE)
                .addOffsetsDay(0)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("If-Match", "If-Match").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            InvoiceUpdateDunningParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .action(InvoiceUpdateDunningParams.Action.PAUSE)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("If-Match", "If-Match").build())
    }

    @Test
    fun body() {
        val params =
            InvoiceUpdateDunningParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .action(InvoiceUpdateDunningParams.Action.PAUSE)
                .addOffsetsDay(0)
                .build()

        val body = params._body()

        assertThat(body.action()).isEqualTo(InvoiceUpdateDunningParams.Action.PAUSE)
        assertThat(body.offsetsDays()).containsExactly(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceUpdateDunningParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .action(InvoiceUpdateDunningParams.Action.PAUSE)
                .build()

        val body = params._body()

        assertThat(body.action()).isEqualTo(InvoiceUpdateDunningParams.Action.PAUSE)
    }
}
