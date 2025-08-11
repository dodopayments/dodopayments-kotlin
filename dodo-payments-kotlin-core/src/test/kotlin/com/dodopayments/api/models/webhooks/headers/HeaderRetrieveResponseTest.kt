// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks.headers

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HeaderRetrieveResponseTest {

    @Test
    fun create() {
        val headerRetrieveResponse =
            HeaderRetrieveResponse.builder()
                .headers(
                    HeaderRetrieveResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addSensitive("string")
                .build()

        assertThat(headerRetrieveResponse.headers())
            .isEqualTo(
                HeaderRetrieveResponse.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(headerRetrieveResponse.sensitive()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val headerRetrieveResponse =
            HeaderRetrieveResponse.builder()
                .headers(
                    HeaderRetrieveResponse.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addSensitive("string")
                .build()

        val roundtrippedHeaderRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(headerRetrieveResponse),
                jacksonTypeRef<HeaderRetrieveResponse>(),
            )

        assertThat(roundtrippedHeaderRetrieveResponse).isEqualTo(headerRetrieveResponse)
    }
}
