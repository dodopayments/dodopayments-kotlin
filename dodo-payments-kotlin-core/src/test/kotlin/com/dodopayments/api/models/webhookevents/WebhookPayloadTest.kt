// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.payments.IntentStatus
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookPayloadTest {

    @Test
    fun create() {
        val webhookPayload =
            WebhookPayload.builder()
                .businessId("business_id")
                .data(
                    WebhookPayload.Data.Payment.builder()
                        .billing(
                            BillingAddress.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .build()
                        )
                        .digitalProductsDelivered(true)
                        .addDispute(
                            Dispute.builder()
                                .amount("amount")
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .disputeId("dispute_id")
                                .disputeStage(DisputeStage.PRE_DISPUTE)
                                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                .paymentId("payment_id")
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(WebhookPayload.Data.Payment.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(WebhookPayload.Type.PAYMENT_SUCCEEDED)
                .build()

        assertThat(webhookPayload.businessId()).isEqualTo("business_id")
        assertThat(webhookPayload.data())
            .isEqualTo(
                WebhookPayload.Data.ofPayment(
                    WebhookPayload.Data.Payment.builder()
                        .billing(
                            BillingAddress.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .build()
                        )
                        .digitalProductsDelivered(true)
                        .addDispute(
                            Dispute.builder()
                                .amount("amount")
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .disputeId("dispute_id")
                                .disputeStage(DisputeStage.PRE_DISPUTE)
                                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                .paymentId("payment_id")
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(WebhookPayload.Data.Payment.PayloadType.PAYMENT)
                        .build()
                )
            )
        assertThat(webhookPayload.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(webhookPayload.type()).isEqualTo(WebhookPayload.Type.PAYMENT_SUCCEEDED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookPayload =
            WebhookPayload.builder()
                .businessId("business_id")
                .data(
                    WebhookPayload.Data.Payment.builder()
                        .billing(
                            BillingAddress.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .build()
                        )
                        .digitalProductsDelivered(true)
                        .addDispute(
                            Dispute.builder()
                                .amount("amount")
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency("currency")
                                .disputeId("dispute_id")
                                .disputeStage(DisputeStage.PRE_DISPUTE)
                                .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                                .paymentId("payment_id")
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(WebhookPayload.Data.Payment.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(WebhookPayload.Type.PAYMENT_SUCCEEDED)
                .build()

        val roundtrippedWebhookPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookPayload),
                jacksonTypeRef<WebhookPayload>(),
            )

        assertThat(roundtrippedWebhookPayload).isEqualTo(webhookPayload)
    }
}
