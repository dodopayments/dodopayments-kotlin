// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.AttachExistingCustomer
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.OneTimeProductCartItem
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentService = client.payments()

        val payment =
            paymentService.create(
                PaymentCreateParams.builder()
                    .billing(
                        BillingAddress.builder()
                            .city("city")
                            .country(CountryCode.AF)
                            .state("state")
                            .street("street")
                            .zipcode("zipcode")
                            .build()
                    )
                    .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                    .addProductCart(
                        OneTimeProductCartItem.builder()
                            .productId("product_id")
                            .quantity(0L)
                            .amount(0L)
                            .build()
                    )
                    .addAllowedPaymentMethodType(
                        PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                    )
                    .billingCurrency(PaymentCreateParams.BillingCurrency.AED)
                    .discountCode("discount_code")
                    .metadata(
                        PaymentCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentLink(true)
                    .returnUrl("return_url")
                    .showSavedPaymentMethods(true)
                    .taxId("tax_id")
                    .build()
            )

        payment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentService = client.payments()

        val payment =
            paymentService.retrieve(PaymentRetrieveParams.builder().paymentId("payment_id").build())

        payment.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentService = client.payments()

        val page = paymentService.list()

        page.response().validate()
    }
}
