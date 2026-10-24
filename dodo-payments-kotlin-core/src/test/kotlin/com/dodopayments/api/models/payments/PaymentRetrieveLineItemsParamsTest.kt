// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetrieveLineItemsParamsTest {

    @Test
    fun create() {
        PaymentRetrieveLineItemsParams.builder()
            .paymentId("pay_gr4RizvMOXFJ6xca3y2tU")
            .currency(Currency.AED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentRetrieveLineItemsParams.builder().paymentId("pay_gr4RizvMOXFJ6xca3y2tU").build()

        assertThat(params._pathParam(0)).isEqualTo("pay_gr4RizvMOXFJ6xca3y2tU")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PaymentRetrieveLineItemsParams.builder()
                .paymentId("pay_gr4RizvMOXFJ6xca3y2tU")
                .currency(Currency.AED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("currency", "AED").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PaymentRetrieveLineItemsParams.builder().paymentId("pay_gr4RizvMOXFJ6xca3y2tU").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
