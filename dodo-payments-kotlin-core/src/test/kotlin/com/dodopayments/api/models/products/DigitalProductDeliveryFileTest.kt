// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalProductDeliveryFileTest {

    @Test
    fun create() {
        val digitalProductDeliveryFile =
            DigitalProductDeliveryFile.builder()
                .downloadUrl("download_url")
                .expiresIn(0L)
                .fileId("file_id")
                .filename("filename")
                .contentType("content_type")
                .fileSize(0L)
                .build()

        assertThat(digitalProductDeliveryFile.downloadUrl()).isEqualTo("download_url")
        assertThat(digitalProductDeliveryFile.expiresIn()).isEqualTo(0L)
        assertThat(digitalProductDeliveryFile.fileId()).isEqualTo("file_id")
        assertThat(digitalProductDeliveryFile.filename()).isEqualTo("filename")
        assertThat(digitalProductDeliveryFile.contentType()).isEqualTo("content_type")
        assertThat(digitalProductDeliveryFile.fileSize()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalProductDeliveryFile =
            DigitalProductDeliveryFile.builder()
                .downloadUrl("download_url")
                .expiresIn(0L)
                .fileId("file_id")
                .filename("filename")
                .contentType("content_type")
                .fileSize(0L)
                .build()

        val roundtrippedDigitalProductDeliveryFile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalProductDeliveryFile),
                jacksonTypeRef<DigitalProductDeliveryFile>(),
            )

        assertThat(roundtrippedDigitalProductDeliveryFile).isEqualTo(digitalProductDeliveryFile)
    }
}
