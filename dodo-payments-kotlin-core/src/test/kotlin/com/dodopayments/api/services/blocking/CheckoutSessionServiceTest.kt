// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionRequest
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckoutSessionServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val checkoutSessionService = client.checkoutSessions()

        val checkoutSessionResponse =
            checkoutSessionService.create(
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
            )

        checkoutSessionResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val checkoutSessionService = client.checkoutSessions()

        val checkoutSessionStatus = checkoutSessionService.retrieve("id")

        checkoutSessionStatus.validate()
    }
}
