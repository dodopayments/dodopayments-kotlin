// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.productcollections.ProductCollectionCreateParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateParams
import com.dodopayments.api.models.productcollections.groups.GroupProduct
import com.dodopayments.api.models.productcollections.groups.ProductCollectionGroupDetails
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProductCollectionServiceTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionService = client.productCollections()

        val productCollection =
            productCollectionService.create(
                ProductCollectionCreateParams.builder()
                    .addGroup(
                        ProductCollectionGroupDetails.builder()
                            .addProduct(
                                GroupProduct.builder().productId("product_id").status(true).build()
                            )
                            .groupName("group_name")
                            .status(true)
                            .build()
                    )
                    .name("name")
                    .brandId("brand_id")
                    .description("description")
                    .effectiveAtOnDowngrade(
                        ProductCollectionCreateParams.EffectiveAtOnDowngrade.IMMEDIATELY
                    )
                    .effectiveAtOnUpgrade(
                        ProductCollectionCreateParams.EffectiveAtOnUpgrade.IMMEDIATELY
                    )
                    .onPaymentFailure(ProductCollectionCreateParams.OnPaymentFailure.PREVENT_CHANGE)
                    .prorationBillingModeOnDowngrade(
                        ProductCollectionCreateParams.ProrationBillingModeOnDowngrade
                            .PRORATED_IMMEDIATELY
                    )
                    .prorationBillingModeOnUpgrade(
                        ProductCollectionCreateParams.ProrationBillingModeOnUpgrade
                            .PRORATED_IMMEDIATELY
                    )
                    .build()
            )

        productCollection.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionService = client.productCollections()

        val productCollection = productCollectionService.retrieve("id")

        productCollection.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionService = client.productCollections()

        productCollectionService.update(
            ProductCollectionUpdateParams.builder()
                .id("id")
                .brandId("brand_id")
                .description("description")
                .effectiveAtOnDowngrade(
                    ProductCollectionUpdateParams.EffectiveAtOnDowngrade.IMMEDIATELY
                )
                .effectiveAtOnUpgrade(
                    ProductCollectionUpdateParams.EffectiveAtOnUpgrade.IMMEDIATELY
                )
                .addGroupOrder("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .imageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .onPaymentFailure(ProductCollectionUpdateParams.OnPaymentFailure.PREVENT_CHANGE)
                .prorationBillingModeOnDowngrade(
                    ProductCollectionUpdateParams.ProrationBillingModeOnDowngrade
                        .PRORATED_IMMEDIATELY
                )
                .prorationBillingModeOnUpgrade(
                    ProductCollectionUpdateParams.ProrationBillingModeOnUpgrade.PRORATED_IMMEDIATELY
                )
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionService = client.productCollections()

        val page = productCollectionService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionService = client.productCollections()

        productCollectionService.delete("id")
    }

    @Test
    fun unarchive() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionService = client.productCollections()

        val response = productCollectionService.unarchive("id")

        response.validate()
    }

    @Test
    fun updateImages() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionService = client.productCollections()

        val response =
            productCollectionService.updateImages(
                ProductCollectionUpdateImagesParams.builder().id("id").forceUpdate(true).build()
            )

        response.validate()
    }
}
