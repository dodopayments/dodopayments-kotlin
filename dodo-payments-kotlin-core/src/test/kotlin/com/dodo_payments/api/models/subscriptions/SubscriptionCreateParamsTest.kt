// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.models.misc.supportedcountries.CountryCode
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .billing(
                SubscriptionCreateParams.Billing.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .customer(
                SubscriptionCreateParams.Customer.AttachExistingCustomer.builder()
                    .customerId("customer_id")
                    .build()
            )
            .productId("product_id")
            .quantity(0L)
            .discountCode("discount_code")
            .metadata(
                SubscriptionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .paymentLink(true)
            .returnUrl("return_url")
            .taxId("tax_id")
            .trialPeriodDays(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .billing(
                    SubscriptionCreateParams.Billing.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .customer(
                    SubscriptionCreateParams.Customer.AttachExistingCustomer.builder()
                        .customerId("customer_id")
                        .build()
                )
                .productId("product_id")
                .quantity(0L)
                .discountCode("discount_code")
                .metadata(
                    SubscriptionCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentLink(true)
                .returnUrl("return_url")
                .taxId("tax_id")
                .trialPeriodDays(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billing())
            .isEqualTo(
                SubscriptionCreateParams.Billing.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.customer())
            .isEqualTo(
                SubscriptionCreateParams.Customer.ofAttachExisting(
                    SubscriptionCreateParams.Customer.AttachExistingCustomer.builder()
                        .customerId("customer_id")
                        .build()
                )
            )
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.quantity()).isEqualTo(0L)
        assertThat(body.discountCode()).isEqualTo("discount_code")
        assertThat(body.metadata())
            .isEqualTo(
                SubscriptionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.paymentLink()).isEqualTo(true)
        assertThat(body.returnUrl()).isEqualTo("return_url")
        assertThat(body.taxId()).isEqualTo("tax_id")
        assertThat(body.trialPeriodDays()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionCreateParams.builder()
                .billing(
                    SubscriptionCreateParams.Billing.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .customer(
                    SubscriptionCreateParams.Customer.AttachExistingCustomer.builder()
                        .customerId("customer_id")
                        .build()
                )
                .productId("product_id")
                .quantity(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billing())
            .isEqualTo(
                SubscriptionCreateParams.Billing.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.customer())
            .isEqualTo(
                SubscriptionCreateParams.Customer.ofAttachExisting(
                    SubscriptionCreateParams.Customer.AttachExistingCustomer.builder()
                        .customerId("customer_id")
                        .build()
                )
            )
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.quantity()).isEqualTo(0L)
    }
}
