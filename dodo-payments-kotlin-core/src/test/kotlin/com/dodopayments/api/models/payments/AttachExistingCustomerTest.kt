// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AttachExistingCustomerTest {

    @Test
    fun createAttachExistingCustomer() {
        val attachExistingCustomer =
            AttachExistingCustomer.builder().customerId("customer_id").build()
        assertThat(attachExistingCustomer).isNotNull
        assertThat(attachExistingCustomer.customerId()).isEqualTo("customer_id")
    }
}
