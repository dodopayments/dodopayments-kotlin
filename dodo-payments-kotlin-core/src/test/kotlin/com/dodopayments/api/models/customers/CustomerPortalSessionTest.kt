// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPortalSessionTest {

    @Test
    fun createCustomerPortalSession() {
        val customerPortalSession = CustomerPortalSession.builder().link("link").build()
        assertThat(customerPortalSession).isNotNull
        assertThat(customerPortalSession.link()).isEqualTo("link")
    }
}
