// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
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
internal class InvoiceServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice = invoiceServiceAsync.retrieve("invoice_id")

        invoice.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.update(
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
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val page = invoiceServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        invoiceServiceAsync.delete(
            InvoiceDeleteParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
        )
    }

    @Test
    suspend fun addNote() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.addNote(
                InvoiceAddNoteParams.builder()
                    .invoiceId("invoice_id")
                    .noteRequest(NoteRequest.builder().text("text").build())
                    .build()
            )

        invoice.validate()
    }

    @Test
    suspend fun createHostedLink() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val response = invoiceServiceAsync.createHostedLink("invoice_id")

        response.validate()
    }

    @Test
    suspend fun duplicate() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice = invoiceServiceAsync.duplicate("invoice_id")

        invoice.validate()
    }

    @Test
    suspend fun finalize() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.finalize(
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
    suspend fun listEvents() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val response = invoiceServiceAsync.listEvents("invoice_id")

        response.validate()
    }

    @Test
    suspend fun markUncollectable() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.markUncollectable(
                InvoiceMarkUncollectableParams.builder()
                    .invoiceId("invoice_id")
                    .ifMatch("If-Match")
                    .build()
            )

        invoice.validate()
    }

    @Test
    suspend fun preview(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            invoiceServiceAsync.preview(
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
    suspend fun previewExisting(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            invoiceServiceAsync.previewExisting(
                InvoicePreviewExistingParams.builder()
                    .invoiceId("invoice_id")
                    .format(InvoicePreviewExistingParams.Format.JSON)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    suspend fun retry() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.retry(
                InvoiceRetryParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
            )

        invoice.validate()
    }

    @Test
    suspend fun send() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.send(
                InvoiceSendParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
            )

        invoice.validate()
    }

    @Test
    suspend fun updateDunning() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.updateDunning(
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
    suspend fun void() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoice =
            invoiceServiceAsync.void(
                InvoiceVoidParams.builder().invoiceId("invoice_id").ifMatch("If-Match").build()
            )

        invoice.validate()
    }
}
