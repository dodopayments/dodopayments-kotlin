// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalProductDeliveryTest {

    @Test
    fun create() {
        val digitalProductDelivery =
            DigitalProductDelivery.builder()
                .externalUrl("external_url")
                .addFile(
                    DigitalProductDeliveryFile.builder()
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fileName("file_name")
                        .url("url")
                        .build()
                )
                .instructions("instructions")
                .build()

        assertThat(digitalProductDelivery.externalUrl()).isEqualTo("external_url")
        assertThat(digitalProductDelivery.files())
            .containsExactly(
                DigitalProductDeliveryFile.builder()
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileName("file_name")
                    .url("url")
                    .build()
            )
        assertThat(digitalProductDelivery.instructions()).isEqualTo("instructions")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalProductDelivery =
            DigitalProductDelivery.builder()
                .externalUrl("external_url")
                .addFile(
                    DigitalProductDeliveryFile.builder()
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fileName("file_name")
                        .url("url")
                        .build()
                )
                .instructions("instructions")
                .build()

        val roundtrippedDigitalProductDelivery =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalProductDelivery),
                jacksonTypeRef<DigitalProductDelivery>(),
            )

        assertThat(roundtrippedDigitalProductDelivery).isEqualTo(digitalProductDelivery)
    }
}
