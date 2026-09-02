// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.proguard

import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionBillingAddress
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.CustomerRequest
import com.dodopayments.api.models.payments.IntentStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/dodo-payments-kotlin-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = DodoPaymentsOkHttpClient.builder().bearerToken("My Bearer Token").build()

        assertThat(client).isNotNull()
        assertThat(client.checkoutSessions()).isNotNull()
        assertThat(client.payments()).isNotNull()
        assertThat(client.subscriptions()).isNotNull()
        assertThat(client.invoices()).isNotNull()
        assertThat(client.licenses()).isNotNull()
        assertThat(client.licenseKeys()).isNotNull()
        assertThat(client.licenseKeyInstances()).isNotNull()
        assertThat(client.customers()).isNotNull()
        assertThat(client.blocklist()).isNotNull()
        assertThat(client.refunds()).isNotNull()
        assertThat(client.disputes()).isNotNull()
        assertThat(client.payouts()).isNotNull()
        assertThat(client.products()).isNotNull()
        assertThat(client.misc()).isNotNull()
        assertThat(client.discounts()).isNotNull()
        assertThat(client.addons()).isNotNull()
        assertThat(client.brands()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
        assertThat(client.webhookEvents()).isNotNull()
        assertThat(client.usageEvents()).isNotNull()
        assertThat(client.meters()).isNotNull()
        assertThat(client.balances()).isNotNull()
        assertThat(client.creditEntitlements()).isNotNull()
        assertThat(client.entitlements()).isNotNull()
        assertThat(client.productCollections()).isNotNull()
    }

    @Test
    fun checkoutSessionBillingAddressRoundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionBillingAddress =
            CheckoutSessionBillingAddress.builder()
                .country(CountryCode.AF)
                .city("city")
                .state("state")
                .street("street")
                .zipcode("zipcode")
                .build()

        val roundtrippedCheckoutSessionBillingAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionBillingAddress),
                jacksonTypeRef<CheckoutSessionBillingAddress>(),
            )

        assertThat(roundtrippedCheckoutSessionBillingAddress)
            .isEqualTo(checkoutSessionBillingAddress)
    }

    @Test
    fun customerRequestRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerRequest =
            CustomerRequest.ofAttachExistingCustomer(
                AttachExistingCustomer.builder().customerId("customer_id").build()
            )

        val roundtrippedCustomerRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRequest),
                jacksonTypeRef<CustomerRequest>(),
            )

        assertThat(roundtrippedCustomerRequest).isEqualTo(customerRequest)
    }

    @Test
    fun intentStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val intentStatus = IntentStatus.SUCCEEDED

        val roundtrippedIntentStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intentStatus),
                jacksonTypeRef<IntentStatus>(),
            )

        assertThat(roundtrippedIntentStatus).isEqualTo(intentStatus)
    }
}
