// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailPoliciesTest {

    @Test
    fun create() {
        val emailPolicies =
            EmailPolicies.builder()
                .requiresDifferentAddress(true)
                .resendAllowed(true)
                .resendsRemaining(0L)
                .retryAllowed(true)
                .build()

        assertThat(emailPolicies.requiresDifferentAddress()).isEqualTo(true)
        assertThat(emailPolicies.resendAllowed()).isEqualTo(true)
        assertThat(emailPolicies.resendsRemaining()).isEqualTo(0L)
        assertThat(emailPolicies.retryAllowed()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailPolicies =
            EmailPolicies.builder()
                .requiresDifferentAddress(true)
                .resendAllowed(true)
                .resendsRemaining(0L)
                .retryAllowed(true)
                .build()

        val roundtrippedEmailPolicies =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailPolicies),
                jacksonTypeRef<EmailPolicies>(),
            )

        assertThat(roundtrippedEmailPolicies).isEqualTo(emailPolicies)
    }
}
