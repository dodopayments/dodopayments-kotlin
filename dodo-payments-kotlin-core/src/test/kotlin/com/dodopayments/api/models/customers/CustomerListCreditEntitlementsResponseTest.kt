// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListCreditEntitlementsResponseTest {

    @Test
    fun create() {
        val customerListCreditEntitlementsResponse =
            CustomerListCreditEntitlementsResponse.builder()
                .addItem(
                    CustomerListCreditEntitlementsResponse.Item.builder()
                        .balance("balance")
                        .creditEntitlementId("credit_entitlement_id")
                        .name("name")
                        .overage("overage")
                        .unit("unit")
                        .description("description")
                        .build()
                )
                .build()

        assertThat(customerListCreditEntitlementsResponse.items())
            .containsExactly(
                CustomerListCreditEntitlementsResponse.Item.builder()
                    .balance("balance")
                    .creditEntitlementId("credit_entitlement_id")
                    .name("name")
                    .overage("overage")
                    .unit("unit")
                    .description("description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListCreditEntitlementsResponse =
            CustomerListCreditEntitlementsResponse.builder()
                .addItem(
                    CustomerListCreditEntitlementsResponse.Item.builder()
                        .balance("balance")
                        .creditEntitlementId("credit_entitlement_id")
                        .name("name")
                        .overage("overage")
                        .unit("unit")
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedCustomerListCreditEntitlementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListCreditEntitlementsResponse),
                jacksonTypeRef<CustomerListCreditEntitlementsResponse>(),
            )

        assertThat(roundtrippedCustomerListCreditEntitlementsResponse)
            .isEqualTo(customerListCreditEntitlementsResponse)
    }
}
