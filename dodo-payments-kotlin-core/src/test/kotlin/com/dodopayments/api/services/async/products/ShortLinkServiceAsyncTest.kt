// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShortLinkServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val shortLinkServiceAsync = client.products().shortLinks()

        val shortLink =
            shortLinkServiceAsync.create(
                ShortLinkCreateParams.builder()
                    .id("pdt_R8AWMPiV8RyJElcCKvAID")
                    .slug("slug")
                    .staticCheckoutParams(
                        ShortLinkCreateParams.StaticCheckoutParams.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        shortLink.validate()
    }

    @Test
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val shortLinkServiceAsync = client.products().shortLinks()

        val page = shortLinkServiceAsync.list()

        page.response().validate()
    }
}
