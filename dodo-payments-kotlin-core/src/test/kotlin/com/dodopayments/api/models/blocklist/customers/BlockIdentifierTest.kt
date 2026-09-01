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

internal class BlockIdentifierTest {

    @Test
    fun ofByCustomerId() {
        val byCustomerId = BlockByCustomerId.builder().customerId("customer_id").build()

        val blockIdentifier = BlockIdentifier.ofByCustomerId(byCustomerId)

        assertThat(blockIdentifier.byCustomerId()).isEqualTo(byCustomerId)
        assertThat(blockIdentifier.byEmail()).isNull()
    }

    @Test
    fun ofByCustomerIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val blockIdentifier =
            BlockIdentifier.ofByCustomerId(
                BlockByCustomerId.builder().customerId("customer_id").build()
            )

        val roundtrippedBlockIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockIdentifier),
                jacksonTypeRef<BlockIdentifier>(),
            )

        assertThat(roundtrippedBlockIdentifier).isEqualTo(blockIdentifier)
    }

    @Test
    fun ofByEmail() {
        val byEmail = BlockByEmail.builder().email("email").build()

        val blockIdentifier = BlockIdentifier.ofByEmail(byEmail)

        assertThat(blockIdentifier.byCustomerId()).isNull()
        assertThat(blockIdentifier.byEmail()).isEqualTo(byEmail)
    }

    @Test
    fun ofByEmailRoundtrip() {
        val jsonMapper = jsonMapper()
        val blockIdentifier =
            BlockIdentifier.ofByEmail(BlockByEmail.builder().email("email").build())

        val roundtrippedBlockIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockIdentifier),
                jacksonTypeRef<BlockIdentifier>(),
            )

        assertThat(roundtrippedBlockIdentifier).isEqualTo(blockIdentifier)
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
        val blockIdentifier =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<BlockIdentifier>())

        val e = assertThrows<DodoPaymentsInvalidDataException> { blockIdentifier.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
