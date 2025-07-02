// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateResponseTest {

    @Test
    fun create() {
        val subscriptionCreateResponse =
            SubscriptionCreateResponse.builder()
                .addAddon(AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build())
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
                .paymentId("payment_id")
                .recurringPreTaxAmount(0)
                .subscriptionId("subscription_id")
                .clientSecret("client_secret")
                .discountId("discount_id")
                .expiresOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentLink("payment_link")
                .build()

        assertThat(subscriptionCreateResponse.addons())
            .containsExactly(
                AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
            )
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
        assertThat(subscriptionCreateResponse.paymentId()).isEqualTo("payment_id")
        assertThat(subscriptionCreateResponse.recurringPreTaxAmount()).isEqualTo(0)
        assertThat(subscriptionCreateResponse.subscriptionId()).isEqualTo("subscription_id")
        assertThat(subscriptionCreateResponse.clientSecret()).isEqualTo("client_secret")
        assertThat(subscriptionCreateResponse.discountId()).isEqualTo("discount_id")
        assertThat(subscriptionCreateResponse.expiresOn())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionCreateResponse.paymentLink()).isEqualTo("payment_link")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionCreateResponse =
            SubscriptionCreateResponse.builder()
                .addAddon(AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build())
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
                .paymentId("payment_id")
                .recurringPreTaxAmount(0)
                .subscriptionId("subscription_id")
                .clientSecret("client_secret")
                .discountId("discount_id")
                .expiresOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentLink("payment_link")
                .build()

        val roundtrippedSubscriptionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionCreateResponse),
                jacksonTypeRef<SubscriptionCreateResponse>(),
            )

        assertThat(roundtrippedSubscriptionCreateResponse).isEqualTo(subscriptionCreateResponse)
    }
}
