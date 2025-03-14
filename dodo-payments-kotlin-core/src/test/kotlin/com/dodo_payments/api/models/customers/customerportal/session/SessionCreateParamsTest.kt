// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.customers.customerportal.session

import com.dodo_payments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SessionCreateParamsTest {

    @Test
    fun create() {
        SessionCreateParams.builder().customerId("customer_id").sendEmail(true).build()
    }

    @Test
    fun queryParams() {
        val params = SessionCreateParams.builder().customerId("customer_id").sendEmail(true).build()
        val expected = QueryParams.builder()
        expected.put("send_email", "true")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SessionCreateParams.builder().customerId("customer_id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = SessionCreateParams.builder().customerId("customer_id").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
