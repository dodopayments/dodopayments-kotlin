// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundTest {

    @Test
    fun create() {
        val refund =
            Refund.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .isPartial(true)
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .refundId("refund_id")
                .status(RefundStatus.SUCCEEDED)
                .amount(0)
                .currency(Currency.AED)
                .reason("reason")
                .build()

        assertThat(refund.brandId()).isEqualTo("brand_id")
        assertThat(refund.businessId()).isEqualTo("business_id")
        assertThat(refund.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(refund.customer())
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
        assertThat(refund.isPartial()).isEqualTo(true)
        assertThat(refund.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(refund.paymentId()).isEqualTo("payment_id")
        assertThat(refund.refundId()).isEqualTo("refund_id")
        assertThat(refund.status()).isEqualTo(RefundStatus.SUCCEEDED)
        assertThat(refund.amount()).isEqualTo(0)
        assertThat(refund.currency()).isEqualTo(Currency.AED)
        assertThat(refund.reason()).isEqualTo("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refund =
            Refund.builder()
                .brandId("brand_id")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .isPartial(true)
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .refundId("refund_id")
                .status(RefundStatus.SUCCEEDED)
                .amount(0)
                .currency(Currency.AED)
                .reason("reason")
                .build()

        val roundtrippedRefund =
            jsonMapper.readValue(jsonMapper.writeValueAsString(refund), jacksonTypeRef<Refund>())

        assertThat(roundtrippedRefund).isEqualTo(refund)
    }
}
