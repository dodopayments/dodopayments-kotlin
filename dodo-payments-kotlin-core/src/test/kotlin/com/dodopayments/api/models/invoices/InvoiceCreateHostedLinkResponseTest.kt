// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceCreateHostedLinkResponseTest {

    @Test
    fun create() {
        val invoiceCreateHostedLinkResponse =
            InvoiceCreateHostedLinkResponse.builder()
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hostedUrl("hosted_url")
                .build()

        assertThat(invoiceCreateHostedLinkResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceCreateHostedLinkResponse.hostedUrl()).isEqualTo("hosted_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceCreateHostedLinkResponse =
            InvoiceCreateHostedLinkResponse.builder()
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hostedUrl("hosted_url")
                .build()

        val roundtrippedInvoiceCreateHostedLinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceCreateHostedLinkResponse),
                jacksonTypeRef<InvoiceCreateHostedLinkResponse>(),
            )

        assertThat(roundtrippedInvoiceCreateHostedLinkResponse)
            .isEqualTo(invoiceCreateHostedLinkResponse)
    }
}
