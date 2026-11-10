// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoicePreviewExistingParamsTest {

    @Test
    fun create() {
        InvoicePreviewExistingParams.builder()
            .invoiceId("invoice_id")
            .format(InvoicePreviewExistingParams.Format.JSON)
            .build()
    }

    @Test
    fun pathParams() {
        val params = InvoicePreviewExistingParams.builder().invoiceId("invoice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InvoicePreviewExistingParams.builder()
                .invoiceId("invoice_id")
                .format(InvoicePreviewExistingParams.Format.JSON)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("format", "json").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoicePreviewExistingParams.builder().invoiceId("invoice_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
