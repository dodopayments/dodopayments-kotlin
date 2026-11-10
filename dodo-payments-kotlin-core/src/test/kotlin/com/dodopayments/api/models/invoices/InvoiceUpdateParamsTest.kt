// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.misc.TaxCategory
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceUpdateParamsTest {

    @Test
    fun create() {
        InvoiceUpdateParams.builder()
            .invoiceId("invoice_id")
            .ifMatch("If-Match")
            .billingAddress(
                InvoiceUpdateParams.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .addCcEmail("string")
            .collectionMethod(CollectionMethod.AUTO_CHARGE)
            .currency(Currency.AED)
            .customerEmail("customer_email")
            .customerId("customer_id")
            .addDiscountId("string")
            .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dunning(
                InvoiceUpdateParams.Dunning.builder()
                    .remindersEnabled(true)
                    .addOffsetsDay(0)
                    .build()
            )
            .addItem(
                InvoiceUpdateParams.Item.CustomItem.builder()
                    .description("description")
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .unitAmount(0)
                    .quantity(0)
                    .build()
            )
            .memo("memo")
            .metadata(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
            .paymentTermsDueOnReceipt()
            .reviewRequired(true)
            .taxId("tax_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceUpdateParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            InvoiceUpdateParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .billingAddress(
                    InvoiceUpdateParams.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .addCcEmail("string")
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerEmail("customer_email")
                .customerId("customer_id")
                .addDiscountId("string")
                .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dunning(
                    InvoiceUpdateParams.Dunning.builder()
                        .remindersEnabled(true)
                        .addOffsetsDay(0)
                        .build()
                )
                .addItem(
                    InvoiceUpdateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .quantity(0)
                        .build()
                )
                .memo("memo")
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentTermsDueOnReceipt()
                .reviewRequired(true)
                .taxId("tax_id")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("If-Match", "If-Match").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            InvoiceUpdateParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("If-Match", "If-Match").build())
    }

    @Test
    fun body() {
        val params =
            InvoiceUpdateParams.builder()
                .invoiceId("invoice_id")
                .ifMatch("If-Match")
                .billingAddress(
                    InvoiceUpdateParams.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .addCcEmail("string")
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerEmail("customer_email")
                .customerId("customer_id")
                .addDiscountId("string")
                .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dunning(
                    InvoiceUpdateParams.Dunning.builder()
                        .remindersEnabled(true)
                        .addOffsetsDay(0)
                        .build()
                )
                .addItem(
                    InvoiceUpdateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .quantity(0)
                        .build()
                )
                .memo("memo")
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentTermsDueOnReceipt()
                .reviewRequired(true)
                .taxId("tax_id")
                .build()

        val body = params._body()

        assertThat(body.billingAddress())
            .isEqualTo(
                InvoiceUpdateParams.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.ccEmails()).containsExactly("string")
        assertThat(body.collectionMethod()).isEqualTo(CollectionMethod.AUTO_CHARGE)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.customerEmail()).isEqualTo("customer_email")
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.discountIds()).containsExactly("string")
        assertThat(body.dueAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.dunning())
            .isEqualTo(
                InvoiceUpdateParams.Dunning.builder()
                    .remindersEnabled(true)
                    .addOffsetsDay(0)
                    .build()
            )
        assertThat(body.items())
            .containsExactly(
                InvoiceUpdateParams.Item.ofCustom(
                    InvoiceUpdateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .quantity(0)
                        .build()
                )
            )
        assertThat(body.memo()).isEqualTo("memo")
        assertThat(body.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(body.paymentTerms()).isEqualTo(InvoiceUpdateParams.PaymentTerms.ofDueOnReceipt())
        assertThat(body.reviewRequired()).isEqualTo(true)
        assertThat(body.taxId()).isEqualTo("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceUpdateParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()

        val body = params._body()
    }
}
