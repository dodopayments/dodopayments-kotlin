// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.customerportal

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPortalCreateParamsTest {

    @Test
    fun create() {
        CustomerPortalCreateParams.builder().customerId("customer_id").sendEmail(true).build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerPortalCreateParams.builder().customerId("customer_id").sendEmail(true).build()
        val expected = QueryParams.builder()
        expected.put("send_email", "true")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerPortalCreateParams.builder().customerId("customer_id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = CustomerPortalCreateParams.builder().customerId("customer_id").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
