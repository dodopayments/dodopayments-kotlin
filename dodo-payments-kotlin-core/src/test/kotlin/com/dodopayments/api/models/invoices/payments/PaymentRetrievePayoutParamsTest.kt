// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetrievePayoutParamsTest {

    @Test
    fun create() {
        PaymentRetrievePayoutParams.builder().payoutId("payout_id").build()
    }

    @Test
    fun pathParams() {
        val params = PaymentRetrievePayoutParams.builder().payoutId("payout_id").build()

        assertThat(params._pathParam(0)).isEqualTo("payout_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
