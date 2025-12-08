// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services

import com.dodopayments.api.client.DodoPaymentsClient
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionRequest
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: DodoPaymentsClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
    }

    @Test
    fun create() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

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
                        .build()
                )
                .force3ds(true)
                .metadata(
                    CheckoutSessionRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .minimalAddress(true)
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

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
