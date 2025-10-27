// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.payments.IntentStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckoutSessionStatusTest {

    @Test
    fun create() {
        val checkoutSessionStatus =
            CheckoutSessionStatus.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerEmail("customer_email")
                .customerName("customer_name")
                .paymentId("payment_id")
                .paymentStatus(IntentStatus.SUCCEEDED)
                .build()

        assertThat(checkoutSessionStatus.id()).isEqualTo("id")
        assertThat(checkoutSessionStatus.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(checkoutSessionStatus.customerEmail()).isEqualTo("customer_email")
        assertThat(checkoutSessionStatus.customerName()).isEqualTo("customer_name")
        assertThat(checkoutSessionStatus.paymentId()).isEqualTo("payment_id")
        assertThat(checkoutSessionStatus.paymentStatus()).isEqualTo(IntentStatus.SUCCEEDED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionStatus =
            CheckoutSessionStatus.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerEmail("customer_email")
                .customerName("customer_name")
                .paymentId("payment_id")
                .paymentStatus(IntentStatus.SUCCEEDED)
                .build()

        val roundtrippedCheckoutSessionStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionStatus),
                jacksonTypeRef<CheckoutSessionStatus>(),
            )

        assertThat(roundtrippedCheckoutSessionStatus).isEqualTo(checkoutSessionStatus)
    }
}
