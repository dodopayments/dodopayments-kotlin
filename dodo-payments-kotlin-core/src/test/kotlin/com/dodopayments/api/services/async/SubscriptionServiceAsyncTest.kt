// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionRetrieveParams
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SubscriptionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscription =
            subscriptionServiceAsync.create(
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
                    .discountCode("discount_code")
                    .metadata(
                        SubscriptionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentLink(true)
                    .returnUrl("return_url")
                    .taxId("tax_id")
                    .trialPeriodDays(0L)
                    .build()
            )

        subscription.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscription =
            subscriptionServiceAsync.retrieve(
                SubscriptionRetrieveParams.builder().subscriptionId("subscription_id").build()
            )

        subscription.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscription =
            subscriptionServiceAsync.update(
                SubscriptionUpdateParams.builder()
                    .subscriptionId("subscription_id")
                    .metadata(
                        SubscriptionUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .status(SubscriptionStatus.PENDING)
                    .build()
            )

        subscription.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val page = subscriptionServiceAsync.list()

        page.response().validate()
    }
}
