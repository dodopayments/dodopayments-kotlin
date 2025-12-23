// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.products

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.products.shortlinks.ShortLinkCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShortLinkServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val shortLinkService = client.products().shortLinks()

        val shortLink =
            shortLinkService.create(
                ShortLinkCreateParams.builder()
                    .id("id")
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
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val shortLinkService = client.products().shortLinks()

        val page = shortLinkService.list()

        page.response().validate()
    }
}
