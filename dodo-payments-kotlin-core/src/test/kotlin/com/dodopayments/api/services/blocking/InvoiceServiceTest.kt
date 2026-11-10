// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.blocklist.customers.notes.NoteRequest
import com.dodopayments.api.models.invoices.CollectionMethod
import com.dodopayments.api.models.invoices.InvoiceAddNoteParams
import com.dodopayments.api.models.invoices.InvoiceCreateParams
import com.dodopayments.api.models.invoices.InvoiceDeleteParams
import com.dodopayments.api.models.invoices.InvoiceFinalizeParams
import com.dodopayments.api.models.invoices.InvoiceMarkUncollectableParams
import com.dodopayments.api.models.invoices.InvoicePreviewExistingParams
import com.dodopayments.api.models.invoices.InvoicePreviewParams
import com.dodopayments.api.models.invoices.InvoiceRetryParams
import com.dodopayments.api.models.invoices.InvoiceSendParams
import com.dodopayments.api.models.invoices.InvoiceUpdateDunningParams
import com.dodopayments.api.models.invoices.InvoiceUpdateParams
import com.dodopayments.api.models.invoices.InvoiceVoidParams
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.misc.TaxCategory
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class InvoiceServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.create(
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
            )

        invoice.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice = invoiceService.retrieve("invoice_id")

        invoice.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.update(
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
            )

        invoice.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val page = invoiceService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        invoiceService.delete(
            InvoiceDeleteParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
        )
    }

    @Test
    fun addNote() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.addNote(
                InvoiceAddNoteParams.builder()
                    .invoiceId("invoice_id")
                    .noteRequest(NoteRequest.builder().text("text").build())
                    .build()
            )

        invoice.validate()
    }

    @Test
    fun createHostedLink() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val response = invoiceService.createHostedLink("invoice_id")

        response.validate()
    }

    @Test
    fun duplicate() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice = invoiceService.duplicate("invoice_id")

        invoice.validate()
    }

    @Test
    fun finalize() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.finalize(
                InvoiceFinalizeParams.builder()
                    .invoiceId("invoice_id")
                    .ifMatch("If-Match")
                    .addCcEmail("string")
                    .customerEmail("customer_email")
                    .send(true)
                    .build()
            )

        invoice.validate()
    }

    @Test
    fun listEvents() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val response = invoiceService.listEvents("invoice_id")

        response.validate()
    }

    @Test
    fun markUncollectable() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.markUncollectable(
                InvoiceMarkUncollectableParams.builder()
                    .invoiceId("invoice_id")
                    .ifMatch("If-Match")
                    .build()
            )

        invoice.validate()
    }

    @Test
    fun preview(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            invoiceService.preview(
                InvoicePreviewParams.builder()
                    .format(InvoicePreviewParams.Format.JSON)
                    .collectionMethod(CollectionMethod.AUTO_CHARGE)
                    .currency(Currency.AED)
                    .customerId("customer_id")
                    .addItem(
                        InvoicePreviewParams.Item.CustomItem.builder()
                            .description("description")
                            .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                            .unitAmount(0)
                            .quantity(0)
                            .build()
                    )
                    .billingAddress(
                        InvoicePreviewParams.BillingAddress.builder()
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
                        InvoicePreviewParams.Dunning.builder()
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
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun previewExisting(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            invoiceService.previewExisting(
                InvoicePreviewExistingParams.builder()
                    .invoiceId("invoice_id")
                    .format(InvoicePreviewExistingParams.Format.JSON)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun retry() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.retry(
                InvoiceRetryParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
            )

        invoice.validate()
    }

    @Test
    fun send() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.send(
                InvoiceSendParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
            )

        invoice.validate()
    }

    @Test
    fun updateDunning() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.updateDunning(
                InvoiceUpdateDunningParams.builder()
                    .invoiceId("invoice_id")
                    .ifMatch("If-Match")
                    .action(InvoiceUpdateDunningParams.Action.PAUSE)
                    .addOffsetsDay(0)
                    .build()
            )

        invoice.validate()
    }

    @Test
    fun void() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceService = client.invoices()

        val invoice =
            invoiceService.void(
                InvoiceVoidParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
            )

        invoice.validate()
    }
}
