// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileDeleteParamsTest {

    @Test
    fun create() {
        FileDeleteParams.builder().id("id").fileId("file_id").build()
    }

    @Test
    fun pathParams() {
        val params = FileDeleteParams.builder().id("id").fileId("file_id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("file_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
