// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.models.invoices.CollectionMethod
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionStartTrialParamsTest {

    @Test
    fun create() {
        SubscriptionStartTrialParams.builder()
            .idempotencyKey("Idempotency-Key")
            .collectionMethod(CollectionMethod.AUTO_CHARGE)
            .currency(Currency.AED)
            .customerId("customer_id")
            .productId("product_id")
            .billingAddress(
                SubscriptionStartTrialParams.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .paymentMethodId("payment_method_id")
            .paymentTermsDueOnReceipt()
            .quantity(0)
            .reviewRequired(true)
            .taxId("tax_id")
            .trialPeriodDays(0)
            .build()
    }

    @Test
    fun headers() {
        val params =
            SubscriptionStartTrialParams.builder()
                .idempotencyKey("Idempotency-Key")
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .productId("product_id")
                .billingAddress(
                    SubscriptionStartTrialParams.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .paymentMethodId("payment_method_id")
                .paymentTermsDueOnReceipt()
                .quantity(0)
                .reviewRequired(true)
                .taxId("tax_id")
                .trialPeriodDays(0)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "Idempotency-Key").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SubscriptionStartTrialParams.builder()
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .productId("product_id")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SubscriptionStartTrialParams.builder()
                .idempotencyKey("Idempotency-Key")
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .productId("product_id")
                .billingAddress(
                    SubscriptionStartTrialParams.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .paymentMethodId("payment_method_id")
                .paymentTermsDueOnReceipt()
                .quantity(0)
                .reviewRequired(true)
                .taxId("tax_id")
                .trialPeriodDays(0)
                .build()

        val body = params._body()

        assertThat(body.collectionMethod()).isEqualTo(CollectionMethod.AUTO_CHARGE)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.billingAddress())
            .isEqualTo(
                SubscriptionStartTrialParams.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.paymentMethodId()).isEqualTo("payment_method_id")
        assertThat(body.paymentTerms())
            .isEqualTo(SubscriptionStartTrialParams.PaymentTerms.ofDueOnReceipt())
        assertThat(body.quantity()).isEqualTo(0)
        assertThat(body.reviewRequired()).isEqualTo(true)
        assertThat(body.taxId()).isEqualTo("tax_id")
        assertThat(body.trialPeriodDays()).isEqualTo(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionStartTrialParams.builder()
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .productId("product_id")
                .build()

        val body = params._body()

        assertThat(body.collectionMethod()).isEqualTo(CollectionMethod.AUTO_CHARGE)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.productId()).isEqualTo("product_id")
    }
}
