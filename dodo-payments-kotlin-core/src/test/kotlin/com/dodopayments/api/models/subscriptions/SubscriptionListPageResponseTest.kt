// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListPageResponseTest {

    @Test
    fun create() {
        val subscriptionListPageResponse =
            SubscriptionListPageResponse.builder()
                .addItem(
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
                )
                .build()

        assertThat(subscriptionListPageResponse.items())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionListPageResponse =
            SubscriptionListPageResponse.builder()
                .addItem(
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
                )
                .build()

        val roundtrippedSubscriptionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionListPageResponse),
                jacksonTypeRef<SubscriptionListPageResponse>(),
            )

        assertThat(roundtrippedSubscriptionListPageResponse).isEqualTo(subscriptionListPageResponse)
    }
}
