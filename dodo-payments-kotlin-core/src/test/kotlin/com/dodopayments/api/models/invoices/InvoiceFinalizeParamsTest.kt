// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceFinalizeParamsTest {

    @Test
    fun create() {
        InvoiceFinalizeParams.builder()
            .invoiceId("invoice_id")
            .ifMatch("If-Match")
            .addCcEmail("string")
            .customerEmail("customer_email")
            .send(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceFinalizeParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            InvoiceFinalizeParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .addCcEmail("string")
                .customerEmail("customer_email")
                .send(true)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("If-Match", "If-Match").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            InvoiceFinalizeParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("If-Match", "If-Match").build())
    }

    @Test
    fun body() {
        val params =
            InvoiceFinalizeParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .addCcEmail("string")
                .customerEmail("customer_email")
                .send(true)
                .build()

        val body = params._body()

        assertThat(body.ccEmails()).containsExactly("string")
        assertThat(body.customerEmail()).isEqualTo("customer_email")
        assertThat(body.send()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceFinalizeParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()

        val body = params._body()
    }
}
