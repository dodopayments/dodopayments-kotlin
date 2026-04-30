// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadParamsTest {

    @Test
    fun create() {
        FileUploadParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = FileUploadParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
