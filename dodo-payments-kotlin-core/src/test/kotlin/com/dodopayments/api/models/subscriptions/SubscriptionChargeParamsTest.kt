// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChargeParamsTest {

    @Test
    fun create() {
        SubscriptionChargeParams.builder()
            .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
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
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
                .productPrice(0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("sub_Iuaq622bbmmfOGrVTqdXv")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
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

        val body = params._body()

        assertThat(body.productPrice()).isEqualTo(0)
        assertThat(body.adaptiveCurrencyFeesInclusive()).isEqualTo(true)
        assertThat(body.customerBalanceConfig())
            .isEqualTo(
                SubscriptionChargeParams.CustomerBalanceConfig.builder()
                    .allowCustomerCreditsPurchase(true)
                    .allowCustomerCreditsUsage(true)
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                SubscriptionChargeParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.productCurrency()).isEqualTo(Currency.AED)
        assertThat(body.productDescription()).isEqualTo("product_description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionChargeParams.builder()
                .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
                .productPrice(0)
                .build()

        val body = params._body()

        assertThat(body.productPrice()).isEqualTo(0)
    }
}
