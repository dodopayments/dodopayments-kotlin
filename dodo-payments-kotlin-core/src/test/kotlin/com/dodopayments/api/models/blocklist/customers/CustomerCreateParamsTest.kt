// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.blocklist.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .createBlockedCustomerRequest(
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                    .customerId("customer_id")
                    .reason("reason")
                    .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .createBlockedCustomerRequest(
                    CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                        .customerId("customer_id")
                        .reason("reason")
                        .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                    CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                        .customerId("customer_id")
                        .reason("reason")
                        .source(BlockedCustomerSource.BLOCKLIST_PAGE)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreateParams.builder()
                .createBlockedCustomerRequest(
                    CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                        .customerId("customer_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                    CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId.builder()
                        .customerId("customer_id")
                        .build()
                )
            )
    }
}
