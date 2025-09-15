// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckoutSessionCreateParamsTest {

    @Test
    fun create() {
        CheckoutSessionCreateParams.builder()
            .checkoutSessionRequest(
                CheckoutSessionRequest.builder()
                    .addProductCart(
                        CheckoutSessionRequest.ProductCart.builder()
                            .productId("product_id")
                            .quantity(0)
                            .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                            .amount(0)
                            .build()
                    )
                    .addAllowedPaymentMethodType(PaymentMethodTypes.CREDIT)
                    .billingAddress(
                        CheckoutSessionRequest.BillingAddress.builder()
                            .country(CountryCode.AF)
                            .city("city")
                            .state("state")
                            .street("street")
                            .zipcode("zipcode")
                            .build()
                    )
                    .billingCurrency(Currency.AED)
                    .confirm(true)
                    .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                    .customization(
                        CheckoutSessionRequest.Customization.builder()
                            .showOnDemandTag(true)
                            .showOrderDetails(true)
                            .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                            .build()
                    )
                    .discountCode("discount_code")
                    .featureFlags(
                        CheckoutSessionRequest.FeatureFlags.builder()
                            .allowCurrencySelection(true)
                            .allowDiscountCode(true)
                            .allowPhoneNumberCollection(true)
                            .allowTaxId(true)
                            .alwaysCreateNewCustomer(true)
                            .build()
                    )
                    .metadata(
                        CheckoutSessionRequest.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .returnUrl("return_url")
                    .showSavedPaymentMethods(true)
                    .subscriptionData(
                        CheckoutSessionRequest.SubscriptionData.builder()
                            .onDemand(
                                OnDemandSubscription.builder()
                                    .mandateOnly(true)
                                    .adaptiveCurrencyFeesInclusive(true)
                                    .productCurrency(Currency.AED)
                                    .productDescription("product_description")
                                    .productPrice(0)
                                    .build()
                            )
                            .trialPeriodDays(0)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CheckoutSessionCreateParams.builder()
                .checkoutSessionRequest(
                    CheckoutSessionRequest.builder()
                        .addProductCart(
                            CheckoutSessionRequest.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .addAddon(
                                    AttachAddon.builder().addonId("addon_id").quantity(0).build()
                                )
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(PaymentMethodTypes.CREDIT)
                        .billingAddress(
                            CheckoutSessionRequest.BillingAddress.builder()
                                .country(CountryCode.AF)
                                .city("city")
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .billingCurrency(Currency.AED)
                        .confirm(true)
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .customization(
                            CheckoutSessionRequest.Customization.builder()
                                .showOnDemandTag(true)
                                .showOrderDetails(true)
                                .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                                .build()
                        )
                        .discountCode("discount_code")
                        .featureFlags(
                            CheckoutSessionRequest.FeatureFlags.builder()
                                .allowCurrencySelection(true)
                                .allowDiscountCode(true)
                                .allowPhoneNumberCollection(true)
                                .allowTaxId(true)
                                .alwaysCreateNewCustomer(true)
                                .build()
                        )
                        .metadata(
                            CheckoutSessionRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .returnUrl("return_url")
                        .showSavedPaymentMethods(true)
                        .subscriptionData(
                            CheckoutSessionRequest.SubscriptionData.builder()
                                .onDemand(
                                    OnDemandSubscription.builder()
                                        .mandateOnly(true)
                                        .adaptiveCurrencyFeesInclusive(true)
                                        .productCurrency(Currency.AED)
                                        .productDescription("product_description")
                                        .productPrice(0)
                                        .build()
                                )
                                .trialPeriodDays(0)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CheckoutSessionRequest.builder()
                    .addProductCart(
                        CheckoutSessionRequest.ProductCart.builder()
                            .productId("product_id")
                            .quantity(0)
                            .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                            .amount(0)
                            .build()
                    )
                    .addAllowedPaymentMethodType(PaymentMethodTypes.CREDIT)
                    .billingAddress(
                        CheckoutSessionRequest.BillingAddress.builder()
                            .country(CountryCode.AF)
                            .city("city")
                            .state("state")
                            .street("street")
                            .zipcode("zipcode")
                            .build()
                    )
                    .billingCurrency(Currency.AED)
                    .confirm(true)
                    .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                    .customization(
                        CheckoutSessionRequest.Customization.builder()
                            .showOnDemandTag(true)
                            .showOrderDetails(true)
                            .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                            .build()
                    )
                    .discountCode("discount_code")
                    .featureFlags(
                        CheckoutSessionRequest.FeatureFlags.builder()
                            .allowCurrencySelection(true)
                            .allowDiscountCode(true)
                            .allowPhoneNumberCollection(true)
                            .allowTaxId(true)
                            .alwaysCreateNewCustomer(true)
                            .build()
                    )
                    .metadata(
                        CheckoutSessionRequest.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .returnUrl("return_url")
                    .showSavedPaymentMethods(true)
                    .subscriptionData(
                        CheckoutSessionRequest.SubscriptionData.builder()
                            .onDemand(
                                OnDemandSubscription.builder()
                                    .mandateOnly(true)
                                    .adaptiveCurrencyFeesInclusive(true)
                                    .productCurrency(Currency.AED)
                                    .productDescription("product_description")
                                    .productPrice(0)
                                    .build()
                            )
                            .trialPeriodDays(0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CheckoutSessionCreateParams.builder()
                .checkoutSessionRequest(
                    CheckoutSessionRequest.builder()
                        .addProductCart(
                            CheckoutSessionRequest.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CheckoutSessionRequest.builder()
                    .addProductCart(
                        CheckoutSessionRequest.ProductCart.builder()
                            .productId("product_id")
                            .quantity(0)
                            .build()
                    )
                    .build()
            )
    }
}
