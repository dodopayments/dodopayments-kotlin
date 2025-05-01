// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .billing(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
            .productId("product_id")
            .quantity(0L)
            .addAddon(
                SubscriptionCreateParams.Addon.builder().addonId("addon_id").quantity(0L).build()
            )
            .addAllowedPaymentMethodType(SubscriptionCreateParams.AllowedPaymentMethodType.CREDIT)
            .billingCurrency(Currency.AED)
            .discountCode("discount_code")
            .metadata(
                SubscriptionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .onDemand(
                SubscriptionCreateParams.OnDemand.builder()
                    .mandateOnly(true)
                    .productPrice(0L)
                    .build()
            )
            .paymentLink(true)
            .returnUrl("return_url")
            .showSavedPaymentMethods(true)
            .taxId("tax_id")
            .trialPeriodDays(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .productId("product_id")
                .quantity(0L)
                .addAddon(
                    SubscriptionCreateParams.Addon.builder()
                        .addonId("addon_id")
                        .quantity(0L)
                        .build()
                )
                .addAllowedPaymentMethodType(
                    SubscriptionCreateParams.AllowedPaymentMethodType.CREDIT
                )
                .billingCurrency(Currency.AED)
                .discountCode("discount_code")
                .metadata(
                    SubscriptionCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .onDemand(
                    SubscriptionCreateParams.OnDemand.builder()
                        .mandateOnly(true)
                        .productPrice(0L)
                        .build()
                )
                .paymentLink(true)
                .returnUrl("return_url")
                .showSavedPaymentMethods(true)
                .taxId("tax_id")
                .trialPeriodDays(0L)
                .build()

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.quantity()).isEqualTo(0L)
        assertThat(body.addons())
            .containsExactly(
                SubscriptionCreateParams.Addon.builder().addonId("addon_id").quantity(0L).build()
            )
        assertThat(body.allowedPaymentMethodTypes())
            .containsExactly(SubscriptionCreateParams.AllowedPaymentMethodType.CREDIT)
        assertThat(body.billingCurrency()).isEqualTo(Currency.AED)
        assertThat(body.discountCode()).isEqualTo("discount_code")
        assertThat(body.metadata())
            .isEqualTo(
                SubscriptionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.onDemand())
            .isEqualTo(
                SubscriptionCreateParams.OnDemand.builder()
                    .mandateOnly(true)
                    .productPrice(0L)
                    .build()
            )
        assertThat(body.paymentLink()).isEqualTo(true)
        assertThat(body.returnUrl()).isEqualTo("return_url")
        assertThat(body.showSavedPaymentMethods()).isEqualTo(true)
        assertThat(body.taxId()).isEqualTo("tax_id")
        assertThat(body.trialPeriodDays()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionCreateParams.builder()
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .productId("product_id")
                .quantity(0L)
                .build()

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.quantity()).isEqualTo(0L)
    }
}
