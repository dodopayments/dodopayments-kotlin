// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdatePaymentMethodParamsTest {

    @Test
    fun create() {
        SubscriptionUpdatePaymentMethodParams.builder()
            .subscriptionId("subscription_id")
            .body(
                SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.builder()
                    .type(SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.Type.NEW)
                    .returnUrl("return_url")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionUpdatePaymentMethodParams.builder()
                .subscriptionId("subscription_id")
                .body(
                    SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.builder()
                        .type(SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.Type.NEW)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdatePaymentMethodParams.builder()
                .subscriptionId("subscription_id")
                .body(
                    SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.builder()
                        .type(SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.Type.NEW)
                        .returnUrl("return_url")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionUpdatePaymentMethodParams.Body.ofUnionMember0(
                    SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.builder()
                        .type(SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.Type.NEW)
                        .returnUrl("return_url")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionUpdatePaymentMethodParams.builder()
                .subscriptionId("subscription_id")
                .body(
                    SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.builder()
                        .type(SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.Type.NEW)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionUpdatePaymentMethodParams.Body.ofUnionMember0(
                    SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.builder()
                        .type(SubscriptionUpdatePaymentMethodParams.Body.UnionMember0.Type.NEW)
                        .build()
                )
            )
    }
}
