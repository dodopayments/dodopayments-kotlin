// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckoutSessionBillingAddressTest {

    @Test
    fun create() {
        val checkoutSessionBillingAddress =
            CheckoutSessionBillingAddress.builder()
                .country(CountryCode.AF)
                .city("city")
                .state("state")
                .street("street")
                .zipcode("zipcode")
                .build()

        assertThat(checkoutSessionBillingAddress.country()).isEqualTo(CountryCode.AF)
        assertThat(checkoutSessionBillingAddress.city()).isEqualTo("city")
        assertThat(checkoutSessionBillingAddress.state()).isEqualTo("state")
        assertThat(checkoutSessionBillingAddress.street()).isEqualTo("street")
        assertThat(checkoutSessionBillingAddress.zipcode()).isEqualTo("zipcode")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionBillingAddress =
            CheckoutSessionBillingAddress.builder()
                .country(CountryCode.AF)
                .city("city")
                .state("state")
                .street("street")
                .zipcode("zipcode")
                .build()

        val roundtrippedCheckoutSessionBillingAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionBillingAddress),
                jacksonTypeRef<CheckoutSessionBillingAddress>(),
            )

        assertThat(roundtrippedCheckoutSessionBillingAddress)
            .isEqualTo(checkoutSessionBillingAddress)
    }
}
