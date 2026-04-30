// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.entitlements

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodopayments.api.models.entitlements.files.FileDeleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Test
    fun delete() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val fileService = client.entitlements().files()

        fileService.delete(FileDeleteParams.builder().id("id").fileId("file_id").build())
    }

    @Test
    fun upload() {
        val client =
            DodoPaymentsOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val fileService = client.entitlements().files()

        val response = fileService.upload("id")

        response.validate()
    }
}
