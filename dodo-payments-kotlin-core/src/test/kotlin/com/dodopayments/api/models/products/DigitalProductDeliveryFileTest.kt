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
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileName("file_name")
                .url("url")
                .build()

        assertThat(digitalProductDeliveryFile.fileId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(digitalProductDeliveryFile.fileName()).isEqualTo("file_name")
        assertThat(digitalProductDeliveryFile.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalProductDeliveryFile =
            DigitalProductDeliveryFile.builder()
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileName("file_name")
                .url("url")
                .build()

        val roundtrippedDigitalProductDeliveryFile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalProductDeliveryFile),
                jacksonTypeRef<DigitalProductDeliveryFile>(),
            )

        assertThat(roundtrippedDigitalProductDeliveryFile).isEqualTo(digitalProductDeliveryFile)
    }
}
