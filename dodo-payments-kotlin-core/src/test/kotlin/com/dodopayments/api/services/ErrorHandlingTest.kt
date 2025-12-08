// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services

import com.dodopayments.api.client.DodoPaymentsClient
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.BadRequestException
import com.dodopayments.api.errors.DodoPaymentsException
import com.dodopayments.api.errors.InternalServerException
import com.dodopayments.api.errors.NotFoundException
import com.dodopayments.api.errors.PermissionDeniedException
import com.dodopayments.api.errors.RateLimitException
import com.dodopayments.api.errors.UnauthorizedException
import com.dodopayments.api.errors.UnexpectedStatusCodeException
import com.dodopayments.api.errors.UnprocessableEntityException
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionRequest
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

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
    fun checkoutSessionsCreate400() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate400WithRawResponse() {
        val checkoutSessionService = client.checkoutSessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate401() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate401WithRawResponse() {
        val checkoutSessionService = client.checkoutSessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate403() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate403WithRawResponse() {
        val checkoutSessionService = client.checkoutSessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate404() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate404WithRawResponse() {
        val checkoutSessionService = client.checkoutSessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate422() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate422WithRawResponse() {
        val checkoutSessionService = client.checkoutSessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate429() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate429WithRawResponse() {
        val checkoutSessionService = client.checkoutSessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate500() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate500WithRawResponse() {
        val checkoutSessionService = client.checkoutSessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate999() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreate999WithRawResponse() {
        val checkoutSessionService = client.checkoutSessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                checkoutSessionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun checkoutSessionsCreateInvalidJsonBody() {
        val checkoutSessionService = client.checkoutSessions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<DodoPaymentsException> {
                checkoutSessionService.create(
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
