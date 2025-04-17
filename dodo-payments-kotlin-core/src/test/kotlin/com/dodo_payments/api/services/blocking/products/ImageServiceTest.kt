// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.blocking.products

import com.dodo_payments.api.TestServerExtension
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.products.images.ImageUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ImageServiceTest {

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val imageService = client.products().images()

        val image =
            imageService.update(ImageUpdateParams.builder().id("id").forceUpdate(true).build())

        image.validate()
    }
}
