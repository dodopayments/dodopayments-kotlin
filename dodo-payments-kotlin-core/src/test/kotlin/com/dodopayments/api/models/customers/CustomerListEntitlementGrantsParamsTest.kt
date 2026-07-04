// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListEntitlementGrantsParamsTest {

    @Test
    fun create() {
        CustomerListEntitlementGrantsParams.builder()
            .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
            .integrationType(CustomerListEntitlementGrantsParams.IntegrationType.DISCORD)
            .pageNumber(0)
            .pageSize(0)
            .status(CustomerListEntitlementGrantsParams.Status.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerListEntitlementGrantsParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("cus_TV52uJWWXt2yIoBBxpjaa")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerListEntitlementGrantsParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .integrationType(CustomerListEntitlementGrantsParams.IntegrationType.DISCORD)
                .pageNumber(0)
                .pageSize(0)
                .status(CustomerListEntitlementGrantsParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("integration_type", "discord")
                    .put("page_number", "0")
                    .put("page_size", "0")
                    .put("status", "Pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerListEntitlementGrantsParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
