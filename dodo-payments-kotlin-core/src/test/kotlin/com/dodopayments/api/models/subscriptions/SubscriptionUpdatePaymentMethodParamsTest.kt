// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.models.payments.PaymentMethodTypes
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdatePaymentMethodParamsTest {

    @Test
    fun create() {
        SubscriptionUpdatePaymentMethodParams.builder()
            .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
            .paymentMethod(
                SubscriptionUpdatePaymentMethodParams.PaymentMethod.New.builder()
                    .addAllowedPaymentMethodType(PaymentMethodTypes.ACH)
                    .returnUrl("return_url")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionUpdatePaymentMethodParams.builder()
                .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
                .paymentMethod(
                    SubscriptionUpdatePaymentMethodParams.PaymentMethod.New.builder().build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("sub_Iuaq622bbmmfOGrVTqdXv")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdatePaymentMethodParams.builder()
                .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
                .paymentMethod(
                    SubscriptionUpdatePaymentMethodParams.PaymentMethod.New.builder()
                        .addAllowedPaymentMethodType(PaymentMethodTypes.ACH)
                        .returnUrl("return_url")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionUpdatePaymentMethodParams.PaymentMethod.ofNew(
                    SubscriptionUpdatePaymentMethodParams.PaymentMethod.New.builder()
                        .addAllowedPaymentMethodType(PaymentMethodTypes.ACH)
                        .returnUrl("return_url")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionUpdatePaymentMethodParams.builder()
                .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
                .paymentMethod(
                    SubscriptionUpdatePaymentMethodParams.PaymentMethod.New.builder().build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionUpdatePaymentMethodParams.PaymentMethod.ofNew(
                    SubscriptionUpdatePaymentMethodParams.PaymentMethod.New.builder().build()
                )
            )
    }
}
