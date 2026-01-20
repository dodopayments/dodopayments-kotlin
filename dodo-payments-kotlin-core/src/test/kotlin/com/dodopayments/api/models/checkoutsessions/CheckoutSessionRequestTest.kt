// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.CustomerRequest
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckoutSessionRequestTest {

    @Test
    fun create() {
        val checkoutSessionRequest =
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
                        .forceLanguage("force_language")
                        .showOnDemandTag(true)
                        .showOrderDetails(true)
                        .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                        .build()
                )
                .discountCode("discount_code")
                .featureFlags(
                    CheckoutSessionRequest.FeatureFlags.builder()
                        .allowCurrencySelection(true)
                        .allowCustomerEditingCity(true)
                        .allowCustomerEditingCountry(true)
                        .allowCustomerEditingEmail(true)
                        .allowCustomerEditingName(true)
                        .allowCustomerEditingState(true)
                        .allowCustomerEditingStreet(true)
                        .allowCustomerEditingZipcode(true)
                        .allowDiscountCode(true)
                        .allowPhoneNumberCollection(true)
                        .allowTaxId(true)
                        .alwaysCreateNewCustomer(true)
                        .redirectImmediately(true)
                        .build()
                )
                .force3ds(true)
                .metadata(
                    CheckoutSessionRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .minimalAddress(true)
                .paymentMethodId("payment_method_id")
                .productCollectionId("product_collection_id")
                .returnUrl("return_url")
                .shortLink(true)
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

        assertThat(checkoutSessionRequest.productCart())
            .containsExactly(
                CheckoutSessionRequest.ProductCart.builder()
                    .productId("product_id")
                    .quantity(0)
                    .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                    .amount(0)
                    .build()
            )
        assertThat(checkoutSessionRequest.allowedPaymentMethodTypes())
            .containsExactly(PaymentMethodTypes.CREDIT)
        assertThat(checkoutSessionRequest.billingAddress())
            .isEqualTo(
                CheckoutSessionRequest.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(checkoutSessionRequest.billingCurrency()).isEqualTo(Currency.AED)
        assertThat(checkoutSessionRequest.confirm()).isEqualTo(true)
        assertThat(checkoutSessionRequest.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(checkoutSessionRequest.customization())
            .isEqualTo(
                CheckoutSessionRequest.Customization.builder()
                    .forceLanguage("force_language")
                    .showOnDemandTag(true)
                    .showOrderDetails(true)
                    .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                    .build()
            )
        assertThat(checkoutSessionRequest.discountCode()).isEqualTo("discount_code")
        assertThat(checkoutSessionRequest.featureFlags())
            .isEqualTo(
                CheckoutSessionRequest.FeatureFlags.builder()
                    .allowCurrencySelection(true)
                    .allowCustomerEditingCity(true)
                    .allowCustomerEditingCountry(true)
                    .allowCustomerEditingEmail(true)
                    .allowCustomerEditingName(true)
                    .allowCustomerEditingState(true)
                    .allowCustomerEditingStreet(true)
                    .allowCustomerEditingZipcode(true)
                    .allowDiscountCode(true)
                    .allowPhoneNumberCollection(true)
                    .allowTaxId(true)
                    .alwaysCreateNewCustomer(true)
                    .redirectImmediately(true)
                    .build()
            )
        assertThat(checkoutSessionRequest.force3ds()).isEqualTo(true)
        assertThat(checkoutSessionRequest.metadata())
            .isEqualTo(
                CheckoutSessionRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(checkoutSessionRequest.minimalAddress()).isEqualTo(true)
        assertThat(checkoutSessionRequest.paymentMethodId()).isEqualTo("payment_method_id")
        assertThat(checkoutSessionRequest.productCollectionId()).isEqualTo("product_collection_id")
        assertThat(checkoutSessionRequest.returnUrl()).isEqualTo("return_url")
        assertThat(checkoutSessionRequest.shortLink()).isEqualTo(true)
        assertThat(checkoutSessionRequest.showSavedPaymentMethods()).isEqualTo(true)
        assertThat(checkoutSessionRequest.subscriptionData())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionRequest =
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
                        .forceLanguage("force_language")
                        .showOnDemandTag(true)
                        .showOrderDetails(true)
                        .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                        .build()
                )
                .discountCode("discount_code")
                .featureFlags(
                    CheckoutSessionRequest.FeatureFlags.builder()
                        .allowCurrencySelection(true)
                        .allowCustomerEditingCity(true)
                        .allowCustomerEditingCountry(true)
                        .allowCustomerEditingEmail(true)
                        .allowCustomerEditingName(true)
                        .allowCustomerEditingState(true)
                        .allowCustomerEditingStreet(true)
                        .allowCustomerEditingZipcode(true)
                        .allowDiscountCode(true)
                        .allowPhoneNumberCollection(true)
                        .allowTaxId(true)
                        .alwaysCreateNewCustomer(true)
                        .redirectImmediately(true)
                        .build()
                )
                .force3ds(true)
                .metadata(
                    CheckoutSessionRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .minimalAddress(true)
                .paymentMethodId("payment_method_id")
                .productCollectionId("product_collection_id")
                .returnUrl("return_url")
                .shortLink(true)
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

        val roundtrippedCheckoutSessionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionRequest),
                jacksonTypeRef<CheckoutSessionRequest>(),
            )

        assertThat(roundtrippedCheckoutSessionRequest).isEqualTo(checkoutSessionRequest)
    }
}
