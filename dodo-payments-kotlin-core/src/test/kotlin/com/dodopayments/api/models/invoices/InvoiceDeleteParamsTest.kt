// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDeleteParamsTest {

    @Test
    fun create() {
        InvoiceDeleteParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceDeleteParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            InvoiceDeleteParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("If-Match", "If-Match").build())
    }
}
