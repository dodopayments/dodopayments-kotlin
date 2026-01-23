// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrievePaymentMethodsResponseTest {

    @Test
    fun create() {
        val customerRetrievePaymentMethodsResponse =
            CustomerRetrievePaymentMethodsResponse.builder()
                .addItem(
                    CustomerRetrievePaymentMethodsResponse.Item.builder()
                        .paymentMethod(
                            CustomerRetrievePaymentMethodsResponse.Item.PaymentMethod.CARD
                        )
                        .paymentMethodId("payment_method_id")
                        .card(
                            CustomerRetrievePaymentMethodsResponse.Item.Card.builder()
                                .cardHolderName("card_holder_name")
                                .cardIssuingCountry(CountryCode.AF)
                                .cardNetwork("card_network")
                                .cardType("card_type")
                                .expiryMonth("expiry_month")
                                .expiryYear("expiry_year")
                                .last4Digits("last4_digits")
                                .build()
                        )
                        .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodType(PaymentMethodTypes.ACH)
                        .recurringEnabled(true)
                        .build()
                )
                .build()

        assertThat(customerRetrievePaymentMethodsResponse.items())
            .containsExactly(
                CustomerRetrievePaymentMethodsResponse.Item.builder()
                    .paymentMethod(CustomerRetrievePaymentMethodsResponse.Item.PaymentMethod.CARD)
                    .paymentMethodId("payment_method_id")
                    .card(
                        CustomerRetrievePaymentMethodsResponse.Item.Card.builder()
                            .cardHolderName("card_holder_name")
                            .cardIssuingCountry(CountryCode.AF)
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .expiryMonth("expiry_month")
                            .expiryYear("expiry_year")
                            .last4Digits("last4_digits")
                            .build()
                    )
                    .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .paymentMethodType(PaymentMethodTypes.ACH)
                    .recurringEnabled(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerRetrievePaymentMethodsResponse =
            CustomerRetrievePaymentMethodsResponse.builder()
                .addItem(
                    CustomerRetrievePaymentMethodsResponse.Item.builder()
                        .paymentMethod(
                            CustomerRetrievePaymentMethodsResponse.Item.PaymentMethod.CARD
                        )
                        .paymentMethodId("payment_method_id")
                        .card(
                            CustomerRetrievePaymentMethodsResponse.Item.Card.builder()
                                .cardHolderName("card_holder_name")
                                .cardIssuingCountry(CountryCode.AF)
                                .cardNetwork("card_network")
                                .cardType("card_type")
                                .expiryMonth("expiry_month")
                                .expiryYear("expiry_year")
                                .last4Digits("last4_digits")
                                .build()
                        )
                        .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentMethodType(PaymentMethodTypes.ACH)
                        .recurringEnabled(true)
                        .build()
                )
                .build()

        val roundtrippedCustomerRetrievePaymentMethodsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRetrievePaymentMethodsResponse),
                jacksonTypeRef<CustomerRetrievePaymentMethodsResponse>(),
            )

        assertThat(roundtrippedCustomerRetrievePaymentMethodsResponse)
            .isEqualTo(customerRetrievePaymentMethodsResponse)
    }
}
