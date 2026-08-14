// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListResponseTest {

    @Test
    fun create() {
        val subscriptionListResponse =
            SubscriptionListResponse.builder()
                .billing(
                    BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
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
                        .metadata(
                            Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .addDiscount(
                    SubscriptionListResponse.Discount.builder()
                        .discountId("discount_id")
                        .discountCyclesRemaining(0)
                        .build()
                )
                .metadata(
                    Metadata.builder()
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
                .customerBusinessName("customer_business_name")
                .discountCyclesRemaining(0)
                .discountId("discount_id")
                .pausedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentMethodId("payment_method_id")
                .productName("product_name")
                .scheduledChange(
                    ScheduledPlanChange.builder()
                        .id("id")
                        .addAddon(
                            ScheduledPlanChange.Addon.builder()
                                .addonId("addon_id")
                                .name("name")
                                .quantity(0)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .productDescription("product_description")
                        .productName("product_name")
                        .build()
                )
                .taxId("tax_id")
                .trialAmount(0)
                .build()

        assertThat(subscriptionListResponse.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(subscriptionListResponse.cancelAtNextBillingDate()).isEqualTo(true)
        assertThat(subscriptionListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.currency()).isEqualTo(Currency.AED)
        assertThat(subscriptionListResponse.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .metadata(
                        Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .phoneNumber("phone_number")
                    .build()
            )
        assertThat(subscriptionListResponse.discounts())
            .containsExactly(
                SubscriptionListResponse.Discount.builder()
                    .discountId("discount_id")
                    .discountCyclesRemaining(0)
                    .build()
            )
        assertThat(subscriptionListResponse.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(subscriptionListResponse.nextBillingDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.onDemand()).isEqualTo(true)
        assertThat(subscriptionListResponse.paymentFrequencyCount()).isEqualTo(0)
        assertThat(subscriptionListResponse.paymentFrequencyInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(subscriptionListResponse.previousBillingDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.productId()).isEqualTo("product_id")
        assertThat(subscriptionListResponse.quantity()).isEqualTo(0)
        assertThat(subscriptionListResponse.recurringPreTaxAmount()).isEqualTo(0)
        assertThat(subscriptionListResponse.status()).isEqualTo(SubscriptionStatus.PENDING)
        assertThat(subscriptionListResponse.subscriptionId()).isEqualTo("subscription_id")
        assertThat(subscriptionListResponse.subscriptionPeriodCount()).isEqualTo(0)
        assertThat(subscriptionListResponse.subscriptionPeriodInterval())
            .isEqualTo(TimeInterval.DAY)
        assertThat(subscriptionListResponse.taxInclusive()).isEqualTo(true)
        assertThat(subscriptionListResponse.trialPeriodDays()).isEqualTo(0)
        assertThat(subscriptionListResponse.cancelledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.customerBusinessName())
            .isEqualTo("customer_business_name")
        assertThat(subscriptionListResponse.discountCyclesRemaining()).isEqualTo(0)
        assertThat(subscriptionListResponse.discountId()).isEqualTo("discount_id")
        assertThat(subscriptionListResponse.pausedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListResponse.paymentMethodId()).isEqualTo("payment_method_id")
        assertThat(subscriptionListResponse.productName()).isEqualTo("product_name")
        assertThat(subscriptionListResponse.scheduledChange())
            .isEqualTo(
                ScheduledPlanChange.builder()
                    .id("id")
                    .addAddon(
                        ScheduledPlanChange.Addon.builder()
                            .addonId("addon_id")
                            .name("name")
                            .quantity(0)
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .productId("product_id")
                    .quantity(0)
                    .productDescription("product_description")
                    .productName("product_name")
                    .build()
            )
        assertThat(subscriptionListResponse.taxId()).isEqualTo("tax_id")
        assertThat(subscriptionListResponse.trialAmount()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionListResponse =
            SubscriptionListResponse.builder()
                .billing(
                    BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
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
                        .metadata(
                            Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .phoneNumber("phone_number")
                        .build()
                )
                .addDiscount(
                    SubscriptionListResponse.Discount.builder()
                        .discountId("discount_id")
                        .discountCyclesRemaining(0)
                        .build()
                )
                .metadata(
                    Metadata.builder()
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
                .customerBusinessName("customer_business_name")
                .discountCyclesRemaining(0)
                .discountId("discount_id")
                .pausedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentMethodId("payment_method_id")
                .productName("product_name")
                .scheduledChange(
                    ScheduledPlanChange.builder()
                        .id("id")
                        .addAddon(
                            ScheduledPlanChange.Addon.builder()
                                .addonId("addon_id")
                                .name("name")
                                .quantity(0)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .productDescription("product_description")
                        .productName("product_name")
                        .build()
                )
                .taxId("tax_id")
                .trialAmount(0)
                .build()

        val roundtrippedSubscriptionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionListResponse),
                jacksonTypeRef<SubscriptionListResponse>(),
            )

        assertThat(roundtrippedSubscriptionListResponse).isEqualTo(subscriptionListResponse)
    }
}
