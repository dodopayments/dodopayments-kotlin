// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices.payments

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentRetrievePayoutParamsTest {

    @Test
    fun create() {
        PaymentRetrievePayoutParams.builder()
            .payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T")
            .token("token")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentRetrievePayoutParams.builder().payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T").build()

        assertThat(params._pathParam(0)).isEqualTo("pyt_zFTrrn4sk3x3y2vjDBW3T")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PaymentRetrievePayoutParams.builder()
                .payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T")
                .token("token")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("token", "token").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PaymentRetrievePayoutParams.builder().payoutId("pyt_zFTrrn4sk3x3y2vjDBW3T").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
