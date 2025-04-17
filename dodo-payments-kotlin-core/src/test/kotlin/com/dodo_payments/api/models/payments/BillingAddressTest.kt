// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import com.dodo_payments.api.models.misc.CountryCode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillingAddressTest {

    @Test
    fun createBillingAddress() {
        val billingAddress =
            BillingAddress.builder()
                .city("city")
                .country(CountryCode.AF)
                .state("state")
                .street("street")
                .zipcode("zipcode")
                .build()
        assertThat(billingAddress).isNotNull
        assertThat(billingAddress.city()).isEqualTo("city")
        assertThat(billingAddress.country()).isEqualTo(CountryCode.AF)
        assertThat(billingAddress.state()).isEqualTo("state")
        assertThat(billingAddress.street()).isEqualTo("street")
        assertThat(billingAddress.zipcode()).isEqualTo("zipcode")
    }
}
