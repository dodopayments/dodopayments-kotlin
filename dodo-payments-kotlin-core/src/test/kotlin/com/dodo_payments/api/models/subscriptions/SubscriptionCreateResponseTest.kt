// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import com.dodo_payments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionCreateResponseTest {

    @Test
    fun createSubscriptionCreateResponse() {
        val subscriptionCreateResponse =
            SubscriptionCreateResponse.builder()
                .customer(
                    SubscriptionCreateResponse.Customer.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .metadata(
                    SubscriptionCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .recurringPreTaxAmount(0L)
                .subscriptionId("subscription_id")
                .clientSecret("client_secret")
                .discountId("discount_id")
                .paymentLink("payment_link")
                .build()
        assertThat(subscriptionCreateResponse).isNotNull
        assertThat(subscriptionCreateResponse.customer())
            .isEqualTo(
                SubscriptionCreateResponse.Customer.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(subscriptionCreateResponse.metadata())
            .isEqualTo(
                SubscriptionCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(subscriptionCreateResponse.recurringPreTaxAmount()).isEqualTo(0L)
        assertThat(subscriptionCreateResponse.subscriptionId()).isEqualTo("subscription_id")
        assertThat(subscriptionCreateResponse.clientSecret()).isEqualTo("client_secret")
        assertThat(subscriptionCreateResponse.discountId()).isEqualTo("discount_id")
        assertThat(subscriptionCreateResponse.paymentLink()).isEqualTo("payment_link")
    }
}
