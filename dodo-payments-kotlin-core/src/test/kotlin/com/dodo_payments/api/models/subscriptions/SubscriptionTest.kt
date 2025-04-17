// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.CustomerLimitedDetails
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionTest {

    @Test
    fun createSubscription() {
        val subscription =
            Subscription.builder()
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Subscription.Currency.AED)
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .metadata(
                    Subscription.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentFrequencyCount(0L)
                .paymentFrequencyInterval(TimeInterval.DAY)
                .productId("product_id")
                .quantity(0L)
                .recurringPreTaxAmount(0L)
                .status(SubscriptionStatus.PENDING)
                .subscriptionId("subscription_id")
                .subscriptionPeriodCount(0L)
                .subscriptionPeriodInterval(TimeInterval.DAY)
                .taxInclusive(true)
                .trialPeriodDays(0L)
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountId("discount_id")
                .build()
        assertThat(subscription).isNotNull
        assertThat(subscription.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(subscription.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.currency()).isEqualTo(Subscription.Currency.AED)
        assertThat(subscription.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(subscription.metadata())
            .isEqualTo(
                Subscription.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(subscription.nextBillingDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.paymentFrequencyCount()).isEqualTo(0L)
        assertThat(subscription.paymentFrequencyInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(subscription.productId()).isEqualTo("product_id")
        assertThat(subscription.quantity()).isEqualTo(0L)
        assertThat(subscription.recurringPreTaxAmount()).isEqualTo(0L)
        assertThat(subscription.status()).isEqualTo(SubscriptionStatus.PENDING)
        assertThat(subscription.subscriptionId()).isEqualTo("subscription_id")
        assertThat(subscription.subscriptionPeriodCount()).isEqualTo(0L)
        assertThat(subscription.subscriptionPeriodInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(subscription.taxInclusive()).isEqualTo(true)
        assertThat(subscription.trialPeriodDays()).isEqualTo(0L)
        assertThat(subscription.cancelledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.discountId()).isEqualTo("discount_id")
    }
}
