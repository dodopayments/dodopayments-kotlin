// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddonCartResponseItemTest {

    @Test
    fun create() {
        val addonCartResponseItem =
            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()

        assertThat(addonCartResponseItem.addonId()).isEqualTo("addon_id")
        assertThat(addonCartResponseItem.quantity()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addonCartResponseItem =
            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()

        val roundtrippedAddonCartResponseItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addonCartResponseItem),
                jacksonTypeRef<AddonCartResponseItem>(),
            )

        assertThat(roundtrippedAddonCartResponseItem).isEqualTo(addonCartResponseItem)
    }
}
