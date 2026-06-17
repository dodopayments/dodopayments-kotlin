// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks.headers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HeaderRetrieveParamsTest {

    @Test
    fun create() {
        HeaderRetrieveParams.builder().webhookId("whk_YdWqVEGKmSYKbsIyDxEab").build()
    }

    @Test
    fun pathParams() {
        val params = HeaderRetrieveParams.builder().webhookId("whk_YdWqVEGKmSYKbsIyDxEab").build()

        assertThat(params._pathParam(0)).isEqualTo("whk_YdWqVEGKmSYKbsIyDxEab")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
