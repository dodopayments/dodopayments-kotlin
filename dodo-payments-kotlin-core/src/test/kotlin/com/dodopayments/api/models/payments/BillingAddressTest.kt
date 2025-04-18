// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingAddressTest {

    @Test
    fun create() {
        val billingAddress =
            BillingAddress.builder()
                .city("city")
                .country(CountryCode.AF)
                .state("state")
                .street("street")
                .zipcode("zipcode")
                .build()

        assertThat(billingAddress.city()).isEqualTo("city")
        assertThat(billingAddress.country()).isEqualTo(CountryCode.AF)
        assertThat(billingAddress.state()).isEqualTo("state")
        assertThat(billingAddress.street()).isEqualTo("street")
        assertThat(billingAddress.zipcode()).isEqualTo("zipcode")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingAddress =
            BillingAddress.builder()
                .city("city")
                .country(CountryCode.AF)
                .state("state")
                .street("street")
                .zipcode("zipcode")
                .build()

        val roundtrippedBillingAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingAddress),
                jacksonTypeRef<BillingAddress>(),
            )

        assertThat(roundtrippedBillingAddress).isEqualTo(billingAddress)
    }
}
