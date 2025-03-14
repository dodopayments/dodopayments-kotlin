// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.products

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.products.images.ImageUpdateParams
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
