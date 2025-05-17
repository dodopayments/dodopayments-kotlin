// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChargeParamsTest {

    @Test
    fun create() {
        SubscriptionChargeParams.builder()
            .subscriptionId("subscription_id")
            .productPrice(0)
            .metadata(
                SubscriptionChargeParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("subscription_id")
                .productPrice(0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("subscription_id")
                .productPrice(0)
                .metadata(
                    SubscriptionChargeParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.productPrice()).isEqualTo(0)
        assertThat(body.metadata())
            .isEqualTo(
                SubscriptionChargeParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("subscription_id")
                .productPrice(0)
                .build()

        val body = params._body()

        assertThat(body.productPrice()).isEqualTo(0)
    }
}
