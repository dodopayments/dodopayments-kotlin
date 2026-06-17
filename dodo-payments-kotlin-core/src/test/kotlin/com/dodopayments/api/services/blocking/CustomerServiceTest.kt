// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.customers.CustomerCreateParams
import com.dodopayments.api.models.customers.CustomerDeletePaymentMethodParams
import com.dodopayments.api.models.customers.CustomerUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()

        val customer =
            customerService.create(
                CustomerCreateParams.builder()
                    .email("email")
                    .name("name")
                    .metadata(
                        CustomerCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .phoneNumber("phone_number")
                    .build()
            )

        customer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()

        val customer = customerService.retrieve("cus_TV52uJWWXt2yIoBBxpjaa")

        customer.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()

        val customer =
            customerService.update(
                CustomerUpdateParams.builder()
                    .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                    .email("email")
                    .metadata(
                        CustomerUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .phoneNumber("phone_number")
                    .build()
            )

        customer.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()

        val page = customerService.list()

        page.response().validate()
    }

    @Test
    fun deletePaymentMethod() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()

        customerService.deletePaymentMethod(
            CustomerDeletePaymentMethodParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .paymentMethodId("payment_method_id")
                .build()
        )
    }

    @Test
    fun listCreditEntitlements() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()

        val response = customerService.listCreditEntitlements("cus_TV52uJWWXt2yIoBBxpjaa")

        response.validate()
    }

    @Test
    fun listEntitlements() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()

        val response = customerService.listEntitlements("cus_TV52uJWWXt2yIoBBxpjaa")

        response.validate()
    }

    @Test
    fun retrievePaymentMethods() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()

        val response = customerService.retrievePaymentMethods("cus_TV52uJWWXt2yIoBBxpjaa")

        response.validate()
    }
}
