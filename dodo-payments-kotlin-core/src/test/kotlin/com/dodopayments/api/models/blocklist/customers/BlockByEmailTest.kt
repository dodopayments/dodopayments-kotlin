// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlockByEmailTest {

    @Test
    fun create() {
        val blockByEmail = BlockByEmail.builder().email("email").build()

        assertThat(blockByEmail.email()).isEqualTo("email")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blockByEmail = BlockByEmail.builder().email("email").build()

        val roundtrippedBlockByEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blockByEmail),
                jacksonTypeRef<BlockByEmail>(),
            )

        assertThat(roundtrippedBlockByEmail).isEqualTo(blockByEmail)
    }
}
