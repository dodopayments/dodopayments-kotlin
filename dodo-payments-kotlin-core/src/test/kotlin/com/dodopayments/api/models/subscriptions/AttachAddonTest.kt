// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachAddonTest {

    @Test
    fun create() {
        val attachAddon = AttachAddon.builder().addonId("addon_id").quantity(0).build()

        assertThat(attachAddon.addonId()).isEqualTo("addon_id")
        assertThat(attachAddon.quantity()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachAddon = AttachAddon.builder().addonId("addon_id").quantity(0).build()

        val roundtrippedAttachAddon =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachAddon),
                jacksonTypeRef<AttachAddon>(),
            )

        assertThat(roundtrippedAttachAddon).isEqualTo(attachAddon)
    }
}
