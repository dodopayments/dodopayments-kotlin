// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.files

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadResponseTest {

    @Test
    fun create() {
        val fileUploadResponse = FileUploadResponse.builder().fileId("file_id").build()

        assertThat(fileUploadResponse.fileId()).isEqualTo("file_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileUploadResponse = FileUploadResponse.builder().fileId("file_id").build()

        val roundtrippedFileUploadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileUploadResponse),
                jacksonTypeRef<FileUploadResponse>(),
            )

        assertThat(roundtrippedFileUploadResponse).isEqualTo(fileUploadResponse)
    }
}
