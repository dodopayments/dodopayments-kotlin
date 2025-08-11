// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTest {

    @Test
    fun create() {
        val subscription =
            Subscription.builder()
                .addAddon(AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build())
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .cancelAtNextBillingDate(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
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
                .onDemand(true)
                .paymentFrequencyCount(0)
                .paymentFrequencyInterval(TimeInterval.DAY)
                .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .productId("product_id")
                .quantity(0)
                .recurringPreTaxAmount(0)
                .status(SubscriptionStatus.PENDING)
                .subscriptionId("subscription_id")
                .subscriptionPeriodCount(0)
                .subscriptionPeriodInterval(TimeInterval.DAY)
                .taxInclusive(true)
                .trialPeriodDays(0)
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountCyclesRemaining(0)
                .discountId("discount_id")
                .build()

        assertThat(subscription.addons())
            .containsExactly(
                AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
            )
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
        assertThat(subscription.cancelAtNextBillingDate()).isEqualTo(true)
        assertThat(subscription.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.currency()).isEqualTo(Currency.AED)
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
        assertThat(subscription.onDemand()).isEqualTo(true)
        assertThat(subscription.paymentFrequencyCount()).isEqualTo(0)
        assertThat(subscription.paymentFrequencyInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(subscription.previousBillingDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.productId()).isEqualTo("product_id")
        assertThat(subscription.quantity()).isEqualTo(0)
        assertThat(subscription.recurringPreTaxAmount()).isEqualTo(0)
        assertThat(subscription.status()).isEqualTo(SubscriptionStatus.PENDING)
        assertThat(subscription.subscriptionId()).isEqualTo("subscription_id")
        assertThat(subscription.subscriptionPeriodCount()).isEqualTo(0)
        assertThat(subscription.subscriptionPeriodInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(subscription.taxInclusive()).isEqualTo(true)
        assertThat(subscription.trialPeriodDays()).isEqualTo(0)
        assertThat(subscription.cancelledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.discountCyclesRemaining()).isEqualTo(0)
        assertThat(subscription.discountId()).isEqualTo("discount_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscription =
            Subscription.builder()
                .addAddon(AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build())
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .cancelAtNextBillingDate(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
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
                .onDemand(true)
                .paymentFrequencyCount(0)
                .paymentFrequencyInterval(TimeInterval.DAY)
                .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .productId("product_id")
                .quantity(0)
                .recurringPreTaxAmount(0)
                .status(SubscriptionStatus.PENDING)
                .subscriptionId("subscription_id")
                .subscriptionPeriodCount(0)
                .subscriptionPeriodInterval(TimeInterval.DAY)
                .taxInclusive(true)
                .trialPeriodDays(0)
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountCyclesRemaining(0)
                .discountId("discount_id")
                .build()

        val roundtrippedSubscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscription),
                jacksonTypeRef<Subscription>(),
            )

        assertThat(roundtrippedSubscription).isEqualTo(subscription)
    }
}
