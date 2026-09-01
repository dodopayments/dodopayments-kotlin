// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.OneTimeProductCartItem
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.dodopayments.api.models.payments.PaymentMethodTypes
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceAsyncTest {

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
                        BillingAddress.builder()
                            .country(CountryCode.AF)
                            .city("city")
                            .state("state")
                            .street("street")
                            .zipcode("zipcode")
                            .build()
                    )
                    .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                    .addProductCart(
                        OneTimeProductCartItem.builder()
                            .productId("product_id")
                            .quantity(0)
                            .amount(0)
                            .build()
                    )
                    .adaptiveCurrencyFeesInclusive(true)
                    .addAllowedPaymentMethodType(PaymentMethodTypes.ACH)
                    .billingCurrency(Currency.AED)
                    .customerBusinessName("customer_business_name")
                    .discountCode("discount_code")
                    .addDiscountCode("string")
                    .force3ds(true)
                    .metadata(
                        Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentLink(true)
                    .paymentMethodId("payment_method_id")
                    .redirectImmediately(true)
                    .requirePhoneNumber(true)
                    .returnUrl("return_url")
                    .shortLink(true)
                    .showSavedPaymentMethods(true)
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

        val payment = paymentServiceAsync.retrieve("pay_gr4RizvMOXFJ6xca3y2tU")

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

    @Test
    suspend fun retrieveLineItems() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val response = paymentServiceAsync.retrieveLineItems("pay_gr4RizvMOXFJ6xca3y2tU")

        response.validate()
    }

    @Test
    suspend fun retrieveRetryState() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val manualRetryState = paymentServiceAsync.retrieveRetryState("payment_id")

        manualRetryState.validate()
    }

    @Test
    suspend fun retry() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val manualRetry = paymentServiceAsync.retry("payment_id")

        manualRetry.validate()
    }
}
