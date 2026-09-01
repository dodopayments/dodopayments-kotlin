// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CreateBlockedCustomerRequestTest {

    @Test
    fun ofBlocklistCustomersBlockByCustomerId() {
        val blocklistCustomersBlockByCustomerId =
            CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                .customerId("customer_id")
                .reason("reason")
                .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                .build()

        val createBlockedCustomerRequest =
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                blocklistCustomersBlockByCustomerId
            )

        assertThat(createBlockedCustomerRequest.blocklistCustomersBlockByCustomerId())
            .isEqualTo(blocklistCustomersBlockByCustomerId)
        assertThat(createBlockedCustomerRequest.blocklistCustomersBlockByEmail()).isNull()
    }

    @Test
    fun ofBlocklistCustomersBlockByCustomerIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val createBlockedCustomerRequest =
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                    .customerId("customer_id")
                    .reason("reason")
                    .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                    .build()
            )

        val roundtrippedCreateBlockedCustomerRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createBlockedCustomerRequest),
                jacksonTypeRef<CreateBlockedCustomerRequest>(),
            )

        assertThat(roundtrippedCreateBlockedCustomerRequest).isEqualTo(createBlockedCustomerRequest)
    }

    @Test
    fun ofBlocklistCustomersBlockByEmail() {
        val blocklistCustomersBlockByEmail =
            CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail.builder()
                .email("email")
                .reason("reason")
                .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                .build()

        val createBlockedCustomerRequest =
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                blocklistCustomersBlockByEmail
            )

        assertThat(createBlockedCustomerRequest.blocklistCustomersBlockByCustomerId()).isNull()
        assertThat(createBlockedCustomerRequest.blocklistCustomersBlockByEmail())
            .isEqualTo(blocklistCustomersBlockByEmail)
    }

    @Test
    fun ofBlocklistCustomersBlockByEmailRoundtrip() {
        val jsonMapper = jsonMapper()
        val createBlockedCustomerRequest =
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail.builder()
                    .email("email")
                    .reason("reason")
                    .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                    .build()
            )

        val roundtrippedCreateBlockedCustomerRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createBlockedCustomerRequest),
                jacksonTypeRef<CreateBlockedCustomerRequest>(),
            )

        assertThat(roundtrippedCreateBlockedCustomerRequest).isEqualTo(createBlockedCustomerRequest)
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
        val createBlockedCustomerRequest =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<CreateBlockedCustomerRequest>())

        val e =
            assertThrows<DodoPaymentsInvalidDataException> {
                createBlockedCustomerRequest.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
