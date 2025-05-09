// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services

import com.dodopayments.api.client.DodoPaymentsClient
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.BadRequestException
import com.dodopayments.api.errors.DodoPaymentsException
import com.dodopayments.api.errors.InternalServerException
import com.dodopayments.api.errors.NotFoundException
import com.dodopayments.api.errors.PermissionDeniedException
import com.dodopayments.api.errors.RateLimitException
import com.dodopayments.api.errors.UnauthorizedException
import com.dodopayments.api.errors.UnexpectedStatusCodeException
import com.dodopayments.api.errors.UnprocessableEntityException
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.OneTimeProductCartItem
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: DodoPaymentsClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
    }

    @Test
    fun paymentsCreate400() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun paymentsCreate401() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun paymentsCreate403() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun paymentsCreate404() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun paymentsCreate422() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun paymentsCreate429() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun paymentsCreate500() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun paymentsCreate999() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun paymentsCreateInvalidJsonBody() {
        val paymentService = client.payments()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<DodoPaymentsException> {
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
                        .customer(
                            AttachExistingCustomer.builder().customerId("customer_id").build()
                        )
                        .addProductCart(
                            OneTimeProductCartItem.builder()
                                .productId("product_id")
                                .quantity(0)
                                .amount(0)
                                .build()
                        )
                        .addAllowedPaymentMethodType(
                            PaymentCreateParams.AllowedPaymentMethodType.CREDIT
                        )
                        .billingCurrency(Currency.AED)
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
