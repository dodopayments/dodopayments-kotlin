// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.models.misc.CountryCode
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentCreateParamsTest {

    @Test
    fun create() {
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
            .addAllowedPaymentMethodType(PaymentCreateParams.AllowedPaymentMethodType.CREDIT)
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
    }

    @Test
    fun body() {
        val params =
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
                .addAllowedPaymentMethodType(PaymentCreateParams.AllowedPaymentMethodType.CREDIT)
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(body.productCart())
            .isEqualTo(
                listOf(
                    OneTimeProductCartItem.builder()
                        .productId("product_id")
                        .quantity(0L)
                        .amount(0L)
                        .build()
                )
            )
        assertThat(body.allowedPaymentMethodTypes())
            .isEqualTo(listOf(PaymentCreateParams.AllowedPaymentMethodType.CREDIT))
        assertThat(body.billingCurrency()).isEqualTo(PaymentCreateParams.BillingCurrency.AED)
        assertThat(body.discountCode()).isEqualTo("discount_code")
        assertThat(body.metadata())
            .isEqualTo(
                PaymentCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.paymentLink()).isEqualTo(true)
        assertThat(body.returnUrl()).isEqualTo("return_url")
        assertThat(body.showSavedPaymentMethods()).isEqualTo(true)
        assertThat(body.taxId()).isEqualTo("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                    OneTimeProductCartItem.builder().productId("product_id").quantity(0L).build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(body.productCart())
            .isEqualTo(
                listOf(
                    OneTimeProductCartItem.builder().productId("product_id").quantity(0L).build()
                )
            )
    }
}
