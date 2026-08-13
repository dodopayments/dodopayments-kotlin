// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.BillingAddress
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdateParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateParams.builder()
            .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
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
            .cancelReason(SubscriptionUpdateParams.CancelReason.CANCELLED_BY_CUSTOMER)
            .cancellationComment("cancellation_comment")
            .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
            .addCreditEntitlementCart(
                SubscriptionUpdateParams.CreditEntitlementCart.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .creditsAmount("credits_amount")
                    .expiresAfterDays(0)
                    .lowBalanceThresholdPercent(0)
                    .maxRolloverCount(0)
                    .overageEnabled(true)
                    .overageLimit("overage_limit")
                    .rolloverEnabled(true)
                    .rolloverPercentage(0)
                    .rolloverTimeframeCount(0)
                    .rolloverTimeframeInterval(TimeInterval.DAY)
                    .build()
            )
            .customerBusinessName("customer_business_name")
            .customerName("customer_name")
            .disableOnDemand(
                SubscriptionUpdateParams.DisableOnDemand.builder()
                    .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .metadata(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .pause(true)
            .status(SubscriptionStatus.PENDING)
            .subscriptionPeriodCount(0)
            .subscriptionPeriodInterval(TimeInterval.DAY)
            .taxId("tax_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionUpdateParams.builder().subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv").build()

        assertThat(params._pathParam(0)).isEqualTo("sub_Iuaq622bbmmfOGrVTqdXv")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateParams.builder()
                .subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv")
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
                .cancelReason(SubscriptionUpdateParams.CancelReason.CANCELLED_BY_CUSTOMER)
                .cancellationComment("cancellation_comment")
                .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
                .addCreditEntitlementCart(
                    SubscriptionUpdateParams.CreditEntitlementCart.builder()
                        .creditEntitlementId("credit_entitlement_id")
                        .creditsAmount("credits_amount")
                        .expiresAfterDays(0)
                        .lowBalanceThresholdPercent(0)
                        .maxRolloverCount(0)
                        .overageEnabled(true)
                        .overageLimit("overage_limit")
                        .rolloverEnabled(true)
                        .rolloverPercentage(0)
                        .rolloverTimeframeCount(0)
                        .rolloverTimeframeInterval(TimeInterval.DAY)
                        .build()
                )
                .customerBusinessName("customer_business_name")
                .customerName("customer_name")
                .disableOnDemand(
                    SubscriptionUpdateParams.DisableOnDemand.builder()
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pause(true)
                .status(SubscriptionStatus.PENDING)
                .subscriptionPeriodCount(0)
                .subscriptionPeriodInterval(TimeInterval.DAY)
                .taxId("tax_id")
                .build()

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.cancelAtNextBillingDate()).isEqualTo(true)
        assertThat(body.cancelReason())
            .isEqualTo(SubscriptionUpdateParams.CancelReason.CANCELLED_BY_CUSTOMER)
        assertThat(body.cancellationComment()).isEqualTo("cancellation_comment")
        assertThat(body.cancellationFeedback()).isEqualTo(CancellationFeedback.TOO_EXPENSIVE)
        assertThat(body.creditEntitlementCart())
            .containsExactly(
                SubscriptionUpdateParams.CreditEntitlementCart.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .creditsAmount("credits_amount")
                    .expiresAfterDays(0)
                    .lowBalanceThresholdPercent(0)
                    .maxRolloverCount(0)
                    .overageEnabled(true)
                    .overageLimit("overage_limit")
                    .rolloverEnabled(true)
                    .rolloverPercentage(0)
                    .rolloverTimeframeCount(0)
                    .rolloverTimeframeInterval(TimeInterval.DAY)
                    .build()
            )
        assertThat(body.customerBusinessName()).isEqualTo("customer_business_name")
        assertThat(body.customerName()).isEqualTo("customer_name")
        assertThat(body.disableOnDemand())
            .isEqualTo(
                SubscriptionUpdateParams.DisableOnDemand.builder()
                    .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(body.nextBillingDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.pause()).isEqualTo(true)
        assertThat(body.status()).isEqualTo(SubscriptionStatus.PENDING)
        assertThat(body.subscriptionPeriodCount()).isEqualTo(0)
        assertThat(body.subscriptionPeriodInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(body.taxId()).isEqualTo("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionUpdateParams.builder().subscriptionId("sub_Iuaq622bbmmfOGrVTqdXv").build()

        val body = params._body()
    }
}
