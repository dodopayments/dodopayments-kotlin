// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.shortlinks

import com.dodopayments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortLinkCreateParamsTest {

    @Test
    fun create() {
        ShortLinkCreateParams.builder()
            .id("id")
            .slug("slug")
            .staticCheckoutParams(
                ShortLinkCreateParams.StaticCheckoutParams.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ShortLinkCreateParams.builder().id("id").slug("slug").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ShortLinkCreateParams.builder()
                .id("id")
                .slug("slug")
                .staticCheckoutParams(
                    ShortLinkCreateParams.StaticCheckoutParams.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.slug()).isEqualTo("slug")
        assertThat(body.staticCheckoutParams())
            .isEqualTo(
                ShortLinkCreateParams.StaticCheckoutParams.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ShortLinkCreateParams.builder().id("id").slug("slug").build()

        val body = params._body()

        assertThat(body.slug()).isEqualTo("slug")
    }
}
