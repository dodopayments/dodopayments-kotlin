// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionCreateResponseTest {

    @Test
    fun createSubscriptionCreateResponse() {
        val subscriptionCreateResponse =
            SubscriptionCreateResponse.builder()
                .customer(
                    CustomerLimitedDetails.builder()
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
                CustomerLimitedDetails.builder()
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
