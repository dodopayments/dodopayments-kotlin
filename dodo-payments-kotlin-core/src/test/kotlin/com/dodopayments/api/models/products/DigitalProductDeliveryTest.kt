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
                .addFile(
                    DigitalProductDeliveryFile.builder()
                        .downloadUrl("download_url")
                        .expiresIn(0L)
                        .fileId("file_id")
                        .filename("filename")
                        .contentType("content_type")
                        .fileSize(0L)
                        .build()
                )
                .externalUrl("external_url")
                .instructions("instructions")
                .build()

        assertThat(digitalProductDelivery.files())
            .containsExactly(
                DigitalProductDeliveryFile.builder()
                    .downloadUrl("download_url")
                    .expiresIn(0L)
                    .fileId("file_id")
                    .filename("filename")
                    .contentType("content_type")
                    .fileSize(0L)
                    .build()
            )
        assertThat(digitalProductDelivery.externalUrl()).isEqualTo("external_url")
        assertThat(digitalProductDelivery.instructions()).isEqualTo("instructions")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalProductDelivery =
            DigitalProductDelivery.builder()
                .addFile(
                    DigitalProductDeliveryFile.builder()
                        .downloadUrl("download_url")
                        .expiresIn(0L)
                        .fileId("file_id")
                        .filename("filename")
                        .contentType("content_type")
                        .fileSize(0L)
                        .build()
                )
                .externalUrl("external_url")
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
