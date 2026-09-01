// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockByCustomerIdTest {

    @Test
    fun create() {
        val blockByCustomerId = BlockByCustomerId.builder().customerId("customer_id").build()

        assertThat(blockByCustomerId.customerId()).isEqualTo("customer_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blockByCustomerId = BlockByCustomerId.builder().customerId("customer_id").build()

        val roundtrippedBlockByCustomerId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockByCustomerId),
                jacksonTypeRef<BlockByCustomerId>(),
            )

        assertThat(roundtrippedBlockByCustomerId).isEqualTo(blockByCustomerId)
    }
}
