// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.proguard

import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionRequest
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.CustomerRequest
import com.dodopayments.api.models.payments.IntentStatus
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/dodo-payments-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = DodoPaymentsOkHttpClient.builder().bearerToken("My Bearer Token").build()

        assertThat(client).isNotNull()
        assertThat(client.checkoutSessions()).isNotNull()
        assertThat(client.payments()).isNotNull()
        assertThat(client.subscriptions()).isNotNull()
        assertThat(client.invoices()).isNotNull()
        assertThat(client.licenses()).isNotNull()
        assertThat(client.licenseKeys()).isNotNull()
        assertThat(client.licenseKeyInstances()).isNotNull()
        assertThat(client.customers()).isNotNull()
        assertThat(client.refunds()).isNotNull()
        assertThat(client.disputes()).isNotNull()
        assertThat(client.payouts()).isNotNull()
        assertThat(client.products()).isNotNull()
        assertThat(client.misc()).isNotNull()
        assertThat(client.discounts()).isNotNull()
        assertThat(client.addons()).isNotNull()
        assertThat(client.brands()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.webhookEvents()).isNotNull()
        assertThat(client.usageEvents()).isNotNull()
        assertThat(client.meters()).isNotNull()
    }

    @Test
    fun checkoutSessionRequestRoundtrip() {
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

    @Test
    fun customerRequestRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerRequest =
            CustomerRequest.ofAttachExistingCustomer(
                AttachExistingCustomer.builder().customerId("customer_id").build()
            )

        val roundtrippedCustomerRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRequest),
                jacksonTypeRef<CustomerRequest>(),
            )

        assertThat(roundtrippedCustomerRequest).isEqualTo(customerRequest)
    }

    @Test
    fun intentStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val intentStatus = IntentStatus.SUCCEEDED

        val roundtrippedIntentStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intentStatus),
                jacksonTypeRef<IntentStatus>(),
            )

        assertThat(roundtrippedIntentStatus).isEqualTo(intentStatus)
    }
}
