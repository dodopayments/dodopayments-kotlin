// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachExistingCustomerTest {

    @Test
    fun create() {
        val attachExistingCustomer =
            AttachExistingCustomer.builder().customerId("customer_id").build()

        assertThat(attachExistingCustomer.customerId()).isEqualTo("customer_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachExistingCustomer =
            AttachExistingCustomer.builder().customerId("customer_id").build()

        val roundtrippedAttachExistingCustomer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachExistingCustomer),
                jacksonTypeRef<AttachExistingCustomer>(),
            )

        assertThat(roundtrippedAttachExistingCustomer).isEqualTo(attachExistingCustomer)
    }
}
