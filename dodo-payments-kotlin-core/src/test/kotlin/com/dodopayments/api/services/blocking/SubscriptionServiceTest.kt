// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeParams
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscriptions()

        val subscription =
            subscriptionService.create(
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
                    .quantity(0)
                    .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                    .addAllowedPaymentMethodType(PaymentMethodTypes.CREDIT)
                    .billingCurrency(Currency.AED)
                    .discountCode("discount_code")
                    .force3ds(true)
                    .metadata(
                        SubscriptionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .onDemand(
                        OnDemandSubscription.builder()
                            .mandateOnly(true)
                            .adaptiveCurrencyFeesInclusive(true)
                            .productCurrency(Currency.AED)
                            .productDescription("product_description")
                            .productPrice(0)
                            .build()
                    )
                    .paymentLink(true)
                    .returnUrl("return_url")
                    .showSavedPaymentMethods(true)
                    .taxId("tax_id")
                    .trialPeriodDays(0)
                    .build()
            )

        subscription.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscriptions()

        val subscription = subscriptionService.retrieve("subscription_id")

        subscription.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscriptions()

        val subscription =
            subscriptionService.update(
                SubscriptionUpdateParams.builder()
                    .subscriptionId("subscription_id")
                    .billing(
                        BillingAddress.builder()
                            .city("city")
                            .country(CountryCode.AF)
                            .state("state")
                            .street("street")
                            .zipcode("zipcode")
                            .build()
                    )
                    .cancelAtNextBillingDate(true)
                    .disableOnDemand(
                        SubscriptionUpdateParams.DisableOnDemand.builder()
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .metadata(
                        SubscriptionUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionStatus.PENDING)
                    .taxId("tax_id")
                    .build()
            )

        subscription.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscriptions()

        val page = subscriptionService.list()

        page.response().validate()
    }

    @Test
    fun changePlan() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscriptions()

        subscriptionService.changePlan(
            SubscriptionChangePlanParams.builder()
                .subscriptionId("subscription_id")
                .productId("product_id")
                .prorationBillingMode(
                    SubscriptionChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
                )
                .quantity(0)
                .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                .build()
        )
    }

    @Test
    fun charge() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscriptions()

        val response =
            subscriptionService.charge(
                SubscriptionChargeParams.builder()
                    .subscriptionId("subscription_id")
                    .productPrice(0)
                    .adaptiveCurrencyFeesInclusive(true)
                    .customerBalanceConfig(
                        SubscriptionChargeParams.CustomerBalanceConfig.builder()
                            .allowCustomerCreditsPurchase(true)
                            .allowCustomerCreditsUsage(true)
                            .build()
                    )
                    .metadata(
                        SubscriptionChargeParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productCurrency(Currency.AED)
                    .productDescription("product_description")
                    .build()
            )

        response.validate()
    }

    @Test
    fun retrieveUsageHistory() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionService = client.subscriptions()

        val page = subscriptionService.retrieveUsageHistory("subscription_id")

        page.response().validate()
    }
}
