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

internal class InvoiceCreateParamsTest {

    @Test
    fun create() {
        InvoiceCreateParams.builder()
            .idempotencyKey("Idempotency-Key")
            .collectionMethod(CollectionMethod.AUTO_CHARGE)
            .currency(Currency.AED)
            .customerId("customer_id")
            .addItem(
                InvoiceCreateParams.Item.CustomItem.builder()
                    .description("description")
                    .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                    .unitAmount(0)
                    .quantity(0)
                    .build()
            )
            .billingAddress(
                InvoiceCreateParams.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .addCcEmail("string")
            .customerEmail("customer_email")
            .addDiscountId("string")
            .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dunning(
                InvoiceCreateParams.Dunning.builder()
                    .remindersEnabled(true)
                    .addOffsetsDay(0)
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
    fun headers() {
        val params =
            InvoiceCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .addItem(
                    InvoiceCreateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .quantity(0)
                        .build()
                )
                .billingAddress(
                    InvoiceCreateParams.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .addCcEmail("string")
                .customerEmail("customer_email")
                .addDiscountId("string")
                .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dunning(
                    InvoiceCreateParams.Dunning.builder()
                        .remindersEnabled(true)
                        .addOffsetsDay(0)
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

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "Idempotency-Key").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            InvoiceCreateParams.builder()
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .addItem(
                    InvoiceCreateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            InvoiceCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .addItem(
                    InvoiceCreateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .quantity(0)
                        .build()
                )
                .billingAddress(
                    InvoiceCreateParams.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .addCcEmail("string")
                .customerEmail("customer_email")
                .addDiscountId("string")
                .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dunning(
                    InvoiceCreateParams.Dunning.builder()
                        .remindersEnabled(true)
                        .addOffsetsDay(0)
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

        assertThat(body.collectionMethod()).isEqualTo(CollectionMethod.AUTO_CHARGE)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.items())
            .containsExactly(
                InvoiceCreateParams.Item.ofCustom(
                    InvoiceCreateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .quantity(0)
                        .build()
                )
            )
        assertThat(body.billingAddress())
            .isEqualTo(
                InvoiceCreateParams.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.ccEmails()).containsExactly("string")
        assertThat(body.customerEmail()).isEqualTo("customer_email")
        assertThat(body.discountIds()).containsExactly("string")
        assertThat(body.dueAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.dunning())
            .isEqualTo(
                InvoiceCreateParams.Dunning.builder()
                    .remindersEnabled(true)
                    .addOffsetsDay(0)
                    .build()
            )
        assertThat(body.memo()).isEqualTo("memo")
        assertThat(body.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(body.paymentTerms()).isEqualTo(InvoiceCreateParams.PaymentTerms.ofDueOnReceipt())
        assertThat(body.reviewRequired()).isEqualTo(true)
        assertThat(body.taxId()).isEqualTo("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceCreateParams.builder()
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .addItem(
                    InvoiceCreateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.collectionMethod()).isEqualTo(CollectionMethod.AUTO_CHARGE)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.items())
            .containsExactly(
                InvoiceCreateParams.Item.ofCustom(
                    InvoiceCreateParams.Item.CustomItem.builder()
                        .description("description")
                        .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                        .unitAmount(0)
                        .build()
                )
            )
    }
}
