// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerRequestTest {

    @Test
    fun ofAttachExistingCustomer() {
        val attachExistingCustomer =
            AttachExistingCustomer.builder().customerId("customer_id").build()

        val customerRequest = CustomerRequest.ofAttachExistingCustomer(attachExistingCustomer)

        assertThat(customerRequest.attachExistingCustomer()).isEqualTo(attachExistingCustomer)
        assertThat(customerRequest.newCustomer()).isNull()
    }

    @Test
    fun ofAttachExistingCustomerRoundtrip() {
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
    fun ofNewCustomer() {
        val newCustomer =
            NewCustomer.builder().email("email").name("name").phoneNumber("phone_number").build()

        val customerRequest = CustomerRequest.ofNewCustomer(newCustomer)

        assertThat(customerRequest.attachExistingCustomer()).isNull()
        assertThat(customerRequest.newCustomer()).isEqualTo(newCustomer)
    }

    @Test
    fun ofNewCustomerRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerRequest =
            CustomerRequest.ofNewCustomer(
                NewCustomer.builder()
                    .email("email")
                    .name("name")
                    .phoneNumber("phone_number")
                    .build()
            )

        val roundtrippedCustomerRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRequest),
                jacksonTypeRef<CustomerRequest>(),
            )

        assertThat(roundtrippedCustomerRequest).isEqualTo(customerRequest)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val customerRequest =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<CustomerRequest>())

        val e = assertThrows<DodoPaymentsInvalidDataException> { customerRequest.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
