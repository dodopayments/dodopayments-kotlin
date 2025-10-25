// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.subscriptions.AddonCartResponseItem
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRenewedWebhookEventTest {

    @Test
    fun create() {
        val subscriptionRenewedWebhookEvent =
            SubscriptionRenewedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionRenewedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
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
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(SubscriptionRenewedWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionRenewedWebhookEvent.Type.SUBSCRIPTION_RENEWED)
                .build()

        assertThat(subscriptionRenewedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(subscriptionRenewedWebhookEvent.data())
            .isEqualTo(
                SubscriptionRenewedWebhookEvent.Data.builder()
                    .addAddon(
                        AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                    )
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
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .metadata(
                        Subscription.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addMeter(
                        Subscription.Meter.builder()
                            .currency(Currency.AED)
                            .freeThreshold(0L)
                            .measurementUnit("measurement_unit")
                            .meterId("meter_id")
                            .name("name")
                            .pricePerUnit("10.50")
                            .description("description")
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
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .taxId("tax_id")
                    .payloadType(SubscriptionRenewedWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                    .build()
            )
        assertThat(subscriptionRenewedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionRenewedWebhookEvent.type())
            .isEqualTo(SubscriptionRenewedWebhookEvent.Type.SUBSCRIPTION_RENEWED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionRenewedWebhookEvent =
            SubscriptionRenewedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionRenewedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
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
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(SubscriptionRenewedWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionRenewedWebhookEvent.Type.SUBSCRIPTION_RENEWED)
                .build()

        val roundtrippedSubscriptionRenewedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionRenewedWebhookEvent),
                jacksonTypeRef<SubscriptionRenewedWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionRenewedWebhookEvent)
            .isEqualTo(subscriptionRenewedWebhookEvent)
    }
}
