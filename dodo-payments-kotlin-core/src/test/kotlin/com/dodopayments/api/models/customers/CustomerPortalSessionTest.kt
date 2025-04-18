// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPortalSessionTest {

    @Test
    fun create() {
        val customerPortalSession = CustomerPortalSession.builder().link("link").build()

        assertThat(customerPortalSession.link()).isEqualTo("link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerPortalSession = CustomerPortalSession.builder().link("link").build()

        val roundtrippedCustomerPortalSession =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerPortalSession),
                jacksonTypeRef<CustomerPortalSession>(),
            )

        assertThat(roundtrippedCustomerPortalSession).isEqualTo(customerPortalSession)
    }
}
