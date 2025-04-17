// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.products

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.products.images.ImageUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ImageServiceAsyncTest {

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val imageServiceAsync = client.products().images()

        val image =
            imageServiceAsync.update(ImageUpdateParams.builder().id("id").forceUpdate(true).build())

        image.validate()
    }
}
