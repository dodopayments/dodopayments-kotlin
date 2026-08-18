// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckoutSessionFlagsTest {

    @Test
    fun create() {
        val checkoutSessionFlags =
            CheckoutSessionFlags.builder()
                .allowCurrencySelection(true)
                .allowCustomerEditingBusinessName(true)
                .allowCustomerEditingCity(true)
                .allowCustomerEditingCountry(true)
                .allowCustomerEditingEmail(true)
                .allowCustomerEditingName(true)
                .allowCustomerEditingState(true)
                .allowCustomerEditingStreet(true)
                .allowCustomerEditingTaxId(true)
                .allowCustomerEditingZipcode(true)
                .allowDiscountCode(true)
                .allowEditingAddons(true)
                .allowPhoneNumberCollection(true)
                .allowTaxId(true)
                .alwaysCreateNewCustomer(true)
                .redirectImmediately(true)
                .requirePhoneNumber(true)
                .singlePage(true)
                .build()

        assertThat(checkoutSessionFlags.allowCurrencySelection()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingBusinessName()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingCity()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingCountry()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingEmail()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingName()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingState()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingStreet()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingTaxId()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowCustomerEditingZipcode()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowDiscountCode()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowEditingAddons()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowPhoneNumberCollection()).isEqualTo(true)
        assertThat(checkoutSessionFlags.allowTaxId()).isEqualTo(true)
        assertThat(checkoutSessionFlags.alwaysCreateNewCustomer()).isEqualTo(true)
        assertThat(checkoutSessionFlags.redirectImmediately()).isEqualTo(true)
        assertThat(checkoutSessionFlags.requirePhoneNumber()).isEqualTo(true)
        assertThat(checkoutSessionFlags.singlePage()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionFlags =
            CheckoutSessionFlags.builder()
                .allowCurrencySelection(true)
                .allowCustomerEditingBusinessName(true)
                .allowCustomerEditingCity(true)
                .allowCustomerEditingCountry(true)
                .allowCustomerEditingEmail(true)
                .allowCustomerEditingName(true)
                .allowCustomerEditingState(true)
                .allowCustomerEditingStreet(true)
                .allowCustomerEditingTaxId(true)
                .allowCustomerEditingZipcode(true)
                .allowDiscountCode(true)
                .allowEditingAddons(true)
                .allowPhoneNumberCollection(true)
                .allowTaxId(true)
                .alwaysCreateNewCustomer(true)
                .redirectImmediately(true)
                .requirePhoneNumber(true)
                .singlePage(true)
                .build()

        val roundtrippedCheckoutSessionFlags =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionFlags),
                jacksonTypeRef<CheckoutSessionFlags>(),
            )

        assertThat(roundtrippedCheckoutSessionFlags).isEqualTo(checkoutSessionFlags)
    }
}
