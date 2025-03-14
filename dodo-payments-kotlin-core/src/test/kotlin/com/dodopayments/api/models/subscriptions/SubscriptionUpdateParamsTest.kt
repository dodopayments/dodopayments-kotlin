// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUpdateParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateParams.builder()
            .subscriptionId("subscription_id")
            .metadata(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .status(SubscriptionStatus.PENDING)
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateParams.builder()
                .subscriptionId("subscription_id")
                .metadata(
                    SubscriptionUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .status(SubscriptionStatus.PENDING)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.metadata())
            .isEqualTo(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.status()).isEqualTo(SubscriptionStatus.PENDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
