// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureTest {

    @Test
    fun create() {
        val feature =
            Feature.builder().featureId("feature_id").featureType(FeatureType.BOOLEAN).build()

        assertThat(feature.featureId()).isEqualTo("feature_id")
        assertThat(feature.featureType()).isEqualTo(FeatureType.BOOLEAN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feature =
            Feature.builder().featureId("feature_id").featureType(FeatureType.BOOLEAN).build()

        val roundtrippedFeature =
            jsonMapper.readValue(jsonMapper.writeValueAsString(feature), jacksonTypeRef<Feature>())

        assertThat(roundtrippedFeature).isEqualTo(feature)
    }
}
