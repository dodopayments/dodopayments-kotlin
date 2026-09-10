// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailRetrieveBodyParamsTest {

    @Test
    fun create() {
        EmailRetrieveBodyParams.builder()
            .customerId("customer_id")
            .emailLogId("email_log_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EmailRetrieveBodyParams.builder()
                .customerId("customer_id")
                .emailLogId("email_log_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        assertThat(params._pathParam(1)).isEqualTo("email_log_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
