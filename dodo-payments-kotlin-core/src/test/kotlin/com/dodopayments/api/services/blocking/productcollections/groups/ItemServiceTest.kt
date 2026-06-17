// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.productcollections.groups

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.productcollections.groups.GroupProduct
import com.dodopayments.api.models.productcollections.groups.items.ItemCreateParams
import com.dodopayments.api.models.productcollections.groups.items.ItemDeleteParams
import com.dodopayments.api.models.productcollections.groups.items.ItemUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ItemServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val itemService = client.productCollections().groups().items()

        val productCollectionProducts =
            itemService.create(
                ItemCreateParams.builder()
                    .id("pdc_8BWv0hojwUH7iCDabr0NI")
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addProduct(GroupProduct.builder().productId("product_id").status(true).build())
                    .build()
            )

        productCollectionProducts.forEach { it.validate() }
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val itemService = client.productCollections().groups().items()

        itemService.update(
            ItemUpdateParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(true)
                .build()
        )
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val itemService = client.productCollections().groups().items()

        itemService.delete(
            ItemDeleteParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
