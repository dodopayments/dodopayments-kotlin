// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks.headers

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HeaderUpdateParamsTest {

    @Test
    fun create() {
        HeaderUpdateParams.builder()
            .webhookId("webhook_id")
            .headers(
                HeaderUpdateParams.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            HeaderUpdateParams.builder()
                .webhookId("webhook_id")
                .headers(
                    HeaderUpdateParams.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("webhook_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            HeaderUpdateParams.builder()
                .webhookId("webhook_id")
                .headers(
                    HeaderUpdateParams.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.headers())
            .isEqualTo(
                HeaderUpdateParams.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
