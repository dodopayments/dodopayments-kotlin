// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.models.misc.supportedcountries.CountryCode
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val payment =
            paymentServiceAsync.create(
                PaymentCreateParams.builder()
                    .billing(
                        PaymentCreateParams.Billing.builder()
                            .city("city")
                            .country(CountryCode.AF)
                            .state("state")
                            .street("street")
                            .zipcode("zipcode")
                            .build()
                    )
                    .customer(
                        PaymentCreateParams.Customer.AttachExistingCustomer.builder()
                            .customerId("customer_id")
                            .build()
                    )
                    .addProductCart(
                        PaymentCreateParams.ProductCart.builder()
                            .productId("product_id")
                            .quantity(0L)
                            .amount(0L)
                            .build()
                    )
                    .discountCode("discount_code")
                    .metadata(
                        PaymentCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentLink(true)
                    .returnUrl("return_url")
                    .taxId("tax_id")
                    .build()
            )

        payment.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val payment =
            paymentServiceAsync.retrieve(
                PaymentRetrieveParams.builder().paymentId("payment_id").build()
            )

        payment.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val page = paymentServiceAsync.list()

        page.response().validate()
    }
}
