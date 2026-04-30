// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListEntitlementsResponseTest {

    @Test
    fun create() {
        val customerListEntitlementsResponse =
            CustomerListEntitlementsResponse.builder()
                .addItem(
                    CustomerListEntitlementsResponse.Item.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entitlementId("entitlement_id")
                        .entitlementName("entitlement_name")
                        .grantId("grant_id")
                        .integrationType(
                            CustomerListEntitlementsResponse.Item.IntegrationType.DISCORD
                        )
                        .status(CustomerListEntitlementsResponse.Item.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entitlementDescription("entitlement_description")
                        .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(customerListEntitlementsResponse.items())
            .containsExactly(
                CustomerListEntitlementsResponse.Item.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .entitlementId("entitlement_id")
                    .entitlementName("entitlement_name")
                    .grantId("grant_id")
                    .integrationType(CustomerListEntitlementsResponse.Item.IntegrationType.DISCORD)
                    .status(CustomerListEntitlementsResponse.Item.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .entitlementDescription("entitlement_description")
                    .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListEntitlementsResponse =
            CustomerListEntitlementsResponse.builder()
                .addItem(
                    CustomerListEntitlementsResponse.Item.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entitlementId("entitlement_id")
                        .entitlementName("entitlement_name")
                        .grantId("grant_id")
                        .integrationType(
                            CustomerListEntitlementsResponse.Item.IntegrationType.DISCORD
                        )
                        .status(CustomerListEntitlementsResponse.Item.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entitlementDescription("entitlement_description")
                        .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCustomerListEntitlementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListEntitlementsResponse),
                jacksonTypeRef<CustomerListEntitlementsResponse>(),
            )

        assertThat(roundtrippedCustomerListEntitlementsResponse)
            .isEqualTo(customerListEntitlementsResponse)
    }
}
