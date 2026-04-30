// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachProductEntitlementTest {

    @Test
    fun create() {
        val attachProductEntitlement =
            AttachProductEntitlement.builder().entitlementId("entitlement_id").build()

        assertThat(attachProductEntitlement.entitlementId()).isEqualTo("entitlement_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachProductEntitlement =
            AttachProductEntitlement.builder().entitlementId("entitlement_id").build()

        val roundtrippedAttachProductEntitlement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachProductEntitlement),
                jacksonTypeRef<AttachProductEntitlement>(),
            )

        assertThat(roundtrippedAttachProductEntitlement).isEqualTo(attachProductEntitlement)
    }
}
