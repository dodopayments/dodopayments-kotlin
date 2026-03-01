// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldResponseTest {

    @Test
    fun create() {
        val customFieldResponse = CustomFieldResponse.builder().key("key").value("value").build()

        assertThat(customFieldResponse.key()).isEqualTo("key")
        assertThat(customFieldResponse.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customFieldResponse = CustomFieldResponse.builder().key("key").value("value").build()

        val roundtrippedCustomFieldResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customFieldResponse),
                jacksonTypeRef<CustomFieldResponse>(),
            )

        assertThat(roundtrippedCustomFieldResponse).isEqualTo(customFieldResponse)
    }
}
