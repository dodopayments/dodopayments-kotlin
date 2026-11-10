// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDuplicateParamsTest {

    @Test
    fun create() {
        InvoiceDuplicateParams.builder().invoiceId("invoice_id").build()
    }

    @Test
    fun pathParams() {
        val params = InvoiceDuplicateParams.builder().invoiceId("invoice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
