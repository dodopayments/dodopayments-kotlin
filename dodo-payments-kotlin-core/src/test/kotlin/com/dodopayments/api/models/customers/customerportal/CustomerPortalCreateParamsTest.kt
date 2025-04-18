// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.customerportal

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPortalCreateParamsTest {

    @Test
    fun create() {
        CustomerPortalCreateParams.builder().customerId("customer_id").sendEmail(true).build()
    }

    @Test
    fun pathParams() {
        val params = CustomerPortalCreateParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerPortalCreateParams.builder().customerId("customer_id").sendEmail(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("send_email", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerPortalCreateParams.builder().customerId("customer_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
