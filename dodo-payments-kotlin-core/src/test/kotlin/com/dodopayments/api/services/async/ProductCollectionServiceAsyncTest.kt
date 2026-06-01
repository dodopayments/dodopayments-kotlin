// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.models.productcollections.ProductCollectionCreateParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateParams
import com.dodopayments.api.models.productcollections.groups.GroupProduct
import com.dodopayments.api.models.productcollections.groups.ProductCollectionGroupDetails
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProductCollectionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val productCollection =
            productCollectionServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val productCollection = productCollectionServiceAsync.retrieve("id")

        productCollection.validate()
    }

    @Test
    suspend fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        productCollectionServiceAsync.update(
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
    suspend fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val page = productCollectionServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        productCollectionServiceAsync.delete("id")
    }

    @Test
    suspend fun unarchive() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val response = productCollectionServiceAsync.unarchive("id")

        response.validate()
    }

    @Test
    suspend fun updateImages() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val productCollectionServiceAsync = client.productCollections()

        val response =
            productCollectionServiceAsync.updateImages(
                ProductCollectionUpdateImagesParams.builder().id("id").forceUpdate(true).build()
            )

        response.validate()
    }
}
