// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.productcollections

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.productcollections.groups.GroupCreateParams
import com.dodopayments.api.models.productcollections.groups.GroupDeleteParams
import com.dodopayments.api.models.productcollections.groups.GroupProduct
import com.dodopayments.api.models.productcollections.groups.GroupUpdateParams
import com.dodopayments.api.models.productcollections.groups.ProductCollectionGroupDetails
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GroupServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val groupServiceAsync = client.productCollections().groups()

        val productCollectionGroupResponse =
            groupServiceAsync.create(
                GroupCreateParams.builder()
                    .id("pdc_8BWv0hojwUH7iCDabr0NI")
                    .productCollectionGroupDetails(
                        ProductCollectionGroupDetails.builder()
                            .addProduct(
                                GroupProduct.builder().productId("product_id").status(true).build()
                            )
                            .groupName("group_name")
                            .status(true)
                            .build()
                    )
                    .build()
            )

        productCollectionGroupResponse.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val groupServiceAsync = client.productCollections().groups()

        groupServiceAsync.update(
            GroupUpdateParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupName("group_name")
                .addProductOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(true)
                .build()
        )
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val groupServiceAsync = client.productCollections().groups()

        groupServiceAsync.delete(
            GroupDeleteParams.builder()
                .id("pdc_8BWv0hojwUH7iCDabr0NI")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
