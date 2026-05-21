// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.productcollections

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.productcollections.groups.GroupCreateParams
import com.dodopayments.api.models.productcollections.groups.GroupDeleteParams
import com.dodopayments.api.models.productcollections.groups.GroupProduct
import com.dodopayments.api.models.productcollections.groups.GroupUpdateParams
import com.dodopayments.api.models.productcollections.groups.ProductCollectionGroupDetails
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GroupServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val groupService = client.productCollections().groups()

        val productCollectionGroupResponse =
            groupService.create(
                GroupCreateParams.builder()
                    .id("id")
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
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val groupService = client.productCollections().groups()

        groupService.update(
            GroupUpdateParams.builder()
                .id("id")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .groupName("group_name")
                .addProductOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
        val groupService = client.productCollections().groups()

        groupService.delete(
            GroupDeleteParams.builder()
                .id("id")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
