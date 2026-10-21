// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices.payments

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetrieveParamsTest {

    @Test
    fun create() {
        PaymentRetrieveParams.builder()
            .paymentId("pay_gr4RizvMOXFJ6xca3y2tU")
            .token("token")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PaymentRetrieveParams.builder().paymentId("pay_gr4RizvMOXFJ6xca3y2tU").build()

        assertThat(params._pathParam(0)).isEqualTo("pay_gr4RizvMOXFJ6xca3y2tU")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PaymentRetrieveParams.builder()
                .paymentId("pay_gr4RizvMOXFJ6xca3y2tU")
                .token("token")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("token", "token").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PaymentRetrieveParams.builder().paymentId("pay_gr4RizvMOXFJ6xca3y2tU").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
