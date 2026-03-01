// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomFieldResponse
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.subscriptions.AddonCartResponseItem
import com.dodopayments.api.models.subscriptions.CreditEntitlementCartResponse
import com.dodopayments.api.models.subscriptions.MeterCartResponseItem
import com.dodopayments.api.models.subscriptions.MeterCreditEntitlementCartResponse
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdatedWebhookEventTest {

    @Test
    fun create() {
        val subscriptionUpdatedWebhookEvent =
            SubscriptionUpdatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    Subscription.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .addCreditEntitlementCart(
                            CreditEntitlementCartResponse.builder()
                                .creditEntitlementId("credit_entitlement_id")
                                .creditEntitlementName("credit_entitlement_name")
                                .creditsAmount("credits_amount")
                                .overageBalance("overage_balance")
                                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                                .overageEnabled(true)
                                .productId("product_id")
                                .remainingBalance("remaining_balance")
                                .rolloverEnabled(true)
                                .unit("unit")
                                .expiresAfterDays(0)
                                .lowBalanceThresholdPercent(0)
                                .maxRolloverCount(0)
                                .overageLimit("overage_limit")
                                .rolloverPercentage(0)
                                .rolloverTimeframeCount(0)
                                .rolloverTimeframeInterval(TimeInterval.DAY)
                                .build()
                        )
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeterCreditEntitlementCart(
                            MeterCreditEntitlementCartResponse.builder()
                                .creditEntitlementId("credit_entitlement_id")
                                .meterId("meter_id")
                                .meterName("meter_name")
                                .meterUnitsPerCredit("meter_units_per_credit")
                                .productId("product_id")
                                .build()
                        )
                        .addMeter(
                            MeterCartResponseItem.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .description("description")
                                .pricePerUnit("10.50")
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
                        .addCustomFieldResponse(
                            CustomFieldResponse.builder().key("key").value("value").build()
                        )
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionUpdatedWebhookEvent.Type.SUBSCRIPTION_UPDATED)
                .build()

        assertThat(subscriptionUpdatedWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(subscriptionUpdatedWebhookEvent.data())
            .isEqualTo(
                Subscription.builder()
                    .addAddon(
                        AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                    )
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
                    .addCreditEntitlementCart(
                        CreditEntitlementCartResponse.builder()
                            .creditEntitlementId("credit_entitlement_id")
                            .creditEntitlementName("credit_entitlement_name")
                            .creditsAmount("credits_amount")
                            .overageBalance("overage_balance")
                            .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                            .overageEnabled(true)
                            .productId("product_id")
                            .remainingBalance("remaining_balance")
                            .rolloverEnabled(true)
                            .unit("unit")
                            .expiresAfterDays(0)
                            .lowBalanceThresholdPercent(0)
                            .maxRolloverCount(0)
                            .overageLimit("overage_limit")
                            .rolloverPercentage(0)
                            .rolloverTimeframeCount(0)
                            .rolloverTimeframeInterval(TimeInterval.DAY)
                            .build()
                    )
                    .currency(Currency.AED)
                    .customer(
                        CustomerLimitedDetails.builder()
                            .customerId("customer_id")
                            .email("email")
                            .name("name")
                            .metadata(
                                CustomerLimitedDetails.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .metadata(
                        Subscription.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addMeterCreditEntitlementCart(
                        MeterCreditEntitlementCartResponse.builder()
                            .creditEntitlementId("credit_entitlement_id")
                            .meterId("meter_id")
                            .meterName("meter_name")
                            .meterUnitsPerCredit("meter_units_per_credit")
                            .productId("product_id")
                            .build()
                    )
                    .addMeter(
                        MeterCartResponseItem.builder()
                            .currency(Currency.AED)
                            .freeThreshold(0L)
                            .measurementUnit("measurement_unit")
                            .meterId("meter_id")
                            .name("name")
                            .description("description")
                            .pricePerUnit("10.50")
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
                    .addCustomFieldResponse(
                        CustomFieldResponse.builder().key("key").value("value").build()
                    )
                    .discountCyclesRemaining(0)
                    .discountId("discount_id")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .paymentMethodId("payment_method_id")
                    .taxId("tax_id")
                    .build()
            )
        assertThat(subscriptionUpdatedWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionUpdatedWebhookEvent.type())
            .isEqualTo(SubscriptionUpdatedWebhookEvent.Type.SUBSCRIPTION_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionUpdatedWebhookEvent =
            SubscriptionUpdatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    Subscription.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .addCreditEntitlementCart(
                            CreditEntitlementCartResponse.builder()
                                .creditEntitlementId("credit_entitlement_id")
                                .creditEntitlementName("credit_entitlement_name")
                                .creditsAmount("credits_amount")
                                .overageBalance("overage_balance")
                                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                                .overageEnabled(true)
                                .productId("product_id")
                                .remainingBalance("remaining_balance")
                                .rolloverEnabled(true)
                                .unit("unit")
                                .expiresAfterDays(0)
                                .lowBalanceThresholdPercent(0)
                                .maxRolloverCount(0)
                                .overageLimit("overage_limit")
                                .rolloverPercentage(0)
                                .rolloverTimeframeCount(0)
                                .rolloverTimeframeInterval(TimeInterval.DAY)
                                .build()
                        )
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .metadata(
                                    CustomerLimitedDetails.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeterCreditEntitlementCart(
                            MeterCreditEntitlementCartResponse.builder()
                                .creditEntitlementId("credit_entitlement_id")
                                .meterId("meter_id")
                                .meterName("meter_name")
                                .meterUnitsPerCredit("meter_units_per_credit")
                                .productId("product_id")
                                .build()
                        )
                        .addMeter(
                            MeterCartResponseItem.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .description("description")
                                .pricePerUnit("10.50")
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
                        .addCustomFieldResponse(
                            CustomFieldResponse.builder().key("key").value("value").build()
                        )
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodId("payment_method_id")
                        .taxId("tax_id")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionUpdatedWebhookEvent.Type.SUBSCRIPTION_UPDATED)
                .build()

        val roundtrippedSubscriptionUpdatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionUpdatedWebhookEvent),
                jacksonTypeRef<SubscriptionUpdatedWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionUpdatedWebhookEvent)
            .isEqualTo(subscriptionUpdatedWebhookEvent)
    }
}
