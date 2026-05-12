// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateParamsTest {

    @Test
    fun create() {
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
            .discountCode("discount_code")
            .addDiscountCode("string")
            .force3ds(true)
            .metadata(
                PaymentCreateParams.Metadata.builder()
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
    }

    @Test
    fun body() {
        val params =
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
                .discountCode("discount_code")
                .addDiscountCode("string")
                .force3ds(true)
                .metadata(
                    PaymentCreateParams.Metadata.builder()
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

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
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
            .containsExactly(
                OneTimeProductCartItem.builder()
                    .productId("product_id")
                    .quantity(0)
                    .amount(0)
                    .build()
            )
        assertThat(body.adaptiveCurrencyFeesInclusive()).isEqualTo(true)
        assertThat(body.allowedPaymentMethodTypes()).containsExactly(PaymentMethodTypes.ACH)
        assertThat(body.billingCurrency()).isEqualTo(Currency.AED)
        assertThat(body.discountCode()).isEqualTo("discount_code")
        assertThat(body.discountCodes()).containsExactly("string")
        assertThat(body.force3ds()).isEqualTo(true)
        assertThat(body.metadata())
            .isEqualTo(
                PaymentCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.paymentLink()).isEqualTo(true)
        assertThat(body.paymentMethodId()).isEqualTo("payment_method_id")
        assertThat(body.redirectImmediately()).isEqualTo(true)
        assertThat(body.requirePhoneNumber()).isEqualTo(true)
        assertThat(body.returnUrl()).isEqualTo("return_url")
        assertThat(body.shortLink()).isEqualTo(true)
        assertThat(body.showSavedPaymentMethods()).isEqualTo(true)
        assertThat(body.taxId()).isEqualTo("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentCreateParams.builder()
                .billing(BillingAddress.builder().country(CountryCode.AF).build())
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .addProductCart(
                    OneTimeProductCartItem.builder().productId("product_id").quantity(0).build()
                )
                .build()

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(BillingAddress.builder().country(CountryCode.AF).build())
        assertThat(body.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(body.productCart())
            .containsExactly(
                OneTimeProductCartItem.builder().productId("product_id").quantity(0).build()
            )
    }
}
